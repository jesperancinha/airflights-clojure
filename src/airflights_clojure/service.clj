(ns
  airflights_clojure.service
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
           (GET "/" [] "This is the future service")
           (route/not-found "Not Found"))

(def app
  (handler/site app-routes))