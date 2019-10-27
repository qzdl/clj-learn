(ns hello-world.core
  (:require react-dom))

(println "Hello world!")

(defn average  [a b]
  (/ (+ a b) 2.0))

(.render js/ReactDOM
  (.createElement js/React "h2" nil "Hello, React!")
  (.getElementById js/document "app"))

; (.render js/ReactDOM
;   (.createElement js/React "h2" nil "Hello, React!")
;   (.getElementById js/document "app"))
