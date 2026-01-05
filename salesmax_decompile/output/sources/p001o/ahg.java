package p001o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p001o.g32;
import p001o.ugg;
import p001o.yj5;

/* loaded from: classes2.dex */
public abstract class ahg extends ugg.AbstractC17377c implements ugg, ugg.InterfaceC17375a {

    /* renamed from: b */
    public final fe2 f14740b;

    /* renamed from: c */
    public final Handler f14741c;

    /* renamed from: d */
    public final Executor f14742d;

    /* renamed from: e */
    public final ScheduledExecutorService f14743e;

    /* renamed from: f */
    public ugg.AbstractC17377c f14744f;

    /* renamed from: g */
    public x72 f14745g;

    /* renamed from: h */
    public zfa f14746h;

    /* renamed from: i */
    public g32.C13614a f14747i;

    /* renamed from: j */
    public zfa f14748j;

    /* renamed from: a */
    public final Object f14739a = new Object();

    /* renamed from: k */
    public List f14749k = null;

    /* renamed from: l */
    public boolean f14750l = false;

    /* renamed from: m */
    public boolean f14751m = false;

    /* renamed from: n */
    public boolean f14752n = false;

    /* renamed from: o.ahg$a */
    public class C12178a implements qm7 {
        public C12178a() {
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            ahg.this.mo17113a();
            ahg ahgVar = ahg.this;
            ahgVar.f14740b.m26491i(ahgVar);
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }
    }

