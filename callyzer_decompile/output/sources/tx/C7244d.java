package tx;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.d */
/* loaded from: classes3.dex */
public final class C7244d implements InterfaceC7249i {

    /* renamed from: a */
    public final C7243c[] f34617a;

    public C7244d(C7243c[] c7243cArr) {
        this.f34617a = c7243cArr;
    }

    /* renamed from: a */
    public final void m13505a() {
        for (C7243c c7243c : this.f34617a) {
            o0 o0Var = c7243c.f34603f;
            if (o0Var == null) {
                AbstractC4154l.m8928k("handle");
                throw null;
            }
            o0Var.dispose();
        }
    }

    @Override // tx.InterfaceC7249i
    /* renamed from: b */
    public final void mo5077b(Throwable th2) {
        m13505a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f34617a + ']';
    }
}
