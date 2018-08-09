(ns cljs-for-js-devs.app
    (:require-macros [cljss.core :refer [defstyles]])
    (:require [reagent.core :as r]))

(defstyles header []
  {:font-size "36px"
   :font-weight "bold"})

(defn root []
  [:h1 {:class (header)}
   "Hello, world!"])

