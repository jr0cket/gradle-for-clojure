(ns hello-gradle.core-test
  (:require [clojure.test :refer :all]
            [hello-gradle.core :refer :all]))

(deftest a-test
  (testing "I am a very simple passing test to see if the test framework is working"
    (is (= 1 1))))


(deftest simple-test
  (testing "I am another simple test to see what test results look like in TeamCity"
    (is (= '(1 2 3 4) [1 2 3 4]))))

