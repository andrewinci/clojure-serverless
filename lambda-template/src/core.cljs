(ns core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn handler [event ctx cb]
  (if (nil? cb)
    (println "Error")
    (cb nil (clj->js
             {:statusCode 200
              :body (.stringify js/JSON "Hello from Lambda!")}))))

(set! (.-exports js/module) #js {:handler handler})
