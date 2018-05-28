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
 * Clase que sobrescribe excepciones
 * 
 * @version		1.0 09 Jan 2017
 * @author 		Stephano Apiolaza - stephano.apiolaza_ex@scotiabank.cl (Imagemaker)
 *
 */
public final class AccessException extends RuntimeException {

    /**
     * 
     */
	private static final long serialVersionUID = -1639383997190071209L;

	/**
	 * Constructor
	 */
	public AccessException() {
        super();
    }

	/**
	 * Constructor
	 * @param message -
	 * @param cause -
	 */
    public AccessException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     * @param message -
     */
    public AccessException(final String message) {
        super(message);
    }

    /**
     * Constructor
     * @param cause -
     */
    public AccessException(final Throwable cause) {
        super(cause);
    }

}
