package wx;

import java.util.concurrent.atomic.AtomicReference;
import uw.InterfaceC7559c;
import xx.AbstractC8495a;
import xx.AbstractC8496b;
import xx.AbstractC8497c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n1 extends AbstractC8497c {

    /* renamed from: a */
    public final AtomicReference f39284a = new AtomicReference(null);

    @Override // xx.AbstractC8497c
    /* renamed from: a */
    public final boolean mo15394a(AbstractC8495a abstractC8495a) {
        AtomicReference atomicReference = this.f39284a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(c1.f39198b);
        return true;
    }

    @Override // xx.AbstractC8497c
    /* renamed from: b */
    public final InterfaceC7559c[] mo15395b(AbstractC8495a abstractC8495a) {
        this.f39284a.set(null);
        return AbstractC8496b.f41394a;
    }
}
