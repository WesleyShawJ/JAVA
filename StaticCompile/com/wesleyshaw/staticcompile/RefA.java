package com.wesleyshaw.staticcompile;

class RefA {
    private RefA() {
        String strA1 = StaticA.varA1;
        System.out.println(strA1);

        String strA2 = StaticA.varA2;
        System.out.println(strA2);
    }
    public static void main(String[] args){
        // empty
        new RefA();
    }
}
