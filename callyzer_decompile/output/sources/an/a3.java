package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f605a;

    /* renamed from: b */
    public final /* synthetic */ h3 f606b;

    /* renamed from: c */
    public final /* synthetic */ int f607c;

    /* renamed from: d */
    public final /* synthetic */ boolean f608d;

    /* renamed from: e */
    public final /* synthetic */ boolean f609e;

    /* renamed from: f */
    public final /* synthetic */ boolean f610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(h3 h3Var, int i10, boolean z6, boolean z10, boolean z11, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f606b = h3Var;
        this.f607c = i10;
        this.f608d = z6;
        this.f609e = z10;
        this.f610f = z11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new a3(this.f606b, this.f607c, this.f608d, this.f609e, this.f610f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((a3) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f605a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f605a = 1;
        h3 h3Var = this.f606b;
        h3Var.getClass();
        Object objM475w = h3.m475w(h3Var, this.f607c, this.f608d, this.f609e, this.f610f, this);
        return objM475w == enumC7794a ? enumC7794a : objM475w;
    }
}
