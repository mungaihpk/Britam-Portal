package executables;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
//@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
public class BenchmarkRunnerClass {
	
	public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(MainDriverClass.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
