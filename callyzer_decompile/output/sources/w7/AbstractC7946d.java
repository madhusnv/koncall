package w7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w7.d */
/* loaded from: classes.dex */
public abstract class AbstractC7946d {
    /* renamed from: a */
    public static PackageInfo m15119a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
