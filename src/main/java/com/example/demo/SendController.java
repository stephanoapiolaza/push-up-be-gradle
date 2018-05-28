package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.commons.lang3.exception.ExceptionUtils;
import nl.martijndwars.webpush.Subscription;
import nl.martijndwars.webpush.PushService;
import nl.martijndwars.webpush.Notification;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

@CrossOrigin
@RestController
public class SendController {
	
    private static final String PUBLIC_KEY = "BAPGG2IY3Vn48d_H8QNuVLRErkBI0L7oDOOCAMUBqYMTMTzukaIAuB5OOcmkdeRICcyQocEwD-oxVc81YXXZPRY";
    private static final String PRIVATE_KEY = "A7xDGuxMZ4ufflcAhBW23xpoWZNOLwM4Rw2wXjP0y6M";
    private static final String SUBJECT = "Asunto";
    private static List<PayloadRegister> listSuscription = new ArrayList<>();
    
    @RequestMapping("/send")
    public String send(@RequestParam("suscription") String suscription, 
    				   @RequestParam("title") String title,
    				   @RequestParam("message") String message) {
        Security.addProvider(new BouncyCastleProvider());
        try {
        	NotificationVO objNotify = new NotificationVO(title, message);
            PushService pushService = new PushService(PUBLIC_KEY, PRIVATE_KEY, SUBJECT);
            Subscription subscription = new Gson().fromJson(suscription, Subscription.class);
            Notification notification = new Notification(subscription, UtilJson.writeAsJSONString(objNotify));
            HttpResponse httpResponse = pushService.send(notification);
            int statusCode = httpResponse.getStatusLine().getStatusCode();

            return String.valueOf(statusCode);
        } catch (Exception e) {
            return ExceptionUtils.getStackTrace(e);
        }
    }
    
    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/registration", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity register(@RequestBody PayloadRegister suscription) {
        try {
        	for (PayloadRegister payload : listSuscription) {
				if ( payload.getEndpoint().equals(suscription.getEndpoint()) ) {
					return new ResponseEntity(HttpStatus.ACCEPTED); 
				}
			}
        	listSuscription.add(suscription);
        	return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            throw new UtilException(e);
        }
    }
    
   	@RequestMapping("/findAll")
       public List<PayloadRegister> findAll() {
           try {
           	return listSuscription;
           } catch (Exception e) {
               throw new UtilException(e);
           }
       }
    
}
