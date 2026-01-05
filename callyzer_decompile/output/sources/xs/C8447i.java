package xs;

import ex.InterfaceC2141e;
import l4.C4367l;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.i */
/* loaded from: classes3.dex */
public final class C8447i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41202a;

    /* renamed from: b */
    public int f41203b;

    /* renamed from: c */
    public /* synthetic */ int f41204c;

    /* renamed from: d */
    public final /* synthetic */ C8449k f41205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8447i(C8449k c8449k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41202a = i10;
        this.f41205d = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41202a) {
            case 0:
                C8447i c8447i = new C8447i(this.f41205d, interfaceC7559c, 0);
                c8447i.f41204c = ((Number) obj).intValue();
                return c8447i;
            default:
                C8447i c8447i2 = new C8447i(this.f41205d, interfaceC7559c, 1);
                c8447i2.f41204c = ((Number) obj).intValue();
                return c8447i2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f41202a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C8447i) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM9143w;
        Object objM9143w2;
        switch (this.f41202a) {
            case 0:
                int i10 = this.f41204c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f41203b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C4367l c4367l = this.f41205d.f41212b;
                    this.f41204c = i10;
                    this.f41203b = 1;
                    objM9143w = c4367l.m9143w(i10, this);
                    if (objM9143w == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9143w = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9143w);
            default:
                int i12 = this.f41204c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f41203b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4367l c4367l2 = this.f41205d.f41212b;
                    this.f41204c = i12;
                    this.f41203b = 1;
                    objM9143w2 = c4367l2.m9143w(i12, this);
                    if (objM9143w2 == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9143w2 = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9143w2);
        }
    }
}
