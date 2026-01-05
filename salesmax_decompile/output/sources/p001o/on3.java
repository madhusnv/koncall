package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class on3 implements nn3 {

    /* renamed from: a */
    public final int f38606a;

    /* renamed from: b */
    public final boolean f38607b;

    /* renamed from: c */
    public Object f38608c;

    /* renamed from: d */
    public qee f38609d;

    /* renamed from: e */
    public List f38610e;

    /* renamed from: o.on3$a */
    public static final class C15843a extends kf9 implements nl7 {

        /* renamed from: b */
        public final /* synthetic */ Object f38612b;

        /* renamed from: c */
        public final /* synthetic */ int f38613c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15843a(Object obj, int i) {
            super(2);
            this.f38612b = obj;
            this.f38613c = i;
        }

        /* renamed from: a */
        public final void m42458a(un3 un3Var, int i) {
            sq8.m48649h(un3Var, "nc");
            on3.this.m42453b(this.f38612b, un3Var, see.m48284a(this.f38613c) | 1);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m42458a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: o.on3$b */
    public static final class C15844b extends kf9 implements nl7 {

        /* renamed from: b */
        public final /* synthetic */ Object f38615b;

        /* renamed from: c */
        public final /* synthetic */ Object f38616c;

        /* renamed from: d */
        public final /* synthetic */ int f38617d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15844b(Object obj, Object obj2, int i) {
            super(2);
            this.f38615b = obj;
            this.f38616c = obj2;
            this.f38617d = i;
        }

        /* renamed from: a */
        public final void m42459a(un3 un3Var, int i) {
            sq8.m48649h(un3Var, "nc");
            on3.this.m42452a(this.f38615b, this.f38616c, un3Var, see.m48284a(this.f38617d) | 1);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m42459a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    public on3(int i, boolean z) {
        this.f38606a = i;
        this.f38607b = z;
    }

    /* renamed from: a */
    public Object m42452a(Object obj, Object obj2, un3 un3Var, int i) {
        sq8.m48649h(un3Var, "c");
        un3 un3VarMo27200b = un3Var.mo27200b(this.f38606a);
        m42455d(un3VarMo27200b);
        int iM43905d = un3VarMo27200b.mo27215q(this) ? pn3.m43905d(2) : pn3.m43907f(2);
        Object obj3 = this.f38608c;
        sq8.m48647f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objMo37376j = ((sl7) azh.m18052e(obj3, 4)).mo37376j(obj, obj2, un3VarMo27200b, Integer.valueOf(iM43905d | i));
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d != null) {
            g6fVarMo27202d.mo28099a(new C15844b(obj, obj2, i));
        }
        return objMo37376j;
    }

    /* renamed from: b */
    public Object m42453b(Object obj, un3 un3Var, int i) {
        sq8.m48649h(un3Var, "c");
        un3 un3VarMo27200b = un3Var.mo27200b(this.f38606a);
        m42455d(un3VarMo27200b);
        int iM43905d = un3VarMo27200b.mo27215q(this) ? pn3.m43905d(1) : pn3.m43907f(1);
        Object obj2 = this.f38608c;
        sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((ql7) azh.m18052e(obj2, 3)).invoke(obj, un3VarMo27200b, Integer.valueOf(iM43905d | i));
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d != null) {
            g6fVarMo27202d.mo28099a(new C15843a(obj, i));
        }
        return objInvoke;
    }

    /* renamed from: c */
    public Object m42454c(un3 un3Var, int i) {
        sq8.m48649h(un3Var, "c");
        un3 un3VarMo27200b = un3Var.mo27200b(this.f38606a);
        m42455d(un3VarMo27200b);
        int iM43905d = i | (un3VarMo27200b.mo27215q(this) ? pn3.m43905d(0) : pn3.m43907f(0));
        Object obj = this.f38608c;
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((nl7) azh.m18052e(obj, 2)).invoke(un3VarMo27200b, Integer.valueOf(iM43905d));
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d != null) {
            sq8.m48647f(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            g6fVarMo27202d.mo28099a((nl7) azh.m18052e(this, 2));
        }
        return objInvoke;
    }

    /* renamed from: d */
    public final void m42455d(un3 un3Var) {
        qee qeeVarMo27206h;
        if (!this.f38607b || (qeeVarMo27206h = un3Var.mo27206h()) == null) {
            return;
        }
        un3Var.mo27199a(qeeVarMo27206h);
        if (pn3.m43906e(this.f38609d, qeeVarMo27206h)) {
            this.f38609d = qeeVarMo27206h;
            return;
        }
        List list = this.f38610e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f38610e = arrayList;
            arrayList.add(qeeVarMo27206h);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (pn3.m43906e((qee) list.get(i), qeeVarMo27206h)) {
                list.set(i, qeeVarMo27206h);
                return;
            }
        }
        list.add(qeeVarMo27206h);
    }

    /* renamed from: e */
    public final void m42456e() {
        if (this.f38607b) {
            qee qeeVar = this.f38609d;
            if (qeeVar != null) {
                qeeVar.invalidate();
                this.f38609d = null;
            }
            List list = this.f38610e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((qee) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    /* renamed from: f */
    public final void m42457f(Object obj) {
        sq8.m48649h(obj, "block");
        if (sq8.m48644c(this.f38608c, obj)) {
            return;
        }
        boolean z = this.f38608c == null;
        this.f38608c = obj;
        if (z) {
            return;
        }
        m42456e();
    }

    @Override // p001o.nl7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m42454c((un3) obj, ((Number) obj2).intValue());
    }

    @Override // p001o.sl7
    /* renamed from: j */
    public /* bridge */ /* synthetic */ Object mo37376j(Object obj, Object obj2, Object obj3, Object obj4) {
        return m42452a(obj, obj2, (un3) obj3, ((Number) obj4).intValue());
    }

    @Override // p001o.ql7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m42453b(obj, (un3) obj2, ((Number) obj3).intValue());
    }
}
