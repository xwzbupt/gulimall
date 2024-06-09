package com.atguigu.common.constant;

/**
 * @description:
 * @author：Weiser
 * @date: 2024/6/9
 */
public class ProductConstant {
    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "基本属性"),
        ATTR_TYPE_SALE(0, "销售属性");
        private int code;

        private String meg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.meg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMeg() {
            return meg;
        }
    }
}
