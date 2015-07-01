package com.camping.sonsangmun.camping;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sonsangmun on 2015-06-30.
 */
public class DBManager extends SQLiteOpenHelper {
    private DBManager mDBHelper;
    private Context mCtx;

    // 생성자
    public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //    최초 DB를 만들때 한버난 호출된다.
    @Override
    public void onCreate(SQLiteDatabase db) {
//        새로운 테이블 생성
//        TABLE : CAMPING_LIST
//        FIELDS
//        product text : 품목
//        price INTEGER : 가격
//        buy_date TEXT : 구입년월일
//        ea INTEGER : 수량
//        status TEXT : 상태
        db.execSQL("CREATE TABLE CAMPING_LIST(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "product TEXT," +
                "price INTEGER," +
                "buy_date TEXT," +
                "ea INTEGER," +
                "status TEXT);");
    }

//    데이터베이스가 존재하지만 버전이 다르면 호출 된다.
//    데이터베이스를 변경하고 싶을때 버전을 올려주고 새로운 작업을 해주면 된다.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
