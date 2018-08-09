(ns cljs-for-js-devs.app
    (:require [reagent.core :as r]
              [stylefy.core :refer [use-style]]))

(def header-style
  {:font-size "24px"
   :font-weight "bold"
   :padding "0"
   :margin "0"})

(defn root []
  [:h1 (use-style header-style)
   "Hello, world!"])

