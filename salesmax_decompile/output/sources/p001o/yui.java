package p001o;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public interface yui {

    /* renamed from: o.yui$a */
    public static final class C18499a {

        /* renamed from: a */
        public final Handler f56078a;

        /* renamed from: b */
        public final yui f56079b;

        public C18499a(Handler handler, yui yuiVar) {
            this.f56078a = yuiVar != null ? (Handler) op0.m42515e(handler) : null;
            this.f56079b = yuiVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m58333q(String str, long j, long j2) {
            ((yui) sqi.m48729h(this.f56079b)).mo7178g(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m58334r(String str) {
            ((yui) sqi.m48729h(this.f56079b)).mo7177f(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m58335s(y75 y75Var) {
            y75Var.m57335c();
            ((yui) sqi.m48729h(this.f56079b)).mo7190s(y75Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m58336t(int i, long j) {
            ((yui) sqi.m48729h(this.f56079b)).mo7189r(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m58337u(y75 y75Var) {
            ((yui) sqi.m48729h(this.f56079b)).mo7187p(y75Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m58338v(C2181a c2181a, c85 c85Var) {
            ((yui) sqi.m48729h(this.f56079b)).mo7179h(c2181a, c85Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m58339w(Object obj, long j) {
            ((yui) sqi.m48729h(this.f56079b)).mo7191t(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m58340x(long j, int i) {
            ((yui) sqi.m48729h(this.f56079b)).mo7168A(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m58341y(Exception exc) {
            ((yui) sqi.m48729h(this.f56079b)).mo7185n(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m58342z(bvi bviVar) {
            ((yui) sqi.m48729h(this.f56079b)).mo7174c(bviVar);
        }

        /* renamed from: A */
        public void m58343A(final Object obj) {
            if (this.f56078a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f56078a.post(new Runnable() { // from class: o.pui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40642a.m58339w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m58344B(final long j, final int i) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.rui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44091a.m58340x(j, i);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m58345C(final Exception exc) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.qui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42467a.m58341y(exc);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m58346D(final bvi bviVar) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.wui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52681a.m58342z(bviVar);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m58347k(final String str, final long j, final long j2) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.uui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49521a.m58333q(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m58348l(final String str) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.xui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54317a.m58334r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m58349m(final y75 y75Var) {
            y75Var.m57335c();
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.tui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47938a.m58335s(y75Var);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m58350n(final int i, final long j) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.oui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38951a.m58336t(i, j);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m58351o(final y75 y75Var) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.sui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45987a.m58337u(y75Var);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m58352p(final C2181a c2181a, final c85 c85Var) {
            Handler handler = this.f56078a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.vui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50905a.m58338v(c2181a, c85Var);
                    }
                });
            }
        }
    }

    /* renamed from: A */
    void mo7168A(long j, int i);

    /* renamed from: c */
    void mo7174c(bvi bviVar);

    /* renamed from: f */
    void mo7177f(String str);

    /* renamed from: g */
    void mo7178g(String str, long j, long j2);

    /* renamed from: h */
    void mo7179h(C2181a c2181a, c85 c85Var);

    /* renamed from: n */
    void mo7185n(Exception exc);

    /* renamed from: p */
    void mo7187p(y75 y75Var);

    /* renamed from: r */
    void mo7189r(int i, long j);

    /* renamed from: s */
    void mo7190s(y75 y75Var);

    /* renamed from: t */
    void mo7191t(Object obj, long j);
}
