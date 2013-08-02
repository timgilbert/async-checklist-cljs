(ns hello-clojurescript)

(defn handle-click []
  (js/alert "Hello!")
  (js/console/log "Hello!"))

(def clickable (.getElementById js/document "clickable"))

(.addEventListener clickable "click" handle-click)
