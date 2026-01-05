package v3;

import d3.InterfaceC1563q;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f36808a;

    /* renamed from: b */
    public final /* synthetic */ h1 f36809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(h1 h1Var, int i10) {
        super(0);
        this.f36808a = i10;
        this.f36809b = h1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f36808a) {
            case 0:
                h1 h1Var = this.f36809b;
                InterfaceC1563q interfaceC1563q = h1Var.f36897F;
                AbstractC4154l.m8920c(interfaceC1563q);
                h1Var.M0(interfaceC1563q, h1Var.f36896E);
                break;
            default:
                h1 h1Var2 = this.f36809b.f36904p;
                if (h1Var2 != null) {
                    h1Var2.a1();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
