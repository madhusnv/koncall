package p001o;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes6.dex */
public abstract class lpa {

    /* renamed from: a */
    public static final boolean f34186a = false;

    /* renamed from: a */
    public static final igb m37585a(Throwable th, String str) throws Throwable {
        if (f34186a) {
            return new igb(th, str);
        }
        if (th != null) {
            throw th;
        }
        m37588d();
        throw new qe9();
    }

    /* renamed from: b */
    public static /* synthetic */ igb m37586b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m37585a(th, str);
    }

    /* renamed from: c */
    public static final boolean m37587c(jpa jpaVar) {
        return jpaVar.r0() instanceof igb;
    }

    /* renamed from: d */
    public static final Void m37588d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final jpa m37589e(MainDispatcherFactory mainDispatcherFactory, List list) {
        try {
            return mainDispatcherFactory.mo16253b(list);
        } catch (Throwable th) {
            return m37585a(th, mainDispatcherFactory.mo16252a());
        }
    }
}
