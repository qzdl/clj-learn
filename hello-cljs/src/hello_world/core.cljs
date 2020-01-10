(ns hello-world.core
  (:require [react-dom :as rd]
            [cljs.core.async :as async
              :refer [<! >! chan put! timeout]]
            [clojure.string :as string]))

(println "Hello world!")

(defn average  [a b]
  (/ (+ a b) 2.0))

(defn ex-0
  (.render js/ReactDOM
    (.createElement js/React "h1" nil "Hello, React!")
    (.getElementById js/document "app")))

; (.render js/ReactDOM
;   (.createElement js/React "h2" nil "Hello, React!")
;   (.getElementById js/document "app"))

(defn chanout [t c]
  "returns ")
(comment
  (def c (chan))
)

(comment
  (defn render [q]
    ""
    (apply str
           (for [p (reverse q)]
             (str "<div class=proc-" p "'>Process " p "</div>"))))
  )

(comment

  (go (while true (<! (timeout 250)) (>! c 1)))
  (go (while true (<! (timeout 1000)) (>! c 1)))
  (go (while true (<! (timeout 2000)) (>! c 1)))
)
