package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.plb;
import p001o.q74;
import p001o.vre;

/* loaded from: classes2.dex */
public final class pl1 implements plb {

    /* renamed from: a */
    public final uk7 f40211a;

    /* renamed from: c */
    public Throwable f40213c;

    /* renamed from: b */
    public final Object f40212b = new Object();

    /* renamed from: d */
    public List f40214d = new ArrayList();

    /* renamed from: e */
    public List f40215e = new ArrayList();

    /* renamed from: o.pl1$a */
    public static final class C16130a {

        /* renamed from: a */
        public final xk7 f40216a;

        /* renamed from: b */
        public final n64 f40217b;

        public C16130a(xk7 xk7Var, n64 n64Var) {
            sq8.m48649h(xk7Var, "onFrame");
            sq8.m48649h(n64Var, "continuation");
            this.f40216a = xk7Var;
            this.f40217b = n64Var;
        }

        /* renamed from: a */
        public final n64 m43824a() {
            return this.f40217b;
        }

        /* renamed from: b */
        public final void m43825b(long j) {
            Object objM53351b;
            n64 n64Var = this.f40217b;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(this.f40216a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            n64Var.resumeWith(objM53351b);
        }
    }

    /* renamed from: o.pl1$b */
    public static final class C16131b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ gge f40219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16131b(gge ggeVar) {
            super(1);
            this.f40219b = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            C16130a c16130a;
            Object obj = pl1.this.f40212b;
            pl1 pl1Var = pl1.this;
            gge ggeVar = this.f40219b;
            synchronized (obj) {
                List list = pl1Var.f40214d;
                Object obj2 = ggeVar.f25106a;
                if (obj2 == null) {
                    sq8.m48667z("awaiter");
                    c16130a = null;
                } else {
                    c16130a = (C16130a) obj2;
                }
                list.remove(c16130a);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    public pl1(uk7 uk7Var) {
        this.f40211a = uk7Var;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return plb.C16135a.m43844a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43845b(this, interfaceC16312c);
    }

    @Override // p001o.plb
    /* renamed from: h */
    public Object mo29725h(xk7 xk7Var, n64 n64Var) {
        C16130a c16130a;
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        gge ggeVar = new gge();
        synchronized (this.f40212b) {
            Throwable th = this.f40213c;
            if (th != null) {
                vre.C17665a c17665a = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
            } else {
                ggeVar.f25106a = new C16130a(xk7Var, zb2Var);
                boolean z = !this.f40214d.isEmpty();
                List list = this.f40214d;
                Object obj = ggeVar.f25106a;
                if (obj == null) {
                    sq8.m48667z("awaiter");
                    c16130a = null;
                } else {
                    c16130a = (C16130a) obj;
                }
                list.add(c16130a);
                boolean z2 = !z;
                zb2Var.mo48694y(new C16131b(ggeVar));
                if (z2 && this.f40211a != null) {
                    try {
                        this.f40211a.invoke();
                    } catch (Throwable th2) {
                        m43821l(th2);
                    }
                }
            }
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: l */
    public final void m43821l(Throwable th) {
        synchronized (this.f40212b) {
            if (this.f40213c != null) {
                return;
            }
            this.f40213c = th;
            List list = this.f40214d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                n64 n64VarM43824a = ((C16130a) list.get(i)).m43824a();
                vre.C17665a c17665a = vre.f50797b;
                n64VarM43824a.resumeWith(vre.m53351b(wre.m54933a(th)));
            }
            this.f40214d.clear();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: m */
    public final boolean m43822m() {
        boolean z;
        synchronized (this.f40212b) {
            z = !this.f40214d.isEmpty();
        }
        return z;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43846c(this, interfaceC16312c);
    }

    /* renamed from: n */
    public final void m43823n(long j) {
        synchronized (this.f40212b) {
            List list = this.f40214d;
            this.f40214d = this.f40215e;
            this.f40215e = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C16130a) list.get(i)).m43825b(j);
            }
            list.clear();
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return plb.C16135a.m43847d(this, q74Var);
    }
}
