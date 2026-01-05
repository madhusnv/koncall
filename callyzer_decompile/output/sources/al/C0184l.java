package al;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.l */
/* loaded from: classes.dex */
public final class C0184l extends PhantomReference {

    /* renamed from: a */
    public final Set f560a;

    /* renamed from: b */
    public final RunnableC0183k f561b;

    public /* synthetic */ C0184l(C0173a c0173a, ReferenceQueue referenceQueue, Set set, RunnableC0183k runnableC0183k) {
        super(c0173a, referenceQueue);
        this.f560a = set;
        this.f561b = runnableC0183k;
    }
}
