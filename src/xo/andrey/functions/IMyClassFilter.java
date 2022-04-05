package xo.andrey.functions;

import xo.andrey.classes.MyClass;

import java.util.List;

@FunctionalInterface
public interface IMyClassFilter {
    List<MyClass> filter(List<MyClass> list);
}
