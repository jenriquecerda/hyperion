(defproject jenriquecerda/hyperion-mongo "3.8.35"
  :description "Mongo Datastore for Hyperion"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hyperion/hyperion-api "3.7.1"]
                 [org.mongodb/mongodb-driver "3.6.0"]]

  :profiles {:dev {:dependencies [[speclj "2.7.5"]]}}
  :test-paths ["spec/"]
  :plugins [[speclj "2.7.5"]])
