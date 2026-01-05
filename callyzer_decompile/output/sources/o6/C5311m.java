package o6;

import ex.InterfaceC2142f;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.m */
/* loaded from: classes.dex */
public final class C5311m extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f26086a = 1;

    /* renamed from: b */
    public int f26087b;

    /* renamed from: c */
    public /* synthetic */ Object f26088c;

    public /* synthetic */ C5311m(int i10, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f26086a) {
            case 0:
                return new C5311m((C5321w) this.f26088c, (InterfaceC7559c) obj3).invokeSuspend(qw.a0.f30746a);
            default:
                ((Boolean) obj2).getClass();
                C5311m c5311m = new C5311m(3, (InterfaceC7559c) obj3);
                c5311m.f26088c = (C5324z) obj;
                return c5311m.invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26086a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f26087b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C5321w c5321w = (C5321w) this.f26088c;
                    this.f26087b = 1;
                    if (C5321w.m10457b(c5321w, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f26087b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C5324z c5324z = (C5324z) this.f26088c;
                this.f26087b = 1;
                c5324z.getClass();
                Object objM10470a = C5324z.m10470a(c5324z, this);
                return objM10470a == enumC7794a2 ? enumC7794a2 : objM10470a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5311m(C5321w c5321w, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f26088c = c5321w;
    }
}
