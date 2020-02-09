(ns core
  (:require [promesa.core :as p]
            ["request" :as request]))


(defn http-get-example [url]
  (p/create (fn [resolve _]
              (request/get url (fn [_ _ body] (resolve body))))))

(defn handler [event _]
  (println (:body (js->clj event :keywordize-keys true)))
  (-> (http-get-example "http://example.com")
      (p/then (fn [x] {:body x :statusCode 200}))
      (p/then clj->js)))

(def export (clj->js {:handler handler}))