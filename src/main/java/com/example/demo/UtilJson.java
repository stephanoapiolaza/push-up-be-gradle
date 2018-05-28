/*
 * %W% %E% Scotiabank Bank S.A
 *
 * Copyright (c) 2010-2017 Scotiabank Bank S.A, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Scotiabank
 * bank S.A, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Scotiabank.
 *
 * SCOTIABANK MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SCOTIABANK SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Methods to manipulate JSON elements
 * 
 * @version		1.0.0 - 08 May 2018
 * @author 		Stephano Apiolaza - stephano.apiolaza_ex@scotiabank.cl (Imagemaker)
 * @author 		Edwin Perez - Edwin.Perez@scotiabank.cl (Scotiabank)
 * @since		0.1.0 - 08 May 2018
 */
public final class UtilJson {
	
	private static final ObjectMapper mapper = new ObjectMapper();
    
    /**
     * Constructor hidden
     */
    private UtilJson(){}
    
    /**
     * Writes an Object Entity like JSON String
     *
     * @param <E> Object String
     * @param entity to transform 
     * @return json string output
     */
    public static <E> String writeAsJSONString(E entity) {
    	try {
    		return mapper.writeValueAsString(entity);
    	}catch(Exception e) {
    		throw new UtilException(e);
    	}
    }    
    
}
