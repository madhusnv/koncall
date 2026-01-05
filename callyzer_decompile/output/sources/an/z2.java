package an;

import ex.InterfaceC2139c;
import nm.C5107b;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f1614a;

    /* renamed from: b */
    public final /* synthetic */ h3 f1615b;

    /* renamed from: c */
    public final /* synthetic */ C5107b f1616c;

    /* renamed from: d */
    public final /* synthetic */ boolean f1617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(h3 h3Var, C5107b c5107b, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f1615b = h3Var;
        this.f1616c = c5107b;
        this.f1617d = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new z2(this.f1615b, this.f1616c, this.f1617d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((z2) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f1614a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f1614a = 1;
        h3 h3Var = this.f1615b;
        h3Var.getClass();
        Object objM476x = h3.m476x(h3Var, this.f1616c, this.f1617d, this);
        return objM476x == enumC7794a ? enumC7794a : objM476x;
    }
}
