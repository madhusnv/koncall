package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import mq.C4840h;
import p020v.a1;
import pg.c9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.y */
/* loaded from: classes3.dex */
public final class C3020y implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16305a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f16306b;

    /* renamed from: c */
    public final /* synthetic */ C4181k f16307c;

    public C3020y(InterfaceC2139c interfaceC2139c, C4181k c4181k) {
        this.f16306b = interfaceC2139c;
        this.f16307c = c4181k;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16305a) {
            case 0:
                C4181k c4181k = this.f16307c;
                Boolean bool = c4181k.f21204q;
                String str = c4181k.f21192c;
                boolean zM8918a = AbstractC4154l.m8918a(bool, Boolean.TRUE);
                InterfaceC2139c interfaceC2139c = this.f16306b;
                if (zM8918a) {
                    interfaceC2139c.invoke(a1.m14333m("lead_details_screen/callHistory/", str, "/", c4181k.f21202n, "/null"));
                } else {
                    interfaceC2139c.invoke(c9.m11574c(c4181k.f21193d, c4181k.f21191b, str));
                }
                break;
            default:
                C4181k c4181k2 = this.f16307c;
                this.f16306b.invoke(new C4840h(c4181k2.f21190a, c4181k2.f21202n));
                break;
        }
        return qw.a0.f30746a;
    }

    public C3020y(C4181k c4181k, InterfaceC2139c interfaceC2139c) {
        this.f16307c = c4181k;
        this.f16306b = interfaceC2139c;
    }
}
