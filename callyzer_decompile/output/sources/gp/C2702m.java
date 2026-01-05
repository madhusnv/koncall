package gp;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.m */
/* loaded from: classes3.dex */
public final class C2702m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15078a;

    /* renamed from: b */
    public int f15079b;

    /* renamed from: c */
    public /* synthetic */ int f15080c;

    /* renamed from: d */
    public final /* synthetic */ C2703n f15081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2702m(C2703n c2703n, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15078a = i10;
        this.f15081d = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15078a) {
            case 0:
                C2702m c2702m = new C2702m(this.f15081d, interfaceC7559c, 0);
                c2702m.f15080c = ((Number) obj).intValue();
                return c2702m;
            default:
                C2702m c2702m2 = new C2702m(this.f15081d, interfaceC7559c, 1);
                c2702m2.f15080c = ((Number) obj).intValue();
                return c2702m2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15078a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C2702m) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM6709j;
        Object objM6708i;
        switch (this.f15078a) {
            case 0:
                int i10 = this.f15080c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f15079b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f15080c = i10;
                    this.f15079b = 1;
                    objM6709j = C2703n.m6709j(this.f15081d, i10, this);
                    if (objM6709j == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM6709j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM6709j);
            default:
                int i12 = this.f15080c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f15079b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f15080c = i12;
                    this.f15079b = 1;
                    objM6708i = C2703n.m6708i(this.f15081d, i12, this);
                    if (objM6708i == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM6708i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM6708i);
        }
    }
}
