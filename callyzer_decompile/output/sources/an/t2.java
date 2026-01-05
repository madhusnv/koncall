package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f1393a;

    /* renamed from: b */
    public final /* synthetic */ h3 f1394b;

    /* renamed from: c */
    public final /* synthetic */ String f1395c;

    /* renamed from: d */
    public final /* synthetic */ String f1396d;

    /* renamed from: e */
    public final /* synthetic */ EnumC8994d f1397e;

    /* renamed from: f */
    public final /* synthetic */ LocalDateTime f1398f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1399g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(h3 h3Var, String str, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f1394b = h3Var;
        this.f1395c = str;
        this.f1396d = str2;
        this.f1397e = enumC8994d;
        this.f1398f = localDateTime;
        this.f1399g = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new t2(this.f1394b, this.f1395c, this.f1396d, this.f1397e, this.f1398f, this.f1399g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((t2) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f1393a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f1393a = 1;
        h3 h3Var = this.f1394b;
        h3Var.getClass();
        Object objM464e = h3.m464e(h3Var, this.f1395c, this.f1396d, this.f1397e, this.f1398f, this.f1399g, this);
        return objM464e == enumC7794a ? enumC7794a : objM464e;
    }
}
