package bq;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.n */
/* loaded from: classes3.dex */
public final class C0734n extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4624a;

    /* renamed from: b */
    public int f4625b;

    /* renamed from: c */
    public /* synthetic */ int f4626c;

    /* renamed from: d */
    public final /* synthetic */ C0737q f4627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0734n(C0737q c0737q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4624a = i10;
        this.f4627d = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4624a) {
            case 0:
                C0734n c0734n = new C0734n(this.f4627d, interfaceC7559c, 0);
                c0734n.f4626c = ((Number) obj).intValue();
                return c0734n;
            default:
                C0734n c0734n2 = new C0734n(this.f4627d, interfaceC7559c, 1);
                c0734n2.f4626c = ((Number) obj).intValue();
                return c0734n2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4624a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C0734n) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM2030i;
        Object objM2031j;
        switch (this.f4624a) {
            case 0:
                int i10 = this.f4626c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f4625b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f4626c = i10;
                    this.f4625b = 1;
                    objM2030i = C0737q.m2030i(this.f4627d, i10, this);
                    if (objM2030i == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2030i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2030i);
            default:
                int i12 = this.f4626c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f4625b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f4626c = i12;
                    this.f4625b = 1;
                    objM2031j = C0737q.m2031j(this.f4627d, i12, this);
                    if (objM2031j == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2031j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2031j);
        }
    }
}
