package p001o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p001o.bhf;
import p001o.cd2;
import p001o.d72;
import p001o.g32;
import p001o.mq3;
import p001o.rd2;
import p001o.sc8;
import p001o.z82;

/* loaded from: classes2.dex */
public class m42 implements z82 {

    /* renamed from: b */
    public final C15216b f34741b;

    /* renamed from: c */
    public final Executor f34742c;

    /* renamed from: d */
    public final Object f34743d = new Object();

    /* renamed from: e */
    public final s82 f34744e;

    /* renamed from: f */
    public final z82.InterfaceC18577d f34745f;

    /* renamed from: g */
    public final bhf.C12402b f34746g;

    /* renamed from: h */
    public final b77 f34747h;

    /* renamed from: i */
    public final gfj f34748i;

    /* renamed from: j */
    public final ssh f34749j;

    /* renamed from: k */
    public final fp6 f34750k;

    /* renamed from: l */
    public lfj f34751l;

    /* renamed from: m */
    public final y32 f34752m;

    /* renamed from: n */
    public final t52 f34753n;

    /* renamed from: o */
    public final mvi f34754o;

    /* renamed from: p */
    public int f34755p;

    /* renamed from: q */
    public sc8.InterfaceC16805i f34756q;

    /* renamed from: r */
    public volatile boolean f34757r;

    /* renamed from: s */
    public volatile int f34758s;

    /* renamed from: t */
    public final o70 f34759t;

    /* renamed from: u */
    public final p31 f34760u;

    /* renamed from: v */
    public final AtomicLong f34761v;

    /* renamed from: w */
    public volatile zfa f34762w;

    /* renamed from: x */
    public int f34763x;

    /* renamed from: y */
    public long f34764y;

    /* renamed from: z */
    public final C15215a f34765z;

    /* renamed from: o.m42$a */
    public static final class C15215a extends j72 {

        /* renamed from: a */
        public Set f34766a = new HashSet();

        /* renamed from: b */
        public Map f34767b = new ArrayMap();

