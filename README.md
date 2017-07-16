### Digital Run

```text
Zhanhui-MacbookPro:target lizhanhui$ java -server -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation -XX:LogFile=/Users/lizhanhui/jit.log    -Djava.library.path=/Users/lizhanhui/IdeaProjects/jni-tutorial/src/main/resources -jar jni-turorial-1.0-SNAPSHOT-jar-with-dependencies.jar
# JMH version: 1.19
# VM version: JDK 1.7.0_80, VM 24.80-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/bin/java
# VM options: -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation -XX:LogFile=/Users/lizhanhui/jit.log -Djava.library.path=/Users/lizhanhui/IdeaProjects/jni-tutorial/src/main/resources
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.labx.BenchmarkSimpleInvocation.benchmarkCSum

# Run progress: 0.00% complete, ETA 00:02:40
# Fork: 1 of 1
# Warmup Iteration   1: 16.541 ns/op
# Warmup Iteration   2: 16.501 ns/op
# Warmup Iteration   3: 15.676 ns/op
# Warmup Iteration   4: 15.598 ns/op
# Warmup Iteration   5: 15.345 ns/op
# Warmup Iteration   6: 15.494 ns/op
# Warmup Iteration   7: 15.519 ns/op
# Warmup Iteration   8: 15.515 ns/op
# Warmup Iteration   9: 15.578 ns/op
# Warmup Iteration  10: 15.517 ns/op
# Warmup Iteration  11: 15.410 ns/op
# Warmup Iteration  12: 15.377 ns/op
# Warmup Iteration  13: 15.544 ns/op
# Warmup Iteration  14: 15.454 ns/op
# Warmup Iteration  15: 15.413 ns/op
# Warmup Iteration  16: 15.451 ns/op
# Warmup Iteration  17: 15.531 ns/op
# Warmup Iteration  18: 15.335 ns/op
# Warmup Iteration  19: 15.402 ns/op
# Warmup Iteration  20: 15.266 ns/op
Iteration   1: 15.340 ns/op
Iteration   2: 15.420 ns/op
Iteration   3: 15.372 ns/op
Iteration   4: 15.305 ns/op
Iteration   5: 15.369 ns/op
Iteration   6: 15.350 ns/op
Iteration   7: 15.672 ns/op
Iteration   8: 15.346 ns/op
Iteration   9: 15.301 ns/op
Iteration  10: 15.428 ns/op
Iteration  11: 15.383 ns/op
Iteration  12: 15.403 ns/op
Iteration  13: 15.534 ns/op
Iteration  14: 15.501 ns/op
Iteration  15: 15.418 ns/op
Iteration  16: 15.779 ns/op
Iteration  17: 15.488 ns/op
Iteration  18: 15.475 ns/op
Iteration  19: 15.395 ns/op
Iteration  20: 15.437 ns/op


Result "com.labx.BenchmarkSimpleInvocation.benchmarkCSum":
  15.436 ±(99.9%) 0.103 ns/op [Average]
  (min, avg, max) = (15.301, 15.436, 15.779), stdev = 0.118
  CI (99.9%): [15.333, 15.539] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.7.0_80, VM 24.80-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/bin/java
# VM options: -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation -XX:LogFile=/Users/lizhanhui/jit.log -Djava.library.path=/Users/lizhanhui/IdeaProjects/jni-tutorial/src/main/resources
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.labx.BenchmarkSimpleInvocation.benchmarkSum

# Run progress: 25.00% complete, ETA 00:02:01
# Fork: 1 of 1
# Warmup Iteration   1: 3.399 ns/op
# Warmup Iteration   2: 3.366 ns/op
# Warmup Iteration   3: 2.809 ns/op
# Warmup Iteration   4: 2.845 ns/op
# Warmup Iteration   5: 2.815 ns/op
# Warmup Iteration   6: 2.866 ns/op
# Warmup Iteration   7: 2.836 ns/op
# Warmup Iteration   8: 2.852 ns/op
# Warmup Iteration   9: 2.856 ns/op
# Warmup Iteration  10: 2.834 ns/op
# Warmup Iteration  11: 2.813 ns/op
# Warmup Iteration  12: 2.892 ns/op
# Warmup Iteration  13: 2.823 ns/op
# Warmup Iteration  14: 2.841 ns/op
# Warmup Iteration  15: 2.830 ns/op
# Warmup Iteration  16: 2.831 ns/op
# Warmup Iteration  17: 2.853 ns/op
# Warmup Iteration  18: 2.834 ns/op
# Warmup Iteration  19: 2.821 ns/op
# Warmup Iteration  20: 2.838 ns/op
Iteration   1: 2.836 ns/op
Iteration   2: 2.845 ns/op
Iteration   3: 2.853 ns/op
Iteration   4: 2.830 ns/op
Iteration   5: 2.804 ns/op
Iteration   6: 2.854 ns/op
Iteration   7: 2.827 ns/op
Iteration   8: 2.827 ns/op
Iteration   9: 2.818 ns/op
Iteration  10: 2.842 ns/op
Iteration  11: 2.871 ns/op
Iteration  12: 2.851 ns/op
Iteration  13: 2.817 ns/op
Iteration  14: 2.862 ns/op
Iteration  15: 2.852 ns/op
Iteration  16: 2.822 ns/op
Iteration  17: 2.833 ns/op
Iteration  18: 2.833 ns/op
Iteration  19: 2.831 ns/op
Iteration  20: 2.842 ns/op


Result "com.labx.BenchmarkSimpleInvocation.benchmarkSum":
  2.837 ±(99.9%) 0.014 ns/op [Average]
  (min, avg, max) = (2.804, 2.837, 2.871), stdev = 0.017
  CI (99.9%): [2.823, 2.852] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.7.0_80, VM 24.80-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/bin/java
# VM options: -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation -XX:LogFile=/Users/lizhanhui/jit.log -Djava.library.path=/Users/lizhanhui/IdeaProjects/jni-tutorial/src/main/resources
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.labx.BenchmarkUtil.benchmarkCInsertionSort

# Run progress: 50.00% complete, ETA 00:01:20
# Fork: 1 of 1
# Warmup Iteration   1: 986731.755 ns/op
# Warmup Iteration   2: 1035895.337 ns/op
# Warmup Iteration   3: 1030204.522 ns/op
# Warmup Iteration   4: 1034928.719 ns/op
# Warmup Iteration   5: 1029188.660 ns/op
# Warmup Iteration   6: 1029827.338 ns/op
# Warmup Iteration   7: 1036663.909 ns/op
# Warmup Iteration   8: 1007022.133 ns/op
# Warmup Iteration   9: 1033880.536 ns/op
# Warmup Iteration  10: 1031186.406 ns/op
# Warmup Iteration  11: 1005355.355 ns/op
# Warmup Iteration  12: 1048349.057 ns/op
# Warmup Iteration  13: 1029069.672 ns/op
# Warmup Iteration  14: 1023727.273 ns/op
# Warmup Iteration  15: 1028527.179 ns/op
# Warmup Iteration  16: 1017740.628 ns/op
# Warmup Iteration  17: 1032869.072 ns/op
# Warmup Iteration  18: 1027731.282 ns/op
# Warmup Iteration  19: 1040569.502 ns/op
# Warmup Iteration  20: 1024234.934 ns/op
Iteration   1: 1016337.728 ns/op
Iteration   2: 1032544.799 ns/op
Iteration   3: 1034236.326 ns/op
Iteration   4: 1016174.924 ns/op
Iteration   5: 1021513.211 ns/op
Iteration   6: 1040662.863 ns/op
Iteration   7: 1052230.366 ns/op
Iteration   8: 1039123.061 ns/op
Iteration   9: 1028796.315 ns/op
Iteration  10: 1020627.033 ns/op
Iteration  11: 1024367.992 ns/op
Iteration  12: 1032866.255 ns/op
Iteration  13: 1058515.789 ns/op
Iteration  14: 1041447.451 ns/op
Iteration  15: 1022824.311 ns/op
Iteration  16: 1040585.492 ns/op
Iteration  17: 1090450.597 ns/op
Iteration  18: 1039618.407 ns/op
Iteration  19: 1043934.375 ns/op
Iteration  20: 1038695.742 ns/op


Result "com.labx.BenchmarkUtil.benchmarkCInsertionSort":
  1036777.652 ±(99.9%) 14774.370 ns/op [Average]
  (min, avg, max) = (1016174.924, 1036777.652, 1090450.597), stdev = 17014.186
  CI (99.9%): [1022003.282, 1051552.022] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.7.0_80, VM 24.80-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/bin/java
# VM options: -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation -XX:LogFile=/Users/lizhanhui/jit.log -Djava.library.path=/Users/lizhanhui/IdeaProjects/jni-tutorial/src/main/resources
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.labx.BenchmarkUtil.benchmarkInsertionSort

# Run progress: 75.00% complete, ETA 00:00:40
# Fork: 1 of 1
# Warmup Iteration   1: 358011.828 ns/op
# Warmup Iteration   2: 351466.266 ns/op
# Warmup Iteration   3: 351193.560 ns/op
# Warmup Iteration   4: 338912.411 ns/op
# Warmup Iteration   5: 333969.677 ns/op
# Warmup Iteration   6: 368624.632 ns/op
# Warmup Iteration   7: 366020.044 ns/op
# Warmup Iteration   8: 365521.882 ns/op
# Warmup Iteration   9: 361183.165 ns/op
# Warmup Iteration  10: 363917.938 ns/op
# Warmup Iteration  11: 371580.274 ns/op
# Warmup Iteration  12: 364306.909 ns/op
# Warmup Iteration  13: 368498.162 ns/op
# Warmup Iteration  14: 366032.152 ns/op
# Warmup Iteration  15: 362326.103 ns/op
# Warmup Iteration  16: 363679.724 ns/op
# Warmup Iteration  17: 368957.353 ns/op
# Warmup Iteration  18: 367278.245 ns/op
# Warmup Iteration  19: 366424.143 ns/op
# Warmup Iteration  20: 368330.645 ns/op
Iteration   1: 367205.409 ns/op
Iteration   2: 366614.093 ns/op
Iteration   3: 366680.672 ns/op
Iteration   4: 367216.960 ns/op
Iteration   5: 367876.285 ns/op
Iteration   6: 363522.859 ns/op
Iteration   7: 364823.379 ns/op
Iteration   8: 364418.182 ns/op
Iteration   9: 366578.485 ns/op
Iteration  10: 368964.286 ns/op
Iteration  11: 363686.502 ns/op
Iteration  12: 371351.701 ns/op
Iteration  13: 370112.921 ns/op
Iteration  14: 363386.149 ns/op
Iteration  15: 367089.044 ns/op
Iteration  16: 367371.701 ns/op
Iteration  17: 367300.220 ns/op
Iteration  18: 367896.299 ns/op
Iteration  19: 373531.192 ns/op
Iteration  20: 369680.074 ns/op


Result "com.labx.BenchmarkUtil.benchmarkInsertionSort":
  367265.321 ±(99.9%) 2278.162 ns/op [Average]
  (min, avg, max) = (363386.149, 367265.321, 373531.192), stdev = 2623.535
  CI (99.9%): [364987.158, 369543.483] (assumes normal distribution)


# Run complete. Total time: 00:02:41

Benchmark                                Mode  Cnt        Score       Error  Units
BenchmarkSimpleInvocation.benchmarkCSum  avgt   20       15.436 ±     0.103  ns/op
BenchmarkSimpleInvocation.benchmarkSum   avgt   20        2.837 ±     0.014  ns/op
BenchmarkUtil.benchmarkCInsertionSort    avgt   20  1036777.652 ± 14774.370  ns/op
BenchmarkUtil.benchmarkInsertionSort     avgt   20   367265.321 ±  2278.162  ns/op

```

### Conclusion and interpretation

1. JNI method invocation involves expensive state transition, which takes 5~6-fold of time.
1. Transition between JVM to native environment may trigger data-copy, attention is required.
1. Minimizing number of JNI calls matters. Do more work in each call.

### Future work
we might as well test impact of the following use-case patterns:

1. Return an complex object from native code to JVM.
1. Execute callback method defined in Java from native code.
1. Use critical-methods of JNI which would avoid data-copy yet block all threads within JVM, to check balance of data-copy and exclusive running.

### Reference
1. http://www.mastercorp.free.fr/Ing1/Cours/Java/java_lesson1/doc/Tutorial/performance/JPNativeCode_fm.htm
1. https://www.ibm.com/developerworks/java/library/j-jni/
1. http://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html