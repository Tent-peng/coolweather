package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province ���������
	 */
	public static final String CREATE_PROVINCE = "create table Province("
			+ "id int primary key autoincrement," + "province_name text,"
			+ "province_code text)";

	/**
	 * City ���������
	 */
	public static final String CREATE_CITY = "create table City("
			+ "id int primary key autoincrement," + "city_name text,"
			+ "city_code text," + "province_id int)";

	/**
	 * Country ���������
	 */
	public static final String CREATE_COUNTY = "create table County("
			+ "id int primary key autoincrement," + "county_name text,"
			+ "county_code text," + "city_id int)";

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);	//����province��
		db.execSQL(CREATE_CITY);		//����city
		db.execSQL(CREATE_COUNTY);		//����county��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

	}

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
}