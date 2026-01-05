package yg;

import java.util.concurrent.Executor;
import l0.RunnableC4307g;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yg.j */
/* loaded from: classes.dex */
public final class C8653j implements InterfaceC8655l, InterfaceC8648e, InterfaceC8647d, InterfaceC8645b {

    /* renamed from: a */
    public final /* synthetic */ int f41941a;

    /* renamed from: b */
    public final Executor f41942b;

    /* renamed from: c */
    public final InterfaceC8644a f41943c;

    /* renamed from: d */
    public final C8656m f41944d;

    public /* synthetic */ C8653j(Executor executor, InterfaceC8644a interfaceC8644a, C8656m c8656m, int i10) {
        this.f41941a = i10;
        this.f41942b = executor;
        this.f41943c = interfaceC8644a;
        this.f41944d = c8656m;
    }

    @Override // yg.InterfaceC8655l
    /* renamed from: a */
    public final void mo15973a(C8656m c8656m) {
        switch (this.f41941a) {
            case 0:
                this.f41942b.execute(new RunnableC8956c(26, this, c8656m, false));
                break;
            default:
                this.f41942b.execute(new RunnableC4307g(26, this, c8656m, false));
                break;
        }
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        this.f41944d.m15988o(obj);
    }

    @Override // yg.InterfaceC8645b
    /* renamed from: k */
    public void mo1946k() {
        this.f41944d.m15989p();
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        this.f41944d.m15987n(exc);
    }
}
