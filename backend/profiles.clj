{:dev
 {:plugins [[lein-ancient "0.6.10"]]
  :dependencies [[clj-http "2.1.0"]]
  :jvm-opts ["-Xms50m" "-Xmx200m" "-XX:+UseG1GC"]
  :main ^:skip-aot uxbox.main}

 :prod
 {:jvm-opts ^:replace ["-Xms1g" "-Xmx1g" "-XX:+UseG1GC"
                       "-XX:+AggressiveOpts" "-server"]}}
