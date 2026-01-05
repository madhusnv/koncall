package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.InterfaceC1893c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.cd2;
import p001o.d72;
import p001o.g32;
import p001o.m42;
import p001o.sc8;
import p001o.t52;

/* loaded from: classes2.dex */
public class t52 {

    /* renamed from: a */
    public final m42 f46393a;

    /* renamed from: b */
    public final f9i f46394b;

    /* renamed from: c */
    public final boolean f46395c;

    /* renamed from: d */
    public final l5e f46396d;

    /* renamed from: e */
    public final Executor f46397e;

    /* renamed from: f */
    public final ScheduledExecutorService f46398f;

    /* renamed from: g */
    public final boolean f46399g;

    /* renamed from: h */
    public int f46400h = 1;

    /* renamed from: o.t52$a */
    public static class C16992a implements InterfaceC16996e {

        /* renamed from: a */
        public final m42 f46401a;

        /* renamed from: b */
        public final qgc f46402b;

        /* renamed from: c */
        public final int f46403c;

        /* renamed from: d */
        public boolean f46404d = false;

        public C16992a(m42 m42Var, int i, qgc qgcVar) {
            this.f46401a = m42Var;
            this.f46403c = i;
            this.f46402b = qgcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m49338f(g32.C13614a c13614a) {
            this.f46401a.m38325y().m18225x(c13614a);
            this.f46402b.m45434b();
            return "AePreCapture";
        }

        /* renamed from: g */
        public static /* synthetic */ Boolean m49339g(Void r0) {
            return Boolean.TRUE;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: a */
        public zfa mo49340a(TotalCaptureResult totalCaptureResult) {
            if (!t52.m49327e(this.f46403c, totalCaptureResult)) {
                return bn7.m19430p(Boolean.FALSE);
            }
            wja.m54627a("Camera2CapturePipeline", "Trigger AE");
            this.f46404d = true;
            return rm7.m46957a(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.r52
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f43004a.m49338f(c13614a);
                }
            })).m46960d(new zl7() { // from class: o.s52
                @Override // p001o.zl7
                public final Object apply(Object obj) {
                    return t52.C16992a.m49339g((Void) obj);
                }
            }, gb2.m28293a());
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: b */
        public boolean mo49341b() {
            return this.f46403c == 0;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: c */
        public void mo49342c() {
            if (this.f46404d) {
                wja.m54627a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f46401a.m38325y().m18234h(false, true);
                this.f46402b.m45433a();
            }
        }
    }

    /* renamed from: o.t52$b */
    public static class C16993b implements InterfaceC16996e {

        /* renamed from: a */
        public final m42 f46405a;

        /* renamed from: b */
        public boolean f46406b = false;

        public C16993b(m42 m42Var) {
            this.f46405a = m42Var;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: a */
        public zfa mo49340a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            zfa zfaVarM19430p = bn7.m19430p(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return zfaVarM19430p;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                wja.m54627a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    wja.m54627a("Camera2CapturePipeline", "Trigger AF");
                    this.f46406b = true;
                    this.f46405a.m38325y().m18232F(null, false);
                }
            }
            return zfaVarM19430p;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: b */
        public boolean mo49341b() {
            return true;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: c */
        public void mo49342c() {
            if (this.f46406b) {
                wja.m54627a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f46405a.m38325y().m18234h(true, false);
            }
        }
    }

    /* renamed from: o.t52$c */
    public static class C16994c implements t72 {

        /* renamed from: a */
        public final Executor f46407a;

        /* renamed from: b */
        public final C16995d f46408b;

        /* renamed from: c */
        public int f46409c;

        public C16994c(C16995d c16995d, Executor executor, int i) {
            this.f46408b = c16995d;
            this.f46407a = executor;
            this.f46409c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ Object m49345e(g32.C13614a c13614a) {
            this.f46408b.m49363j();
            c13614a.m28005c(null);
            return "invokePostCaptureFuture";
        }

        /* renamed from: f */
        public static /* synthetic */ Void m49346f(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // p001o.t72
        /* renamed from: a */
        public zfa mo49347a() {
            wja.m54627a("Camera2CapturePipeline", "invokePreCapture");
            return rm7.m46957a(this.f46408b.m49364k(this.f46409c)).m46960d(new zl7() { // from class: o.v52
                @Override // p001o.zl7
                public final Object apply(Object obj) {
                    return t52.C16994c.m49346f((TotalCaptureResult) obj);
                }
            }, this.f46407a);
        }

        @Override // p001o.t72
        /* renamed from: b */
        public zfa mo49348b() {
            return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.u52
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f48352a.m49345e(c13614a);
                }
            });
        }
    }

