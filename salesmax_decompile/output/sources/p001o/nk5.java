package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public abstract class nk5 {

    /* renamed from: o.nk5$a */
    public static final class C15597a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f36969a;

        /* renamed from: b */
        public int f36970b;

        public C15597a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36969a = obj;
            this.f36970b |= Integer.MIN_VALUE;
            return nk5.m40719a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m40719a(n64 n64Var) {
        C15597a c15597a;
        if (n64Var instanceof C15597a) {
            c15597a = (C15597a) n64Var;
            int i = c15597a.f36970b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15597a.f36970b = i - Integer.MIN_VALUE;
            } else {
                c15597a = new C15597a(n64Var);
            }
        }
        Object obj = c15597a.f36969a;
        Object objM51918f = uq8.m51918f();
        int i2 = c15597a.f36970b;
        if (i2 == 0) {
            wre.m54934b(obj);
            c15597a.f36970b = 1;
            zb2 zb2Var = new zb2(tq8.m50336c(c15597a), 1);
            zb2Var.m59116E();
            Object objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(c15597a);
            }
            if (objM59140v == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        throw new qe9();
    }

    /* renamed from: b */
    public static final Object m40720b(long j, n64 n64Var) {
        if (j <= 0) {
            return y3i.f54824a;
        }
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        if (j < Long.MAX_VALUE) {
            m40722d(zb2Var.getContext()).mo26962D(j, zb2Var);
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: c */
    public static final Object m40721c(long j, n64 n64Var) {
        Object objM40720b = m40720b(m40723e(j), n64Var);
        return objM40720b == uq8.m51918f() ? objM40720b : y3i.f54824a;
    }

    /* renamed from: d */
    public static final mk5 m40722d(q74 q74Var) {
        q74.InterfaceC16311b interfaceC16311b = q74Var.get(p64.f39391p);
        mk5 mk5Var = interfaceC16311b instanceof mk5 ? (mk5) interfaceC16311b : null;
        return mk5Var == null ? xd5.m56042a() : mk5Var;
    }

    /* renamed from: e */
    public static final long m40723e(long j) {
        boolean zM34868N = k16.m34868N(j);
        if (zM34868N) {
            return k16.m34894y(k16.m34870P(j, m16.m38176t(999999L, o16.NANOSECONDS)));
        }
        if (zM34868N) {
            throw new szb();
        }
        return 0L;
    }
}
