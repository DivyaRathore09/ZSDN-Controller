#!/bin/sh

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

echo "Done1"

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

echo "Done2"

sudo apt-get update

echo "Done3"

apt-cache policy docker-ce

echo "Done4"

sudo apt-get install -y docker-ce

echo "Done5"

sudo -i

echo "Done6"

echo "docker run hello-world"

docker run hello-world

echo "Done7"

