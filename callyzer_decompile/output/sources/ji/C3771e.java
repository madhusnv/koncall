package ji;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import oj.C5391c;
import rf.InterfaceC6497b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.e */
/* loaded from: classes.dex */
public final class C3771e implements InterfaceC6497b {

    /* renamed from: a */
    public static final AtomicReference f19657a = new AtomicReference();

    @Override // rf.InterfaceC6497b
    /* renamed from: a */
    public final void mo385a(boolean z6) {
        synchronized (C3773g.f19660k) {
            try {
                ArrayList arrayList = new ArrayList(C3773g.f19661l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C3773g c3773g = (C3773g) obj;
                    if (c3773g.f19666e.get()) {
                        Iterator it = c3773g.f19670i.iterator();
                        while (it.hasNext()) {
                            C3773g c3773g2 = ((C3770d) it.next()).f19656a;
                            if (!z6) {
                                ((C5391c) c3773g2.f19669h.get()).m11108b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
