
Is it possible at all to avoid inference warnings on protocols in clojurescript?

For example:

when running:

```
clj -m cljs.main --verbose --target node  --optimizations advanced -c app.core
```

observe:

```
➜  cljs-protocol-inference-warning git:(master) ✗ clj -m cljs.main --verbose --target node  --optimizations advanced -c app.core
Options passed to ClojureScript compiler: {:output-dir "out", :closure-warnings {:check-types :off, :check-variables :off}, :closure-defines {"cljs.core._STAR_target_STAR_" "nodejs"}, :static-fns true, :ups-libs nil, :optimize-constants true, :cache-analysis true, :closure-module-roots [], :optimizations :advanced, :ups-foreign-libs [], :verbose true, :aot-cache true, :ignore-js-module-exts [".css"], :output-to "out/main.js", :preamble ["cljs/imul.js"], :ups-externs nil, :opts-cache "cljsc_opts.edn", :cache-analysis-format :transit, :target :nodejs, :main app.core, :emit-constants true}
Reading analysis cache for jar:file:/Users/danpeddle/.m2/repository/org/clojure/clojurescript/1.10.597/clojurescript-1.10.597.jar!/cljs/core.cljs
Reading analysis cache for out/clojure/string.cljs
Reading analysis cache for out/cljs/pprint.cljs
Reading analysis cache for out/cljs/test.cljs
Compiling /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs to out/app/core.js
WARNING: Cannot infer target type in expression (. this -app$core$IFoo$bar$arity$1) at line 6 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. this app$core$IFoo$bar$arity$1 this) at line 6 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$bar$arity$1) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
Analyzing out/cljs/nodejs.cljs
Analyzing out/cljs/nodejscli.cljs
Applying optimizations :advanced to 26 sources
```




