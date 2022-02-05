(defproject airflights-clojure "0.1.0-SNAPSHOT"
  :description "Airflight clojure: follow your device flights"
  :main airflights_clojure.run
  :dependencies
  [[org.clojure/clojure "1.10.3"]
   [org.clojure/clojure-contrib "1.2.0"]
   [org.clojure/data.json "2.4.0"]
   [ring/ring-jetty-adapter "1.9.5"]
   [ring-json-params "0.1.3"]
   [ring/ring-json "0.5.1"]
   [ring/ring-core "1.9.5"]
   [compojure "1.6.2"]]
  :dev-dependencies
  [[lein-run "1.0.0-SNAPSHOT"]]
  :plugins [[lein-cloverage "1.2.2"]])

(defproject test "0.1.0-SNAPSHOT"
  :description "Airflight clojure: follow your device flights"
  :main airflights_clojure.run
  :dependencies
  [[org.clojure/clojure "1.10.3"]
   [org.clojure/clojure-contrib "1.2.0"]
   [org.clojure/data.json "2.4.0"]
   [ring/ring-jetty-adapter "1.9.5"]
   [ring-json-params "0.1.3"]
   [ring/ring-json "0.5.1"]
   [ring/ring-core "1.9.5"]
   [compojure "1.6.2"]]
  :repl-options {:init-ns test.core}
  :plugins [[lein-cloverage "1.2.2"]]
  )
