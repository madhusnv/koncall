package p001o;

import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserStatus;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.vre;

/* loaded from: classes.dex */
public final class tji {

    /* renamed from: d */
    public static final C17133a f47295d = new C17133a(null);

    /* renamed from: e */
    public static final int f47296e = 8;

    /* renamed from: f */
    public static final tji f47297f = new tji();

    /* renamed from: g */
    public static final nc f47298g = nc.f36666b.m40300a();

    /* renamed from: h */
    public static final gci f47299h = gci.f24985b.m28455a();

    /* renamed from: i */
    public static final jg f47300i = jg.f30373b.m33780a();

    /* renamed from: j */
    public static final ReentrantReadWriteLock f47301j = new ReentrantReadWriteLock();

    /* renamed from: a */
    public final cha f47302a;

    /* renamed from: b */
    public final cha f47303b;

    /* renamed from: c */
    public AtomicReference f47304c;

    /* renamed from: o.tji$a */
    public static final class C17133a {
        public C17133a() {
        }

        public /* synthetic */ C17133a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final tji m50080a() {
            return tji.f47297f;
        }
    }

    /* renamed from: o.tji$b */
    public static final class C17134b extends cs1 {
        public C17134b() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo21693a(String str) {
            Object objM53351b;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            tji tjiVar = tji.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(tjiVar.l0(str));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            if (vre.m53354e(objM53351b) != null) {
                objM53351b = ch3.m21246k();
            }
            return (List) objM53351b;
        }
    }

    /* renamed from: o.tji$c */
    public static final class C17135c extends cs1 {
        public C17135c() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo21693a(String str) {
            Object objM53351b;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            tji tjiVar = tji.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(Boolean.valueOf(tjiVar.s0(str)));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            if (vre.m53354e(objM53351b) != null) {
                objM53351b = Boolean.FALSE;
            }
            return (Boolean) objM53351b;
        }
    }

