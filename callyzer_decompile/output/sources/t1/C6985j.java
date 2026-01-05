package t1;

import com.skydoves.balloon.internals.DefinitionKt;
import k1.InterfaceC3928c;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.j */
/* loaded from: classes.dex */
public final class C6985j implements InterfaceC3928c {

    /* renamed from: b */
    public final AbstractC7000y f33805b;

    /* renamed from: c */
    public final InterfaceC3928c f33806c;

    public C6985j(AbstractC7000y abstractC7000y, InterfaceC3928c interfaceC3928c) {
        this.f33805b = abstractC7000y;
        this.f33806c = interfaceC3928c;
    }

    @Override // k1.InterfaceC3928c
    /* renamed from: a */
    public final float mo8444a(float f6, float f10, float f11) {
        float fMo8444a = this.f33806c.mo8444a(f6, f10, f11);
        boolean z6 = false;
        if (f6 <= DefinitionKt.NO_Float_VALUE ? f6 + f10 <= DefinitionKt.NO_Float_VALUE : f6 + f10 > f11) {
            z6 = true;
        }
        float fAbs = Math.abs(fMo8444a);
        AbstractC7000y abstractC7000y = this.f33805b;
        if (fAbs == DefinitionKt.NO_Float_VALUE || !z6) {
            if (Math.abs(abstractC7000y.f33903f) < 1.0E-6d) {
                return DefinitionKt.NO_Float_VALUE;
            }
            float fM13266n = abstractC7000y.f33903f * (-1.0f);
            if (((Boolean) abstractC7000y.f33896F.getValue()).booleanValue()) {
                fM13266n += abstractC7000y.m13266n();
            }
            return w9.m11911b(fM13266n, -f11, f11);
        }
        float fM13266n2 = abstractC7000y.f33903f * (-1);
        while (fMo8444a > DefinitionKt.NO_Float_VALUE && fM13266n2 < fMo8444a) {
            fM13266n2 += abstractC7000y.m13266n();
        }
        while (fMo8444a < DefinitionKt.NO_Float_VALUE && fM13266n2 > fMo8444a) {
            fM13266n2 -= abstractC7000y.m13266n();
        }
        return fM13266n2;
    }
}
