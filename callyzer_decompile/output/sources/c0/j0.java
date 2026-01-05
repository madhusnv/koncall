package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import b0.C0515g;
import c9.C0917l;
import i0.C3082m;
import i0.v2;
import i0.w2;
import i0.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.InterfaceC4618l;
import p013o.i2;
import pg.o7;
import pg.t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends b2 {

    /* renamed from: y */
    public static final h0 f5116y = new h0();

    /* renamed from: p */
    public final Object f5117p;

    /* renamed from: q */
    public m0 f5118q;

    /* renamed from: r */
    public Executor f5119r;

    /* renamed from: s */
    public C0917l f5120s;

    /* renamed from: t */
    public Rect f5121t;

    /* renamed from: u */
    public Matrix f5122u;

    /* renamed from: v */
    public i0.b2 f5123v;

    /* renamed from: w */
    public u1 f5124w;

    /* renamed from: x */
    public i0.c2 f5125x;

    public j0(i0.y0 y0Var) {
        super(y0Var);
        this.f5117p = new Object();
    }

    @Override // c0.b2
    /* renamed from: A */
    public final void mo2147A(Rect rect) {
        this.f5055j = rect;
        synchronized (this.f5117p) {
            try {
                m0 m0Var = this.f5118q;
                if (m0Var != null) {
                    m0Var.m2219j(rect);
                }
                this.f5121t = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.b2 m2203D(i0.y0 r18, i0.C3082m r19) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.j0.m2203D(i0.y0, i0.m):i0.b2");
    }

    /* renamed from: E */
    public final int m2204E() {
        return ((Integer) ((i0.y0) this.f5052g).mo7401e(i0.y0.f16618e, 1)).intValue();
    }

    /* renamed from: F */
    public final void m2205F() {
        C0917l c0917l;
        synchronized (this.f5117p) {
            try {
                i0.y0 y0Var = (i0.y0) this.f5052g;
                if (((Integer) y0Var.mo7401e(i0.y0.f16615b, 0)).intValue() == 1) {
                    this.f5118q = new n0();
                } else {
                    this.f5118q = new q0((Executor) y0Var.mo7401e(InterfaceC4618l.O0, t8.m11873b()));
                }
                this.f5118q.f5160d = m2204E();
                this.f5118q.f5161e = ((Boolean) ((i0.y0) this.f5052g).mo7401e(i0.y0.f16620g, Boolean.FALSE)).booleanValue();
                i0.g0 g0VarM2152c = m2152c();
                Boolean bool = (Boolean) ((i0.y0) this.f5052g).mo7401e(i0.y0.f16619f, null);
                boolean zM5728f = g0VarM2152c != null ? g0VarM2152c.mo7319q().mo7331n().m5728f(OnePixelShiftQuirk.class) : false;
                m0 m0Var = this.f5118q;
                if (bool != null) {
                    zM5728f = bool.booleanValue();
                }
                m0Var.f5162f = zM5728f;
                if (g0VarM2152c != null) {
                    this.f5118q.f5158b = m2157h(g0VarM2152c, false);
                }
                Rect rect = this.f5121t;
                if (rect != null) {
                    this.f5118q.m2219j(rect);
                }
                Matrix matrix = this.f5122u;
                if (matrix != null) {
                    this.f5118q.m2218i(matrix);
                }
                Executor executor = this.f5119r;
                if (executor != null && (c0917l = this.f5120s) != null) {
                    m0 m0Var2 = this.f5118q;
                    synchronized (m0Var2.f5176w) {
                        m0Var2.f5157a = c0917l;
                        m0Var2.f5163g = executor;
                    }
                }
            } finally {
            }
        }
    }

    @Override // c0.b2
    /* renamed from: f */
    public final w2 mo2155f(boolean z6, z2 z2Var) {
        f5116y.getClass();
        i0.y0 y0Var = h0.f5104a;
        i0.s0 s0VarMo7431a = z2Var.mo7431a(y0Var.mo7421E(), 1);
        if (z6) {
            s0VarMo7431a = i0.s0.m7414Q(s0VarMo7431a, y0Var);
        }
        if (s0VarMo7431a == null) {
            return null;
        }
        return new i0.y0(i0.o1.m7399a(((C0515g) mo2161l(s0VarMo7431a)).f3583b));
    }

    @Override // c0.b2
    /* renamed from: l */
    public final v2 mo2161l(i0.s0 s0Var) {
        return new C0515g(i0.j1.m7350g(s0Var), 1);
    }

    @Override // c0.b2
    /* renamed from: t */
    public final w2 mo2169t(i0.e0 e0Var, v2 v2Var) {
        synchronized (this.f5117p) {
        }
        return v2Var.mo1514b();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(m2156g());
    }

    @Override // c0.b2
    /* renamed from: w */
    public final C3082m mo2172w(i0.s0 s0Var) {
        this.f5123v.m7303b(s0Var);
        Object[] objArr = {this.f5123v.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
        i2 i2VarM7363b = this.f5053h.m7363b();
        i2VarM7363b.f25543f = s0Var;
        return i2VarM7363b.m10246c();
    }

    @Override // c0.b2
    /* renamed from: x */
    public final C3082m mo2173x(C3082m c3082m, C3082m c3082m2) {
        c3082m.toString();
        Objects.toString(c3082m2);
        og.u1.m10942a("ImageAnalysis");
        i0.y0 y0Var = (i0.y0) this.f5052g;
        m2154e();
        i0.b2 b2VarM2203D = m2203D(y0Var, c3082m);
        this.f5123v = b2VarM2203D;
        Object[] objArr = {b2VarM2203D.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
        return c3082m;
    }

    @Override // c0.b2
    /* renamed from: y */
    public final void mo2174y() {
        o7.m11806a();
        i0.c2 c2Var = this.f5125x;
        if (c2Var != null) {
            c2Var.m7307b();
            this.f5125x = null;
        }
        u1 u1Var = this.f5124w;
        if (u1Var != null) {
            u1Var.mo7416a();
            this.f5124w = null;
        }
        synchronized (this.f5117p) {
            m0 m0Var = this.f5118q;
            m0Var.f5177x = false;
            m0Var.mo2213c();
            this.f5118q = null;
        }
    }

    @Override // c0.b2
    /* renamed from: z */
    public final void mo2175z(Matrix matrix) {
        super.mo2175z(matrix);
        synchronized (this.f5117p) {
            try {
                m0 m0Var = this.f5118q;
                if (m0Var != null) {
                    m0Var.m2218i(matrix);
                }
                this.f5122u = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
