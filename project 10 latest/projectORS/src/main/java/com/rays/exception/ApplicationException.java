package com.rays.exception;

/**
 * ApplicationException is propagated from Service classes when an business
 * logic exception occurred.
 * @author Nisha Mehta
 */
public class ApplicationException extends Exception {

	/**
	 * @param msg
	 *            : Error message
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}