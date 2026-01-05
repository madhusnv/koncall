package yg;

import sf.AbstractC6840z;
import uf.C7427b;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yg.g */
/* loaded from: classes.dex */
public final class C8650g {

    /* renamed from: a */
    public final C8656m f41930a = new C8656m();

    public C8650g() {
    }

    /* renamed from: a */
    public final void m15968a(Exception exc) {
        this.f41930a.m15987n(exc);
    }

    /* renamed from: b */
    public final void m15969b(Object obj) {
        this.f41930a.m15988o(obj);
    }

    /* renamed from: c */
    public final boolean m15970c(Exception exc) {
        C8656m c8656m = this.f41930a;
        c8656m.getClass();
        AbstractC6840z.m13037h(exc, "Exception must not be null");
        synchronized (c8656m.f41949a) {
            try {
                if (c8656m.f41951c) {
                    return false;
                }
                c8656m.f41951c = true;
                c8656m.f41954f = exc;
                c8656m.f41950b.m3401u(c8656m);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m15971d(Object obj) {
        this.f41930a.m15990q(obj);
    }

    public C8650g(C7622f c7622f) {
        C7427b c7427b = new C7427b(16, this);
        c7622f.getClass();
        ((C8656m) c7622f.f36778a).m15979f(AbstractC8651h.f41931a, new C7622f(c7427b));
    }
}
