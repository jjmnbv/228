package com.ljbd.ocrs.rentalcar.domain.common;




/**
 * 机构枚举
 *
 * @author xiaofei
 */
/*@Convertable*/
public enum Org  {
    Unknown(null),
    Beijing(1),
    Shanghai(2);

    private final Integer value;

    private Org(Integer value) {
        this.value = value;
    }

    public Integer value() {
        Org.values();
        return value;
    }

    public String toString() {
        return name() + "," + value();
    }

    public static Org of(final Integer value) {
        if (value != null) {
            switch (value) {
                case 1:
                    return Beijing;
                case 2:
                    return Shanghai;
            }
        }
        return Unknown;
    }


}