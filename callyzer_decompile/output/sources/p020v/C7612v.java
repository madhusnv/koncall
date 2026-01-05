package p020v;

import a0.C0001a;
import a1.RunnableC0012k;
import a6.C0058f;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import b0.AbstractC0514f;
import b0.RunnableC0510b;
import c0.C0812e;
import c0.C0832y;
import c0.b2;
import c0.k1;
import c9.C0908c;
import c9.C0910e;
import c9.C0917l;
import c9.C0927v;
import d7.e0;
import e0.InterfaceC1893b;
import eb.i3;
import f1.C2177b;
import i0.AbstractC3084o;
import i0.C3074e;
import i0.C3076g;
import i0.C3082m;
import i0.C3083n;
import i0.InterfaceC3094y;
import i0.b0;
import i0.f0;
import i0.f2;
import i0.g0;
import i0.g2;
import i0.h1;
import i0.j2;
import i0.m2;
import i0.n0;
import i0.n1;
import i0.o0;
import i0.o1;
import i0.p2;
import i0.q0;
import i0.s0;
import i0.t2;
import i0.v0;
import i0.w2;
import i0.y2;
import j0.C3505e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4307g;
import l4.d0;
import mf.C4719b;
import og.u1;
import og.y0;
import p021w.C7843i;
import p021w.C7851q;
import p022x.C8233c;
import p023y.AbstractC8523a;
import pg.a0;
import pg.a6;
import pg.i7;
import pg.o7;
import pg.t8;
import qi.RunnableC6224g;
import u0.C7294d;
import ug.C7439j;
import ug.C7451v;
import ug.g1;
import x4.C8299i;
import x4.C8302l;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.v */
/* loaded from: classes.dex */
public final class C7612v implements g0 {

    /* renamed from: B */
    public final boolean f36704B;

    /* renamed from: C */
    public boolean f36705C;

    /* renamed from: D */
    public boolean f36706D;

    /* renamed from: E */
    public boolean f36707E;

    /* renamed from: F */
    public x0 f36708F;

    /* renamed from: G */
    public final x0 f36709G;

    /* renamed from: H */
    public final x0 f36710H;

    /* renamed from: I */
    public final HashSet f36711I;

    /* renamed from: K */
    public InterfaceC3094y f36712K;

    /* renamed from: L */
    public final Object f36713L;

    /* renamed from: M */
    public boolean f36714M;

    /* renamed from: N */
    public final q0 f36715N;

    /* renamed from: O */
    public final C8233c f36716O;

    /* renamed from: T */
    public final c1 f36717T;

    /* renamed from: V */
    public final C0917l f36718V;

    /* renamed from: a */
    public final C2177b f36719a;

    /* renamed from: b */
    public final C7851q f36720b;

    /* renamed from: c */
    public final ExecutorC3900j f36721c;

    /* renamed from: d */
    public final ScheduledExecutorServiceC3894d f36722d;

    /* renamed from: e */
    public volatile EnumC7610t f36723e = EnumC7610t.INITIALIZED;

    /* renamed from: f */
    public final C0927v f36724f;

    /* renamed from: g */
    public final C0927v f36725g;

    /* renamed from: h */
    public final C7599i f36726h;

    /* renamed from: j */
    public final C7611u f36727j;

    /* renamed from: k */
    public final C7613w f36728k;

    /* renamed from: l */
    public CameraDevice f36729l;

    /* renamed from: m */
    public int f36730m;

    /* renamed from: n */
    public o0 f36731n;

    /* renamed from: p */
    public final AtomicInteger f36732p;

    /* renamed from: q */
    public InterfaceFutureC8957d f36733q;

    /* renamed from: r */
    public C8299i f36734r;

    /* renamed from: s */
    public final LinkedHashMap f36735s;

    /* renamed from: t */
    public int f36736t;

    /* renamed from: v */
    public final C7608r f36737v;

    /* renamed from: w */
    public final C0001a f36738w;

    /* renamed from: x */
    public final o0 f36739x;

    /* renamed from: y */
    public final C0832y f36740y;

