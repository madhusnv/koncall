package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.LeadFilter;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.GsonFactory;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class g0i {

    /* renamed from: a */
    public Gson f24369a = GsonFactory.instance();

    /* renamed from: b */
    public Map f24370b;

    /* renamed from: c */
    public String f24371c;

    /* renamed from: d */
    public String f24372d;

    /* renamed from: e */
    public static Map f24347e = new HashMap();

    /* renamed from: f */
    public static String f24348f = "my.comments.last.seen";

    /* renamed from: g */
    public static String f24349g = "all.leads.last.seen";

    /* renamed from: h */
    public static String f24350h = "all.leads.last.seen";

    /* renamed from: i */
    public static String f24351i = "my.leads.last.seen";

    /* renamed from: j */
    public static String f24352j = "team.leads.last.seen";

    /* renamed from: k */
    public static String f24353k = "all.activities.last.seen";

    /* renamed from: l */
    public static String f24354l = "my.activities.last.seen";

    /* renamed from: m */
    public static String f24355m = "team.activities.last.seen";

    /* renamed from: n */
    public static String f24356n = "my.leads.attention.last.seen";

    /* renamed from: o */
    public static String f24357o = "all.leads.attention.last.seen";

    /* renamed from: p */
    public static String f24358p = "my.prospecting.leads.attention.last.seen";

    /* renamed from: q */
    public static String f24359q = "all.prospecting.leads.attention.last.seen";

    /* renamed from: r */
    public static String f24360r = "my.new.leads.attention.last.seen";

    /* renamed from: s */
    public static String f24361s = "all.new.leads.attention.last.seen";

    /* renamed from: t */
    public static String f24362t = "my.followup.last.seen";

    /* renamed from: u */
    public static String f24363u = "all.followup.last.seen";

    /* renamed from: v */
    public static String f24364v = "my.deals.last.seen";

    /* renamed from: w */
    public static String f24365w = "all.deals.last.seen";

    /* renamed from: x */
    public static String f24366x = "all.unassigned.leads.last.seen";

    /* renamed from: y */
    public static String f24367y = "all.overdue.tasks.last.seen";

    /* renamed from: z */
    public static String f24368z = "my.overdue.tasks.last.seen";

    /* renamed from: A */
    public static String f24340A = "my.unassigned.tasks.last.seen";

    /* renamed from: B */
    public static String f24341B = "all.unassigned.tasks.last.seen";

    /* renamed from: C */
    public static String f24342C = "my.unreturned.calls.last.seen";

    /* renamed from: D */
    public static String f24343D = "my.missed.visits.last.seen";

    /* renamed from: E */
    public static String f24344E = "all.missed.visits.last.seen";

    /* renamed from: F */
    public static String f24345F = "all.dashboard.prospecting.lead.filter";

    /* renamed from: G */
    public static String f24346G = "all.dashboard.new.lead.filter";

    /* renamed from: o.g0i$a */
    public static /* synthetic */ class C13596a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24373a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f24374b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f24375c;

        static {
            int[] iArr = new int[pt4.values().length];
            f24375c = iArr;
            try {
                iArr[pt4.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24375c[pt4.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24375c[pt4.MY_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[mv.values().length];
            f24374b = iArr2;
            try {
                iArr2[mv.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24374b[mv.MY_TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24374b[mv.ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[wx9.values().length];
            f24373a = iArr3;
            try {
                iArr3[wx9.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24373a[wx9.MY_TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24373a[wx9.ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g0i(String str, String str2) {
        this.f24370b = new HashMap();
        this.f24370b = (Map) this.f24369a.fromJson(SuperfoneApplication.f225c.m127c().u0(str, str2), Map.class);
        this.f24371c = str;
        this.f24372d = str2;
    }

    /* renamed from: I */
    public static /* synthetic */ String m27848I(pt4 pt4Var, String str, String str2) {
        return String.format("%s.%s.%s", pt4Var.name(), str, str2);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m27849J(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m27850K(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: h */
    public static synchronized g0i m27854h(String str, String str2) {
        String str3;
        str3 = str + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str2;
        if (!f24347e.containsKey(str3)) {
            f24347e.put(str3, new g0i(str, str2));
        }
        return (g0i) f24347e.get(str3);
    }

    /* renamed from: A */
    public Long m27855A() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24343D, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: B */
    public Long m27856B() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24360r, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: C */
    public Long m27857C() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24358p, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: D */
    public Long m27858D() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24368z, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: E */
    public Long m27859E() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24340A, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: F */
    public Long m27860F() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24342C, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: G */
    public Long m27861G() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24355m, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: H */
    public Long m27862H() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24352j, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: L */
    public void m27863L(String str, pt4 pt4Var, String str2, int i) {
        String strM27878d = m27878d(str, pt4Var, str2);
        try {
            this.f24370b.put(strM27878d, String.valueOf(i));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
            String.format("Couldn't persist home progress count for %s", strM27878d);
        }
    }

    /* renamed from: M */
    public void m27864M(LeadFilter leadFilter) {
        try {
            this.f24370b.put(f24346G, LeadFilter.Companion.toJson(leadFilter));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: N */
    public void m27865N(LeadFilter leadFilter) {
        try {
            this.f24370b.put(f24345F, LeadFilter.Companion.toJson(leadFilter));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: O */
    public void m27866O(mv mvVar) {
        int i = C13596a.f24374b[mvVar.ordinal()];
        if (i == 1) {
            m27867P();
            return;
        }
        if (i == 2) {
            m0();
        } else if (i != 3) {
            m27867P();
        } else {
            c0();
        }
    }

    /* renamed from: P */
    public void m27867P() {
        try {
            this.f24370b.put(f24353k, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Q */
    public void m27868Q() {
        try {
            this.f24370b.put(f24350h, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: R */
    public void m27869R() {
        try {
            this.f24370b.put(f24365w, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: S */
    public void m27870S() {
        try {
            this.f24370b.put(f24357o, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: T */
    public void m27871T() {
        try {
            this.f24370b.put(f24349g, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: U */
    public void m27872U() {
        try {
            this.f24370b.put(f24344E, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: V */
    public void m27873V() {
        try {
            this.f24370b.put(f24361s, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: W */
    public void m27874W() {
        try {
            this.f24370b.put(f24359q, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: X */
    public void m27875X() {
        try {
            this.f24370b.put(f24367y, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Y */
    public void m27876Y() {
        try {
            this.f24370b.put(f24366x, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Z */
    public void m27877Z() {
        try {
            this.f24370b.put(f24341B, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    public void a0() {
        try {
            this.f24370b.put(f24348f, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    public void b0(wx9 wx9Var) {
        int i = C13596a.f24373a[wx9Var.ordinal()];
        if (i == 1) {
            m27871T();
            return;
        }
        if (i == 2) {
            n0();
        } else if (i != 3) {
            m27871T();
        } else {
            f0();
        }
    }

    public void c0() {
        try {
            this.f24370b.put(f24354l, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final String m27878d(final String str, final pt4 pt4Var, String str2) {
        String str3 = String.format("%s.%s", pt4Var.name(), str);
        return C13596a.f24375c[pt4Var.ordinal()] != 3 ? str3 : (String) Optional.ofNullable(str2).map(new Function() { // from class: o.f0i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0i.m27848I(pt4Var, str, (String) obj);
            }
        }).orElse(str3);
    }

    public void d0() {
        try {
            this.f24370b.put(f24364v, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public Integer m27879e(String str, pt4 pt4Var, String str2) {
        try {
            return Integer.valueOf(Integer.parseInt((String) this.f24370b.getOrDefault(m27878d(str, pt4Var, str2), "0")));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void e0() {
        try {
            this.f24370b.put(f24356n, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public LeadFilter m27880f() {
        try {
            Optional optionalFilter = Optional.ofNullable((String) this.f24370b.getOrDefault(f24346G, null)).filter(new Predicate() { // from class: o.e0i
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return g0i.m27849J((String) obj);
                }
            });
            LeadFilter.Companion companion = LeadFilter.Companion;
            Objects.requireNonNull(companion);
            return (LeadFilter) optionalFilter.map(new c0i(companion)).orElseGet(new d0i());
        } catch (Throwable unused) {
            return new LeadFilter();
        }
    }

    public void f0() {
        try {
            this.f24370b.put(f24351i, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public LeadFilter m27881g() {
        try {
            Optional optionalFilter = Optional.ofNullable((String) this.f24370b.getOrDefault(f24345F, null)).filter(new Predicate() { // from class: o.b0i
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return g0i.m27850K((String) obj);
                }
            });
            LeadFilter.Companion companion = LeadFilter.Companion;
            Objects.requireNonNull(companion);
            return (LeadFilter) optionalFilter.map(new c0i(companion)).orElseGet(new d0i());
        } catch (Throwable unused) {
            return new LeadFilter();
        }
    }

    public void g0() {
        try {
            this.f24370b.put(f24343D, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    public void h0() {
        try {
            this.f24370b.put(f24360r, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    public Long m27882i(mv mvVar) {
        int i = C13596a.f24374b[mvVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? m27883j() : m27896w() : m27861G() : m27883j();
    }

    public void i0() {
        try {
            this.f24370b.put(f24358p, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public Long m27883j() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24353k, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    public void j0() {
        try {
            this.f24370b.put(f24368z, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    public Long m27884k() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 86400000);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24350h, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    public void k0() {
        try {
            this.f24370b.put(f24340A, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public Long m27885l() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24365w, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    public void l0() {
        try {
            this.f24370b.put(f24342C, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public Long m27886m() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24357o, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    public void m0() {
        try {
            this.f24370b.put(f24355m, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public Long m27887n() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24349g, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    public void n0() {
        try {
            this.f24370b.put(f24352j, String.valueOf(Long.valueOf(System.currentTimeMillis())));
            SuperfoneApplication.f225c.m127c().X1(this.f24371c, this.f24372d, this.f24369a.toJson(this.f24370b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    public Long m27888o() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24344E, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: p */
    public Long m27889p() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24361s, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: q */
    public Long m27890q() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24359q, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: r */
    public Long m27891r() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24367y, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: s */
    public Long m27892s() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24366x, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: t */
    public Long m27893t() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24341B, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: u */
    public Long m27894u() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24348f, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: v */
    public Long m27895v(wx9 wx9Var) {
        int i = C13596a.f24373a[wx9Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? m27887n() : m27899z() : m27862H() : m27887n();
    }

    /* renamed from: w */
    public Long m27896w() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24354l, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: x */
    public Long m27897x() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24364v, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: y */
    public Long m27898y() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24356n, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }

    /* renamed from: z */
    public Long m27899z() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - 2592000000L);
        try {
            return Long.valueOf(Long.parseLong((String) this.f24370b.getOrDefault(f24351i, String.valueOf(lValueOf))));
        } catch (Throwable unused) {
            return lValueOf;
        }
    }
}
