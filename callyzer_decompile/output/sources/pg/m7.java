package pg;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import c6.AbstractC0880j;
import d6.AbstractC1614d;
import java.util.Objects;
import p007h.C2749a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m7 {
    /* renamed from: a */
    public static Context m11788a(Context context) {
        int iM2364k;
        Context applicationContext = context.getApplicationContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && (iM2364k = c6.e0.m2364k(context)) != c6.e0.m2364k(applicationContext)) {
            applicationContext = c6.e0.m2356c(applicationContext, iM2364k);
        }
        if (i10 >= 30) {
            String strM2419c = AbstractC0880j.m2419c(context);
            if (!Objects.equals(strM2419c, AbstractC0880j.m2419c(applicationContext))) {
                return AbstractC0880j.m2417a(applicationContext, strM2419c);
            }
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static Object m11789b(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1614d.m5267c(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C2749a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
