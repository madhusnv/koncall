package p001o;

import android.os.Handler;
import androidx.media3.common.C2181a;
import p001o.kz0;

/* loaded from: classes2.dex */
public interface jz0 {

    /* renamed from: o.jz0$a */
    public static final class C14682a {

        /* renamed from: a */
        public final Handler f31276a;

        /* renamed from: b */
        public final jz0 f31277b;

        public C14682a(Handler handler, jz0 jz0Var) {
            this.f31276a = jz0Var != null ? (Handler) op0.m42515e(handler) : null;
            this.f31277b = jz0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m34739A(String str) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7181j(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public /* synthetic */ void m34740B(y75 y75Var) {
            y75Var.m57335c();
            ((jz0) sqi.m48729h(this.f31277b)).mo7186o(y75Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public /* synthetic */ void m34741C(y75 y75Var) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7180i(y75Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public /* synthetic */ void m34742D(C2181a c2181a, c85 c85Var) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7194x(c2181a, c85Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public /* synthetic */ void m34743E(long j) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7184m(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public /* synthetic */ void m34744F(boolean z) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7175d(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public /* synthetic */ void m34745G(int i, long j, long j2) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7196z(i, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m34758v(Exception exc) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7195y(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m34759w(Exception exc) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7176e(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m34760x(kz0.C14937a c14937a) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7173b(c14937a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m34761y(kz0.C14937a c14937a) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7172a(c14937a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m34762z(String str, long j, long j2) {
            ((jz0) sqi.m48729h(this.f31277b)).mo7182k(str, j, j2);
        }

        /* renamed from: H */
        public void m34763H(final long j) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.cz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18853a.m34743E(j);
                    }
                });
            }
        }

        /* renamed from: I */
        public void m34764I(final boolean z) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.hz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27814a.m34744F(z);
                    }
                });
            }
        }

        /* renamed from: J */
        public void m34765J(final int i, final long j, final long j2) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.iz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29374a.m34745G(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m34766m(final Exception exc) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.xy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54471a.m34758v(exc);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m34767n(final Exception exc) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ez0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22422a.m34759w(exc);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m34768o(final kz0.C14937a c14937a) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.zy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f57858a.m34760x(c14937a);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m34769p(final kz0.C14937a c14937a) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.yy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56249a.m34761y(c14937a);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m34770q(final String str, final long j, final long j2) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.dz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20657a.m34762z(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: r */
        public void m34771r(final String str) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.fz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24266a.m34739A(str);
                    }
                });
            }
        }

        /* renamed from: s */
        public void m34772s(final y75 y75Var) {
            y75Var.m57335c();
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.az0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15386a.m34740B(y75Var);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m34773t(final y75 y75Var) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.bz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16975a.m34741C(y75Var);
                    }
                });
            }
        }

        /* renamed from: u */
        public void m34774u(final C2181a c2181a, final c85 c85Var) {
            Handler handler = this.f31276a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.gz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25979a.m34742D(c2181a, c85Var);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo7172a(kz0.C14937a c14937a);

    /* renamed from: b */
    void mo7173b(kz0.C14937a c14937a);

    /* renamed from: d */
    void mo7175d(boolean z);

    /* renamed from: e */
    void mo7176e(Exception exc);

    /* renamed from: i */
    void mo7180i(y75 y75Var);

    /* renamed from: j */
    void mo7181j(String str);

    /* renamed from: k */
    void mo7182k(String str, long j, long j2);

    /* renamed from: m */
    void mo7184m(long j);

    /* renamed from: o */
    void mo7186o(y75 y75Var);

    /* renamed from: x */
    void mo7194x(C2181a c2181a, c85 c85Var);

    /* renamed from: y */
    void mo7195y(Exception exc);

    /* renamed from: z */
    void mo7196z(int i, long j, long j2);
}
