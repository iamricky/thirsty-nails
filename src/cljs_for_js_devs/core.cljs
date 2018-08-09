(ns cljs-for-js-devs.core
  (:require [reagent.core :as r]
            [stylefy.core :as stylefy]
            [cljs-for-js-devs.app :as app]))

;; Global styles
(def body-style
  {:margin "20px"
   :background-color "#E9EAEC"
   :font-family "'Lato', sans-serif"})

(defn start []
  (stylefy/init)
  (stylefy/tag "body" body-style)
  (r/render [app/root]
    (.getElementById js/document "root")))

(start)
