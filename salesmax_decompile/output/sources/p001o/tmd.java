package p001o;

import com.google.android.gms.common.Scopes;

/* loaded from: classes2.dex */
public final class tmd implements wge {

    /* renamed from: a */
    public final ii9 f47440a;

    /* renamed from: o.tmd$a */
    public static final class C17161a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f47441a;

        /* renamed from: c */
        public int f47443c;

        public C17161a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f47441a = obj;
            this.f47443c |= Integer.MIN_VALUE;
            return tmd.this.mo16988a(this);
        }
    }

    public tmd(ii9 ii9Var) {
        sq8.m48649h(ii9Var, Scopes.PROFILE);
        this.f47440a = ii9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.wge
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo16988a(n64 n64Var) {
        C17161a c17161a;
        if (n64Var instanceof C17161a) {
            c17161a = (C17161a) n64Var;
            int i = c17161a.f47443c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17161a.f47443c = i - Integer.MIN_VALUE;
            } else {
                c17161a = new C17161a(n64Var);
            }
        }
        Object objMo32174a = c17161a.f47441a;
        Object objM51918f = uq8.m51918f();
        int i2 = c17161a.f47443c;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            ii9 ii9Var = this.f47440a;
            c17161a.f47443c = 1;
            objMo32174a = ii9Var.mo32174a(c17161a);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        return j81.m33405k((vq3) objMo32174a);
    }
}
