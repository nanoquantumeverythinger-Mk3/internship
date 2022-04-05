package xo.andrey.classes;

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
