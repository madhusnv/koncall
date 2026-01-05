package t1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.List;
import java.util.Map;
import k1.x0;
import l1.InterfaceC4326o;
import rw.AbstractC6663m;
import rw.C6668r;
import t3.k0;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.r */
/* loaded from: classes.dex */
public final class C6993r implements k0 {

    /* renamed from: a */
    public final List f33851a;

    /* renamed from: b */
    public final int f33852b;

    /* renamed from: c */
    public final int f33853c;

    /* renamed from: d */
    public final int f33854d;

    /* renamed from: e */
    public final x0 f33855e;

    /* renamed from: f */
    public final int f33856f;

    /* renamed from: g */
    public final int f33857g;

    /* renamed from: h */
    public final int f33858h;

    /* renamed from: i */
    public final C6982g f33859i;

    /* renamed from: j */
    public final C6982g f33860j;

    /* renamed from: k */
    public final float f33861k;

    /* renamed from: l */
    public final int f33862l;

    /* renamed from: m */
    public final boolean f33863m;

    /* renamed from: n */
    public final InterfaceC4326o f33864n;

    /* renamed from: o */
    public final k0 f33865o;

    /* renamed from: p */
    public final boolean f33866p;

    /* renamed from: q */
    public final List f33867q;

    /* renamed from: r */
    public final List f33868r;

    /* renamed from: s */
    public final InterfaceC7266z f33869s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6993r(int i10, int i11, int i12, x0 x0Var, int i13, int i14, int i15, InterfaceC4326o interfaceC4326o, k0 k0Var, InterfaceC7266z interfaceC7266z) {
        C6668r c6668r = C6668r.f31943a;
        this(c6668r, i10, i11, i12, x0Var, i13, i14, i15, null, null, DefinitionKt.NO_Float_VALUE, 0, false, interfaceC4326o, k0Var, false, c6668r, c6668r, interfaceC7266z);
    }

    /* renamed from: a */
    public final C6993r m13255a(int i10) {
        int i11;
        int i12 = this.f33852b + this.f33853c;
        if (this.f33866p) {
            return null;
        }
        List list = this.f33851a;
        if (list.isEmpty() || this.f33859i == null || (i11 = this.f33862l - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f6 = this.f33861k - (i12 != 0 ? i10 / i12 : DefinitionKt.NO_Float_VALUE);
        if (this.f33860j == null || f6 >= 0.5f || f6 <= -0.5f) {
            return null;
        }
        C6982g c6982g = (C6982g) AbstractC6663m.m12742F(list);
        C6982g c6982g2 = (C6982g) AbstractC6663m.m12750N(list);
        int i13 = this.f33857g;
        int i14 = this.f33856f;
        if (i10 < 0) {
            if (Math.min((c6982g.f33800l + i12) - i14, (c6982g2.f33800l + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - c6982g.f33800l, i13 - c6982g2.f33800l) <= i10) {
            return null;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((C6982g) list.get(i15)).m13253a(i10);
        }
        List list2 = this.f33867q;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((C6982g) list2.get(i16)).m13253a(i10);
        }
        List list3 = this.f33868r;
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            ((C6982g) list3.get(i17)).m13253a(i10);
        }
        return new C6993r(this.f33851a, this.f33852b, this.f33853c, this.f33854d, this.f33855e, this.f33856f, this.f33857g, this.f33858h, this.f33859i, this.f33860j, f6, i11, this.f33863m || i10 > 0, this.f33864n, this.f33865o, this.f33866p, this.f33867q, this.f33868r, this.f33869s);
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        return this.f33865o.mo12108b();
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        return this.f33865o.mo12109c();
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        this.f33865o.mo12110d();
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        return this.f33865o.mo12111e();
    }

    /* renamed from: f */
    public final long m13256f() {
        k0 k0Var = this.f33865o;
        return (k0Var.mo12108b() << 32) | (k0Var.getHeight() & 4294967295L);
    }

    @Override // t3.k0
    public final int getHeight() {
        return this.f33865o.getHeight();
    }

    public C6993r(List list, int i10, int i11, int i12, x0 x0Var, int i13, int i14, int i15, C6982g c6982g, C6982g c6982g2, float f6, int i16, boolean z6, InterfaceC4326o interfaceC4326o, k0 k0Var, boolean z10, List list2, List list3, InterfaceC7266z interfaceC7266z) {
        this.f33851a = list;
        this.f33852b = i10;
        this.f33853c = i11;
        this.f33854d = i12;
        this.f33855e = x0Var;
        this.f33856f = i13;
        this.f33857g = i14;
        this.f33858h = i15;
        this.f33859i = c6982g;
        this.f33860j = c6982g2;
        this.f33861k = f6;
        this.f33862l = i16;
        this.f33863m = z6;
        this.f33864n = interfaceC4326o;
        this.f33865o = k0Var;
        this.f33866p = z10;
        this.f33867q = list2;
        this.f33868r = list3;
        this.f33869s = interfaceC7266z;
    }
}
