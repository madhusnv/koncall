package p001o;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class ha3 {

    /* renamed from: a */
    public final ReferenceQueue f26468a = new ReferenceQueue();

    /* renamed from: b */
    public final Set f26469b = Collections.synchronizedSet(new HashSet());

    /* renamed from: o.ha3$a */
    public interface InterfaceC13897a {
        /* renamed from: a */
        void mo30032a();
    }

    /* renamed from: a */
    public static ha3 m30030a() {
        ha3 ha3Var = new ha3();
        ha3Var.m30031b(ha3Var, new Runnable() { // from class: o.ohj
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = ha3Var.f26468a;
        final Set set = ha3Var.f26469b;
        Thread thread = new Thread(new Runnable() { // from class: o.aij
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((kij) referenceQueue2.remove()).mo30032a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return ha3Var;
    }

    /* renamed from: b */
    public InterfaceC13897a m30031b(Object obj, Runnable runnable) {
        kij kijVar = new kij(obj, this.f26468a, this.f26469b, runnable, null);
        this.f26469b.add(kijVar);
        return kijVar;
    }
}
