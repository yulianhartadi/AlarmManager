package net.kampungweb.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * TODO 3:
 * create BroadcastReceiver class with name AlarmReceiver
 * project package new --> other --> BroadcastReceiver
 */
public class AlarmReceiver extends BroadcastReceiver {

    public static  final String TYPE_ONE_TIME = "OneTimeAlarm";


    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
