package p001o;

/* loaded from: classes6.dex */
public abstract class xze {

    /* renamed from: a */
    public static final ql7 f54645a;

    /* renamed from: o.xze$a */
    public /* synthetic */ class C18282a extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C18282a f54646a = new C18282a();

        public C18282a() {
            super(3, z37.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.ql7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z37 z37Var, Object obj, n64 n64Var) {
            return z37Var.emit(obj, n64Var);
        }
    }

    static {
        C18282a c18282a = C18282a.f54646a;
        sq8.m48647f(c18282a, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f54645a = (ql7) azh.m18052e(c18282a, 3);
    }
}
