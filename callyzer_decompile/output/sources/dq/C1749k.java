package dq;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.k */
/* loaded from: classes3.dex */
public final class C1749k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8463a;

    /* renamed from: b */
    public int f8464b;

    /* renamed from: c */
    public /* synthetic */ int f8465c;

    /* renamed from: d */
    public final /* synthetic */ C1750l f8466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1749k(C1750l c1750l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8463a = i10;
        this.f8466d = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8463a) {
            case 0:
                C1749k c1749k = new C1749k(this.f8466d, interfaceC7559c, 0);
                c1749k.f8465c = ((Number) obj).intValue();
                return c1749k;
            default:
                C1749k c1749k2 = new C1749k(this.f8466d, interfaceC7559c, 1);
                c1749k2.f8465c = ((Number) obj).intValue();
                return c1749k2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f8463a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C1749k) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM5439i;
        Object objM5440j;
        switch (this.f8463a) {
            case 0:
                int i10 = this.f8465c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8464b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f8465c = i10;
                    this.f8464b = 1;
                    objM5439i = C1750l.m5439i(this.f8466d, i10, this);
                    if (objM5439i == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5439i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM5439i);
            default:
                int i12 = this.f8465c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f8464b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f8465c = i12;
                    this.f8464b = 1;
                    objM5440j = C1750l.m5440j(this.f8466d, i12, this);
                    if (objM5440j == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5440j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM5440j);
        }
    }
}
