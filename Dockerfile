FROM ubuntu:18.04

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install --assume-yes apt-utils

RUN apt-get -y update

RUN apt-get -y install software-properties-common

RUN apt-get -y update

RUN apt install snapd

RUN snap install -y cmake --classic

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

RUN docker pull jreckner/libsodium
RUN docker run -it --rm jreckner/libsodium
RUN docker build -t jreckner/libsodium

RUN apt-get -y update
RUN apt-get install -y libsodium-dev
RUN apt-get install -y libsodium13
RUN apt-get install -y libsodium-dbg

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


 


