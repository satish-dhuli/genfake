
#!/bin/bash

# Author      : BALAJI POTHULA <balaji.pothula@techie.com>,
# Date        : 09 May 2019,
# Description : Installing openjdk, maven on Ubuntu.

# Note: Please run this script with sudo privilage.

# setting maven version.
readonly MVN_VER=3.6.1

# updating packages index.
apt update

# upgrading packages.
DEBIAN_FRONTEND=noninteractive apt -y upgrade

# installing openjdk8.
# maven3.3+ require jdk1.7+
apt install -y openjdk-8-jdk maven

# creating a deployable JAR file.
mvn -f $HOME/genfakedata/pom.xml clean package

# running JAR file.
java -jar $HOME/genfakedata/target/genfakedata-1.0.0-jar-with-dependencies.jar
