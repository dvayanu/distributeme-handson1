#!/bin/bash
source version.sh

CLASSPATH=test/appdata:target/distributeme-handson-$VERSION-jar-with-dependencies.jar
echo CLASSPATH: $CLASSPATH
java -Xmx256M -Xms64M -classpath $CLASSPATH -DdimeRegistrationNameProvider=org.distributeme.core.failing.Failover -Dmsk.config.prefix=dev-  -Dconfigureme.defaultEnvironment=dev $*
