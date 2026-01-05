package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import og.od;
import om.C5415q;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f5 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f828a;

    /* renamed from: b */
    public final /* synthetic */ g5 f829b;

    /* renamed from: c */
    public final /* synthetic */ LocalDateTime f830c;

    /* renamed from: d */
    public final /* synthetic */ C5415q f831d;

    /* renamed from: e */
    public final /* synthetic */ boolean f832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(g5 g5Var, LocalDateTime localDateTime, C5415q c5415q, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f829b = g5Var;
        this.f830c = localDateTime;
        this.f831d = c5415q;
        this.f832e = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new f5(this.f829b, this.f830c, this.f831d, this.f832e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((f5) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f828a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f828a = 1;
        g5 g5Var = this.f829b;
        g5Var.getClass();
        Object objM449e = g5.m449e(g5Var, this.f830c, this.f831d, this.f832e, this);
        return objM449e == enumC7794a ? enumC7794a : objM449e;
    }
}
