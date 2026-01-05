package k1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4167y;
import og.od;
import s4.C6761q;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public x1 f20263a;

    /* renamed from: b */
    public C4167y f20264b;

    /* renamed from: c */
    public long f20265c;

    /* renamed from: d */
    public int f20266d;

    /* renamed from: e */
    public /* synthetic */ Object f20267e;

    /* renamed from: f */
    public final /* synthetic */ x1 f20268f;

    /* renamed from: g */
    public final /* synthetic */ C4167y f20269g;

    /* renamed from: h */
    public final /* synthetic */ long f20270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x1 x1Var, C4167y c4167y, long j6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20268f = x1Var;
        this.f20269g = c4167y;
        this.f20270h = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        u1 u1Var = new u1(this.f20268f, this.f20269g, this.f20270h, interfaceC7559c);
        u1Var.f20267e = obj;
        return u1Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((v1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        x1 x1Var;
        C4167y c4167y;
        long j6;
        x1 x1Var2;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f20266d;
        if (i10 == 0) {
            od.m10798c(obj);
            v1 v1Var = (v1) this.f20267e;
            x1Var = this.f20268f;
            t1 t1Var = new t1(x1Var, v1Var);
            k0 k0Var = x1Var.f20311c;
            c4167y = this.f20269g;
            long j10 = c4167y.f21163a;
            x0 x0Var = x1Var.f20312d;
            x0 x0Var2 = x0.Horizontal;
            long j11 = this.f20270h;
            float fM8477c = x1Var.m8477c(x0Var == x0Var2 ? C6761q.m12959b(j11) : C6761q.m12960c(j11));
            this.f20267e = x1Var;
            this.f20263a = x1Var;
            this.f20264b = c4167y;
            this.f20265c = j10;
            this.f20266d = 1;
            obj = k0Var.mo8465a(t1Var, fM8477c, this);
            if (obj == enumC7794a) {
                return enumC7794a;
            }
            j6 = j10;
            x1Var2 = x1Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = this.f20265c;
            c4167y = this.f20264b;
            x1Var = this.f20263a;
            x1Var2 = (x1) this.f20267e;
            od.m10798c(obj);
        }
        float fM8477c2 = x1Var2.m8477c(((Number) obj).floatValue());
        c4167y.f21163a = x1Var.f20312d == x0.Horizontal ? C6761q.m12958a(j6, fM8477c2, DefinitionKt.NO_Float_VALUE, 2) : C6761q.m12958a(j6, DefinitionKt.NO_Float_VALUE, fM8477c2, 1);
        return qw.a0.f30746a;
    }
}
