(ns app.core
  (:require [clojure.test :refer [is]]))

(set! *warn-on-infer* true)

;; No inference warnings
(defrecord Bar [])

;; Inference warnings
(defprotocol IFoo
  (bar [this]))

;; Inference warnings
(defrecord Thing [a]
  IFoo
  (bar [_]
    (+ 1 1)))
       

(def a (map->Thing {:a 1}))

(prn ::bar (bar a))




  




