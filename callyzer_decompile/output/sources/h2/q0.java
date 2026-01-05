package h2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2142f;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import h1.n1;
import h1.w1;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public static final q0 f15765a = new q0(3);

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n1 n1Var = (n1) obj;
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(-1154662212);
        EnumC2817v enumC2817v = EnumC2817v.Focused;
        EnumC2817v enumC2817v2 = EnumC2817v.UnfocusedEmpty;
        Object objM6795r = n1Var.m6841b(enumC2817v, enumC2817v2) ? AbstractC2773d.m6795r(67, 0, AbstractC2793x.f15642d, 2) : (n1Var.m6841b(enumC2817v2, enumC2817v) || n1Var.m6841b(EnumC2817v.UnfocusedNotEmpty, enumC2817v2)) ? new w1(83, 67, AbstractC2793x.f15642d) : AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
        c3966o.m8623p(false);
        return objM6795r;
    }
}
