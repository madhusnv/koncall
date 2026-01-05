package k1;

import c3.C0847b;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import o1.C5264w;
import p3.C5819q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.w */
/* loaded from: classes.dex */
public final class C3948w extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f20282a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f20283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3948w(int i10, InterfaceC2139c interfaceC2139c) {
        super(3);
        this.f20282a = i10;
        this.f20283b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20282a) {
            case 0:
                long j6 = ((C0847b) obj3).f5352a;
                this.f20283b.invoke(new C0847b(((C5819q) obj2).f28478c));
                return qw.a0.f30746a;
            default:
                ((Number) obj3).intValue();
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(-1608161351);
                InterfaceC2139c interfaceC2139c = this.f20283b;
                boolean zM8614g = c3966o.m8614g(interfaceC2139c);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new C5264w(interfaceC2139c);
                    c3966o.j0(objM8596M);
                }
                C5264w c5264w = (C5264w) objM8596M;
                c3966o.m8623p(false);
                return c5264w;
        }
    }
}
