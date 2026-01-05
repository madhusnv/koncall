package p001o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p001o.cd2;
import p001o.d72;
import p001o.g32;
import p001o.m42;
import p001o.mq3;
import p001o.z82;

/* loaded from: classes2.dex */
public class b77 {

    /* renamed from: x */
    public static final MeteringRectangle[] f15614x = new MeteringRectangle[0];

    /* renamed from: a */
    public final m42 f15615a;

    /* renamed from: b */
    public final Executor f15616b;

    /* renamed from: c */
    public final ScheduledExecutorService f15617c;

    /* renamed from: f */
    public final geb f15620f;

    /* renamed from: i */
    public ScheduledFuture f15623i;

    /* renamed from: j */
    public ScheduledFuture f15624j;

    /* renamed from: q */
    public MeteringRectangle[] f15631q;

    /* renamed from: r */
    public MeteringRectangle[] f15632r;

    /* renamed from: s */
    public MeteringRectangle[] f15633s;

    /* renamed from: t */
    public g32.C13614a f15634t;

    /* renamed from: u */
    public g32.C13614a f15635u;

    /* renamed from: v */
    public boolean f15636v;

    /* renamed from: w */
    public m42.InterfaceC15217c f15637w;

    /* renamed from: d */
    public volatile boolean f15618d = false;

    /* renamed from: e */
    public volatile Rational f15619e = null;

    /* renamed from: g */
    public boolean f15621g = false;

    /* renamed from: h */
    public Integer f15622h = 0;

    /* renamed from: k */
    public long f15625k = 0;

    /* renamed from: l */
    public boolean f15626l = false;

    /* renamed from: m */
    public boolean f15627m = false;

    /* renamed from: n */
    public int f15628n = 1;

    /* renamed from: o */
    public m42.InterfaceC15217c f15629o = null;

    /* renamed from: p */
    public m42.InterfaceC15217c f15630p = null;

    /* renamed from: o.b77$a */
    public class C12289a extends j72 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f15638a;

        public C12289a(g32.C13614a c13614a) {
            this.f15638a = c13614a;
        }

        @Override // p001o.j72
        /* renamed from: a */
        public void mo18247a(int i) {
            g32.C13614a c13614a = this.f15638a;
            if (c13614a != null) {
                c13614a.m28008f(new y82("Camera is closed"));
            }
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            g32.C13614a c13614a = this.f15638a;
            if (c13614a != null) {
                c13614a.m28005c(u72Var);
            }
        }

