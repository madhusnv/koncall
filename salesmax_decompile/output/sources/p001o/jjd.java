package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class jjd {

    /* renamed from: o.jjd$a */
    public static final class C14550a extends o64 {

        /* renamed from: a */
        public Object f30508a;

        /* renamed from: b */
        public Object f30509b;

        /* renamed from: c */
        public /* synthetic */ Object f30510c;

        /* renamed from: d */
        public int f30511d;

        public C14550a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f30510c = obj;
            this.f30511d |= Integer.MIN_VALUE;
            return jjd.m33879a(null, null, this);
        }
    }

    /* renamed from: o.jjd$b */
    public static final class C14551b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xb2 f30512a;

        public C14551b(xb2 xb2Var) {
            this.f30512a = xb2Var;
        }

        /* renamed from: a */
        public final void m33884a(Throwable th) {
            xb2 xb2Var = this.f30512a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(y3i.f54824a));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33884a((Throwable) obj);
            return y3i.f54824a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m33879a(ljd ljdVar, uk7 uk7Var, n64 n64Var) {
        C14550a c14550a;
        if (n64Var instanceof C14550a) {
            c14550a = (C14550a) n64Var;
            int i = c14550a.f30511d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14550a.f30511d = i - Integer.MIN_VALUE;
            } else {
                c14550a = new C14550a(n64Var);
            }
        }
        Object obj = c14550a.f30510c;
        Object objM51918f = uq8.m51918f();
        int i2 = c14550a.f30511d;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                if (!(c14550a.getContext().get(p69.f39399t) == ljdVar)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                c14550a.f30508a = ljdVar;
                c14550a.f30509b = uk7Var;
                c14550a.f30511d = 1;
                zb2 zb2Var = new zb2(tq8.m50336c(c14550a), 1);
                zb2Var.m59116E();
                ljdVar.mo23470b(new C14551b(zb2Var));
                Object objM59140v = zb2Var.m59140v();
                if (objM59140v == uq8.m51918f()) {
                    n75.m40201c(c14550a);
                }
                if (objM59140v == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uk7Var = (uk7) c14550a.f30509b;
                wre.m54934b(obj);
            }
            uk7Var.invoke();
            return y3i.f54824a;
        } catch (Throwable th) {
            uk7Var.invoke();
            throw th;
        }
    }

    /* renamed from: b */
    public static final eee m33880b(h84 h84Var, q74 q74Var, int i, wl1 wl1Var, l84 l84Var, xk7 xk7Var, nl7 nl7Var) {
        kjd kjdVar = new kjd(u74.m51082k(h84Var, q74Var), tg2.m49824b(i, wl1Var, null, 4, null));
        if (xk7Var != null) {
            kjdVar.j0(xk7Var);
        }
        kjdVar.V0(l84Var, kjdVar, nl7Var);
        return kjdVar;
    }

    /* renamed from: c */
    public static final eee m33881c(h84 h84Var, q74 q74Var, int i, nl7 nl7Var) {
        return m33880b(h84Var, q74Var, i, wl1.SUSPEND, l84.DEFAULT, null, nl7Var);
    }

    /* renamed from: d */
    public static /* synthetic */ eee m33882d(h84 h84Var, q74 q74Var, int i, wl1 wl1Var, l84 l84Var, xk7 xk7Var, nl7 nl7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            q74Var = e66.f21035a;
        }
        q74 q74Var2 = q74Var;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            wl1Var = wl1.SUSPEND;
        }
        wl1 wl1Var2 = wl1Var;
        if ((i2 & 8) != 0) {
            l84Var = l84.DEFAULT;
        }
        l84 l84Var2 = l84Var;
        if ((i2 & 16) != 0) {
            xk7Var = null;
        }
        return m33880b(h84Var, q74Var2, i3, wl1Var2, l84Var2, xk7Var, nl7Var);
    }

    /* renamed from: e */
    public static /* synthetic */ eee m33883e(h84 h84Var, q74 q74Var, int i, nl7 nl7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            q74Var = e66.f21035a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m33881c(h84Var, q74Var, i, nl7Var);
    }
}
