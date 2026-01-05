package iz;

import eb.i3;
import nz.C5197h;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a */
    public x0 f17899a;

    /* renamed from: b */
    public f0 f17900b;

    /* renamed from: d */
    public String f17902d;

    /* renamed from: e */
    public C3388u f17903e;

    /* renamed from: h */
    public k0 f17906h;

    /* renamed from: i */
    public k0 f17907i;

    /* renamed from: j */
    public k0 f17908j;

    /* renamed from: k */
    public long f17909k;

    /* renamed from: l */
    public long f17910l;

    /* renamed from: m */
    public C5197h f17911m;

    /* renamed from: c */
    public int f17901c = -1;

    /* renamed from: g */
    public n0 f17905g = n0.f17961b;

    /* renamed from: n */
    public r0 f17912n = r0.J0;

    /* renamed from: f */
    public i3 f17904f = new i3(2);

    /* renamed from: b */
    public static void m7731b(String str, k0 k0Var) {
        if (k0Var != null) {
            if (k0Var.f17924h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (k0Var.f17925j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (k0Var.f17926k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: a */
    public final k0 m7732a() {
        int i10 = this.f17901c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f17901c).toString());
        }
        x0 x0Var = this.f17899a;
        if (x0Var == null) {
            throw new IllegalStateException("request == null");
        }
        f0 f0Var = this.f17900b;
        if (f0Var == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f17902d;
        if (str != null) {
            return new k0(x0Var, f0Var, str, i10, this.f17903e, this.f17904f.m5727e(), this.f17905g, this.f17906h, this.f17907i, this.f17908j, this.f17909k, this.f17910l, this.f17911m, this.f17912n);
        }
        throw new IllegalStateException("message == null");
    }
}
