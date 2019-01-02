package com.pd.pdmobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by zjj on 2018/11/26.
 */

public class UserDAO {
    public long insert(Context context, String username) {
        //得到连接
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        //得到写数据库对象
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();
        //把数据放到hashMap
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);

        //添加
        String tableName = "pd_user";
        long row = sqLiteDatabase.insert(tableName, null, contentValues);
        sqLiteDatabase.close();
        databaseHelper.close();
        return row;
    }
}
