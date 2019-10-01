package manifolddemo.extensions.java.lang.String;

import manifold.ext.api.Extension;
import manifold.ext.api.This;

import java.lang.String;

@Extension
public class MyStrExt {
    public static int getTotalLength(@This String thiz, String s1) {
        System.out.println("hello world!");

        return thiz.length() + s1.length();

    }
}