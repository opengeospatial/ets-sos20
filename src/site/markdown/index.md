# Sensor Observation Service (SOS) 2.0 Conformance Test Suite
## Scope
This test suite verifies conformance with Sensor Observation Service (SOS) 2.0. It is based on the following OGC specifications:

  * _OpenGIS Sensor Observation Service Implementation Specification_, Version 2.0 [OGC 12-006](https://portal.opengeospatial.org/files/?artifact_id=47599)
  * _OGC Web Services Common Specification_, Version 1.1.0 [OGC 06-121r3](http://portal.opengeospatial.org/files/?artifact_id=20040)
  * _Definition Identifier URNs in OGC Namespace_, Version 1.1.0 [OGC 06-023r1](http://portal.opengeospatial.org/files/?artifact_id=4700) (ISO/CD 19136, OGC 03-105r1)

## Test Coverage by Conformance Class

The following table provides information about the conformance class that are
implemented in the test and reference to the section in the specification.

| Conformance Class Name               | Reference | Notes                                                                                                                   | Available in Test Suite |
|--------------------------------------|-----------|-------------------------------------------------------------------------------------------------------------------------|-------------------------|
| SOS Core                             | 14.1.1    | GetCapabilities, DescribeSensor, and GetObservation                                                                     | YES                     |
| SOS Feature of Interest Retrieval    | 14.2.1    | GetFeatureOfInterest                                                                                                    | YES                     |
| SOS Observation Retrieval By ID      | 14.2.2    | GetObservationById                                                                                                      | YES                     |
| SOS Insertion Capabilities           | 14.3.1    | GetCapabilities                                                                                                         | YES                     |
| SOS Sensor Insertion                 | 14.3.2    | InsertSensor                                                                                                            | NO                      |
| SOS Sensor Deletion                  | 14.3.3    | DeleteSensor                                                                                                            | NO                      |
| SOS Observation Insertion            | 14.3.4    | InsertObservation                                                                                                       | NO                      |
| SOS Result Insertion                 | 14.4.1    | InsertResult, InsertResultTemplate                                                                                      | NO                      |
| SOS Result Retrieval                 | 14.4.2    | GetResult, GetResultTemplate                                                                                            | YES                     |
| SOS Spatial Filtering Profile        | 14.5.1    | GetCapabilities, GetObservation                                                                                         | YES                     |
| SOS XML Encoding                     | 14.6.1    | All interface                                                                                                           | YES                     |
| SOS KVP Binding Extension            | 14.6.2    | GetCapabilities, DescribeSensor, GetObservation                                                                         | YES                     |
| SOS GetFeatureOfInterest KVP Binding | 14.6.3    | GetFeatureOfInterest                                                                                                    | YES                     |
| SOS SOAP Binding                     | 14.6.4    | GetCapabilities, DescribeSensor, GetObservation, GetObservationByID, GetFeatureOfInterest, GetResultTemplate, GetResult | YES                     |


## Minimum Conformance Classes to Pass the Test
To pass the test it is necessary to pass the following conformance classes:
  * Pass the SOS Core
  * Pass the SOS KVP Binding Extension or SOS SOAP Binding

## Test Coverage by Operation
The following operations are tested:

  * GetCapabilities, _GET / POST / SOAP_
  * DescribeSenor, _GET / POST / SOAP_
  * GetObservation, _GET / POST / SOAP_
  * GetObservationByID, _GET / POST / SOAP_
  * GetFeatureOfInterest, _GET / POST / SOAP_
  * GetResultTemplate, _GET / POST / SOAP_
  * GetResult, _GET / POST / SOAP_

The following operations are not tested:

  * InsertSensor, _GET / POST / SOAP_
  * DeleteSensor, _GET / POST / SOAP_
  * InsertObservation, _GET / POST / SOAP_
  * InsertResult, _GET / POST / SOAP_
  * InsertResultTemplate, _GET / POST / SOAP_

## Namespaces

Services being tested must use the following namespaces:

- fes http://www.opengis.net/fes/2.0
- gml http://www.opengis.net/gml/3.2
- om http://www.opengis.net/om/2.0
- ows http://www.opengis.net/ows/1.1
- soap11 http://schemas.xmlsoap.org/soap/
- soap12 http://www.w3.org/2003/05/soap-envelope
- sos http://www.opengis.net/sos/2.0
- swe http://www.opengis.net/swe/2.0
- swes http://www.opengis.net/swes/2.0
- wsa http://www.w3.org/2005/08/addressing
- xs http://www.w3.org/2001/XMLSchema

## Schemas
All schemas used for validation in these tests can be found at:
<http://schemas.opengis.net/>

## Reference Implementation
The reference implementation details can be found at:
<http://cite.opengeospatial.org/reference>


## Release Notes

Release notes are available from the [relnotes.html](relnotes.html).
