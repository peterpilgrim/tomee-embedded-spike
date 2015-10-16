# Spike project

Peter Pilgrim, 2015
Research Spike Project for Tom EE

How does development work for front-end and server side?

In particular, verify that Tom EE development can work seamlessly. 

Front end developer do NOT want to restart the Spring Boot service every time that dynamically change the HTML, CSS or graphic resources. 
So we need to find how Spring Boot handles this situation?

Project [https://github.com/peterpilgrim/tomee-embedded-spike](https://github.com/peterpilgrim/tomee-embedded-spike)

# Goals

Establish the fast development lifecycle?

* The solution must allow engineers get started quickly 
  (a new starter Java developer or front-end developer should able get a development environment within a day (5 hours))

* The solution should support iterative and experimental development. 
    Whilst server is still running, if a single HTML or CSS is changed, then the solution should reflect the change at runtime. 
    We should be avoiding tedious cycle. Edit a page. Stop and restart a server in order to see a change.  

* The solution should be relative free from encumbrances.

    * Open source preferred
    * Widely supported with the Java (or JavaScript) community
    * Embrace standards
    * Avoid vendor-lock for the large part
    * Relatively mature by at least 12 months
    * Be designed well
    * Extensible architecture (not lead to falling off the cliff in the near-future)




# Requirements

* Java SE 8 or better
* Maven 3 


    > mvn clean 
    > mvn package


# Process 

    
Navigate the [http://localhost:8080/](http://localhost:8080/) to see the first page.



# Results

## Pros

We see these advantages:

TBC

## Cons

We also see these disadvantages:

The biggest disadvantage is that the dynamic web resources are created with a ShrinkWrap archive and then deployed internally 
 to the embedded server. Therefore this solution precludes *Hot Iterative and Experimental* development for the 
 rich client front end. It does not matter if this is AngularJS or JSF. Also it precludes Hot reloading of JVM classes.
  


## Time

TBC



# Issues



