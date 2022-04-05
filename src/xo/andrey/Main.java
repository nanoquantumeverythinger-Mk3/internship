package xo.andrey;

import xo.andrey.classes.MyClass;
import xo.andrey.functions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<MyClass> list = new LinkedList<>();
        list.add(new MyClass("first", 11, 19.2));
        list.add(new MyClass("second", 12, -111.2));
        list.add(new MyClass("third", 110, 1.1));
        list.add(new MyClass("444", 0, 31.2));
        list.add(new MyClass("!", 9, 19.2));

// генерирую массив случайных чисел
        List<Integer> integerList = Stream.generate(() -> ((int) (Math.random() * 100))).limit(20).collect(Collectors.toList());
        System.out.println(integerList + " " + integerList.size());

// получаю новый стрим в котором делю все элементы на 10, устраняю дубликаты
        integerList = integerList.stream().map(x -> x = x / 10).distinct().collect(Collectors.toList());
        System.out.println(integerList + " " + integerList.size());

// вычисляю сумму всех элементов
        System.out.println(integerList.stream().reduce((x, y) -> x + y).get());

        System.out.println();
        List<MyClass> myClassList = Stream.of(new MyClass("первый", 1, 1.1),
                new MyClass("второй", 2, 2.2),
                new MyClass("3", 0, 55555),
                new MyClass("Ssss", 14, 42.0),
                new MyClass("aAa", 9, -9.1),
                new MyClass("UwU", 0, 2.2),
                new MyClass(null, 1, 42.0)).collect(Collectors.toList());
        System.out.println(myClassList);

        List<MyClass> secondList = myClassList.stream().collect(Collectors.toList());   // ремоут  0_о
        List<MyClass> thirdList = myClassList.stream().map(x -> x = new MyClass(x.getString(), x.getAnInt(), x.getaDouble())).collect(Collectors.toList()); // вроде как клон

//в первых двух элементах с полем double больше 40 string заменяется на "!". count использован для запуска операций
        myClassList.stream().filter(x -> x.getaDouble() > 40).peek(x -> x.setString("!")).limit(2).count();
        System.out.println(myClassList);
        System.out.println(secondList);
        System.out.println(thirdList);


/*
        Predicate<MyClass> stringLength3 = y -> y.getString().length() > 3;
        Predicate<MyClass> positiveDouble = y -> y.getaDouble() > 0;
        IMyClassFilter mcf = x -> x.stream().filter(positiveDouble).collect(Collectors.toList());

        System.out.println(mcf.filter(list));

        IStringToBooleanLambda s2b1 = x -> x.equals("test");
        IStringToBooleanLambda s2b2 = x -> x.equals("word");
        IMyClassToVoidLambda mc2v1 = x -> x.setAnInt(42);
        INoArgToBooleanLambda v2b1 = () -> (Math.round(Math.random()) % 2 == 0);
        BiFunction<MyClass, MyClass, MyClass> biFunction = (x, y) -> {
            y.setAnInt(x.getAnInt());
            return y;
        };
        IVarFunction<MyClass> varFunction = (x) -> {
            Arrays.stream(x).forEach(y -> y.setAnInt(0));
            return x.length + " ";
        };

        System.out.println(varFunction.doStuff(list.get(0), list.get(1), list.get(2)));
        System.out.println(list);


        System.out.println(biFunction.apply(list.get(0), list.get(1)));

        String testString = "test";
        MyClass mc = new MyClass();
        mc.setAnInt(11);

        System.out.println(s2b1.doStuff(testString));
        System.out.println(s2b2.doStuff(testString));

        System.out.println(mc);
        mc2v1.doStuff(mc);
        System.out.println(mc);

        System.out.println(v2b1.doStuff() + " " +
                v2b1.doStuff() + " " +
                v2b1.doStuff() + " " +
                v2b1.doStuff());
        */
    }
}

