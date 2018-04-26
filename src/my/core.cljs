(ns my.core
  (:require [goog.object]))

(defn demo [obj]
  (prn [:demo-obj
        obj
        (-> obj (.-very))
        (some-> obj (.-very) (.-long))
        (goog.object/getValueByKeys obj "very" "long")]))

(let [obj #js {"very" #js {"long" "works"}}]
  (demo obj))
