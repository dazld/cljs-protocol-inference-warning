
Is it possible at all to avoid inference warnings on protocols in clojurescript?

For example:

when running:

```
clj -m cljs.main --target node -c app.core
```

observe (current release of CLJS):
```
WARNING: Cannot infer target type in expression (. this -app$core$IFoo$bar$arity$1) at line 10 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. this app$core$IFoo$bar$arity$1 this) at line 10 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
```

observe (previous release of CLJS):

```
...
WARNING: Cannot infer target type in expression (. this -app$core$IFoo$bar$arity$1) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. this app$core$IFoo$bar$arity$1 this) at line 9 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$) at line 12 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
WARNING: Cannot infer target type in expression (. (. Thing -prototype) -app$core$IFoo$bar$arity$1) at line 12 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
...
```

## notes

Perform `rm -rf out` between invocations of the above command to consistently see warnings printed, if not changing any code.
