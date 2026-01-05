package nz;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import mz.AbstractC4917a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.k */
/* loaded from: classes3.dex */
public final class C5200k extends AbstractC4917a {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC5211v f25345e;

    /* renamed from: f */
    public final /* synthetic */ C5201l f25346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5200k(String str, InterfaceC5211v interfaceC5211v, C5201l c5201l) {
        super(str);
        this.f25345e = interfaceC5211v;
        this.f25346f = c5201l;
    }

    @Override // mz.AbstractC4917a
    /* renamed from: a */
    public final long mo9814a() throws InterruptedException {
        C5210u c5210u;
        InterfaceC5211v interfaceC5211v = this.f25345e;
        try {
            c5210u = interfaceC5211v.mo10170e();
        } catch (Throwable th2) {
            c5210u = new C5210u(interfaceC5211v, null, th2, 2);
        }
        C5201l c5201l = this.f25346f;
        if (!((CopyOnWriteArrayList) c5201l.f25352f).contains(interfaceC5211v)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c5201l.f25353g).put(c5210u);
        return -1L;
    }
}
