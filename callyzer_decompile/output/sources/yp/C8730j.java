package yp;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.j */
/* loaded from: classes3.dex */
public final class C8730j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42239a;

    /* renamed from: b */
    public int f42240b;

    /* renamed from: c */
    public /* synthetic */ int f42241c;

    /* renamed from: d */
    public final /* synthetic */ C8735o f42242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8730j(C8735o c8735o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42239a = i10;
        this.f42242d = c8735o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42239a) {
            case 0:
                C8730j c8730j = new C8730j(this.f42242d, interfaceC7559c, 0);
                c8730j.f42241c = ((Number) obj).intValue();
                return c8730j;
            default:
                C8730j c8730j2 = new C8730j(this.f42242d, interfaceC7559c, 1);
                c8730j2.f42241c = ((Number) obj).intValue();
                return c8730j2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f42239a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C8730j) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM16112h;
        Object objM16114j;
        switch (this.f42239a) {
            case 0:
                int i10 = this.f42241c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42240b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f42241c = i10;
                    this.f42240b = 1;
                    objM16112h = C8735o.m16112h(this.f42242d, i10, this);
                    if (objM16112h == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM16112h = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM16112h);
            default:
                int i12 = this.f42241c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f42240b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f42241c = i12;
                    this.f42240b = 1;
                    objM16114j = C8735o.m16114j(this.f42242d, i12, this);
                    if (objM16114j == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM16114j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM16114j);
        }
    }
}
