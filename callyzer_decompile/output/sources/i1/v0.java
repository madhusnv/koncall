package i1;

import c3.C0847b;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16997a;

    /* renamed from: b */
    public final /* synthetic */ w0 f16998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i10) {
        super(0);
        this.f16997a = i10;
        this.f16998b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16997a) {
            case 0:
                InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f16998b.f17008x.getValue();
                return new C0847b(interfaceC7033t != null ? interfaceC7033t.mo13299V(0L) : 9205357640488583168L);
            case 1:
                return new C0847b(this.f16998b.f17010z);
            default:
                this.f16998b.N0();
                return qw.a0.f30746a;
        }
    }
}
