package qi;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ji.AbstractC3768b;
import nj.InterfaceC5075a;
import nj.InterfaceC5076b;
import nj.InterfaceC5077c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.l */
/* loaded from: classes.dex */
public final class C6229l implements InterfaceC5077c, InterfaceC5076b {

    /* renamed from: a */
    public final HashMap f30241a = new HashMap();

    /* renamed from: b */
    public ArrayDeque f30242b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f30243c;

    public C6229l(Executor executor) {
        this.f30243c = executor;
    }

    /* renamed from: a */
    public final synchronized void m12248a(Executor executor, InterfaceC5075a interfaceC5075a) {
        try {
            executor.getClass();
            if (!this.f30241a.containsKey(AbstractC3768b.class)) {
                this.f30241a.put(AbstractC3768b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f30241a.get(AbstractC3768b.class)).put(interfaceC5075a, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
