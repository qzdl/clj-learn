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


(def c (chan))

(defn render [q]
  (apply str
         (for [p (reverse q)]
           (str "<div class='proc-" p "'>Process " p "</div>"))))

(go (while true (<! (timeout 250)) (>! c 1)))
(go (while true (<! (timeout 1000)) (>! c 2)))
(go (while true (<! (timeout 1500)) (>! c 3)))

(defn peekn
  "Returns vector of (up to) n items from the end of vector v"
  [v n]
  (if (> (count v) n)
    (subvec v (- (count v) n))
    v))

(let [el  (by-id "ex0")
      out (by-id "ex0-out")]
  (go (loop [q []]
        (set-html! out (render q))
        (recur (-> (conj q (<! c)) (peekn 10))))))
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
