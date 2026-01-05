package p001o;

import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.ActivityType;
import type.SearchableActivityFilterInput;
import type.SearchableActivitySortInput;
import type.SearchableActivitySortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public class lv {

    /* renamed from: g */
    public static Map f34405g = new ConcurrentHashMap();

    /* renamed from: a */
    public mv f34406a;

    /* renamed from: b */
    public Optional f34407b = Optional.empty();

    /* renamed from: c */
    public Optional f34408c = Optional.empty();

    /* renamed from: d */
    public Optional f34409d = Optional.empty();

    /* renamed from: e */
    public Optional f34410e = Optional.of(new no());

    /* renamed from: f */
    public Optional f34411f = Optional.of(new vt());

    /* renamed from: o.lv$a */
    public static /* synthetic */ class C15157a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34412a;

        static {
            int[] iArr = new int[mv.values().length];
            f34412a = iArr;
            try {
                iArr[mv.MY_TEAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34412a[mv.ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34412a[mv.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lv(mv mvVar) {
        this.f34406a = mvVar;
    }

    /* renamed from: E */
    public static /* synthetic */ SearchableActivityFilterInput m37927E(String str) {
        return SearchableActivityFilterInput.builder().ownerId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ SearchableActivityFilterInput m37928F(String str, String str2, no noVar) {
        List<SearchableActivityFilterInput> list = (List) noVar.m24027b().stream().map(new Function() { // from class: o.yu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37929G((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableActivityFilterInput> list2 = (List) noVar.m24029d().stream().map(new Function() { // from class: o.zu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37930H((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableActivityFilterInput> list3 = (List) noVar.m24030e().stream().map(new Function() { // from class: o.av
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37927E((String) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            arrayList.add(m37973t(str, str2).or(list).build());
        }
        if (list2.size() > 0) {
            arrayList.add(m37973t(str, str2).or(list2).build());
        }
        if (list3.size() > 0) {
            arrayList.add(m37973t(str, str2).or(list3).build());
        }
        if (arrayList.size() > 0) {
            return m37973t(str, str2).and(arrayList).build();
        }
        return null;
    }

    /* renamed from: G */
    public static /* synthetic */ SearchableActivityFilterInput m37929G(String str) {
        return SearchableActivityFilterInput.builder().contactId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: H */
    public static /* synthetic */ SearchableActivityFilterInput m37930H(String str) {
        return SearchableActivityFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: I */
    public static /* synthetic */ Optional m37931I(Optional optional) {
        return optional;
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m37933K(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: L */
    public static /* synthetic */ SearchableActivityFilterInput m37934L(String str, String str2) {
        return SearchableActivityFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).primaryTeamId(SearchableIDFilterInput.builder().eq(str2).build()).build();
    }

    /* renamed from: M */
    public static /* synthetic */ List m37935M(final String str, List list) {
        return (List) list.stream().map(new tu()).filter(new Predicate() { // from class: o.bv
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lv.m37933K((String) obj);
            }
        }).map(new Function() { // from class: o.cv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37934L(str, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m37936N(List list) {
        return !list.isEmpty();
    }

    /* renamed from: P */
    public static /* synthetic */ SearchableActivitySortInput m37938P(ryh ryhVar) {
        return SearchableActivitySortInput.builder().field(SearchableActivitySortableFields.valueOf((String) ryhVar.f44265a)).direction((SearchableSortDirection) ryhVar.f44266b).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m37939Q(String str, String str2, List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list.add(no.m40814k(m37973t(str, str2), (ActivityType) it.next()).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m37940R(final String str, final String str2, final List list, no noVar) {
        noVar.m40816m().ifPresent(new Consumer() { // from class: o.nu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f37305a.m37939Q(str, str2, list, (List) obj);
            }
        });
    }

    /* renamed from: S */
    public static /* synthetic */ SearchableActivityFilterInput m37941S(Optional optional, SearchableActivityFilterInput searchableActivityFilterInput) {
        return SearchableActivityFilterInput.builder().and(Arrays.asList((SearchableActivityFilterInput) optional.get(), searchableActivityFilterInput)).build();
    }

    /* renamed from: T */
    public static /* synthetic */ SearchableActivityFilterInput m37942T(SearchableActivityFilterInput searchableActivityFilterInput, final Optional optional, SearchableActivityFilterInput searchableActivityFilterInput2) {
        return (SearchableActivityFilterInput) Optional.ofNullable(searchableActivityFilterInput).map(new Function() { // from class: o.pu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37941S(optional, (SearchableActivityFilterInput) obj);
            }
        }).orElse((SearchableActivityFilterInput) optional.get());
    }

    /* renamed from: U */
    public static /* synthetic */ SearchableActivityFilterInput m37943U(SearchableActivityFilterInput searchableActivityFilterInput, SearchableActivityFilterInput searchableActivityFilterInput2) {
        return SearchableActivityFilterInput.builder().and(Arrays.asList(searchableActivityFilterInput, searchableActivityFilterInput2)).build();
    }

    /* renamed from: V */
    public static /* synthetic */ lv m37944V(String str) {
        return m37946X(mv.fromActivityOption(str));
    }

    /* renamed from: W */
    public static lv m37945W(String str) {
        return (lv) Optional.ofNullable(str).map(new Function() { // from class: o.dv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37944V((String) obj);
            }
        }).orElse(m37946X(mv.ME));
    }

    /* renamed from: X */
    public static synchronized lv m37946X(mv mvVar) {
        if (!f34405g.containsKey(mvVar)) {
            f34405g.put(mvVar, new lv(mvVar));
        }
        return (lv) f34405g.get(mvVar);
    }

    /* renamed from: v */
    public static synchronized void m37965v() {
        f34405g.values().forEach(new Consumer() { // from class: o.ev
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((lv) obj).m37970Y();
            }
        });
    }

    /* renamed from: A */
    public Optional m37966A() {
        return this.f34407b;
    }

    /* renamed from: B */
    public Optional m37967B() {
        return this.f34411f;
    }

    /* renamed from: C */
    public boolean m37968C() {
        Optional map = this.f34410e.map(new Function() { // from class: o.mu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((no) obj).mo24031f());
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) this.f34411f.map(new Function() { // from class: o.xu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((vt) obj).m34796b());
            }
        }).orElse(bool)).booleanValue();
    }

    /* renamed from: D */
    public boolean m37969D() {
        return !this.f34409d.isPresent() && m37968C();
    }

    /* renamed from: Y */
    public void m37970Y() {
        this.f34407b = Optional.empty();
        this.f34408c = Optional.empty();
        this.f34409d = Optional.empty();
        this.f34410e = Optional.empty();
        this.f34411f = Optional.empty();
    }

    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final SearchableActivityFilterInput m37937O(String str, String str2, String str3) {
        String[] strArrSplit = str3.split("[\\s,]+");
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArrSplit) {
            arrayList.add(m37973t(str, str2).body(SearchableStringFilterInput.builder().matchPhrasePrefix(str4).build()).build());
        }
        return m37973t(str, str2).and(arrayList).build();
    }

    public void a0(no noVar) {
        this.f34410e = Optional.ofNullable(noVar);
    }

    public void b0(List list) {
        this.f34408c = Optional.ofNullable(list);
    }

    public void c0(String str) {
        if (StringUtils.isBlank(str)) {
            this.f34409d = Optional.empty();
        } else {
            this.f34409d = Optional.ofNullable(str);
        }
    }

    public void d0(Team team) {
        this.f34407b = Optional.ofNullable(team);
    }

    public void e0(vt vtVar) {
        this.f34411f = Optional.ofNullable(vtVar);
    }

    /* renamed from: s */
    public final Optional m37972s(final String str, final String str2) {
        return m37976x().map(new Function() { // from class: o.ou
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f38932a.m37928F(str, str2, (no) obj);
            }
        });
    }

    /* renamed from: t */
    public final SearchableActivityFilterInput.Builder m37973t(String str, String str2) {
        final SearchableActivityFilterInput.Builder builderAccountId = SearchableActivityFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        SearchableActivityFilterInput.Builder builder = (SearchableActivityFilterInput.Builder) this.f34410e.map(new Function() { // from class: o.qu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((no) obj).m24026a();
            }
        }).flatMap(new Function() { // from class: o.ru
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37931I((Optional) obj);
            }
        }).map(new Function() { // from class: o.su
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return no.m40813j(builderAccountId, (tz4) obj);
            }
        }).orElse(builderAccountId);
        int i = C15157a.f34412a[m37977y().ordinal()];
        return i != 1 ? i != 2 ? builder : builder.ownerId(SearchableIDFilterInput.builder().eq(str2).build()) : m37974u(str, str2);
    }

    /* renamed from: u */
    public final SearchableActivityFilterInput.Builder m37974u(final String str, String str2) {
        String strTrim = ((String) m37966A().map(new tu()).orElse("")).trim();
        final SearchableActivityFilterInput.Builder builderAccountId = SearchableActivityFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        if (!strTrim.equalsIgnoreCase("ALL") && !StringUtils.isBlank(strTrim)) {
            return builderAccountId.primaryTeamId(SearchableIDFilterInput.builder().eq(strTrim).build());
        }
        Optional optionalFilter = this.f34408c.map(new Function() { // from class: o.uu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37935M(str, (List) obj);
            }
        }).filter(new Predicate() { // from class: o.vu
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lv.m37936N((List) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        return (SearchableActivityFilterInput.Builder) optionalFilter.map(new Function() { // from class: o.wu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builderAccountId.or((List) obj);
            }
        }).orElse(builderAccountId);
    }

    /* renamed from: w */
    public ryh m37975w(final String str, final String str2) {
        final ArrayList arrayList = new ArrayList();
        final Optional map = m37978z().map(new Function() { // from class: o.fv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f24112a.m37937O(str, str2, (String) obj);
            }
        });
        SearchableActivitySortInput searchableActivitySortInput = (SearchableActivitySortInput) m37967B().map(new Function() { // from class: o.gv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((vt) obj).m53392e();
            }
        }).flatMap(Function.identity()).map(new Function() { // from class: o.hv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37938P((ryh) obj);
            }
        }).orElse(null);
        m37976x().ifPresent(new Consumer() { // from class: o.iv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f29251a.m37940R(str, str2, arrayList, (no) obj);
            }
        });
        final SearchableActivityFilterInput searchableActivityFilterInputBuild = arrayList.size() > 0 ? SearchableActivityFilterInput.builder().or(arrayList).build() : m37973t(str, str2).build();
        final SearchableActivityFilterInput searchableActivityFilterInput = (SearchableActivityFilterInput) map.map(new Function() { // from class: o.jv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37942T(searchableActivityFilterInputBuild, map, (SearchableActivityFilterInput) obj);
            }
        }).orElse(searchableActivityFilterInputBuild);
        return uyh.of((SearchableActivityFilterInput) m37972s(str, str2).map(new Function() { // from class: o.kv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lv.m37943U(searchableActivityFilterInput, (SearchableActivityFilterInput) obj);
            }
        }).orElse(searchableActivityFilterInput), searchableActivitySortInput);
    }

    /* renamed from: x */
    public Optional m37976x() {
        return this.f34410e;
    }

    /* renamed from: y */
    public mv m37977y() {
        return this.f34406a;
    }

    /* renamed from: z */
    public Optional m37978z() {
        return this.f34409d;
    }
}
