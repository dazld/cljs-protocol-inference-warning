(ns app.core)

(set! *warn-on-infer* true)

(defprotocol IFoo
  (bar [this]))

;; warns on inference - expected?
(defn not-ok? [v]
  (satisfies? IFoo v))

;; no inference warning
(defn ok? [^IFoo v]
  (satisfies? IFoo v))
