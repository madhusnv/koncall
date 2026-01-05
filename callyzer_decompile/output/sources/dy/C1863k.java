package dy;

import java.util.concurrent.atomic.AtomicReferenceArray;
import uw.InterfaceC7564h;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dy.k */
/* loaded from: classes3.dex */
public final class C1863k extends AbstractC8823q {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f8849e;

    public C1863k(long j6, C1863k c1863k, int i10) {
        super(j6, c1863k, i10);
        this.f8849e = new AtomicReferenceArray(AbstractC1862j.f8848f);
    }

    @Override // yx.AbstractC8823q
    /* renamed from: g */
    public final int mo5495g() {
        return AbstractC1862j.f8848f;
    }

    @Override // yx.AbstractC8823q
    /* renamed from: h */
    public final void mo5496h(int i10, InterfaceC7564h interfaceC7564h) {
        this.f8849e.set(i10, AbstractC1862j.f8847e);
        m16277i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f42518c + ", hashCode=" + hashCode() + ']';
    }
}
