package p001o;

import p001o.cxe;

/* loaded from: classes3.dex */
public abstract class i07 {

    /* renamed from: o.i07$a */
    public static final class C14147a extends o64 {

        /* renamed from: a */
        public Object f27868a;

        /* renamed from: b */
        public Object f27869b;

        /* renamed from: c */
        public /* synthetic */ Object f27870c;

        /* renamed from: d */
        public int f27871d;

        public C14147a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f27870c = obj;
            this.f27871d |= Integer.MIN_VALUE;
            return i07.m31335a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m31335a(cxe.C12764a c12764a, ii9 ii9Var, r9d r9dVar, n64 n64Var) {
        C14147a c14147a;
        if (n64Var instanceof C14147a) {
            c14147a = (C14147a) n64Var;
            int i = c14147a.f27871d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14147a.f27871d = i - Integer.MIN_VALUE;
            } else {
                c14147a = new C14147a(n64Var);
            }
        }
        Object objMo32174a = c14147a.f27870c;
        Object objM51918f = uq8.m51918f();
        int i2 = c14147a.f27871d;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            c14147a.f27868a = c12764a;
            c14147a.f27869b = r9dVar;
            c14147a.f27871d = 1;
            objMo32174a = ii9Var.mo32174a(c14147a);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r9dVar = (r9d) c14147a.f27869b;
            c12764a = (cxe.C12764a) c14147a.f27868a;
            wre.m54934b(objMo32174a);
        }
        vq3 vq3VarM46332a = ((r81) objMo32174a).m46332a();
        cxe.C12766c.a aVarM21973c = c12764a.getConfig();
        Boolean boolM22009H = c12764a.getConfig().m22009H();
        if (boolM22009H == null && (boolM22009H = (Boolean) bj6.m19237f(uxe.f49603a.m52105c(), r9dVar)) == null) {
            boolM22009H = m31339e(vq3VarM46332a);
        }
        aVarM21973c.m22026Y(boolM22009H);
        cxe.C12766c.a aVarM21973c2 = c12764a.getConfig();
        Boolean boolM22037x = c12764a.getConfig().m22037x();
        if (boolM22037x == null && (boolM22037x = (Boolean) bj6.m19237f(uxe.f49603a.m52103a(), r9dVar)) == null) {
            boolM22037x = m31337c(vq3VarM46332a);
        }
        aVarM21973c2.m22015N(boolM22037x);
        cxe.C12766c.a aVarM21973c3 = c12764a.getConfig();
        Boolean boolM22038y = c12764a.getConfig().m22038y();
        if (boolM22038y == null && (boolM22038y = (Boolean) bj6.m19237f(uxe.f49603a.m52104b(), r9dVar)) == null) {
            boolM22038y = m31338d(vq3VarM46332a);
        }
        aVarM21973c3.m22016O(boolM22038y);
        return y3i.f54824a;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m31336b(cxe.C12764a c12764a, ii9 ii9Var, r9d r9dVar, n64 n64Var, int i, Object obj) {
        if ((i & 4) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        return m31335a(c12764a, ii9Var, r9dVar, n64Var);
    }

    /* renamed from: c */
    public static final Boolean m31337c(vq3 vq3Var) {
        return j81.m33399e(vq3Var, "s3_disable_multiregion_access_points", null, 2, null);
    }

    /* renamed from: d */
    public static final Boolean m31338d(vq3 vq3Var) {
        return j81.m33399e(vq3Var, "s3_disable_express_session_auth", null, 2, null);
    }

    /* renamed from: e */
    public static final Boolean m31339e(vq3 vq3Var) {
        return j81.m33399e(vq3Var, "s3_use_arn_region", null, 2, null);
    }
}
