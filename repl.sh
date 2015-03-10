#!/bin/zsh
echo "Starting cljs browser REPL & watching the project"
rlwrap java -cp cljs.jar:src clojure.main repl.clj
