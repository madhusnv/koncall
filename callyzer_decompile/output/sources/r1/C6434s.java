package r1;

import androidx.compose.foundation.lazy.layout.C0248b;
import java.util.List;
import n1.AbstractC4941a;
import s1.InterfaceC6730y;
import s4.C6754j;
import s4.EnumC6757m;
import t3.v0;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.s */
/* loaded from: classes.dex */
public final class C6434s implements InterfaceC6730y {

    /* renamed from: a */
    public final int f31037a;

    /* renamed from: b */
    public final Object f31038b;

    /* renamed from: c */
    public final int f31039c;

    /* renamed from: d */
    public final EnumC6757m f31040d;

    /* renamed from: e */
    public final List f31041e;

    /* renamed from: f */
    public final long f31042f;

    /* renamed from: g */
    public final Object f31043g;

    /* renamed from: h */
    public final C0248b f31044h;

    /* renamed from: i */
    public final int f31045i;

    /* renamed from: j */
    public final int f31046j;

    /* renamed from: k */
    public final int f31047k;

    /* renamed from: l */
    public final int f31048l;

    /* renamed from: m */
    public int f31049m = Integer.MIN_VALUE;

    /* renamed from: n */
    public final long f31050n;

    /* renamed from: o */
    public long f31051o;

    /* renamed from: p */
    public int f31052p;

    /* renamed from: q */
    public int f31053q;

    /* renamed from: r */
    public boolean f31054r;

    public C6434s(int i10, Object obj, int i11, int i12, EnumC6757m enumC6757m, int i13, int i14, List list, long j6, Object obj2, C0248b c0248b, long j10, int i15, int i16) {
        this.f31037a = i10;
        this.f31038b = obj;
        this.f31039c = i11;
        this.f31040d = enumC6757m;
        this.f31041e = list;
        this.f31042f = j6;
        this.f31043g = obj2;
        this.f31044h = c0248b;
        this.f31045i = i15;
        this.f31046j = i16;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            iMax = Math.max(iMax, ((w0) list.get(i17)).f34031b);
        }
        this.f31047k = iMax;
        int i18 = i12 + iMax;
        this.f31048l = i18 >= 0 ? i18 : 0;
        this.f31050n = (this.f31039c << 32) | (iMax & 4294967295L);
        this.f31051o = 0L;
        this.f31052p = -1;
        this.f31053q = -1;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: a */
    public final int mo12113a() {
        return this.f31041e.size();
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: b */
    public final int mo12114b() {
        return this.f31048l;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: c */
    public final boolean mo12115c() {
        return this.f31054r;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: d */
    public final int mo12116d() {
        return this.f31046j;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: e */
    public final Object mo12117e(int i10) {
        return ((w0) this.f31041e.get(i10)).mo13310C();
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: f */
    public final boolean mo12118f() {
        return true;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: g */
    public final void mo12119g() {
        this.f31054r = true;
    }

    @Override // s1.InterfaceC6730y
    public final int getIndex() {
        return this.f31037a;
    }

    @Override // s1.InterfaceC6730y
    public final Object getKey() {
        return this.f31038b;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: h */
    public final void mo12120h(int i10, int i11, int i12) {
        m12430l(i10, 0, i11, i12, -1, -1);
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: i */
    public final long mo12121i(int i10) {
        return this.f31051o;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: j */
    public final int mo12122j() {
        return this.f31045i;
    }

    /* renamed from: k */
    public final void m12429k(v0 v0Var) {
        if (this.f31049m == Integer.MIN_VALUE) {
            AbstractC4941a.m9884a("position() should be called first");
        }
        List list = this.f31041e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = (w0) list.get(i10);
            int i11 = w0Var.f34031b;
            long j6 = this.f31051o;
            this.f31044h.m692a(i10, this.f31038b);
            v0.m13323l(v0Var, w0Var, C6754j.m12942c(j6, this.f31042f));
        }
    }

    /* renamed from: l */
    public final void m12430l(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f31049m = i13;
        if (this.f31040d == EnumC6757m.Rtl) {
            i11 = (i12 - i11) - this.f31039c;
        }
        this.f31051o = (i11 << 32) | (i10 & 4294967295L);
        this.f31052p = i14;
        this.f31053q = i15;
    }
}
