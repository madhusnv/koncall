package d9;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.o */
/* loaded from: classes.dex */
public abstract class AbstractC1670o {

    /* renamed from: a */
    public static final /* synthetic */ int f8199a = 0;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    /* renamed from: a */
    public static final PowerManager.WakeLock m5381a(Context context, String tag) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C1671p.f8200a) {
        }
        AbstractC4154l.m8922e(wakeLock, "wakeLock");
        return wakeLock;
    }
}
