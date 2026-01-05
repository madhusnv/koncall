package jg;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import r5.AbstractC6468c;
import rf.C6514s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jg.c */
/* loaded from: classes.dex */
public abstract class AbstractC3764c extends AbstractC6468c {
    /* renamed from: e */
    public static void m8288e(Context context, C6514s c6514s, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(c6514s, intentFilter, i10 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(c6514s, intentFilter);
        }
    }
}
