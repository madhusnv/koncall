package d9;

import android.content.ComponentName;
import android.content.Context;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.k */
/* loaded from: classes.dex */
public abstract class AbstractC1666k {
    static {
        C7077w.m13372b("PackageManagerHelper");
    }

    /* renamed from: a */
    public static void m5378a(Context context, Class cls, boolean z6) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z10 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z10 = true;
            }
            if (z6 == z10) {
                C7077w.m13371a().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
                C7077w.m13371a().getClass();
            }
        } catch (Exception unused) {
            C7077w.m13371a().getClass();
        }
    }
}
