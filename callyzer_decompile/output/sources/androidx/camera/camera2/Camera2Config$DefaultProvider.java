package androidx.camera.camera2;

import c0.C0830w;
import c0.C0832y;
import c0.InterfaceC0831x;
import i0.C3076g;
import i0.j1;
import i0.o1;
import p018t.C6970a;
import p018t.C6971b;
import p018t.C6972c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements InterfaceC0831x {
    @Override // c0.InterfaceC0831x
    public C0832y getCameraXConfig() {
        C6970a c6970a = new C6970a();
        C6971b c6971b = new C6971b();
        C6972c c6972c = new C6972c();
        C0830w c0830w = new C0830w();
        C3076g c3076g = C0832y.f5272b;
        j1 j1Var = c0830w.f5255a;
        j1Var.m7352n(c3076g, c6970a);
        j1Var.m7352n(C0832y.f5273c, c6971b);
        j1Var.m7352n(C0832y.f5274d, c6972c);
        j1Var.m7352n(C0832y.f5282m, 0);
        j1Var.m7352n(C0832y.f5283n, Boolean.TRUE);
        return new C0832y(o1.m7399a(j1Var));
    }
}
