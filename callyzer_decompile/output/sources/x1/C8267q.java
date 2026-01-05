package x1;

import ex.InterfaceC2137a;
import g4.C2492h;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.q */
/* loaded from: classes.dex */
public final class C8267q extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f39641a;

    /* renamed from: b */
    public final /* synthetic */ s1 f39642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8267q(s1 s1Var, int i10) {
        super(0);
        this.f39641a = i10;
        this.f39642b = s1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        g4.k0 k0Var;
        switch (this.f39641a) {
            case 0:
                s1 s1Var = this.f39642b;
                return Boolean.valueOf(s1Var != null ? ((Boolean) new C8267q(s1Var, 2).invoke()).booleanValue() : false);
            case 1:
                s1 s1Var2 = this.f39642b;
                return Boolean.valueOf(s1Var2 != null ? ((Boolean) new C8267q(s1Var2, 2).invoke()).booleanValue() : false);
            default:
                s1 s1Var3 = this.f39642b;
                C2492h c2492h = s1Var3.f39678b;
                g4.l0 l0Var = (g4.l0) s1Var3.f39677a.getValue();
                return Boolean.valueOf(AbstractC4154l.m8918a(c2492h, (l0Var == null || (k0Var = l0Var.f13670a) == null) ? null : k0Var.f13660a));
        }
    }
}
