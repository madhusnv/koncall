package pg;

import al.AbstractC0175c;
import al.C0177e;
import al.C0181i;
import android.content.Context;
import dg.C1716e;
import java.util.HashMap;
import k0.CallableC3892b;
import ng.CallableC5065p;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ka {

    /* renamed from: j */
    public static ta f28938j;

    /* renamed from: k */
    public static final og.j0 f28939k;

    /* renamed from: a */
    public final String f28940a;

    /* renamed from: b */
    public final String f28941b;

    /* renamed from: c */
    public final ja f28942c;

    /* renamed from: d */
    public final C0181i f28943d;

    /* renamed from: e */
    public final C8656m f28944e;

    /* renamed from: f */
    public final C8656m f28945f;

    /* renamed from: g */
    public final String f28946g;

    /* renamed from: h */
    public final int f28947h;

    /* renamed from: i */
    public final HashMap f28948i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f28939k = new og.j0(1, objArr);
    }

    public ka(Context context, C0181i c0181i, ja jaVar) {
        new HashMap();
        this.f28940a = context.getPackageName();
        this.f28941b = AbstractC0175c.m400a(context);
        this.f28943d = c0181i;
        this.f28942c = jaVar;
        oa.m11812b();
        this.f28946g = "vision-common";
        C0177e c0177eM401a = C0177e.m401a();
        CallableC3892b callableC3892b = new CallableC3892b(4, this);
        c0177eM401a.getClass();
        this.f28944e = C0177e.m402b(callableC3892b);
        C0177e c0177eM401a2 = C0177e.m401a();
        c0181i.getClass();
        CallableC5065p callableC5065p = new CallableC5065p(c0181i, 2);
        c0177eM401a2.getClass();
        this.f28945f = C0177e.m402b(callableC5065p);
        og.j0 j0Var = f28939k;
        this.f28947h = j0Var.containsKey("vision-common") ? C1716e.m5405d(context, (String) j0Var.get("vision-common"), false) : -1;
    }
}
