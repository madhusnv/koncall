package m0;

import a0.C0001a;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import b0.C0515g;
import c0.C0823p;
import c0.C0830w;
import c0.C0833z;
import c0.InterfaceC0818k;
import c0.b2;
import c0.h1;
import c0.k1;
import c0.v0;
import c9.C0908c;
import c9.C0927v;
import com.skydoves.balloon.internals.DefinitionKt;
import e0.C1894c;
import i0.C3071b;
import i0.C3072c;
import i0.C3073d;
import i0.C3076g;
import i0.C3077h;
import i0.C3082m;
import i0.InterfaceC3094y;
import i0.a0;
import i0.a1;
import i0.b1;
import i0.e0;
import i0.g0;
import i0.g2;
import i0.j1;
import i0.o1;
import i0.r0;
import i0.r1;
import i0.s0;
import i0.w2;
import i0.y2;
import i0.z0;
import i0.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.u1;
import og.y0;
import pg.t8;
import u0.C7294d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.f */
/* loaded from: classes.dex */
public final class C4612f implements InterfaceC0818k {

    /* renamed from: a */
    public final C3073d f22834a;

    /* renamed from: b */
    public final C3073d f22835b;

    /* renamed from: c */
    public final z2 f22836c;

    /* renamed from: d */
    public final C0823p f22837d;

    /* renamed from: g */
    public final C0001a f22840g;

    /* renamed from: k */
    public final InterfaceC3094y f22843k;

    /* renamed from: p */
    public b2 f22847p;

    /* renamed from: q */
    public C7294d f22848q;

    /* renamed from: r */
    public final C0833z f22849r;

    /* renamed from: s */
    public final C0833z f22850s;

    /* renamed from: v */
    public final C0908c f22852v;

    /* renamed from: e */
    public final ArrayList f22838e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f22839f = new ArrayList();

    /* renamed from: h */
    public List f22841h = Collections.EMPTY_LIST;

    /* renamed from: j */
    public Range f22842j = C3082m.f16521h;

    /* renamed from: l */
    public final Object f22844l = new Object();

    /* renamed from: m */
    public boolean f22845m = true;

    /* renamed from: n */
    public s0 f22846n = null;

    /* renamed from: t */
    public final C0927v f22851t = new C0927v(9);

    public C4612f(g0 g0Var, g0 g0Var2, C3072c c3072c, C3072c c3072c2, C0833z c0833z, C0833z c0833z2, C0001a c0001a, C0908c c0908c, z2 z2Var) {
        InterfaceC3094y interfaceC3094y = c3072c.f16436c;
        this.f22843k = interfaceC3094y;
        this.f22834a = new C3073d(g0Var, c3072c);
        if (g0Var2 == null || c3072c2 == null) {
            this.f22835b = null;
        } else {
            this.f22835b = new C3073d(g0Var2, c3072c2);
        }
        this.f22849r = c0833z;
        this.f22850s = c0833z2;
        this.f22840g = c0001a;
        this.f22836c = z2Var;
        String strMo7323e = c3072c2 != null ? c3072c2.f16612a.mo7323e() : null;
        C3077h c3077h = ((a0) interfaceC3094y).f16423a;
        AbstractC4154l.m8922e(c3077h, "getCompatibilityId(...)");
        String strMo7323e2 = c3072c.f16612a.mo7323e();
        AbstractC4154l.m8922e(strMo7323e2, "getCameraId(...)");
        ArrayList arrayListM10835j = pe.m10835j(strMo7323e2);
        if (strMo7323e != null) {
            arrayListM10835j.add(strMo7323e);
        }
        this.f22837d = new C0823p(arrayListM10835j, c3077h);
        this.f22852v = c0908c;
    }

    /* renamed from: B */
    public static boolean m9481B(b2 b2Var) {
        if (b2Var != null) {
            if (b2Var.f5052g.mo7404i(w2.C0)) {
                return b2Var.f5052g.mo7421E() == y2.VIDEO_CAPTURE;
            }
            b2Var.toString();
        }
        return false;
    }

