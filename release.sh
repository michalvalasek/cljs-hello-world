#!/bin/zsh
echo "Building the production version (out/dist.js)..."
java -cp cljs.jar:src clojure.main release.clj
