(defproject quux "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev
                {
                  :dependencies [[midje "1.5.0"]],
                  :plugins [[lein-midje "3.1.1"]]
                }
             }
)