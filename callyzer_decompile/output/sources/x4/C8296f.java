package x4;

import pg.h7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.f */
/* loaded from: classes.dex */
public final class C8296f extends h7 {
    @Override // pg.h7
    /* renamed from: a */
    public final boolean mo11677a(AbstractC8298h abstractC8298h, C8294d c8294d, C8294d c8294d2) {
        synchronized (abstractC8298h) {
            try {
                if (abstractC8298h.f39842b != c8294d) {
                    return false;
                }
                abstractC8298h.f39842b = c8294d2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pg.h7
    /* renamed from: b */
    public final boolean mo11678b(AbstractC8298h abstractC8298h, Object obj, Object obj2) {
        synchronized (abstractC8298h) {
            try {
                if (abstractC8298h.f39841a != obj) {
                    return false;
                }
                abstractC8298h.f39841a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pg.h7
    /* renamed from: c */
    public final boolean mo11679c(AbstractC8298h abstractC8298h, C8297g c8297g, C8297g c8297g2) {
        synchronized (abstractC8298h) {
            try {
                if (abstractC8298h.f39843c != c8297g) {
                    return false;
                }
                abstractC8298h.f39843c = c8297g2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pg.h7
    /* renamed from: e */
    public final void mo11680e(C8297g c8297g, C8297g c8297g2) {
        c8297g.f39836b = c8297g2;
    }

    @Override // pg.h7
    /* renamed from: f */
    public final void mo11681f(C8297g c8297g, Thread thread) {
        c8297g.f39835a = thread;
    }
}
