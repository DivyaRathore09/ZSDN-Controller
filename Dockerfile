FROM ubuntu:16.04

RUN apt-get update && apt-get install -y --no-install-recommends apt-utils

RUN apt-get -y update

RUN apt-get -y install software-properties-common

RUN add-apt-repository -y ppa:george-edison55/cmake-3.x

RUN apt-get -y update

RUN apt-get install -y cmake build-essential




 


