(defproject mini-occ "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :monkeypatch-clojure-test false
  :injections [(require 'clojure.core.typed)
               (clojure.core.typed/install
                 #{:load})]
  :repl-options {:timeout 3000000}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [org.clojure/core.typed "0.3.33-SNAPSHOT"]
                 [org.clojure/test.check "0.9.0"]])
