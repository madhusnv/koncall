package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.util.Prefs;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.UpdateAccountInput;
import type.UpdateAccountMembershipAction;
import type.UpdateAccountMembershipInput;
import type.UpdateUserInput;
import type.UserStatus;

/* loaded from: classes.dex */
public abstract class lpi {

    /* renamed from: a */
    public static String f34197a = "UnknownAccount";

    /* renamed from: b */
    public static Boolean f34198b = Boolean.FALSE;

    /* renamed from: c */
    public static Map f34199c = new ConcurrentHashMap();

    /* renamed from: d */
    public static Map f34200d = new HashMap();

    public static /* synthetic */ x6c A0(String str, String str2, l1 l1Var, mii miiVar) {
        if (str == null && str2 == null) {
            return x6c.c0(Boolean.FALSE);
        }
        final UpdateAccountMembershipInput.Builder builder = UpdateAccountMembershipInput.builder();
        Optional optionalM39159i = miiVar.m39159i();
        Objects.requireNonNull(builder);
        optionalM39159i.ifPresent(new Consumer() { // from class: o.toi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.id((String) obj);
            }
        });
        Optional.ofNullable(str).map(new zg()).ifPresent(new ah(builder));
        Optional.ofNullable(str2).ifPresent(new xg(builder));
        builder.updateAction(UpdateAccountMembershipAction.UPDATE_ROLE_DESIGNATION);
        return l1Var.li(builder.build());
    }

    public static /* synthetic */ x8c B0(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ boolean C0(User user, LeadsUser leadsUser) {
        return Objects.equals(leadsUser.getId(), user.getId());
    }

    public static /* synthetic */ boolean D0(User user, mii miiVar) {
        return miiVar.m39171u().getId().contentEquals(user.getId());
    }

    public static /* synthetic */ void F0(Throwable th) {
    }

    public static /* synthetic */ void G0() {
    }

    public static /* synthetic */ void H0(final User user, LeadsUser leadsUser) {
        leadsUser.refreshUnderlyingUser(user);
        uni.LB().d0(new gd()).m55714J(new ggd() { // from class: o.doi
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return lpi.D0(user, (mii) obj);
            }
        }).m55731j(new gu3() { // from class: o.eoi
            @Override // p001o.gu3
            public final void accept(Object obj) {
                ((mii) obj).m39153K(user);
            }
        }, new gu3() { // from class: o.foi
            @Override // p001o.gu3
            public final void accept(Object obj) {
                lpi.F0((Throwable) obj);
            }
        }, new jm() { // from class: o.hoi
            @Override // p001o.jm
            public final void run() {
                lpi.G0();
            }
        });
    }

    /* renamed from: I */
    public static Optional m37608I() {
        return Optional.ofNullable(uni.kC().SB()).map(new boi());
    }

    public static /* synthetic */ boolean I0(String str, mii miiVar) {
        return Objects.equals(str, miiVar.m39156f().getId());
    }

    /* renamed from: J */
    public static mii m37609J(final String str) {
        final mii miiVar = (mii) uni.kC().ED().stream().filter(new Predicate() { // from class: o.voi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.f0(str, (mii) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.woi
            @Override // java.util.function.Supplier
            public final Object get() {
                return lpi.g0(str);
            }
        });
        if (Objects.equals(UserStatus.REQUESTED.name(), miiVar.m39172v())) {
            throw new RuntimeException("User account status isn't yet approved for membership");
        }
        if (Objects.equals(UserStatus.ACTIVE.name(), miiVar.m39172v())) {
            return miiVar.m39150H();
        }
        l1 l1VarM39161k = miiVar.m39161k();
        AccountMembership accountMembership = (AccountMembership) miiVar.m39158h().orElse(null);
        if (accountMembership != null) {
            return (mii) l1VarM39161k.A3(accountMembership, UpdateAccountMembershipAction.ACCEPT_MEMBERSHIP).d0(new rl7() { // from class: o.xoi
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return lpi.h0(miiVar, (Boolean) obj);
                }
            }).m55727f();
        }
        throw new RuntimeException(String.format("Couldn't find any membership with accountId %s", str));
    }

    public static /* synthetic */ RuntimeException J0(String str) {
        return new RuntimeException(String.format("Couldn't find any user profile with accountId %s", str));
    }

    /* renamed from: K */
    public static Collection m37610K(String str, LeadsUser leadsUser) {
        try {
            String str2 = (String) m37608I().map(new ff()).orElse(f34197a);
            Set set = (Set) f34200d.getOrDefault(str2, new LinkedHashSet());
            set.add((LeadsUser) Optional.ofNullable(leadsUser).orElse(new LeadsUser(User.justId(str))));
            f34200d.put(str2, set);
            return set;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public static /* synthetic */ boolean K0(User user) {
        R0(user);
        return true;
    }

    /* renamed from: L */
    public static boolean m37611L(String str) {
        final l1 l1Var = (l1) m37608I().orElse(null);
        if (l1Var == null) {
            return false;
        }
        return ((Boolean) l1Var.L8(str, l1Var.on()).m47686M(new rl7() { // from class: o.ioi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.i0(l1Var, (AccountMembership) obj);
            }
        }).h0().m55717M(new rl7() { // from class: o.joi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.j0((x6c) obj);
            }
        }).m55727f()).booleanValue();
    }

    public static /* synthetic */ boolean L0(User user) {
        R0(user);
        return true;
    }

    /* renamed from: M */
    public static Boolean m37612M() {
        if (!uni.gC()) {
            return (Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.gpi
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Prefs) obj).m3254p());
                }
            }).orElse(Boolean.FALSE);
        }
        try {
            return Boolean.valueOf(nt6.m41112f().m41118g());
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ void M0(String str, String str2, mii miiVar, String str3) {
        final UpdateAccountMembershipInput.Builder builder = UpdateAccountMembershipInput.builder();
        builder.id(str3);
        builder.signature((String) Optional.ofNullable(str).orElse(""));
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.epi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.accountEmail((String) obj);
            }
        });
        builder.updateAction(UpdateAccountMembershipAction.UPDATE_ROLE_DESIGNATION);
        miiVar.m39161k().li(builder.build()).m55727f();
    }

    /* renamed from: N */
    public static void m37613N() {
        f34199c = new ConcurrentHashMap();
        f34200d = new HashMap();
    }

    public static Boolean N0() {
        try {
            return Boolean.valueOf(nt6.m41112f().m41119h());
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: O */
    public static boolean m37614O(String str) {
        final l1 l1Var = (l1) m37608I().orElse(null);
        if (l1Var == null) {
            return false;
        }
        return ((Boolean) l1Var.L8(str, l1Var.on()).m47686M(new rl7() { // from class: o.yni
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.k0(l1Var, (AccountMembership) obj);
            }
        }).h0().m55717M(new rl7() { // from class: o.zni
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.l0((x6c) obj);
            }
        }).m55727f()).booleanValue();
    }

    public static mii O0(final String str) {
        final mii miiVar = (mii) uni.kC().ED().stream().filter(new Predicate() { // from class: o.poi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.x0(str, (mii) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.qoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return lpi.y0(str);
            }
        });
        l1 l1VarM39161k = miiVar.m39161k();
        AccountMembership accountMembership = (AccountMembership) miiVar.m39158h().orElse(null);
        if (accountMembership != null) {
            return (mii) l1VarM39161k.A3(accountMembership, UpdateAccountMembershipAction.REJECT_MEMBERSHIP).d0(new rl7() { // from class: o.soi
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return lpi.z0(miiVar, (Boolean) obj);
                }
            }).m55727f();
        }
        throw new RuntimeException(String.format("Couldn't find any membership with accountId %s", str));
    }

    /* renamed from: P */
    public static List m37615P() {
        return m37616Q("");
    }

    public static Boolean P0() {
        if (!uni.gC()) {
            return (Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.fpi
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Prefs) obj).p0());
                }
            }).orElse(Boolean.FALSE);
        }
        try {
            return Boolean.valueOf(nt6.m41112f().m41124p());
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: Q */
    public static List m37616Q(final String str) {
        List listM22693j = daa.m22693j();
        return StringUtils.isBlank(str) ? listM22693j : (List) listM22693j.stream().filter(new Predicate() { // from class: o.jpi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.m0(str, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList());
    }

    public static Boolean Q0(String str, final String str2, final String str3) {
        final l1 l1Var = (l1) m37608I().orElse(null);
        return l1Var == null ? Boolean.FALSE : (Boolean) l1Var.L8(str, l1Var.on()).m47686M(new rl7() { // from class: o.koi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return new mii((AccountMembership) obj);
            }
        }).m47686M(new rl7() { // from class: o.loi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.A0(str2, str3, l1Var, (mii) obj);
            }
        }).h0().m55717M(new rl7() { // from class: o.moi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return lpi.B0((x6c) obj);
            }
        }).m55727f();
    }

    /* renamed from: R */
    public static List m37617R() {
        return m37618S("");
    }

    public static void R0(final User user) {
        f34199c.values().stream().flatMap(new Function() { // from class: o.kpi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Set) obj).stream();
            }
        }).filter(new Predicate() { // from class: o.wni
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.C0(user, (LeadsUser) obj);
            }
        }).forEach(new Consumer() { // from class: o.xni
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                lpi.H0(user, (LeadsUser) obj);
            }
        });
    }

    /* renamed from: S */
    public static List m37618S(final String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m37623X());
        arrayList.addAll(m37624Y());
        return StringUtils.isBlank(str) ? arrayList : (List) arrayList.stream().filter(new Predicate() { // from class: o.ipi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.n0(str, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList());
    }

    public static mii S0(final String str, String str2, String str3, String str4, final String str5, final String str6) {
        final mii miiVar = (mii) uni.kC().ED().stream().filter(new Predicate() { // from class: o.yoi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.I0(str, (mii) obj);
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: o.zoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return lpi.J0(str);
            }
        });
        if (!Objects.equals(miiVar.m39160j(), str2) && f34198b.booleanValue()) {
            if (!miiVar.m39175y()) {
                throw new RuntimeException("Only admin can change the account name");
            }
            miiVar.m39161k().q6(UpdateAccountInput.builder().id(str).accountName(str2).build()).m55727f();
        }
        if (!Objects.equals(miiVar.m39166p(), str3)) {
            UpdateUserInput.Builder builderName = UpdateUserInput.builder().id(miiVar.m39171u().getId()).name(str3);
            if (!StringUtils.isBlank(str4)) {
                builderName.profilePictureUrl(str4);
            }
            miiVar.m39161k().cj(builderName.build()).m55714J(new ggd() { // from class: o.api
                @Override // p001o.ggd
                public final boolean test(Object obj) {
                    return lpi.K0((User) obj);
                }
            }).m55727f();
        }
        if (!Objects.equals(miiVar.m39168r(), str4)) {
            UpdateUserInput.Builder builderId = UpdateUserInput.builder().id(miiVar.m39171u().getId());
            if (!StringUtils.isBlank(str4)) {
                builderId.profilePictureUrl(str4);
            }
            miiVar.m39161k().cj(builderId.build()).m55714J(new ggd() { // from class: o.bpi
                @Override // p001o.ggd
                public final boolean test(Object obj) {
                    return lpi.L0((User) obj);
                }
            }).m55727f();
        }
        if (!Objects.equals(miiVar.m39170t(), str5) || !Objects.equals(miiVar.m39157g(), str6)) {
            miiVar.m39159i().ifPresent(new Consumer() { // from class: o.dpi
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    lpi.M0(str5, str6, miiVar, (String) obj);
                }
            });
        }
        return miiVar.m39150H();
    }

    /* renamed from: T */
    public static Collection m37619T() {
        try {
            String str = (String) m37608I().map(new ff()).orElse(null);
            if (StringUtils.isBlank(str)) {
                return Collections.emptySet();
            }
            Set set = (Set) f34199c.get(str);
            return (set == null || set.isEmpty()) ? (Set) f34199c.computeIfAbsent(str, new Function() { // from class: o.hpi
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lpi.q0((String) obj);
                }
            }) : set;
        } catch (Exception unused) {
            return Collections.emptySet();
        }
    }

    /* renamed from: U */
    public static List m37620U(final String str) {
        ArrayList arrayList = new ArrayList(m37619T());
        return StringUtils.isBlank(str) ? arrayList : (List) arrayList.stream().filter(new Predicate() { // from class: o.vni
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.r0(str, (LeadsUser) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: V */
    public static List m37621V(String str) {
        Collection collectionM37619T = StringUtils.isBlank(str.trim()) ? m37619T() : m37620U(str);
        l1 l1Var = (l1) m37608I().orElse(null);
        if (l1Var == null) {
            return Collections.emptyList();
        }
        oe.m42102g(l1Var);
        return (List) collectionM37619T.stream().map(new Function() { // from class: o.noi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lpi.s0((LeadsUser) obj);
            }
        }).sorted(Comparator.comparing(new Function() { // from class: o.ooi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lpi.t0((LeadsUser) obj);
            }
        }).reversed()).collect(Collectors.toList());
    }

    /* renamed from: W */
    public static Collection m37622W() {
        if (!uni.gC()) {
            return Collections.emptyList();
        }
        return (Collection) f34200d.getOrDefault((String) m37608I().map(new ff()).orElse(f34197a), new LinkedHashSet());
    }

    /* renamed from: X */
    public static List m37623X() {
        try {
            return (List) ((uni) uni.LB().m55729h()).TB().eh().stream().map(new caa()).collect(Collectors.toList());
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: Y */
    public static List m37624Y() {
        try {
            return (List) ((uni) uni.LB().m55729h()).TB().A9().stream().map(new caa()).collect(Collectors.toList());
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: Z */
    public static Optional m37625Z(String str) {
        return daa.m22694k(str);
    }

    public static LeadsUser a0(final String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }
        Collection collectionM37619T = m37619T();
        Optional optionalFindFirst = collectionM37619T.stream().filter(new Predicate() { // from class: o.goi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.u0(str, (LeadsUser) obj);
            }
        }).findFirst();
        if (optionalFindFirst.isPresent()) {
            return (LeadsUser) optionalFindFirst.get();
        }
        Optional optionalFindFirst2 = m37622W().stream().filter(new Predicate() { // from class: o.roi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lpi.v0(str, (LeadsUser) obj);
            }
        }).findFirst();
        if (optionalFindFirst2.isPresent()) {
            return (LeadsUser) optionalFindFirst2.get();
        }
        try {
            LeadsUser leadsUser = (LeadsUser) lw9.f0(str).m55727f();
            collectionM37619T.add(leadsUser);
            return leadsUser;
        } catch (Exception unused) {
            LeadsUser leadsUser2 = new LeadsUser(User.justId(str));
            m37610K(str, leadsUser2);
            return leadsUser2;
        }
    }

    public static List b0(String... strArr) {
        return (List) Arrays.stream(strArr).map(new Function() { // from class: o.cpi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lpi.a0((String) obj);
            }
        }).collect(Collectors.toList());
    }

    public static Boolean c0() {
        try {
            return nt6.m41112f().m41116d();
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    public static Boolean d0() {
        return (Boolean) Optional.ofNullable(uni.kC().SB()).map(new boi()).map(new Function() { // from class: o.coi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((l1) obj).ce();
            }
        }).orElse(Boolean.TRUE);
    }

    public static Boolean e0() {
        try {
            return nt6.m41112f().m41117e();
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ boolean f0(String str, mii miiVar) {
        return Objects.equals(str, miiVar.m39156f().getId());
    }

    public static /* synthetic */ RuntimeException g0(String str) {
        return new RuntimeException(String.format("Couldn't find any user profile with accountId %s", str));
    }

    public static /* synthetic */ mii h0(mii miiVar, Boolean bool) {
        if (bool.booleanValue()) {
            miiVar.m39150H();
        }
        return miiVar;
    }

    public static /* synthetic */ x6c i0(l1 l1Var, AccountMembership accountMembership) {
        if (Objects.equals(UserStatus.REQUESTED.name(), accountMembership.getUserAccountStatus().name())) {
            return l1Var.A3(accountMembership, UpdateAccountMembershipAction.APPROVE_MEMBERSHIP);
        }
        throw new RuntimeException("User is not awaiting approval for membership");
    }

    public static /* synthetic */ x8c j0(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ x6c k0(l1 l1Var, AccountMembership accountMembership) {
        if (Objects.equals(UserStatus.REQUESTED.name(), accountMembership.getUserAccountStatus().name())) {
            return l1Var.A3(accountMembership, UpdateAccountMembershipAction.DISAPPROVE_MEMBERSHIP);
        }
        throw new RuntimeException("User is not awaiting approval for membership");
    }

    public static /* synthetic */ x8c l0(x6c x6cVar) {
        return x6cVar;
    }

    public static /* synthetic */ boolean m0(String str, LeadsTeam leadsTeam) {
        String teamName = leadsTeam.getTeamName();
        Locale locale = Locale.ROOT;
        return teamName.toLowerCase(locale).contains(str.toLowerCase(locale));
    }

    public static /* synthetic */ boolean n0(String str, LeadsTeam leadsTeam) {
        String teamName = leadsTeam.getTeamName();
        Locale locale = Locale.ROOT;
        return teamName.toLowerCase(locale).contains(str.toLowerCase(locale));
    }

    public static /* synthetic */ LeadsUser o0(String str, User user) {
        return new LeadsUser(user, tji.f47295d.m50080a().m50078S(user.getId(), str), Optional.empty(), null);
    }

    public static /* synthetic */ Set p0(final String str) {
        return (Set) tji.f47295d.m50080a().m50077N(str).stream().map(new Function() { // from class: o.uoi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lpi.o0(str, (User) obj);
            }
        }).collect(Collectors.toSet());
    }

    public static /* synthetic */ Set q0(final String str) {
        return (Set) wtf.m55008m(new Callable() { // from class: o.aoi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lpi.p0(str);
            }
        }).m55025w(i5f.m31599c()).m55012d();
    }

    public static /* synthetic */ boolean r0(String str, LeadsUser leadsUser) {
        String name = leadsUser.getName();
        Locale locale = Locale.ROOT;
        return name.toLowerCase(locale).contains(str.toLowerCase(locale));
    }

    public static /* synthetic */ LeadsUser s0(LeadsUser leadsUser) {
        leadsUser.setAccountMemberActivity(oe.m42099d(leadsUser.getId()));
        return leadsUser;
    }

    public static /* synthetic */ Long t0(LeadsUser leadsUser) {
        return (Long) Optional.ofNullable(leadsUser.getLastActivityTime()).orElse(0L);
    }

    public static /* synthetic */ boolean u0(String str, LeadsUser leadsUser) {
        return Objects.equals(leadsUser.getId(), str);
    }

    public static /* synthetic */ boolean v0(String str, LeadsUser leadsUser) {
        return Objects.equals(leadsUser.getId(), str);
    }

    public static /* synthetic */ boolean x0(String str, mii miiVar) {
        return Objects.equals(str, miiVar.m39156f().getId());
    }

    public static /* synthetic */ RuntimeException y0(String str) {
        return new RuntimeException(String.format("Couldn't find any user profile with accountId %s", str));
    }

    public static /* synthetic */ mii z0(mii miiVar, Boolean bool) {
        if (bool.booleanValue()) {
            uni.kC().PD(miiVar);
        }
        return miiVar;
    }
}
