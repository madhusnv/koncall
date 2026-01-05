package og;

import al.AbstractC0175c;
import al.C0177e;
import al.C0181i;
import al.EnumC0185m;
import android.content.Context;
import android.os.SystemClock;
import dg.C1716e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.CallableC3892b;
import ng.CallableC5065p;
import sf.C6824j;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class yg {

    /* renamed from: k */
    public static e0 f26967k;

    /* renamed from: l */
    public static final j0 f26968l;

    /* renamed from: a */
    public final String f26969a;

    /* renamed from: b */
    public final String f26970b;

    /* renamed from: c */
    public final ug f26971c;

    /* renamed from: d */
    public final C0181i f26972d;

    /* renamed from: e */
    public final C8656m f26973e;

    /* renamed from: f */
    public final C8656m f26974f;

    /* renamed from: g */
    public final String f26975g;

    /* renamed from: h */
    public final int f26976h;

    /* renamed from: i */
    public final HashMap f26977i = new HashMap();

    /* renamed from: j */
    public final HashMap f26978j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        f26968l = new j0(0, objArr);
    }

    public yg(Context context, C0181i c0181i, ug ugVar, String str) {
        this.f26969a = context.getPackageName();
        this.f26970b = AbstractC0175c.m400a(context);
        this.f26972d = c0181i;
        this.f26971c = ugVar;
        ch.m10592b();
        this.f26975g = str;
        C0177e c0177eM401a = C0177e.m401a();
        CallableC3892b callableC3892b = new CallableC3892b(3, this);
        c0177eM401a.getClass();
        this.f26973e = C0177e.m402b(callableC3892b);
        C0177e c0177eM401a2 = C0177e.m401a();
        Objects.requireNonNull(c0181i);
        CallableC5065p callableC5065p = new CallableC5065p(c0181i, 1);
        c0177eM401a2.getClass();
        this.f26974f = C0177e.m402b(callableC5065p);
        j0 j0Var = f26968l;
        this.f26976h = j0Var.containsKey(str) ? C1716e.m5405d(context, (String) j0Var.get(str), false) : -1;
    }

    /* renamed from: a */
    public static long m11074a(ArrayList arrayList, double d2) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d2 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    /* renamed from: b */
    public final void m11075b(xg xgVar, fc fcVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m11077d(fcVar, jElapsedRealtime)) {
            this.f26977i.put(fcVar, Long.valueOf(jElapsedRealtime));
            EnumC0185m.INSTANCE.execute(new c6.b1(this, xgVar.zza(), fcVar, m11076c(), 2));
        }
    }

    /* renamed from: c */
    public final String m11076c() {
        C8656m c8656m = this.f26973e;
        if (c8656m.m15985l()) {
            return (String) c8656m.m15983j();
        }
        return C6824j.f32444c.m13016a(this.f26975g);
    }

    /* renamed from: d */
    public final boolean m11077d(fc fcVar, long j6) {
        HashMap map = this.f26977i;
        return map.get(fcVar) == null || j6 - ((Long) map.get(fcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
