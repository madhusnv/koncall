package p020v;

import a1.C0006e;
import a1.c0;
import a6.C0058f;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.CameraControl$OperationCanceledException;
import b0.C0509a;
import b0.C0512d;
import b0.C0515g;
import b0.RunnableC0510b;
import be.C0655j;
import c0.a0;
import c0.f1;
import c0.h1;
import c0.t0;
import c3.C0846a;
import df.RunnableC1702a;
import eb.i3;
import i0.C3076g;
import i0.b2;
import i0.d0;
import i0.j1;
import i0.o1;
import i0.r0;
import i0.s0;
import j0.C3503c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import l0.AbstractC4308h;
import l4.C4367l;
import m0.C4607a;
import mf.C4719b;
import mk.C4764c;
import o1.g0;
import o2.C5271d;
import o6.C5299a;
import og.u1;
import p019u.C7286a;
import p021w.C7843i;
import p023y.AbstractC8523a;
import pg.i7;
import pg.o7;
import pg.t8;
import qi.RunnableC6224g;
import ug.C7452w;
import x4.C8299i;
import z1.C8849i;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.i */
/* loaded from: classes.dex */
public final class C7599i implements d0 {

    /* renamed from: b */
    public final C7597g f36570b;

    /* renamed from: c */
    public final ExecutorC3900j f36571c;

    /* renamed from: d */
    public final Object f36572d = new Object();

    /* renamed from: e */
    public final C7843i f36573e;

    /* renamed from: f */
    public final l4.d0 f36574f;

    /* renamed from: g */
    public final b2 f36575g;

    /* renamed from: h */
    public final r0 f36576h;

    /* renamed from: i */
    public final m1 f36577i;

    /* renamed from: j */
    public final j1 f36578j;

    /* renamed from: k */
    public final C0058f f36579k;

    /* renamed from: l */
    public final C0058f f36580l;

    /* renamed from: m */
    public final C4719b f36581m;

    /* renamed from: n */
    public final C0512d f36582n;

    /* renamed from: o */
    public final C7452w f36583o;

    /* renamed from: p */
    public final C5299a f36584p;

    /* renamed from: q */
    public int f36585q;

    /* renamed from: r */
    public volatile int f36586r;

    /* renamed from: s */
    public volatile int f36587s;

    /* renamed from: t */
    public volatile int f36588t;

    /* renamed from: u */
    public final g0 f36589u;

    /* renamed from: v */
    public final AtomicLong f36590v;

    /* renamed from: w */
    public int f36591w;

    /* renamed from: x */
    public long f36592x;

    /* renamed from: y */
    public final C0006e f36593y;