    /* renamed from: o.tji$d */
    public static final class C17136d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f47307a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17136d(String str) {
            super(1);
            this.f47307a = str;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccountMembership accountMembership) {
            return Boolean.valueOf(sq8.m48644c(accountMembership.getAccount().getId(), this.f47307a));
        }
    }

    /* renamed from: o.tji$e */
    public static final class C17137e implements ggd {

        /* renamed from: a */
        public static final C17137e f47308a = new C17137e();

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(AccountMembership accountMembership) {
            sq8.m48649h(accountMembership, "membership");
            return accountMembership.getUserAccountStatus() == UserStatus.ACTIVE || accountMembership.getUserAccountStatus() == UserStatus.APPROVED;
        }
    }

    /* renamed from: o.tji$f */
    public static final class C17138f implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ List f47309a;

        /* renamed from: b */
        public final /* synthetic */ Set f47310b;

        public C17138f(List list, Set set) {
            this.f47309a = list;
            this.f47310b = set;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AccountMembership accountMembership) {
            sq8.m48649h(accountMembership, "it");
            this.f47309a.add(accountMembership);
            gci gciVar = tji.f47299h;
            String userId = accountMembership.getUserId();
            sq8.m48648g(userId, "getUserId(...)");
            Optional optionalOf = Optional.of(accountMembership.getUser());
            sq8.m48648g(optionalOf, "of(...)");
            gciVar.m28453j(userId, optionalOf);
            Set set = this.f47310b;
            User user = accountMembership.getUser();
            sq8.m48648g(user, "getUser(...)");
            set.add(user);
        }
    }

    /* renamed from: o.tji$g */
    public static final class C17139g extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17139g f47311a = new C17139g();

        public C17139g() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(AccountMembership accountMembership) {
            return accountMembership.getUserId();
        }
    }

    /* renamed from: o.tji$h */
    public static final class C17140h implements ni {
    }

    /* renamed from: o.tji$i */
    public static final class C17141i extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17141i f47312a = new C17141i();

        public C17141i() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Account invoke(AccountMembership accountMembership) {
            return accountMembership.getAccount();
        }
    }

    /* renamed from: o.tji$j */
    public static final class C17142j extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17142j f47313a = new C17142j();

        public C17142j() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(AccountMembership accountMembership) {
            return accountMembership.getUserId();
        }
    }

    /* renamed from: o.tji$k */
    public static final class C17143k extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17143k f47314a = new C17143k();

        public C17143k() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccountMembership accountMembership) {
            return Boolean.valueOf(accountMembership.getUserAccountStatus() == UserStatus.ACTIVE || accountMembership.getUserAccountStatus() == UserStatus.APPROVED);
        }
    }

    /* renamed from: o.tji$l */
    public static final class C17144l implements ni {
    }

    /* renamed from: o.tji$m */
    public static final class C17145m extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17145m f47315a = new C17145m();

        public C17145m() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final User invoke(AccountMembership accountMembership) {
            return accountMembership.getUser();
        }
    }

    public tji() {
        cha chaVarM53305b = vr1.m53298y().m53305b(new C17135c());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f47302a = chaVarM53305b;
        cha chaVarM53305b2 = vr1.m53298y().m53305b(new C17134b());
        sq8.m48648g(chaVarM53305b2, "build(...)");
        this.f47303b = chaVarM53305b2;
        this.f47304c = new AtomicReference();
    }

    /* renamed from: K */
    public static final void m50037K(final tji tjiVar) {
        sq8.m48649h(tjiVar, "this$0");
        tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.bji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.m50038L(this.f16448a, obj);
            }
        });
    }

    /* renamed from: L */
    public static final Object m50038L(tji tjiVar, Object obj) {
        sq8.m48649h(tjiVar, "this$0");
        Set<String> setV0 = kh3.V0(tjiVar.f47302a.mo21258a().keySet());
        tjiVar.f47302a.mo30510f();
        tjiVar.f47303b.mo30510f();
        for (String str : setV0) {
            jg jgVar = f47300i;
            sq8.m48646e(str);
            jgVar.mo26401d(str);
            f47299h.mo26401d(str);
        }
        return obj;
    }

    /* renamed from: M */
    public static final void m50039M() {
        f47301j.writeLock().unlock();
    }

    /* renamed from: O */
    public static final List m50040O(final tji tjiVar, final String str) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$accountId");
        Object objUpdateAndGet = tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.lji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.m50041P(this.f33926a, str, obj);
            }
        });
        if (objUpdateAndGet != null) {
            if (!(objUpdateAndGet instanceof List)) {
                objUpdateAndGet = null;
            }
            if (objUpdateAndGet != null) {
                return (List) objUpdateAndGet;
            }
        }
        return ch3.m21246k();
    }

    /* renamed from: P */
    public static final Object m50041P(tji tjiVar, String str, Object obj) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$accountId");
        Object obj2 = tjiVar.f47303b.get(str);
        if (!((List) obj2).isEmpty()) {
            obj2 = null;
        }
        if (((List) obj2) != null) {
            tjiVar.f47303b.get(str);
            List listM21246k = (List) tjiVar.f47303b.get(str);
            if (listM21246k == null) {
                listM21246k = ch3.m21246k();
            }
            if (listM21246k != null) {
                return listM21246k;
            }
        }
        List list = (List) tjiVar.f47303b.get(str);
        return list == null ? ch3.m21246k() : list;
    }

    /* renamed from: Q */
    public static final void m50042Q() {
        f47301j.writeLock().unlock();
    }

    /* renamed from: R */
    public static final List m50043R() {
        return ch3.m21246k();
    }

    /* renamed from: T */
    public static final Optional m50044T(final tji tjiVar, final String str, final String str2) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$userId");
        sq8.m48649h(str2, "$accountId");
        Object objUpdateAndGet = tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.aji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.m50045U(str, tjiVar, str2, obj);
            }
        });
        if (objUpdateAndGet != null) {
            if (!(objUpdateAndGet instanceof Optional)) {
                objUpdateAndGet = null;
            }
            if (objUpdateAndGet != null) {
                return (Optional) objUpdateAndGet;
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m50045U(String str, tji tjiVar, String str2, Object obj) {
        List listM33775g;
        sq8.m48649h(str, "$userId");
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str2, "$accountId");
        jg jgVar = f47300i;
        List listM33775g2 = jgVar.m33775g(str);
        if (!listM33775g2.isEmpty()) {
            listM33775g2 = null;
        }
        if (listM33775g2 != null) {
            tjiVar.f47302a.get(str);
            listM33775g = jgVar.m33775g(str);
            if (listM33775g == null) {
                listM33775g = jgVar.m33775g(str);
                if (listM33775g == null) {
                    listM33775g = ch3.m21246k();
                }
            }
        }
        Stream stream = listM33775g.stream();
        final C17136d c17136d = new C17136d(str2);
        return stream.filter(new Predicate() { // from class: o.cji
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return tji.m50046V(c17136d, obj2);
            }
        }).findAny();
    }

    /* renamed from: V */
    public static final boolean m50046V(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: W */
    public static final void m50047W() {
        f47301j.writeLock().unlock();
    }

    /* renamed from: X */
    public static final Optional m50048X() {
        return Optional.empty();
    }

    /* renamed from: Z */
    public static final List m50049Z(final tji tjiVar, final String str) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$userId");
        Object objUpdateAndGet = tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.yii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.a0(str, tjiVar, obj);
            }
        });
        if (objUpdateAndGet != null) {
            if (!(objUpdateAndGet instanceof List)) {
                objUpdateAndGet = null;
            }
            if (objUpdateAndGet != null) {
                return (List) objUpdateAndGet;
            }
        }
        return ch3.m21246k();
    }

    public static final Object a0(String str, tji tjiVar, Object obj) {
        sq8.m48649h(str, "$userId");
        sq8.m48649h(tjiVar, "this$0");
        jg jgVar = f47300i;
        List listM33775g = jgVar.m33775g(str);
        if (!listM33775g.isEmpty()) {
            listM33775g = null;
        }
        if (listM33775g != null) {
            tjiVar.f47302a.mo21259e(str);
            return jgVar.m33775g(str);
        }
        if (sq8.m48644c(tjiVar.f47302a.mo30511g(str), Boolean.TRUE)) {
            return jgVar.m33775g(str);
        }
        tjiVar.f47302a.get(str);
        return jgVar.m33775g(str);
    }

    public static final void b0() {
        f47301j.writeLock().unlock();
    }

    public static final List c0() {
        return ch3.m21246k();
    }

    public static final void e0(final tji tjiVar, final String str) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$userId");
        tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.nji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.f0(str, tjiVar, obj);
            }
        });
    }

    public static final Object f0(String str, tji tjiVar, Object obj) {
        sq8.m48649h(str, "$userId");
        sq8.m48649h(tjiVar, "this$0");
        f47300i.mo26401d(str);
        f47299h.mo26401d(str);
        tjiVar.f47302a.mo30509d(str);
        return obj;
    }

    public static final void g0() {
        f47301j.writeLock().unlock();
    }

    public static final void i0(final tji tjiVar, final String str) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$accountId");
        tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.oji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.j0(this.f38466a, str, obj);
            }
        });
    }

    public static final Object j0(tji tjiVar, String str, Object obj) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$accountId");
        tjiVar.f47303b.mo30509d(str);
        return obj;
    }

    public static final void k0() {
        f47301j.writeLock().unlock();
    }

    public static final String m0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean o0(final tji tjiVar, final String str) {
        boolean zBooleanValue;
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$userId");
        Object objUpdateAndGet = tjiVar.f47304c.updateAndGet(new UnaryOperator() { // from class: o.jji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.p0(this.f30516a, str, obj);
            }
        });
        if (objUpdateAndGet == null) {
            zBooleanValue = false;
        } else {
            if (!(objUpdateAndGet instanceof Boolean)) {
                objUpdateAndGet = null;
            }
            if (objUpdateAndGet != null) {
                zBooleanValue = ((Boolean) objUpdateAndGet).booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object p0(tji tjiVar, String str, Object obj) {
        sq8.m48649h(tjiVar, "this$0");
        sq8.m48649h(str, "$userId");
        return Boolean.valueOf(sq8.m48644c(tjiVar.f47302a.get(str), Boolean.TRUE));
    }

    public static final void q0() {
        f47301j.writeLock().unlock();
    }

    public static final Boolean r0() {
        return Boolean.FALSE;
    }

    public static final boolean t0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    public static final String u0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public static final User v0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (User) xk7Var.invoke(obj);
    }

    public static final Account w0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Account) xk7Var.invoke(obj);
    }

    /* renamed from: J */
    public final void m50076J() {
        f47301j.writeLock().lock();
        ayh.Z2(new o83() { // from class: o.tii
            @Override // p001o.o83
            public final void run() {
                tji.m50037K(this.f47221a);
            }
        }).h3(new Runnable() { // from class: o.uii
            @Override // java.lang.Runnable
            public final void run() {
                tji.m50039M();
            }
        });
    }

    /* renamed from: N */
    public final List m50077N(String str) {
        sq8.m48649h(str, "accountId");
        f47301j.writeLock().lock();
        Object objB2 = ayh.H1(new gji(this, str)).h3(new Runnable() { // from class: o.hji
            @Override // java.lang.Runnable
            public final void run() {
                tji.m50042Q();
            }
        }).B2(new Supplier() { // from class: o.iji
            @Override // java.util.function.Supplier
            public final Object get() {
                return tji.m50043R();
            }
        });
        sq8.m48648g(objB2, "getOrElse(...)");
        return (List) objB2;
    }

    /* renamed from: S */
    public final Optional m50078S(String str, String str2) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "accountId");
        f47301j.writeLock().lock();
        Object objB2 = ayh.H1(new vii(this, str, str2)).h3(new Runnable() { // from class: o.wii
            @Override // java.lang.Runnable
            public final void run() {
                tji.m50047W();
            }
        }).B2(new Supplier() { // from class: o.xii
            @Override // java.util.function.Supplier
            public final Object get() {
                return tji.m50048X();
            }
        });
        sq8.m48648g(objB2, "getOrElse(...)");
        return (Optional) objB2;
    }

    /* renamed from: Y */
    public final List m50079Y(String str) {
        sq8.m48649h(str, "userId");
        f47301j.writeLock().lock();
        Object objB2 = ayh.H1(new qii(this, str)).h3(new Runnable() { // from class: o.rii
            @Override // java.lang.Runnable
            public final void run() {
                tji.b0();
            }
        }).B2(new Supplier() { // from class: o.sii
            @Override // java.util.function.Supplier
            public final Object get() {
                return tji.c0();
            }
        });
        sq8.m48648g(objB2, "getOrElse(...)");
        return (List) objB2;
    }

    public final void d0(final String str) {
        sq8.m48649h(str, "userId");
        f47301j.writeLock().lock();
        ayh.Z2(new o83() { // from class: o.oii
            @Override // p001o.o83
            public final void run() {
                tji.e0(this.f38426a, str);
            }
        }).h3(new Runnable() { // from class: o.zii
            @Override // java.lang.Runnable
            public final void run() {
                tji.g0();
            }
        });
    }

    public final void h0(final String str) {
        sq8.m48649h(str, "accountId");
        f47301j.writeLock().lock();
        ayh.Z2(new o83() { // from class: o.kji
            @Override // p001o.o83
            public final void run() {
                tji.i0(this.f32319a, str);
            }
        }).h3(new Runnable() { // from class: o.mji
            @Override // java.lang.Runnable
            public final void run() {
                tji.k0();
            }
        });
    }

    public final List l0(String str) {
        C17140h c17140h = new C17140h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        c17140h.i9(str).m47682D(C17137e.f47308a).m47700g(new C17138f(arrayList, linkedHashSet));
        Stream stream = arrayList.stream();
        final C17139g c17139g = C17139g.f47311a;
        Object objCollect = stream.collect(Collectors.groupingBy(new Function() { // from class: o.pii
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.m0(c17139g, obj);
            }
        }));
        sq8.m48648g(objCollect, "collect(...)");
        for (Map.Entry entry : ((Map) objCollect).entrySet()) {
            jg jgVar = f47300i;
            Object key = entry.getKey();
            sq8.m48648g(key, "<get-key>(...)");
            Object value = entry.getValue();
            sq8.m48648g(value, "<get-value>(...)");
            jgVar.m33774f((String) key, (List) value);
        }
        return kh3.T0(linkedHashSet);
    }

    public final boolean n0(String str) {
        sq8.m48649h(str, "userId");
        f47301j.writeLock().lock();
        Object objB2 = ayh.H1(new dji(this, str)).h3(new Runnable() { // from class: o.eji
            @Override // java.lang.Runnable
            public final void run() {
                tji.q0();
            }
        }).B2(new Supplier() { // from class: o.fji
            @Override // java.util.function.Supplier
            public final Object get() {
                return tji.r0();
            }
        });
        sq8.m48648g(objB2, "getOrElse(...)");
        return ((Boolean) objB2).booleanValue();
    }

    public final boolean s0(String str) {
        Stream stream = new C17144l().Lp(str).stream();
        final C17143k c17143k = C17143k.f47314a;
        List list = (List) stream.filter(new Predicate() { // from class: o.pji
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return tji.t0(c17143k, obj);
            }
        }).collect(Collectors.toList());
        Stream stream2 = list.stream();
        final C17142j c17142j = C17142j.f47313a;
        Map map = (Map) stream2.collect(Collectors.groupingBy(new Function() { // from class: o.qji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.u0(c17142j, obj);
            }
        }));
        Stream stream3 = list.stream();
        final C17145m c17145m = C17145m.f47315a;
        List<User> list2 = (List) stream3.map(new Function() { // from class: o.rji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.v0(c17145m, obj);
            }
        }).collect(Collectors.toList());
        Stream stream4 = list.stream();
        final C17141i c17141i = C17141i.f47312a;
        List<Account> list3 = (List) stream4.map(new Function() { // from class: o.sji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tji.w0(c17141i, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(map);
        for (Map.Entry entry : map.entrySet()) {
            jg jgVar = f47300i;
            Object key = entry.getKey();
            sq8.m48648g(key, "<get-key>(...)");
            Object value = entry.getValue();
            sq8.m48648g(value, "<get-value>(...)");
            jgVar.m33774f((String) key, (List) value);
        }
        sq8.m48646e(list2);
        for (User user : list2) {
            gci gciVar = f47299h;
            String id = user.getId();
            sq8.m48648g(id, "getId(...)");
            Optional optionalOf = Optional.of(user);
            sq8.m48648g(optionalOf, "of(...)");
            gciVar.m28453j(id, optionalOf);
        }
        sq8.m48646e(list3);
        for (Account account : list3) {
            nc ncVar = f47298g;
            String id2 = account.getId();
            sq8.m48648g(id2, "getId(...)");
            Optional optionalOf2 = Optional.of(account);
            sq8.m48648g(optionalOf2, "of(...)");
            ncVar.m40298j(id2, optionalOf2);
        }
        this.f47302a.put(str, Boolean.TRUE);
        if (!(!list.isEmpty())) {
            list = null;
        }
        return list != null;
    }
}
