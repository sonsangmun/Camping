package com.camping.sonsangmun.camping;

import android.provider.BaseColumns;

/**
 * Created by sonsangmun on 2015-06-30.
 */
public class Database {
    public static final class CreateDB implements BaseColumns {
        public static final String _ID = "uid";
        public static final String _PRODUCT = "product";
        public static final String _PRICE = "price";
        public static final String _BUY_DATE = "buy_date";
        public static final String _EA = "ea";
        public static final String _STATUS = "status";
        public static final String _TABLENAME = "Camping_List";
        public static final String _CREATE_TABLE =
                "create table "+_TABLENAME+"("
                        +_ID+" integer primary key autoincrement, "
                        +_PRODUCT+" text varchar(200) not null, "
                        +_PRICE+" integer, "
                        +_BUY_DATE+" text, "
                        +_EA+" integer, "
                        +_STATUS+" text );";
    }
}
