package net.kampungweb.alarmmanager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * TODO 2 :
 * Create a simple storage mechanism using SharedPreferences
 * Create new java class and name it with AlarmPreference
 * Right click from project package -> new -> Java Class
 */
public class AlarmPreference {

    private final String PREF_NAME = "AlarmPreference";
    private final String KEY_ONE_TIME_DATE = "oneTimeDate";
    private final String KEY_ONE_TIME_TIME = "oneTimeTime";
    private final String KEY_ONE_TIME_MESSAGE = "oneTimeMessage";
    private final String KEY_REPEATING_TIME = "repeatingTime";
    private final String KEY_REPEATING_MESSAGE = "repeatingMessage";

    private SharedPreferences mSharedPreference;
    private SharedPreferences.Editor editor;

    public AlarmPreference(Context context) {
        mSharedPreference = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = mSharedPreference.edit();
    }

    private void setOneTimeDate(String date){
        editor.putString(KEY_ONE_TIME_DATE, date);
        editor.commit();
    }

    public String getOneTimeDate(){
        return mSharedPreference.getString(KEY_ONE_TIME_DATE, null);
    }

    private void setOneTimeTime(String time){
        editor.putString(KEY_ONE_TIME_TIME, time);
        editor.commit();
    }

    public String getOneTimeTime(){
        return mSharedPreference.getString(KEY_ONE_TIME_TIME, null);
    }

    private void setOneTimeMessage(String message){
        editor.putString(KEY_ONE_TIME_MESSAGE, message);
        editor.commit();
    }

    public String getOneTimeMessage(){
        return mSharedPreference.getString(KEY_ONE_TIME_MESSAGE, null);
    }

    private void setRepeatingTime(String time){
        editor.putString(KEY_REPEATING_TIME, time);
        editor.commit();
    }

    public String getRepeatingTime(){
        return mSharedPreference.getString(KEY_REPEATING_TIME, null);
    }

    private void setRepeatingMessage(String message){
        editor.putString(KEY_REPEATING_MESSAGE, message);
        editor.commit();
    }

    public String getRepeaatingMessage(){
        return mSharedPreference.getString(KEY_REPEATING_MESSAGE, null);
    }

    public void clear(){
        editor.clear();
        editor.commit();
    }
}
