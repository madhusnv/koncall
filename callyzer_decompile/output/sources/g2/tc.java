package g2;

import androidx.compose.material3.AbstractC0256a;
import ex.InterfaceC2141e;
import h1.C2772c;
import h1.InterfaceC2779j;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class tc extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12802a;

    /* renamed from: b */
    public int f12803b;

    /* renamed from: c */
    public final /* synthetic */ uc f12804c;

    /* renamed from: d */
    public final /* synthetic */ float f12805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(uc ucVar, float f6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12802a = i10;
        this.f12804c = ucVar;
        this.f12805d = f6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12802a) {
            case 0:
                return new tc(this.f12804c, this.f12805d, interfaceC7559c, 0);
            default:
                return new tc(this.f12804c, this.f12805d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12802a) {
        }
        return ((tc) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f12802a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f12803b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    uc ucVar = this.f12804c;
                    C2772c c2772c = ucVar.f12908v;
                    if (c2772c != null) {
                        Float f6 = new Float(this.f12805d);
                        InterfaceC2779j interfaceC2779j = ucVar.f12906s ? AbstractC0256a.f2077f : AbstractC0256a.f2078g;
                        this.f12803b = 1;
                        obj = C2772c.m6774c(c2772c, f6, interfaceC2779j, this, 12);
                        if (obj == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                    return qw.a0.f30746a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                og.od.m10798c(obj);
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f12803b;
                if (i11 == 0) {
                    og.od.m10798c(obj);
                    uc ucVar2 = this.f12804c;
                    C2772c c2772c2 = ucVar2.f12907t;
                    if (c2772c2 != null) {
                        Float f10 = new Float(this.f12805d);
                        InterfaceC2779j interfaceC2779j2 = ucVar2.f12906s ? AbstractC0256a.f2077f : AbstractC0256a.f2078g;
                        this.f12803b = 1;
                        obj = C2772c.m6774c(c2772c2, f10, interfaceC2779j2, this, 12);
                        if (obj == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                    return qw.a0.f30746a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                og.od.m10798c(obj);
                return qw.a0.f30746a;
        }
    }
}
