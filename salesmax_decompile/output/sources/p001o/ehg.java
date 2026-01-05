package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.fc7;

/* loaded from: classes2.dex */
public class ehg extends ahg {

    /* renamed from: o */
    public final ScheduledExecutorService f21702o;

    /* renamed from: p */
    public final Object f21703p;

    /* renamed from: q */
    public List f21704q;

    /* renamed from: r */
    public zfa f21705r;

    /* renamed from: s */
    public final gc7 f21706s;

    /* renamed from: t */
    public final fc7 f21707t;

    /* renamed from: u */
    public final ome f21708u;

    /* renamed from: v */
    public final vhf f21709v;

    /* renamed from: w */
    public final AtomicBoolean f21710w;

    public ehg(l5e l5eVar, l5e l5eVar2, fe2 fe2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(fe2Var, executor, scheduledExecutorService, handler);
        this.f21703p = new Object();
        this.f21710w = new AtomicBoolean(false);
        this.f21706s = new gc7(l5eVar, l5eVar2);
        this.f21708u = new ome(l5eVar.m36593a(CaptureSessionStuckQuirk.class) || l5eVar.m36593a(IncorrectCaptureStateQuirk.class));
        this.f21707t = new fc7(l5eVar2);
        this.f21709v = new vhf(l5eVar2);
        this.f21702o = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m25077E() {
        m25084O("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m25081P(ugg uggVar) {
        super.mo17130s(uggVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ zfa m25082Q(CameraDevice cameraDevice, dhf dhfVar, List list, List list2) {
        if (this.f21709v.m52781a()) {
            m25083N();
        }
        m25084O("start openCaptureSession");
        return super.mo17123k(cameraDevice, dhfVar, list);
    }

    /* renamed from: N */
    public final void m25083N() {
        Iterator it = this.f14740b.m26486d().iterator();
        while (it.hasNext()) {
            ((ugg) it.next()).close();
        }
    }

    /* renamed from: O */
    public void m25084O(String str) {
        wja.m54627a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // p001o.ahg, p001o.ugg
    /* renamed from: a */
    public void mo17113a() {
        super.mo17113a();
        this.f21708u.m42447i();
    }

    @Override // p001o.ahg, p001o.ugg
    public void close() {
        if (!this.f21710w.compareAndSet(false, true)) {
            m25084O("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f21709v.m52781a()) {
            try {
                m25084O("Call abortCaptures() before closing session.");
                mo17117e();
            } catch (Exception e) {
                m25084O("Exception when calling abortCaptures()" + e);
            }
        }
        m25084O("Session call close()");
        this.f21708u.m42445e().addListener(new Runnable() { // from class: o.bhg
            @Override // java.lang.Runnable
            public final void run() {
                this.f16284a.m25077E();
            }
        }, mo17114b());
    }

    @Override // p001o.ahg, p001o.ugg
    /* renamed from: d */
    public void mo17116d(int i) {
        super.mo17116d(i);
        if (i == 5) {
            synchronized (this.f21703p) {
                if (m17111D() && this.f21704q != null) {
                    m25084O("Close DeferrableSurfaces for CameraDevice error.");
                    Iterator it = this.f21704q.iterator();
                    while (it.hasNext()) {
                        ((yj5) it.next()).mo30396d();
                    }
                }
            }
        }
    }

    @Override // p001o.ahg, p001o.ugg
    /* renamed from: g */
    public int mo17119g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo17119g(captureRequest, this.f21708u.m42444d(captureCallback));
    }

    @Override // p001o.ahg, p001o.ugg.InterfaceC17375a
    /* renamed from: h */
    public zfa mo17120h(List list, long j) {
        zfa zfaVarMo17120h;
        synchronized (this.f21703p) {
            this.f21704q = list;
            zfaVarMo17120h = super.mo17120h(list, j);
        }
        return zfaVarMo17120h;
    }

    @Override // p001o.ahg, p001o.ugg
    /* renamed from: j */
    public int mo17122j(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo17122j(list, this.f21708u.m42444d(captureCallback));
    }

    @Override // p001o.ahg, p001o.ugg.InterfaceC17375a
    /* renamed from: k */
    public zfa mo17123k(final CameraDevice cameraDevice, final dhf dhfVar, final List list) {
        zfa zfaVarM19407B;
        synchronized (this.f21703p) {
            List listM26486d = this.f14740b.m26486d();
            ArrayList arrayList = new ArrayList();
            Iterator it = listM26486d.iterator();
            while (it.hasNext()) {
                arrayList.add(((ugg) it.next()).mo25085n());
            }
            zfa zfaVarM19411F = bn7.m19411F(arrayList);
            this.f21705r = zfaVarM19411F;
            zfaVarM19407B = bn7.m19407B(rm7.m46957a(zfaVarM19411F).m46961e(new wr0() { // from class: o.chg
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return this.f18198a.m25082Q(cameraDevice, dhfVar, list, (List) obj);
                }
            }, mo17114b()));
        }
        return zfaVarM19407B;
    }

    @Override // p001o.ugg
    /* renamed from: n */
    public zfa mo25085n() {
        return bn7.m19406A(1500L, this.f21702o, this.f21708u.m42445e());
    }

    @Override // p001o.ahg, p001o.ugg.AbstractC17377c
    /* renamed from: q */
    public void mo17128q(ugg uggVar) {
        synchronized (this.f21703p) {
            this.f21706s.m28404a(this.f21704q);
        }
        m25084O("onClosed()");
        super.mo17128q(uggVar);
    }

    @Override // p001o.ahg, p001o.ugg.AbstractC17377c
    /* renamed from: s */
    public void mo17130s(ugg uggVar) {
        m25084O("Session onConfigured()");
        this.f21707t.m26441c(uggVar, this.f14740b.m26487e(), this.f14740b.m26486d(), new fc7.InterfaceC13398a() { // from class: o.dhg
            @Override // p001o.fc7.InterfaceC13398a
            /* renamed from: a */
            public final void mo23154a(ugg uggVar2) {
                this.f19873a.m25081P(uggVar2);
            }
        });
    }

    @Override // p001o.ahg, p001o.ugg.InterfaceC17375a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f21703p) {
            if (m17111D()) {
                this.f21706s.m28404a(this.f21704q);
            } else {
                zfa zfaVar = this.f21705r;
                if (zfaVar != null) {
                    zfaVar.cancel(true);
                }
            }
            zStop = super.stop();
        }
        return zStop;
    }
}
