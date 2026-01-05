package os;

import c9.C0910e;
import ex.InterfaceC2141e;
import ls.C4511b;
import og.od;
import qw.C6364n;
import qw.a0;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.e */
/* loaded from: classes3.dex */
public final class C5727e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28218a;

    /* renamed from: b */
    public C0910e f28219b;

    /* renamed from: c */
    public int f28220c;

    /* renamed from: d */
    public /* synthetic */ int f28221d;

    /* renamed from: e */
    public final /* synthetic */ C5731i f28222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5727e(C5731i c5731i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28218a = i10;
        this.f28222e = c5731i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28218a) {
            case 0:
                C5727e c5727e = new C5727e(this.f28222e, interfaceC7559c, 0);
                c5727e.f28221d = ((Number) obj).intValue();
                return c5727e;
            default:
                C5727e c5727e2 = new C5727e(this.f28222e, interfaceC7559c, 1);
                c5727e2.f28221d = ((Number) obj).intValue();
                return c5727e2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f28218a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C5727e) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C0910e c0910e;
        Object objM2613w;
        C0910e c0910e2;
        Object objM2613w2;
        switch (this.f28218a) {
            case 0:
                int i10 = this.f28221d;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f28220c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5731i c5731i = this.f28222e;
                    c0910e = c5731i.f28244b;
                    EnumC7204p enumC7204p = ((C4511b) c5731i.f28252j.f39340a.getValue()).f22463m.f34524b;
                    this.f28219b = c0910e;
                    this.f28221d = i10;
                    this.f28220c = 1;
                    obj = c0910e.m2614x(enumC7204p, this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM2613w = ((C6364n) obj).f30758a;
                        return new C6364n(objM2613w);
                    }
                    c0910e = this.f28219b;
                    od.m10798c(obj);
                }
                this.f28219b = null;
                this.f28221d = i10;
                this.f28220c = 2;
                objM2613w = c0910e.m2613w(i10, (String) obj, this);
                if (objM2613w == enumC7794a) {
                    return enumC7794a;
                }
                return new C6364n(objM2613w);
            default:
                int i12 = this.f28221d;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f28220c;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C5731i c5731i2 = this.f28222e;
                    c0910e2 = c5731i2.f28244b;
                    EnumC7204p enumC7204p2 = ((C4511b) c5731i2.f28252j.f39340a.getValue()).f22463m.f34524b;
                    this.f28219b = c0910e2;
                    this.f28221d = i12;
                    this.f28220c = 1;
                    obj = c0910e2.m2614x(enumC7204p2, this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        objM2613w2 = ((C6364n) obj).f30758a;
                        return new C6364n(objM2613w2);
                    }
                    c0910e2 = this.f28219b;
                    od.m10798c(obj);
                }
                this.f28219b = null;
                this.f28221d = i12;
                this.f28220c = 2;
                objM2613w2 = c0910e2.m2613w(i12, (String) obj, this);
                if (objM2613w2 == enumC7794a2) {
                    return enumC7794a2;
                }
                return new C6364n(objM2613w2);
        }
    }
}
