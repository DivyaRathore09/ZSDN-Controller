FROM ubuntu:16.04

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install --assume-yes apt-utils

RUN apt-get -y update

RUN apt-get -y install software-properties-common

RUN add-apt-repository -y ppa:george-edison55/cmake-3.x

RUN apt-get -y update

RUN apt-get install -y cmake build-essential

RUN add-apt-repository -u -y http://ppa.launchpad.net/ts.sch.gr//ppa/ubuntu/
RUN apt-get -y update
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | \debconf-set-selections
RUN echo debconf shared/accepted-oracle-license-v1-1 seen true | \debconf-set-selections
RUN apt-get install --allow-unauthenticated -y oracle-java8-installer
RUN java -version
RUN javac -version

RUN apt-get -y update
RUN apt-get -y install maven
RUN mvn -version

RUN apt-get install -y mininet

RUN apt-get -y update
RUN add-apt-repository -y ppa:chris-lea/libsodium
RUN echo "deb http://ppa.launchpad.net/chris-lea/libsodium/ubuntu trusty main" >> /etc/apt/sources.list;
RUN echo "deb-src http://ppa.launchpad.net/chris-lea/libsodium/ubuntu trusty main" >> /etc/apt/sources.list;
RUN apt-get update && sudo apt-get install libsodium-dev;


RUN apt-cache search libsodium

RUN apt-get -y update
RUN apt-get install -y libpcap-dev

RUN apt-get install -y flex byacc

RUN ls

RUN apt-get install -y git

RUN git clone https://github.com/zeroSDN/ZSDN-Controller.git

RUN cd ZSDN-Controller && ls && cd ..

RUN chmod +x ZSDN-Controller/./init-zsdn.sh

RUN ZSDN-Controller/./init-zsdn.sh


 


