(ns learningclojure.core
  (:require [clojure.core]))
;  (use :reload 'cd-client.core))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn fizzbuzz
  "Classic fizzbuzz
  returns a fizzbuzz vector from 1 to max"
  [max]
  (
   )
  )

(def max 30)

(defn fber
  "Take a number and FizzBuzzes it"
  [n]
  (cond
   (and (zero? (mod n 3)) (zero? (mod n 5))) "FizzBuzz" 
   (zero? (mod n 5)) "Buzz"
   (zero? (mod n 3)) "Fizz"
   :else n))

(def bing (map fber 
     (range 1 (+ max 1))
     ))

(seq bing)

; What if I make a change here?

( if (= 3 4) "Fizz" )


(mod 3 1)

(def baz (vector (range 1 (+ max 1))))

(seq baz)

(type baz)

(def boo [1 3 4])

(type boo)

(seq boo)