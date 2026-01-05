package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class chh {

    /* renamed from: d */
    public static final C12689c f18202d = new C12689c(null);

    /* renamed from: e */
    public static final f4f f18203e = g4f.m28039a(C12687a.f18207a, C12688b.f18208a);

    /* renamed from: a */
    public final nh0 f18204a;

    /* renamed from: b */
    public final long f18205b;

    /* renamed from: c */
    public final kih f18206c;

    /* renamed from: o.chh$a */
    public static final class C12687a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C12687a f18207a = new C12687a();

        public C12687a() {
            super(2);
        }

        /* renamed from: a */
        public final Object m21290a(h4f h4fVar, chh chhVar) {
            sq8.m48649h(h4fVar, "$this$Saver");
            sq8.m48649h(chhVar, "it");
            return ch3.m21242g(i4f.m31524u(chhVar.m21287a(), i4f.m31508e(), h4fVar), i4f.m31524u(kih.m35755b(chhVar.m21288b()), i4f.m31520q(kih.f32287b), h4fVar));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            tq.m50332a(obj);
            return m21290a(null, (chh) obj2);
        }
    }

    /* renamed from: o.chh$b */
    public static final class C12688b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12688b f18208a = new C12688b();

        public C12688b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final chh invoke(Object obj) {
            sq8.m48649h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            f4f f4fVarM31508e = i4f.m31508e();
            Boolean bool = Boolean.FALSE;
            kih kihVar = null;
            nh0 nh0Var = (sq8.m48644c(obj2, bool) || obj2 == null) ? null : (nh0) f4fVarM31508e.mo26068a(obj2);
            sq8.m48646e(nh0Var);
            Object obj3 = list.get(1);
            f4f f4fVarM31520q = i4f.m31520q(kih.f32287b);
            if (!sq8.m48644c(obj3, bool) && obj3 != null) {
                kihVar = (kih) f4fVarM31520q.mo26068a(obj3);
            }
            sq8.m48646e(kihVar);
            return new chh(nh0Var, kihVar.m35766m(), (kih) null, 4, (id5) null);
        }
    }

    /* renamed from: o.chh$c */
    public static final class C12689c {
        public C12689c() {
        }

        public /* synthetic */ C12689c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ chh(String str, long j, kih kihVar, id5 id5Var) {
        this(str, j, kihVar);
    }

    /* renamed from: a */
    public final nh0 m21287a() {
        return this.f18204a;
    }

    /* renamed from: b */
    public final long m21288b() {
        return this.f18205b;
    }

    /* renamed from: c */
    public final String m21289c() {
        return this.f18204a.m40556g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chh)) {
            return false;
        }
        chh chhVar = (chh) obj;
        return kih.m35758e(this.f18205b, chhVar.f18205b) && sq8.m48644c(this.f18206c, chhVar.f18206c) && sq8.m48644c(this.f18204a, chhVar.f18204a);
    }

    public int hashCode() {
        int iHashCode = ((this.f18204a.hashCode() * 31) + kih.m35764k(this.f18205b)) * 31;
        kih kihVar = this.f18206c;
        return iHashCode + (kihVar != null ? kih.m35764k(kihVar.m35766m()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f18204a) + "', selection=" + ((Object) kih.m35765l(this.f18205b)) + ", composition=" + this.f18206c + ')';
    }

    public /* synthetic */ chh(nh0 nh0Var, long j, kih kihVar, id5 id5Var) {
        this(nh0Var, j, kihVar);
    }

    public chh(nh0 nh0Var, long j, kih kihVar) {
        sq8.m48649h(nh0Var, "annotatedString");
        this.f18204a = nh0Var;
        this.f18205b = lih.m37335c(j, 0, m21289c().length());
        this.f18206c = kihVar != null ? kih.m35755b(lih.m37335c(kihVar.m35766m(), 0, m21289c().length())) : null;
    }

    public /* synthetic */ chh(nh0 nh0Var, long j, kih kihVar, int i, id5 id5Var) {
        this(nh0Var, (i & 2) != 0 ? kih.f32287b.m35767a() : j, (i & 4) != 0 ? null : kihVar, (id5) null);
    }

    public /* synthetic */ chh(String str, long j, kih kihVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? kih.f32287b.m35767a() : j, (i & 4) != 0 ? null : kihVar, (id5) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public chh(String str, long j, kih kihVar) {
        this(new nh0(str, null, null, 6, null), j, kihVar, (id5) null);
        sq8.m48649h(str, "text");
    }
}
