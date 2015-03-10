#!/bin/zsh
echo "Watching for changes in ./src"
java -cp cljs.jar:src clojure.main watch.clj
