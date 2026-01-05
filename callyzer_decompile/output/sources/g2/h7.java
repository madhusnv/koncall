package g2;

import android.window.BackEvent;
import ex.InterfaceC2141e;
import h1.C2772c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h7 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11731a;

    /* renamed from: b */
    public int f11732b;

    /* renamed from: c */
    public final /* synthetic */ C2772c f11733c;

    /* renamed from: d */
    public final /* synthetic */ BackEvent f11734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(C2772c c2772c, BackEvent backEvent, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f11731a = i10;
        this.f11733c = c2772c;
        this.f11734d = backEvent;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11731a) {
            case 0:
                return new h7(this.f11733c, this.f11734d, interfaceC7559c, 0);
            default:
                return new h7(this.f11733c, this.f11734d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f11731a) {
        }
        return ((h7) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11731a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f11732b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    Float f6 = new Float(h2.k0.f15723a.mo6654c(this.f11734d.getProgress()));
                    this.f11732b = 1;
                    if (this.f11733c.m6776e(f6, this) == enumC7794a) {
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
                int i11 = this.f11732b;
                if (i11 == 0) {
                    og.od.m10798c(obj);
                    Float f10 = new Float(h2.k0.f15723a.mo6654c(this.f11734d.getProgress()));
                    this.f11732b = 1;
                    if (this.f11733c.m6776e(f10, this) == enumC7794a2) {
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
