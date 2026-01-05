package nf;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import j7.C3595b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import k7.AbstractC4021c;
import k7.EnumC4023e;
import k7.RunnableC4019a;
import og.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.d */
/* loaded from: classes.dex */
public final class C5042d {

    /* renamed from: a */
    public C3595b f24806a;

    /* renamed from: b */
    public boolean f24807b;

    /* renamed from: c */
    public boolean f24808c;

    /* renamed from: d */
    public boolean f24809d;

    /* renamed from: e */
    public boolean f24810e;

    /* renamed from: f */
    public final Executor f24811f;

    /* renamed from: g */
    public volatile RunnableC4019a f24812g;

    /* renamed from: h */
    public volatile RunnableC4019a f24813h;

    /* renamed from: i */
    public final Semaphore f24814i;

    /* renamed from: j */
    public final Set f24815j;

    public C5042d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = RunnableC4019a.f20788h;
        this.f24807b = false;
        this.f24808c = false;
        this.f24809d = true;
        this.f24810e = false;
        signInHubActivity.getApplicationContext();
        this.f24811f = threadPoolExecutor;
        this.f24814i = new Semaphore(0);
        this.f24815j = set;
    }

    /* renamed from: a */
    public final void m9962a() {
        if (this.f24812g != null) {
            if (!this.f24807b) {
                this.f24810e = true;
            }
            if (this.f24813h != null) {
                this.f24812g.getClass();
                this.f24812g = null;
                return;
            }
            this.f24812g.getClass();
            RunnableC4019a runnableC4019a = this.f24812g;
            runnableC4019a.f20793d.set(true);
            if (runnableC4019a.f20791b.cancel(false)) {
                this.f24813h = this.f24812g;
            }
            this.f24812g = null;
        }
    }

    /* renamed from: b */
    public final void m9963b() {
        if (this.f24813h != null || this.f24812g == null) {
            return;
        }
        this.f24812g.getClass();
        RunnableC4019a runnableC4019a = this.f24812g;
        Executor executor = this.f24811f;
        if (runnableC4019a.f20792c == EnumC4023e.PENDING) {
            runnableC4019a.f20792c = EnumC4023e.RUNNING;
            runnableC4019a.f20790a.getClass();
            executor.execute(runnableC4019a.f20791b);
        } else {
            int i10 = AbstractC4021c.f20798a[runnableC4019a.f20792c.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        v0.m11008a(this, sb2);
        sb2.append(" id=");
        sb2.append(0);
        sb2.append("}");
        return sb2.toString();
    }
}
