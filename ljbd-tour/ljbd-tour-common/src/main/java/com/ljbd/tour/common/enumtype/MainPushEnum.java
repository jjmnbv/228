package com.ljbd.tour.common.enumtype;

/**
 * Created with IntelliJ IDEA.
 * User: wangjiaqi
 * Date: 13-6-17
 * Time: 下午1:56
 * To change this template use File | Settings | File Templates.
 */
public enum MainPushEnum {
    MP_YES(1,"主推"),
    MP_NO(0,"非主推");
    private final int key;
    private final String value;

    MainPushEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static MainPushEnum getType(int key){
        for(MainPushEnum o : MainPushEnum.values()){
            if(key== o.getKey()){
                return o;
            }
        }
        return null;
    }

    public static String getValue(int type){
        for(MainPushEnum o : MainPushEnum.values()){
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
