(ns cljs-for-js-devs.chatroom
    (:require [reagent.core :as r]
              [stylefy.core :refer [use-style]]
              [cljs-for-js-devs.messages :refer [message form]]))

(def chatroom-style
  { :background "#fff" :box-shadow "5px 5px 0px 0px rgba(0,0,0,0.25)" :min-height "190px" :width "450px" :position "relative"})

(defn chatroom []
  [:section (use-style chatroom-style) [message] [form]])