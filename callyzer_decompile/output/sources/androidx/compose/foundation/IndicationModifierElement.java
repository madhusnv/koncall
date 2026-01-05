package androidx.compose.foundation;

import i1.t0;
import i1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4629k;
import v3.InterfaceC7641m;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class IndicationModifierElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4629k f1902a;

    /* renamed from: b */
    public final u0 f1903b;

    public IndicationModifierElement(InterfaceC4629k interfaceC4629k, u0 u0Var) {
        this.f1902a = interfaceC4629k;
        this.f1903b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return AbstractC4154l.m8918a(this.f1902a, indicationModifierElement.f1902a) && AbstractC4154l.m8918a(this.f1903b, indicationModifierElement.f1903b);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        InterfaceC7641m interfaceC7641mMo6293b = this.f1903b.mo6293b(this.f1902a);
        t0 t0Var = new t0();
        t0Var.f16994s = interfaceC7641mMo6293b;
        t0Var.L0(interfaceC7641mMo6293b);
        return t0Var;
    }

    public final int hashCode() {
        return this.f1903b.hashCode() + (this.f1902a.hashCode() * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        t0 t0Var = (t0) abstractC7878q;
        InterfaceC7641m interfaceC7641mMo6293b = this.f1903b.mo6293b(this.f1902a);
        t0Var.M0(t0Var.f16994s);
        t0Var.f16994s = interfaceC7641mMo6293b;
        t0Var.L0(interfaceC7641mMo6293b);
    }
}
