(require 'cljs.repl)
(require 'cljs.closure)
(require 'cljs.repl.browser)

(cljs.repl/repl (cljs.repl.browser/repl-env)
  :watch "src"
  :init (fn []
          (cljs.closure/build "src"
            {:main 'hello-world.core
             :output-to "out/main.js"})))
