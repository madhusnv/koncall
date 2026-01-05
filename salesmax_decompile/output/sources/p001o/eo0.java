package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class eo0 extends pog {

    /* renamed from: c */
    public static volatile eo0 f21969c;

    /* renamed from: d */
    public static final Executor f21970d = new Executor() { // from class: o.co0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            eo0.m25357i(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f21971e = new Executor() { // from class: o.do0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            eo0.m25358j(runnable);
        }
    };

    /* renamed from: a */
    public pog f21972a;

    /* renamed from: b */
    public final pog f21973b;

    public eo0() {
        mi5 mi5Var = new mi5();
        this.f21973b = mi5Var;
        this.f21972a = mi5Var;
    }

    /* renamed from: g */
    public static Executor m25355g() {
        return f21971e;
    }

    /* renamed from: h */
    public static eo0 m25356h() {
        if (f21969c != null) {
            return f21969c;
        }
        synchronized (eo0.class) {
            if (f21969c == null) {
                f21969c = new eo0();
            }
        }
        return f21969c;
    }

    /* renamed from: i */
    public static /* synthetic */ void m25357i(Runnable runnable) {
        m25356h().mo25361d(runnable);
    }

    /* renamed from: j */
    public static /* synthetic */ void m25358j(Runnable runnable) {
        m25356h().mo25359a(runnable);
    }

    @Override // p001o.pog
    /* renamed from: a */
    public void mo25359a(Runnable runnable) {
        this.f21972a.mo25359a(runnable);
    }

    @Override // p001o.pog
    /* renamed from: c */
    public boolean mo25360c() {
        return this.f21972a.mo25360c();
    }

    @Override // p001o.pog
    /* renamed from: d */
    public void mo25361d(Runnable runnable) {
        this.f21972a.mo25361d(runnable);
    }
}
