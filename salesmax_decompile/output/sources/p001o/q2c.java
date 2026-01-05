package p001o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* loaded from: classes2.dex */
public abstract class q2c {
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static Notification.MediaStyle m44743a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
