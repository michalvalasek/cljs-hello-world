#!/bin/zsh
echo "Building the cljs app..."
java -cp cljs.jar:src clojure.main build.clj
