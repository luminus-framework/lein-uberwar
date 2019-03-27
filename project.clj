(defproject lein-uberwar "0.2.1"
  :description "a Leiningen plugin for packaging WAR archives"
  :url "https://github.com/yogthos/lein-uberwar"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/core.unify "0.5.7"]
                 [org.clojure/data.xml "0.0.8"]
                 [leinjacker "0.4.3" :exclusions [org.clojure/core.unify]]])
