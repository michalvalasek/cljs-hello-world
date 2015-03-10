;(ns hello-world.core) ; production

(ns hello-world.core
  (:require [clojure.browser.repl :as repl])) ; development

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!!!")

(defn foo [a b]
  (* a b))
