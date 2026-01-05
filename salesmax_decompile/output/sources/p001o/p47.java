package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class p47 {

    /* renamed from: a */
    public static final int f39319a = pig.m43752b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* renamed from: o.p47$a */
    public static final class C15956a extends jgg implements ql7 {

        /* renamed from: a */
        public int f39320a;

        /* renamed from: b */
        public /* synthetic */ Object f39321b;

        /* renamed from: c */
        public /* synthetic */ Object f39322c;

        /* renamed from: d */
        public final /* synthetic */ nl7 f39323d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15956a(nl7 nl7Var, n64 n64Var) {
            super(3, n64Var);
            this.f39323d = nl7Var;
        }

        @Override // p001o.ql7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z37 z37Var, Object obj, n64 n64Var) {
            C15956a c15956a = new C15956a(this.f39323d, n64Var);
            c15956a.f39321b = z37Var;
            c15956a.f39322c = obj;
            return c15956a.invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            z37 z37Var;
            Object objM51918f = uq8.m51918f();
            int i = this.f39320a;
            if (i == 0) {
                wre.m54934b(obj);
                z37Var = (z37) this.f39321b;
                Object obj2 = this.f39322c;
                nl7 nl7Var = this.f39323d;
                this.f39321b = z37Var;
                this.f39320a = 1;
                obj = nl7Var.invoke(obj2, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                z37Var = (z37) this.f39321b;
                wre.m54934b(obj);
            }
            this.f39321b = null;
            this.f39320a = 2;
            if (z37Var.emit(obj, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final v37 m42960a(v37 v37Var, nl7 nl7Var) {
        return e47.m24288v(v37Var, new C15956a(nl7Var, null));
    }

    /* renamed from: b */
    public static final v37 m42961b(v37 v37Var, ql7 ql7Var) {
        return new rg2(ql7Var, v37Var, null, 0, null, 28, null);
    }
}
