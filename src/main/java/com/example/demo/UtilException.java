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

/**
 * Class that overwrites exceptions
 * 
 * @version		1.0.1 - 17 May 2018
 * @author 		Stephano Apiolaza - stephano.apiolaza_ex@scotiabank.cl (Imagemaker)
 * @since		0.1.0 - 08 May 2018
 */
public class UtilException extends RuntimeException {
    
    /**
     * SerialVersionUID Autogenerated 
     */
    private static final long serialVersionUID = 7731252961013786015L;
    
    /**
     * Constructor
     */
    public UtilException() {
        super();
    }

    /**
     * Constructor
     * @param message text with the exception description
     * @param cause throwable with the trace of the exception
     */
    public UtilException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     * @param message text with the exception description
     */
    public UtilException(final String message) {
        super(message);
    }

    /**
     * Constructor
     * @param cause throwable with the trace of the exception
     */
    public UtilException(final Throwable cause) {
        super(cause);
    }
}
