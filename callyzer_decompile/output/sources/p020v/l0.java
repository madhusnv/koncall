package p020v;

import og.y0;
import x4.C8299i;
import x4.InterfaceC8300j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ o0 f36622a;

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        String str;
        o0 o0Var = this.f36622a;
        synchronized (o0Var.f36644a) {
            y0.m11056f("Release completer expected to be null", o0Var.f36655l == null);
            o0Var.f36655l = c8299i;
            str = "Release[session=" + o0Var + "]";
        }
        return str;
    }

    /* renamed from: a */
    public void m14404a() {
        o0 o0Var = this.f36622a;
        synchronized (o0Var.f36644a) {
            try {
                if (o0Var.f36653j == m0.OPENED) {
                    o0Var.m14416k(o0Var.f36649f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
