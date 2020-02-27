package com.cowain.pms.modules.wms.syn;

public enum DataSourceType {

        ERP(1,"ERP"),PAD(2,"PAD"),MES(3,"MES"),APS(4,"APS");

        private final int sourceType;
        private final String desc;

    DataSourceType (int sourceType,String desc) {
            this.sourceType = sourceType;
            this.desc = desc ;
        }

        public int getSourceType() {
            return sourceType;
        }
}
