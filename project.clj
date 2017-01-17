(defproject org.clojars.maxgfaraday/clj-dnssrv "0.1.0-SNAPSHOT"
  :description "DNS SRV record lookup for Clojure"
  :url "https://github.com/maxgfaraday/clj-dnssrv"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/maxgfaraday/clj-dnssrv"}
  :deploy-repositories [["releases" :clojars]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.spotify/dns "2.2.0"]]

  :profiles {:dev {:plugins [[lein-codox "0.10.2"]
                             [jonase/eastwood "0.1.4"]
                             [listora/whitespace-linter "0.1.0"]]

                   :codox {:source-paths ["src"] :output-path "docs-generated"}

                   :eastwood {:exclude-linters [:deprecations :unused-ret-vals]}

                   :aliases {"ci" ["do" ["test"] ["lint"]]
                             "lint" ["do" ["whitespace-linter"] ["eastwood"]]}}})