    /* renamed from: z */
    public final boolean f36741z;

    public C7612v(Context context, C7851q c7851q, String str, C7613w c7613w, C0001a c0001a, o0 o0Var, Executor executor, Handler handler, q0 q0Var, long j6, C0832y c0832y) throws CameraUnavailableException {
        e0 e0Var;
        C0927v c0927v = new C0927v(4);
        this.f36724f = c0927v;
        this.f36730m = 0;
        this.f36732p = new AtomicInteger(0);
        this.f36735s = new LinkedHashMap();
        this.f36736t = 0;
        this.f36705C = false;
        this.f36706D = false;
        this.f36707E = true;
        this.f36711I = new HashSet();
        this.f36712K = b0.f16434a;
        this.f36713L = new Object();
        this.f36714M = false;
        this.f36718V = new C0917l(this);
        this.f36720b = c7851q;
        this.f36738w = c0001a;
        this.f36739x = o0Var;
        ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d = new ScheduledExecutorServiceC3894d(handler);
        this.f36722d = scheduledExecutorServiceC3894d;
        ExecutorC3900j executorC3900j = new ExecutorC3900j(executor);
        this.f36721c = executorC3900j;
        this.f36727j = new C7611u(this, executorC3900j, scheduledExecutorServiceC3894d, j6);
        this.f36719a = new C2177b(str);
        ((d7.g0) c0927v.f5668b).m5319i(new h1(f0.CLOSED));
        C0927v c0927v2 = new C0927v(o0Var);
        this.f36725g = c0927v2;
        x0 x0Var = new x0(executorC3900j);
        this.f36709G = x0Var;
        this.f36715N = q0Var;
        this.f36740y = c0832y;
        try {
            C7843i c7843iM14835b = c7851q.m14835b(str);
            C7599i c7599i = new C7599i(c7843iM14835b, scheduledExecutorServiceC3894d, executorC3900j, new d0(29, this), c7613w.f36749h);
            this.f36726h = c7599i;
            this.f36728k = c7613w;
            c7613w.m14457a(c7599i);
            d7.g0 liveDataSource = (d7.g0) c0927v2.f5669c;
            C3505e c3505e = c7613w.f36747f;
            c3505e.getClass();
            AbstractC4154l.m8923f(liveDataSource, "liveDataSource");
            d7.d0 d0Var = c3505e.f18376o;
            if (d0Var != null && (e0Var = (e0) c3505e.f8102l.mo12062b(d0Var)) != null) {
                e0Var.f8099a.mo5320j(e0Var);
            }
            c3505e.f18376o = liveDataSource;
            o7.m11809d(new RunnableC0012k(24, c3505e, liveDataSource));
            this.f36716O = C8233c.m15408d(c7843iM14835b);
            this.f36731n = m14438C();
            this.f36710H = new x0(handler, c7613w.f36749h, AbstractC8523a.f41447a, scheduledExecutorServiceC3894d, executorC3900j, x0Var);
            i3 i3Var = c7613w.f36749h;
            this.f36741z = i3Var.m5728f(LegacyCameraOutputConfigNullPointerQuirk.class) || i3Var.m5728f(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.f36704B = c7613w.f36749h.m5728f(LegacyCameraSurfaceCleanupQuirk.class);
            C7608r c7608r = new C7608r(this, str);
            this.f36737v = c7608r;
            g1 g1Var = new g1(this);
            synchronized (o0Var.f16543b) {
                y0.m11056f("Camera is already registered: " + this, !o0Var.f16546e.containsKey(this));
                o0Var.f16546e.put(this, new n0(executorC3900j, g1Var, c7608r));
            }
            c7851q.f37624a.mo2552E(executorC3900j, c7608r);
            this.f36717T = new c1(context, str, c7851q, new C7451v(20), InterfaceC1893b.f8914S);
        } catch (CameraAccessExceptionCompat e2) {
            throw new CameraUnavailableException(e2);
        }
    }

    /* renamed from: A */
    public static String m14434A(b2 b2Var) {
        return b2Var.m2156g() + b2Var.hashCode();
    }

    /* renamed from: y */
    public static String m14435y(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: z */
    public static String m14436z(x0 x0Var) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        x0Var.getClass();
        sb2.append(x0Var.hashCode());
        return sb2.toString();
    }

    /* renamed from: B */
    public final boolean m14437B(x0 x0Var) {
        int i10;
        int i11;
        C0832y c0832y;
        x0Var.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.f36713L) {
            try {
                i10 = 0;
                i11 = this.f36738w.m4b() == 2 ? 1 : 0;
            } finally {
            }
        }
        C2177b c2177b = this.f36719a;
        c2177b.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : c2177b.f10051a.entrySet()) {
            if (((t2) entry.getValue()).f16589e) {
                arrayList2.add((t2) entry.getValue());
            }
        }
        for (t2 t2Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = t2Var.f16588d;
            if (list == null || list.get(i10) != y2.METERING_REPEATING) {
                if (t2Var.f16587c == null || t2Var.f16588d == null) {
                    t2Var.toString();
                    u1.m10951j("Camera2CameraImpl");
                    break;
                }
                g2 g2Var = t2Var.f16585a;
                w2 w2Var = t2Var.f16586b;
                for (v0 v0Var : g2Var.m7341b()) {
                    c1 c1Var = this.f36717T;
                    int iMo7291q = w2Var.mo7291q();
                    Size size = v0Var.f16607h;
                    j2 j2VarM7423z = w2Var.m7423z();
                    C3083n c3083nM14361l = c1Var.m14361l(iMo7291q);
                    m2 m2Var = m2.CAPTURE_SESSION_TABLES;
                    j2 j2Var = p2.f16554e;
                    p2 p2VarM11531b = a0.m11531b(iMo7291q, size, c3083nM14361l, i11, m2Var, j2VarM7423z);
                    int iMo7291q2 = w2Var.mo7291q();
                    Size size2 = v0Var.f16607h;
                    C3082m c3082m = t2Var.f16587c;
                    c0.a0 a0Var = c3082m.f16524c;
                    List list2 = t2Var.f16588d;
                    s0 s0Var = c3082m.f16527f;
                    int i12 = c3082m.f16525d;
                    Range range = c3082m.f16526e;
                    Boolean bool = (Boolean) w2Var.mo7401e(w2.f44350z0, Boolean.FALSE);
                    Objects.requireNonNull(bool);
                    arrayList.add(new C3074e(p2VarM11531b, iMo7291q2, size2, a0Var, list2, s0Var, i12, range, bool.booleanValue()));
                    i10 = 0;
                }
            }
        }
        HashMap map = new HashMap();
        map.put((w0) x0Var.f36756d, Collections.singletonList((Size) x0Var.f36757e));
        try {
            this.f36717T.m14359j(i11, arrayList, map, false, false, false);
            m14455w("Surface combination with metering repeating supported!");
            c0832y = this.f36740y;
        } catch (IllegalArgumentException unused) {
            m14455w("Surface combination with metering repeating  not supported!");
        }
        if (c0832y != null) {
            o1 o1Var = c0832y.f5284a;
            C3076g c3076g = C0832y.f5283n;
            Object objMo7406k = Boolean.TRUE;
            try {
                objMo7406k = o1Var.mo7406k(c3076g);
            } catch (IllegalArgumentException unused2) {
            }
            if (!((Boolean) objMo7406k).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final o0 m14438C() {
        Object objMo7406k;
        o0 o0Var;
        synchronized (this.f36713L) {
            try {
                C0832y c0832y = this.f36740y;
                if (c0832y != null) {
                    C3076g c3076g = AbstractC0514f.f3581a;
                    try {
                        objMo7406k = c0832y.f5284a.mo7406k(AbstractC0514f.f3581a);
                    } catch (IllegalArgumentException unused) {
                        objMo7406k = null;
                    }
                    if (objMo7406k != null) {
                        throw new ClassCastException();
                    }
                }
                o0Var = new o0(this.f36716O, this.f36728k.f36749h, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o0Var;
    }

    /* renamed from: D */
    public final void m14439D(boolean z6) throws CameraAccessException {
        if (!z6) {
            this.f36727j.f36701e.f30136b = -1L;
        }
        this.f36727j.m14430a();
        this.f36718V.m2640d();
        m14455w("Opening camera.");
        m14442G(EnumC7610t.OPENING);
        try {
            this.f36720b.f37624a.mo2550C(this.f36728k.f36742a, this.f36721c, m14454v());
        } catch (CameraAccessExceptionCompat e2) {
            m14455w("Unable to open camera due to " + e2.getMessage());
            if (e2.f1819a == 10001) {
                m14443H(EnumC7610t.INITIALIZED, new C0812e(e2, 7), true);
                return;
            }
            C0917l c0917l = this.f36718V;
            if (((C7612v) c0917l.f5595c).f36723e != EnumC7610t.OPENING) {
                ((C7612v) c0917l.f5595c).m14455w("Don't need the onError timeout handler.");
                return;
            }
            ((C7612v) c0917l.f5595c).m14455w("Camera waiting for onError.");
            c0917l.m2640d();
            c0917l.f5594b = new C7439j(c0917l);
        } catch (SecurityException e10) {
            m14455w("Unable to open camera due to " + e10.getMessage());
            m14442G(EnumC7610t.REOPENING);
            this.f36727j.m14431b();
        } catch (RuntimeException unused) {
            m14455w("Unexpected error occurred when opening camera.");
            m14443H(EnumC7610t.OPENING_WITH_ERROR, new C0812e(null, 6), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m14440E() {
        y0.m11056f(null, this.f36723e == EnumC7610t.OPENED);
        f2 f2VarM5868d = this.f36719a.m5868d();
        if (!f2VarM5868d.m7338c()) {
            m14455w("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f36739x.m7398e(this.f36729l.getId(), this.f36738w.m5c(this.f36729l.getId()))) {
            m14455w("Unable to create capture session in camera operating mode = " + this.f36738w.m4b());
            return;
        }
        HashMap map = new HashMap();
        Collection<g2> sessionConfigs = this.f36719a.m5869e();
        Collection useCaseConfigs = this.f36719a.m5870f();
        C3076g c3076g = z0.f36763a;
        AbstractC4154l.m8923f(sessionConfigs, "sessionConfigs");
        AbstractC4154l.m8923f(useCaseConfigs, "useCaseConfigs");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator it = sessionConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g2 g2Var = (g2) it.next();
            if (g2Var.f16473g.f16566b.f16550a.containsKey(c3076g) && g2Var.m7341b().size() != 1) {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(g2Var.m7341b().size())}, 1));
                u1.m10943b("StreamUseCaseUtil");
                break;
            }
            if (g2Var.f16473g.f16566b.f16550a.containsKey(c3076g)) {
                int i10 = 0;
                for (g2 g2Var2 : sessionConfigs) {
                    if (((w2) arrayList.get(i10)).mo7421E() == y2.METERING_REPEATING) {
                        AbstractC4154l.m8922e(g2Var2.m7341b(), "getSurfaces(...)");
                        y0.m11056f("MeteringRepeating should contain a surface", !r11.isEmpty());
                        map.put(g2Var2.m7341b().get(0), 1L);
                    } else if (g2Var2.f16473g.f16566b.f16550a.containsKey(c3076g)) {
                        List listM7341b = g2Var2.m7341b();
                        AbstractC4154l.m8922e(listM7341b, "getSurfaces(...)");
                        if (!listM7341b.isEmpty()) {
                            Object obj = g2Var2.m7341b().get(0);
                            Object objMo7406k = g2Var2.f16473g.f16566b.mo7406k(c3076g);
                            AbstractC4154l.m8920c(objMo7406k);
                            map.put(obj, objMo7406k);
                        }
                    }
                    i10++;
                }
            }
        }
        map.toString();
        u1.m10942a("StreamUseCaseUtil");
        o0 o0Var = this.f36731n;
        synchronized (o0Var.f36644a) {
            o0Var.f36656m = map;
        }
        o0 o0Var2 = this.f36731n;
        g2 g2VarM7337b = f2VarM5868d.m7337b();
        CameraDevice cameraDevice = this.f36729l;
        cameraDevice.getClass();
        x0 x0Var = this.f36710H;
        InterfaceFutureC8957d interfaceFutureC8957dM14417l = o0Var2.m14417l(g2VarM7337b, cameraDevice, new g1((Handler) x0Var.f36756d, (i3) x0Var.f36758f, (i3) x0Var.f36759g, (ScheduledExecutorServiceC3894d) x0Var.f36755c, (ExecutorC3900j) x0Var.f36754b, (x0) x0Var.f36757e));
        interfaceFutureC8957dM14417l.mo9026a(new RunnableC4307g((int) (null == true ? 1 : 0), (Object) interfaceFutureC8957dM14417l, (Object) new C0910e(19, this, o0Var2, false)), this.f36721c);
    }

    /* renamed from: F */
    public final void m14441F() {
        g2 g2Var;
        List listUnmodifiableList;
        y0.m11056f(null, this.f36731n != null);
        m14455w("Resetting Capture Session");
        o0 o0Var = this.f36731n;
        synchronized (o0Var.f36644a) {
            g2Var = o0Var.f36649f;
        }
        synchronized (o0Var.f36644a) {
            listUnmodifiableList = Collections.unmodifiableList(o0Var.f36645b);
        }
        o0 o0VarM14438C = m14438C();
        this.f36731n = o0VarM14438C;
        o0VarM14438C.m14419n(g2Var);
        this.f36731n.m14415j(listUnmodifiableList);
        if (this.f36723e.ordinal() != 9) {
            m14455w("Skipping Capture Session state check due to current camera state: " + this.f36723e + " and previous session status: " + o0Var.m14413h());
        } else if (this.f36741z && o0Var.m14413h()) {
            m14455w("Close camera before creating new session");
            m14442G(EnumC7610t.REOPENING_QUIRK);
        }
        if (this.f36704B && o0Var.m14413h()) {
            m14455w("ConfigAndClose is required when close the camera.");
            this.f36705C = true;
        }
        o0Var.m14410b();
        InterfaceFutureC8957d interfaceFutureC8957dM14418m = o0Var.m14418m();
        m14455w("Releasing session in state " + this.f36723e.name());
        this.f36735s.put(o0Var, interfaceFutureC8957dM14418m);
        interfaceFutureC8957dM14418m.mo9026a(new RunnableC4307g(0, interfaceFutureC8957dM14418m, new C0908c(17, this, o0Var)), t8.m11872a());
    }

    /* renamed from: G */
    public final void m14442G(EnumC7610t enumC7610t) {
        m14443H(enumC7610t, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:28:0x009b, B:30:0x00a2, B:32:0x00ac, B:49:0x00e9, B:53:0x00ef, B:55:0x00f8, B:57:0x00fc, B:59:0x010c, B:62:0x0114, B:64:0x0118, B:65:0x0127, B:67:0x012d, B:69:0x013f, B:77:0x016b, B:78:0x016e, B:70:0x014f, B:72:0x0153, B:74:0x0157, B:34:0x00b4, B:37:0x00cb, B:44:0x00d9, B:46:0x00e0), top: B:99:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14443H(p020v.EnumC7610t r10, c0.C0812e r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.C7612v.m14443H(v.t, c0.e, boolean):void");
    }

    /* renamed from: I */
    public final ArrayList m14444I(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            boolean z6 = this.f36707E;
            String strM14434A = m14434A(b2Var);
            Class<?> cls = b2Var.getClass();
            g2 g2Var = z6 ? b2Var.f5059n : b2Var.f5060o;
            w2 w2Var = b2Var.f5052g;
            C3082m c3082m = b2Var.f5053h;
            arrayList2.add(new C7592b(strM14434A, cls, g2Var, w2Var, c3082m != null ? c3082m.f16522a : null, c3082m, b2Var.m2152c() != null ? C7294d.m13626H(b2Var) : null));
        }
        return arrayList2;
    }

    /* renamed from: J */
    public final void m14445J(ArrayList arrayList) throws CameraAccessException {
        boolean z6;
        t2 t2Var;
        Size size;
        boolean zIsEmpty = this.f36719a.m5869e().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        Rational rational = null;
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            C7592b c7592b = (C7592b) obj;
            if (!this.f36719a.m5871g(c7592b.f36475a)) {
                C2177b c2177b = this.f36719a;
                String str = c7592b.f36475a;
                g2 g2Var = c7592b.f36477c;
                w2 w2Var = c7592b.f36478d;
                C3082m c3082m = c7592b.f36480f;
                List list = c7592b.f36481g;
                LinkedHashMap linkedHashMap = c2177b.f10051a;
                t2 t2Var2 = (t2) linkedHashMap.get(str);
                if (t2Var2 == null) {
                    t2Var = new t2(g2Var, w2Var, c3082m, list);
                    linkedHashMap.put(str, t2Var);
                } else {
                    t2Var = t2Var2;
                }
                t2Var.f16589e = true;
                c2177b.m5872h(str, g2Var, w2Var, c3082m, list);
                arrayList2.add(c7592b.f36475a);
                if (c7592b.f36476b == k1.class && (size = c7592b.f36479e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        m14455w("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            z6 = true;
            this.f36726h.m14396m(true);
            C7599i c7599i = this.f36726h;
            synchronized (c7599i.f36572d) {
                c7599i.f36585q++;
            }
        } else {
            z6 = true;
        }
        m14451s();
        m14450O();
        m14449N();
        m14448M();
        m14441F();
        EnumC7610t enumC7610t = this.f36723e;
        EnumC7610t enumC7610t2 = EnumC7610t.OPENED;
        if (enumC7610t == enumC7610t2) {
            m14440E();
        } else {
            int iOrdinal = this.f36723e.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                m14446K(false);
            } else if (iOrdinal != 5) {
                m14455w("open() ignored due to being in state: " + this.f36723e);
            } else {
                m14442G(EnumC7610t.REOPENING);
                if (!this.f36735s.isEmpty() && !this.f36706D && this.f36730m == 0) {
                    if (this.f36729l == null) {
                        z6 = false;
                    }
                    y0.m11056f("Camera Device should be open if session close is not complete", z6);
                    m14442G(enumC7610t2);
                    m14440E();
                }
            }
        }
        if (rational != null) {
            this.f36726h.f36576h.getClass();
        }
    }

    /* renamed from: K */
    public final void m14446K(boolean z6) throws CameraAccessException {
        m14455w("Attempting to force open the camera.");
        if (this.f36739x.m7397d(this)) {
            m14439D(z6);
        } else {
            m14455w("No cameras available. Waiting for available camera before opening camera.");
            m14442G(EnumC7610t.PENDING_OPEN);
        }
    }

    /* renamed from: L */
    public final void m14447L(boolean z6) throws CameraAccessException {
        m14455w("Attempting to open the camera.");
        if (this.f36737v.f36678b && this.f36739x.m7397d(this)) {
            m14439D(z6);
        } else {
            m14455w("No cameras available. Waiting for available camera before opening camera.");
            m14442G(EnumC7610t.PENDING_OPEN);
        }
    }

    /* renamed from: M */
    public final void m14448M() {
        f2 f2VarM5867c = this.f36719a.m5867c();
        boolean zM7338c = f2VarM5867c.m7338c();
        C7599i c7599i = this.f36726h;
        if (!zM7338c) {
            c7599i.f36591w = 1;
            c7599i.f36576h.f36683c = 1;
            c7599i.f36583o.getClass();
            this.f36731n.m14419n(c7599i.m14395j());
            return;
        }
        int i10 = f2VarM5867c.m7337b().f16473g.f16567c;
        c7599i.f36591w = i10;
        c7599i.f36576h.f36683c = i10;
        c7599i.f36583o.getClass();
        f2VarM5867c.m7336a(c7599i.m14395j());
        this.f36731n.m14419n(f2VarM5867c.m7337b());
    }

    /* renamed from: N */
    public final void m14449N() {
        if (C0058f.m162b(this.f36728k.f36743b)) {
            f2 f2VarM5867c = this.f36719a.m5867c();
            if (f2VarM5867c.m7338c()) {
                int iIntValue = ((Integer) f2VarM5867c.m7337b().f16473g.m7410a().getUpper()).intValue();
                C7599i c7599i = this.f36726h;
                if (iIntValue > 30) {
                    c7599i.m14397n(true);
                } else {
                    c7599i.m14397n(false);
                }
            }
        }
    }

    /* renamed from: O */
    public final void m14450O() {
        Iterator it = this.f36719a.m5870f().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((w2) it.next()).mo7401e(w2.A0, Boolean.FALSE)).booleanValue();
        }
        C4719b c4719b = this.f36726h.f36581m;
        if (c4719b.f23612a != zBooleanValue && zBooleanValue) {
            c4719b.m9587b();
        }
        c4719b.f23612a = zBooleanValue;
    }

    @Override // i0.g0
    /* renamed from: a */
    public final InterfaceFutureC8957d mo7308a() {
        return i7.m11697b(new C7602l(this, 4));
    }

    @Override // i0.g0
    /* renamed from: b */
    public final n1 mo7309b() {
        return this.f36724f;
    }

    @Override // c0.a2
    /* renamed from: d */
    public final void mo2143d(b2 b2Var) {
        this.f36721c.execute(new RunnableC7605o(this, m14434A(b2Var), this.f36707E ? b2Var.f5059n : b2Var.f5060o, b2Var.f5052g, b2Var.f5053h, b2Var.m2152c() == null ? null : C7294d.m13626H(b2Var), 1));
    }

    @Override // c0.a2
    /* renamed from: e */
    public final void mo2144e(b2 b2Var) {
        this.f36721c.execute(new RunnableC7605o(this, m14434A(b2Var), this.f36707E ? b2Var.f5059n : b2Var.f5060o, b2Var.f5052g, b2Var.f5053h, b2Var.m2152c() == null ? null : C7294d.m13626H(b2Var), 2));
    }

    @Override // c0.a2
    /* renamed from: g */
    public final void mo2145g(b2 b2Var) {
        this.f36721c.execute(new RunnableC7605o(this, m14434A(b2Var), this.f36707E ? b2Var.f5059n : b2Var.f5060o, b2Var.f5052g, b2Var.f5053h, b2Var.m2152c() == null ? null : C7294d.m13626H(b2Var), 0));
    }

    @Override // i0.g0
    /* renamed from: h */
    public final i0.d0 mo7311h() {
        return this.f36726h;
    }

    @Override // i0.g0
    /* renamed from: i */
    public final InterfaceC3094y mo7312i() {
        return this.f36712K;
    }

    @Override // i0.g0
    /* renamed from: j */
    public final void mo7313j(boolean z6) {
        this.f36721c.execute(new RunnableC0510b(this, z6, 1));
    }

    @Override // i0.g0
    /* renamed from: k */
    public final void mo7314k(Collection collection) {
        C7599i c7599i = this.f36726h;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (c7599i.f36572d) {
            c7599i.f36585q++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.f36711I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            String strM14434A = m14434A(b2Var);
            if (!hashSet.contains(strM14434A)) {
                hashSet.add(strM14434A);
                b2Var.mo2170u();
                b2Var.mo2168s();
            }
        }
        try {
            this.f36721c.execute(new RunnableC7604n(this, new ArrayList(m14444I(arrayList)), 0));
        } catch (RejectedExecutionException unused) {
            m14455w("Unable to attach use cases.");
            c7599i.m14394i();
        }
    }

    @Override // i0.g0
    /* renamed from: l */
    public final void mo7315l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(m14444I(arrayList2));
        ArrayList arrayList4 = new ArrayList(arrayList2);
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            String strM14434A = m14434A(b2Var);
            HashSet hashSet = this.f36711I;
            if (hashSet.contains(strM14434A)) {
                b2Var.mo2171v();
                hashSet.remove(strM14434A);
            }
        }
        this.f36721c.execute(new RunnableC7604n(this, arrayList3, 1));
    }

    @Override // i0.g0
    /* renamed from: m */
    public final void mo7339m() {
        this.f36721c.execute(new RunnableC7601k(this, 1));
    }

    @Override // i0.g0
    /* renamed from: n */
    public final void mo7316n(InterfaceC3094y interfaceC3094y) {
        if (interfaceC3094y == null) {
            interfaceC3094y = b0.f16434a;
        }
        interfaceC3094y.m7432F();
        this.f36712K = interfaceC3094y;
        synchronized (this.f36713L) {
        }
    }

    @Override // i0.g0
    /* renamed from: p */
    public final void mo7318p(boolean z6) {
        this.f36707E = z6;
    }

    @Override // i0.g0
    /* renamed from: q */
    public final i0.e0 mo7319q() {
        return this.f36728k;
    }

    @Override // c0.a2
    /* renamed from: r */
    public final void mo2146r(b2 b2Var) {
        this.f36721c.execute(new RunnableC6224g(12, this, m14434A(b2Var)));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14451s() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.C7612v.m14451s():void");
    }

    /* renamed from: t */
    public final void m14452t() {
        ArrayList arrayList;
        int i10 = 0;
        y0.m11056f("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f36723e + " (error: " + m14435y(this.f36730m) + ")", this.f36723e == EnumC7610t.CLOSING || this.f36723e == EnumC7610t.RELEASING || (this.f36723e == EnumC7610t.REOPENING && this.f36730m != 0));
        m14441F();
        o0 o0Var = this.f36731n;
        synchronized (o0Var.f36644a) {
            try {
                if (o0Var.f36645b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(o0Var.f36645b);
                    o0Var.f36645b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                q0 q0Var = (q0) obj;
                for (AbstractC3084o abstractC3084o : q0Var.f16568d) {
                    Object obj2 = q0Var.f16570f.f16577a.get("CAPTURE_CONFIG_ID_KEY");
                    abstractC3084o.mo82a(obj2 == null ? -1 : ((Integer) obj2).intValue());
                }
            }
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f36728k.f36742a);
    }

    /* renamed from: u */
    public final void m14453u() {
        y0.m11056f(null, this.f36723e == EnumC7610t.RELEASING || this.f36723e == EnumC7610t.CLOSING);
        y0.m11056f(null, this.f36735s.isEmpty());
        if (!this.f36705C) {
            m14456x();
            return;
        }
        if (this.f36706D) {
            m14455w("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f36737v.f36678b) {
            this.f36705C = false;
            m14456x();
            m14455w("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            m14455w("Open camera to configAndClose");
            C8302l c8302lM11697b = i7.m11697b(new C7602l(this, 0));
            this.f36706D = true;
            c8302lM11697b.f39850b.mo9026a(new RunnableC7601k(this, 0), this.f36721c);
        }
    }

    /* renamed from: v */
    public final CameraDevice.StateCallback m14454v() {
        ArrayList arrayList = new ArrayList(this.f36719a.m5868d().m7337b().f16469c);
        arrayList.add((h0) this.f36709G.f36759g);
        arrayList.add(this.f36727j);
        return a6.m11533a(arrayList);
    }

    /* renamed from: w */
    public final void m14455w(String str) {
        toString();
        u1.m10947f(3, u1.m10950i("Camera2CameraImpl"));
    }

    /* renamed from: x */
    public final void m14456x() {
        y0.m11056f(null, this.f36723e == EnumC7610t.RELEASING || this.f36723e == EnumC7610t.CLOSING);
        y0.m11056f(null, this.f36735s.isEmpty());
        this.f36729l = null;
        if (this.f36723e == EnumC7610t.CLOSING) {
            m14442G(EnumC7610t.INITIALIZED);
            return;
        }
        this.f36720b.f37624a.mo2553F(this.f36737v);
        m14442G(EnumC7610t.RELEASED);
        C8299i c8299i = this.f36734r;
        if (c8299i != null) {
            c8299i.m15507b(null);
            this.f36734r = null;
        }
    }
}
