(ns quux.core)

;;; This is an incorrect implementation, such as might be written by
;;; someone who was used to a Lisp in which an empty list is equal to
;;; nil.
(defn first-element
  "Lorem ipsum dolor sit amet, consectetur adipisicing elit."
  [sequence default]
    (if (empty? sequence)
      default
      (first sequence)))

(defn sum [& args]
  (reduce + 0 args))
