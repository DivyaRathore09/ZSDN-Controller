FROM ubuntu:16.04

RUN apt-get update && apt-get install -y --no-install-recommends apt-utils

RUN apt-get update && apt install -y libprotobuf-dev protobuf-compiler

RUN apt-get -y install software-properties-common

RUN add-apt-repository -y ppa:george-edison55/cmake-3.x

RUN apt-get -y update

RUN apt-get  install -y cmake build-essential


RUN add-apt-repository -u -y http://ppa.launchpad.net/ts.sch.gr//ppa/ubuntu/
RUN apt-get -y update
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | \debconf-set-selections
RUN echo debconf shared/accepted-oracle-license-v1-1 seen true | \debconf-set-selections
RUN apt-get install --allow-unauthenticated -y oracle-java8-installer

RUN mkdir -p /root/Downloads

 


