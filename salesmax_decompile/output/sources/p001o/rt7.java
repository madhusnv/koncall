package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class rt7 extends aqb {

    /* renamed from: o.rt7$a */
    public static final class C16663a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ List f44050a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16663a(List list) {
            super(1);
            this.f44050a = list;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69029invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69029invoke(Object obj) {
            sq8.m48649h(obj, "state");
            List list = this.f44050a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((xk7) list.get(i)).invoke(obj);
            }
        }
    }

    /* renamed from: o.rt7$b */
    public static final class C16664b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f44051a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f44052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16664b(xk7 xk7Var, xk7 xk7Var2) {
            super(1);
            this.f44051a = xk7Var;
            this.f44052b = xk7Var2;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final aqb invoke(axf axfVar) {
            int i;
            sq8.m48649h(axfVar, "invalid");
            synchronized (exf.m25775G()) {
                i = exf.f22341e;
                exf.f22341e = i + 1;
            }
            return new aqb(i, axfVar, this.f44051a, this.f44052b);
        }
    }

    /* renamed from: o.rt7$c */
    public static final class C16665c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f44053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16665c(xk7 xk7Var) {
            super(1);
            this.f44053a = xk7Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rce invoke(axf axfVar) {
            int i;
            sq8.m48649h(axfVar, "invalid");
            synchronized (exf.m25775G()) {
                i = exf.f22341e;
                exf.f22341e = i + 1;
            }
            return new rce(i, axfVar, this.f44053a);
        }
    }

    public rt7(int i, axf axfVar) {
        xk7 c16663a;
        sq8.m48649h(axfVar, "invalid");
        synchronized (exf.m25775G()) {
            List listT0 = exf.f22345i.isEmpty() ^ true ? kh3.T0(exf.f22345i) : null;
            if (listT0 != null) {
                c16663a = (xk7) kh3.E0(listT0);
                if (c16663a == null) {
                    c16663a = new C16663a(listT0);
                }
            } else {
                c16663a = null;
            }
        }
        super(i, axfVar, null, c16663a);
    }

    @Override // p001o.aqb
    /* renamed from: C */
    public ywf mo17663C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p001o.aqb
    /* renamed from: P */
    public aqb mo17676P(xk7 xk7Var, xk7 xk7Var2) {
        return (aqb) exf.m25794Z(new C16664b(xk7Var, xk7Var2));
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        synchronized (exf.m25775G()) {
            m56922q();
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: o */
    public void mo17687o() {
        exf.m25820z();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: x */
    public xwf mo17691x(xk7 xk7Var) {
        return exf.m25794Z(new C16665c(xk7Var));
    }
}
