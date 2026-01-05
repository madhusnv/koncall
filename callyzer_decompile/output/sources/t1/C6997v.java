package t1;

import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1475f;
import cp.C1476g;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.InterfaceC2779j;
import k1.d1;
import kotlin.jvm.internal.C4165w;
import og.od;
import q1.C6093u;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.v */
/* loaded from: classes.dex */
public final class C6997v extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f33877a;

    /* renamed from: b */
    public /* synthetic */ Object f33878b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7000y f33879c;

    /* renamed from: d */
    public final /* synthetic */ int f33880d;

    /* renamed from: e */
    public final /* synthetic */ float f33881e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2779j f33882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6997v(AbstractC7000y abstractC7000y, int i10, float f6, InterfaceC2779j interfaceC2779j, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33879c = abstractC7000y;
        this.f33880d = i10;
        this.f33881e = f6;
        this.f33882f = interfaceC2779j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C6997v c6997v = new C6997v(this.f33879c, this.f33880d, this.f33881e, this.f33882f, interfaceC7559c);
        c6997v.f33878b = obj;
        return c6997v;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6997v) create((d1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i11 = this.f33877a;
        qw.a0 a0Var = qw.a0.f30746a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return a0Var;
        }
        od.m10798c(obj);
        d1 d1Var = (d1) this.f33878b;
        AbstractC7000y abstractC7000y = this.f33879c;
        C6093u c6093u = new C6093u(d1Var, abstractC7000y, 1);
        C1475f c1475f = new C1475f(17, abstractC7000y);
        this.f33877a = 1;
        float f6 = b0.f33756a;
        int i12 = this.f33880d;
        c1475f.invoke(c6093u, new Integer(i12));
        boolean z6 = i12 > abstractC7000y.f33902e;
        int iM12129e = (c6093u.m12129e() - abstractC7000y.f33902e) + 1;
        if (((z6 && i12 > c6093u.m12129e()) || (!z6 && i12 < abstractC7000y.f33902e)) && Math.abs(i12 - abstractC7000y.f33902e) >= 3) {
            if (z6) {
                i10 = i12 - iM12129e;
                int i13 = abstractC7000y.f33902e;
                if (i10 < i13) {
                    i10 = i13;
                }
            } else {
                int i14 = iM12129e + i12;
                i10 = abstractC7000y.f33902e;
                if (i14 <= i10) {
                    i10 = i14;
                }
            }
            c6093u.m12130f(i10);
        }
        Object objM6782e = AbstractC2773d.m6782e(DefinitionKt.NO_Float_VALUE, c6093u.m12126b(i12) + this.f33881e, this.f33882f, new C1476g(23, new C4165w(), c6093u), this, 4);
        if (objM6782e != enumC7794a) {
            objM6782e = a0Var;
        }
        return objM6782e == enumC7794a ? enumC7794a : a0Var;
    }
}
