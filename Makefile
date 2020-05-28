.PHONY:clean
clean:
	rm -rf .cljs_node_repl

.PHONY:build
build: clean
	clj -m cljs.main --target node -c app.core
