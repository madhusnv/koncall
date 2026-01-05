package g2;

import ex.InterfaceC2137a;
import f2.AbstractC2188k;
import f2.C2179b;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4629k;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y4 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f13302a;

    /* renamed from: b */
    public final /* synthetic */ z4 f13303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(z4 z4Var, int i10) {
        super(0);
        this.f13302a = i10;
        this.f13303b = z4Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        int i10 = this.f13302a;
        z4 z4Var = this.f13303b;
        switch (i10) {
            case 0:
                return p9.f12429a;
            default:
                if (((o9) AbstractC7634f.m14548i(z4Var, q9.f12511b)) == null) {
                    C2179b c2179b = z4Var.f13367x;
                    if (c2179b != null) {
                        z4Var.M0(c2179b);
                    }
                } else if (z4Var.f13367x == null) {
                    x4 x4Var = new x4(0, z4Var);
                    y4 y4Var = new y4(z4Var, 0);
                    InterfaceC4629k interfaceC4629k = z4Var.f13363s;
                    boolean z6 = z4Var.f13364t;
                    float f6 = z4Var.f13365v;
                    h1.w1 w1Var = AbstractC2188k.f10100a;
                    C2179b c2179b2 = new C2179b(interfaceC4629k, z6, f6, x4Var, y4Var);
                    z4Var.L0(c2179b2);
                    z4Var.f13367x = c2179b2;
                }
                return qw.a0.f30746a;
        }
    }
}
