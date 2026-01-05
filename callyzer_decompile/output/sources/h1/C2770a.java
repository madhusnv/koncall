package h1;

import b2.C0566x;
import ex.InterfaceC2139c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C4164v;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.a */
/* loaded from: classes.dex */
public final class C2770a extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public C2780k f15338a;

    /* renamed from: b */
    public C4164v f15339b;

    /* renamed from: c */
    public int f15340c;

    /* renamed from: d */
    public final /* synthetic */ C2772c f15341d;

    /* renamed from: e */
    public final /* synthetic */ Object f15342e;

    /* renamed from: f */
    public final /* synthetic */ k1 f15343f;

    /* renamed from: g */
    public final /* synthetic */ long f15344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770a(C2772c c2772c, Object obj, k1 k1Var, long j6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f15341d = c2772c;
        this.f15342e = obj;
        this.f15343f = k1Var;
        this.f15344g = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new C2770a(this.f15341d, this.f15342e, this.f15343f, this.f15344g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((C2770a) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C2780k c2780k;
        C4164v c4164v;
        k1 k1Var = this.f15343f;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15340c;
        C2772c c2772c = this.f15341d;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                c2772c.f15360c.f15491c = (AbstractC2785p) c2772c.f15358a.f15661a.invoke(this.f15342e);
                c2772c.f15362e.setValue(k1Var.f15497c);
                c2772c.f15361d.setValue(Boolean.TRUE);
                C2780k c2780k2 = c2772c.f15360c;
                C2780k c2780k3 = new C2780k(c2780k2.f15489a, c2780k2.f15490b.getValue(), AbstractC2773d.m6788k(c2780k2.f15491c), c2780k2.f15492d, Long.MIN_VALUE, c2780k2.f15494f);
                C4164v c4164v2 = new C4164v();
                long j6 = this.f15344g;
                C0566x c0566x = new C0566x(10, c2772c, c2780k3, c4164v2);
                this.f15338a = c2780k3;
                this.f15339b = c4164v2;
                this.f15340c = 1;
                if (AbstractC2773d.m6781d(c2780k3, k1Var, j6, c0566x, this) == enumC7794a) {
                    return enumC7794a;
                }
                c2780k = c2780k3;
                c4164v = c4164v2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4164v = this.f15339b;
                c2780k = this.f15338a;
                od.m10798c(obj);
            }
            EnumC2776g enumC2776g = c4164v.f21160a ? EnumC2776g.BoundReached : EnumC2776g.Finished;
            C2772c.m6773b(c2772c);
            return new C2777h(c2780k, enumC2776g);
        } catch (CancellationException e2) {
            C2772c.m6773b(c2772c);
            throw e2;
        }
    }
}
