package p001o;

import ai.salesmax.auth.AuthUtil;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import org.objectweb.asm.Opcodes;
import p001o.vci;

/* loaded from: classes.dex */
public final class vci extends ub1 {

    /* renamed from: d */
    public static final C17545a f50127d = new C17545a(null);

    /* renamed from: e */
    public static final int f50128e = 8;

    /* renamed from: f */
    public static vci f50129f = new vci();

    /* renamed from: g */
    public static final ReentrantReadWriteLock f50130g = new ReentrantReadWriteLock();

    /* renamed from: b */
    public j9i f50131b;

    /* renamed from: c */
    public User f50132c;

    /* renamed from: o.vci$a */
    public static final class C17545a {

        /* renamed from: o.vci$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f50133a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final vci invoke(Throwable th) {
                return null;
            }
        }

        /* renamed from: o.vci$a$b */
        public static final class b extends jgg implements xk7 {

            /* renamed from: a */
            public int f50134a;

            /* renamed from: b */
            public final /* synthetic */ vci f50135b;

            /* renamed from: o.vci$a$b$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ vci f50136a;

                /* renamed from: o.vci$a$b$a$a, reason: collision with other inner class name */
                public static final class C19596a extends kf9 implements xk7 {

                    /* renamed from: a */
                    public final /* synthetic */ vci f50137a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19596a(vci vciVar) {
                        super(1);
                        this.f50137a = vciVar;
                    }

                    /* renamed from: a */
                    public final void m52574a(User user) {
                        sq8.m48649h(user, "it");
                        this.f50137a.f50132c = user;
                    }

                    @Override // p001o.xk7
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m52574a((User) obj);
                        return y3i.f54824a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(vci vciVar) {
                    super(1);
                    this.f50136a = vciVar;
                }

                /* renamed from: b */
                public static final void m52573b(xk7 xk7Var, Object obj) {
                    sq8.m48649h(xk7Var, "$tmp0");
                    xk7Var.invoke(obj);
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return y3i.f54824a;
                }

                public final void invoke(String str) {
                    sq8.m48649h(str, "it");
                    Map mapM139d = AuthUtil.f257a.m139d(str);
                    uia.m51627b(uia.f48971a, "user-context", "Decoded token information: " + mapM139d, null, null, 12, null);
                    vci vciVar = this.f50136a;
                    Object obj = mapM139d.get("userId");
                    sq8.m48646e(obj);
                    String str2 = (String) obj;
                    Object obj2 = mapM139d.get("sub");
                    sq8.m48646e(obj2);
                    String str3 = (String) obj2;
                    Object obj3 = mapM139d.get("phone_number");
                    sq8.m48646e(obj3);
                    String str4 = (String) obj3;
                    String str5 = null;
                    String str6 = (String) mapM139d.get("event_id");
                    String str7 = (String) mapM139d.get("auth_time");
                    Long lValueOf = str7 != null ? Long.valueOf(Long.parseLong(str7)) : null;
                    String str8 = (String) mapM139d.get("exp");
                    vciVar.f50131b = new j9i(str2, str3, str4, str5, str6, lValueOf, str8 != null ? Long.valueOf(Long.parseLong(str8)) : null, null, Opcodes.L2I, null);
                    gci gciVarM28455a = gci.f24985b.m28455a();
                    j9i j9iVar = this.f50136a.f50131b;
                    sq8.m48646e(j9iVar);
                    Optional optionalM28449f = gciVarM28455a.m28449f(j9iVar.m33425a());
                    final C19596a c19596a = new C19596a(this.f50136a);
                    optionalM28449f.ifPresent(new Consumer() { // from class: o.xci
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj4) {
                            vci.C17545a.b.a.m52573b(c19596a, obj4);
                        }
                    });
                    this.f50136a.m51322c(true);
                    j9i unused = this.f50136a.f50131b;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vci vciVar, n64 n64Var) {
                super(1, n64Var);
                this.f50135b = vciVar;
            }

            /* renamed from: g */
            public static final void m52571g(xk7 xk7Var, Object obj) {
                xk7Var.invoke(obj);
            }

            @Override // p001o.vb1
            public final n64 create(n64 n64Var) {
                return new b(this.f50135b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f50134a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                Optional optionalM32980g = j01.f29455d.m32992a().m32980g();
                final a aVar = new a(this.f50135b);
                optionalM32980g.ifPresent(new Consumer() { // from class: o.wci
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        vci.C17545a.b.m52571g(aVar, obj2);
                    }
                });
                return y3i.f54824a;
            }

