package h1;

import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import pg.w9;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.c */
/* loaded from: classes.dex */
public final class C2772c {

    /* renamed from: a */
    public final x1 f15358a;

    /* renamed from: b */
    public final Object f15359b;

    /* renamed from: c */
    public final C2780k f15360c;

    /* renamed from: d */
    public final k2.e1 f15361d;

    /* renamed from: e */
    public final k2.e1 f15362e;

    /* renamed from: f */
    public final m0 f15363f;

    /* renamed from: g */
    public final a1 f15364g;

    /* renamed from: h */
    public final AbstractC2785p f15365h;

    /* renamed from: i */
    public final AbstractC2785p f15366i;

    /* renamed from: j */
    public final AbstractC2785p f15367j;

    /* renamed from: k */
    public final AbstractC2785p f15368k;

    public C2772c(Object obj, x1 x1Var, Object obj2) {
        this.f15358a = x1Var;
        this.f15359b = obj2;
        C2780k c2780k = new C2780k(x1Var, obj, null, 60);
        this.f15360c = c2780k;
        this.f15361d = C3953b.m8517t(Boolean.FALSE);
        this.f15362e = C3953b.m8517t(obj);
        this.f15363f = new m0();
        this.f15364g = new a1(obj2);
        AbstractC2785p abstractC2785p = c2780k.f15491c;
        boolean z6 = abstractC2785p instanceof C2781l;
        AbstractC2785p abstractC2785p2 = z6 ? AbstractC2773d.f15379e : abstractC2785p instanceof C2782m ? AbstractC2773d.f15380f : abstractC2785p instanceof C2783n ? AbstractC2773d.f15381g : AbstractC2773d.f15382h;
        this.f15365h = abstractC2785p2;
        AbstractC2785p abstractC2785p3 = z6 ? AbstractC2773d.f15375a : abstractC2785p instanceof C2782m ? AbstractC2773d.f15376b : abstractC2785p instanceof C2783n ? AbstractC2773d.f15377c : AbstractC2773d.f15378d;
        this.f15366i = abstractC2785p3;
        this.f15367j = abstractC2785p2;
        this.f15368k = abstractC2785p3;
    }

    /* renamed from: a */
    public static final Object m6772a(C2772c c2772c, Object obj) {
        x1 x1Var = c2772c.f15358a;
        AbstractC2785p abstractC2785p = c2772c.f15368k;
        AbstractC2785p abstractC2785p2 = c2772c.f15367j;
        if (!AbstractC4154l.m8918a(abstractC2785p2, c2772c.f15365h) || !AbstractC4154l.m8918a(abstractC2785p, c2772c.f15366i)) {
            AbstractC2785p abstractC2785p3 = (AbstractC2785p) x1Var.f15661a.invoke(obj);
            int iMo6832b = abstractC2785p3.mo6832b();
            boolean z6 = false;
            for (int i10 = 0; i10 < iMo6832b; i10++) {
                if (abstractC2785p3.mo6831a(i10) < abstractC2785p2.mo6831a(i10) || abstractC2785p3.mo6831a(i10) > abstractC2785p.mo6831a(i10)) {
                    abstractC2785p3.mo6835e(w9.m11911b(abstractC2785p3.mo6831a(i10), abstractC2785p2.mo6831a(i10), abstractC2785p.mo6831a(i10)), i10);
                    z6 = true;
                }
            }
            if (z6) {
                return x1Var.f15662b.invoke(abstractC2785p3);
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static final void m6773b(C2772c c2772c) {
        C2780k c2780k = c2772c.f15360c;
        c2780k.f15491c.mo6834d();
        c2780k.f15492d = Long.MIN_VALUE;
        c2772c.f15361d.setValue(Boolean.FALSE);
    }

    /* renamed from: c */
    public static Object m6774c(C2772c c2772c, Object obj, InterfaceC2779j interfaceC2779j, InterfaceC7559c interfaceC7559c, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC2779j = c2772c.f15364g;
        }
        InterfaceC2779j interfaceC2779j2 = interfaceC2779j;
        Object objInvoke = c2772c.f15358a.f15662b.invoke(c2772c.f15360c.f15491c);
        Object objM6775d = c2772c.m6775d();
        x1 x1Var = c2772c.f15358a;
        return m0.m6837a(c2772c.f15363f, new C2770a(c2772c, objInvoke, new k1(interfaceC2779j2, x1Var, objM6775d, obj, (AbstractC2785p) x1Var.f15661a.invoke(objInvoke)), c2772c.f15360c.f15492d, null), interfaceC7559c);
    }

    /* renamed from: d */
    public final Object m6775d() {
        return this.f15360c.f15490b.getValue();
    }

    /* renamed from: e */
    public final Object m6776e(Object obj, InterfaceC7559c interfaceC7559c) {
        Object objM6837a = m0.m6837a(this.f15363f, new C2771b(this, obj, null, 0), interfaceC7559c);
        return objM6837a == EnumC7794a.COROUTINE_SUSPENDED ? objM6837a : qw.a0.f30746a;
    }

    public /* synthetic */ C2772c(Object obj, x1 x1Var, Object obj2, int i10) {
        this(obj, x1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
