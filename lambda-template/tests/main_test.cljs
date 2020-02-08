(ns main_test
    (:require [core :refer [handler]]
              [cljs.test :refer (deftest is)]))

(deftest handler_test
    (is (not (nil? (handler nil)))))