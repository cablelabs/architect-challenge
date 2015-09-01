Initial modelling of domain using the two lit buildings csv files Analysis process: 

- Create packages for domain classes and drawings - 


- Packages created: 

- Location - contains classes to model: 

Search for information to support and understand classes, attributes, behavior and relationships. This leads to additonal classes being discovered with the assoiciated attributes, behavior and relationships. 

Additional UML modeling work to be done.
 - Validate relationships
 - Identify additional attributes, behavior

 - Create RESTful API
 - Create Swagger API

This is a list of URL's that have been used: 

[ENNI Protection ](http://www.ieee802.org/1/files/public/docs2010/new-vinod-ENNI-Protection-0310-v03.pdf ) 

[ OIF_ENNI_OSPF]( http://www.oiforum.com/public/documents/OIF_ENNI_OSPF_02.0.pdf) 

[ Network to Network Interface – Wikipedia]( https://de.wikipedia.org/wiki/Network_to_Network_Interface) 

[ https://en.wikipedia.org/wiki/IEEE_802.1aq]( https://en.wikipedia.org/wiki/IEEE_802.1aq) 
[ https://en.wikipedia.org/wiki/CLLI_code]( https://en.wikipedia.org/wiki/CLLI_code) 

[ http://www.ckts.info/clli]( http://www.ckts.info/clli) 

[https://tools.ietf.org/html/draft-beeram-ccamp-gmpls-enni-03 ]( https://tools.ietf.org/html/draft-beeram-ccamp-gmpls-enni-03) 

[ https://en.wikipedia.org/wiki/Network-to-network_interface]( https://en.wikipedia.org/wiki/Network-to-network_interface) 

[ http://www.ieee802.org/1/files/public/docs2010/new-vinod-
ENNI-Protection-0310-v03.pdf]( http://www.ieee802.org/1/files/public/docs2010/new-vinod-ENNI-Protection-0310-v03.pdf) 

[ Download SCTE Standards](http://www.scte.org/SCTE/Standards/Download/SCTE/Standards/Download_SCTE_Standards.aspx?hkey=63914a25-0f85-4d74-8181-c1b642039ad7 ) 

[ Microsoft PowerPoint - lecture1 - lecture1.pdf]( https://www.utdallas.edu/~torlak/courses/ee4367/lectures/lecture1.pdf) 

[ Telecom Dictionary Search Results]( http://www.telecomdictionary.com/telecom_dictionary_definitions_test.asp) 

[ Local access and transport area - Wikipedia, the free encyclopedia](https://en.wikipedia.org/wiki/Local_access_and_transport_area ) 

[ Geographic coordinate system - Wikipedia, the free encyclopedia](https://en.wikipedia.org/wiki/Geographic_coordinate_system ) 

[ Telecom Routing Administration - Vertical and Horizontal Coordinates](http://www.trainfo.com/products_services/tra/vhpage.html ) [ Common Language® General Codes]( http://www.commonlanguage.com/resources/commonlang/productshowroom/product/general/) 

[ Business Solutions]( https://www.neca.org/Code_Administration.aspx) [CABLE LEARNING REVIEW ](https://www.scte.org/CableLearningReview/Pd12_CLR_ePub-Q1.html ) 

[ icsc_code](https://www22.verizon.com/wholesale/attachments/apphome_releases/icsc_code_job_aide.pdf ) 

Location Classes Names: 

 - GeographicCoordinate 
 - Shape 
 - Vertex 
 - VHCalc 
 - Polygon 
 - VerticalHorizontalCoordinates 
 - LineSegment 
 - Structure 
 - Location 
 - Pedestal 
 - Site 
 - Room 
 - Floor 
 - Building 
 - LitBuilding 
 - BuildingClliCode 
 - Office 
 - City 
 - State 
 - LATA 
 - Address 
 - ClliCode 
 - NetworkElementClliCode 

Topology Classes Names:

 - NetworkElement
 - AggregationServicesRouter
 - System
 - Provider
 - Carrier
 - InterExchangeCarrier
 - ExchangeCarrier
 - AccessServices
 - AccessCustomerTerminalLocation

[Location UML Model](https://github.com/vertmont/architect-challenge/blob/master/design/VP-UML-LocationModel-01.jpeg)

[Topology UML Model](https://github.com/vertmont/architect-challenge/blob/master/design/VP-UML-TopologyModel-01.jpeg)