        @Override // p001o.j72
        /* renamed from: a */
        public void mo18247a(final int i) {
            for (final j72 j72Var : this.f34766a) {
                try {
                    ((Executor) this.f34767b.get(j72Var)).execute(new Runnable() { // from class: o.k42
                        @Override // java.lang.Runnable
                        public final void run() {
                            j72Var.mo18247a(i);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    wja.m54630d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(final int i, final u72 u72Var) {
            for (final j72 j72Var : this.f34766a) {
                try {
                    ((Executor) this.f34767b.get(j72Var)).execute(new Runnable() { // from class: o.l42
                        @Override // java.lang.Runnable
                        public final void run() {
                            j72Var.mo4682b(i, u72Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    wja.m54630d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // p001o.j72
        /* renamed from: c */
        public void mo18248c(final int i, final l72 l72Var) {
            for (final j72 j72Var : this.f34766a) {
                try {
                    ((Executor) this.f34767b.get(j72Var)).execute(new Runnable() { // from class: o.j42
                        @Override // java.lang.Runnable
                        public final void run() {
                            j72Var.mo18248c(i, l72Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    wja.m54630d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        /* renamed from: h */
        public void m38333h(Executor executor, j72 j72Var) {
            this.f34766a.add(j72Var);
            this.f34767b.put(j72Var, executor);
        }

        /* renamed from: l */
        public void m38334l(j72 j72Var) {
            this.f34766a.remove(j72Var);
            this.f34767b.remove(j72Var);
        }
    }

    /* renamed from: o.m42$b */
    public static final class C15216b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final Set f34768a = new HashSet();

        /* renamed from: b */
        public final Executor f34769b;

        public C15216b(Executor executor) {
            this.f34769b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m38336c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (InterfaceC15217c interfaceC15217c : this.f34768a) {
                if (interfaceC15217c.mo16542a(totalCaptureResult)) {
                    hashSet.add(interfaceC15217c);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f34768a.removeAll(hashSet);
        }

        /* renamed from: b */
        public void m38337b(InterfaceC15217c interfaceC15217c) {
            this.f34768a.add(interfaceC15217c);
        }

        /* renamed from: d */
        public void m38338d(InterfaceC15217c interfaceC15217c) {
            this.f34768a.remove(interfaceC15217c);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f34769b.execute(new Runnable() { // from class: o.n42
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36344a.m38336c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: o.m42$c */
    public interface InterfaceC15217c {
        /* renamed from: a */
        boolean mo16542a(TotalCaptureResult totalCaptureResult);
    }

    public m42(s82 s82Var, ScheduledExecutorService scheduledExecutorService, Executor executor, z82.InterfaceC18577d interfaceC18577d, l5e l5eVar) {
        bhf.C12402b c12402b = new bhf.C12402b();
        this.f34746g = c12402b;
        this.f34755p = 0;
        this.f34757r = false;
        this.f34758s = 2;
        this.f34761v = new AtomicLong(0L);
        this.f34762w = bn7.m19430p(null);
        this.f34763x = 1;
        this.f34764y = 0L;
        C15215a c15215a = new C15215a();
        this.f34765z = c15215a;
        this.f34744e = s82Var;
        this.f34745f = interfaceC18577d;
        this.f34742c = executor;
        this.f34754o = new mvi(executor);
        C15216b c15216b = new C15216b(executor);
        this.f34741b = c15216b;
        c12402b.m19060x(this.f34763x);
        c12402b.m19047j(ad2.m16892e(c15216b));
        c12402b.m19047j(c15215a);
        this.f34750k = new fp6(this, s82Var, executor);
        this.f34747h = new b77(this, scheduledExecutorService, executor, l5eVar);
        this.f34748i = new gfj(this, s82Var, executor);
        this.f34749j = new ssh(this, s82Var, executor);
        this.f34751l = new pfj(s82Var);
        this.f34759t = new o70(l5eVar);
        this.f34760u = new p31(l5eVar);
        this.f34752m = new y32(this, executor);
        this.f34753n = new t52(this, s82Var, l5eVar, executor, scheduledExecutorService);
    }

    /* renamed from: D */
    public static int m38284D(s82 s82Var, int i) {
        int[] iArr = (int[]) s82Var.m47965a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m38285N(i, iArr) ? i : m38285N(1, iArr) ? 1 : 0;
    }

    /* renamed from: N */
    public static boolean m38285N(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m38286O(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof wig) && (l = (Long) ((wig) tag).m54617d("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m38287Q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m38288R(Executor executor, j72 j72Var) {
        this.f34765z.m38333h(executor, j72Var);
    }

    /* renamed from: S */
    public static /* synthetic */ void m38289S() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ zfa m38290T(int i, int i2, int i3, Void r4) {
        return bn7.m19430p(this.f34753n.m49332c(i, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m38291U(j72 j72Var) {
        this.f34765z.m38334l(j72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ zfa m38292V(List list, int i, int i2, int i3, Void r5) {
        return this.f34753n.m49335i(list, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m38293W(g32.C13614a c13614a) {
        bn7.m19408C(k0(j0()), c13614a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ Object m38294X(final g32.C13614a c13614a) {
        this.f34742c.execute(new Runnable() { // from class: o.h42
            @Override // java.lang.Runnable
            public final void run() {
                this.f26188a.m38293W(c13614a);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* renamed from: Y */
    public static /* synthetic */ boolean m38295Y(long j, g32.C13614a c13614a, TotalCaptureResult totalCaptureResult) {
        if (!m38286O(totalCaptureResult, j)) {
            return false;
        }
        c13614a.m28005c(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Object m38296Z(final long j, final g32.C13614a c13614a) {
        m38320t(new InterfaceC15217c() { // from class: o.z32
            @Override // p001o.m42.InterfaceC15217c
            /* renamed from: a */
            public final boolean mo16542a(TotalCaptureResult totalCaptureResult) {
                return m42.m38295Y(j, c13614a, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: A */
    public bhf m38307A() {
        this.f34746g.m19060x(this.f34763x);
        this.f34746g.m19056t(m38308B());
        this.f34746g.m19051n("CameraControlSessionUpdateId", Long.valueOf(this.f34764y));
        return this.f34746g.m19052o();
    }

    /* renamed from: B */
    public mq3 m38308B() {
        d72.C12801a c12801a = new d72.C12801a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        mq3.EnumC15404c enumC15404c = mq3.EnumC15404c.REQUIRED;
        c12801a.m22396g(key, 1, enumC15404c);
        this.f34747h.m18233g(c12801a);
        this.f34759t.m41655a(c12801a);
        this.f34748i.m28558a(c12801a);
        int iM42937a = this.f34747h.m18245s() ? 5 : 1;
        if (this.f34757r) {
            c12801a.m22396g(CaptureRequest.FLASH_MODE, 2, enumC15404c);
        } else {
            int i = this.f34758s;
            if (i == 0) {
                iM42937a = this.f34760u.m42937a(2);
            } else if (i == 1) {
                iM42937a = 3;
            } else if (i == 2) {
                iM42937a = 1;
            }
        }
        c12801a.m22396g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m38309C(iM42937a)), enumC15404c);
        c12801a.m22396g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(m38311F(1)), enumC15404c);
        this.f34750k.m27318c(c12801a);
        this.f34752m.m57175i(c12801a);
        return c12801a.m22392c();
    }

    /* renamed from: C */
    public int m38309C(int i) {
        return m38284D(this.f34744e, i);
    }

    /* renamed from: E */
    public int m38310E(int i) {
        int[] iArr = (int[]) this.f34744e.m47965a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m38285N(i, iArr)) {
            return i;
        }
        if (m38285N(4, iArr)) {
            return 4;
        }
        return m38285N(1, iArr) ? 1 : 0;
    }

    /* renamed from: F */
    public final int m38311F(int i) {
        int[] iArr = (int[]) this.f34744e.m47965a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m38285N(i, iArr) ? i : m38285N(1, iArr) ? 1 : 0;
    }

    /* renamed from: G */
    public ssh m38312G() {
        return this.f34749j;
    }

    /* renamed from: H */
    public int m38313H() {
        int i;
        synchronized (this.f34743d) {
            i = this.f34755p;
        }
        return i;
    }

    /* renamed from: I */
    public gfj m38314I() {
        return this.f34748i;
    }

    /* renamed from: J */
    public lfj m38315J() {
        return this.f34751l;
    }

    /* renamed from: K */
    public void m38316K() {
        synchronized (this.f34743d) {
            this.f34755p++;
        }
    }

    /* renamed from: L */
    public final boolean m38317L() {
        return m38313H() > 0;
    }

    /* renamed from: M */
    public boolean m38318M() {
        int iM39730a = this.f34754o.m39730a();
        wja.m54627a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iM39730a);
        return iM39730a > 0;
    }

    /* renamed from: P */
    public boolean m38319P() {
        return this.f34757r;
    }

    @Override // p001o.z82
    /* renamed from: a */
    public void mo37109a(bhf.C12402b c12402b) {
        this.f34751l.mo37131a(c12402b);
    }

    public void a0(InterfaceC15217c interfaceC15217c) {
        this.f34741b.m38338d(interfaceC15217c);
    }

    @Override // p001o.z82
    /* renamed from: b */
    public void mo37110b(sc8.InterfaceC16805i interfaceC16805i) {
        this.f34756q = interfaceC16805i;
    }

    public void b0(final j72 j72Var) {
        this.f34742c.execute(new Runnable() { // from class: o.g42
            @Override // java.lang.Runnable
            public final void run() {
                this.f24554a.m38291U(j72Var);
            }
        });
    }

    @Override // p001o.z82
    /* renamed from: c */
    public zfa mo37111c(final List list, final int i, final int i2) {
        if (m38317L()) {
            final int iM38324x = m38324x();
            return rm7.m46957a(bn7.m19407B(this.f34762w)).m46961e(new wr0() { // from class: o.e42
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f20946a.m38292V(list, i, iM38324x, i2, (Void) obj);
                }
            }, this.f34742c);
        }
        wja.m54638l("Camera2CameraControlImp", "Camera is not active.");
        return bn7.m19428n(new y82("Camera is not active."));
    }

    public void c0() {
        f0(1);
    }

    @Override // p001o.z82
    /* renamed from: d */
    public Rect mo37112d() {
        Rect rect = (Rect) this.f34744e.m47965a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) fgd.m26663g(rect);
    }

    public void d0(boolean z) {
        wja.m54627a("Camera2CameraControlImp", "setActive: isActive = " + z);
        this.f34747h.m18246z(z);
        this.f34748i.m28560f(z);
        this.f34749j.m48892e(z);
        this.f34750k.m27317b(z);
        this.f34752m.m57181t(z);
        if (z) {
            return;
        }
        this.f34756q = null;
        this.f34754o.m39731b();
    }

    @Override // p001o.z82
    /* renamed from: e */
    public void mo37113e(int i) {
        if (!m38317L()) {
            wja.m54638l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f34758s = i;
        wja.m54627a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f34758s);
        lfj lfjVar = this.f34751l;
        boolean z = true;
        if (this.f34758s != 1 && this.f34758s != 0) {
            z = false;
        }
        lfjVar.mo37133c(z);
        this.f34762w = i0();
    }

    public void e0(Rational rational) {
        this.f34747h.m18227A(rational);
    }

    @Override // p001o.z82
    /* renamed from: f */
    public mq3 mo37114f() {
        return this.f34752m.m57180n();
    }

    public void f0(int i) {
        this.f34763x = i;
        this.f34747h.m18228B(i);
        this.f34753n.m49334h(this.f34763x);
    }

    @Override // p001o.z82
    /* renamed from: g */
    public void mo37115g(mq3 mq3Var) {
        this.f34752m.m57173g(rd2.C16591a.m46538e(mq3Var).m46540d()).addListener(new Runnable() { // from class: o.f42
            @Override // java.lang.Runnable
            public final void run() {
                m42.m38287Q();
            }
        }, gb2.m28293a());
    }

    public void g0(boolean z) {
        this.f34751l.mo37134d(z);
    }

    @Override // p001o.z82
    /* renamed from: h */
    public zfa mo37116h(final int i, final int i2) {
        if (m38317L()) {
            final int iM38324x = m38324x();
            return rm7.m46957a(bn7.m19407B(this.f34762w)).m46961e(new wr0() { // from class: o.b42
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f15523a.m38290T(i, iM38324x, i2, (Void) obj);
                }
            }, this.f34742c);
        }
        wja.m54638l("Camera2CameraControlImp", "Camera is not active.");
        return bn7.m19428n(new y82("Camera is not active."));
    }

    public void h0(List list) {
        this.f34745f.mo26133b(list);
    }

    @Override // p001o.z82
    /* renamed from: i */
    public void mo37117i() {
        this.f34752m.m57176j().addListener(new Runnable() { // from class: o.c42
            @Override // java.lang.Runnable
            public final void run() {
                m42.m38289S();
            }
        }, gb2.m28293a());
    }

    public zfa i0() {
        return bn7.m19407B(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.a42
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f14116a.m38294X(c13614a);
            }
        }));
    }

    public long j0() {
        this.f34764y = this.f34761v.getAndIncrement();
        this.f34745f.mo26132a();
        return this.f34764y;
    }

    public final zfa k0(final long j) {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.i42
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f28005a.m38296Z(j, c13614a);
            }
        });
    }

    /* renamed from: t */
    public void m38320t(InterfaceC15217c interfaceC15217c) {
        this.f34741b.m38337b(interfaceC15217c);
    }

    /* renamed from: u */
    public void m38321u(final Executor executor, final j72 j72Var) {
        this.f34742c.execute(new Runnable() { // from class: o.d42
            @Override // java.lang.Runnable
            public final void run() {
                this.f19082a.m38288R(executor, j72Var);
            }
        });
    }

    /* renamed from: v */
    public void m38322v() {
        synchronized (this.f34743d) {
            int i = this.f34755p;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f34755p = i - 1;
        }
    }

    /* renamed from: w */
    public void m38323w(boolean z) {
        this.f34757r = z;
        if (!z) {
            cd2.C12638a c12638a = new cd2.C12638a();
            c12638a.m20911t(this.f34763x);
            c12638a.m20912u(true);
            d72.C12801a c12801a = new d72.C12801a();
            c12801a.m22395f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m38309C(1)));
            c12801a.m22395f(CaptureRequest.FLASH_MODE, 0);
            c12638a.m20898e(c12801a.m22392c());
            h0(Collections.singletonList(c12638a.m20901h()));
        }
        j0();
    }

    /* renamed from: x */
    public int m38324x() {
        return this.f34758s;
    }

    /* renamed from: y */
    public b77 m38325y() {
        return this.f34747h;
    }

    /* renamed from: z */
    public sc8.InterfaceC16805i m38326z() {
        return this.f34756q;
    }
}
