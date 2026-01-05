package qi;

import java.util.Set;
import qj.InterfaceC6237b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.c */
/* loaded from: classes.dex */
public interface InterfaceC6220c {
    /* renamed from: a */
    default Object mo12234a(Class cls) {
        return mo12237d(C6234q.m12250a(cls));
    }

    /* renamed from: b */
    C6232o mo12235b(C6234q c6234q);

    /* renamed from: c */
    default InterfaceC6237b mo12236c(Class cls) {
        return mo12240g(C6234q.m12250a(cls));
    }

    /* renamed from: d */
    default Object mo12237d(C6234q c6234q) {
        InterfaceC6237b interfaceC6237bMo12240g = mo12240g(c6234q);
        if (interfaceC6237bMo12240g == null) {
            return null;
        }
        return interfaceC6237bMo12240g.get();
    }

    /* renamed from: e */
    InterfaceC6237b mo12238e(C6234q c6234q);

    /* renamed from: f */
    default Set mo12239f(C6234q c6234q) {
        return (Set) mo12238e(c6234q).get();
    }

    /* renamed from: g */
    InterfaceC6237b mo12240g(C6234q c6234q);
}
