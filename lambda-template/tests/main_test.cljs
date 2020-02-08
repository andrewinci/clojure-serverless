(ns main_test
  (:require [core :refer [handler]]
            [cljs.test :refer (deftest is)]))

(defn aws_callback [error result]
  (is (nil? error))
  (is (not (nil? result))))

(deftest handler_test
  (handler nil nil aws_callback))