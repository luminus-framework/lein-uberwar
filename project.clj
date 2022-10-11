(defproject lein-uberwar "0.2.3-SNAPSHOT"
  :description "a Leiningen plugin for packaging WAR archives"
  :url "https://github.com/yogthos/lein-uberwar"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/data.xml "0.0.8"]
                 [leinjacker "0.4.3"]])
