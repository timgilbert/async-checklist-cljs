(ns async-checklist-cljs.server
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources]
            [ring.util.response :as response])
  (:gen-class))

(defn handler [request]
  (if (= "/" (:uri request))
      (response/redirect "/index.html")
      true))

(def app
  (-> handler
    (resources/wrap-resource "public")))

(defn -main [& args]
  (jetty/run-jetty app {:port 3000}))

