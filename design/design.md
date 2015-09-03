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

-----------------------------
Day 2

 - review model
 - add any missing classes, attributes, behavior and relationships
 - Update model
 - create RESTful API

Parsing document:
 - External Network-Network Interface (E-NNI) OSPF-based Routing - 1.0 (Intra-Carrier) Implementation Agreement 
 - OIF-ENNI-OSPF-01.0 

Input source for ENNI INNI trasport domains, control domains, carrier networks, links and network elements

Additional documents:
[TCF_UFB_Ethernet_Access_Service_Description_FINAL  Telecommunications Carriers Forum](http://www.tcf.org.nz/content/433bebfa-5dc8-4bf3-a408-5c43cf886c38.cmr)

[Unlocking Ethernet Access and Backhaul with the EoX Gateway](http://www.fujitsu.com/us/Images/EoX_gateway_wp.pdf)


Located OIF ENNI specifications, using these to create UML ENNI model
[http://www.oiforum.com/public/documents/](http://www.oiforum.com/public/documents/)

 - OIF_E-NNI_Sig_02.0.pdf
 - OIF_SEP_03.2.pdf
 - OIF-UNI-02.0-R2-RSVP.pdf
 - OIF-ENNI-OSPF-02.1.pdf
 - OIF-ENNI-RSVP-02.1.pdf
 - OIF-ENNI-ML-AM-01.0.pdf
 - OIForumDocumentLinks.html
 - OIF_Carrier_WG_Requirements_on_Transport_Networks_in_SDN_Architectures_Sept2013.pdf
 - OIForum1.html
 - OIForum.html


The network UML models that will support the ENNI and associated Control, Management and Transport plane include a large number of classes.
OIF 4.4 discription of E-NNI Signaling 2.0
 - The E-NNI Signaling 2.0 specification is a key stride towards the implementation of an open
inter-domain signaling protocol that enables dynamic setup and release of various services. This
activity supports the overall mission of the OIF.

These would include but are not limited to:

 - AGC                             Access Group Container (see [G.8080])
 - ASON                           Automatically Switched Optical Network (see [G.8080])
 - CC                                 Connection Controller (see [G.8080] and [G.7713])
 - CCC                              Calling/Called Party Call Controller (see [G.8080])
 - CI                                  Characteristic Information (see [G.805])
 - CP                                 Connection Point (see [G.805])
 - CTP                               Connection Termination Point (see [G.805])
 - DCN                             Data Communications Network (see [G.7712])
 - ECC                              Embedded Control Channels (see [G.7712])
 - E-NNI                          External NNI (see [G.8080])
 - eNNI-D                        The logical control plane entity that terminates E-NNI signaling in the downstream direction with respect to control plane initiation
 - eNNI-U                        The logical control plane entity that terminates E-NNI signaling in the upstream direction with respect to control plane initiation
 - ERO                              Explicit Route Object
 - GMPLS                        Generalized MPLS
 - I-NNI                            Internal NNI (see [G.8080])
 - IP                                   Internet Protocol version 4 (IPv4) or Internet Protocol version 6 (IPv6)
 - IPsec                             Internet Protocol Security (see [OIF-SEC] and [SecAdd])
 - LC                                 Link Connection (see [G.805])
 - LIH                               Logical Interface Handle
 - MBB                              Make Before Break
 - MCN                            Management Communications Network (see [G.7712])
 - MPLS                            Multiprotocol Label Switching
 - NCC                             Network Call Controller
 - NE                                 Network Element
 - NNI                              Network Node Interface
 - Node ID                       Node Identifier (see [G.7715.1])
 - OAM                            Operations And Maintenance
 - OTN                             Optical Transport Network (see [G.709])
 - PC                                 Protocol Controller (see [G.8080])
 - RA                                 Routing Area (see [G.8080])
 - RRO                              Record Route Object
 - RSVP                            Resource Reservation Protocol (see [RFC2205])
 - RSVP-TE                      RSVP Traffic Engineering (see [RFC3209])
 - SC                                 Switched Connection service (see [G.8080])
 - SC PC ID                      Signaling Controller Protocol Controller Identifier
 - SCN                              Signaling Communications Network (see [G.7712])
 - SDH                              Synchronous Digital Hierarchy (see [G.707])
 - SNC                              Subnetwork Connection (see [G.805])
 - SNP                              Subnetwork Point (see [G.8080])
 - SNPP                            Subnetwork Point Pool (see [G.8080])
 - SNPP Link                   Subnetwork Point Pool Link (see [G.8080])
 - SONET                         Synchronous Optical Network (see [T1.105])
 - SPC                               Soft Permanent Connection service (see [G.8080])
 - TCP                               Termination Connection Point (see [G.805])
 - TNA                             Transport Network Assigned (see [G.8080])
 - TNE                              Transport Network Element (see [OIF-UNI-02.0])
 - TRI                                Transport Resource Identifier (see [G.8080])
 - TTP                               Trail Termination Point (see [G.805])
 - UNI                              User Network Interface (see [OIF-UNI-020], [G.8080])
 - VCAT                           Virtual Concatenation

In addition there are RSVP messages used to manage the life cycle of connections that need to be modeled 

Ok, in the weeds, modeling more than requested.
Pulling back to limit the model to only the items on the two spreadsheets and limit the additonal classes to those required to create a coherent solution.

Updated models, added updated UML drawings
RESTful generation with VP next

[Location UML Model](https://github.com/vertmont/architect-challenge/blob/master/design/VP-UML-LocationModel-02.jpeg)

[Topology UML Model](https://github.com/vertmont/architect-challenge/blob/master/design/VP-UML-TopologyModel-02.jpeg)

[Location UML Model](https://github.com/vertmont/architect-challenge/blob/master/design/VP-UML-ARC-SPModel-01.jpeg)

Notes on csv files:

sample2.csv:
 - This file identifies an ENNI node, the assumption is that the other end of the switched ethernet connection is also an ENNI node at a Lit Building.  The address of the Lit building is in columns B, C, D, E and F.
 - Column F is the address of the provider ENNI node.
 - G is building type.
 - H the address of the carrier/provider ENNI Node.
 - I the min bandwidth of the switched ethernet connection
 - J the max
 - K the LATA code for the ENNI Node?
 - L the LATA name for the ENNI Node?
 - M & N the Lat & Long for the ENNI Node?

sample1.cvs:
 - Column B is the name of the Ethernet service provider, C is the ICSC data, based on a document from Verizon ICSC includes the two types of data, ASR types: this is the communications service(s) and the ACTL which is the location, a ACTL CLLI exists and I put this as a subtype of the CILLCode Class.
 - What's not clear is the type of Node at the CC30 site.
 - Is the location data in E,F,G,H,I,L,M,N,O,P,Q,R,S and T for the Site column Z?
 - Or is it the ICSC CLLI data for the provider Node?  Is the node ENNI?
 - Coloumns E, F, G, H, I, L, M and N is address data.
 - Is this the address of the BLDG CLLI (column O)?
 - O is the building CLLI
 - P & Q the lat/long
 - R & S the horizontal & vertical
 - T the LATA
 - U, V, W, X and Y the Ethernet connection available aat the site.
 - Z the site type Customer, Colo 

Day 3
 - Yesterday was a learning curve with VP and generating API
 - Found VP example on how to use an existing UML Class model to create RESTful API
 - This morning I'm working on getting the first API working, it does take me a bit of time on the first pass to get a tool working for me, but I'm getting through that now with VP and the RESTful API
 - Next will be getting myself up to speed with Swagger, once I get the VP ResTful API's complete
 - I modeled to much of the domain for this exercise, I going to limit the VP RESTful API's to those in the CSV files
 - I'll update status through out the day


