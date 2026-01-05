package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.C2772c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g7 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11638a;

    /* renamed from: b */
    public int f11639b;

    /* renamed from: c */
    public final /* synthetic */ C2772c f11640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7(C2772c c2772c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f11638a = i10;
        this.f11640c = c2772c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11638a) {
            case 0:
                return new g7(this.f11640c, interfaceC7559c, 0);
            default:
                return new g7(this.f11640c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f11638a) {
        }
        return ((g7) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11638a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f11639b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    Float f6 = new Float(DefinitionKt.NO_Float_VALUE);
                    this.f11639b = 1;
                    if (C2772c.m6774c(this.f11640c, f6, null, this, 14) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f11639b;
                if (i11 == 0) {
                    og.od.m10798c(obj);
                    Float f10 = new Float(DefinitionKt.NO_Float_VALUE);
                    this.f11639b = 1;
                    if (C2772c.m6774c(this.f11640c, f10, null, this, 14) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
