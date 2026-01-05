package k1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import vx.C7806h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f20010a;

    /* renamed from: b */
    public final /* synthetic */ f0 f20011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(f0 f0Var, int i10) {
        super(0);
        this.f20010a = i10;
        this.f20011b = f0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f20010a) {
            case 0:
                C7806h c7806h = this.f20011b.f20086x;
                if (c7806h != null) {
                    c7806h.mo14776i(C3939n.f20190a);
                }
                return qw.a0.f30746a;
            default:
                return Boolean.valueOf(!this.f20011b.V0());
        }
    }
}
