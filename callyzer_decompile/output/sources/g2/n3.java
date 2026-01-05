package g2;

import a2.C0036i;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h2.AbstractC2808m;
import k2.C3953b;
import kx.C4266h;
import q1.C6097y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12173a;

    /* renamed from: b */
    public int f12174b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f12175c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f12176d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC2808m f12177e;

    /* renamed from: f */
    public final /* synthetic */ C4266h f12178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(C6097y c6097y, InterfaceC2139c interfaceC2139c, AbstractC2808m abstractC2808m, C4266h c4266h, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12173a = i10;
        this.f12175c = c6097y;
        this.f12176d = interfaceC2139c;
        this.f12177e = abstractC2808m;
        this.f12178f = c4266h;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12173a) {
            case 0:
                return new n3(this.f12175c, this.f12176d, this.f12177e, this.f12178f, interfaceC7559c, 0);
            default:
                return new n3(this.f12175c, this.f12176d, this.f12177e, this.f12178f, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12173a) {
        }
        return ((n3) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f12173a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f12174b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                this.f12174b = 1;
                float f6 = f4.f11555a;
                C6097y c6097y = this.f12175c;
                Object objCollect = C3953b.m8522y(new C0036i(7, c6097y)).collect(new e4(c6097y, this.f12176d, this.f12177e, this.f12178f, 0), this);
                if (objCollect != enumC7794a) {
                    objCollect = a0Var;
                }
                return objCollect == enumC7794a ? enumC7794a : a0Var;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f12174b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                this.f12174b = 1;
                float f10 = f4.f11555a;
                C6097y c6097y2 = this.f12175c;
                Object objCollect2 = C3953b.m8522y(new C0036i(7, c6097y2)).collect(new e4(c6097y2, this.f12176d, this.f12177e, this.f12178f, 0), this);
                if (objCollect2 != enumC7794a2) {
                    objCollect2 = a0Var;
                }
                return objCollect2 == enumC7794a2 ? enumC7794a2 : a0Var;
        }
    }
}
