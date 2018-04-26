(ns my.core
  (:require [goog.object]))

(let [obj #js {"alpha" #js {"beta" "works"}}]
  (prn [:obj
        obj
        (-> obj (.-alpha) (.-beta))
        (goog.object/getValueByKeys obj "alpha" "beta")]))
