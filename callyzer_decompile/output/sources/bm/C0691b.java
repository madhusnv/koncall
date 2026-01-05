package bm;

import ex.InterfaceC2137a;
import k2.w0;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0691b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4327a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4328b;

    /* renamed from: c */
    public final /* synthetic */ w0 f4329c;

    public /* synthetic */ C0691b(boolean z6, w0 w0Var, int i10) {
        this.f4327a = i10;
        this.f4328b = z6;
        this.f4329c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4327a) {
            case 0:
                if (this.f4328b) {
                    this.f4329c.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (this.f4328b) {
                    this.f4329c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                }
                break;
        }
        return a0.f30746a;
    }
}
