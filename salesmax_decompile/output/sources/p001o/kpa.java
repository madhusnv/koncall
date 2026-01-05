package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes6.dex */
public final class kpa {

    /* renamed from: a */
    public static final kpa f32531a;

    /* renamed from: b */
    public static final boolean f32532b = false;

    /* renamed from: c */
    public static final jpa f32533c;

    static {
        kpa kpaVar = new kpa();
        f32531a = kpaVar;
        pig.m43756f("kotlinx.coroutines.fast.service.loader", true);
        f32533c = kpaVar.m36037a();
    }

    /* renamed from: a */
    public final jpa m36037a() {
        Object next;
        jpa jpaVarM37589e;
        try {
            List listM21748c = f32532b ? ct6.f18612a.m21748c() : qef.m45302A(oef.m42144c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = listM21748c.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo16254c = ((MainDispatcherFactory) next).mo16254c();
                    do {
                        Object next2 = it.next();
                        int iMo16254c2 = ((MainDispatcherFactory) next2).mo16254c();
                        if (iMo16254c < iMo16254c2) {
                            next = next2;
                            iMo16254c = iMo16254c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (jpaVarM37589e = lpa.m37589e(mainDispatcherFactory, listM21748c)) == null) ? lpa.m37586b(null, null, 3, null) : jpaVarM37589e;
        } catch (Throwable th) {
            return lpa.m37586b(th, null, 2, null);
        }
    }
}
