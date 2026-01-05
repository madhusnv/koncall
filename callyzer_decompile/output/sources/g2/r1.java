package g2;

import be.C0649d;
import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12563a;

    /* renamed from: b */
    public int f12564b;

    /* renamed from: c */
    public final /* synthetic */ u1 f12565c;

    /* renamed from: d */
    public final /* synthetic */ long f12566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(u1 u1Var, long j6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12563a = i10;
        this.f12565c = u1Var;
        this.f12566d = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12563a) {
            case 0:
                return new r1(this.f12565c, this.f12566d, interfaceC7559c, 0);
            default:
                return new r1(this.f12565c, this.f12566d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12563a) {
        }
        return ((r1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f12563a;
        qw.a0 a0Var = qw.a0.f30746a;
        u1 u1Var = this.f12565c;
        long j6 = this.f12566d;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f12564b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                u1Var.f12826w = C0847b.m2273d(j6) + u1Var.f12826w;
                float fM2274e = C0847b.m2274e(j6) + u1Var.f12827x;
                u1Var.f12827x = fM2274e;
                C2460n c2460n = u1Var.f12823s;
                long j10 = u1Var.f12828y;
                float f6 = fM2274e - ((int) (4294967295L & j10));
                float f10 = u1Var.f12826w - ((int) (j10 >> 32));
                float f11 = pd.f12442a;
                float fAtan2 = ((float) Math.atan2(f6, f10)) - 1.5707964f;
                if (fAtan2 < DefinitionKt.NO_Float_VALUE) {
                    fAtan2 += 6.2831855f;
                }
                this.f12564b = 1;
                i1.b1 b1Var = c2460n.f12150e;
                i1.y0 y0Var = i1.y0.UserInput;
                C2459m c2459m = new C2459m(c2460n, fAtan2, false, null);
                b1Var.getClass();
                Object objM13488k = tx.c0.m13488k(new C0649d(y0Var, b1Var, c2459m, (InterfaceC7559c) null), this);
                if (objM13488k != enumC7794a) {
                    objM13488k = a0Var;
                }
                return objM13488k == enumC7794a ? enumC7794a : a0Var;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f12564b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                C2460n c2460n2 = u1Var.f12823s;
                float fM2273d = C0847b.m2273d(j6);
                float fM2274e2 = C0847b.m2274e(j6);
                float fMo8435T = AbstractC7634f.m14563x(u1Var).f36825C.mo8435T(pd.f12447f);
                boolean z6 = u1Var.f12824t;
                long j11 = u1Var.f12828y;
                this.f12564b = 1;
                return pd.m6280p(c2460n2, fM2273d, fM2274e2, fMo8435T, z6, j11, this) == enumC7794a2 ? enumC7794a2 : a0Var;
        }
    }
}
