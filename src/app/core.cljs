(ns app.core
  (:require [clojure.test :refer [is]]))

(defprotocol Foo
  (bar [this])
  (baz [this]))

(defrecord Thing [a b c]
    Foo
    (bar [_]
      (case :a
        :b {}
        :a (js/Promise.resolve {})))
    (baz [_]
      (let [a 1
            b 2]
        (-> (js/Promise.resolve)
            (.then (fn []
                     (prn ::baz))))))) 







(def a (map->Thing {:a 1 :b 2 :c 3}))

(-> (bar a)
    (.then (fn [d] (prn ::another d)))
    (.then #(baz a)))

(-> a
    (baz)
    (.then (fn [] (prn ::done))))


  




