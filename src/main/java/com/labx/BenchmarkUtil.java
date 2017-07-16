package com.labx;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Benchmark)
public class BenchmarkUtil {

    static int[] DATA = new int[1024];

    static Random RANDOM = new Random();

    static {
        System.loadLibrary("Demo");

        for (int i = 0; i < DATA.length; i++) {
            DATA[i] = RANDOM.nextInt();
        }
    }

    Demo demo = new Demo();

    private int[] data = new int[DATA.length];

    @Setup(Level.Invocation)
    public void setup() {
        System.arraycopy(DATA, 0, data, 0, DATA.length);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void benchmarkInsertionSort() {
        demo.insertionSort(data);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void benchmarkCInsertionSort() {
        demo.cInsertionSort(data);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
            .include(BenchmarkUtil.class.getSimpleName())
            .include(BenchmarkSimpleInvocation.class.getSimpleName())
            .forks(1)
            .build();
        new Runner(opt).run();
    }
}
