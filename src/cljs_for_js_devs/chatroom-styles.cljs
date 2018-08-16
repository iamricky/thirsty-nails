(ns cljs-for-js-devs.chatroom-styles)

(def button-style
  {:border "none"
   :background "#00c19e"
   :color "#fff"
   :padding "15px 0"
   :text-transform "capitalize"
   :display "block"
   :width "100%"
   :outline "none"
   :font "bold 14px Lato, sans-serif"})

(def label-style
  {:position "relative"
   :stylefy/mode {:before
                   {:content ""
                    :position "absolute"
                    :left "10px"
                    :top "0"
                    :bottom "0"
                    :width "20px"
                    :background "url(https://s3.amazonaws.com/bakery-assets.workframe.com/ui/resources/user-icon.svg) center / contain no-repeat"}}})

(def input-style
  {:margin "20px auto"
   :padding "10px"
   :display "block"
   :width "90%"
   :box-sizing "border-box"
   :outline "none"})

(def form-style
  {:bottom "0"
   :width "100%"})

(def main-style
  {:background "#fff"
   :box-shadow "5px 5px 0px 0px rgba(0,0,0,0.25)"
   :width "450px"
   :position "relative"})

(def section-style
  {:display "table"
   :margin "0 auto"
   :padding "20px 0 0"
   :width "90%"})
