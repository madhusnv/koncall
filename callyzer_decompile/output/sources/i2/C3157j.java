package i2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.j */
/* loaded from: classes.dex */
public final class C3157j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17057a;

    /* renamed from: b */
    public int f17058b;

    /* renamed from: c */
    public final /* synthetic */ C3160m f17059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3157j(C3160m c3160m, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17057a = i10;
        this.f17059c = c3160m;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17057a) {
            case 0:
                return new C3157j(this.f17059c, interfaceC7559c, 0);
            case 1:
                return new C3157j(this.f17059c, interfaceC7559c, 1);
            default:
                return new C3157j(this.f17059c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f17057a) {
        }
        return ((C3157j) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17057a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f17058b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C3160m c3160m = this.f17059c;
                    if (c3160m.f17069s) {
                        InterfaceC3161n interfaceC3161n = c3160m.f17072w;
                        this.f17058b = 1;
                        if (((C3163p) interfaceC3161n).m7530a(1.0f, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    } else {
                        InterfaceC3161n interfaceC3161n2 = c3160m.f17072w;
                        this.f17058b = 2;
                        if (((C3163p) interfaceC3161n2).m7530a(DefinitionKt.NO_Float_VALUE, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f17058b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C3160m c3160m2 = this.f17059c;
                    InterfaceC3161n interfaceC3161n3 = c3160m2.f17072w;
                    float fM8490f = c3160m2.f17075z.m8490f() / c3160m2.R0();
                    this.f17058b = 1;
                    if (((C3163p) interfaceC3161n3).m7530a(fM8490f, this) == enumC7794a2) {
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
                int i12 = this.f17058b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C3160m c3160m3 = this.f17059c;
                    if (c3160m3.f17069s) {
                        this.f17058b = 2;
                        if (c3160m3.P0(this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    } else {
                        this.f17058b = 1;
                        if (c3160m3.O0(this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
