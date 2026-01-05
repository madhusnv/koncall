package p001o;

import android.graphics.Bitmap;
import androidx.camera.core.InterfaceC1893c;
import java.util.Objects;
import p001o.g32;
import p001o.mjg;
import p001o.sc8;

/* loaded from: classes2.dex */
public class bne implements cjg {

    /* renamed from: a */
    public final mjg f16581a;

    /* renamed from: b */
    public final mjg.InterfaceC15344a f16582b;

    /* renamed from: e */
    public g32.C13614a f16585e;

    /* renamed from: f */
    public g32.C13614a f16586f;

    /* renamed from: i */
    public zfa f16589i;

    /* renamed from: g */
    public boolean f16587g = false;

    /* renamed from: h */
    public boolean f16588h = false;

    /* renamed from: c */
    public final zfa f16583c = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.zme
        @Override // p001o.g32.InterfaceC13616c
        public final Object attachCompleter(g32.C13614a c13614a) {
            return this.f57419a.m19454q(c13614a);
        }
    });

    /* renamed from: d */
    public final zfa f16584d = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.ane
        @Override // p001o.g32.InterfaceC13616c
        public final Object attachCompleter(g32.C13614a c13614a) {
            return this.f15052a.m19455r(c13614a);
        }
    });

    public bne(mjg mjgVar, mjg.InterfaceC15344a interfaceC15344a) {
        this.f16581a = mjgVar;
        this.f16582b = interfaceC15344a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m19454q(g32.C13614a c13614a) {
        this.f16585e = c13614a;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m19455r(g32.C13614a c13614a) {
        this.f16586f = c13614a;
        return "RequestCompleteFuture";
    }

    @Override // p001o.cjg
    /* renamed from: a */
    public void mo19456a(int i) {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        this.f16581a.m39247w(i);
    }

    @Override // p001o.cjg
    /* renamed from: b */
    public void mo19457b(Bitmap bitmap) {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        this.f16581a.m39249y(bitmap);
    }

    @Override // p001o.cjg
    /* renamed from: c */
    public void mo19458c() {
        elh.m25220a();
        if (this.f16587g || this.f16588h) {
            return;
        }
        this.f16588h = true;
        this.f16581a.mo39240j();
        sc8.InterfaceC16802f interfaceC16802fMo39242l = this.f16581a.mo39242l();
        if (interfaceC16802fMo39242l != null) {
            interfaceC16802fMo39242l.m48176c();
        }
    }

    @Override // p001o.cjg
    /* renamed from: d */
    public void mo19459d(InterfaceC1893c interfaceC1893c) {
        elh.m25220a();
        if (this.f16587g) {
            interfaceC1893c.close();
            return;
        }
        m19467n();
        m19470s();
        this.f16581a.m39250z(interfaceC1893c);
    }

    @Override // p001o.cjg
    /* renamed from: e */
    public void mo19460e(vc8 vc8Var) {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        m19467n();
        m19470s();
        m19471t(vc8Var);
    }

    @Override // p001o.cjg
    /* renamed from: f */
    public void mo19461f() {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        if (!this.f16588h) {
            mo19458c();
        }
        this.f16585e.m28005c(null);
    }

    @Override // p001o.cjg
    /* renamed from: g */
    public void mo19462g(sc8.C16804h c16804h) {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        m19467n();
        m19470s();
        this.f16581a.m39235A(c16804h);
    }

    @Override // p001o.cjg
    /* renamed from: h */
    public void mo19463h(vc8 vc8Var) {
        elh.m25220a();
        if (this.f16587g) {
            return;
        }
        boolean zM39236f = this.f16581a.m39236f();
        if (!zM39236f) {
            m19471t(vc8Var);
        }
        m19470s();
        this.f16585e.m28008f(vc8Var);
        if (zM39236f) {
            this.f16582b.mo28888a(this.f16581a);
        }
    }

    @Override // p001o.cjg
    public boolean isAborted() {
        return this.f16587g;
    }

    /* renamed from: k */
    public final void m19464k(vc8 vc8Var) {
        elh.m25220a();
        this.f16587g = true;
        zfa zfaVar = this.f16589i;
        Objects.requireNonNull(zfaVar);
        zfaVar.cancel(true);
        this.f16585e.m28008f(vc8Var);
        this.f16586f.m28005c(null);
    }

    /* renamed from: l */
    public void m19465l(vc8 vc8Var) {
        elh.m25220a();
        if (this.f16584d.isDone()) {
            return;
        }
        m19464k(vc8Var);
        m19471t(vc8Var);
    }

    /* renamed from: m */
    public void m19466m() {
        elh.m25220a();
        if (this.f16584d.isDone()) {
            return;
        }
        m19464k(new vc8(3, "The request is aborted silently and retried.", null));
        this.f16582b.mo28888a(this.f16581a);
    }

    /* renamed from: n */
    public final void m19467n() {
        fgd.m26666j(this.f16583c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* renamed from: o */
    public zfa m19468o() {
        elh.m25220a();
        return this.f16583c;
    }

    /* renamed from: p */
    public zfa m19469p() {
        elh.m25220a();
        return this.f16584d;
    }

    /* renamed from: s */
    public final void m19470s() {
        fgd.m26666j(!this.f16584d.isDone(), "The callback can only complete once.");
        this.f16586f.m28005c(null);
    }

    /* renamed from: t */
    public final void m19471t(vc8 vc8Var) {
        elh.m25220a();
        this.f16581a.m39248x(vc8Var);
    }

    /* renamed from: u */
    public void m19472u(zfa zfaVar) {
        elh.m25220a();
        fgd.m26666j(this.f16589i == null, "CaptureRequestFuture can only be set once.");
        this.f16589i = zfaVar;
    }
}
