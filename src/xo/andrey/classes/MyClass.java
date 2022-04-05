package xo.andrey.classes;

import java.util.Objects;

public class MyClass implements Cloneable {
    String string;
    int anInt;
    double aDouble;

    public MyClass() {
    }

    public MyClass(String string, int anInt, double aDouble) {
        this.string = string;
        this.anInt = anInt;
        this.aDouble = aDouble;
    }

    public MyClass clone() {
        return new MyClass(new String(this.string), this.anInt, this.aDouble);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;
        MyClass myClass = (MyClass) o;
        return anInt == myClass.anInt && Double.compare(myClass.aDouble, aDouble) == 0 && Objects.equals(string, myClass.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, anInt, aDouble);
    }

    @Override
    public String toString() {
        return string + " " + anInt + " " + aDouble;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }
}