            @Override // p001o.xk7
            public final Object invoke(n64 n64Var) {
                return ((b) create(n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C17545a() {
        }

        public /* synthetic */ C17545a(id5 id5Var) {
            this();
        }

        /* renamed from: i */
        public static final void m52559i() {
            vci vciVar = vci.f50129f;
            vciVar.m51322c(false);
            vciVar.f50131b = null;
            vciVar.f50132c = null;
        }

        /* renamed from: j */
        public static final void m52560j() {
            vci.f50130g.writeLock().unlock();
        }

        /* renamed from: l */
        public static final vci m52561l() {
            return vci.f50129f;
        }

        /* renamed from: m */
        public static final void m52562m() {
            vci.f50130g.readLock().unlock();
        }

        /* renamed from: n */
        public static final vci m52563n(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (vci) xk7Var.invoke(obj);
        }

        /* renamed from: p */
        public static final void m52564p() {
            uia uiaVar = uia.f48971a;
            uia.m51627b(uiaVar, "user-context", "initializing user context", null, null, 12, null);
            vci vciVar = vci.f50129f;
            if (!(!vciVar.m51320a())) {
                vciVar = null;
            }
            if (vciVar != null) {
                uia.m51627b(uiaVar, "user-context", "Result returned: " + ((y3i) p74.f39487a.m43077e(new b(vciVar, null))), null, null, 12, null);
            }
        }

        /* renamed from: q */
        public static final void m52565q() {
            vci.f50130g.writeLock().unlock();
        }

        /* renamed from: h */
        public final void m52566h() {
            vci.f50130g.writeLock().lock();
            uia.m51627b(uia.f48971a, "user-context", "destroying user context", null, null, 12, null);
            ayh.Z2(new o83() { // from class: o.tci
                @Override // p001o.o83
                public final void run() {
                    vci.C17545a.m52559i();
                }
            }).h3(new Runnable() { // from class: o.uci
                @Override // java.lang.Runnable
                public final void run() {
                    vci.C17545a.m52560j();
                }
            });
        }

        /* renamed from: k */
        public final ub1 m52567k() {
            vci.f50130g.readLock().lock();
            ayh ayhVarH3 = ayh.H1(new qci()).h3(new Runnable() { // from class: o.rci
                @Override // java.lang.Runnable
                public final void run() {
                    vci.C17545a.m52562m();
                }
            });
            final a aVar = a.f50133a;
            Object objM18027D = ayhVarH3.m18027D(new Function() { // from class: o.sci
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return vci.C17545a.m52563n(aVar, obj);
                }
            });
            sq8.m48648g(objM18027D, "getOrElseGet(...)");
            return (ub1) objM18027D;
        }

        /* renamed from: o */
        public final void m52568o() {
            vci.f50130g.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.oci
                @Override // p001o.o83
                public final void run() {
                    vci.C17545a.m52564p();
                }
            }).h3(new Runnable() { // from class: o.pci
                @Override // java.lang.Runnable
                public final void run() {
                    vci.C17545a.m52565q();
                }
            });
        }
    }

    /* renamed from: o.vci$b */
    public static final class C17546b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17546b f50138a = new C17546b();

        public C17546b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final User invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: o.vci$c */
    public static final class C17547c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17547c f50139a = new C17547c();

        public C17547c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j9i invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: p */
    public static final User m52544p(vci vciVar) {
        sq8.m48649h(vciVar, "this$0");
        return vciVar.f50132c;
    }

    /* renamed from: q */
    public static final void m52545q() {
        f50130g.readLock().unlock();
    }

    /* renamed from: r */
    public static final User m52546r(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (User) xk7Var.invoke(obj);
    }

    /* renamed from: t */
    public static final j9i m52547t(vci vciVar) {
        sq8.m48649h(vciVar, "this$0");
        return vciVar.f50131b;
    }

    /* renamed from: u */
    public static final void m52548u() {
        f50130g.readLock().unlock();
    }

    /* renamed from: v */
    public static final j9i m52549v(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (j9i) xk7Var.invoke(obj);
    }

    /* renamed from: o */
    public final User m52550o() {
        f50130g.readLock().lock();
        ayh ayhVarH3 = ayh.H1(new lci(this)).h3(new Runnable() { // from class: o.mci
            @Override // java.lang.Runnable
            public final void run() {
                vci.m52545q();
            }
        });
        final C17546b c17546b = C17546b.f50138a;
        return (User) ayhVarH3.m18027D(new Function() { // from class: o.nci
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vci.m52546r(c17546b, obj);
            }
        });
    }

    /* renamed from: s */
    public final j9i m52551s() {
        f50130g.readLock().lock();
        ayh ayhVarH3 = ayh.H1(new ici(this)).h3(new Runnable() { // from class: o.jci
            @Override // java.lang.Runnable
            public final void run() {
                vci.m52548u();
            }
        });
        final C17547c c17547c = C17547c.f50139a;
        return (j9i) ayhVarH3.m18027D(new Function() { // from class: o.kci
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vci.m52549v(c17547c, obj);
            }
        });
    }

    public String toString() {
        return "UserContext(user=" + this.f50131b + ", remoteUser=" + this.f50132c + ")";
    }
}
