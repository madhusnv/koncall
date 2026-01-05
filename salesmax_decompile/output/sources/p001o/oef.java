package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class oef extends nef {

    /* renamed from: o.oef$a */
    public static final class C15783a implements ief {

        /* renamed from: a */
        public final /* synthetic */ Iterator f38261a;

        public C15783a(Iterator it) {
            this.f38261a = it;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return this.f38261a;
        }
    }

    /* renamed from: o.oef$b */
    public static final class C15784b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ Object f38262a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15784b(Object obj) {
            super(0);
            this.f38262a = obj;
        }

        @Override // p001o.uk7
        public final Object invoke() {
            return this.f38262a;
        }
    }

    /* renamed from: c */
    public static final ief m42144c(Iterator it) {
        sq8.m48649h(it, "<this>");
        return m42145d(new C15783a(it));
    }

    /* renamed from: d */
    public static final ief m42145d(ief iefVar) {
        sq8.m48649h(iefVar, "<this>");
        return iefVar instanceof st3 ? iefVar : new st3(iefVar);
    }

    /* renamed from: e */
    public static final ief m42146e() {
        return r66.f43051a;
    }

    /* renamed from: f */
    public static final ief m42147f(Object obj, xk7 xk7Var) {
        sq8.m48649h(xk7Var, "nextFunction");
        return obj == null ? r66.f43051a : new bo7(new C15784b(obj), xk7Var);
    }

    /* renamed from: g */
    public static final ief m42148g(uk7 uk7Var, xk7 xk7Var) {
        sq8.m48649h(uk7Var, "seedFunction");
        sq8.m48649h(xk7Var, "nextFunction");
        return new bo7(uk7Var, xk7Var);
    }

    /* renamed from: h */
    public static final ief m42149h(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return gp0.m29246M(objArr);
    }
}