    /* renamed from: D */
    public static void m9482D(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            b2 b2Var = (b2) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                b2Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            b2Var.f5051f = hashSet;
        }
    }

    /* renamed from: E */
    public static ArrayList m9483E(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((b2) obj).getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        return arrayList2;
    }

    /* renamed from: g */
    public static HashMap m9484g(LinkedHashSet linkedHashSet, C1894c c1894c) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            map.put(b2Var, b2Var.f5051f);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = c1894c != null ? c1894c.f8915a : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            b2Var.f5051f = hashSet;
        }
        return map;
    }

    /* renamed from: t */
    public static Matrix m9485t(Rect rect, Size size) {
        y0.m11051a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: u */
    public static v0 m9486u() {
        Object objMo7406k;
        Object objMo7406k2;
        Object objMo7406k3;
        Object objMo7406k4;
        Object objMo7406k5;
        C0515g c0515g = new C0515g(2);
        C3076g c3076g = InterfaceC4617k.M0;
        j1 j1Var = c0515g.f3583b;
        j1Var.m7352n(c3076g, "ImageCapture-Extra");
        C3076g c3076g2 = z0.f16624d;
        j1Var.getClass();
        Object objMo7406k6 = null;
        try {
            objMo7406k = j1Var.mo7406k(c3076g2);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        Integer num = (Integer) objMo7406k;
        if (num != null) {
            j1Var.m7352n(a1.f44329d0, num);
        } else {
            c0.s0 s0Var = v0.f5245y;
            try {
                objMo7406k2 = j1Var.mo7406k(z0.f16625e);
            } catch (IllegalArgumentException unused2) {
                objMo7406k2 = null;
            }
            if (Objects.equals(objMo7406k2, 2)) {
                j1Var.m7352n(a1.f44329d0, 32);
            } else {
                try {
                    objMo7406k3 = j1Var.mo7406k(z0.f16625e);
                } catch (IllegalArgumentException unused3) {
                    objMo7406k3 = null;
                }
                if (Objects.equals(objMo7406k3, 3)) {
                    j1Var.m7352n(a1.f44329d0, 32);
                    j1Var.m7352n(a1.f44330e0, 256);
                } else {
                    try {
                        objMo7406k4 = j1Var.mo7406k(z0.f16625e);
                    } catch (IllegalArgumentException unused4) {
                        objMo7406k4 = null;
                    }
                    if (Objects.equals(objMo7406k4, 1)) {
                        j1Var.m7352n(a1.f44329d0, 4101);
                        j1Var.m7352n(a1.f44331f0, c0.a0.f5034c);
                    } else {
                        j1Var.m7352n(a1.f44329d0, 256);
                    }
                }
            }
        }
        z0 z0Var = new z0(o1.m7399a(j1Var));
        b1.m7299K(z0Var);
        v0 v0Var = new v0(z0Var);
        try {
            objMo7406k5 = j1Var.mo7406k(b1.f44336l0);
        } catch (IllegalArgumentException unused5) {
            objMo7406k5 = null;
        }
        Size size = (Size) objMo7406k5;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C3076g c3076g3 = InterfaceC4613g.L0;
        Object objM11874c = t8.m11874c();
        try {
            objM11874c = j1Var.mo7406k(c3076g3);
        } catch (IllegalArgumentException unused6) {
        }
        y0.m11055e((Executor) objM11874c, "The IO executor can't be null");
        C3076g c3076g4 = z0.f16623c;
        if (j1Var.f16550a.containsKey(c3076g4)) {
            Integer num2 = (Integer) j1Var.mo7406k(c3076g4);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objMo7406k6 = j1Var.mo7406k(z0.f16629j);
                } catch (IllegalArgumentException unused7) {
                }
                if (objMo7406k6 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return v0Var;
    }

    /* renamed from: x */
    public static HashMap m9487x(ArrayList arrayList, z2 z2Var, z2 z2Var2, Range range) {
        w2 w2VarMo2155f;
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            if (b2Var instanceof C7294d) {
                C7294d c7294d = (C7294d) b2Var;
                r1 r1Var = new r1(o1.m7399a(new h1(0).f5106b));
                b1.m7299K(r1Var);
                k1 k1Var = new k1(r1Var);
                k1Var.f5136q = k1.f5134x;
                w2 w2VarMo2155f2 = k1Var.mo2155f(false, z2Var);
                if (w2VarMo2155f2 == null) {
                    w2VarMo2155f = null;
                } else {
                    j1 j1VarM7350g = j1.m7350g(w2VarMo2155f2);
                    j1VarM7350g.f16550a.remove(InterfaceC4617k.N0);
                    w2VarMo2155f = ((C0830w) c7294d.mo2161l(j1VarM7350g)).mo1514b();
                }
            } else {
                w2VarMo2155f = b2Var.mo2155f(false, z2Var);
            }
            w2 w2VarMo2155f3 = b2Var.mo2155f(true, z2Var2);
            j1 j1VarM7350g2 = w2VarMo2155f3 != null ? j1.m7350g(w2VarMo2155f3) : j1.m7349b();
            j1VarM7350g2.m7352n(w2.f44348x0, 0);
            if (!C3082m.f16521h.equals(range)) {
                j1VarM7350g2.m7351m(w2.f44349y0, r0.HIGH_PRIORITY_REQUIRED, range);
                j1VarM7350g2.m7352n(w2.f44350z0, Boolean.TRUE);
            }
            w2 w2VarMo1514b = b2Var.mo2161l(j1VarM7350g2).mo1514b();
            C4611e c4611e = new C4611e();
            c4611e.f22832a = w2VarMo2155f;
            c4611e.f22833b = w2VarMo1514b;
            map.put(b2Var, c4611e);
        }
        return map;
    }

    /* renamed from: A */
    public final void m9488A() {
        synchronized (this.f22844l) {
            this.f22843k.m7432F();
        }
    }

    /* renamed from: C */
    public final void m9489C(ArrayList arrayList) {
        synchronized (this.f22844l) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((b2) obj).f5051f = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f22838e);
            linkedHashSet.removeAll(arrayList);
            m9491e(m9493s(linkedHashSet, this.f22835b != null));
        }
    }

    @Override // c0.InterfaceC0818k
    /* renamed from: c */
    public final e0 mo2207c() {
        return this.f22834a.f16440b;
    }

    /* renamed from: d */
    public final void m9490d(Collection collection, C1894c c1894c) {
        Objects.toString(collection);
        Objects.toString(c1894c);
        u1.m10942a("CameraUseCaseAdapter");
        synchronized (this.f22844l) {
            try {
                C3073d c3073d = this.f22834a;
                InterfaceC3094y interfaceC3094y = this.f22843k;
                c3073d.mo7316n(interfaceC3094y);
                C3073d c3073d2 = this.f22835b;
                if (c3073d2 != null) {
                    c3073d2.mo7316n(interfaceC3094y);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f22838e);
                linkedHashSet.addAll(collection);
                HashMap mapM9484g = m9484g(linkedHashSet, c1894c);
                try {
                    m9491e(m9493s(linkedHashSet, this.f22835b != null));
                } catch (IllegalArgumentException e2) {
                    m9482D(mapM9484g);
                    throw new CameraUseCaseAdapter$CameraException(e2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m9491e(C4608b c4608b) {
        int i10;
        Map map = c4608b.f22826i.f22856a;
        ArrayList arrayList = c4608b.f22819b;
        synchronized (this.f22844l) {
            try {
                int size = arrayList.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    b2 b2Var = (b2) obj;
                    Rect rectMo7324g = this.f22834a.f16440b.f16612a.mo7324g();
                    C3082m c3082m = (C3082m) map.get(b2Var);
                    c3082m.getClass();
                    b2Var.mo2175z(m9485t(rectMo7324g, c3082m.f16522a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List list = this.f22841h;
        ArrayList arrayList2 = c4608b.f22819b;
        LinkedHashSet linkedHashSet = c4608b.f22818a;
        ArrayList arrayListM9483E = m9483E(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListM9483E2 = m9483E(arrayList3, arrayListM9483E);
        if (!arrayListM9483E2.isEmpty()) {
            arrayListM9483E2.toString();
            u1.m10951j("CameraUseCaseAdapter");
        }
        ArrayList arrayList4 = c4608b.f22822e;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            ((b2) obj2).m2148B(this.f22834a);
        }
        this.f22834a.mo7315l(c4608b.f22822e);
        if (this.f22835b != null) {
            ArrayList arrayList5 = c4608b.f22822e;
            int size3 = arrayList5.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList5.get(i13);
                i13++;
                C3073d c3073d = this.f22835b;
                Objects.requireNonNull(c3073d);
                ((b2) obj3).m2148B(c3073d);
            }
            C3073d c3073d2 = this.f22835b;
            Objects.requireNonNull(c3073d2);
            c3073d2.mo7315l(c4608b.f22822e);
        }
        if (c4608b.f22822e.isEmpty()) {
            ArrayList arrayList6 = c4608b.f22821d;
            int size4 = arrayList6.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList6.get(i14);
                i14++;
                b2 b2Var2 = (b2) obj4;
                Map map2 = c4608b.f22826i.f22856a;
                if (map2.containsKey(b2Var2)) {
                    C3082m c3082m2 = (C3082m) map2.get(b2Var2);
                    Objects.requireNonNull(c3082m2);
                    s0 s0Var = c3082m2.f16527f;
                    if (s0Var != null) {
                        g2 g2Var = b2Var2.f5059n;
                        o1 o1Var = g2Var.f16473g.f16566b;
                        Objects.requireNonNull(s0Var);
                        if (s0Var.mo7403h().size() == g2Var.f16473g.f16566b.mo7403h().size()) {
                            for (C3076g c3076g : s0Var.mo7403h()) {
                                if (!o1Var.f16550a.containsKey(c3076g) || !Objects.equals(o1Var.mo7406k(c3076g), s0Var.mo7406k(c3076g))) {
                                }
                            }
                        }
                        b2Var2.f5053h = b2Var2.mo2172w(s0Var);
                        if (this.f22845m) {
                            this.f22834a.mo2145g(b2Var2);
                            C3073d c3073d3 = this.f22835b;
                            if (c3073d3 != null) {
                                c3073d3.mo2145g(b2Var2);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = c4608b.f22820c;
        int size5 = arrayList7.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            b2 b2Var3 = (b2) obj5;
            C4611e c4611e = (C4611e) c4608b.f22825h.get(b2Var3);
            Objects.requireNonNull(c4611e);
            C3073d c3073d4 = this.f22835b;
            if (c3073d4 != null) {
                b2Var3.m2151b(this.f22834a, c3073d4, c4611e.f22832a, c4611e.f22833b);
                C3082m c3082m3 = (C3082m) c4608b.f22826i.f22856a.get(b2Var3);
                c3082m3.getClass();
                C4615i c4615i = c4608b.f22827j;
                c4615i.getClass();
                b2Var3.f5053h = b2Var3.mo2173x(c3082m3, (C3082m) c4615i.f22856a.get(b2Var3));
            } else {
                b2Var3.m2151b(this.f22834a, null, c4611e.f22832a, c4611e.f22833b);
                C3082m c3082m4 = (C3082m) c4608b.f22826i.f22856a.get(b2Var3);
                c3082m4.getClass();
                b2Var3.f5053h = b2Var3.mo2173x(c3082m4, null);
            }
        }
        if (this.f22845m) {
            this.f22834a.mo7314k(c4608b.f22820c);
            C3073d c3073d5 = this.f22835b;
            if (c3073d5 != null) {
                c3073d5.mo7314k(c4608b.f22820c);
            }
        }
        ArrayList arrayList8 = c4608b.f22820c;
        int size6 = arrayList8.size();
        while (i10 < size6) {
            Object obj6 = arrayList8.get(i10);
            i10++;
            ((b2) obj6).m2166q();
        }
        this.f22838e.clear();
        this.f22838e.addAll(c4608b.f22818a);
        this.f22839f.clear();
        this.f22839f.addAll(c4608b.f22819b);
        this.f22847p = c4608b.f22824g;
        this.f22848q = c4608b.f22823f;
    }

    /* renamed from: r */
    public final void m9492r() {
        synchronized (this.f22844l) {
            try {
                if (!this.f22845m) {
                    if (!this.f22839f.isEmpty()) {
                        this.f22834a.mo7316n(this.f22843k);
                        C3073d c3073d = this.f22835b;
                        if (c3073d != null) {
                            c3073d.mo7316n(this.f22843k);
                        }
                    }
                    this.f22834a.mo7314k(this.f22839f);
                    C3073d c3073d2 = this.f22835b;
                    if (c3073d2 != null) {
                        c3073d2.mo7314k(this.f22839f);
                    }
                    synchronized (this.f22844l) {
                        try {
                            s0 s0Var = this.f22846n;
                            if (s0Var != null) {
                                this.f22834a.f16441c.mo7298g(s0Var);
                            }
                        } finally {
                        }
                    }
                    ArrayList arrayList = this.f22839f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((b2) obj).m2166q();
                    }
                    this.f22845m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0166, code lost:
    
        if (r2 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
    
        return m9493s(r25, true);
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m0.C4608b m9493s(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C4612f.m9493s(java.util.LinkedHashSet, boolean):m0.b");
    }

    /* renamed from: v */
    public final void m9494v() {
        synchronized (this.f22844l) {
            try {
                if (this.f22845m) {
                    this.f22834a.mo7315l(new ArrayList(this.f22839f));
                    C3073d c3073d = this.f22835b;
                    if (c3073d != null) {
                        c3073d.mo7315l(new ArrayList(this.f22839f));
                    }
                    synchronized (this.f22844l) {
                        C3071b c3071b = this.f22834a.f16441c;
                        this.f22846n = c3071b.f16433b.mo7295d();
                        c3071b.mo7297f();
                    }
                    this.f22845m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public final int m9495w() {
        synchronized (this.f22844l) {
            try {
                return this.f22840g.m4b() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public final HashSet m9496y(LinkedHashSet linkedHashSet, boolean z6) {
        int i10;
        HashSet hashSet = new HashSet();
        synchronized (this.f22844l) {
            Iterator it = this.f22841h.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i10 = z6 ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            b2 b2Var = (b2) it2.next();
            y0.m11051a("Only support one level of sharing for now.", !(b2Var instanceof C7294d));
            Iterator it3 = b2Var.mo2160k().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i10 & iIntValue) == iIntValue) {
                        hashSet.add(b2Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: z */
    public final List m9497z() {
        ArrayList arrayList;
        synchronized (this.f22844l) {
            arrayList = new ArrayList(this.f22838e);
        }
        return arrayList;
    }
}
