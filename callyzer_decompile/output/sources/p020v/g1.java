package p020v;

import a6.C0058f;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.credentials.playservices.C0268b;
import bk.C0677h;
import eb.i3;
import eb.q0;
import ej.C2056a;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import l0.AbstractC4308h;
import l0.C4304d;
import l0.C4310j;
import l0.C4311k;
import l0.RunnableC4302b;
import og.u1;
import og.y0;
import p021w.C7840f;
import p021w.C7841g;
import p022x.C8249s;
import pg.AbstractC5944y;
import pg.i7;
import pg.t8;
import v0.C7622f;
import x4.C8299i;
import x4.C8302l;
import z1.C8849i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends d1 {

    /* renamed from: b */
    public final x0 f36545b;

    /* renamed from: c */
    public final Handler f36546c;

    /* renamed from: d */
    public final ExecutorC3900j f36547d;

    /* renamed from: e */
    public final ScheduledExecutorServiceC3894d f36548e;

    /* renamed from: f */
    public n0 f36549f;

    /* renamed from: g */
    public C7622f f36550g;

    /* renamed from: h */
    public C8302l f36551h;

    /* renamed from: i */
    public C8299i f36552i;

    /* renamed from: j */
    public C4304d f36553j;

    /* renamed from: o */
    public final ScheduledExecutorServiceC3894d f36558o;

    /* renamed from: q */
    public ArrayList f36560q;

    /* renamed from: r */
    public C4311k f36561r;

    /* renamed from: s */
    public final C2056a f36562s;

    /* renamed from: t */
    public final C7622f f36563t;

    /* renamed from: u */
    public final C0058f f36564u;

    /* renamed from: v */
    public final q0 f36565v;

    /* renamed from: a */
    public final Object f36544a = new Object();

    /* renamed from: k */
    public List f36554k = null;

    /* renamed from: l */
    public boolean f36555l = false;

    /* renamed from: m */
    public boolean f36556m = false;

    /* renamed from: n */
    public boolean f36557n = false;

    /* renamed from: p */
    public final Object f36559p = new Object();

    /* renamed from: w */
    public final AtomicBoolean f36566w = new AtomicBoolean(false);

    public g1(Handler handler, i3 i3Var, i3 i3Var2, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d, ExecutorC3900j executorC3900j, x0 x0Var) {
        this.f36545b = x0Var;
        this.f36546c = handler;
        this.f36547d = executorC3900j;
        this.f36548e = scheduledExecutorServiceC3894d;
        this.f36562s = new C2056a(i3Var, i3Var2);
        this.f36564u = new C0058f(i3Var.m5728f(CaptureSessionStuckQuirk.class) || i3Var.m5728f(IncorrectCaptureStateQuirk.class));
        C7622f c7622f = new C7622f();
        c7622f.f36778a = (CaptureSessionOnClosedNotCalledQuirk) i3Var2.m5729g(CaptureSessionOnClosedNotCalledQuirk.class);
        this.f36563t = c7622f;
        q0 q0Var = new q0();
        q0Var.f9420a = i3Var2.m5728f(Preview3AThreadCrashQuirk.class);
        this.f36565v = q0Var;
        this.f36558o = scheduledExecutorServiceC3894d;
    }

    @Override // p020v.d1
    /* renamed from: a */
    public final void mo14365a(g1 g1Var) {
        Objects.requireNonNull(this.f36549f);
        this.f36549f.mo14365a(g1Var);
    }

    @Override // p020v.d1
    /* renamed from: b */
    public final void mo14366b(g1 g1Var) {
        Objects.requireNonNull(this.f36549f);
        this.f36549f.mo14366b(g1Var);
    }

    @Override // p020v.d1
    /* renamed from: c */
    public final void mo14367c(g1 g1Var) {
        C8302l c8302l;
        synchronized (this.f36559p) {
            this.f36562s.m5781a(this.f36560q);
        }
        m14380k("onClosed()");
        synchronized (this.f36544a) {
            try {
                if (this.f36555l) {
                    c8302l = null;
                } else {
                    this.f36555l = true;
                    y0.m11055e(this.f36551h, "Need to call openCaptureSession before using this API.");
                    c8302l = this.f36551h;
                }
            } finally {
            }
        }
        synchronized (this.f36544a) {
            try {
                List list = this.f36554k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((v0) it.next()).m7417b();
                    }
                    this.f36554k = null;
                }
            } finally {
            }
        }
        this.f36564u.m177p();
        if (c8302l != null) {
            c8302l.f39850b.mo9026a(new e1(this, g1Var, 0), t8.m11872a());
        }
    }

    @Override // p020v.d1
    /* renamed from: d */
    public final void mo14368d(g1 g1Var) {
        Objects.requireNonNull(this.f36549f);
        synchronized (this.f36544a) {
            try {
                List list = this.f36554k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((v0) it.next()).m7417b();
                    }
                    this.f36554k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f36564u.m177p();
        x0 x0Var = this.f36545b;
        x0Var.m14487q(this);
        synchronized (x0Var.f36755c) {
            ((LinkedHashSet) x0Var.f36758f).remove(this);
        }
        this.f36549f.mo14368d(g1Var);
    }

    @Override // p020v.d1
    /* renamed from: e */
    public final void mo14369e(g1 g1Var) {
        ArrayList arrayList;
        m14380k("Session onConfigured()");
        C7622f c7622f = this.f36563t;
        x0 x0Var = this.f36545b;
        synchronized (x0Var.f36755c) {
            arrayList = new ArrayList((LinkedHashSet) x0Var.f36758f);
        }
        ArrayList arrayListM14488r = this.f36545b.m14488r();
        int i10 = 0;
        if (((CaptureSessionOnClosedNotCalledQuirk) c7622f.f36778a) != null) {
            LinkedHashSet<g1> linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                g1 g1Var2 = (g1) obj;
                if (g1Var2 == g1Var) {
                    break;
                } else {
                    linkedHashSet.add(g1Var2);
                }
            }
            for (g1 g1Var3 : linkedHashSet) {
                g1Var3.getClass();
                g1Var3.mo14368d(g1Var3);
            }
        }
        Objects.requireNonNull(this.f36549f);
        x0 x0Var2 = this.f36545b;
        synchronized (x0Var2.f36755c) {
            ((LinkedHashSet) x0Var2.f36756d).add(this);
            ((LinkedHashSet) x0Var2.f36758f).remove(this);
        }
        x0Var2.m14487q(this);
        this.f36549f.mo14369e(g1Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) c7622f.f36778a) != null) {
            LinkedHashSet<g1> linkedHashSet2 = new LinkedHashSet();
            int size2 = arrayListM14488r.size();
            while (i10 < size2) {
                Object obj2 = arrayListM14488r.get(i10);
                i10++;
                g1 g1Var4 = (g1) obj2;
                if (g1Var4 == g1Var) {
                    break;
                } else {
                    linkedHashSet2.add(g1Var4);
                }
            }
            for (g1 g1Var5 : linkedHashSet2) {
                g1Var5.getClass();
                g1Var5.mo14367c(g1Var5);
            }
        }
    }

    @Override // p020v.d1
    /* renamed from: f */
    public final void mo14370f(g1 g1Var) {
        Objects.requireNonNull(this.f36549f);
        this.f36549f.mo14370f(g1Var);
    }

    @Override // p020v.d1
    /* renamed from: g */
    public final void mo14371g(g1 g1Var) {
        C8302l c8302l;
        synchronized (this.f36544a) {
            try {
                if (this.f36557n) {
                    c8302l = null;
                } else {
                    this.f36557n = true;
                    y0.m11055e(this.f36551h, "Need to call openCaptureSession before using this API.");
                    c8302l = this.f36551h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c8302l != null) {
            c8302l.f39850b.mo9026a(new e1(this, g1Var, 1), t8.m11872a());
        }
    }

    @Override // p020v.d1
    /* renamed from: h */
    public final void mo14372h(g1 g1Var, Surface surface) {
        Objects.requireNonNull(this.f36549f);
        this.f36549f.mo14372h(g1Var, surface);
    }

    /* renamed from: i */
    public final void m14378i() throws CameraAccessException {
        if (!this.f36566w.compareAndSet(false, true)) {
            m14380k("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f36565v.f9420a) {
            try {
                m14380k("Call abortCaptures() before closing session.");
                y0.m11055e(this.f36550g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((C8849i) this.f36550g.f36778a).f42583b).abortCaptures();
            } catch (Exception e2) {
                m14380k("Exception when calling abortCaptures()" + e2);
            }
        }
        m14380k("Session call close()");
        this.f36564u.m166e().mo9026a(new f1(this, 1), this.f36547d);
    }

    /* renamed from: j */
    public final void m14379j(CameraCaptureSession cameraCaptureSession) {
        if (this.f36550g == null) {
            C7622f c7622f = new C7622f();
            if (Build.VERSION.SDK_INT >= 28) {
                c7622f.f36778a = new C7840f(cameraCaptureSession, null);
            } else {
                c7622f.f36778a = new C8849i(cameraCaptureSession, new C7841g(this.f36546c));
            }
            this.f36550g = c7622f;
        }
    }

    /* renamed from: k */
    public final void m14380k(String str) {
        u1.m10942a("SyncCaptureSessionImpl");
    }

    /* renamed from: l */
    public final boolean m14381l() {
        boolean z6;
        synchronized (this.f36544a) {
            z6 = this.f36551h != null;
        }
        return z6;
    }

    /* renamed from: m */
    public final InterfaceFutureC8957d m14382m(CameraDevice cameraDevice, C8249s c8249s, List list) {
        InterfaceFutureC8957d interfaceFutureC8957dM9034d;
        synchronized (this.f36559p) {
            try {
                ArrayList arrayListM14488r = this.f36545b.m14488r();
                ArrayList arrayList = new ArrayList();
                int size = arrayListM14488r.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListM14488r.get(i10);
                    i10++;
                    g1 g1Var = (g1) obj;
                    arrayList.add(i7.m11697b(new C0677h(g1Var.f36564u.m166e(), g1Var.f36558o, 1500L)));
                }
                C4311k c4311k = new C4311k(new ArrayList(arrayList), false, t8.m11872a());
                this.f36561r = c4311k;
                interfaceFutureC8957dM9034d = AbstractC4308h.m9034d(AbstractC4308h.m9037g(C4304d.m9025b(c4311k), new C0268b(this, cameraDevice, c8249s, list), this.f36547d));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceFutureC8957dM9034d;
    }

    /* renamed from: n */
    public final int m14383n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackM164c = this.f36564u.m164c(captureCallback);
        y0.m11055e(this.f36550g, "Need to call openCaptureSession before using this API.");
        return ((C8849i) this.f36550g.f36778a).mo14821H(captureRequest, this.f36547d, captureCallbackM164c);
    }

    /* renamed from: o */
    public final InterfaceFutureC8957d m14384o(ArrayList arrayList) {
        synchronized (this.f36544a) {
            try {
                if (this.f36556m) {
                    return new C4310j(1, new CancellationException("Opener is disabled"));
                }
                RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(C4304d.m9025b(AbstractC5944y.m11937b(arrayList, this.f36547d, this.f36548e)), new b0(this, arrayList), this.f36547d);
                this.f36553j = runnableC4302bM9037g;
                return AbstractC4308h.m9034d(runnableC4302bM9037g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public final boolean m14385p() {
        boolean z6;
        synchronized (this.f36559p) {
            try {
                if (m14381l()) {
                    this.f36562s.m5781a(this.f36560q);
                } else {
                    C4311k c4311k = this.f36561r;
                    if (c4311k != null) {
                        c4311k.cancel(true);
                    }
                }
                try {
                    synchronized (this.f36544a) {
                        try {
                            if (!this.f36556m) {
                                C4304d c4304d = this.f36553j;
                                c4304d = c4304d != null ? c4304d : null;
                                this.f36556m = true;
                            }
                            z6 = !m14381l();
                        } finally {
                        }
                    }
                } finally {
                    if (c4304d != null) {
                        c4304d.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: q */
    public final void m14386q() throws CameraAccessException {
        y0.m11055e(this.f36550g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((C8849i) this.f36550g.f36778a).f42583b).stopRepeating();
    }

    /* renamed from: r */
    public final C7622f m14387r() {
        this.f36550g.getClass();
        return this.f36550g;
    }
}