    /* renamed from: o.t52$d */
    public static class C16995d {

        /* renamed from: j */
        public static final long f46410j;

        /* renamed from: k */
        public static final long f46411k;

        /* renamed from: a */
        public final int f46412a;

        /* renamed from: b */
        public final Executor f46413b;

        /* renamed from: c */
        public final ScheduledExecutorService f46414c;

        /* renamed from: d */
        public final m42 f46415d;

        /* renamed from: e */
        public final qgc f46416e;

        /* renamed from: f */
        public final boolean f46417f;

        /* renamed from: g */
        public long f46418g = f46410j;

        /* renamed from: h */
        public final List f46419h = new ArrayList();

        /* renamed from: i */
        public final InterfaceC16996e f46420i = new a();

        /* renamed from: o.t52$d$a */
        public class a implements InterfaceC16996e {
            public a() {
            }

            /* renamed from: e */
            public static /* synthetic */ Boolean m49368e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // p001o.t52.InterfaceC16996e
            /* renamed from: a */
            public zfa mo49340a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = C16995d.this.f46419h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC16996e) it.next()).mo49340a(totalCaptureResult));
                }
                return bn7.m19412G(bn7.m19425k(arrayList), new zl7() { // from class: o.c62
                    @Override // p001o.zl7
                    public final Object apply(Object obj) {
                        return t52.C16995d.a.m49368e((List) obj);
                    }
                }, gb2.m28293a());
            }

            @Override // p001o.t52.InterfaceC16996e
            /* renamed from: b */
            public boolean mo49341b() {
                Iterator it = C16995d.this.f46419h.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC16996e) it.next()).mo49341b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p001o.t52.InterfaceC16996e
            /* renamed from: c */
            public void mo49342c() {
                Iterator it = C16995d.this.f46419h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16996e) it.next()).mo49342c();
                }
            }
        }

        /* renamed from: o.t52$d$b */
        public class b extends j72 {

            /* renamed from: a */
            public final /* synthetic */ g32.C13614a f46422a;

            public b(g32.C13614a c13614a) {
                this.f46422a = c13614a;
            }

            @Override // p001o.j72
            /* renamed from: a */
            public void mo18247a(int i) {
                this.f46422a.m28008f(new vc8(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // p001o.j72
            /* renamed from: b */
            public void mo4682b(int i, u72 u72Var) {
                this.f46422a.m28005c(null);
            }

            @Override // p001o.j72
            /* renamed from: c */
            public void mo18248c(int i, l72 l72Var) {
                this.f46422a.m28008f(new vc8(2, "Capture request failed with reason " + l72Var.m36644a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f46410j = timeUnit.toNanos(1L);
            f46411k = timeUnit.toNanos(5L);
        }

        public C16995d(int i, Executor executor, ScheduledExecutorService scheduledExecutorService, m42 m42Var, boolean z, qgc qgcVar) {
            this.f46412a = i;
            this.f46413b = executor;
            this.f46414c = scheduledExecutorService;
            this.f46415d = m42Var;
            this.f46417f = z;
            this.f46416e = qgcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ zfa m49354l(List list, int i, TotalCaptureResult totalCaptureResult) {
            return m49366r(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ zfa m49355m(int i, TotalCaptureResult totalCaptureResult) {
            if (t52.m49327e(i, totalCaptureResult)) {
                m49365q(f46411k);
            }
            return this.f46420i.mo49340a(totalCaptureResult);
        }

        /* renamed from: n */
        public static /* synthetic */ boolean m49356n(TotalCaptureResult totalCaptureResult) {
            return t52.m49326d(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ zfa m49357o(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? t52.m49329j(this.f46418g, this.f46414c, this.f46415d, new C16997f.a() { // from class: o.w52
                @Override // p001o.t52.C16997f.a
                /* renamed from: a */
                public final boolean mo28088a(TotalCaptureResult totalCaptureResult) {
                    return t52.C16995d.m49356n(totalCaptureResult);
                }
            }) : bn7.m19430p(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ Object m49358p(cd2.C12638a c12638a, g32.C13614a c13614a) {
            c12638a.m20896c(new b(c13614a));
            return "submitStillCapture";
        }

        /* renamed from: f */
        public void m49359f(InterfaceC16996e interfaceC16996e) {
            this.f46419h.add(interfaceC16996e);
        }

        /* renamed from: g */
        public final void m49360g(cd2.C12638a c12638a) {
            d72.C12801a c12801a = new d72.C12801a();
            c12801a.m22395f(CaptureRequest.CONTROL_AE_MODE, 3);
            c12638a.m20898e(c12801a.m22392c());
        }

        /* renamed from: h */
        public final void m49361h(cd2.C12638a c12638a, cd2 cd2Var) {
            int i = (this.f46412a != 3 || this.f46417f) ? (cd2Var.m20889k() == -1 || cd2Var.m20889k() == 5) ? 2 : -1 : 4;
            if (i != -1) {
                c12638a.m20911t(i);
            }
        }

        /* renamed from: i */
        public zfa m49362i(final List list, final int i) {
            rm7 rm7VarM46961e = rm7.m46957a(m49364k(i)).m46961e(new wr0() { // from class: o.x52
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f53210a.m49354l(list, i, (TotalCaptureResult) obj);
                }
            }, this.f46413b);
            rm7VarM46961e.addListener(new Runnable() { // from class: o.y52
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54901a.m49363j();
                }
            }, this.f46413b);
            return rm7VarM46961e;
        }

        /* renamed from: j */
        public void m49363j() {
            this.f46420i.mo49342c();
        }

        /* renamed from: k */
        public zfa m49364k(final int i) {
            zfa zfaVarM19430p = bn7.m19430p(null);
            if (this.f46419h.isEmpty()) {
                return zfaVarM19430p;
            }
            return rm7.m46957a(this.f46420i.mo49341b() ? t52.m49330k(this.f46415d, null) : bn7.m19430p(null)).m46961e(new wr0() { // from class: o.a62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f14190a.m49355m(i, (TotalCaptureResult) obj);
                }
            }, this.f46413b).m46961e(new wr0() { // from class: o.b62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f15574a.m49357o((Boolean) obj);
                }
            }, this.f46413b);
        }

        /* renamed from: q */
        public final void m49365q(long j) {
            this.f46418g = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zfa m49366r(List list, int i) {
            u72 u72VarM54032a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cd2 cd2Var = (cd2) it.next();
                final cd2.C12638a c12638aM20893j = cd2.C12638a.m20893j(cd2Var);
                if (cd2Var.m20889k() != 5 || this.f46415d.m38315J().mo37137g() || this.f46415d.m38315J().mo37132b()) {
                    u72VarM54032a = null;
                } else {
                    InterfaceC1893c interfaceC1893cMo37135e = this.f46415d.m38315J().mo37135e();
                    if (interfaceC1893cMo37135e != null && this.f46415d.m38315J().mo37136f(interfaceC1893cMo37135e)) {
                        u72VarM54032a = w72.m54032a(interfaceC1893cMo37135e.y2());
                    }
                }
                if (u72VarM54032a != null) {
                    c12638aM20893j.m20905n(u72VarM54032a);
                } else {
                    m49361h(c12638aM20893j, cd2Var);
                }
                if (this.f46416e.m45435c(i)) {
                    m49360g(c12638aM20893j);
                }
                arrayList.add(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.z52
                    @Override // p001o.g32.InterfaceC13616c
                    public final Object attachCompleter(g32.C13614a c13614a) {
                        return this.f56553a.m49358p(c12638aM20893j, c13614a);
                    }
                }));
                arrayList2.add(c12638aM20893j.m20901h());
            }
            this.f46415d.h0(arrayList2);
            return bn7.m19425k(arrayList);
        }
    }

    /* renamed from: o.t52$e */
    public interface InterfaceC16996e {
        /* renamed from: a */
        zfa mo49340a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo49341b();

        /* renamed from: c */
        void mo49342c();
    }

    /* renamed from: o.t52$f */
    public static class C16997f implements m42.InterfaceC15217c {

        /* renamed from: a */
        public g32.C13614a f46424a;

        /* renamed from: b */
        public final zfa f46425b = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.d62
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f19136a.m49370d(c13614a);
            }
        });

        /* renamed from: c */
        public final a f46426c;

        /* renamed from: o.t52$f$a */
        public interface a {
            /* renamed from: a */
            boolean mo28088a(TotalCaptureResult totalCaptureResult);
        }

        public C16997f(a aVar) {
            this.f46426c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m49370d(g32.C13614a c13614a) {
            this.f46424a = c13614a;
            return "waitFor3AResult";
        }

        @Override // p001o.m42.InterfaceC15217c
        /* renamed from: a */
        public boolean mo16542a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f46426c;
            if (aVar != null && !aVar.mo28088a(totalCaptureResult)) {
                return false;
            }
            this.f46424a.m28005c(totalCaptureResult);
            return true;
        }

        /* renamed from: c */
        public zfa m49371c() {
            return this.f46425b;
        }
    }

    /* renamed from: o.t52$g */
    public static class C16998g implements InterfaceC16996e {

        /* renamed from: f */
        public static final long f46427f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        public final m42 f46428a;

        /* renamed from: b */
        public final Executor f46429b;

        /* renamed from: c */
        public final ScheduledExecutorService f46430c;

        /* renamed from: d */
        public final sc8.InterfaceC16805i f46431d;

        /* renamed from: e */
        public final e9i f46432e;

        public C16998g(m42 m42Var, Executor executor, ScheduledExecutorService scheduledExecutorService, e9i e9iVar) {
            this.f46428a = m42Var;
            this.f46429b = executor;
            this.f46430c = scheduledExecutorService;
            this.f46432e = e9iVar;
            sc8.InterfaceC16805i interfaceC16805iM38326z = m42Var.m38326z();
            Objects.requireNonNull(interfaceC16805iM38326z);
            this.f46431d = interfaceC16805iM38326z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ zfa m49372A(zfa zfaVar, Object obj) {
            return bn7.m19440z(TimeUnit.SECONDS.toMillis(3L), this.f46430c, null, true, zfaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public /* synthetic */ zfa m49373B(Void r1) {
            return this.f46428a.m38325y().m18230D();
        }

        /* renamed from: C */
        public static /* synthetic */ boolean m49374C(TotalCaptureResult totalCaptureResult) {
            return t52.m49326d(totalCaptureResult, false);
        }

        /* renamed from: q */
        public static /* synthetic */ void m49388q() {
        }

        /* renamed from: r */
        public static /* synthetic */ void m49389r(g32.C13614a c13614a) {
            wja.m54627a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            c13614a.m28005c(null);
        }

        /* renamed from: s */
        public static /* synthetic */ Object m49390s(AtomicReference atomicReference, final g32.C13614a c13614a) {
            atomicReference.set(new sc8.InterfaceC16806j() { // from class: o.q62
                @Override // p001o.sc8.InterfaceC16806j
                public final void onCompleted() {
                    t52.C16998g.m49389r(c13614a);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ zfa m49391t(Void r5) {
            return t52.m49329j(f46427f, this.f46430c, this.f46428a, new C16997f.a() { // from class: o.g62
                @Override // p001o.t52.C16997f.a
                /* renamed from: a */
                public final boolean mo28088a(TotalCaptureResult totalCaptureResult) {
                    return t52.C16998g.m49374C(totalCaptureResult);
                }
            });
        }

        /* renamed from: u */
        public static /* synthetic */ Boolean m49392u(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m49393v(AtomicReference atomicReference, g32.C13614a c13614a) {
            wja.m54627a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.f46431d.mo4747a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (sc8.InterfaceC16806j) atomicReference.get());
            c13614a.m28005c(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ Object m49394w(final AtomicReference atomicReference, final g32.C13614a c13614a) {
            gb2.m28295c().execute(new Runnable() { // from class: o.f62
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22776a.m49393v(atomicReference, c13614a);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ zfa m49395x(Void r2) {
            return this.f46428a.m38325y().m18240n(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ Object m49396y(g32.C13614a c13614a) {
            if (!this.f46432e.m24609a()) {
                c13614a.m28005c(null);
                return "EnableTorchInternal";
            }
            wja.m54627a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            this.f46428a.m38323w(true);
            c13614a.m28005c(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ zfa m49397z(Void r1) {
            return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.r62
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f43046a.m49396y(c13614a);
                }
            });
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: a */
        public zfa mo49340a(TotalCaptureResult totalCaptureResult) {
            wja.m54627a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.e62
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return t52.C16998g.m49390s(atomicReference, c13614a);
                }
            });
            return rm7.m46957a(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.j62
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f29843a.m49394w(atomicReference, c13614a);
                }
            })).m46961e(new wr0() { // from class: o.k62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f31521a.m49395x((Void) obj);
                }
            }, this.f46429b).m46961e(new wr0() { // from class: o.l62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f33297a.m49397z((Void) obj);
                }
            }, this.f46429b).m46961e(new wr0() { // from class: o.m62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f34848a.m49372A(zfaVarM28002a, obj);
                }
            }, this.f46429b).m46961e(new wr0() { // from class: o.n62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f36434a.m49373B((Void) obj);
                }
            }, this.f46429b).m46961e(new wr0() { // from class: o.o62
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f37816a.m49391t((Void) obj);
                }
            }, this.f46429b).m46960d(new zl7() { // from class: o.p62
                @Override // p001o.zl7
                public final Object apply(Object obj) {
                    return t52.C16998g.m49392u((TotalCaptureResult) obj);
                }
            }, gb2.m28293a());
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: b */
        public boolean mo49341b() {
            return false;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: c */
        public void mo49342c() {
            wja.m54627a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f46432e.m24609a()) {
                this.f46428a.m38323w(false);
            }
            this.f46428a.m38325y().m18240n(false).addListener(new Runnable() { // from class: o.h62
                @Override // java.lang.Runnable
                public final void run() {
                    t52.C16998g.m49388q();
                }
            }, this.f46429b);
            this.f46428a.m38325y().m18234h(false, true);
            ScheduledExecutorService scheduledExecutorServiceM28295c = gb2.m28295c();
            final sc8.InterfaceC16805i interfaceC16805i = this.f46431d;
            Objects.requireNonNull(interfaceC16805i);
            scheduledExecutorServiceM28295c.execute(new Runnable() { // from class: o.i62
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC16805i.clear();
                }
            });
        }
    }

    /* renamed from: o.t52$h */
    public static class C16999h implements InterfaceC16996e {

        /* renamed from: g */
        public static final long f46433g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        public final m42 f46434a;

        /* renamed from: b */
        public final int f46435b;

        /* renamed from: c */
        public boolean f46436c = false;

        /* renamed from: d */
        public final Executor f46437d;

        /* renamed from: e */
        public final ScheduledExecutorService f46438e;

        /* renamed from: f */
        public final boolean f46439f;

        public C16999h(m42 m42Var, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
            this.f46434a = m42Var;
            this.f46435b = i;
            this.f46437d = executor;
            this.f46438e = scheduledExecutorService;
            this.f46439f = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ Object m49403i(g32.C13614a c13614a) {
            this.f46434a.m38312G().m48890b(c13614a, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ zfa m49404j(Void r1) {
            return this.f46439f ? this.f46434a.m38325y().m18230D() : bn7.m19430p(null);
        }

        /* renamed from: k */
        public static /* synthetic */ boolean m49405k(TotalCaptureResult totalCaptureResult) {
            return t52.m49326d(totalCaptureResult, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ zfa m49406l(Void r5) {
            return t52.m49329j(f46433g, this.f46438e, this.f46434a, new C16997f.a() { // from class: o.w62
                @Override // p001o.t52.C16997f.a
                /* renamed from: a */
                public final boolean mo28088a(TotalCaptureResult totalCaptureResult) {
                    return t52.C16999h.m49405k(totalCaptureResult);
                }
            });
        }

        /* renamed from: m */
        public static /* synthetic */ Boolean m49407m(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: a */
        public zfa mo49340a(TotalCaptureResult totalCaptureResult) {
            wja.m54627a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + t52.m49327e(this.f46435b, totalCaptureResult));
            if (t52.m49327e(this.f46435b, totalCaptureResult)) {
                if (!this.f46434a.m38319P()) {
                    wja.m54627a("Camera2CapturePipeline", "Turn on torch");
                    this.f46436c = true;
                    return rm7.m46957a(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.s62
                        @Override // p001o.g32.InterfaceC13616c
                        public final Object attachCompleter(g32.C13614a c13614a) {
                            return this.f44866a.m49403i(c13614a);
                        }
                    })).m46961e(new wr0() { // from class: o.t62
                        @Override // p001o.wr0
                        public final zfa apply(Object obj) {
                            return this.f46484a.m49404j((Void) obj);
                        }
                    }, this.f46437d).m46961e(new wr0() { // from class: o.u62
                        @Override // p001o.wr0
                        public final zfa apply(Object obj) {
                            return this.f48385a.m49406l((Void) obj);
                        }
                    }, this.f46437d).m46960d(new zl7() { // from class: o.v62
                        @Override // p001o.zl7
                        public final Object apply(Object obj) {
                            return t52.C16999h.m49407m((TotalCaptureResult) obj);
                        }
                    }, gb2.m28293a());
                }
                wja.m54627a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return bn7.m19430p(Boolean.FALSE);
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: b */
        public boolean mo49341b() {
            return this.f46435b == 0;
        }

        @Override // p001o.t52.InterfaceC16996e
        /* renamed from: c */
        public void mo49342c() {
            if (this.f46436c) {
                this.f46434a.m38312G().m48890b(null, false);
                wja.m54627a("Camera2CapturePipeline", "Turning off torch");
                if (this.f46439f) {
                    this.f46434a.m38325y().m18234h(false, true);
                }
            }
        }
    }

    public t52(m42 m42Var, s82 s82Var, l5e l5eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f46393a = m42Var;
        Integer num = (Integer) s82Var.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f46399g = num != null && num.intValue() == 2;
        this.f46397e = executor;
        this.f46398f = scheduledExecutorService;
        this.f46396d = l5eVar;
        this.f46394b = new f9i(l5eVar);
        this.f46395c = l27.m36450a(new q52(s82Var));
    }

    /* renamed from: d */
    public static boolean m49326d(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        return v64.m52351a(new r32(totalCaptureResult), z);
    }

    /* renamed from: e */
    public static boolean m49327e(int i, TotalCaptureResult totalCaptureResult) {
        wja.m54627a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        wja.m54627a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    /* renamed from: j */
    public static zfa m49329j(long j, ScheduledExecutorService scheduledExecutorService, m42 m42Var, C16997f.a aVar) {
        return bn7.m19440z(TimeUnit.NANOSECONDS.toMillis(j), scheduledExecutorService, null, true, m49330k(m42Var, aVar));
    }

    /* renamed from: k */
    public static zfa m49330k(final m42 m42Var, C16997f.a aVar) {
        final C16997f c16997f = new C16997f(aVar);
        m42Var.m38320t(c16997f);
        zfa zfaVarM49371c = c16997f.m49371c();
        zfaVarM49371c.addListener(new Runnable() { // from class: o.p52
            @Override // java.lang.Runnable
            public final void run() {
                m42Var.a0(c16997f);
            }
        }, m42Var.f34742c);
        return zfaVarM49371c;
    }

    /* renamed from: b */
    public C16995d m49331b(int i, int i2, int i3) {
        qgc qgcVar = new qgc(this.f46396d);
        C16995d c16995d = new C16995d(this.f46400h, this.f46397e, this.f46398f, this.f46393a, this.f46399g, qgcVar);
        if (i == 0) {
            c16995d.m49359f(new C16993b(this.f46393a));
        }
        if (i2 == 3) {
            c16995d.m49359f(new C16998g(this.f46393a, this.f46397e, this.f46398f, new e9i(this.f46396d)));
        } else if (this.f46395c) {
            if (m49333f(i3)) {
                c16995d.m49359f(new C16999h(this.f46393a, i2, this.f46397e, this.f46398f, (this.f46394b.m26320a() || this.f46393a.m38318M()) ? false : true));
            } else {
                c16995d.m49359f(new C16992a(this.f46393a, i2, qgcVar));
            }
        }
        wja.m54627a("Camera2CapturePipeline", "createPipeline: captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3 + ", pipeline tasks = " + c16995d.f46419h);
        return c16995d;
    }

    /* renamed from: c */
    public t72 m49332c(int i, int i2, int i3) {
        return new C16994c(m49331b(i, i2, i3), this.f46397e, i2);
    }

    /* renamed from: f */
    public final boolean m49333f(int i) {
        return this.f46394b.m26320a() || this.f46400h == 3 || i == 1;
    }

    /* renamed from: h */
    public void m49334h(int i) {
        this.f46400h = i;
    }

    /* renamed from: i */
    public zfa m49335i(List list, int i, int i2, int i3) {
        return bn7.m19407B(m49331b(i, i2, i3).m49362i(list, i2));
    }
}