        @Override // p001o.j72
        /* renamed from: c */
        public void mo18248c(int i, l72 l72Var) {
            g32.C13614a c13614a = this.f15638a;
            if (c13614a != null) {
                c13614a.m28008f(new z82.C18576c(l72Var));
            }
        }
    }

    /* renamed from: o.b77$b */
    public class C12290b extends j72 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f15640a;

        public C12290b(g32.C13614a c13614a) {
            this.f15640a = c13614a;
        }

        @Override // p001o.j72
        /* renamed from: a */
        public void mo18247a(int i) {
            g32.C13614a c13614a = this.f15640a;
            if (c13614a != null) {
                c13614a.m28008f(new y82("Camera is closed"));
            }
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            if (this.f15640a != null) {
                wja.m54627a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f15640a.m28005c(null);
            }
        }

        @Override // p001o.j72
        /* renamed from: c */
        public void mo18248c(int i, l72 l72Var) {
            g32.C13614a c13614a = this.f15640a;
            if (c13614a != null) {
                c13614a.m28008f(new z82.C18576c(l72Var));
            }
        }
    }

    public b77(m42 m42Var, ScheduledExecutorService scheduledExecutorService, Executor executor, l5e l5eVar) {
        MeteringRectangle[] meteringRectangleArr = f15614x;
        this.f15631q = meteringRectangleArr;
        this.f15632r = meteringRectangleArr;
        this.f15633s = meteringRectangleArr;
        this.f15634t = null;
        this.f15635u = null;
        this.f15636v = false;
        this.f15637w = null;
        this.f15615a = m42Var;
        this.f15616b = executor;
        this.f15617c = scheduledExecutorService;
        this.f15620f = new geb(l5eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ boolean m18221t(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !m42.m38286O(totalCaptureResult, j)) {
            return false;
        }
        m18238l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m18222u(boolean z, g32.C13614a c13614a) {
        this.f15615a.a0(this.f15637w);
        this.f15636v = z;
        m18241o(c13614a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Object m18223v(final boolean z, final g32.C13614a c13614a) {
        this.f15616b.execute(new Runnable() { // from class: o.w67
            @Override // java.lang.Runnable
            public final void run() {
                this.f51538a.m18222u(z, c13614a);
            }
        });
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ boolean m18224w(long j, g32.C13614a c13614a, TotalCaptureResult totalCaptureResult) {
        boolean z = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        wja.m54627a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z);
        if (z != this.f15636v || !m42.m38286O(totalCaptureResult, j)) {
            return false;
        }
        wja.m54627a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z);
        if (c13614a != null) {
            c13614a.m28005c(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Object m18226y(final g32.C13614a c13614a) {
        this.f15616b.execute(new Runnable() { // from class: o.y67
            @Override // java.lang.Runnable
            public final void run() {
                this.f54996a.m18225x(c13614a);
            }
        });
        return "triggerAePrecapture";
    }

    /* renamed from: A */
    public void m18227A(Rational rational) {
        this.f15619e = rational;
    }

    /* renamed from: B */
    public void m18228B(int i) {
        this.f15628n = i;
    }

    /* renamed from: C */
    public final boolean m18229C() {
        return this.f15631q.length > 0;
    }

    /* renamed from: D */
    public zfa m18230D() {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.x67
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f53264a.m18226y(c13614a);
            }
        });
    }

    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m18225x(g32.C13614a c13614a) {
        wja.m54627a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f15618d) {
            if (c13614a != null) {
                c13614a.m28008f(new y82("Camera is not active."));
                return;
            }
            return;
        }
        cd2.C12638a c12638a = new cd2.C12638a();
        c12638a.m20911t(this.f15628n);
        c12638a.m20912u(true);
        d72.C12801a c12801a = new d72.C12801a();
        c12801a.m22395f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        c12638a.m20898e(c12801a.m22392c());
        c12638a.m20896c(new C12290b(c13614a));
        this.f15615a.h0(Collections.singletonList(c12638a.m20901h()));
    }

    /* renamed from: F */
    public void m18232F(g32.C13614a c13614a, boolean z) {
        if (!this.f15618d) {
            if (c13614a != null) {
                c13614a.m28008f(new y82("Camera is not active."));
                return;
            }
            return;
        }
        cd2.C12638a c12638a = new cd2.C12638a();
        c12638a.m20911t(this.f15628n);
        c12638a.m20912u(true);
        d72.C12801a c12801a = new d72.C12801a();
        c12801a.m22395f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z) {
            c12801a.m22396g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f15615a.m38309C(1)), mq3.EnumC15404c.HIGH_PRIORITY_REQUIRED);
        }
        c12638a.m20898e(c12801a.m22392c());
        c12638a.m20896c(new C12289a(c13614a));
        this.f15615a.h0(Collections.singletonList(c12638a.m20901h()));
    }

    /* renamed from: g */
    public void m18233g(d72.C12801a c12801a) {
        int iM18244r = this.f15621g ? 1 : m18244r();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object objValueOf = Integer.valueOf(this.f15615a.m38310E(iM18244r));
        mq3.EnumC15404c enumC15404c = mq3.EnumC15404c.REQUIRED;
        c12801a.m22396g(key, objValueOf, enumC15404c);
        MeteringRectangle[] meteringRectangleArr = this.f15631q;
        if (meteringRectangleArr.length != 0) {
            c12801a.m22396g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, enumC15404c);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f15632r;
        if (meteringRectangleArr2.length != 0) {
            c12801a.m22396g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, enumC15404c);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f15633s;
        if (meteringRectangleArr3.length != 0) {
            c12801a.m22396g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, enumC15404c);
        }
    }

    /* renamed from: h */
    public void m18234h(boolean z, boolean z2) {
        if (this.f15618d) {
            cd2.C12638a c12638a = new cd2.C12638a();
            c12638a.m20912u(true);
            c12638a.m20911t(this.f15628n);
            d72.C12801a c12801a = new d72.C12801a();
            if (z) {
                c12801a.m22395f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                c12801a.m22395f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            c12638a.m20898e(c12801a.m22392c());
            this.f15615a.h0(Collections.singletonList(c12638a.m20901h()));
        }
    }

    /* renamed from: i */
    public void m18235i(g32.C13614a c13614a) {
        m18243q("Cancelled by another cancelFocusAndMetering()");
        m18242p("Cancelled by cancelFocusAndMetering()");
        this.f15635u = c13614a;
        m18239m();
        m18237k();
        if (m18229C()) {
            m18234h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f15614x;
        this.f15631q = meteringRectangleArr;
        this.f15632r = meteringRectangleArr;
        this.f15633s = meteringRectangleArr;
        this.f15621g = false;
        final long jJ0 = this.f15615a.j0();
        if (this.f15635u != null) {
            final int iM38310E = this.f15615a.m38310E(m18244r());
            m42.InterfaceC15217c interfaceC15217c = new m42.InterfaceC15217c() { // from class: o.a77
                @Override // p001o.m42.InterfaceC15217c
                /* renamed from: a */
                public final boolean mo16542a(TotalCaptureResult totalCaptureResult) {
                    return this.f14235a.m18221t(iM38310E, jJ0, totalCaptureResult);
                }
            };
            this.f15630p = interfaceC15217c;
            this.f15615a.m38320t(interfaceC15217c);
        }
    }

    /* renamed from: j */
    public void m18236j() {
        m18235i(null);
    }

    /* renamed from: k */
    public final void m18237k() {
        ScheduledFuture scheduledFuture = this.f15624j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f15624j = null;
        }
    }

    /* renamed from: l */
    public final void m18238l() {
        g32.C13614a c13614a = this.f15635u;
        if (c13614a != null) {
            c13614a.m28005c(null);
            this.f15635u = null;
        }
    }

    /* renamed from: m */
    public final void m18239m() {
        ScheduledFuture scheduledFuture = this.f15623i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f15623i = null;
        }
    }

    /* renamed from: n */
    public zfa m18240n(final boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.f15615a.m38309C(5) != 5 ? bn7.m19430p(null) : g32.m28002a(new g32.InterfaceC13616c() { // from class: o.v67
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f49921a.m18223v(z, c13614a);
                }
            });
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API ");
        sb.append(i);
        return bn7.m19430p(null);
    }

    /* renamed from: o */
    public final void m18241o(final g32.C13614a c13614a) {
        if (!this.f15618d) {
            if (c13614a != null) {
                c13614a.m28008f(new y82("Camera is not active."));
            }
        } else {
            final long jJ0 = this.f15615a.j0();
            m42.InterfaceC15217c interfaceC15217c = new m42.InterfaceC15217c() { // from class: o.z67
                @Override // p001o.m42.InterfaceC15217c
                /* renamed from: a */
                public final boolean mo16542a(TotalCaptureResult totalCaptureResult) {
                    return this.f56584a.m18224w(jJ0, c13614a, totalCaptureResult);
                }
            };
            this.f15637w = interfaceC15217c;
            this.f15615a.m38320t(interfaceC15217c);
        }
    }

    /* renamed from: p */
    public final void m18242p(String str) {
        this.f15615a.a0(this.f15629o);
        g32.C13614a c13614a = this.f15634t;
        if (c13614a != null) {
            c13614a.m28008f(new y82(str));
            this.f15634t = null;
        }
    }

    /* renamed from: q */
    public final void m18243q(String str) {
        this.f15615a.a0(this.f15630p);
        g32.C13614a c13614a = this.f15635u;
        if (c13614a != null) {
            c13614a.m28008f(new y82(str));
            this.f15635u = null;
        }
    }

    /* renamed from: r */
    public int m18244r() {
        return this.f15628n != 3 ? 4 : 3;
    }

    /* renamed from: s */
    public boolean m18245s() {
        return this.f15636v;
    }

    /* renamed from: z */
    public void m18246z(boolean z) {
        if (z == this.f15618d) {
            return;
        }
        this.f15618d = z;
        if (this.f15618d) {
            return;
        }
        m18236j();
    }
}
