package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.util.Prefs;
import android.content.Context;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountStatus;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserAuthorization;
import com.amplifyframework.datastore.generated.model.UserStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class l1 implements me1, ni, bl, ql, wu0, qpi, bci, hdh, sch, sh4, ah4, rrd, qlc, olc, yoc, roc, kjc, bjc, pq, bj3, gf6, wjc, zmc, v25, gqc, wfb, xe, cee, cwc, qqc, kw5, xda, b98, g56, d7d, ow9, qx2, f8j, py6, s1d, e4f, kra, s5j, qh6, he3 {

    /* renamed from: f */
    public String f32966f;

    /* renamed from: g */
    public final String f32967g;

    /* renamed from: h */
    public hi9 f32968h;

    /* renamed from: i */
    public User f32969i;

    /* renamed from: j */
    public UserAuthorization f32970j;

    /* renamed from: k */
    public lyi f32971k;

    /* renamed from: l */
    public Context f32972l;

    /* renamed from: m */
    public AtomicBoolean f32973m = new AtomicBoolean(false);

    /* renamed from: n */
    public qif f32974n = qif.m45520F();

    /* renamed from: o */
    public od3 f32975o;

    /* renamed from: p */
    public hi9 f32976p;

    /* renamed from: o.l1$a */
    public static /* synthetic */ class C14958a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32977a;

        static {
            int[] iArr = new int[TeamRole.values().length];
            f32977a = iArr;
            try {
                iArr[TeamRole.TEAM_LEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32977a[TeamRole.SUPERBOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32977a[TeamRole.REPORTEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l1(AccountMembership accountMembership, final Account account, User user) {
        final SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Objects.requireNonNull(c0044a);
        this.f32976p = hi9.m30634e(new Supplier() { // from class: o.b0
            @Override // java.util.function.Supplier
            public final Object get() {
                return c0044a.m127c();
            }
        });
        this.f32966f = account.getId();
        String id = user.getId();
        this.f32967g = id;
        this.f32968h = hi9.m30634e(new Supplier() { // from class: o.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return l1.PB(account);
            }
        });
        this.f32969i = user;
        UserAuthorization userAuthorizationBuild = UserAuthorization.builder().userId(id).userRegistrationStatus(user.getUserRegistrationStatus()).accountType(account.getAccountType()).accountStatus(account.getAccountStatus()).userAccountStatus(accountMembership.getUserAccountStatus()).authorizationLevel(accountMembership.getAuthorizationLevel()).account(Account.justId(this.f32966f)).build();
        this.f32970j = userAuthorizationBuild;
        this.f32971k = new lyi(userAuthorizationBuild);
        lB();
    }

    public static /* synthetic */ boolean AB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String BB(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object CB(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean DB(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean EB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String FB(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object GB(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean HB(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ String IB(List list, List list2, List list3) {
        Iterator it = list3.iterator();
        String teamId = "";
        String teamId2 = "";
        while (it.hasNext()) {
            TeamMember teamMember = (TeamMember) it.next();
            int i = C14958a.f32977a[teamMember.getTeamRole().ordinal()];
            if (i == 1 || i == 2) {
                list.add(teamMember.getTeam());
                if (StringUtils.isBlank(teamId)) {
                    teamId = teamMember.getTeamId();
                }
            } else {
                list2.add(teamMember.getTeam());
                if (StringUtils.isBlank(teamId2)) {
                    teamId2 = teamMember.getTeamId();
                }
            }
        }
        return StringUtils.isBlank(teamId) ? teamId2 : teamId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String JB(List list) {
        Iterator it = list.iterator();
        String teamId = "";
        String teamId2 = "";
        while (it.hasNext()) {
            TeamMember teamMember = (TeamMember) it.next();
            int i = C14958a.f32977a[teamMember.getTeamRole().ordinal()];
            if (i == 1 || i == 2) {
                this.f32971k.m38112c(teamMember.getTeam(), true);
                if (StringUtils.isBlank(teamId)) {
                    teamId = teamMember.getTeamId();
                }
            } else {
                this.f32971k.m38112c(teamMember.getTeam(), false);
                if (StringUtils.isBlank(teamId2)) {
                    teamId2 = teamMember.getTeamId();
                }
            }
        }
        if (StringUtils.isBlank(teamId)) {
            teamId = teamId2;
        }
        this.f32973m.set(true);
        return teamId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Account KB() {
        return fg(this.f32966f);
    }

    public static /* synthetic */ l1 LB(AccountMembership accountMembership) {
        return new l1(accountMembership, accountMembership.getAccount(), accountMembership.getUser());
    }

    public static /* synthetic */ RuntimeException MB() {
        return new RuntimeException("Not able to create API Service due to missing membership");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean OB() {
        return (Boolean) this.f32974n.get(4L, TimeUnit.SECONDS);
    }

    public static /* synthetic */ Account PB(Account account) {
        return account;
    }

    public static /* synthetic */ boolean QB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String RB(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object SB(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean TB(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ Account UB(Account account) {
        return account;
    }

    public static /* synthetic */ boolean VB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String WB(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object XB(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean YB(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean ZB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String aC(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object bC(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean cC(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean dC(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String eC(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object fC(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean gC(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean hC(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String iC(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object jC(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean kC(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lC(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TeamMember teamMember = (TeamMember) it.next();
            int i = C14958a.f32977a[teamMember.getTeamRole().ordinal()];
            if (i == 1 || i == 2) {
                this.f32971k.m38112c(teamMember.getTeam(), true);
            } else {
                this.f32971k.m38112c(teamMember.getTeam(), false);
            }
        }
        this.f32974n.mo43035B(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mC(Throwable th) {
        this.f32974n.mo43035B(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nC() {
        String.format("View preference initialization completed for account", new Object[0]);
    }

    public static /* synthetic */ Account oC(Account account) {
        return account;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pC(Throwable th) {
    }

    public static synchronized l1 tB(AccountMembership accountMembership, Account account, User user) {
        return new l1(accountMembership, account, user);
    }

    public static synchronized l1 uB(String str, String str2) {
        new u91(str, str2);
        try {
        } catch (Exception unused) {
            return new l1(str, str2);
        }
        return (l1) tji.f47295d.m50080a().m50078S(str2, str).map(new Function() { // from class: o.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.LB((AccountMembership) obj);
            }
        }).orElseThrow(new Supplier() { // from class: o.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                return l1.MB();
            }
        });
    }

    public static /* synthetic */ boolean wB(List list) {
        return list.size() > 0;
    }

    public static /* synthetic */ String xB(List list) {
        return (String) list.get(0);
    }

    public static /* synthetic */ Object yB(String str, Boolean bool, Map map) {
        return map.getOrDefault(str, bool);
    }

    public static /* synthetic */ boolean zB(String str) {
        return !StringUtils.isBlank(str);
    }

    @Override // p001o.me1
    public List A9() {
        return Collections.unmodifiableList(this.f32971k.m38116h());
    }

    public Boolean AC() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.m0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.hC((List) obj);
            }
        }).map(new Function() { // from class: o.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.iC((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("save-whatsapp-open-as-calllog", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.FALSE;
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.jC(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.p0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.kC((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public void BC() {
        String.format("updateTeamMembershipInViewPreferences : %s: %s", this.f32967g, this.f32966f);
        Qp(this.f32967g, this.f32966f).h0(i5f.m31599c()).y0(i5f.m31599c()).w0(new gu3() { // from class: o.o
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f37492a.lC((List) obj);
            }
        }, new gu3() { // from class: o.p
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f39124a.mC((Throwable) obj);
            }
        }, new jm() { // from class: o.q
            @Override // p001o.jm
            public final void run() {
                this.f41014a.nC();
            }
        });
    }

    public Boolean CC() {
        zf(this.f32966f).v0(new gu3() { // from class: o.h0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f26034a.DC((Account) obj);
            }
        }, new gu3() { // from class: o.s0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f44348a.pC((Throwable) obj);
            }
        });
        return Boolean.TRUE;
    }

    public Boolean DC(final Account account) {
        if (Objects.equals(account.getId(), this.f32966f)) {
            this.f32968h = hi9.m30634e(new Supplier() { // from class: o.g0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return l1.oC(account);
                }
            });
            uni.kC().SB().m39152J(account);
        }
        return Boolean.TRUE;
    }

    public s47 EC(String str) {
        Optional optionalM28449f = gci.f24985b.m28455a().m28449f(str);
        return (optionalM28449f == null || !optionalM28449f.isPresent()) ? s47.m47668C() : (s47) optionalM28449f.map(new Function() { // from class: o.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s47.m47673L((User) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.n
            @Override // java.util.function.Supplier
            public final Object get() {
                return s47.m47668C();
            }
        });
    }

    @Override // p001o.me1
    public String Eo() {
        return this.f32967g;
    }

    @Override // p001o.me1
    public List eh() {
        return Collections.unmodifiableList(this.f32971k.m38115g());
    }

    @Override // p001o.h68
    public Optional getContext() {
        return Optional.ofNullable(this.f32972l);
    }

    public Boolean iB() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.s
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.wB((List) obj);
            }
        }).map(new Function() { // from class: o.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.xB((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("assign-member", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.TRUE;
        if (this.f32970j.getAuthorizationLevel() == AuthorizationLevel.MEMBER) {
            bool = Boolean.FALSE;
        }
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.yB(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.v
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.zB((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    @Override // p001o.ja8
    public x6c isAccountSubscriptionActive() {
        return x6c.c0(Boolean.TRUE);
    }

    public Boolean jB() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.v0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.AB((List) obj);
            }
        }).map(new Function() { // from class: o.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.BB((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("delete-lead", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.TRUE;
        this.f32970j.getAuthorizationLevel();
        AuthorizationLevel authorizationLevel = AuthorizationLevel.SUPERADMIN;
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.CB(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.y0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.DB((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public Boolean kB() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.x
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.EB((List) obj);
            }
        }).map(new Function() { // from class: o.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.FB((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("user-directory", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.FALSE;
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.GB(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.a0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.HB((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public od3 lB() {
        if (Objects.isNull(this.f32975o)) {
            this.f32975o = new od3(this);
        }
        return this.f32975o;
    }

    public Account mB() {
        return (Account) this.f32968h.get();
    }

    @Override // p001o.me1
    public x6c mz(String str) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        return Qp(str, this.f32966f).d0(new rl7() { // from class: o.f1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return l1.IB(arrayList, arrayList2, (List) obj);
            }
        });
    }

    public User nB() {
        return this.f32969i;
    }

    public UserAuthorization oB() {
        return this.f32970j;
    }

    @Override // p001o.me1
    public String on() {
        return this.f32966f;
    }

    public lyi pB() {
        return this.f32971k;
    }

    public final void qB() {
        this.f32968h = hi9.m30634e(new Supplier() { // from class: o.d0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f18912a.KB();
            }
        });
    }

    public void qC() {
        BC();
    }

    public final void rB() {
        this.f32969i = (User) gci.f24985b.m28455a().m28449f(this.f32967g).orElse(null);
    }

    public Boolean rC() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.q0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.QB((List) obj);
            }
        }).map(new Function() { // from class: o.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.RB((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("only-camera-allowed", Collections.emptyMap());
        final Boolean bool = Boolean.FALSE;
        final String str = "everyone";
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.SB(str, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.u0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.TB((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public final void sB() {
        UserAuthorization userAuthorizationBuild = isDummyAccount(this.f32966f).booleanValue() ? UserAuthorization.builder().userId(this.f32967g).userRegistrationStatus(this.f32969i.getUserRegistrationStatus()).accountType(AccountType.INDIVIDUAL).accountStatus(AccountStatus.ACTIVE).userAccountStatus(UserStatus.ACTIVE).authorizationLevel(AuthorizationLevel.MEMBER).account(Account.justId(this.f32966f)).build() : Mh(this.f32966f, this.f32967g);
        this.f32970j = userAuthorizationBuild;
        this.f32971k = new lyi((AuthorizationLevel) Optional.ofNullable(userAuthorizationBuild).map(new Function() { // from class: o.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UserAuthorization) obj).getAuthorizationLevel();
            }
        }).orElse(AuthorizationLevel.MEMBER));
    }

    public PropertyDefinitionRepository sC() {
        return PropertyDefinitionRepository.o0();
    }

    public boolean tC(final Account account) {
        this.f32968h = hi9.m30634e(new Supplier() { // from class: o.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                return l1.UB(account);
            }
        });
        return true;
    }

    @Override // p001o.me1
    public x6c tn() {
        String strZz = zz();
        return (!StringUtils.isBlank(strZz) || this.f32973m.get()) ? x6c.c0((String) Optional.ofNullable(strZz).orElse("")) : Qp(this.f32967g, this.f32966f).d0(new rl7() { // from class: o.k1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f31352a.JB((List) obj);
            }
        });
    }

    public void uC() {
        qB();
        rB();
        sB();
        qC();
    }

    public Boolean vB() {
        return (Boolean) ayh.H1(new C14946l(this)).B2(new Supplier() { // from class: o.w
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.FALSE;
            }
        });
    }

    public void vC() {
        AutoCallConfig.Companion.resetInstance();
    }

    public void wC(Context context) {
        this.f32972l = context;
    }

    @Override // p001o.me1
    public Prefs wa() {
        return (Prefs) this.f32976p.m51981Q();
    }

    public Boolean xC() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.d1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.VB((List) obj);
            }
        }).map(new Function() { // from class: o.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.WB((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("disable-track-all-call-feature", Collections.emptyMap());
        final Boolean bool = Boolean.FALSE;
        final String str = "everyone";
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.XB(str, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.i1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.YB((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public Boolean yC() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.i0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.ZB((List) obj);
            }
        }).map(new Function() { // from class: o.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.aC((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("hide-closed-leads", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.FALSE;
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.bC(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.l0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.cC((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public Boolean zC() {
        Map map = (Map) ((Map) sf((String) Optional.ofNullable(mB().getPermissions()).filter(new Predicate() { // from class: o.z0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.dC((List) obj);
            }
        }).map(new Function() { // from class: o.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.eC((List) obj);
            }
        }).orElse("{}"), Map.class)).getOrDefault("hide-lead-sources", Collections.emptyMap());
        final String lowerCase = this.f32970j.getAuthorizationLevel().name().toLowerCase();
        final Boolean bool = Boolean.FALSE;
        this.f32970j.getAuthorizationLevel();
        AuthorizationLevel authorizationLevel = AuthorizationLevel.SUPERADMIN;
        return (Boolean) Optional.ofNullable(map).map(new Function() { // from class: o.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1.fC(lowerCase, bool, (Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.c1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l1.gC((String) obj);
            }
        }).map(new j1()).orElse(bool);
    }

    public l1(String str, String str2) {
        final SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Objects.requireNonNull(c0044a);
        this.f32976p = hi9.m30634e(new Supplier() { // from class: o.b0
            @Override // java.util.function.Supplier
            public final Object get() {
                return c0044a.m127c();
            }
        });
        this.f32966f = str;
        this.f32967g = str2;
        uC();
    }
}
