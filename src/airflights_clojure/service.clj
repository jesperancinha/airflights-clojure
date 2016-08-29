(ns
  airflights_clojure.service

  (:use compojure.core)
  (:use ring.middleware.json-params)
  (:require [clj-json.core :as json]))
  (:require '[clojure.data.json :as data])

(defn json-response [data & [status]]
  {:status  (or status 200)
   :headers {"Content-Type" "application/json"}
   :body    (json/generate-string data)})

(defroutes handler
           (GET "/" []
                (json-response {"hello" "world"}))

           (PUT "/" [name]
                (json-response {"hello" name})))

(def app
  (-> handler
      wrap-json-params))

(def all-records (data/read-str (slurp "/flights-service.json")
                                :key-fn keyword))