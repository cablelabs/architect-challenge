### Basic Analysis of Data
This is an attempt at analyzing the input data without any background research or knowledge of Complex network infrastructure.

From my understanding, this seems to be files dervied from different sources but attempting to describe a similar concept. I.e. a **Lit_Building**


### Entities Identified for Lit Building List

1.  **Lit Package** 
	* Lit Building - Main Identifying class which holds all relevant information gathered from all input sources. I.e. the two lit-building-list-sample csv files
	* Provider Coordinates - Specific coordinates for the Lit Building. This parent class Coordinates could possibly be used outside the lit package.
	* EthernetFlag - Specifc to the Lit Building. Uses the Enum Value *Ethernet* along with a flag could be "Y", "N" or "ICB"
2.  **Other Packages**
	* Coordinates - Simply Longitude and Latitude Tuple
	* Address - Basic Address POJO which may be used in multiple packages
	* Lata - Holds the name and code of the Local Access and transport area.

### Additional Information

1.  **Dependency Bugs**
    There is a bug with some of the tools parent pom files used in the bonus project. In order to build this project you must do the following
	* go to <USER>/.m2/repository/org/glassfish/hk2/hk2-parent/2.4.0-b31/hk2-parent-2.4.0-b31.pom file and change **`<jdk>[1.8</jdk>`** to **`<jdk>[1.8,)</jdk>`**
	* go to <USER>/.m2/repository/org/glassfish/jersey/project/2.21/project-2.21.pom file and change **`<jdk>[1.7,</jdk>`** to **`<jdk>[1.7,)</jdk>`**
2.  **Additional Things to Consider**
    This project assumes a quick turn around time. Error handling and json validation is not taken into consideration in the swagger design and/or java code.

