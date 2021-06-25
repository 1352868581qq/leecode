package com.leetcode.array;

import sun.awt.SunHints;

import java.util.*;

public class DeleteRepeat {


    // 私有内部类，按需加载，用时加载，也就是延迟加载
    private static class Holder {
        private static DeleteRepeat deleteRepeat = new DeleteRepeat();
    }

    private DeleteRepeat() {

    }

    public static DeleteRepeat getSingleton5() {
        return Holder.deleteRepeat;
    }



}
