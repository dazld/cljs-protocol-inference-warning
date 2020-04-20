
Is it possible at all to avoid inference warnings on protocols in clojurescript?

For example:

when running:

```
clj -m cljs.main --verbose --target node  --optimizations advanced -c app.core
```

observe:

```
...
WARNING: Cannot infer target type in expression (. this -app$core$IFoo$bar$arity$1) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. this app$core$IFoo$bar$arity$1 this) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$) at line 12 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$bar$arity$1) at line 12 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
...
```





