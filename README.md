# Using JS type hints

Expected output

```
["ok" "ok"]
```

Actual output

```
demo
[nil "ok"]
demo2
[nil "ok"]
demo3
[nil "ok"]
```

## Infering externs

Setting `:infer-extern true` seems to break compilation:

```
scripts/run-test-deps
# ...
Applying optimizations :advanced to 23 sources
Exception in thread "main" java.lang.NullPointerException
	at com.google.javascript.jscomp.ProcessDefines.overrideDefines(ProcessDefines.java:140)
	at com.google.javascript.jscomp.ProcessDefines.process(ProcessDefines.java:125)
	at com.google.javascript.jscomp.DefaultPassConfig$57$1.process(DefaultPassConfig.java:2272)
	at com.google.javascript.jscomp.PhaseOptimizer$NamedPass.process(PhaseOptimizer.java:303)
	at com.google.javascript.jscomp.PhaseOptimizer.process(PhaseOptimizer.java:230)
	at com.google.javascript.jscomp.Compiler.performOptimizations(Compiler.java:2541)
	at com.google.javascript.jscomp.Compiler$3.call(Compiler.java:833)
	at com.google.javascript.jscomp.Compiler$3.call(Compiler.java:829)
	at com.google.javascript.jscomp.CompilerExecutor$2.call(CompilerExecutor.java:101)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:748)
  ```
