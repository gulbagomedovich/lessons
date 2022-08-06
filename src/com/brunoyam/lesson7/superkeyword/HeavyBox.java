package com.brunoyam.lesson7.superkeyword;

public class HeavyBox extends Box {
    double weight;

    HeavyBox(double width, double height, double depth, double weight) {
        super(width, height, depth);    // должен идти первым в конструкторе
//        super();  // если super не прописан явно, то добавляется автоматически super без параметров
        this.weight = weight;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
