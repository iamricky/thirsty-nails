(ns cljs-for-js-devs.messages
  (:require [reagent.core :as r]
            [stylefy.core :refer [use-style]]
            [cljs-for-js-devs.messages-styles :refer [message-style lt-col-style rt-col-style avatar-style username-style timestamp-style text-style]]))

(defn avatar [username] [:div (use-style avatar-style { :id :avatar }) username])

(defn message []
  [:article (use-style message-style)
   [:div (use-style lt-col-style) [avatar "AW"]]
   [:div (use-style rt-col-style) 
      [:header
      [:span (use-style username-style) "Andre Wheeler"]
      [:span (use-style timestamp-style) "Jan 20 at 6:34 PM"]]
      [:p (use-style text-style) "We have to make sure that we have all the punch list items accounted for. 
        Cory Robinson I want you to take the lead on this."]]])
