package h1;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import b6.C0601b;
import com.sun.mail.util.AbstractC1452a;
import e1.C1921w;
import e1.C1922x;
import eb.m3;
import f1.AbstractC2176a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import s0.AbstractC6703g;
import s0.AbstractC6705i;
import s0.C6697a;
import s0.C6699c;
import s0.C6704h;
import s0.EnumC6702f;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class g2 implements b2 {

    /* renamed from: a */
    public int[] f15430a;

    /* renamed from: b */
    public int f15431b;

    /* renamed from: c */
    public final Object f15432c;

    /* renamed from: d */
    public final Object f15433d;

    /* renamed from: e */
    public Object f15434e;

    /* renamed from: f */
    public Object f15435f;

    /* renamed from: g */
    public Object f15436g;

    /* renamed from: h */
    public Object f15437h;

    /* renamed from: j */
    public Object f15438j;

    /* renamed from: k */
    public Object f15439k;

    /* renamed from: l */
    public Object f15440l;

    /* renamed from: m */
    public Object f15441m;

    /* renamed from: n */
    public Object f15442n;

    public g2() {
        this.f15432c = new AtomicBoolean(false);
        this.f15433d = new HashMap();
        this.f15435f = EGL14.EGL_NO_DISPLAY;
        this.f15436g = EGL14.EGL_NO_CONTEXT;
        this.f15430a = AbstractC6705i.f32027a;
        this.f15438j = EGL14.EGL_NO_SURFACE;
        this.f15440l = Collections.EMPTY_MAP;
        this.f15441m = null;
        this.f15442n = EnumC6702f.UNKNOWN;
        this.f15431b = -1;
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        AbstractC2785p abstractC2785p4;
        AbstractC2785p abstractC2785p5;
        float f6;
        C2787r[][] c2787rArr;
        boolean z6;
        AbstractC2785p abstractC2785p6 = abstractC2785p;
        AbstractC2785p abstractC2785p7 = abstractC2785p2;
        C1921w c1921w = (C1921w) this.f15432c;
        int[] iArr = a2.f15348a;
        int i10 = 0;
        long j10 = (j6 / 1000000) - 0;
        int i11 = this.f15431b;
        long j11 = i11;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 <= j11) {
            j11 = j10;
        }
        int i12 = (int) j11;
        C1922x c1922x = (C1922x) this.f15433d;
        f2 f2Var = (f2) c1922x.m5595b(i12);
        if (f2Var != null) {
            return f2Var.f15417a;
        }
        if (i12 >= i11) {
            return abstractC2785p7;
        }
        if (i12 <= 0) {
            return abstractC2785p6;
        }
        m6819i(abstractC2785p6, abstractC2785p7, abstractC2785p3);
        AbstractC2785p abstractC2785p8 = (AbstractC2785p) this.f15438j;
        AbstractC4154l.m8920c(abstractC2785p8);
        boolean z10 = true;
        if (((C8986c) this.f15442n) != a2.f15350c) {
            float fM6816f = m6816f(m6815e(i12), i12, false);
            float[] fArr = (float[]) this.f15436g;
            C2787r[][] c2787rArr2 = (C2787r[][]) ((C8986c) this.f15442n).f43336b;
            int length = c2787rArr2.length - 1;
            float f10 = c2787rArr2[0][0].f15555a;
            float f11 = c2787rArr2[length][0].f15556b;
            int length2 = fArr.length;
            if (fM6816f < f10 || fM6816f > f11) {
                if (fM6816f > f11) {
                    f10 = f11;
                } else {
                    length = 0;
                }
                float f12 = fM6816f - f10;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 - 1) {
                    C2787r c2787r = c2787rArr2[length][i14];
                    boolean z11 = c2787r.f15570p;
                    float f13 = c2787r.f15572r;
                    float f14 = c2787r.f15571q;
                    if (z11) {
                        float f15 = c2787r.f15555a;
                        float f16 = c2787r.f15565k;
                        f6 = f12;
                        float f17 = c2787r.f15557c;
                        c2787rArr = c2787rArr2;
                        fArr[i13] = (f6 * f14) + i0.m0.m7368a(c2787r.f15559e, f17, (f10 - f15) * f16, f17);
                        float f18 = (f10 - f15) * f16;
                        float f19 = c2787r.f15558d;
                        fArr[i13 + 1] = (f6 * f13) + i0.m0.m7368a(c2787r.f15560f, f19, f18, f19);
                    } else {
                        f6 = f12;
                        c2787rArr = c2787rArr2;
                        c2787r.m6851c(f10);
                        fArr[i13] = (c2787r.m6849a() * f6) + (c2787r.f15568n * c2787r.f15562h) + f14;
                        fArr[i13 + 1] = (c2787r.m6850b() * f6) + (c2787r.f15569o * c2787r.f15563i) + f13;
                    }
                    i13 += 2;
                    i14++;
                    f12 = f6;
                    c2787rArr2 = c2787rArr;
                }
            } else {
                int length3 = c2787rArr2.length;
                int i15 = 0;
                boolean z12 = false;
                while (i15 < length3) {
                    int i16 = i10;
                    int i17 = i16;
                    while (i16 < length2 - 1) {
                        C2787r c2787r2 = c2787rArr2[i15][i17];
                        if (fM6816f <= c2787r2.f15556b) {
                            if (c2787r2.f15570p) {
                                float f20 = c2787r2.f15555a;
                                float f21 = c2787r2.f15565k;
                                float f22 = c2787r2.f15557c;
                                z6 = z10;
                                fArr[i16] = i0.m0.m7368a(c2787r2.f15559e, f22, (fM6816f - f20) * f21, f22);
                                float f23 = c2787r2.f15558d;
                                fArr[i16 + 1] = i0.m0.m7368a(c2787r2.f15560f, f23, (fM6816f - f20) * f21, f23);
                            } else {
                                z6 = z10;
                                c2787r2.m6851c(fM6816f);
                                fArr[i16] = (c2787r2.f15568n * c2787r2.f15562h) + c2787r2.f15571q;
                                fArr[i16 + 1] = (c2787r2.f15569o * c2787r2.f15563i) + c2787r2.f15572r;
                            }
                            z12 = z6;
                        } else {
                            z6 = z10;
                        }
                        i16 += 2;
                        i17++;
                        z10 = z6;
                    }
                    boolean z13 = z10;
                    if (z12) {
                        break;
                    }
                    i15++;
                    z10 = z13;
                    i10 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i18 = 0; i18 < length4; i18++) {
                abstractC2785p8.mo6835e(fArr[i18], i18);
            }
        } else {
            int iM6815e = m6815e(i12);
            float fM6816f2 = m6816f(iM6815e, i12, true);
            f2 f2Var2 = (f2) c1922x.m5595b(c1921w.m5653c(iM6815e));
            if (f2Var2 != null && (abstractC2785p5 = f2Var2.f15417a) != null) {
                abstractC2785p6 = abstractC2785p5;
            }
            f2 f2Var3 = (f2) c1922x.m5595b(c1921w.m5653c(iM6815e + 1));
            if (f2Var3 != null && (abstractC2785p4 = f2Var3.f15417a) != null) {
                abstractC2785p7 = abstractC2785p4;
            }
            int iMo6832b = abstractC2785p8.mo6832b();
            for (int i19 = 0; i19 < iMo6832b; i19++) {
                abstractC2785p8.mo6835e((abstractC2785p7.mo6831a(i19) * fM6816f2) + ((1 - fM6816f2) * abstractC2785p6.mo6831a(i19)), i19);
            }
        }
        return abstractC2785p8;
    }

    @Override // h1.b2
    /* renamed from: N */
    public int mo2731N() {
        return 0;
    }

    @Override // h1.b2
    /* renamed from: W */
    public int mo2732W() {
        return this.f15431b;
    }

    /* renamed from: a */
    public void m6812a(c0.a0 a0Var, m3 m3Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15435f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f15435f, iArr, 0, iArr, 1)) {
            this.f15435f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (m3Var != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            m3Var.f9374b = str;
        }
        int i10 = a0Var.m2138a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f15435f, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, a0Var.m2138a() ? 2 : 8, 12325, 0, 12326, 0, 12352, a0Var.m2138a() ? 64 : 4, 12610, a0Var.m2138a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f15435f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, a0Var.m2138a() ? 3 : 2, 12344}, 0);
        AbstractC6705i.m12832a("eglCreateContext");
        this.f15437h = eGLConfig;
        this.f15436g = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.f15435f, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    /* renamed from: c */
    public C6699c m6813c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f15435f;
            EGLConfig eGLConfig = (EGLConfig) this.f15437h;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM12839h = AbstractC6705i.m12839h(eGLDisplay, eGLConfig, surface, this.f15430a);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f15435f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM12839h, 12375, iArr, 0);
            int i10 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM12839h, 12374, iArr2, 0);
            Size size = new Size(i10, iArr2[0]);
            return new C6699c(eGLSurfaceM12839h, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e2.getMessage();
            og.u1.m10952k("OpenGlRenderer");
            return null;
        }
    }

    /* renamed from: d */
    public void m6814d() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f15435f;
        EGLConfig eGLConfig = (EGLConfig) this.f15437h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC6705i.f32027a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC6705i.m12832a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f15438j = eGLSurfaceEglCreatePbufferSurface;
    }

    /* renamed from: e */
    public int m6815e(int i10) {
        int i11;
        C1921w c1921w = (C1921w) this.f15432c;
        int i12 = c1921w.f9077b;
        c1921w.getClass();
        if (i12 <= 0 || i12 > c1921w.f9077b) {
            AbstractC2176a.m5863d("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = c1921w.f9076a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    /* renamed from: f */
    public float m6816f(int i10, int i11, boolean z6) {
        InterfaceC2792w interfaceC2792w;
        float f6;
        C1921w c1921w = (C1921w) this.f15432c;
        if (i10 >= c1921w.f9077b - 1) {
            f6 = i11;
        } else {
            int iM5653c = c1921w.m5653c(i10);
            int iM5653c2 = c1921w.m5653c(i10 + 1);
            if (i11 == iM5653c) {
                f6 = iM5653c;
            } else {
                int i12 = iM5653c2 - iM5653c;
                f2 f2Var = (f2) ((C1922x) this.f15433d).m5595b(iM5653c);
                if (f2Var == null || (interfaceC2792w = f2Var.f15418b) == null) {
                    interfaceC2792w = (InterfaceC2792w) this.f15434e;
                }
                float f10 = i12;
                float fMo6654c = interfaceC2792w.mo6654c((i11 - iM5653c) / f10);
                if (z6) {
                    return fMo6654c;
                }
                f6 = (f10 * fMo6654c) + iM5653c;
            }
        }
        return f6 / 1000;
    }

    /* renamed from: g */
    public C0601b m6817g(c0.a0 a0Var) {
        AbstractC6705i.m12835d((AtomicBoolean) this.f15432c, false);
        try {
            m6812a(a0Var, null);
            m6814d();
            m6820j((EGLSurface) this.f15438j);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f15435f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C0601b(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e2) {
            e2.getMessage();
            og.u1.m10952k("OpenGlRenderer");
            return new C0601b("", "");
        } finally {
            m6822l();
        }
    }

    /* renamed from: h */
    public C6697a mo6818h(c0.a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f15432c;
        AbstractC6705i.m12835d(atomicBoolean, false);
        m3 m3Var = new m3();
        m3Var.f9373a = "0.0";
        m3Var.f9374b = "0.0";
        m3Var.f9375c = "";
        m3Var.f9376d = "";
        try {
            if (a0Var.m2138a()) {
                C0601b c0601bM6817g = m6817g(a0Var);
                String str = (String) c0601bM6817g.f3985a;
                str.getClass();
                String str2 = (String) c0601bM6817g.f3986b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    og.u1.m10951j("OpenGlRenderer");
                    a0Var = c0.a0.f5035d;
                }
                int[] iArr = AbstractC6705i.f32027a;
                if (a0Var.f5041a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = AbstractC6705i.f32028b;
                    } else {
                        og.u1.m10951j("GLUtils");
                    }
                }
                this.f15430a = iArr;
                m3Var.f9375c = str;
                m3Var.f9376d = str2;
            }
            m6812a(a0Var, m3Var);
            m6814d();
            m6820j((EGLSurface) this.f15438j);
            String strM12840i = AbstractC6705i.m12840i();
            if (strM12840i == null) {
                throw new NullPointerException("Null glVersion");
            }
            m3Var.f9373a = strM12840i;
            this.f15440l = AbstractC6705i.m12837f(a0Var);
            int iM12838g = AbstractC6705i.m12838g();
            this.f15431b = iM12838g;
            m6825q(iM12838g);
            this.f15434e = Thread.currentThread();
            atomicBoolean.set(true);
            String strM4561h = m3Var.f9373a == null ? " glVersion" : "";
            if (m3Var.f9374b == null) {
                strM4561h = strM4561h.concat(" eglVersion");
            }
            if (m3Var.f9375c == null) {
                strM4561h = AbstractC1452a.m4561h(strM4561h, " glExtensions");
            }
            if (m3Var.f9376d == null) {
                strM4561h = AbstractC1452a.m4561h(strM4561h, " eglExtensions");
            }
            if (strM4561h.isEmpty()) {
                return new C6697a(m3Var.f9373a, m3Var.f9374b, m3Var.f9375c, m3Var.f9376d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM4561h));
        } catch (IllegalArgumentException e2) {
            e = e2;
            m6822l();
            throw e;
        } catch (IllegalStateException e10) {
            e = e10;
            m6822l();
            throw e;
        }
    }

    /* renamed from: i */
    public void m6819i(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        float[] fArr;
        C1922x c1922x = (C1922x) this.f15433d;
        C1921w c1921w = (C1921w) this.f15432c;
        boolean z6 = ((C8986c) this.f15442n) != a2.f15350c;
        if (((AbstractC2785p) this.f15438j) == null) {
            this.f15438j = abstractC2785p.mo6833c();
            this.f15439k = abstractC2785p3.mo6833c();
            int i10 = c1921w.f9077b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = c1921w.m5653c(i11) / 1000;
            }
            this.f15435f = fArr2;
            int i12 = c1921w.f9077b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f15430a = iArr;
        }
        if (z6) {
            if (((C8986c) this.f15442n) != a2.f15350c && AbstractC4154l.m8918a((AbstractC2785p) this.f15440l, abstractC2785p) && AbstractC4154l.m8918a((AbstractC2785p) this.f15441m, abstractC2785p2)) {
                return;
            }
            this.f15440l = abstractC2785p;
            this.f15441m = abstractC2785p2;
            int iMo6832b = abstractC2785p.mo6832b() + (abstractC2785p.mo6832b() % 2);
            this.f15436g = new float[iMo6832b];
            this.f15437h = new float[iMo6832b];
            int i14 = c1921w.f9077b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iM5653c = c1921w.m5653c(i15);
                f2 f2Var = (f2) c1922x.m5595b(iM5653c);
                if (iM5653c == 0 && f2Var == null) {
                    fArr = new float[iMo6832b];
                    for (int i16 = 0; i16 < iMo6832b; i16++) {
                        fArr[i16] = abstractC2785p.mo6831a(i16);
                    }
                } else if (iM5653c == this.f15431b && f2Var == null) {
                    fArr = new float[iMo6832b];
                    for (int i17 = 0; i17 < iMo6832b; i17++) {
                        fArr[i17] = abstractC2785p2.mo6831a(i17);
                    }
                } else {
                    AbstractC4154l.m8920c(f2Var);
                    AbstractC2785p abstractC2785p4 = f2Var.f15417a;
                    float[] fArr4 = new float[iMo6832b];
                    for (int i18 = 0; i18 < iMo6832b; i18++) {
                        fArr4[i18] = abstractC2785p4.mo6831a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f15442n = new C8986c(this.f15430a, (float[]) this.f15435f, fArr3);
        }
    }

    /* renamed from: j */
    public void m6820j(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f15435f).getClass();
        ((EGLContext) this.f15436g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f15435f, eGLSurface, eGLSurface, (EGLContext) this.f15436g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* renamed from: k */
    public void m6821k(Surface surface) {
        AbstractC6705i.m12835d((AtomicBoolean) this.f15432c, true);
        AbstractC6705i.m12834c((Thread) this.f15434e);
        HashMap map = (HashMap) this.f15433d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, AbstractC6705i.f32036j);
    }

    /* renamed from: l */
    public void m6822l() {
        HashMap map = (HashMap) this.f15433d;
        Iterator it = ((Map) this.f15440l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC6703g) it.next()).f32020a);
        }
        this.f15440l = Collections.EMPTY_MAP;
        this.f15441m = null;
        if (!Objects.equals((EGLDisplay) this.f15435f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f15435f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (C6699c c6699c : map.values()) {
                if (!Objects.equals(c6699c.f32016a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f15435f, c6699c.f32016a)) {
                    try {
                        AbstractC6705i.m12832a("eglDestroySurface");
                    } catch (IllegalStateException e2) {
                        e2.toString();
                        og.u1.m10944c("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f15438j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f15435f, (EGLSurface) this.f15438j);
                this.f15438j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f15436g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f15435f, (EGLContext) this.f15436g);
                this.f15436g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f15435f);
            this.f15435f = EGL14.EGL_NO_DISPLAY;
        }
        this.f15437h = null;
        this.f15431b = -1;
        this.f15442n = EnumC6702f.UNKNOWN;
        this.f15439k = null;
        this.f15434e = null;
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        int[] iArr = a2.f15348a;
        int i10 = 0;
        long j10 = (j6 / 1000000) - 0;
        long j11 = this.f15431b;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 < 0) {
            return abstractC2785p3;
        }
        m6819i(abstractC2785p, abstractC2785p2, abstractC2785p3);
        AbstractC2785p abstractC2785p4 = (AbstractC2785p) this.f15439k;
        AbstractC4154l.m8920c(abstractC2785p4);
        if (((C8986c) this.f15442n) != a2.f15350c) {
            int i11 = (int) j12;
            float fM6816f = m6816f(m6815e(i11), i11, false);
            float[] fArr = (float[]) this.f15437h;
            C2787r[][] c2787rArr = (C2787r[][]) ((C8986c) this.f15442n).f43336b;
            float f6 = c2787rArr[0][0].f15555a;
            float f10 = c2787rArr[c2787rArr.length - 1][0].f15556b;
            if (fM6816f < f6) {
                fM6816f = f6;
            }
            if (fM6816f <= f10) {
                f10 = fM6816f;
            }
            int length = fArr.length;
            boolean z6 = false;
            for (C2787r[] c2787rArr2 : c2787rArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    C2787r c2787r = c2787rArr2[i13];
                    if (f10 <= c2787r.f15556b) {
                        if (c2787r.f15570p) {
                            fArr[i12] = c2787r.f15571q;
                            fArr[i12 + 1] = c2787r.f15572r;
                        } else {
                            c2787r.m6851c(f10);
                            fArr[i12] = c2787r.m6849a();
                            fArr[i12 + 1] = c2787r.m6850b();
                        }
                        z6 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z6) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                abstractC2785p4.mo6835e(fArr[i10], i10);
                i10++;
            }
        } else {
            AbstractC2785p abstractC2785pMo2730B = mo2730B((j12 - 1) * 1000000, abstractC2785p, abstractC2785p2, abstractC2785p3);
            AbstractC2785p abstractC2785pMo2730B2 = mo2730B(j12 * 1000000, abstractC2785p, abstractC2785p2, abstractC2785p3);
            int iMo6832b = abstractC2785pMo2730B.mo6832b();
            while (i10 < iMo6832b) {
                abstractC2785p4.mo6835e((abstractC2785pMo2730B.mo6831a(i10) - abstractC2785pMo2730B2.mo6831a(i10)) * 1000.0f, i10);
                i10++;
            }
        }
        return abstractC2785p4;
    }

    /* renamed from: o */
    public void m6823o(Surface surface, boolean z6) {
        HashMap map = (HashMap) this.f15433d;
        if (((Surface) this.f15439k) == surface) {
            this.f15439k = null;
            m6820j((EGLSurface) this.f15438j);
        }
        C6699c c6699c = z6 ? (C6699c) map.remove(surface) : (C6699c) map.put(surface, AbstractC6705i.f32036j);
        if (c6699c == null || c6699c == AbstractC6705i.f32036j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f15435f, c6699c.f32016a);
        } catch (RuntimeException e2) {
            e2.getMessage();
            og.u1.m10952k("OpenGlRenderer");
        }
    }

    /* renamed from: p */
    public void m6824p(long j6, float[] fArr, Surface surface) {
        AbstractC6705i.m12835d((AtomicBoolean) this.f15432c, true);
        AbstractC6705i.m12834c((Thread) this.f15434e);
        HashMap map = (HashMap) this.f15433d;
        og.y0.m11056f("The surface is not registered.", map.containsKey(surface));
        C6699c c6699cM6813c = (C6699c) map.get(surface);
        Objects.requireNonNull(c6699cM6813c);
        if (c6699cM6813c == AbstractC6705i.f32036j) {
            c6699cM6813c = m6813c(surface);
            if (c6699cM6813c == null) {
                return;
            } else {
                map.put(surface, c6699cM6813c);
            }
        }
        int i10 = c6699cM6813c.f32018c;
        int i11 = c6699cM6813c.f32017b;
        EGLSurface eGLSurface = c6699cM6813c.f32016a;
        if (surface != ((Surface) this.f15439k)) {
            m6820j(eGLSurface);
            this.f15439k = surface;
            GLES20.glViewport(0, 0, i11, i10);
            GLES20.glScissor(0, 0, i11, i10);
        }
        AbstractC6703g abstractC6703g = (AbstractC6703g) this.f15441m;
        abstractC6703g.getClass();
        if (abstractC6703g instanceof C6704h) {
            GLES20.glUniformMatrix4fv(((C6704h) abstractC6703g).f32025f, 1, false, fArr, 0);
            AbstractC6705i.m12833b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6705i.m12833b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f15435f, eGLSurface, j6);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f15435f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        og.u1.m10951j("OpenGlRenderer");
        m6823o(surface, false);
    }

    /* renamed from: q */
    public void m6825q(int i10) {
        AbstractC6703g abstractC6703g = (AbstractC6703g) ((Map) this.f15440l).get((EnumC6702f) this.f15442n);
        if (abstractC6703g == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((EnumC6702f) this.f15442n));
        }
        if (((AbstractC6703g) this.f15441m) != abstractC6703g) {
            this.f15441m = abstractC6703g;
            abstractC6703g.mo12831b();
            Objects.toString((EnumC6702f) this.f15442n);
            Objects.toString((AbstractC6703g) this.f15441m);
        }
        GLES20.glActiveTexture(33984);
        AbstractC6705i.m12833b("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        AbstractC6705i.m12833b("glBindTexture");
    }

    public g2(C1921w c1921w, C1922x c1922x, int i10, InterfaceC2792w interfaceC2792w) {
        this.f15432c = c1921w;
        this.f15433d = c1922x;
        this.f15431b = i10;
        this.f15434e = interfaceC2792w;
        this.f15430a = a2.f15348a;
        float[] fArr = a2.f15349b;
        this.f15435f = fArr;
        this.f15436g = fArr;
        this.f15437h = fArr;
        this.f15442n = a2.f15350c;
    }
}
