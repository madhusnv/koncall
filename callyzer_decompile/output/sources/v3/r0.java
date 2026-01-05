package v3;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ s0 f36977a;

    /* renamed from: b */
    public final /* synthetic */ p1 f36978b;

    /* renamed from: c */
    public final /* synthetic */ long f36979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, p1 p1Var, long j6) {
        super(0);
        this.f36977a = s0Var;
        this.f36978b = p1Var;
        this.f36979c = j6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        o0 o0VarR0;
        k0 k0Var = this.f36977a.f36992f;
        t3.v0 placementScope = null;
        if (AbstractC7634f.m14558s(k0Var.f36928a) || k0Var.f36930c) {
            h1 h1Var = k0Var.m14637a().f36904p;
            if (h1Var != null) {
                placementScope = h1Var.f36957j;
            }
        } else {
            h1 h1Var2 = k0Var.m14637a().f36904p;
            if (h1Var2 != null && (o0VarR0 = h1Var2.R0()) != null) {
                placementScope = o0VarR0.f36957j;
            }
        }
        if (placementScope == null) {
            placementScope = ((C7904v) this.f36978b).getPlacementScope();
        }
        o0 o0VarR02 = k0Var.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR02);
        t3.v0.m13318f(placementScope, o0VarR02, this.f36979c);
        return qw.a0.f30746a;
    }
}
