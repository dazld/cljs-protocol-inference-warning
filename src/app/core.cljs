(ns app.core
  (:require [clojure.test :refer [is]]))

(set! *warn-on-infer* true)

;; No inference warnings
(defrecord Bar [])

;; Inference warnings
(defprotocol IFoo
  (bar [this]))

(defrecord Thing [a]
  IFoo
  (bar [_]
    (+ a 1)))

(def a (map->Thing {:a 1}))

(prn ::bar (bar a))
