(ns main_test
  (:require [core :refer [handler]]
            [promesa.core :as p]
            [cljs.test :refer (deftest is async)]))

(deftest handler_test
  (async done (-> (handler nil nil)
                  (p/then (fn [result] (is (not (nil? result))) (done)))
                  (p/catch (fn [error] (is (nil? error)) (done))))))