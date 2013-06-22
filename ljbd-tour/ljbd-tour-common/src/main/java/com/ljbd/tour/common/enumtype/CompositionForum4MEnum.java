package com.ljbd.tour.common.enumtype;

/**
 * Created with IntelliJ IDEA.
 * User: wangjiaqi
 * Date: 13-6-17
 * Time: 下午1:33
 * To change this template use File | Settings | File Templates.
 */
public enum CompositionForum4MEnum {

    CF4M_I(20,"热门线路"),
    CF4M_I_I(21,"热门线路"),
    CF4M_II(30,"热门岛屿"),
    CF4M_II_I(31,"热门岛屿"),
    CF4M_III(40,"一价全含"),
    CF4M_III_I(41,"一价全含"),
    CF4M_III_I_I(42,"一价全含"),
    CF4M_III_II(43,"一价全含"),
    CF4M_III_II_I(44,"一价全含"),
    CF4M_III_III(45,"一价全含"),
    CF4M_III_III_I(46,"一价全含"),
    CF4M_IV(50,"马代加强版"),
    CF4M_V(60,"岛屿TOP");
    private final int key;
    private final String value;

    CompositionForum4MEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static CompositionForum4MEnum getType(int key){
        for(CompositionForum4MEnum o : CompositionForum4MEnum.values()){
            if(key== o.getKey()){
                return o;
            }
        }
        return null;
    }

    public static String getValue(int type){
        for(CompositionForum4MEnum o : CompositionForum4MEnum.values()){
            if(type== o.getKey()){
                return o.getValue();
            }
        }
        return "";
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
