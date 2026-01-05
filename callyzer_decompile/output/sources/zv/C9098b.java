package zv;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zv.b */
/* loaded from: classes3.dex */
public final class C9098b {

    /* renamed from: a */
    public final Context f43647a;

    /* renamed from: b */
    public String f43648b;

    public C9098b(Context context) {
        this.f43647a = context;
    }

    /* renamed from: a */
    public static final void m16508a(C9098b c9098b, String str, String str2, int i10, Uri uri, AudioAttributes audioAttributes, long[] jArr, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i10);
            notificationChannel.setDescription("description");
            notificationChannel.setSound(uri, audioAttributes);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(jArr);
            notificationChannel.setLockscreenVisibility(i11);
            Object systemService = c9098b.f43647a.getSystemService("notification");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            c9098b.f43648b = str;
        }
    }
}
