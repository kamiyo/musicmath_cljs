(ns musicmath.main
  (:require [reagent.core :as r]
            [re-frame.core :refer [dispatch dispatch-sync]]
            [stylefy.core :as stylefy]
            [musicmath.styles]))

(defn view []
  [:div {:className "whoa"} "What's up?"])

(defn main! []
  (println "[main]: entered!")
  (stylefy/init
   {:global-vendor-prefixes
    {::stylefy/vendors ["webkit" "moz" "o"]
     ::stylefy/auto-prefix #{:border-radius :box-shadow :appearance :user-select}}})
  (r/render [view]
            (.getElementById js/document "app")))

(defn reload! []
  (main!))