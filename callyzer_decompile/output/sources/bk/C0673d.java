package bk;

import java.util.concurrent.CountDownLatch;
import yg.C8656m;
import yg.InterfaceC8645b;
import yg.InterfaceC8646c;
import yg.InterfaceC8647d;
import yg.InterfaceC8648e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.d */
/* loaded from: classes.dex */
public final class C0673d implements InterfaceC8648e, InterfaceC8647d, InterfaceC8645b, InterfaceC8646c {

    /* renamed from: a */
    public final CountDownLatch f4244a;

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        this.f4244a.countDown();
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m c8656m) {
        this.f4244a.countDown();
    }

    @Override // yg.InterfaceC8645b
    /* renamed from: k */
    public void mo1946k() {
        this.f4244a.countDown();
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        this.f4244a.countDown();
    }

    public C0673d() {
        this.f4244a = new CountDownLatch(1);
    }
}
