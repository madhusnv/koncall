package u2;

import s2.C6732a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.z */
/* loaded from: classes.dex */
public abstract class AbstractC7329z implements InterfaceC7328y {

    /* renamed from: a */
    public final C6732a f34944a = new C6732a(0);

    /* renamed from: d */
    public final boolean m13724d(int i10) {
        return (i10 & this.f34944a.get()) != 0;
    }

    /* renamed from: e */
    public final void m13725e(int i10) {
        C6732a c6732a;
        int i11;
        do {
            c6732a = this.f34944a;
            i11 = c6732a.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!c6732a.compareAndSet(i11, i11 | i10));
    }
}
