package p001o;

/* loaded from: classes2.dex */
public abstract class g4f {

    /* renamed from: a */
    public static final f4f f24571a = m28039a(C13620a.f24572a, C13621b.f24573a);

    /* renamed from: o.g4f$a */
    public static final class C13620a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C13620a f24572a = new C13620a();

        public C13620a() {
            super(2);
        }

        /* renamed from: a */
        public final Object m28040a(h4f h4fVar, Object obj) {
            sq8.m48649h(h4fVar, "$this$Saver");
            return obj;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            tq.m50332a(obj);
            return m28040a(null, obj2);
        }
    }

    /* renamed from: o.g4f$b */
    public static final class C13621b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13621b f24573a = new C13621b();

        public C13621b() {
            super(1);
        }

        @Override // p001o.xk7
        public final Object invoke(Object obj) {
            sq8.m48649h(obj, "it");
            return obj;
        }
    }

    /* renamed from: o.g4f$c */
    public static final class C13622c implements f4f {

        /* renamed from: a */
        public final /* synthetic */ nl7 f24574a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f24575b;

        public C13622c(nl7 nl7Var, xk7 xk7Var) {
            this.f24574a = nl7Var;
            this.f24575b = xk7Var;
        }

        @Override // p001o.f4f
        /* renamed from: a */
        public Object mo26068a(Object obj) {
            sq8.m48649h(obj, "value");
            return this.f24575b.invoke(obj);
        }

        @Override // p001o.f4f
        /* renamed from: b */
        public Object mo26069b(h4f h4fVar, Object obj) {
            sq8.m48649h(h4fVar, "<this>");
            return this.f24574a.invoke(h4fVar, obj);
        }
    }

    /* renamed from: a */
    public static final f4f m28039a(nl7 nl7Var, xk7 xk7Var) {
        sq8.m48649h(nl7Var, "save");
        sq8.m48649h(xk7Var, "restore");
        return new C13622c(nl7Var, xk7Var);
    }
}
