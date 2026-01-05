package ak;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import rf.InterfaceC6497b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.i */
/* loaded from: classes.dex */
public final class C0170i implements InterfaceC6497b {

    /* renamed from: a */
    public static final AtomicReference f520a = new AtomicReference();

    @Override // rf.InterfaceC6497b
    /* renamed from: a */
    public final void mo385a(boolean z6) {
        Random random = C0171j.f521j;
        synchronized (C0171j.class) {
            Iterator it = C0171j.f522k.values().iterator();
            while (it.hasNext()) {
                ((C0165d) it.next()).m384c(z6);
            }
        }
    }
}
