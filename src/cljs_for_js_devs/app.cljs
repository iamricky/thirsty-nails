(ns cljs-for-js-devs.app
    (:require [reagent.core :as r]
              [stylefy.core :refer [use-style]]
              [cljs-for-js-devs.chatroom :refer [chatroom]]))

(defn root []
  [:div
    [chatroom]])
