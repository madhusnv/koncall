package k1;

import androidx.compose.foundation.gestures.AbstractC0241a;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f20197a;

    /* renamed from: b */
    public final /* synthetic */ p1 f20198b;

    /* renamed from: c */
    public final /* synthetic */ float f20199c;

    /* renamed from: d */
    public final /* synthetic */ float f20200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, float f6, float f10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20198b = p1Var;
        this.f20199c = f6;
        this.f20200d = f10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new o1(this.f20198b, this.f20199c, this.f20200d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f20197a;
        if (i10 == 0) {
            od.m10798c(obj);
            x1 x1Var = this.f20198b.f20208H;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f20199c) << 32) | (Float.floatToRawIntBits(this.f20200d) & 4294967295L);
            this.f20197a = 1;
            if (AbstractC0241a.m645a(x1Var, jFloatToRawIntBits, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }
}