    public C7599i(C7843i c7843i, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d, ExecutorC3900j executorC3900j, l4.d0 d0Var, i3 i3Var) {
        boolean z6;
        b2 b2Var = new b2();
        this.f36575g = b2Var;
        this.f36585q = 0;
        this.f36586r = 0;
        this.f36588t = 2;
        this.f36590v = new AtomicLong(0L);
        this.f36591w = 1;
        this.f36592x = 0L;
        C0006e c0006e = new C0006e();
        c0006e.f33b = new HashSet();
        c0006e.f34c = new ArrayMap();
        this.f36593y = c0006e;
        this.f36573e = c7843i;
        this.f36574f = d0Var;
        this.f36571c = executorC3900j;
        this.f36584p = new C5299a(executorC3900j);
        C7597g c7597g = new C7597g(executorC3900j);
        this.f36570b = c7597g;
        b2Var.f16425b.f4191a = this.f36591w;
        b2Var.f16425b.m1874d(new k0(c7597g));
        b2Var.f16425b.m1874d(c0006e);
        this.f36580l = new C0058f(this);
        this.f36576h = new r0(this, executorC3900j);
        this.f36577i = new m1(this, c7843i);
        this.f36578j = new j1(this, c7843i);
        this.f36587s = c7843i.m14824b();
        this.f36579k = new C0058f(this, c7843i);
        C4719b c4719b = new C4719b();
        c4719b.f23612a = false;
        c4719b.f23613b = false;
        c4719b.f23614c = false;
        c4719b.f23615d = c7843i;
        c4719b.f23616e = executorC3900j;
        int[] iArr = (int[]) c7843i.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 4) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        } else {
            z6 = false;
        }
        c4719b.f23613b = z6;
        c4719b.f23614c = AbstractC8523a.f41447a.m5729g(ZslDisablerQuirk.class) != null;
        c4719b.f23617f = new C4367l(new C4764c(23));
        this.f36581m = c4719b;
        this.f36589u = new g0(i3Var, 1);
        this.f36582n = new C0512d(this, executorC3900j);
        this.f36583o = new C7452w(this, c7843i, i3Var, executorC3900j, scheduledExecutorServiceC3894d);
    }

    /* renamed from: k */
    public static int m14391k(C7843i c7843i, int i10) {
        int[] iArr = (int[]) c7843i.m14823a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m14392l(i10, iArr) ? i10 : m14392l(1, iArr) ? 1 : 0;
    }

    /* renamed from: l */
    public static boolean m14392l(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    @Override // i0.d0
    /* renamed from: a */
    public final void mo7292a(int i10) {
        int i11;
        synchronized (this.f36572d) {
            i11 = this.f36585q;
        }
        if (!(i11 > 0)) {
            u1.m10951j("Camera2CameraControlImp");
            return;
        }
        this.f36588t = i10;
        u1.m10942a("Camera2CameraControlImp");
        C4719b c4719b = this.f36581m;
        if (this.f36588t != 1) {
            int i12 = this.f36588t;
        }
        c4719b.getClass();
        AbstractC4308h.m9034d(i7.m11697b(new c0(28, this)));
    }

    @Override // i0.d0
    /* renamed from: c */
    public final void mo7294c() {
        this.f36581m.m9586a();
    }

    @Override // i0.d0
    /* renamed from: d */
    public final s0 mo7295d() {
        C7286a c7286a;
        C0512d c0512d = this.f36582n;
        synchronized (c0512d.f3578e) {
            h1 h1Var = (h1) c0512d.f3579f;
            h1Var.getClass();
            c7286a = new C7286a(3, o1.m7399a(h1Var.f5106b));
        }
        return c7286a;
    }

    @Override // i0.d0
    /* renamed from: e */
    public final void mo7296e(b2 b2Var) {
        StreamConfigurationMap streamConfigurationMap;
        int i10;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        C0655j c0655j = b2Var.f16425b;
        C4719b c4719b = this.f36581m;
        ExecutorC3900j executorC3900j = (ExecutorC3900j) c4719b.f23616e;
        C7843i c7843i = (C7843i) c4719b.f23615d;
        c4719b.m9586a();
        if (c4719b.f23612a) {
            c0655j.f4191a = 1;
            return;
        }
        if (c4719b.f23614c) {
            c0655j.f4191a = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) c7843i.m14823a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e2) {
            e2.getMessage();
            u1.m10943b("ZslControlImpl");
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            i10 = 0;
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i11 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i11);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C3503c(true));
                    map.put(Integer.valueOf(i11), inputSizes[0]);
                }
            }
            i10 = 0;
        }
        if (c4719b.f23613b && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) c7843i.m14823a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i12 = i10; i12 < length; i12++) {
                if (validOutputFormatsForInput[i12] == 256) {
                    Size size = (Size) map.get(34);
                    f1 f1Var = new f1(size.getWidth(), size.getHeight(), 34, 9);
                    C0655j c0655j2 = new C0655j(f1Var);
                    Surface surface = c0655j2.getSurface();
                    Objects.requireNonNull(surface);
                    c0.u1 u1Var = new c0.u1(surface, new Size(c0655j2.mo1872b(), c0655j2.getHeight()), 34);
                    C8849i c8849i = new C8849i(executorC3900j);
                    c4719b.f23618g = c0655j2;
                    c4719b.f23619h = u1Var;
                    c4719b.f23620i = c8849i;
                    c0655j2.mo1871a(new b0(2, c4719b), t8.m11874c());
                    AbstractC4308h.m9034d(u1Var.f16604e).mo9026a(new RunnableC6224g(15, c0655j2, c8849i), executorC3900j);
                    b2Var.m7304c(u1Var, a0.f5035d, -1);
                    b2Var.m7302a(f1Var.f5086b);
                    f0 f0Var = new f0(2, c8849i);
                    ArrayList arrayList = b2Var.f16427d;
                    if (!arrayList.contains(f0Var)) {
                        arrayList.add(f0Var);
                    }
                    b2Var.f16430g = new InputConfiguration(c0655j2.mo1872b(), c0655j2.getHeight(), c0655j2.mo1880j());
                    return;
                }
            }
        }
        c0655j.f4191a = 1;
    }

    @Override // i0.d0
    /* renamed from: f */
    public final void mo7297f() {
        C0512d c0512d = this.f36582n;
        synchronized (c0512d.f3578e) {
            c0512d.f3579f = new h1(1);
        }
        AbstractC4308h.m9034d(i7.m11697b(new C0509a(c0512d, 1))).mo9026a(new RunnableC1702a(1), t8.m11872a());
    }

    @Override // i0.d0
    /* renamed from: g */
    public final void mo7298g(s0 s0Var) {
        C0512d c0512d = this.f36582n;
        C8989c c8989cM1515c = C0515g.m1512d(s0Var).m1515c();
        synchronized (c0512d.f3578e) {
            h1 h1Var = (h1) c0512d.f3579f;
            h1Var.getClass();
            r0 r0Var = r0.OPTIONAL;
            for (C3076g c3076g : c8989cM1515c.mo7403h()) {
                h1Var.f5106b.m7351m(c3076g, r0Var, c8989cM1515c.mo7406k(c3076g));
            }
        }
        AbstractC4308h.m9034d(i7.m11697b(new C0509a(c0512d, 0))).mo9026a(new RunnableC1702a(1), t8.m11872a());
    }

    /* renamed from: h */
    public final void m14393h(InterfaceC7598h interfaceC7598h) {
        ((HashSet) this.f36570b.f36542b).add(interfaceC7598h);
    }

    /* renamed from: i */
    public final void m14394i() {
        synchronized (this.f36572d) {
            try {
                int i10 = this.f36585q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f36585q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.g2 m14395j() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.C7599i.m14395j():i0.g2");
    }

    /* renamed from: m */
    public final void m14396m(boolean z6) {
        C4607a c4607a;
        u1.m10942a("Camera2CameraControlImp");
        r0 r0Var = this.f36576h;
        if (z6 != r0Var.f36682b) {
            r0Var.f36682b = z6;
            if (!r0Var.f36682b) {
                C7599i c7599i = r0Var.f36681a;
                ((HashSet) c7599i.f36570b.f36542b).remove(null);
                ((HashSet) c7599i.f36570b.f36542b).remove(null);
                if (r0Var.f36684d.length > 0 && r0Var.f36682b) {
                    C0655j c0655j = new C0655j();
                    c0655j.f4192b = true;
                    c0655j.f4191a = r0Var.f36683c;
                    j1 j1VarM7349b = j1.m7349b();
                    j1VarM7349b.m7352n(C7286a.g0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    c0655j.m1875e(new C7286a(3, o1.m7399a(j1VarM7349b)));
                    r0Var.f36681a.m14398o(Collections.singletonList(c0655j.m1876f()));
                }
                MeteringRectangle[] meteringRectangleArr = r0.f36680h;
                r0Var.f36684d = meteringRectangleArr;
                r0Var.f36685e = meteringRectangleArr;
                r0Var.f36686f = meteringRectangleArr;
                c7599i.m14399p();
            }
        }
        m1 m1Var = this.f36577i;
        if (m1Var.f36630e != z6) {
            m1Var.f36630e = z6;
            if (!z6) {
                synchronized (m1Var.f36627b) {
                    m1Var.f36627b.m2269g();
                    C0846a c0846a = m1Var.f36627b;
                    c4607a = new C4607a(c0846a.m2266d(), c0846a.m2264b(), c0846a.m2265c(), c0846a.m2263a());
                }
                d7.g0 g0Var = m1Var.f36628c;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    g0Var.m5321k(c4607a);
                } else {
                    g0Var.m5319i(c4607a);
                }
                m1Var.f36629d.mo13925o();
                m1Var.f36626a.m14399p();
            }
        }
        C0058f c0058f = this.f36579k;
        if (c0058f.f233a != z6) {
            c0058f.f233a = z6;
        }
        j1 j1Var = this.f36578j;
        int i10 = j1Var.f36613e;
        if (j1Var.f36612d != z6) {
            j1Var.f36612d = z6;
            if (!z6) {
                if (j1Var.f36615g) {
                    j1Var.f36615g = false;
                    C7599i c7599i2 = j1Var.f36609a;
                    c7599i2.f36586r = 0;
                    C0655j c0655j2 = new C0655j();
                    c0655j2.f4191a = c7599i2.f36591w;
                    c0655j2.f4192b = true;
                    j1 j1VarM7349b2 = j1.m7349b();
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                    j1VarM7349b2.m7352n(C7286a.g0(key), Integer.valueOf(m14391k(c7599i2.f36573e, 1)));
                    j1VarM7349b2.m7352n(C7286a.g0(CaptureRequest.FLASH_MODE), 0);
                    c0655j2.m1875e(new C7286a(3, o1.m7399a(j1VarM7349b2)));
                    c7599i2.m14398o(Collections.singletonList(c0655j2.m1876f()));
                    c7599i2.m14399p();
                    j1Var.getClass();
                    d7.g0 g0Var2 = j1Var.f36610b;
                    Integer numValueOf = Integer.valueOf(1 ^ 1);
                    if (o7.m11808c()) {
                        g0Var2.m5321k(numValueOf);
                    } else {
                        g0Var2.m5319i(numValueOf);
                    }
                    d7.g0 g0Var3 = j1Var.f36611c;
                    Integer numValueOf2 = Integer.valueOf(i10);
                    if (o7.m11808c()) {
                        g0Var3.m5321k(numValueOf2);
                    } else {
                        g0Var3.m5319i(numValueOf2);
                    }
                }
                C8299i c8299i = j1Var.f36614f;
                if (c8299i != null) {
                    c8299i.m15509d(new CameraControl$OperationCanceledException("Camera is not active."));
                    j1Var.f36614f = null;
                }
            }
        }
        C0058f c0058f2 = this.f36580l;
        if (z6 != c0058f2.f233a) {
            c0058f2.f233a = z6;
            if (!z6) {
                synchronized (((C5271d) c0058f2.f234b).f25905a) {
                }
            }
        }
        C0512d c0512d = this.f36582n;
        ((ExecutorC3900j) c0512d.f3577d).execute(new RunnableC0510b(c0512d, z6, 0));
        if (z6) {
            return;
        }
        this.f36584p.f26000a.set(0);
        u1.m10942a("VideoUsageControl");
    }

    /* renamed from: n */
    public final void m14397n(boolean z6) {
        synchronized (this.f36579k.f234b) {
            try {
                if (z6) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14398o(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.C7599i.m14398o(java.util.List):void");
    }

    /* renamed from: p */
    public final long m14399p() {
        this.f36592x = this.f36590v.getAndIncrement();
        ((C7612v) this.f36574f.f21881b).m14448M();
        return this.f36592x;
    }

    @Override // i0.d0
    /* renamed from: b */
    public final void mo7293b(t0 t0Var) {
    }
}
