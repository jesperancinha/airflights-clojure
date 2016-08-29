(defproject airflights-clojure "0.1.0-SNAPSHOT"
  :description "Airflight clojure: follow your device flights"
  :main airflights_clojure.run
  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [org.clojure/clojure-contrib "1.2.0"]
   [org.clojure/data.json "0.2.6"]
   [ring/ring-jetty-adapter "0.2.5"]
   [ring-json-params "0.1.0"]
   [ring/ring-json "0.4.0"]
   [ring/ring-core "1.5.0"]
   [compojure "1.1.1"]]
  :dev-dependencies
  [[lein-run "1.0.0-SNAPSHOT"]])
