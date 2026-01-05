package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.util.Prefs;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.datastore.generated.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.co1;
import p001o.fbh;

/* loaded from: classes.dex */
public final class co1 extends ub1 {

    /* renamed from: d */
    public static final C12716a f18426d = new C12716a(null);

    /* renamed from: e */
    public static final int f18427e = 8;

    /* renamed from: f */
    public static co1 f18428f = new co1();

    /* renamed from: g */
    public static final ReentrantReadWriteLock f18429g = new ReentrantReadWriteLock();

    /* renamed from: h */
    public static final tji f18430h = tji.f47295d.m50080a();

    /* renamed from: i */
    public static final fbh f18431i = fbh.f23102b.m26410a();

    /* renamed from: j */
    public static final n4h f18432j = n4h.f36372b.m40084a();

    /* renamed from: b */
    public pn1 f18433b;

    /* renamed from: c */
    public List f18434c = new ArrayList();

    /* renamed from: o.co1$a */
    public static final class C12716a {

        /* renamed from: o.co1$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f18435a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final co1 invoke(Throwable th) {
                return null;
            }
        }

        /* renamed from: o.co1$a$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f18436a = new b();

            public b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(TeamMember teamMember) {
                return Boolean.valueOf(sq8.m48644c(teamMember.getIsDefaultTeam(), Boolean.TRUE));
            }
        }

        /* renamed from: o.co1$a$c */
        public static final class c extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ String f18437a;

            /* renamed from: o.co1$a$c$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public static final a f18438a = new a();

                public a() {
                    super(1);
                }

                @Override // p001o.xk7
                public final String invoke(TeamMember teamMember) {
                    return teamMember.getUserId();
                }
            }

            /* renamed from: o.co1$a$c$b */
            public static final class b extends kf9 implements xk7 {

                /* renamed from: a */
                public static final b f18439a = new b();

                public b() {
                    super(1);
                }

                @Override // p001o.xk7
                public final String invoke(TeamMember teamMember) {
                    return teamMember.getUserId();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(1);
                this.f18437a = str;
            }

            /* renamed from: d */
            public static final String m21535d(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return (String) xk7Var.invoke(obj);
            }

            /* renamed from: e */
            public static final String m21536e(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return (String) xk7Var.invoke(obj);
            }

