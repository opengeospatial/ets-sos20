SOS 2.0 Test Suite Release Notes
================================
Revision 1.10 (2015-05-05)
- Fixed bug : Reported by David Archer, the responseFormat for the SOAP test or Post test should not be URL encoded.

Revision 1.9 (2015-05-05)
---------------------------

- Fixed bug : The service parameter in the GetCapabilities request is mandatory and Fixed value: "SOS".
- Fixed bug : The test "sos:GOBIRequestInvalidobservation_obsByIdRetrieval" return a empty GetObservationByIdResponse, not a exception.
- User should select URL for each interface(some website have server urls for different interface).
- Fixed [#15](https://github.com/opengeospatial/ets-sos20/issues/15) : Reported by David Archer, exception xpath should be ows:ExceptionReport/ows:Exception (OWS 1.1.0) whatever the response is SOAP or not.

Revision 1.8  (2015-02-24)
-----------------------------
- Cleaned the structure of the test. The test scripts (ctl) have not changed.
- Starting this revision, the revision number will follow the revision documented [here](https://github.com/opengeospatial/cite/wiki/OGC-Compliance-Testing-Tools)


Revision r7
-----------------------
- Depended on xlink schemas 1.1 (W3C XLink 1.1) . "http://schemas.opengis.net/xlink/1.0.0/xlinks.xsd" will be changed to "http://www.w3.org/1999/xlink.xsd" and
		"xlink:simpleLink" will be changed to "xlink: simpleAttrs"

Revision r6 (2013-09-13)
-------------------------

- Updated documentation

Revision r5 (2013-09-03)
------------------------

- Fixed CITE-694: GetFeatureOfInterest-Test fails due to missing schema 
  (http://schemas.opengis.net/samplingSpatial/2.0/spatialSamplingFeature.xsd)
- InsertSensor, InsertObservation, InsertResultTemplate, InsertResult not yet ready, so hide those test.
- Also hide DeleteSensor operation,because no InsertSensor operation.

Revision r4
---------------
- Cleaned documentation.

Revision r3
--------------
- fixed some error occurred when testing by TE2 (via GET or via SOAP).
- Cleaned documentation.

Revision r2
--------------
- fixed 1 message error (SOS_ETS.xml line.512 Run GetObservationById test via GET)
- fixed a sheepstyle error (Test sos:IRRequestValidRequest)


Revision r1
-----------
- Updated config file for TEAM-Engine v4.
- Allow for multiple exceptions in sosFunctions: getExceptionInfo, getExceptionInfoSOAP
- Removed nested package elements in SOS_ETS.xml (fix issue with inherited test verdicts)


Revision r0 (2012-12-21)
--------------------------------

- Tested by 52north and many bugs and issues fixed.
	(There are still some issues that will need to be further discussed and dealt with.)
- DescribeSensor test scripts updated.
- GetCapabilities & OWS test scripts updated.



