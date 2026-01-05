package ug;

import android.content.Context;
import android.os.Bundle;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a */
    public final Context f35282a;

    /* renamed from: b */
    public final Boolean f35283b;

    /* renamed from: c */
    public final long f35284c;

    /* renamed from: d */
    public final com.google.android.gms.internal.measurement.u0 f35285d;

    /* renamed from: e */
    public final boolean f35286e;

    /* renamed from: f */
    public final Long f35287f;

    /* renamed from: g */
    public final String f35288g;

    public b2(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l9) {
        this.f35286e = true;
        AbstractC6840z.m13036g(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC6840z.m13036g(applicationContext);
        this.f35282a = applicationContext;
        this.f35287f = l9;
        if (u0Var != null) {
            this.f35285d = u0Var;
            this.f35286e = u0Var.f6404c;
            this.f35284c = u0Var.f6403b;
            this.f35288g = u0Var.f6406e;
            Bundle bundle = u0Var.f6405d;
            if (bundle != null) {
                this.f35283b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