            @Override // p001o.xk7
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final t2h invoke(TeamMember teamMember) {
                n4h n4hVar = co1.f18432j;
                String teamId = teamMember.getTeamId();
                sq8.m48648g(teamId, "getTeamId(...)");
                Optional optionalM40079f = n4hVar.m40079f(teamId);
                fbh fbhVar = co1.f18431i;
                String teamId2 = teamMember.getTeamId();
                sq8.m48648g(teamId2, "getTeamId(...)");
                String str = this.f18437a;
                sq8.m48648g(str, "$accountId");
                Stream stream = fbhVar.m26405j(new fbh.C13384c(teamId2, str)).stream();
                final a aVar = a.f18438a;
                List list = (List) stream.map(new Function() { // from class: o.do1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return co1.C12716a.c.m21535d(aVar, obj);
                    }
                }).collect(Collectors.toList());
                fbh fbhVar2 = co1.f18431i;
                String teamId3 = teamMember.getTeamId();
                sq8.m48648g(teamId3, "getTeamId(...)");
                String str2 = this.f18437a;
                sq8.m48648g(str2, "$accountId");
                Stream stream2 = fbhVar2.m26406l(new fbh.C13384c(teamId3, str2)).stream();
                final b bVar = b.f18439a;
                List list2 = (List) stream2.map(new Function() { // from class: o.eo1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return co1.C12716a.c.m21536e(bVar, obj);
                    }
                }).collect(Collectors.toList());
                if (!optionalM40079f.isPresent()) {
                    String teamId4 = teamMember.getTeamId();
                    sq8.m48648g(teamId4, "getTeamId(...)");
                    return new t2h(teamId4, null, null, null, null, false, 62, null);
                }
                String teamId5 = teamMember.getTeamId();
                sq8.m48648g(teamId5, "getTeamId(...)");
                String teamName = ((Team) optionalM40079f.get()).getTeamName();
                String description = ((Team) optionalM40079f.get()).getDescription();
                sq8.m48646e(list);
                sq8.m48646e(list2);
                return new t2h(teamId5, teamName, description, list, list2, teamMember.getTeamRole() == TeamRole.TEAM_LEADER || teamMember.getTeamRole() == TeamRole.SUPERBOSS);
            }
        }

        /* renamed from: o.co1$a$d */
        public static final class d extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ String f18440a;

            /* renamed from: o.co1$a$d$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public static final a f18441a = new a();

                public a() {
                    super(1);
                }

                @Override // p001o.xk7
                public final String invoke(TeamMember teamMember) {
                    return teamMember.getUserId();
                }
            }

            /* renamed from: o.co1$a$d$b */
            public static final class b extends kf9 implements xk7 {

                /* renamed from: a */
                public static final b f18442a = new b();

                public b() {
                    super(1);
                }

                @Override // p001o.xk7
                public final String invoke(TeamMember teamMember) {
                    return teamMember.getUserId();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(1);
                this.f18440a = str;
            }

            /* renamed from: d */
            public static final String m21540d(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return (String) xk7Var.invoke(obj);
            }

            /* renamed from: e */
            public static final String m21541e(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return (String) xk7Var.invoke(obj);
            }

            @Override // p001o.xk7
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final t2h invoke(TeamMember teamMember) {
                n4h n4hVar = co1.f18432j;
                String teamId = teamMember.getTeamId();
                sq8.m48648g(teamId, "getTeamId(...)");
                Optional optionalM40079f = n4hVar.m40079f(teamId);
                fbh fbhVar = co1.f18431i;
                String teamId2 = teamMember.getTeamId();
                sq8.m48648g(teamId2, "getTeamId(...)");
                String str = this.f18440a;
                sq8.m48648g(str, "$accountId");
                Stream stream = fbhVar.m26405j(new fbh.C13384c(teamId2, str)).stream();
                final a aVar = a.f18441a;
                List list = (List) stream.map(new Function() { // from class: o.fo1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return co1.C12716a.d.m21540d(aVar, obj);
                    }
                }).collect(Collectors.toList());
                fbh fbhVar2 = co1.f18431i;
                String teamId3 = teamMember.getTeamId();
                sq8.m48648g(teamId3, "getTeamId(...)");
                String str2 = this.f18440a;
                sq8.m48648g(str2, "$accountId");
                Stream stream2 = fbhVar2.m26406l(new fbh.C13384c(teamId3, str2)).stream();
                final b bVar = b.f18442a;
                List list2 = (List) stream2.map(new Function() { // from class: o.go1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return co1.C12716a.d.m21541e(bVar, obj);
                    }
                }).collect(Collectors.toList());
                if (!optionalM40079f.isPresent()) {
                    String teamId4 = teamMember.getTeamId();
                    sq8.m48648g(teamId4, "getTeamId(...)");
                    return new t2h(teamId4, null, null, null, null, false, 62, null);
                }
                String teamId5 = teamMember.getTeamId();
                sq8.m48648g(teamId5, "getTeamId(...)");
                String teamName = ((Team) optionalM40079f.get()).getTeamName();
                String description = ((Team) optionalM40079f.get()).getDescription();
                sq8.m48646e(list);
                sq8.m48646e(list2);
                return new t2h(teamId5, teamName, description, list, list2, teamMember.getTeamRole() == TeamRole.TEAM_LEADER || teamMember.getTeamRole() == TeamRole.SUPERBOSS);
            }
        }

        public C12716a() {
        }

        public /* synthetic */ C12716a(id5 id5Var) {
            this();
        }

        /* renamed from: l */
        public static final void m21517l() {
            uia.m51627b(uia.f48971a, "business-context", "destroying business context", null, null, 12, null);
            co1 co1Var = co1.f18428f;
            co1Var.m51322c(false);
            co1Var.f18433b = null;
            co1Var.f18434c = new ArrayList();
        }

        /* renamed from: m */
        public static final void m21518m() {
            co1.f18429g.writeLock().unlock();
        }

        /* renamed from: o */
        public static final co1 m21519o() {
            return co1.f18428f;
        }

        /* renamed from: p */
        public static final void m21520p() {
            co1.f18429g.readLock().unlock();
        }

        /* renamed from: q */
        public static final co1 m21521q(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (co1) xk7Var.invoke(obj);
        }

        /* renamed from: s */
        public static /* synthetic */ void m21522s(C12716a c12716a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            c12716a.m21530r(str);
        }

        /* renamed from: t */
        public static final void m21523t(String str) {
            j9i j9iVarM52551s;
            uia.m51627b(uia.f48971a, "business-context", "initializing business context", null, null, 12, null);
            co1 co1Var = co1.f18428f;
            if (!(!co1Var.m51320a())) {
                co1Var = null;
            }
            if (co1Var != null) {
                ub1 ub1VarM52567k = vci.f50127d.m52567k();
                sq8.m48647f(ub1VarM52567k, "null cannot be cast to non-null type ai.salesmax.context.UserContext");
                vci vciVar = (vci) ub1VarM52567k;
                vci vciVar2 = vciVar.m51321b() && vciVar.m52551s() != null ? vciVar : null;
                if (vciVar2 == null || (j9iVarM52551s = vciVar2.m52551s()) == null) {
                    return;
                }
                List<AccountMembership> listM50079Y = co1.f18430h.m50079Y(j9iVarM52551s.m33425a());
                ArrayList arrayList = new ArrayList(dh3.m23088v(listM50079Y, 10));
                for (AccountMembership accountMembership : listM50079Y) {
                    String id = accountMembership.getAccount().getId();
                    fbh fbhVar = co1.f18431i;
                    String userId = accountMembership.getUserId();
                    sq8.m48648g(userId, "getUserId(...)");
                    String id2 = accountMembership.getAccount().getId();
                    sq8.m48648g(id2, "getId(...)");
                    List listM26403h = fbhVar.m26403h(new fbh.C13385d(userId, id2));
                    Stream stream = listM26403h.stream();
                    final d dVar = new d(id);
                    List list = (List) stream.map(new Function() { // from class: o.un1
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return co1.C12716a.m21524u(dVar, obj);
                        }
                    }).collect(Collectors.toList());
                    Stream stream2 = listM26403h.stream();
                    final b bVar = b.f18436a;
                    Stream streamFilter = stream2.filter(new Predicate() { // from class: o.vn1
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return co1.C12716a.m21525v(bVar, obj);
                        }
                    });
                    final c cVar = new c(id);
                    t2h t2hVar = (t2h) streamFilter.map(new Function() { // from class: o.wn1
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return co1.C12716a.m21526w(cVar, obj);
                        }
                    }).findAny().orElse(null);
                    String id3 = accountMembership.getAccount().getId();
                    String accountName = accountMembership.getAccount().getAccountName();
                    AuthorizationLevel authorizationLevel = accountMembership.getAuthorizationLevel();
                    AccountType accountType = accountMembership.getAccount().getAccountType();
                    sq8.m48646e(id3);
                    sq8.m48646e(list);
                    arrayList.add(new pn1(id3, accountName, authorizationLevel, list, t2hVar, accountType));
                }
                co1Var.f18434c = kh3.T0(arrayList);
                co1Var.f18433b = co1Var.m21502n(vciVar, str);
                co1Var.m51322c(true);
                uia.m51627b(uia.f48971a, "business-context", "business context initialized.", null, null, 12, null);
            }
        }

        /* renamed from: u */
        public static final t2h m21524u(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (t2h) xk7Var.invoke(obj);
        }

        /* renamed from: v */
        public static final boolean m21525v(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: w */
        public static final t2h m21526w(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (t2h) xk7Var.invoke(obj);
        }

        /* renamed from: x */
        public static final void m21527x() {
            co1.f18429g.writeLock().unlock();
        }

        /* renamed from: k */
        public final void m21528k() {
            co1.f18429g.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.ao1
                @Override // p001o.o83
                public final void run() {
                    co1.C12716a.m21517l();
                }
            }).h3(new Runnable() { // from class: o.bo1
                @Override // java.lang.Runnable
                public final void run() {
                    co1.C12716a.m21518m();
                }
            });
        }

        /* renamed from: n */
        public final ub1 m21529n() {
            co1.f18429g.readLock().lock();
            ayh ayhVarH3 = ayh.H1(new xn1()).h3(new Runnable() { // from class: o.yn1
                @Override // java.lang.Runnable
                public final void run() {
                    co1.C12716a.m21520p();
                }
            });
            final a aVar = a.f18435a;
            Object objM18027D = ayhVarH3.m18027D(new Function() { // from class: o.zn1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return co1.C12716a.m21521q(aVar, obj);
                }
            });
            sq8.m48648g(objM18027D, "getOrElseGet(...)");
            return (ub1) objM18027D;
        }

        /* renamed from: r */
        public final void m21530r(final String str) {
            co1.f18429g.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.sn1
                @Override // p001o.o83
                public final void run() {
                    co1.C12716a.m21523t(str);
                }
            }).h3(new Runnable() { // from class: o.tn1
                @Override // java.lang.Runnable
                public final void run() {
                    co1.C12716a.m21527x();
                }
            });
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m21499s(co1 co1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        co1Var.m21506r(str);
    }

    /* renamed from: t */
    public static final void m21500t(String str) {
        C12716a c12716a = f18426d;
        c12716a.m21528k();
        c12716a.m21530r(str);
    }

    /* renamed from: u */
    public static final void m21501u() {
        f18429g.writeLock().unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pn1 m21502n(vci vciVar, String str) {
        pn1 pn1VarM21504p;
        String lastSelectedAccountWeb;
        pn1 pn1VarM21505q;
        pn1 pn1VarM21505q2;
        if (str != null && (pn1VarM21505q2 = m21505q(str)) != null) {
            return pn1VarM21505q2;
        }
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        String strV0 = prefsM127c != null ? prefsM127c.v0() : null;
        if (strV0 != null && (pn1VarM21505q = m21505q(strV0)) != null) {
            return pn1VarM21505q;
        }
        User userM52550o = vciVar.m52550o();
        if (userM52550o == null || (lastSelectedAccountWeb = userM52550o.getLastSelectedAccountWeb()) == null) {
            pn1VarM21504p = m21504p();
            if (pn1VarM21504p == null) {
                pn1VarM21504p = m21503o();
            }
        } else {
            sq8.m48646e(lastSelectedAccountWeb);
            pn1VarM21504p = m21505q(lastSelectedAccountWeb);
            if (pn1VarM21504p == null) {
            }
        }
        return pn1VarM21504p;
    }

    /* renamed from: o */
    public final pn1 m21503o() {
        Object next;
        Iterator it = this.f18434c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((pn1) next).m43900a() != AccountType.INDIVIDUAL) {
                break;
            }
        }
        return (pn1) next;
    }

    /* renamed from: p */
    public final pn1 m21504p() {
        Object next;
        Iterator it = this.f18434c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((pn1) next).m43900a() != AccountType.INDIVIDUAL) {
                break;
            }
        }
        return (pn1) next;
    }

    /* renamed from: q */
    public final pn1 m21505q(String str) {
        Object next;
        Iterator it = this.f18434c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((pn1) next).m43901b(), str)) {
                break;
            }
        }
        return (pn1) next;
    }

    /* renamed from: r */
    public final void m21506r(final String str) {
        f18429g.writeLock().lock();
        ayh.Z2(new o83() { // from class: o.qn1
            @Override // p001o.o83
            public final void run() {
                co1.m21500t(str);
            }
        }).h3(new Runnable() { // from class: o.rn1
            @Override // java.lang.Runnable
            public final void run() {
                co1.m21501u();
            }
        });
    }

    public String toString() {
        return "BusinessContext(activeBusiness=" + this.f18433b + ", availableBusinesses=" + this.f18434c + ")";
    }
}
