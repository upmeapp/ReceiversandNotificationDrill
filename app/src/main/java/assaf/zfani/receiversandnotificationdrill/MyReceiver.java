package assaf.zfani.receiversandnotificationdrill;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.NotificationCompat;

/**
 * Created by user on 11/30/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification SimpleNotification = new NotificationCompat.Builder(context)
                .setColor(Color.RED)
                .setContentTitle("This is the title")
                .setContentText("Gps Status Changed")
                .setSmallIcon(android.R.drawable.sym_def_app_icon)
                .build();
        notificationManager.notify(5,SimpleNotification);
    }
}
