(ns cljs-for-js-devs.messages
    (:require [reagent.core :as r]
              [stylefy.core :refer [use-style]]))

(def message-style { :position "absolute" :bottom "0" :width "100%"})

(defn message [] 
  [:article (use-style message-style) "testing"])

(def button-style
  { :border "none" :background "#00c19e" :color "#fff" :padding "15px 0" :text-transform "capitalize" :display "block" :width "100%"})

(defn button []
  [:button (use-style button-style { :type "submit" }) "reply"])

(def input-style
  { :margin "20px auto" :padding "10px" :display "block" :width "90%" :box-sizing "border-box"})

(defn input []
  [:label [:input (use-style input-style { :type "text" :placeholder "Enter Reply Here"})]])

(def form-style { :position "absolute" :bottom "0" :width "100%"})

(defn form []
  [:form (use-style form-style) [input] [button]])