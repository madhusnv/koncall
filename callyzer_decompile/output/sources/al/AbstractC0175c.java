package al;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import eb.C1979c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.c */
/* loaded from: classes.dex */
public abstract class AbstractC0175c {

    /* renamed from: a */
    public static final C1979c f538a = new C1979c("CommonUtils", "");

    /* renamed from: a */
    public static String m400a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e2.toString());
            C1979c c1979c = f538a;
            if (!Log.isLoggable(c1979c.f9280a, 6)) {
                return "";
            }
            c1979c.m5714a(strConcat);
            return "";
        }
    }
}
