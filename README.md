# Singtel-Code-Assignment
# Project Title

Singtel-Code-Assignment - BONUS

## Assignment BONUS
1. Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds differently depending on language. Please add the rooster sound in your native
tongue.

```
• Danish: kykyliky
• Dutch: kukeleku
• Finnish: kukko kiekuu
• French: cocorico
• German: kikeriki
• Greek: kikiriki
• Hebrew: coo-koo-ri-koo
• Hungarian: kukuriku
• Italian: chicchirichi
• Japanese: ko-ke-kok-ko-o
• Portuguese: cucurucu
• Russian: kukareku
• Swedish: kuckeliku
• Turkish: kuk-kurri-kuuu
• Urdu: kuklooku

```
```diff
Implemented in ROOSTER Class.Please run Solution.java to see the output.

```
2. Can you design a RESTful API for querying these animals?


```diff
Designing RESTFUL WEBSERVICE :

First, a REST resource to GET a list of Animals:
http://www.animal.com/animals
Next, a REST resource to GET details of Animal with name (Example:Rooster):
http://www.animal.com/animals/rooster

Representations :
Here is an XML respresentation of a response—GET animal from "name"
<animal>
<type>bird</type>
<name>rooster</name>
<swim>I cannot swim</swim>
<walk>I am walking</walk>
<sing>Cluck, cluck</sing>
<fly>I cannot fly</fly>
</animal>
OR 

A JSON respresentation of a response—GET animal from "name":
{"animal":{"type":"bird","name":"rooster","swim":"I cannot swim","walk":"I am walking","sing":"Cluck, cluck","fly":"I cannot fly"}}
```

![Class Diagram](ClassDiagram.jpeg?raw=true "Class Diagram")

### Prerequisites

```
JAVA JRE/JDK and Eclipse IDE 
```
### Installing

```
Eclipse IDE - import the Project as JAVA Project and add the dependencies(if required) 
```

 ## Running the tests

Run either the Test Class - com.java.singtel.BirdTest.java or Solution.java



## Built With

* [Eclipse IDE ](https://www.eclipse.org/downloads/packages/release/photon/r/eclipse-ide-java-developers) - IDE for JAVA

## Versioning

 see the [tags on this repository](https://github.com/thotavinaybabu/Singtel-Code-Assignment). 

## Author

***VINAY BABU THOTA** - Source Code - refer to different commits for eash solution * - [SINGTEL-CODE_ASSIGNMENT](https://github.com/thotavinaybabu/Singtel-Code-Assignment)

