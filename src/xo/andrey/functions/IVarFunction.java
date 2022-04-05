package xo.andrey.functions;

@FunctionalInterface
public interface IVarFunction<T> {
    String doStuff(T... t);
}
