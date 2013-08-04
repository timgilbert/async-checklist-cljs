(ns hello-clojurescript
  (:require [cljs.core.async :as async
             :refer [<! >! chan close! sliding-buffer put!]]
            [jayq.core :as jq :refer [$ css inner html on]]
            [clojure.string :as string])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(defn log [arg]
  (.log js/console arg))

(defn handle-click []
  (log "Hello, world!"))

;; (defn click-chan [selector msg-name]
;;   (let [rc (chan)]
;;     (on ($ "body") :click selector {}
;;         (fn [e]
;;           (jq/prevent e)
;;           (put! rc [msg-name (data-from-event e)])))
;;     rc))

;; (defn app-loop [start-state]
;;   (form-submit-chan "#example1 .new-task-form" :ignore [])
;;   (let [ new-todo-click         (click-chan "#example1 a.new-todo"        :new-todo)
;;          cancel-new-form-click  (click-chan "#example1 a.cancel-new-todo" :cancel-new-form)]
;;     (go
;;      (loop [state start-state]
;;        (render-templates state)
;;        (<! new-todo-click)
;;        (render-templates (assoc state :mode :add-todo-form))
;;        (<! cancel-new-form-click)
;;        (recur (dissoc state :mode))))))


(def clickable (.getElementById js/document "clickable"))

(.addEventListener clickable "click" handle-click)
