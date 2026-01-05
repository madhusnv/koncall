package i1;

import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 implements d3.l0, q0 {

    /* renamed from: b */
    public static final j0 f16888b = new j0(0);

    /* renamed from: c */
    public static final j0 f16889c = new j0(1);

    /* renamed from: d */
    public static final j0 f16890d = new j0(2);

    /* renamed from: a */
    public final /* synthetic */ int f16891a;

    public /* synthetic */ j0(int i10) {
        this.f16891a = i10;
    }

    @Override // i1.q0
    /* renamed from: a */
    public void mo5873a(v3.i0 i0Var) {
        i0Var.m14622b();
    }

    @Override // d3.l0
    /* renamed from: i */
    public d3.h0 mo399i(long j6, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c) {
        switch (this.f16891a) {
            case 0:
                float fE0 = interfaceC6747c.e0(AbstractC3144w.f16999a);
                return new d3.d0(new C0848c(DefinitionKt.NO_Float_VALUE, -fE0, Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) + fE0));
            default:
                float fE02 = interfaceC6747c.e0(AbstractC3144w.f16999a);
                return new d3.d0(new C0848c(-fE02, DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (j6 >> 32)) + fE02, Float.intBitsToFloat((int) (j6 & 4294967295L))));
        }
    }
}
