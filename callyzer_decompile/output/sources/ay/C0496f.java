package ay;

import tx.AbstractC7262v;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.f */
/* loaded from: classes3.dex */
public final class C0496f extends AbstractC0499i {

    /* renamed from: d */
    public static final C0496f f3540d;

    static {
        int i10 = AbstractC0502l.f3548c;
        int i11 = AbstractC0502l.f3549d;
        long j6 = AbstractC0502l.f3550e;
        String str = AbstractC0502l.f3546a;
        C0496f c0496f = new C0496f();
        c0496f.f3542c = new ExecutorC0494d(str, i10, i11, j6);
        f3540d = c0496f;
    }

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return i10 >= AbstractC0502l.f3548c ? this : super.E0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
