package ng;

import al.AbstractC0175c;
import al.C0177e;
import al.C0181i;
import android.content.Context;
import dg.C1716e;
import java.util.HashMap;
import java.util.Objects;
import k0.CallableC3892b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.q */
/* loaded from: classes.dex */
public final class C5066q {

    /* renamed from: b */
    public static final C5061l f24858b = C5061l.m9995b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* renamed from: a */
    public final String f24859a;

    public C5066q(Context context, C0181i c0181i) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC0175c.m400a(context);
        synchronized (C5070u.class) {
            if (C5070u.f24863b == null) {
                C5070u.f24863b = new C5070u(0);
            }
        }
        this.f24859a = "common";
        C0177e c0177eM401a = C0177e.m401a();
        CallableC3892b callableC3892b = new CallableC3892b(2, this);
        c0177eM401a.getClass();
        C0177e.m402b(callableC3892b);
        C0177e c0177eM401a2 = C0177e.m401a();
        Objects.requireNonNull(c0181i);
        CallableC5065p callableC5065p = new CallableC5065p(c0181i, 0);
        c0177eM401a2.getClass();
        C0177e.m402b(callableC5065p);
        C5061l c5061l = f24858b;
        if (c5061l.containsKey("common")) {
            C1716e.m5405d(context, (String) c5061l.get("common"), false);
        }
    }
}
