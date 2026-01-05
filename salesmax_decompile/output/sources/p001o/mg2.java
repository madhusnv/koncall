package p001o;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class mg2 implements pm7 {

    /* renamed from: a */
    public final q74 f35371a;

    /* renamed from: b */
    public final int f35372b;

    /* renamed from: c */
    public final wl1 f35373c;

    /* renamed from: o.mg2$a */
    public static final class C15311a extends jgg implements nl7 {

        /* renamed from: a */
        public int f35374a;

        /* renamed from: b */
        public /* synthetic */ Object f35375b;

        /* renamed from: c */
        public final /* synthetic */ z37 f35376c;

        /* renamed from: d */
        public final /* synthetic */ mg2 f35377d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15311a(z37 z37Var, mg2 mg2Var, n64 n64Var) {
            super(2, n64Var);
            this.f35376c = z37Var;
            this.f35377d = mg2Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15311a c15311a = new C15311a(this.f35376c, this.f35377d, n64Var);
            c15311a.f35375b = obj;
            return c15311a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f35374a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f35375b;
                z37 z37Var = this.f35376c;
                eee eeeVarM38967m = this.f35377d.m38967m(h84Var);
                this.f35374a = 1;
                if (e47.m24277k(z37Var, eeeVarM38967m, this) == objM51918f) {
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
            return ((C15311a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.mg2$b */
    public static final class C15312b extends jgg implements nl7 {

        /* renamed from: a */
        public int f35378a;

        /* renamed from: b */
        public /* synthetic */ Object f35379b;

        public C15312b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15312b c15312b = mg2.this.new C15312b(n64Var);
            c15312b.f35379b = obj;
            return c15312b;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f35378a;
            if (i == 0) {
                wre.m54934b(obj);
                ljd ljdVar = (ljd) this.f35379b;
                mg2 mg2Var = mg2.this;
                this.f35378a = 1;
                if (mg2Var.mo20154h(ljdVar, this) == objM51918f) {
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
        public final Object invoke(ljd ljdVar, n64 n64Var) {
            return ((C15312b) create(ljdVar, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public mg2(q74 q74Var, int i, wl1 wl1Var) {
        this.f35371a = q74Var;
        this.f35372b = i;
        this.f35373c = wl1Var;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m38962g(mg2 mg2Var, z37 z37Var, n64 n64Var) {
        Object objM31711e = i84.m31711e(new C15311a(z37Var, mg2Var, null), n64Var);
        return objM31711e == uq8.m51918f() ? objM31711e : y3i.f54824a;
    }

    @Override // p001o.v37
    /* renamed from: a */
    public Object mo9775a(z37 z37Var, n64 n64Var) {
        return m38962g(this, z37Var, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[PHI: r4
      0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.pm7
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v37 mo17500e(q74 q74Var, int i, wl1 wl1Var) {
        q74 q74VarPlus = q74Var.plus(this.f35371a);
        if (wl1Var == wl1.SUSPEND) {
            int i2 = this.f35372b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        i = (i != -2 && (i2 = i2 + i) < 0) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2;
                    }
                }
            }
            wl1Var = this.f35373c;
        }
        return (sq8.m48644c(q74VarPlus, this.f35371a) && i == this.f35372b && wl1Var == this.f35373c) ? this : mo20155i(q74VarPlus, i, wl1Var);
    }

    /* renamed from: f */
    public String m38963f() {
        return null;
    }

    /* renamed from: h */
    public abstract Object mo20154h(ljd ljdVar, n64 n64Var);

    /* renamed from: i */
    public abstract mg2 mo20155i(q74 q74Var, int i, wl1 wl1Var);

    /* renamed from: j */
    public v37 mo38964j() {
        return null;
    }

    /* renamed from: k */
    public final nl7 m38965k() {
        return new C15312b(null);
    }

    /* renamed from: l */
    public final int m38966l() {
        int i = this.f35372b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: m */
    public eee m38967m(h84 h84Var) {
        return jjd.m33882d(h84Var, this.f35371a, m38966l(), this.f35373c, l84.ATOMIC, null, m38965k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strM38963f = m38963f();
        if (strM38963f != null) {
            arrayList.add(strM38963f);
        }
        if (this.f35371a != e66.f21035a) {
            arrayList.add("context=" + this.f35371a);
        }
        if (this.f35372b != -3) {
            arrayList.add("capacity=" + this.f35372b);
        }
        if (this.f35373c != wl1.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f35373c);
        }
        return o75.m41657a(this) + '[' + kh3.p0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
