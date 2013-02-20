distributeme-handson1
=====================

The results of the hands-on-tuesday.

To compile:
mvn clean package

To run the server:
./start.sh o.d.h.first.generated.FirstServer

To run the server for failover:
./start.sh -DinstanceId=0 o.d.h.first.generated.FirstServer
./start.sh -DinstanceId=1 o.d.h.first.generated.FirstServer

To run the remote client:
./start.sh o.d.h.first.RemoteClient

To run the local client:
./start.sh o.d.h.first.LocalClient

To run the remote client with abort interceptor:
./start.sh -DavailabilityTestingServiceId=* o.d.h.first.RemoteClient

*** IMPORTANT ***
You need to install and setup a registry on port 9229.
To do so:
- download a tomcat.
- set port to 9229.
- download distributeme registry here: http://search.maven.org/remotecontent?filepath=net/anotheria/distributeme-registry/2.0.0/distributeme-registry-2.0.0.war
- rename the file to distributeme.war and put it into your tomcat.
- start the tomcat

you should see content under this url:
http://localhost:9229/distributeme/ui/


