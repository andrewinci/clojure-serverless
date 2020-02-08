(ns core
  (:require [promesa.core :as p]))

(defn handler [event _]
  (println (:body (js->clj event :keywordize-keys true)))
  (p/promise (clj->js {:statusCode 200 :body (.stringify js/JSON "Hello from Lambda!")})))

(set! (.-exports js/module) #js {:handler handler})
