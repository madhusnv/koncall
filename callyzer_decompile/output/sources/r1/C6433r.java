package r1;

import ex.InterfaceC2139c;
import java.util.List;
import java.util.Map;
import k1.x0;
import kotlin.jvm.internal.AbstractC4155m;
import pg.ca;
import rw.AbstractC6663m;
import s4.InterfaceC6747c;
import t3.k0;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.r */
/* loaded from: classes.dex */
public final class C6433r implements k0 {

    /* renamed from: a */
    public final C6435t f31019a;

    /* renamed from: b */
    public final int f31020b;

    /* renamed from: c */
    public final boolean f31021c;

    /* renamed from: d */
    public final float f31022d;

    /* renamed from: e */
    public final k0 f31023e;

    /* renamed from: f */
    public final float f31024f;

    /* renamed from: g */
    public final boolean f31025g;

    /* renamed from: h */
    public final InterfaceC7266z f31026h;

    /* renamed from: i */
    public final InterfaceC6747c f31027i;

    /* renamed from: j */
    public final int f31028j;

    /* renamed from: k */
    public final AbstractC4155m f31029k;

    /* renamed from: l */
    public final Object f31030l;

    /* renamed from: m */
    public final int f31031m;

    /* renamed from: n */
    public final int f31032n;

    /* renamed from: o */
    public final int f31033o;

    /* renamed from: p */
    public final x0 f31034p;

    /* renamed from: q */
    public final int f31035q;

    /* renamed from: r */
    public final int f31036r;

    /* JADX WARN: Multi-variable type inference failed */
    public C6433r(C6435t c6435t, int i10, boolean z6, float f6, k0 k0Var, float f10, boolean z10, InterfaceC7266z interfaceC7266z, InterfaceC6747c interfaceC6747c, int i11, InterfaceC2139c interfaceC2139c, List list, int i12, int i13, int i14, x0 x0Var, int i15, int i16) {
        this.f31019a = c6435t;
        this.f31020b = i10;
        this.f31021c = z6;
        this.f31022d = f6;
        this.f31023e = k0Var;
        this.f31024f = f10;
        this.f31025g = z10;
        this.f31026h = interfaceC7266z;
        this.f31027i = interfaceC6747c;
        this.f31028j = i11;
        this.f31029k = (AbstractC4155m) interfaceC2139c;
        this.f31030l = list;
        this.f31031m = i12;
        this.f31032n = i13;
        this.f31033o = i14;
        this.f31034p = x0Var;
        this.f31035q = i15;
        this.f31036r = i16;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: a */
    public final C6433r m12427a(int i10, boolean z6) {
        C6435t c6435t;
        if (this.f31025g) {
            return null;
        }
        ?? r15 = this.f31030l;
        if (r15.isEmpty() || (c6435t = this.f31019a) == null) {
            return null;
        }
        int i11 = c6435t.f31061g;
        int i12 = this.f31020b - i10;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        C6434s c6434s = (C6434s) AbstractC6663m.m12742F(r15);
        C6434s c6434s2 = (C6434s) AbstractC6663m.m12750N(r15);
        if (c6434s.f31054r || c6434s2.f31054r) {
            return null;
        }
        int i13 = this.f31032n;
        int i14 = this.f31031m;
        x0 x0Var = this.f31034p;
        if (i10 < 0) {
            if (Math.min((ca.m11578b(c6434s, x0Var) + c6434s.f31048l) - i14, (ca.m11578b(c6434s2, x0Var) + c6434s2.f31048l) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - ca.m11578b(c6434s, x0Var), i13 - ca.m11578b(c6434s2, x0Var)) <= i10) {
            return null;
        }
        int size = r15.size();
        for (int i15 = 0; i15 < size; i15++) {
            C6434s c6434s3 = (C6434s) r15.get(i15);
            c6434s3.getClass();
            if (!c6434s3.f31054r) {
                long j6 = c6434s3.f31051o;
                c6434s3.f31051o = (((int) (j6 >> 32)) << 32) | ((((int) (j6 & 4294967295L)) + i10) & 4294967295L);
                if (z6) {
                    int size2 = c6434s3.f31041e.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        c6434s3.f31044h.m692a(i16, c6434s3.f31038b);
                    }
                }
            }
        }
        return new C6433r(this.f31019a, i12, this.f31021c || i10 > 0, i10, this.f31023e, this.f31024f, this.f31025g, this.f31026h, this.f31027i, this.f31028j, this.f31029k, r15, this.f31031m, this.f31032n, this.f31033o, this.f31034p, this.f31035q, this.f31036r);
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        return this.f31023e.mo12108b();
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        return this.f31023e.mo12109c();
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        this.f31023e.mo12110d();
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        return this.f31023e.mo12111e();
    }

    /* renamed from: f */
    public final long m12428f() {
        k0 k0Var = this.f31023e;
        return (k0Var.mo12108b() << 32) | (k0Var.getHeight() & 4294967295L);
    }

    @Override // t3.k0
    public final int getHeight() {
        return this.f31023e.getHeight();
    }
}
