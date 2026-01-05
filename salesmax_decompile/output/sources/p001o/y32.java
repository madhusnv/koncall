package p001o;

import java.util.concurrent.Executor;
import p001o.d72;
import p001o.g32;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class y32 {

    /* renamed from: c */
    public final m42 f54811c;

    /* renamed from: d */
    public final Executor f54812d;

    /* renamed from: g */
    public g32.C13614a f54815g;

    /* renamed from: a */
    public boolean f54809a = false;

    /* renamed from: b */
    public boolean f54810b = false;

    /* renamed from: e */
    public final Object f54813e = new Object();

    /* renamed from: f */
    public d72.C12801a f54814f = new d72.C12801a();

    public y32(m42 m42Var, Executor executor) {
        this.f54811c = m42Var;
        this.f54812d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m57169p(final g32.C13614a c13614a) {
        this.f54812d.execute(new Runnable() { // from class: o.w32
            @Override // java.lang.Runnable
            public final void run() {
                this.f51366a.m57168o(c13614a);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m57171r(final g32.C13614a c13614a) {
        this.f54812d.execute(new Runnable() { // from class: o.v32
            @Override // java.lang.Runnable
            public final void run() {
                this.f49822a.m57170q(c13614a);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* renamed from: g */
    public zfa m57173g(rd2 rd2Var) {
        m57174h(rd2Var);
        return bn7.m19407B(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.u32
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f48227a.m57169p(c13614a);
            }
        }));
    }

    /* renamed from: h */
    public final void m57174h(rd2 rd2Var) {
        synchronized (this.f54813e) {
            this.f54814f.m22393d(rd2Var);
        }
    }

    /* renamed from: i */
    public void m57175i(d72.C12801a c12801a) {
        synchronized (this.f54813e) {
            c12801a.m22394e(this.f54814f.mo17073a(), mq3.EnumC15404c.ALWAYS_OVERRIDE);
        }
    }

    /* renamed from: j */
    public zfa m57176j() {
        m57177k();
        return bn7.m19407B(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.t32
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f46288a.m57171r(c13614a);
            }
        }));
    }

    /* renamed from: k */
    public final void m57177k() {
        synchronized (this.f54813e) {
            this.f54814f = new d72.C12801a();
        }
    }

    /* renamed from: l */
    public final void m57178l() {
        g32.C13614a c13614a = this.f54815g;
        if (c13614a != null) {
            c13614a.m28005c(null);
            this.f54815g = null;
        }
    }

    /* renamed from: m */
    public final void m57179m(Exception exc) {
        g32.C13614a c13614a = this.f54815g;
        if (c13614a != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            c13614a.m28008f(exc);
            this.f54815g = null;
        }
    }

    /* renamed from: n */
    public d72 m57180n() {
        d72 d72VarM22392c;
        synchronized (this.f54813e) {
            d72VarM22392c = this.f54814f.m22392c();
        }
        return d72VarM22392c;
    }

    /* renamed from: t */
    public void m57181t(final boolean z) {
        this.f54812d.execute(new Runnable() { // from class: o.s32
            @Override // java.lang.Runnable
            public final void run() {
                this.f44641a.m57172s(z);
            }
        });
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m57172s(boolean z) {
        if (this.f54809a == z) {
            return;
        }
        this.f54809a = z;
        if (!z) {
            m57179m(new y82("The camera control has became inactive."));
        } else if (this.f54810b) {
            m57184w();
        }
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m57170q(g32.C13614a c13614a) {
        this.f54810b = true;
        m57179m(new y82("Camera2CameraControl was updated with new options."));
        this.f54815g = c13614a;
        if (this.f54809a) {
            m57184w();
        }
    }

    /* renamed from: w */
    public final void m57184w() {
        this.f54811c.i0().addListener(new Runnable() { // from class: o.x32
            @Override // java.lang.Runnable
            public final void run() {
                this.f53130a.m57178l();
            }
        }, this.f54812d);
        this.f54810b = false;
    }
}
