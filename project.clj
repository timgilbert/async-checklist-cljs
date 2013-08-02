(defproject async-checklist-cljs "0.1.0-SNAPSHOT"
  :description "TODO app written in clojurescript with core.async"
  :url "http://github.com/timgilbert"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.0"]]
  :plugins [[lein-cljsbuild "0.3.2"]
            [lein-ring "0.8.6"]
            [io.rkn/core.async "0.1.0-SNAPSHOT"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild {
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:output-to "resources/public/js/cljs.js"
                   :optimizations :simple
                   :pretty-print true}
        :jar true}}}
  :main async-checklist-cljs.server
  :ring {:handler async-checklist-cljs.server/app})

