package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p001o.vti;

/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(vti vtiVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f7142a = (IconCompat) vtiVar.m53447v(remoteActionCompat.f7142a, 1);
        remoteActionCompat.f7143b = vtiVar.m53437l(remoteActionCompat.f7143b, 2);
        remoteActionCompat.f7144c = vtiVar.m53437l(remoteActionCompat.f7144c, 3);
        remoteActionCompat.f7145d = (PendingIntent) vtiVar.m53443r(remoteActionCompat.f7145d, 4);
        remoteActionCompat.f7146e = vtiVar.m53433h(remoteActionCompat.f7146e, 5);
        remoteActionCompat.f7147f = vtiVar.m53433h(remoteActionCompat.f7147f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, vti vtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vtiVar.m53449x(false, false);
        vtiVar.m53424M(remoteActionCompat.f7142a, 1);
        vtiVar.m53415D(remoteActionCompat.f7143b, 2);
        vtiVar.m53415D(remoteActionCompat.f7144c, 3);
        vtiVar.m53419H(remoteActionCompat.f7145d, 4);
        vtiVar.m53451z(remoteActionCompat.f7146e, 5);
        vtiVar.m53451z(remoteActionCompat.f7147f, 6);
    }
}
