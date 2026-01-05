package k1;

import c3.C0847b;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import h1.C2772c;
import h1.C2777h;
import h1.EnumC2776g;
import og.od;
import s4.C6756l;
import s4.C6761q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import w2.AbstractC7878q;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20123a;

    /* renamed from: b */
    public int f20124b;

    /* renamed from: c */
    public /* synthetic */ Object f20125c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC7878q f20126d;

    /* renamed from: e */
    public final /* synthetic */ long f20127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(g1.c1 c1Var, long j6, g1.e1 e1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20123a = 2;
        this.f20125c = c1Var;
        this.f20127e = j6;
        this.f20126d = e1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20123a) {
            case 0:
                i0 i0Var = new i0((j0) this.f20126d, this.f20127e, interfaceC7559c, 0);
                i0Var.f20125c = obj;
                return i0Var;
            case 1:
                i0 i0Var2 = new i0((j0) this.f20126d, this.f20127e, interfaceC7559c, 1);
                i0Var2.f20125c = obj;
                return i0Var2;
            default:
                return new i0((g1.c1) this.f20125c, this.f20127e, (g1.e1) this.f20126d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20123a) {
        }
        return ((i0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20123a;
        qw.a0 a0Var = qw.a0.f30746a;
        long j6 = this.f20127e;
        AbstractC7878q abstractC7878q = this.f20126d;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f20124b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f20125c;
                InterfaceC2142f interfaceC2142f = ((j0) abstractC7878q).f20143F;
                C0847b c0847b = new C0847b(j6);
                this.f20124b = 1;
                return interfaceC2142f.invoke(interfaceC7266z, c0847b, this) == enumC7794a ? enumC7794a : a0Var;
            case 1:
                j0 j0Var = (j0) abstractC7878q;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f20124b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f20125c;
                InterfaceC2142f interfaceC2142f2 = j0Var.f20144G;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * 1.0f;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) * 1.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                x0 x0Var = j0Var.f20141D;
                g0 g0Var = h0.f20107a;
                Float f6 = new Float(x0Var == x0.Vertical ? C6761q.m12960c(jFloatToRawIntBits) : C6761q.m12959b(jFloatToRawIntBits));
                this.f20124b = 1;
                return interfaceC2142f2.invoke(interfaceC7266z2, f6, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            default:
                g1.e1 e1Var = (g1.e1) abstractC7878q;
                g1.c1 c1Var = (g1.c1) this.f20125c;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f20124b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C2772c c2772c = c1Var.f10947a;
                    C6756l c6756l = new C6756l(j6);
                    h1.a1 a1Var = e1Var.f10974q;
                    this.f20124b = 1;
                    obj = C2772c.m6774c(c2772c, c6756l, a1Var, this, 12);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                EnumC2776g enumC2776g = ((C2777h) obj).f15444b;
                EnumC2776g enumC2776g2 = EnumC2776g.BoundReached;
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, long j6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20123a = i10;
        this.f20126d = j0Var;
        this.f20127e = j6;
    }
}
