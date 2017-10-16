package jp.azusatechacademy.sugimoto.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    static String to_jp = "人";
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + "this.hobby" + "ついて考える");
    }
}
