(ns cljs-for-js-devs.core
  (:require-macros [cljss.core :refer [inject-global]])
  (:require [reagent.core :as r]
            [cljss.core :as css]
            [cljs-for-js-devs.app :as app]))

;; Global styles

(inject-global
  {:body {:margin "20px"
          :background-color "#E9EAEC"
          :font-family "'Lato', sans-serif"}})

(defn start []
  (r/render [app/root]
    (.getElementById js/document "root")))

(start)
