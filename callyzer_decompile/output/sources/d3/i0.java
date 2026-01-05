package d3;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC6747c {

    /* renamed from: a */
    public int f7756a;

    /* renamed from: b */
    public float f7757b;

    /* renamed from: c */
    public float f7758c;

    /* renamed from: d */
    public float f7759d;

    /* renamed from: e */
    public float f7760e;

    /* renamed from: f */
    public float f7761f;

    /* renamed from: g */
    public float f7762g;

    /* renamed from: h */
    public long f7763h;

    /* renamed from: j */
    public long f7764j;

    /* renamed from: k */
    public float f7765k;

    /* renamed from: l */
    public float f7766l;

    /* renamed from: m */
    public float f7767m;

    /* renamed from: n */
    public float f7768n;

    /* renamed from: p */
    public long f7769p;

    /* renamed from: q */
    public l0 f7770q;

    /* renamed from: r */
    public boolean f7771r;

    /* renamed from: s */
    public int f7772s;

    /* renamed from: t */
    public long f7773t;

    /* renamed from: v */
    public InterfaceC6747c f7774v;

    /* renamed from: w */
    public EnumC6757m f7775w;

    /* renamed from: x */
    public h0 f7776x;

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f7774v.mo154O();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f7774v.mo155a();
    }

    /* renamed from: b */
    public final void m5161b(float f6) {
        if (this.f7759d == f6) {
            return;
        }
        this.f7756a |= 4;
        this.f7759d = f6;
    }

    /* renamed from: c */
    public final void m5162c(long j6) {
        if (C1565s.m5187c(this.f7763h, j6)) {
            return;
        }
        this.f7756a |= 64;
        this.f7763h = j6;
    }

    /* renamed from: d */
    public final void m5163d(boolean z6) {
        if (this.f7771r != z6) {
            this.f7756a |= 16384;
            this.f7771r = z6;
        }
    }

    /* renamed from: f */
    public final void m5164f(float f6) {
        if (this.f7765k == f6) {
            return;
        }
        this.f7756a |= 256;
        this.f7765k = f6;
    }

    /* renamed from: h */
    public final void m5165h(float f6) {
        if (this.f7766l == f6) {
            return;
        }
        this.f7756a |= 512;
        this.f7766l = f6;
    }

    /* renamed from: j */
    public final void m5166j(float f6) {
        if (this.f7767m == f6) {
            return;
        }
        this.f7756a |= 1024;
        this.f7767m = f6;
    }

    /* renamed from: k */
    public final void m5167k(float f6) {
        if (this.f7757b == f6) {
            return;
        }
        this.f7756a |= 1;
        this.f7757b = f6;
    }

    /* renamed from: n */
    public final void m5168n(float f6) {
        if (this.f7758c == f6) {
            return;
        }
        this.f7756a |= 2;
        this.f7758c = f6;
    }

    /* renamed from: r */
    public final void m5169r(float f6) {
        if (this.f7762g == f6) {
            return;
        }
        this.f7756a |= 32;
        this.f7762g = f6;
    }

    /* renamed from: s */
    public final void m5170s(l0 l0Var) {
        if (AbstractC4154l.m8918a(this.f7770q, l0Var)) {
            return;
        }
        this.f7756a |= 8192;
        this.f7770q = l0Var;
    }

    /* renamed from: t */
    public final void m5171t(long j6) {
        if (C1565s.m5187c(this.f7764j, j6)) {
            return;
        }
        this.f7756a |= 128;
        this.f7764j = j6;
    }

    /* renamed from: v */
    public final void m5172v(long j6) {
        if (p0.m5180a(this.f7769p, j6)) {
            return;
        }
        this.f7756a |= 4096;
        this.f7769p = j6;
    }

    /* renamed from: x */
    public final void m5173x(float f6) {
        if (this.f7760e == f6) {
            return;
        }
        this.f7756a |= 8;
        this.f7760e = f6;
    }

    /* renamed from: y */
    public final void m5174y(float f6) {
        if (this.f7761f == f6) {
            return;
        }
        this.f7756a |= 16;
        this.f7761f = f6;
    }
}
