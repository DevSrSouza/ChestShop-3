package com.Acrobot.ChestShop.Configuration;

import com.Acrobot.Breeze.Configuration.Annotations.PrecededBySpace;

public class SignConf {

    public static String BUY_CHAR = "B";
    public static String SELL_CHAR = "S";

    @PrecededBySpace
    public static String LINE_1_COLOR = "";
    public static String LINE_2_COLOR = "";
    public static String LINE_3_COLOR = "";
    public static String LINE_4_COLOR = "";

    public static char getBuyChar() {
        return BUY_CHAR.length() > 0 ? Character.toUpperCase(BUY_CHAR.toCharArray()[0]) : 'B';
    }

    public static char getSellChar() {
        return SELL_CHAR.length() > 0 ? Character.toUpperCase(SELL_CHAR.toCharArray()[0]) : 'S';
    }
}
