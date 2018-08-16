(ns cljs-for-js-devs.app
  (:require [reagent.core :as r]
            [stylefy.core :refer [use-style]]
            [cljs-for-js-devs.chatroom :refer [chatroom]]))

(def user-model {:current-user nil
                 :id nil
                 :firstname "Andre"
                 :lastname "Wheeler"
                 :name nil
                 :avatarId nil})

(def room-model {:id nil
                 :users nil
                 :created nil
                 :unread nil
                 :total nil})

(defonce app-state (r/atom {:user user-model :room room-model}))

(defn root []
  [:div
   [chatroom @app-state]])
