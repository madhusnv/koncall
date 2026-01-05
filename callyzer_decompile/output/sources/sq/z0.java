package sq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import or.AbstractC5453p;
import rr.AbstractC6601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z0 implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ Object f33387a;

    /* renamed from: b */
    public final /* synthetic */ String f33388b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC5453p f33389c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f33390d;

    /* renamed from: e */
    public final /* synthetic */ int f33391e;

    public z0(Object obj, String str, AbstractC5453p abstractC5453p, InterfaceC2139c interfaceC2139c, int i10) {
        this.f33387a = obj;
        this.f33388b = str;
        this.f33389c = abstractC5453p;
        this.f33390d = interfaceC2139c;
        this.f33391e = i10;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2137a closeSheet = (InterfaceC2137a) obj;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC4154l.m8923f(closeSheet, "closeSheet");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C3966o) interfaceC3962k).m8616i(closeSheet) ? 4 : 2;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC6601a.m12664g(this.f33387a, this.f33388b, this.f33389c, this.f33390d, closeSheet, c3966o, (this.f33391e & 8) | ((iIntValue << 12) & 57344));
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
