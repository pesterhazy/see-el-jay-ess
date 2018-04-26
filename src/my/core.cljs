(ns my.core
  (:require [goog.object]))

(defn demo [obj]
  (prn [(some-> obj (.-very) (.-long))
        (goog.object/getValueByKeys obj "very" "long")]))

(defn demo2 [^js obj]
  (prn [(some-> obj (.-very) (.-long))
        (goog.object/getValueByKeys obj "very" "long")]))

(defn demo3 [^js/Date obj]
  (prn [(some-> obj (.-very) (.-long))
        (goog.object/getValueByKeys obj "very" "long")]))

(let [obj #js {"very" #js {"long" "ok"}}]
  (prn obj)
  (println "demo")
  (demo obj)
  (println "demo2")
  (demo2 obj)
  (println "demo3")
  (demo3 obj))
