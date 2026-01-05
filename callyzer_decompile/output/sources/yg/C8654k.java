package yg;

import bk.RunnableC0683n;
import java.util.concurrent.Executor;
import l0.RunnableC4307g;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yg.k */
/* loaded from: classes.dex */
public final class C8654k implements InterfaceC8655l, InterfaceC8648e, InterfaceC8647d, InterfaceC8645b {

    /* renamed from: a */
    public final /* synthetic */ int f41945a;

    /* renamed from: b */
    public final Executor f41946b;

    /* renamed from: c */
    public final Object f41947c;

    /* renamed from: d */
    public final Object f41948d;

    public C8654k(Executor executor, InterfaceC8645b interfaceC8645b) {
        this.f41945a = 0;
        this.f41947c = new Object();
        this.f41946b = executor;
        this.f41948d = interfaceC8645b;
    }

    @Override // yg.InterfaceC8655l
    /* renamed from: a */
    public final void mo15973a(C8656m c8656m) {
        switch (this.f41945a) {
            case 0:
                if (c8656m.f41952d) {
                    synchronized (this.f41947c) {
                    }
                    this.f41946b.execute(new RunnableC0683n(27, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.f41947c) {
                }
                this.f41946b.execute(new RunnableC8956c(27, this, c8656m, false));
                return;
            case 2:
                if (c8656m.m15985l() || c8656m.f41952d) {
                    return;
                }
                synchronized (this.f41947c) {
                }
                this.f41946b.execute(new RunnableC4307g(27, this, c8656m, false));
                return;
            case 3:
                if (c8656m.m15985l()) {
                    synchronized (this.f41947c) {
                    }
                    this.f41946b.execute(new RunnableC8956c(28, this, c8656m, false));
                    return;
                }
                return;
            default:
                this.f41946b.execute(new RunnableC4307g(28, this, c8656m, false));
                return;
        }
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        ((C8656m) this.f41948d).m15988o(obj);
    }

    @Override // yg.InterfaceC8645b
    /* renamed from: k */
    public void mo1946k() {
        ((C8656m) this.f41948d).m15989p();
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        ((C8656m) this.f41948d).m15987n(exc);
    }

    public C8654k(Executor executor, InterfaceC8646c interfaceC8646c) {
        this.f41945a = 1;
        this.f41947c = new Object();
        this.f41946b = executor;
        this.f41948d = interfaceC8646c;
    }

    public C8654k(Executor executor, InterfaceC8647d interfaceC8647d) {
        this.f41945a = 2;
        this.f41947c = new Object();
        this.f41946b = executor;
        this.f41948d = interfaceC8647d;
    }

    public C8654k(Executor executor, InterfaceC8648e interfaceC8648e) {
        this.f41945a = 3;
        this.f41947c = new Object();
        this.f41946b = executor;
        this.f41948d = interfaceC8648e;
    }

    public C8654k(Executor executor, InterfaceC8649f interfaceC8649f, C8656m c8656m) {
        this.f41945a = 4;
        this.f41946b = executor;
        this.f41947c = interfaceC8649f;
        this.f41948d = c8656m;
    }
}
