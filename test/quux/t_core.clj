(ns quux.t-core
  (:use midje.sweet)
  (:use [quux.core]))

(facts "about `first-element`"
  (fact "it normally returns the first element"
    (first-element [1 2 3] :default) => 1
    (first-element '(1 2 3) :default) => 1)

  ;; I'm a little unsure how Clojure types map onto the Lisp I'm used to.
  (fact "default value is returned for empty sequences"
    (first-element [] :default) => :default
    (first-element '() :default) => :default
    (first-element nil :default) => :default
    (first-element (filter even? [1 3 5]) :default) => :default))

(facts "multiple args sum"
  (fact "returns 0 when given no args"
    (sum) => 0)
  (fact "adds all numbers"
    (sum 1 2 3 4) => 10))
