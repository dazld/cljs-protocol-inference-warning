


when running:

```
clj -m cljs.main --target node -c app.core

```

observe:
```
WARNING: Cannot infer target type in expression (. v -app$core$IFoo$) at line 10 /Users/danpeddle/projects/cljs-protocol-inference-warning/src/app/core.cljs
```

This warning can be supressed by providing a type hint, but should this be necessary?


## notes

Perform `rm -rf .cljs_node_repl` between invocations of the above command to consistently see warnings printed, if not changing any code.

command `make build` will perform the removal and compile step as a convenience.
