package dt;

import at.C0431b;
import ex.InterfaceC2141e;
import og.od;
import qn.C6263l;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.n */
/* loaded from: classes3.dex */
public final class C1808n extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8744a;

    /* renamed from: b */
    public int f8745b;

    /* renamed from: c */
    public final /* synthetic */ C1813s f8746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1808n(C1813s c1813s, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8744a = i10;
        this.f8746c = c1813s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8744a) {
            case 0:
                return new C1808n(this.f8746c, interfaceC7559c, 0);
            case 1:
                return new C1808n(this.f8746c, interfaceC7559c, 1);
            default:
                return new C1808n(this.f8746c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8744a) {
        }
        return ((C1808n) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8744a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f8745b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C1813s c1813s = this.f8746c;
                    C6263l c6263l = c1813s.f8758b;
                    String str = ((C0431b) c1813s.f8765i.f39340a.getValue()).f3179k;
                    this.f8745b = 1;
                    if (c6263l.m12266l(str, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8745b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C1813s c1813s2 = this.f8746c;
                    C6263l c6263l2 = c1813s2.f8758b;
                    String str2 = ((C0431b) c1813s2.f8765i.f39340a.getValue()).f3179k;
                    this.f8745b = 1;
                    if (c6263l2.m12266l(str2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8745b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f8746c.f8766j;
                    Boolean bool = Boolean.TRUE;
                    this.f8745b = 1;
                    if (c7806h.mo14775g(bool, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
