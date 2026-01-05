package p001o;

/* loaded from: classes6.dex */
public abstract class tq8 {

    /* renamed from: o.tq8$a */
    public static final class C17186a extends pre {

        /* renamed from: a */
        public int f47608a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f47609b;

        /* renamed from: c */
        public final /* synthetic */ Object f47610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17186a(n64 n64Var, nl7 nl7Var, Object obj) {
            super(n64Var);
            this.f47609b = nl7Var;
            this.f47610c = obj;
            sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p001o.vb1
        public Object invokeSuspend(Object obj) {
            int i = this.f47608a;
            if (i == 0) {
                this.f47608a = 1;
                wre.m54934b(obj);
                sq8.m48647f(this.f47609b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((nl7) azh.m18052e(this.f47609b, 2)).invoke(this.f47610c, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f47608a = 2;
            wre.m54934b(obj);
            return obj;
        }
    }

    /* renamed from: o.tq8$b */
    public static final class C17187b extends o64 {

        /* renamed from: a */
        public int f47611a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f47612b;

        /* renamed from: c */
        public final /* synthetic */ Object f47613c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17187b(n64 n64Var, q74 q74Var, nl7 nl7Var, Object obj) {
            super(n64Var, q74Var);
            this.f47612b = nl7Var;
            this.f47613c = obj;
            sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p001o.vb1
        public Object invokeSuspend(Object obj) {
            int i = this.f47611a;
            if (i == 0) {
                this.f47611a = 1;
                wre.m54934b(obj);
                sq8.m48647f(this.f47612b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((nl7) azh.m18052e(this.f47612b, 2)).invoke(this.f47613c, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f47611a = 2;
            wre.m54934b(obj);
            return obj;
        }
    }

    /* renamed from: o.tq8$c */
    public static final class C17188c extends pre {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17188c(n64 n64Var) {
            super(n64Var);
            sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p001o.vb1
        public Object invokeSuspend(Object obj) {
            wre.m54934b(obj);
            return obj;
        }
    }

    /* renamed from: o.tq8$d */
    public static final class C17189d extends o64 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17189d(n64 n64Var, q74 q74Var) {
            super(n64Var, q74Var);
            sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p001o.vb1
        public Object invokeSuspend(Object obj) {
            wre.m54934b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final n64 m50334a(nl7 nl7Var, Object obj, n64 n64Var) {
        sq8.m48649h(nl7Var, "<this>");
        sq8.m48649h(n64Var, "completion");
        n64 n64VarM40199a = n75.m40199a(n64Var);
        if (nl7Var instanceof vb1) {
            return ((vb1) nl7Var).create(obj, n64VarM40199a);
        }
        q74 context = n64VarM40199a.getContext();
        return context == e66.f21035a ? new C17186a(n64VarM40199a, nl7Var, obj) : new C17187b(n64VarM40199a, context, nl7Var, obj);
    }

    /* renamed from: b */
    public static final n64 m50335b(n64 n64Var) {
        q74 context = n64Var.getContext();
        return context == e66.f21035a ? new C17188c(n64Var) : new C17189d(n64Var, context);
    }

    /* renamed from: c */
    public static final n64 m50336c(n64 n64Var) {
        n64 n64VarIntercepted;
        sq8.m48649h(n64Var, "<this>");
        o64 o64Var = n64Var instanceof o64 ? (o64) n64Var : null;
        return (o64Var == null || (n64VarIntercepted = o64Var.intercepted()) == null) ? n64Var : n64VarIntercepted;
    }

    /* renamed from: d */
    public static final Object m50337d(nl7 nl7Var, Object obj, n64 n64Var) {
        sq8.m48649h(nl7Var, "<this>");
        sq8.m48649h(n64Var, "completion");
        return ((nl7) azh.m18052e(nl7Var, 2)).invoke(obj, m50335b(n75.m40199a(n64Var)));
    }

    /* renamed from: e */
    public static final Object m50338e(ql7 ql7Var, Object obj, Object obj2, n64 n64Var) {
        sq8.m48649h(ql7Var, "<this>");
        sq8.m48649h(n64Var, "completion");
        return ((ql7) azh.m18052e(ql7Var, 3)).invoke(obj, obj2, m50335b(n75.m40199a(n64Var)));
    }
}
