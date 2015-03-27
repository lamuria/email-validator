(defproject email-validator "0.1"
  :description "validate emails"
  :url "https://github.com/lamuria/email-validator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}}
  :aliases {"all" ["with-profile" "dev:1.5:1.7" "test"]})
