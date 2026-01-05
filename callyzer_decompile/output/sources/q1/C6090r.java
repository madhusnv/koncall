package q1;

import ex.InterfaceC2139c;
import java.util.List;
import java.util.Map;
import k1.x0;
import rw.AbstractC6663m;
import s4.InterfaceC6747c;
import t3.k0;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.r */
/* loaded from: classes.dex */
public final class C6090r implements k0 {

    /* renamed from: a */
    public final C6091s f29716a;

    /* renamed from: b */
    public final int f29717b;

    /* renamed from: c */
    public final boolean f29718c;

    /* renamed from: d */
    public final float f29719d;

    /* renamed from: e */
    public final k0 f29720e;

    /* renamed from: f */
    public final float f29721f;

    /* renamed from: g */
    public final boolean f29722g;

    /* renamed from: h */
    public final InterfaceC7266z f29723h;

    /* renamed from: i */
    public final InterfaceC6747c f29724i;

    /* renamed from: j */
    public final long f29725j;

    /* renamed from: k */
    public final Object f29726k;

    /* renamed from: l */
    public final int f29727l;

    /* renamed from: m */
    public final int f29728m;

    /* renamed from: n */
    public final int f29729n;

    /* renamed from: o */
    public final x0 f29730o;

    /* renamed from: p */
    public final int f29731p;

    /* renamed from: q */
    public final int f29732q;

    public C6090r(C6091s c6091s, int i10, boolean z6, float f6, k0 k0Var, float f10, boolean z10, InterfaceC7266z interfaceC7266z, InterfaceC6747c interfaceC6747c, long j6, List list, int i11, int i12, int i13, x0 x0Var, int i14, int i15) {
        this.f29716a = c6091s;
        this.f29717b = i10;
        this.f29718c = z6;
        this.f29719d = f6;
        this.f29720e = k0Var;
        this.f29721f = f10;
        this.f29722g = z10;
        this.f29723h = interfaceC7266z;
        this.f29724i = interfaceC6747c;
        this.f29725j = j6;
        this.f29726k = list;
        this.f29727l = i11;
        this.f29728m = i12;
        this.f29729n = i13;
        this.f29730o = x0Var;
        this.f29731p = i14;
        this.f29732q = i15;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: a */
    public final C6090r m12107a(int i10, boolean z6) {
        C6091s c6091s;
        if (this.f29722g) {
            return null;
        }
        ?? r15 = this.f29726k;
        if (r15.isEmpty() || (c6091s = this.f29716a) == null) {
            return null;
        }
        int i11 = c6091s.f29746n;
        int i12 = this.f29717b - i10;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        C6091s c6091s2 = (C6091s) AbstractC6663m.m12742F(r15);
        C6091s c6091s3 = (C6091s) AbstractC6663m.m12750N(r15);
        if (c6091s2.f29748p || c6091s3.f29748p) {
            return null;
        }
        int i13 = this.f29728m;
        int i14 = this.f29727l;
        if (i10 < 0) {
            if (Math.min((c6091s2.f29744l + c6091s2.f29746n) - i14, (c6091s3.f29744l + c6091s3.f29746n) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - c6091s2.f29744l, i13 - c6091s3.f29744l) <= i10) {
            return null;
        }
        int size = r15.size();
        for (int i15 = 0; i15 < size; i15++) {
            C6091s c6091s4 = (C6091s) r15.get(i15);
            boolean z10 = c6091s4.f29735c;
            int[] iArr = c6091s4.f29750r;
            if (!c6091s4.f29748p) {
                c6091s4.f29744l += i10;
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    int i17 = i16 & 1;
                    if ((z10 && i17 != 0) || (!z10 && i17 == 0)) {
                        iArr[i16] = iArr[i16] + i10;
                    }
                }
                if (z6) {
                    int size2 = c6091s4.f29734b.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        c6091s4.f29743k.m692a(i18, c6091s4.f29741i);
                    }
                }
            }
        }
        return new C6090r(this.f29716a, i12, this.f29718c || i10 > 0, i10, this.f29720e, this.f29721f, this.f29722g, this.f29723h, this.f29724i, this.f29725j, r15, this.f29727l, this.f29728m, this.f29729n, this.f29730o, this.f29731p, this.f29732q);
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        return this.f29720e.mo12108b();
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        return this.f29720e.mo12109c();
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        this.f29720e.mo12110d();
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        return this.f29720e.mo12111e();
    }

    /* renamed from: f */
    public final long m12112f() {
        k0 k0Var = this.f29720e;
        return (k0Var.mo12108b() << 32) | (k0Var.getHeight() & 4294967295L);
    }

    @Override // t3.k0
    public final int getHeight() {
        return this.f29720e.getHeight();
    }
}
