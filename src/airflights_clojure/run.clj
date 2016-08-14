(ns
  airflights_clojure.run
  (use ring.adapter.jetty)
  (require [airflights_clojure.service :as service])

  )
(defn -main [x]
  (run-jetty #'service/app {:port 8080}))
