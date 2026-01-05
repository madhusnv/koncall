package p001o;

import java.util.NoSuchElementException;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class xve {

    /* renamed from: o.xve$a */
    public static final class C18251a implements m9c {

        /* renamed from: a */
        public su5 f54364a;

        /* renamed from: b */
        public Object f54365b;

        /* renamed from: c */
        public boolean f54366c;

        /* renamed from: d */
        public final /* synthetic */ xb2 f54367d;

        /* renamed from: e */
        public final /* synthetic */ ogb f54368e;

        /* renamed from: f */
        public final /* synthetic */ Object f54369f;

        /* renamed from: o.xve$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f54370a;

            static {
                int[] iArr = new int[ogb.values().length];
                try {
                    iArr[ogb.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ogb.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ogb.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ogb.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f54370a = iArr;
            }
        }

        /* renamed from: o.xve$a$b */
        public static final class b implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ su5 f54371a;

            public b(su5 su5Var) {
                this.f54371a = su5Var;
            }

            /* renamed from: a */
            public final void m56867a(Throwable th) {
                this.f54371a.dispose();
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m56867a((Throwable) obj);
                return y3i.f54824a;
            }
        }

        public C18251a(xb2 xb2Var, ogb ogbVar, Object obj) {
            this.f54367d = xb2Var;
            this.f54368e = ogbVar;
            this.f54369f = obj;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            this.f54364a = su5Var;
            this.f54367d.mo48694y(new b(su5Var));
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            int i = a.f54370a[this.f54368e.ordinal()];
            su5 su5Var = null;
            if (i == 1 || i == 2) {
                if (this.f54366c) {
                    return;
                }
                this.f54366c = true;
                this.f54367d.resumeWith(vre.m53351b(obj));
                su5 su5Var2 = this.f54364a;
                if (su5Var2 == null) {
                    sq8.m48667z("subscription");
                } else {
                    su5Var = su5Var2;
                }
                su5Var.dispose();
                return;
            }
            if (i != 3 && i != 4) {
                throw new szb();
            }
            if (this.f54368e != ogb.SINGLE || !this.f54366c) {
                this.f54365b = obj;
                this.f54366c = true;
                return;
            }
            if (this.f54367d.mo48687a()) {
                xb2 xb2Var = this.f54367d;
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(wre.m54933a(new IllegalArgumentException("More than one onNext value for " + this.f54368e))));
            }
            su5 su5Var3 = this.f54364a;
            if (su5Var3 == null) {
                sq8.m48667z("subscription");
            } else {
                su5Var = su5Var3;
            }
            su5Var.dispose();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f54366c) {
                if (this.f54367d.mo48687a()) {
                    xb2 xb2Var = this.f54367d;
                    vre.C17665a c17665a = vre.f50797b;
                    xb2Var.resumeWith(vre.m53351b(this.f54365b));
                    return;
                }
                return;
            }
            if (this.f54368e == ogb.FIRST_OR_DEFAULT) {
                xb2 xb2Var2 = this.f54367d;
                vre.C17665a c17665a2 = vre.f50797b;
                xb2Var2.resumeWith(vre.m53351b(this.f54369f));
            } else if (this.f54367d.mo48687a()) {
                xb2 xb2Var3 = this.f54367d;
                vre.C17665a c17665a3 = vre.f50797b;
                xb2Var3.resumeWith(vre.m53351b(wre.m54933a(new NoSuchElementException("No value received via onNext for " + this.f54368e))));
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            xb2 xb2Var = this.f54367d;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        }
    }

    /* renamed from: a */
    public static final Object m56864a(x8c x8cVar, n64 n64Var) {
        Object objM56866c = m56866c(x8cVar, ogb.FIRST, null, n64Var, 2, null);
        uq8.m51918f();
        return objM56866c;
    }

    /* renamed from: b */
    public static final Object m56865b(x8c x8cVar, ogb ogbVar, Object obj, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        x8cVar.mo55724b(new C18251a(zb2Var, ogbVar, obj));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m56866c(x8c x8cVar, ogb ogbVar, Object obj, n64 n64Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return m56865b(x8cVar, ogbVar, obj, n64Var);
    }
}
