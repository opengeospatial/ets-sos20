package org.opengis.cite.sos20;

/**
 * Contains various constants defined in the SOS 2.0 specification, such as test run
 * parameters.
 */
public class SOS20 {

	private SOS20() {
	}

	/** Supplies reference to SOS capabilities document (URI). */
	public static final String SERVICE_URL = "service-url";

	/** Request type: GET, POST, SOAP binding. */
	public static final String REQUEST_VIA = "request-via";

	/** Supplies to select all test. */
	public static final String WHICH_TESTS = "which-tests";

}
