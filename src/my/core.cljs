(ns my.core
  (:require [goog.object]))

(defn demo [obj]
  (prn [(.-very obj)
        (some-> obj (.-very) (.-lengthy))
        (goog.object/getValueByKeys obj "very" "lengthy")]))

(defn demo2 [^js obj]
  (prn [(.-very obj)
        (some-> obj (.-very) (.-lengthy))
        (goog.object/getValueByKeys obj "very" "lengthy")]))

(defn demo3 [^js/Object obj]
  (prn [(.-very obj)
        (some-> obj (.-very) (.-lengthy))
        (goog.object/getValueByKeys obj "very" "lengthy")]))

(let [obj #js {"very" #js {"lengthy" "ok"}}]
  (prn obj)
  (println "demo")
  (demo obj)
  (println "demo2")
  (demo2 obj)
  (println "demo3")
  (demo3 obj))
