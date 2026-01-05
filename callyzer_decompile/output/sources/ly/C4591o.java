package ly;

import ee.C2039g;
import ex.InterfaceC2142f;
import ky.AbstractC4281m;
import og.od;
import qw.C6352b;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.o */
/* loaded from: classes3.dex */
public final class C4591o extends AbstractC8198h implements InterfaceC2142f {

    /* renamed from: b */
    public int f22731b;

    /* renamed from: c */
    public /* synthetic */ C6352b f22732c;

    /* renamed from: d */
    public final /* synthetic */ C2039g f22733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4591o(C2039g c2039g, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f22733d = c2039g;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4591o c4591o = new C4591o(this.f22733d, (InterfaceC7559c) obj3);
        c4591o.f22732c = (C6352b) obj;
        return c4591o.invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C2039g c2039g = this.f22733d;
        C4599w c4599w = (C4599w) c2039g.f9606c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f22731b;
        if (i10 == 0) {
            od.m10798c(obj);
            C6352b c6352b = this.f22732c;
            byte bM9469v = c4599w.m9469v();
            if (bM9469v == 1) {
                return c2039g.m5764n(true);
            }
            if (bM9469v == 0) {
                return c2039g.m5764n(false);
            }
            if (bM9469v != 6) {
                if (bM9469v == 8) {
                    return c2039g.m5763m();
                }
                C4599w.m9446n(c4599w, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f22731b = 1;
            obj = C2039g.m5752a(c2039g, c6352b, this);
            if (obj == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return (AbstractC4281m) obj;
    }
}
