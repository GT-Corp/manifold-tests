package manifolddemo.extensions.demo.dto.Car;

import manifold.ext.api.Extension;
import manifold.ext.api.This;
import demo.dto.Car;

@Extension
public class CarExt {
    public static void drive(@This Car thiz, int kmph) {
        System.out.println("Now driving " + thiz.getMake() + " car for " + kmph + " KM/HR");
    }
}