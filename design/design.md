### Basic Analysis of Data
This is an attempt at analyzing the input data without any background research or knowledge of Complex network infrastructure.

This is how i believe the data is laid out

1. Provider Lit Site (From Lit-building-sample1.csv)
2. Client Lit Site with information about the ENNI Node and it's location (From Lit-building-sample2.csv)

At the moment, with the limited input data, I do not see a relationship between the 2 sample input csv's provided. It is possible to create REST services with CRUD
operations for these at the moment

### Entities Identified for Lit Building List

1. Provider 
	* Main Identifying class in Lit-building-sample1.csv

2. Consumer
	* Main Identifying class in Lit-building-sample2.csv
	* Contains information about ethernet consumer and enni