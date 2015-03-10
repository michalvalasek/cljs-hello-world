(require 'cljs.closure)

(cljs.closure/build "src"
  {:output-to "out/dist.js"
   :optimizations :advanced})
