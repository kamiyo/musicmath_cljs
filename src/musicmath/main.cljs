(ns musicmath.main
  (:require [reagent.core :as r]
            [stylefy.core :as css]))

(defn view []
  [:div {:className "whoa"} "What's up?"])

(defn main! []
  (println "[main]: entered!")
  (r/render [view]
            (.getElementById js/document "app")))

(defn reload! []
  (main!))