package c0;

import al.C0174b;
import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import b0.C0515g;
import c9.C0919n;
import d0.AbstractC1545b;
import f0.C2169d;
import h0.C2764d;
import i0.C3076g;
import i0.C3082m;
import i0.v2;
import i0.w2;
import i0.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m0.C4614h;
import p013o.i2;
import pg.o7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends b2 {

    /* renamed from: y */
    public static final s0 f5245y = new s0();

    /* renamed from: p */
    public final int f5246p;

    /* renamed from: q */
    public final AtomicReference f5247q;

    /* renamed from: r */
    public final int f5248r;

    /* renamed from: s */
    public final C4614h f5249s;

    /* renamed from: t */
    public i0.b2 f5250t;

    /* renamed from: u */
    public C0919n f5251u;

    /* renamed from: v */
    public C2764d f5252v;

    /* renamed from: w */
    public i0.c2 f5253w;

    /* renamed from: x */
    public final C0174b f5254x;

    public v0(i0.z0 z0Var) {
        super(z0Var);
        this.f5247q = new AtomicReference(null);
        this.f5248r = -1;
        this.f5254x = new C0174b(this);
        i0.z0 z0Var2 = (i0.z0) this.f5052g;
        C3076g c3076g = i0.z0.f16622b;
        if (z0Var2.mo7404i(c3076g)) {
            this.f5246p = ((Integer) z0Var2.mo7406k(c3076g)).intValue();
        } else {
            this.f5246p = 1;
        }
        ((Integer) z0Var2.mo7401e(i0.z0.f16628h, 0)).getClass();
        this.f5249s = new C4614h((t0) z0Var2.mo7401e(i0.z0.f16629j, null));
    }

    /* renamed from: G */
    public static boolean m2232G(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void m2233D(boolean z6) {
        C2764d c2764d;
        o7.m11806a();
        i0.c2 c2Var = this.f5253w;
        if (c2Var != null) {
            c2Var.m7307b();
            this.f5253w = null;
        }
        C0919n c0919n = this.f5251u;
        if (c0919n != null) {
            c0919n.m2655a();
            this.f5251u = null;
        }
        if (!z6 && (c2764d = this.f5252v) != null) {
            c2764d.m6755a();
            this.f5252v = null;
        }
        m2153d().mo7294c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.b2 m2234E(java.lang.String r22, i0.z0 r23, i0.C3082m r24) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.v0.m2234E(java.lang.String, i0.z0, i0.m):i0.b2");
    }

    /* renamed from: F */
    public final int m2235F() {
        int iIntValue;
        synchronized (this.f5247q) {
            iIntValue = this.f5248r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((i0.z0) this.f5052g).mo7401e(i0.z0.f16623c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    @Override // c0.b2
    /* renamed from: f */
    public final w2 mo2155f(boolean z6, z2 z2Var) {
        f5245y.getClass();
        i0.z0 z0Var = s0.f5210a;
        i0.s0 s0VarMo7431a = z2Var.mo7431a(z0Var.mo7421E(), this.f5246p);
        if (z6) {
            s0VarMo7431a = i0.s0.m7414Q(s0VarMo7431a, z0Var);
        }
        if (s0VarMo7431a == null) {
            return null;
        }
        return new i0.z0(i0.o1.m7399a(((C0515g) mo2161l(s0VarMo7431a)).f3583b));
    }

    @Override // c0.b2
    /* renamed from: k */
    public final Set mo2160k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // c0.b2
    /* renamed from: l */
    public final v2 mo2161l(i0.s0 s0Var) {
        return new C0515g(i0.j1.m7350g(s0Var), 2);
    }

    @Override // c0.b2
    /* renamed from: r */
    public final void mo2167r() {
        og.y0.m11055e(m2152c(), "Attached camera cannot be null");
        if (m2235F() == 3) {
            i0.g0 g0VarM2152c = m2152c();
            if ((g0VarM2152c != null ? g0VarM2152c.mo2207c().mo7326i() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // c0.b2
    /* renamed from: s */
    public final void mo2168s() {
        og.u1.m10942a("ImageCapture");
        synchronized (this.f5247q) {
            try {
                if (this.f5247q.get() == null) {
                    m2153d().mo7292a(m2235F());
                }
            } finally {
            }
        }
        m2153d().mo7293b(this.f5249s);
    }

    @Override // c0.b2
    /* renamed from: t */
    public final w2 mo2169t(i0.e0 e0Var, v2 v2Var) {
        Object objMo7406k;
        Object objMo7406k2;
        Object objMo7406k3;
        Object objMo7406k4;
        Object objMo7406k5;
        HashSet<AbstractC1545b> hashSet = this.f5051f;
        boolean z6 = false;
        if (hashSet != null) {
            int i10 = 0;
            for (AbstractC1545b abstractC1545b : hashSet) {
                if (abstractC1545b instanceof C2169d) {
                    i10 = ((C2169d) abstractC1545b).f10036a;
                }
            }
            ((i0.j1) v2Var.mo1513a()).m7352n(i0.z0.f16625e, Integer.valueOf(i10));
        }
        if (e0Var.mo7331n().m5728f(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            i0.s0 s0VarMo1513a = v2Var.mo1513a();
            C3076g c3076g = i0.z0.f16627g;
            Object objMo7406k6 = Boolean.TRUE;
            i0.o1 o1Var = (i0.o1) s0VarMo1513a;
            o1Var.getClass();
            try {
                objMo7406k6 = o1Var.mo7406k(c3076g);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objMo7406k6)) {
                og.u1.m10951j("ImageCapture");
            } else {
                og.u1.m10945d("ImageCapture");
                ((i0.j1) v2Var.mo1513a()).m7352n(i0.z0.f16627g, Boolean.TRUE);
            }
        }
        i0.s0 s0VarMo1513a2 = v2Var.mo1513a();
        Boolean bool2 = Boolean.TRUE;
        C3076g c3076g2 = i0.z0.f16627g;
        Object objMo7406k7 = Boolean.FALSE;
        i0.o1 o1Var2 = (i0.o1) s0VarMo1513a2;
        o1Var2.getClass();
        try {
            objMo7406k7 = o1Var2.mo7406k(c3076g2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objMo7406k7);
        Object objMo7406k8 = null;
        if (zEquals) {
            if (m2152c() != null) {
                m2152c().mo7312i().m7432F();
            }
            try {
                objMo7406k5 = o1Var2.mo7406k(i0.z0.f16624d);
            } catch (IllegalArgumentException unused3) {
                objMo7406k5 = null;
            }
            Integer num = (Integer) objMo7406k5;
            if (num == null || num.intValue() == 256) {
                z6 = true;
            } else {
                og.u1.m10951j("ImageCapture");
            }
            if (!z6) {
                og.u1.m10951j("ImageCapture");
                ((i0.j1) s0VarMo1513a2).m7352n(i0.z0.f16627g, Boolean.FALSE);
            }
        }
        i0.s0 s0VarMo1513a3 = v2Var.mo1513a();
        C3076g c3076g3 = i0.z0.f16624d;
        i0.o1 o1Var3 = (i0.o1) s0VarMo1513a3;
        o1Var3.getClass();
        try {
            objMo7406k = o1Var3.mo7406k(c3076g3);
        } catch (IllegalArgumentException unused4) {
            objMo7406k = null;
        }
        Integer num2 = (Integer) objMo7406k;
        if (num2 != null) {
            if (m2152c() != null) {
                m2152c().mo7312i().m7432F();
            }
            ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, Integer.valueOf(z6 ? 35 : num2.intValue()));
        } else {
            i0.s0 s0VarMo1513a4 = v2Var.mo1513a();
            C3076g c3076g4 = i0.z0.f16625e;
            i0.o1 o1Var4 = (i0.o1) s0VarMo1513a4;
            o1Var4.getClass();
            try {
                objMo7406k2 = o1Var4.mo7406k(c3076g4);
            } catch (IllegalArgumentException unused5) {
                objMo7406k2 = null;
            }
            if (Objects.equals(objMo7406k2, 2)) {
                ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 32);
            } else {
                i0.s0 s0VarMo1513a5 = v2Var.mo1513a();
                C3076g c3076g5 = i0.z0.f16625e;
                i0.o1 o1Var5 = (i0.o1) s0VarMo1513a5;
                o1Var5.getClass();
                try {
                    objMo7406k3 = o1Var5.mo7406k(c3076g5);
                } catch (IllegalArgumentException unused6) {
                    objMo7406k3 = null;
                }
                if (Objects.equals(objMo7406k3, 3)) {
                    ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 32);
                    ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44330e0, 256);
                } else {
                    i0.s0 s0VarMo1513a6 = v2Var.mo1513a();
                    C3076g c3076g6 = i0.z0.f16625e;
                    i0.o1 o1Var6 = (i0.o1) s0VarMo1513a6;
                    o1Var6.getClass();
                    try {
                        objMo7406k4 = o1Var6.mo7406k(c3076g6);
                    } catch (IllegalArgumentException unused7) {
                        objMo7406k4 = null;
                    }
                    if (Objects.equals(objMo7406k4, 1)) {
                        ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 4101);
                        ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44331f0, a0.f5034c);
                    } else if (z6) {
                        ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 35);
                    } else {
                        i0.s0 s0VarMo1513a7 = v2Var.mo1513a();
                        C3076g c3076g7 = i0.b1.f44339o0;
                        i0.o1 o1Var7 = (i0.o1) s0VarMo1513a7;
                        o1Var7.getClass();
                        try {
                            objMo7406k8 = o1Var7.mo7406k(c3076g7);
                        } catch (IllegalArgumentException unused8) {
                        }
                        List list = (List) objMo7406k8;
                        if (list == null) {
                            ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 256);
                        } else if (m2232G(list, 256)) {
                            ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 256);
                        } else if (m2232G(list, 35)) {
                            ((i0.j1) v2Var.mo1513a()).m7352n(i0.a1.f44329d0, 35);
                        }
                    }
                }
            }
        }
        return v2Var.mo1514b();
    }

    public final String toString() {
        return "ImageCapture:".concat(m2156g());
    }

    @Override // c0.b2
    /* renamed from: v */
    public final void mo2171v() {
        C4614h c4614h = this.f5249s;
        c4614h.m9499b();
        c4614h.m9498a();
        C2764d c2764d = this.f5252v;
        if (c2764d != null) {
            c2764d.m6755a();
        }
    }

    @Override // c0.b2
    /* renamed from: w */
    public final C3082m mo2172w(i0.s0 s0Var) {
        this.f5250t.m7303b(s0Var);
        Object[] objArr = {this.f5250t.m7305d()};
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
        og.u1.m10942a("ImageCapture");
        i0.b2 b2VarM2234E = m2234E(m2154e(), (i0.z0) this.f5052g, c3082m);
        this.f5250t = b2VarM2234E;
        Object[] objArr = {b2VarM2234E.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
        m2164o();
        return c3082m;
    }

    @Override // c0.b2
    /* renamed from: y */
    public final void mo2174y() {
        C4614h c4614h = this.f5249s;
        c4614h.m9499b();
        c4614h.m9498a();
        C2764d c2764d = this.f5252v;
        if (c2764d != null) {
            c2764d.m6755a();
        }
        m2233D(false);
        m2153d().mo7293b(null);
    }
}
