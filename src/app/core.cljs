(ns app.core
  (:require [clojure.test :refer [is]]))

(set! *warn-on-infer* true)

(defprotocol IFoo
  (bar [this]))

(defrecord Thing [a]
  IFoo
  (bar [_]
    (+ 1 1)))
       

(def a (map->Thing {:a 1}))

(prn ::bar (bar a))




  