    /* renamed from: o.ahg$b */
    public class C12179b extends CameraCaptureSession.StateCallback {
        public C12179b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            ahg.this.m17109B(cameraCaptureSession);
            ahg ahgVar = ahg.this;
            ahgVar.mo17126o(ahgVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            ahg.this.m17109B(cameraCaptureSession);
            ahg ahgVar = ahg.this;
            ahgVar.mo17127p(ahgVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            ahg.this.m17109B(cameraCaptureSession);
            ahg ahgVar = ahg.this;
            ahgVar.mo17128q(ahgVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            g32.C13614a c13614a;
            try {
                ahg.this.m17109B(cameraCaptureSession);
                ahg ahgVar = ahg.this;
                ahgVar.mo17129r(ahgVar);
                synchronized (ahg.this.f14739a) {
                    fgd.m26664h(ahg.this.f14747i, "OpenCaptureSession completer should not null");
                    ahg ahgVar2 = ahg.this;
                    c13614a = ahgVar2.f14747i;
                    ahgVar2.f14747i = null;
                }
                c13614a.m28008f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (ahg.this.f14739a) {
                    fgd.m26664h(ahg.this.f14747i, "OpenCaptureSession completer should not null");
                    ahg ahgVar3 = ahg.this;
                    g32.C13614a c13614a2 = ahgVar3.f14747i;
                    ahgVar3.f14747i = null;
                    c13614a2.m28008f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            g32.C13614a c13614a;
            try {
                ahg.this.m17109B(cameraCaptureSession);
                ahg ahgVar = ahg.this;
                ahgVar.mo17130s(ahgVar);
                synchronized (ahg.this.f14739a) {
                    fgd.m26664h(ahg.this.f14747i, "OpenCaptureSession completer should not null");
                    ahg ahgVar2 = ahg.this;
                    c13614a = ahgVar2.f14747i;
                    ahgVar2.f14747i = null;
                }
                c13614a.m28005c(null);
            } catch (Throwable th) {
                synchronized (ahg.this.f14739a) {
                    fgd.m26664h(ahg.this.f14747i, "OpenCaptureSession completer should not null");
                    ahg ahgVar3 = ahg.this;
                    g32.C13614a c13614a2 = ahgVar3.f14747i;
                    ahgVar3.f14747i = null;
                    c13614a2.m28005c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            ahg.this.m17109B(cameraCaptureSession);
            ahg ahgVar = ahg.this;
            ahgVar.mo17131t(ahgVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            ahg.this.m17109B(cameraCaptureSession);
            ahg ahgVar = ahg.this;
            ahgVar.mo17133v(ahgVar, surface);
        }
    }

    public ahg(fe2 fe2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f14740b = fe2Var;
        this.f14741c = handler;
        this.f14742d = executor;
        this.f14743e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m17100E() {
        mo17132u(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m17101F(ugg uggVar) {
        this.f14740b.m26489g(this);
        mo17132u(uggVar);
        if (this.f14745g != null) {
            Objects.requireNonNull(this.f14744f);
            this.f14744f.mo17128q(uggVar);
            return;
        }
        wja.m54638l("SyncCaptureSessionBase", "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m17102G(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        this.f14744f.mo17132u(uggVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ Object m17103H(List list, c92 c92Var, dhf dhfVar, g32.C13614a c13614a) {
        String str;
        synchronized (this.f14739a) {
            m17110C(list);
            fgd.m26666j(this.f14747i == null, "The openCaptureSessionCompleter can only set once!");
            this.f14747i = c13614a;
            c92Var.m20497a(dhfVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ zfa m17104I(List list, List list2) {
        wja.m54627a("SyncCaptureSessionBase", "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? bn7.m19428n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? bn7.m19428n(new yj5.C18418a("Surface closed", (yj5) list.get(list2.indexOf(null)))) : bn7.m19430p(list2);
    }

    /* renamed from: B */
    public void m17109B(CameraCaptureSession cameraCaptureSession) {
        if (this.f14745g == null) {
            this.f14745g = x72.m55760d(cameraCaptureSession, this.f14741c);
        }
    }

    /* renamed from: C */
    public void m17110C(List list) {
        synchronized (this.f14739a) {
            m17112J();
            bk5.m19280d(list);
            this.f14749k = list;
        }
    }

    /* renamed from: D */
    public boolean m17111D() {
        boolean z;
        synchronized (this.f14739a) {
            z = this.f14746h != null;
        }
        return z;
    }

    /* renamed from: J */
    public void m17112J() {
        synchronized (this.f14739a) {
            List list = this.f14749k;
            if (list != null) {
                bk5.m19279c(list);
                this.f14749k = null;
            }
        }
    }

    @Override // p001o.ugg
    /* renamed from: a */
    public void mo17113a() {
        m17112J();
    }

    @Override // p001o.ugg.InterfaceC17375a
    /* renamed from: b */
    public Executor mo17114b() {
        return this.f14742d;
    }

    @Override // p001o.ugg
    /* renamed from: c */
    public ugg.AbstractC17377c mo17115c() {
        return this;
    }

    @Override // p001o.ugg
    public void close() {
        fgd.m26664h(this.f14745g, "Need to call openCaptureSession before using this API.");
        this.f14740b.m26490h(this);
        this.f14745g.m55763c().close();
        mo17114b().execute(new Runnable() { // from class: o.zgg
            @Override // java.lang.Runnable
            public final void run() {
                this.f57171a.m17100E();
            }
        });
    }

    @Override // p001o.ugg
    /* renamed from: d */
    public void mo17116d(int i) {
    }

    @Override // p001o.ugg
    /* renamed from: e */
    public void mo17117e() {
        fgd.m26664h(this.f14745g, "Need to call openCaptureSession before using this API.");
        this.f14745g.m55763c().abortCaptures();
    }

    @Override // p001o.ugg
    /* renamed from: f */
    public CameraDevice mo17118f() {
        fgd.m26663g(this.f14745g);
        return this.f14745g.m55763c().getDevice();
    }

    @Override // p001o.ugg
    /* renamed from: g */
    public int mo17119g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        fgd.m26664h(this.f14745g, "Need to call openCaptureSession before using this API.");
        return this.f14745g.m55762b(captureRequest, mo17114b(), captureCallback);
    }

    @Override // p001o.ugg.InterfaceC17375a
    /* renamed from: h */
    public zfa mo17120h(final List list, long j) {
        synchronized (this.f14739a) {
            if (this.f14751m) {
                return bn7.m19428n(new CancellationException("Opener is disabled"));
            }
            rm7 rm7VarM46961e = rm7.m46957a(bk5.m19283g(list, false, j, mo17114b(), this.f14743e)).m46961e(new wr0() { // from class: o.vgg
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f50308a.m17104I(list, (List) obj);
                }
            }, mo17114b());
            this.f14748j = rm7VarM46961e;
            return bn7.m19407B(rm7VarM46961e);
        }
    }

    @Override // p001o.ugg.InterfaceC17375a
    /* renamed from: i */
    public dhf mo17121i(int i, List list, ugg.AbstractC17377c abstractC17377c) {
        this.f14744f = abstractC17377c;
        return new dhf(i, list, mo17114b(), new C12179b());
    }

    @Override // p001o.ugg
    /* renamed from: j */
    public int mo17122j(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        fgd.m26664h(this.f14745g, "Need to call openCaptureSession before using this API.");
        return this.f14745g.m55761a(list, mo17114b(), captureCallback);
    }

    @Override // p001o.ugg.InterfaceC17375a
    /* renamed from: k */
    public zfa mo17123k(CameraDevice cameraDevice, final dhf dhfVar, final List list) {
        synchronized (this.f14739a) {
            if (this.f14751m) {
                return bn7.m19428n(new CancellationException("Opener is disabled"));
            }
            this.f14740b.m26493k(this);
            final c92 c92VarM20496b = c92.m20496b(cameraDevice, this.f14741c);
            zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.ygg
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f55490a.m17103H(list, c92VarM20496b, dhfVar, c13614a);
                }
            });
            this.f14746h = zfaVarM28002a;
            bn7.m19424j(zfaVarM28002a, new C12178a(), gb2.m28293a());
            return bn7.m19407B(this.f14746h);
        }
    }

    @Override // p001o.ugg
    /* renamed from: l */
    public x72 mo17124l() {
        fgd.m26663g(this.f14745g);
        return this.f14745g;
    }

    @Override // p001o.ugg
    /* renamed from: m */
    public void mo17125m() throws CameraAccessException {
        fgd.m26664h(this.f14745g, "Need to call openCaptureSession before using this API.");
        this.f14745g.m55763c().stopRepeating();
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: o */
    public void mo17126o(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        this.f14744f.mo17126o(uggVar);
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: p */
    public void mo17127p(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        this.f14744f.mo17127p(uggVar);
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: q */
    public void mo17128q(final ugg uggVar) {
        zfa zfaVar;
        synchronized (this.f14739a) {
            if (this.f14750l) {
                zfaVar = null;
            } else {
                this.f14750l = true;
                fgd.m26664h(this.f14746h, "Need to call openCaptureSession before using this API.");
                zfaVar = this.f14746h;
            }
        }
        mo17113a();
        if (zfaVar != null) {
            zfaVar.addListener(new Runnable() { // from class: o.wgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51954a.m17101F(uggVar);
                }
            }, gb2.m28293a());
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: r */
    public void mo17129r(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        mo17113a();
        this.f14740b.m26491i(this);
        this.f14744f.mo17129r(uggVar);
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: s */
    public void mo17130s(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        this.f14740b.m26492j(this);
        this.f14744f.mo17130s(uggVar);
    }

    @Override // p001o.ugg.InterfaceC17375a
    public boolean stop() {
        boolean z;
        try {
            synchronized (this.f14739a) {
                if (!this.f14751m) {
                    zfa zfaVar = this.f14748j;
                    zfaVar = zfaVar != null ? zfaVar : null;
                    this.f14751m = true;
                }
                z = !m17111D();
            }
            return z;
        } finally {
            if (zfaVar != null) {
                zfaVar.cancel(true);
            }
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: t */
    public void mo17131t(ugg uggVar) {
        Objects.requireNonNull(this.f14744f);
        this.f14744f.mo17131t(uggVar);
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: u */
    public void mo17132u(final ugg uggVar) {
        zfa zfaVar;
        synchronized (this.f14739a) {
            if (this.f14752n) {
                zfaVar = null;
            } else {
                this.f14752n = true;
                fgd.m26664h(this.f14746h, "Need to call openCaptureSession before using this API.");
                zfaVar = this.f14746h;
            }
        }
        if (zfaVar != null) {
            zfaVar.addListener(new Runnable() { // from class: o.xgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53754a.m17102G(uggVar);
                }
            }, gb2.m28293a());
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: v */
    public void mo17133v(ugg uggVar, Surface surface) {
        Objects.requireNonNull(this.f14744f);
        this.f14744f.mo17133v(uggVar, surface);
    }
}
