package p001o;

import ai.salesmax.model.Result;
import android.content.Context;

/* loaded from: classes.dex */
public final class rcj {

    /* renamed from: a */
    public Object f43383a;

    /* renamed from: b */
    public Context f43384b;

    /* renamed from: c */
    public String f43385c;

    /* renamed from: d */
    public xk7 f43386d;

    /* renamed from: o.rcj$a */
    public static final class C16590a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16590a f43387a = new C16590a();

        public C16590a() {
            super(1);
        }

        /* renamed from: a */
        public final void m46536a(Result result) {
            sq8.m48649h(result, "it");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m46536a((Result) obj);
            return y3i.f54824a;
        }
    }

    public rcj(Object obj, Context context, String str, xk7 xk7Var) {
        sq8.m48649h(str, "action");
        sq8.m48649h(xk7Var, "callback");
        this.f43383a = obj;
        this.f43384b = context;
        this.f43385c = str;
        this.f43386d = xk7Var;
    }

    /* renamed from: a */
    public final String m46532a() {
        return this.f43385c;
    }

    /* renamed from: b */
    public final xk7 m46533b() {
        return this.f43386d;
    }

    /* renamed from: c */
    public final Context m46534c() {
        return this.f43384b;
    }

    /* renamed from: d */
    public final Object m46535d() {
        return this.f43383a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcj)) {
            return false;
        }
        rcj rcjVar = (rcj) obj;
        return sq8.m48644c(this.f43383a, rcjVar.f43383a) && sq8.m48644c(this.f43384b, rcjVar.f43384b) && sq8.m48644c(this.f43385c, rcjVar.f43385c) && sq8.m48644c(this.f43386d, rcjVar.f43386d);
    }

    public int hashCode() {
        Object obj = this.f43383a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Context context = this.f43384b;
        return ((((iHashCode + (context != null ? context.hashCode() : 0)) * 31) + this.f43385c.hashCode()) * 31) + this.f43386d.hashCode();
    }

    public String toString() {
        return "WrapperEntityToPersist(data=" + this.f43383a + ", context=" + this.f43384b + ", action=" + this.f43385c + ", callback=" + this.f43386d + ")";
    }

    public /* synthetic */ rcj(Object obj, Context context, String str, xk7 xk7Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : context, (i & 4) != 0 ? "CREATE" : str, (i & 8) != 0 ? C16590a.f43387a : xk7Var);
    }
}
