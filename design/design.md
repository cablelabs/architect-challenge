### Basic Analysis of Data
This is an attempt at analyzing the input data without any background research or knowledge of Complex network infrastructure.

From my understanding, this seems to be files dervied from different sources but attempting to describe a similar concept. I.e. a **Lit_Building**


### Entities Identified for Lit Building List

1.  **Lit Package** 
	* Lit Building - Main Identifying class which holds all relevant information gathered from all input sources. I.e. the two lit-building-list-sample csv files
	* Provider Coordinates - Specific coordinates for the Lit Building. This parent class Coordinates could possibly used outside the lit package.
	* EthernetFlag - Specifc to the Lit Building. Uses the Enum Value *Ethernet* along with a flag would could possibly be "Y", "N" or "ICB"
2.  **Other Packages**
	* Coordinates - Simply Longitude and Latitude Tuple
	* Address - Basic Address POJO which may be used in multiple packages
	* Lata - Holds the name and code of the Local Access and transport area.

