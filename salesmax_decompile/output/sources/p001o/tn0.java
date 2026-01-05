package p001o;

import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import p001o.tn0;

/* loaded from: classes.dex */
public final class tn0 extends ub1 {

    /* renamed from: f */
    public static tn0 f47451f;

    /* renamed from: b */
    public final Context f47453b;

    /* renamed from: c */
    public jq5 f47454c;

    /* renamed from: d */
    public static final C17164a f47449d = new C17164a(null);

    /* renamed from: e */
    public static final int f47450e = 8;

    /* renamed from: g */
    public static final ReentrantReadWriteLock f47452g = new ReentrantReadWriteLock();

    /* renamed from: o.tn0$a */
    public static final class C17164a {

        /* renamed from: o.tn0$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f47455a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final tn0 invoke(Throwable th) {
                return null;
            }
        }

        public C17164a() {
        }

        public /* synthetic */ C17164a(id5 id5Var) {
            this();
        }

        /* renamed from: i */
        public static final void m50220i() {
            uia.m51627b(uia.f48971a, "application-context", "destroying application context", null, null, 12, null);
            tn0 tn0Var = tn0.f47451f;
            if (tn0Var != null) {
                tn0Var.m51322c(false);
            }
        }

        /* renamed from: j */
        public static final void m50221j() {
            tn0.f47452g.writeLock().unlock();
        }

        /* renamed from: l */
        public static final tn0 m50222l() {
            return tn0.f47451f;
        }

        /* renamed from: m */
        public static final void m50223m() {
            tn0.f47452g.readLock().unlock();
        }

        /* renamed from: n */
        public static final tn0 m50224n(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (tn0) xk7Var.invoke(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public static final void m50225p(Context context) {
            sq8.m48649h(context, "$context");
            uia.m51627b(uia.f48971a, "application-context", "initializing application context", null, null, 12, null);
            tn0 tn0Var = tn0.f47451f;
            Object[] objArr = 0;
            if (tn0Var == null) {
                tn0Var = new tn0(context, objArr == true ? 1 : 0);
            }
            tn0.f47451f = tn0Var;
            tn0 tn0Var2 = tn0.f47451f;
            if (tn0Var2 != null) {
                tn0 tn0Var3 = tn0Var2.m51320a() ^ true ? tn0Var2 : null;
                if (tn0Var3 != null) {
                    tn0Var3.f47454c = r6d.f43055a.m46258b(context);
                    tn0Var3.m51322c(true);
                }
            }
        }

        /* renamed from: q */
        public static final void m50226q() {
            tn0.f47452g.writeLock().unlock();
        }

        /* renamed from: h */
        public final void m50227h() {
            tn0.f47452g.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.rn0
                @Override // p001o.o83
                public final void run() {
                    tn0.C17164a.m50220i();
                }
            }).h3(new Runnable() { // from class: o.sn0
                @Override // java.lang.Runnable
                public final void run() {
                    tn0.C17164a.m50221j();
                }
            });
        }

        /* renamed from: k */
        public final ub1 m50228k() {
            tn0.f47452g.readLock().lock();
            ayh ayhVarH3 = ayh.H1(new on0()).h3(new Runnable() { // from class: o.pn0
                @Override // java.lang.Runnable
                public final void run() {
                    tn0.C17164a.m50223m();
                }
            });
            final a aVar = a.f47455a;
            return (ub1) ayhVarH3.m18027D(new Function() { // from class: o.qn0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return tn0.C17164a.m50224n(aVar, obj);
                }
            });
        }

        /* renamed from: o */
        public final void m50229o(final Context context) {
            sq8.m48649h(context, "context");
            tn0.f47452g.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.mn0
                @Override // p001o.o83
                public final void run() {
                    tn0.C17164a.m50225p(context);
                }
            }).h3(new Runnable() { // from class: o.nn0
                @Override // java.lang.Runnable
                public final void run() {
                    tn0.C17164a.m50226q();
                }
            });
        }
    }

    public /* synthetic */ tn0(Context context, id5 id5Var) {
        this(context);
    }

    public tn0(Context context) {
        this.f47453b = context;
    }
}
