(ns airflights-clojure.core)

((defn -main
   "I don't do a whole lot."
   [& args]
   (println "Hello, Worldy!")))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn i-add-numbers
   "I actually add two numbers"
    [x y]
   (+ x y)
 )
(defn i-add-numbers-overloaded
  ([x y] (+ x y))
  ([x y & args]
   (reduce + (i-add-numbers-overloaded x y) args))
  )