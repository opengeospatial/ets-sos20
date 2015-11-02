SOS 2.0 Test Suite Release Notes
================================

1.12 (2015-10-29)
--------------------
  - [#22](https://github.com/opengeospatial/ets-sos20/issues/22) - 08.SOS resultRetrieval: GetResultTemplate - 08.07.RequestNulloffering - invalid test request for POST
  - [#21](https://github.com/opengeospatial/ets-sos20/issues/21) - 09.SOS resultRetrieval: GetResult - 09.07.RequestNulloffering - invalid test request for POST
  - [#20](https://github.com/opengeospatial/ets-sos20/issues/20) - 07.SOS enhancedOperations: GetObservationById - 07.09.RequestValidRequest Test - invalid test request for POST
  - [#17](https://github.com/opengeospatial/ets-sos20/issues/17) - a namespace added to phenomenonTime in the sos:GORequestEmptyObservation_core shouldn't be there.
  - [#16](https://github.com/opengeospatial/ets-sos20/issues/16) - spatial sampling feature from the O&M spec was missing in the SOS_ETS.xml
  - [#14](https://github.com/opengeospatial/ets-sos20/issues/14) - SOS 2.0 Test Suite sos:IRTRequestInvalidproposedTemplate test fails for SOAP
  - [#13](https://github.com/opengeospatial/ets-sos20/issues/13) - SOS 2.0 Test Suite sos:IRRequestValidRequest test fails for SOAP
  - [#12](https://github.com/opengeospatial/ets-sos20/issues/12) - SOS 2.0 Test Suite sos:IRRequestInvalidresultValues test fails for SOAP
  - [#11](https://github.com/opengeospatial/ets-sos20/issues/11) - SOS 2.0 Test Suite sos:IRTRequestValidRequest test fails for SOAP
  - [#10](https://github.com/opengeospatial/ets-sos20/issues/10) - SOS 2.0 Test Suite sos:IRTRequestInvalidobservationType test fails for SOAP
  - [#9](https://github.com/opengeospatial/ets-sos20/issues/9) - SOS 2.0 Test Suite sos:DeSRequestValidRequest  test fails for SOAP
  - [#8](https://github.com/opengeospatial/ets-sos20/issues/8) - SOS 2.0 Test Suite sos:ISRequestValidRequest  test fails for SOAP
  - [#7](https://github.com/opengeospatial/ets-sos20/issues/7) - SOS 2.0 Test Suite sos:GOBIRequestValidRequest test fails for SOAP
  - [#6](https://github.com/opengeospatial/ets-sos20/issues/6) - SOS 2.0 Test Suite InsertResultTemplate-Test fail for SOAP
  - [#5](https://github.com/opengeospatial/ets-sos20/issues/5) - SOS 2.0 Test Suite InsertObservation-Test fail for SOAP
  - [#4](https://github.com/opengeospatial/ets-sos20/issues/4) - SOS 2.0 Test Suite InsertSensor-Test fail for SOAP
  - [#3](https://github.com/opengeospatial/ets-sos20/issues/3) - SOS 2.0 Test Suite InsertSensor-Test fail for SOAP
  - [#1](https://github.com/opengeospatial/ets-sos20/issues/1) - 01.04.OWS.GetCapabilities-Exceptions.5 - xpath


1.11 (2015-07-30)
-----------------
- Update pom.xml to build with Maven 2 and minor edits.

1.10 (2015-06-03)
-----------------------------
- Fixed bug : Reported by David Archer, the responseFormat for the SOAP test or Post test should not be URL encoded.

1.9 (2015-05-05)
---------------------------

- Fixed bug : The service parameter in the GetCapabilities request is mandatory and Fixed value: "SOS".
- Fixed bug : The test "sos:GOBIRequestInvalidobservation_obsByIdRetrieval" return a empty GetObservationByIdResponse, not a exception.
- User should select URL for each interface(some website have server urls for different interface).
- Fixed [#15](https://github.com/opengeospatial/ets-sos20/issues/15) : Reported by David Archer, exception xpath should be ows:ExceptionReport/ows:Exception (OWS 1.1.0) whatever the response is SOAP or not.

1.8  (2015-02-24)
-----------------------------
- Cleaned the structure of the test. The test scripts (ctl) have not changed.
- Starting this revision, the revision number will follow the revision documented [here](https://github.com/opengeospatial/cite/wiki/OGC-Compliance-Testing-Tools)


r7
-----------------------
- Depended on xlink schemas 1.1 (W3C XLink 1.1) . "http://schemas.opengis.net/xlink/1.0.0/xlinks.xsd" will be changed to "http://www.w3.org/1999/xlink.xsd" and
		"xlink:simpleLink" will be changed to "xlink: simpleAttrs"

r6 (2013-09-13)
-------------------------

- Updated documentation

r5 (2013-09-03)
------------------------

- Fixed CITE-694: GetFeatureOfInterest-Test fails due to missing schema spatialSamplingFeature.xsd
- InsertSensor, InsertObservation, InsertResultTemplate, InsertResult not yet ready, so hide those test.
- Also hide DeleteSensor operation,because no InsertSensor operation.

r4
---------------
- Cleaned documentation.

r3
--------------
- fixed some error occurred when testing by TE2 (via GET or via SOAP).
- Cleaned documentation.

r2
--------------
- fixed 1 message error (SOS_ETS.xml line.512 Run GetObservationById test via GET)
- fixed a sheepstyle error (Test sos:IRRequestValidRequest)

r1
-----------
- Updated config file for TEAM-Engine v4.
- Allow for multiple exceptions in sosFunctions: getExceptionInfo, getExceptionInfoSOAP
- Removed nested package elements in SOS_ETS.xml (fix issue with inherited test verdicts)


r0 (2012-12-21)
--------------------------------

- Tested by 52north and many bugs and issues fixed.
	(There are still some issues that will need to be further discussed and dealt with.)
- DescribeSensor test scripts updated.
- GetCapabilities & OWS test scripts updated.



