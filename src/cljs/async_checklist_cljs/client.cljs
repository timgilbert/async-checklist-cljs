;; This initial version is trying to be a cljs version of the jquery todos-mvc, see:
;; https://github.com/tastejs/todomvc/blob/gh-pages/architecture-examples/jquery/js/app.js

(ns async-checklist-cljs
  (:require [cljs.core.async :as async
             :refer [<! >! chan close! sliding-buffer put!]]
            [jayq.core :as jq :refer [$ css inner html bind val]]
            [jayq.util :as util :refer [log]]
            [clojure.string :as string])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(def $new-todo ($ :#new-todo))

(defn create-todo [text]
  (log text))

(defn bind-events []
  (bind $new-todo :keyup
      (fn [event]
        (if (= (.-keyCode event) 13)
          (create-todo (val $new-todo))))))

(log "Hello, world!")

(bind-events)
