package c0;

import a1.RunnableC0024w;
import i0.AbstractC3084o;
import i0.InterfaceC3093x;
import i0.g2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import m0.C4609c;
import pg.t8;
import q3.C6105e;
import u0.C7297g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends AbstractC3084o {

    /* renamed from: a */
    public final /* synthetic */ int f5078a;

    /* renamed from: b */
    public final Object f5079b;

    public /* synthetic */ e1(int i10, Object obj) {
        this.f5078a = i10;
        this.f5079b = obj;
    }

    @Override // i0.AbstractC3084o
    /* renamed from: b */
    public void mo83b(int i10, InterfaceC3093x interfaceC3093x) {
        switch (this.f5078a) {
            case 0:
                f1 f1Var = (f1) this.f5079b;
                synchronized (f1Var.f5085a) {
                    try {
                        if (f1Var.f5089e) {
                            return;
                        }
                        f1Var.f5093j.put(interfaceC3093x.mo7426c(), new C4609c(interfaceC3093x));
                        f1Var.m2200g();
                        return;
                    } finally {
                    }
                }
            case 1:
            default:
                return;
            case 2:
                C7297g c7297g = (C7297g) ((WeakReference) this.f5079b).get();
                if (c7297g != null) {
                    Iterator it = c7297g.f34807a.iterator();
                    while (it.hasNext()) {
                        g2 g2Var = ((b2) it.next()).f5059n;
                        Iterator it2 = g2Var.f16473g.f16568d.iterator();
                        while (it2.hasNext()) {
                            ((AbstractC3084o) it2.next()).mo83b(i10, new C6105e(interfaceC3093x, g2Var.f16473g.f16570f, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: d */
    public void mo2192d(int i10) {
        switch (this.f5078a) {
            case 1:
                t8.m11875d().execute(new RunnableC0024w(16, this));
                break;
        }
    }

    public e1(C7297g c7297g) {
        this.f5078a = 2;
        this.f5079b = new WeakReference(c7297g);
    }
}
