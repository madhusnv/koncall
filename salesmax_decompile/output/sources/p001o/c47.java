package p001o;

/* loaded from: classes6.dex */
public abstract class c47 {

    /* renamed from: o.c47$a */
    public static final class C12547a implements v37 {

        /* renamed from: a */
        public final /* synthetic */ ql7 f17262a;

        public C12547a(ql7 ql7Var) {
            this.f17262a = ql7Var;
        }

        @Override // p001o.v37
        /* renamed from: a */
        public Object mo9775a(z37 z37Var, n64 n64Var) {
            Object objM20194a = c47.m20194a(new C12548b(this.f17262a, z37Var, null), n64Var);
            return objM20194a == uq8.m51918f() ? objM20194a : y3i.f54824a;
        }
    }

    /* renamed from: o.c47$b */
    public static final class C12548b extends jgg implements nl7 {

        /* renamed from: a */
        public int f17263a;

        /* renamed from: b */
        public /* synthetic */ Object f17264b;

        /* renamed from: c */
        public final /* synthetic */ ql7 f17265c;

        /* renamed from: d */
        public final /* synthetic */ z37 f17266d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12548b(ql7 ql7Var, z37 z37Var, n64 n64Var) {
            super(2, n64Var);
            this.f17265c = ql7Var;
            this.f17266d = z37Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12548b c12548b = new C12548b(this.f17265c, this.f17266d, n64Var);
            c12548b.f17264b = obj;
            return c12548b;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f17263a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f17264b;
                ql7 ql7Var = this.f17265c;
                z37 z37Var = this.f17266d;
                this.f17263a = 1;
                if (ql7Var.invoke(h84Var, z37Var, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12548b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final Object m20194a(nl7 nl7Var, n64 n64Var) {
        b47 b47Var = new b47(n64Var.getContext(), n64Var);
        Object objM31474b = i3i.m31474b(b47Var, b47Var, nl7Var);
        if (objM31474b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM31474b;
    }

    /* renamed from: b */
    public static final v37 m20195b(ql7 ql7Var) {
        return new C12547a(ql7Var);
    }
}
