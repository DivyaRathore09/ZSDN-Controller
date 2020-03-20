FROM ubuntu:16.04

RUN apt-get update

RUN apt-get update && apt install -y libprotobuf-dev protobuf-compiler

RUN apt-get -y install software-properties-common

RUN add-apt-repository -y ppa:george-edison55/cmake-3.x

RUN apt-get -y update

RUN apt-get  install -y cmake build-essential

RUN add-apt-repository -y ppa:ts.sch.gr/ppa
RUN apt-get -y update
RUN apt-get install --quiet oracle-java8-installer
