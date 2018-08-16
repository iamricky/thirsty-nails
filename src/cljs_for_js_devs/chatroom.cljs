(ns cljs-for-js-devs.chatroom
  (:require [reagent.core :as r]
            [stylefy.core :refer [use-style]]
            [cljs-for-js-devs.chatroom-styles :refer [main-style section-style form-style label-style input-style button-style]]
            [cljs-for-js-devs.messages :refer [message]]))

(defn submit-chat []
  (let [state (atom {:value ""})]
    (fn [] [:form (use-style form-style) 
      [:label (use-style label-style) [:input (use-style input-style {:id :chat
                                              :type :text
                                              :value (:value @state)
                                              :placeholder "Enter Reply Here"})]]
      [:button (use-style button-style {:type "submit" :on-click (fn [e] (.preventDefault e))}) "reply"]])))

(defn chatroom []
  [:main (use-style main-style)
  [:section (use-style section-style) [message]] [submit-chat]])