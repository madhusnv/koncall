package p005f;

import p007h.AbstractC2751c;
import p007h.C2756h;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.k */
/* loaded from: classes.dex */
public final class C2162k extends AbstractC2751c {

    /* renamed from: a */
    public final C2152a f10019a;

    public C2162k(C2152a c2152a) {
        this.f10019a = c2152a;
    }

    @Override // p007h.AbstractC2751c
    /* renamed from: a */
    public final void mo1274a(Object obj) {
        a0 a0Var;
        C2756h c2756h = this.f10019a.f9995a;
        if (c2756h != null) {
            c2756h.mo1274a(obj);
            a0Var = a0.f30746a;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
