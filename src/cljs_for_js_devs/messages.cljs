(ns cljs-for-js-devs.messages
  (:require [reagent.core :as r]
            [stylefy.core :refer [use-style]]
            [cljs-for-js-devs.messages-styles :refer [message-style username-style timestamp-style text-style]]))

(defn message []
  [:article (use-style message-style)
   [:header
    [:span (use-style username-style) "Andre Wheeler"]
    [:span (use-style timestamp-style) (str (js/Date.))]]
   [:p (use-style text-style) "We have to make sure that we have all the punch list items accounted for. 
      Cory Robinson I want you to take the lead on this."]])
