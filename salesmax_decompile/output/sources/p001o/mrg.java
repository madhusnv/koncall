package p001o;

import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.Tasks;
import ai.salesmax.services.model.ActivityMetrics;
import android.util.Pair;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.VideoCallOutcome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import type.ContactAssignmentStatus;
import type.EngagementStatus;
import type.EngagementType;
import type.SearchableEngagementFilterInput;
import type.SearchableEngagementSortInput;
import type.SearchableEngagementSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;
import type.TaskActivityType;

/* loaded from: classes.dex */
public abstract class mrg {

    /* renamed from: o.mrg$a */
    public static /* synthetic */ class C15408a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35874a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f35875b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f35876c;

        static {
            int[] iArr = new int[AuthorizationLevel.values().length];
            f35876c = iArr;
            try {
                iArr[AuthorizationLevel.MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35876c[AuthorizationLevel.MANAGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35876c[AuthorizationLevel.SUPERADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35876c[AuthorizationLevel.ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[wqh.values().length];
            f35875b = iArr2;
            try {
                iArr2[wqh.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35875b[wqh.MY_TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35875b[wqh.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ActivityMetrics.Period.values().length];
            f35874a = iArr3;
            try {
                iArr3[ActivityMetrics.Period.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35874a[ActivityMetrics.Period.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35874a[ActivityMetrics.Period.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35874a[ActivityMetrics.Period.EVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static x6c A0(List list) {
        l1 l1VarTB = uni.kC().TB();
        return o0(l1VarTB, l1VarTB.pB().m38117i(wqh.MY_TEAM.getOption()), list);
    }

    public static /* synthetic */ PaginatedTokenResults A1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.eqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.z1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static x6c B0(SearchableEngagementFilterInput searchableEngagementFilterInput) {
        return n0(searchableEngagementFilterInput);
    }

    public static /* synthetic */ SearchableIDFilterInput B1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static SearchableEngagementFilterInput C0(String str, String str2, String str3, String str4, Integer num, ActivityMetrics.Period period) {
        final SearchableEngagementFilterInput.Builder builderM0 = m0(str, str4);
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.frg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.R0(builderM0, (String) obj);
            }
        });
        Optional.ofNullable(str2).filter(new Predicate() { // from class: o.grg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.S0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hrg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.T0(builderM0, (String) obj);
            }
        });
        D0(period);
        Integer num2 = 2;
        String strM16653h = a81.m16653h(Long.valueOf(a81.m16659n(Integer.valueOf(num.intValue() - num2.intValue()))));
        SearchableEngagementFilterInput.Builder builderM02 = m0(str, str4);
        SearchableEngagementFilterInput searchableEngagementFilterInputBuild = m0(str, str4).dueDateTime(SearchableStringFilterInput.builder().lt(strM16653h).build()).build();
        SearchableEngagementFilterInput.Builder builderM03 = m0(str, str4);
        SearchableStringFilterInput.Builder builder = SearchableStringFilterInput.builder();
        Boolean bool = Boolean.FALSE;
        return builderM0.and(Arrays.asList(builderM02.or(Arrays.asList(searchableEngagementFilterInputBuild, builderM03.dueDateTime(builder.exists(bool).build()).updatedAt(SearchableStringFilterInput.builder().lt(strM16653h).build()).build())).build(), m0(str, str4).or(Arrays.asList(m0(str, str4).nextFollowUpOn(SearchableStringFilterInput.builder().exists(bool).build()).build(), m0(str, str4).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.TRUE).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().ne("USER").build()).build(), m0(str, str4).nextFollowUpOn(SearchableStringFilterInput.builder().lt(strM16653h).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().eq("USER").build()).build())).build())).build();
    }

    public static /* synthetic */ SearchableIDFilterInput C1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static Pair D0(ActivityMetrics.Period period) {
        int i = C15408a.f35874a[period.ordinal()];
        if (i == 1) {
            return Pair.create(Long.valueOf(a81.m16667v()), Long.valueOf(a81.m16663r()));
        }
        if (i != 2) {
            return Pair.create(Long.valueOf(a81.m16664s()), Long.valueOf(a81.m16660o()));
        }
        return Pair.create(Long.valueOf(a81.m16666u()), Long.valueOf(a81.m16662q()));
    }

    public static /* synthetic */ SearchableIDFilterInput D1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static ryh E0(String str, String str2, String str3, PropertyDefinition propertyDefinition, ActivityMetrics.Period period) {
        List<ryh> list = (List) propertyDefinition.getPossibleValues().stream().map(new Function() { // from class: o.sqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.U0((PropertyOptions) obj);
            }
        }).map(new Function() { // from class: o.tqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.V0((ryh) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        for (ryh ryhVar : list) {
            arrayList.add(C0(str, str3, str2, (String) ryhVar.f44265a, (Integer) ryhVar.f44266b, period));
        }
        final SearchableEngagementFilterInput.Builder builderEngagementStatus = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(EngagementStatus.COMPLETED.name()).build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.uqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.W0(builderEngagementStatus, (String) obj);
            }
        });
        Optional.ofNullable(str3).filter(new Predicate() { // from class: o.vqg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.X0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.wqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.Y0(builderEngagementStatus, (String) obj);
            }
        });
        return uyh.of(builderEngagementStatus.or(arrayList).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ SearchableIDFilterInput E1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ boolean F0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ SearchableIDFilterInput F1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ void G0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static /* synthetic */ SearchableIDFilterInput G1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ boolean H0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ SearchableIDFilterInput H1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ void I0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static /* synthetic */ SearchableIDFilterInput I1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ boolean J0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ SearchableIDFilterInput J1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ void K0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static /* synthetic */ SearchableIDFilterInput K1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ Tasks L0(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static /* synthetic */ SearchableIDFilterInput L1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ PaginatedTokenResults M0(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.apg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.L0((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ SearchableIDFilterInput M1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ Tasks N0(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static /* synthetic */ SearchableIDFilterInput N1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ PaginatedTokenResults O0(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.mqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.N0((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ SearchableIDFilterInput O1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static /* synthetic */ boolean P0(String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ Tasks P1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static /* synthetic */ void Q0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.videoCallOutcome(SearchableStringFilterInput.builder().eq(str).build());
    }

    public static /* synthetic */ PaginatedTokenResults Q1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.cpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.P1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ void R0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 R1(String str, int i) {
        return uni.kC().TB().g4(str, EngagementType.TASK.name(), i).m47686M(new rl7() { // from class: o.ipg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.a1((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ boolean S0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 S1(String str, int i) {
        l1 l1VarTB = uni.kC().TB();
        ryh ryhVarZ1 = Z1(str, null);
        return l1VarTB.Yz(uyh.of((SearchableEngagementFilterInput) ryhVarZ1.f44265a, (SearchableEngagementSortInput) ryhVarZ1.f44266b), i).m47686M(new rl7() { // from class: o.epg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.c1((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ void T0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 T1(String str, int i) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Yz(p0(str, l1VarTB), i).m47686M(new rl7() { // from class: o.nqg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.e1((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ ryh U0(PropertyOptions propertyOptions) {
        return uyh.of(propertyOptions.getValue(), (Map) ja8.f30035c.fromJson(propertyOptions.getOtherAttributes(), Map.class));
    }

    public static s47 U1(String str, int i) {
        return o2(str, null, null, i);
    }

    public static /* synthetic */ ryh V0(ryh ryhVar) {
        return uyh.of((String) ryhVar.f44265a, t0(((Map) ryhVar.f44266b).getOrDefault("taskAutoCloseDays", "30"), 30));
    }

    public static s47 V1(int i) {
        l1 l1VarTB = uni.kC().TB();
        return v0(l1VarTB, l1VarTB.pB().m38117i(wqh.ALL.getOption()), i);
    }

    public static /* synthetic */ void W0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 W1(String str, String str2, String str3, int i) {
        return u0(w0(str, str2, str3, false), i);
    }

    public static /* synthetic */ boolean X0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static s47 X1(final int i, String str, boolean z, ActivityMetrics.Period period) {
        final l1 l1VarTB = uni.kC().TB();
        return Y1(str, z ? l1VarTB.Eo() : null, period).m47684F(new rl7() { // from class: o.jrg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.h1(l1VarTB, i, (ryh) obj);
            }
        });
    }

    public static /* synthetic */ void Y0(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 Y1(final String str, final String str2, final ActivityMetrics.Period period) {
        final l1 l1VarTB = uni.kC().TB();
        return l1VarTB.sC().j1().d0(new rl7() { // from class: o.pqg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.i1((Map) obj);
            }
        }).d0(new rl7() { // from class: o.qqg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.j1(l1VarTB, str2, str, period, (PropertyDefinition) obj);
            }
        }).C0(la1.BUFFER);
    }

    public static /* synthetic */ Tasks Z0(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static ryh Z1(String str, String str2) {
        final SearchableEngagementFilterInput.Builder builderEngagementStatus = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(uni.kC().TB().on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.jqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.k1(builderEngagementStatus, (String) obj);
            }
        });
        return uyh.of(builderEngagementStatus.build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ PaginatedTokenResults a1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.aqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.Z0((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static ryh a2(String str, String str2, String str3) {
        final SearchableEngagementFilterInput.Builder builderEngagementSourceType = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(uni.kC().TB().on()).build()).engagementSource(SearchableStringFilterInput.builder().eq(str).build()).engagementSourceType(SearchableStringFilterInput.builder().eq("template").build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.fqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.l1(builderEngagementSourceType, (String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.gqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.m1(builderEngagementSourceType, (String) obj);
            }
        });
        return uyh.of(builderEngagementSourceType.build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ Tasks b1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static ryh b2(final String str, String str2, List list) {
        final l1 l1VarTB = uni.kC().TB();
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            final SearchableEngagementFilterInput.Builder builderEngagementSourceType = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementSource(SearchableStringFilterInput.builder().eq(str).build()).engagementSourceType(SearchableStringFilterInput.builder().eq("template").build());
            Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.hqg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    mrg.n1(builderEngagementSourceType, (String) obj);
                }
            });
            arrayList.add(builderEngagementSourceType.build());
        }
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.iqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.o1(l1VarTB, str, arrayList, (String) obj);
            }
        });
        SearchableEngagementFilterInput.Builder builderEngagementSourceType2 = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementSource(SearchableStringFilterInput.builder().eq(str).build()).engagementSourceType(SearchableStringFilterInput.builder().eq("template").build());
        if (arrayList.size() > 0) {
            builderEngagementSourceType2.or(arrayList);
        }
        return uyh.of(builderEngagementSourceType2.build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ PaginatedTokenResults c1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.oqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.b1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static ryh c2(String str) {
        l1 l1VarTB = uni.kC().TB();
        String iSO8601Date = DateUtils.formatISO8601Date(new Date(System.currentTimeMillis() - 2592000000L));
        return uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.CALL.name()).build()).callEndTime(SearchableStringFilterInput.builder().gte(iSO8601Date).build()).build(), SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.VISIT.name()).build()).visitTime(SearchableStringFilterInput.builder().gte(iSO8601Date).build()).build(), SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.EMAIL.name()).build()).createdAt(SearchableStringFilterInput.builder().gte(iSO8601Date).build()).build(), SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.WHATSAPP.name()).build()).createdAt(SearchableStringFilterInput.builder().gte(iSO8601Date).build()).build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ Tasks d1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static s47 d2(String str) {
        return uni.kC().TB().J0(c2(str), null, 1).m47686M(new rl7() { // from class: o.arg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (List) ((ryh) obj).m47300g();
            }
        }).m47686M(new rl7() { // from class: o.brg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).m47686M(new rl7() { // from class: o.crg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((Stream) obj).findFirst();
            }
        }).m47686M(new rl7() { // from class: o.drg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.p1((Optional) obj);
            }
        });
    }

    public static /* synthetic */ PaginatedTokenResults e1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.xog
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.d1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static s47 e2(int i) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Yz(q0(l1VarTB), i).m47686M(new rl7() { // from class: o.yqg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.r1((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ Tasks f1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static s47 f2(String str, int i) {
        mii miiVarSB = uni.kC().SB();
        int i2 = C15408a.f35876c[miiVarSB.m39162l().ordinal()];
        return i2 != 1 ? i2 != 2 ? (i2 == 3 || i2 == 4) ? U1(str, i) : g2(str, i) : m2(str, miiVarSB.m39171u().getId(), miiVarSB.m39154L(), i) : g2(str, i);
    }

    public static /* synthetic */ PaginatedTokenResults g1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.erg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.f1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static s47 g2(String str, int i) {
        return o2(str, uni.kC().TB().Eo(), null, i);
    }

    public static /* synthetic */ g3e h1(l1 l1Var, int i, ryh ryhVar) {
        return l1Var.Yz(ryhVar, i).m47686M(new rl7() { // from class: o.rqg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.g1((PaginatedTokenResults) obj);
            }
        });
    }

    public static s47 h2(int i) {
        l1 l1VarTB = uni.kC().TB();
        return v0(l1VarTB, l1VarTB.pB().m38117i(wqh.ME.getOption()), i);
    }

    public static /* synthetic */ PropertyDefinition i1(Map map) {
        return (PropertyDefinition) map.get("taskType");
    }

    public static s47 i2(final int i) {
        return p2(null, uni.kC().TB().Eo(), null).m47686M(new i7a()).m47684F(new rl7() { // from class: o.gpg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.s1(i, (SearchableEngagementFilterInput) obj);
            }
        });
    }

    public static /* synthetic */ ryh j1(l1 l1Var, String str, String str2, ActivityMetrics.Period period, PropertyDefinition propertyDefinition) {
        return E0(l1Var.on(), str, str2, propertyDefinition, period);
    }

    public static s47 j2(int i) {
        l1 l1VarTB = uni.kC().TB();
        return v0(l1VarTB, l1VarTB.pB().m38117i(wqh.MY_TEAM.getOption()), i);
    }

    public static /* synthetic */ void k1(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 k2(String str, String str2, ActivityMetrics.Period period) {
        l1 l1VarTB = uni.kC().TB();
        long jM16664s = a81.m16664s();
        long jM16660o = a81.m16660o();
        String strM16653h = a81.m16653h(Long.valueOf(jM16664s));
        String strM16653h2 = a81.m16653h(Long.valueOf(jM16660o));
        SearchableEngagementFilterInput.Builder builderDueDateTime = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.VIDEO.name()).build()).videoCallOutcome(SearchableStringFilterInput.builder().eq(VideoCallOutcome.SCHEDULED.name()).build()).dueDateTime(SearchableStringFilterInput.builder().gte(strM16653h).build());
        Optional map = Optional.ofNullable(str).map(new Function() { // from class: o.xqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.t1((String) obj);
            }
        });
        Objects.requireNonNull(builderDueDateTime);
        map.ifPresent(new npg(builderDueDateTime));
        Optional.ofNullable(str2).map(new Function() { // from class: o.zqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.u1((String) obj);
            }
        }).ifPresent(new lpg(builderDueDateTime));
        return s47.m47673L(uyh.of(SearchableEngagementFilterInput.builder().and(Arrays.asList(builderDueDateTime.build(), SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).dueDateTime(SearchableStringFilterInput.builder().lte(strM16653h2).build()).build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()));
    }

    public static /* synthetic */ void l1(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 l2(int i, String str, boolean z) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Yz(r0(str, z, l1VarTB), i).m47686M(new rl7() { // from class: o.yog
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.w1((PaginatedTokenResults) obj);
            }
        });
    }

    public static SearchableEngagementFilterInput.Builder m0(String str, String str2) {
        return SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).taskType(SearchableStringFilterInput.builder().eq(str2).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(EngagementStatus.COMPLETED.name()).build());
    }

    public static /* synthetic */ void m1(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 m2(String str, String str2, List list, int i) {
        l1 l1VarTB = uni.kC().TB();
        ryh ryhVarB2 = b2(str, str2, list);
        return l1VarTB.Yz(uyh.of((SearchableEngagementFilterInput) ryhVarB2.f44265a, (SearchableEngagementSortInput) ryhVarB2.f44266b), i).m47686M(new rl7() { // from class: o.krg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.y1((PaginatedTokenResults) obj);
            }
        });
    }

    public static x6c n0(SearchableEngagementFilterInput searchableEngagementFilterInput) {
        return uni.kC().TB().vv(uyh.of(searchableEngagementFilterInput, SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()));
    }

    public static /* synthetic */ void n1(SearchableEngagementFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    public static s47 n2(SearchableEngagementFilterInput searchableEngagementFilterInput, int i) {
        return u0(searchableEngagementFilterInput, i);
    }

    public static x6c o0(l1 l1Var, vqh vqhVar, List list) {
        return l1Var.Eb(vqhVar, list);
    }

    public static /* synthetic */ void o1(l1 l1Var, String str, List list, String str2) {
        SearchableEngagementFilterInput.Builder builderEngagementSourceType = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementSource(SearchableStringFilterInput.builder().eq(str).build()).engagementSourceType(SearchableStringFilterInput.builder().eq("template").build());
        builderEngagementSourceType.ownerId(SearchableIDFilterInput.builder().eq(str2).build());
        list.add(builderEngagementSourceType.build());
    }

    public static s47 o2(String str, String str2, String str3, int i) {
        l1 l1VarTB = uni.kC().TB();
        ryh ryhVarA2 = a2(str, str2, str3);
        return l1VarTB.Yz(uyh.of((SearchableEngagementFilterInput) ryhVarA2.f44265a, (SearchableEngagementSortInput) ryhVarA2.f44266b), i).m47686M(new rl7() { // from class: o.zog
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.A1((PaginatedTokenResults) obj);
            }
        });
    }

    public static ryh p0(String str, l1 l1Var) {
        final SearchableEngagementFilterInput.Builder builderDueDateTime = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).taskActivityType(SearchableStringFilterInput.builder().eq(TaskActivityType.VISIT.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(EngagementStatus.COMPLETED.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lt(DateUtils.formatISO8601Date(new Date(System.currentTimeMillis()))).build());
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.fpg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.F0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hpg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.G0(builderDueDateTime, (String) obj);
            }
        });
        return uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(builderDueDateTime.build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ Engagement p1(Optional optional) {
        return (Engagement) optional.orElse(null);
    }

    public static s47 p2(String str, String str2, ActivityMetrics.Period period) {
        l1 l1VarTB = uni.kC().TB();
        long jM16664s = a81.m16664s();
        long jM16660o = a81.m16660o();
        String strM16653h = a81.m16653h(Long.valueOf(jM16664s));
        String strM16653h2 = a81.m16653h(Long.valueOf(jM16660o));
        SearchableEngagementFilterInput.Builder builderAccountId = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build());
        SearchableStringFilterInput.Builder builder = SearchableStringFilterInput.builder();
        EngagementType engagementType = EngagementType.TASK;
        SearchableEngagementFilterInput.Builder builderEngagementType = builderAccountId.engagementType(builder.eq(engagementType.name()).build());
        SearchableStringFilterInput.Builder builder2 = SearchableStringFilterInput.builder();
        EngagementStatus engagementStatus = EngagementStatus.COMPLETED;
        SearchableEngagementFilterInput.Builder builderDueDateTime = builderEngagementType.engagementStatus(builder2.ne(engagementStatus.name()).build()).dueDateTime(SearchableStringFilterInput.builder().gte(strM16653h).build());
        Optional map = Optional.ofNullable(str).map(new Function() { // from class: o.jpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.B1((String) obj);
            }
        });
        Objects.requireNonNull(builderDueDateTime);
        map.ifPresent(new npg(builderDueDateTime));
        Optional.ofNullable(str2).map(new Function() { // from class: o.wpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.C1((String) obj);
            }
        }).ifPresent(new lpg(builderDueDateTime));
        SearchableEngagementFilterInput.Builder builderDueDateTime2 = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lte(strM16653h2).build());
        Optional map2 = Optional.ofNullable(str).map(new Function() { // from class: o.xpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.D1((String) obj);
            }
        });
        Objects.requireNonNull(builderDueDateTime2);
        map2.ifPresent(new npg(builderDueDateTime2));
        Optional.ofNullable(str2).map(new Function() { // from class: o.ypg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.E1((String) obj);
            }
        }).ifPresent(new lpg(builderDueDateTime2));
        SearchableEngagementFilterInput.Builder builderNextFollowUpSetBy = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lte(strM16653h2).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().eq("USER").build());
        Optional map3 = Optional.ofNullable(str).map(new Function() { // from class: o.zpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.F1((String) obj);
            }
        });
        Objects.requireNonNull(builderNextFollowUpSetBy);
        map3.ifPresent(new npg(builderNextFollowUpSetBy));
        Optional.ofNullable(str2).map(new Function() { // from class: o.kpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.G1((String) obj);
            }
        }).ifPresent(new lpg(builderNextFollowUpSetBy));
        SearchableEngagementFilterInput.Builder builderNextFollowUpSetBy2 = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().ne("USER").build());
        Optional map4 = Optional.ofNullable(str).map(new Function() { // from class: o.mpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.H1((String) obj);
            }
        });
        Objects.requireNonNull(builderNextFollowUpSetBy2);
        map4.ifPresent(new npg(builderNextFollowUpSetBy2));
        Optional.ofNullable(str2).map(new Function() { // from class: o.opg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.I1((String) obj);
            }
        }).ifPresent(new lpg(builderNextFollowUpSetBy2));
        SearchableEngagementFilterInput.Builder builderNextFollowUpOn = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build());
        Optional map5 = Optional.ofNullable(str).map(new Function() { // from class: o.ppg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.J1((String) obj);
            }
        });
        Objects.requireNonNull(builderNextFollowUpOn);
        map5.ifPresent(new npg(builderNextFollowUpOn));
        Optional.ofNullable(str2).map(new Function() { // from class: o.qpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.K1((String) obj);
            }
        }).ifPresent(new lpg(builderNextFollowUpOn));
        SearchableEngagementFilterInput.Builder builderNextFollowUpSetBy3 = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().gte(strM16653h).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().eq("USER").build());
        Optional map6 = Optional.ofNullable(str).map(new Function() { // from class: o.spg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.L1((String) obj);
            }
        });
        Objects.requireNonNull(builderNextFollowUpSetBy3);
        map6.ifPresent(new npg(builderNextFollowUpSetBy3));
        Optional.ofNullable(str2).map(new Function() { // from class: o.tpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.M1((String) obj);
            }
        }).ifPresent(new lpg(builderNextFollowUpSetBy3));
        SearchableEngagementFilterInput.Builder builderNextFollowUpSetBy4 = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lte(strM16653h2).build()).nextFollowUpSetBy(SearchableStringFilterInput.builder().eq("USER").build());
        Optional map7 = Optional.ofNullable(str).map(new Function() { // from class: o.upg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.N1((String) obj);
            }
        });
        Objects.requireNonNull(builderNextFollowUpSetBy4);
        map7.ifPresent(new npg(builderNextFollowUpSetBy4));
        Optional.ofNullable(str2).map(new Function() { // from class: o.vpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.O1((String) obj);
            }
        }).ifPresent(new lpg(builderNextFollowUpSetBy4));
        return s47.m47673L(uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(SearchableEngagementFilterInput.builder().and(Arrays.asList(SearchableEngagementFilterInput.builder().and(Arrays.asList(builderDueDateTime.build(), builderDueDateTime2.build())).build(), SearchableEngagementFilterInput.builder().or(Arrays.asList(builderNextFollowUpSetBy.build(), builderNextFollowUpSetBy2.build(), builderNextFollowUpOn.build())).build())).build(), SearchableEngagementFilterInput.builder().and(Arrays.asList(builderNextFollowUpSetBy3.build(), builderNextFollowUpSetBy4.build())).build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()));
    }

    public static ryh q0(l1 l1Var) {
        return uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).ownerId(SearchableIDFilterInput.builder().eq(l1Var.Eo()).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).taskActivityType(SearchableStringFilterInput.builder().eq(TaskActivityType.VISIT.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(EngagementStatus.COMPLETED.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lt(DateUtils.formatISO8601Date(new Date(System.currentTimeMillis()))).build()).build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ Tasks q1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static s47 q2(int i, String str, boolean z) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Yz(s0(str, z, l1VarTB), i).m47686M(new rl7() { // from class: o.irg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.Q1((PaginatedTokenResults) obj);
            }
        });
    }

    public static ryh r0(String str, boolean z, l1 l1Var) {
        String strM16653h = a81.m16653h(Long.valueOf(a81.m16664s()));
        SearchableEngagementFilterInput.Builder builderAccountId = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build());
        SearchableStringFilterInput.Builder builder = SearchableStringFilterInput.builder();
        EngagementType engagementType = EngagementType.TASK;
        SearchableEngagementFilterInput.Builder builderEngagementType = builderAccountId.engagementType(builder.eq(engagementType.name()).build());
        SearchableStringFilterInput.Builder builder2 = SearchableStringFilterInput.builder();
        EngagementStatus engagementStatus = EngagementStatus.COMPLETED;
        final SearchableEngagementFilterInput.Builder builderOr = builderEngagementType.engagementStatus(builder2.ne(engagementStatus.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lt(strM16653h).build()).or(Arrays.asList(SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lt(strM16653h).build()).build(), SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build()).build()));
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.bqg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.H0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.dqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.I0(builderOr, (String) obj);
            }
        });
        return uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(z ? builderOr.ownerId(SearchableIDFilterInput.builder().eq(l1Var.Eo()).build()).build() : builderOr.build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.dueDateTime).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ PaginatedTokenResults r1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.bpg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.q1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static ryh s0(String str, boolean z, l1 l1Var) {
        final SearchableEngagementFilterInput.Builder builderEngagementStatus = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).toBeAssigned(SearchableStringFilterInput.builder().eq(ContactAssignmentStatus.UNASSIGNED.name()).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().ne(EngagementStatus.COMPLETED.name()).build());
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.lrg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.J0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.wog
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.K0(builderEngagementStatus, (String) obj);
            }
        });
        return uyh.of(SearchableEngagementFilterInput.builder().or(Arrays.asList(z ? builderEngagementStatus.addedById(SearchableIDFilterInput.builder().eq(l1Var.Eo()).build()).build() : builderEngagementStatus.build())).build(), SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    public static /* synthetic */ g3e s1(int i, SearchableEngagementFilterInput searchableEngagementFilterInput) {
        return u0(searchableEngagementFilterInput, i);
    }

    public static Integer t0(Object obj, Integer num) {
        try {
            return Integer.valueOf(Double.valueOf(Double.parseDouble(String.valueOf(obj))).intValue());
        } catch (Exception unused) {
            return num;
        }
    }

    public static /* synthetic */ SearchableIDFilterInput t1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static s47 u0(SearchableEngagementFilterInput searchableEngagementFilterInput, int i) {
        return uni.kC().TB().Yz(uyh.of(searchableEngagementFilterInput, SearchableEngagementSortInput.builder().field(SearchableEngagementSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i).m47686M(new rl7() { // from class: o.vog
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.M0((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ SearchableIDFilterInput u1(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    public static s47 v0(l1 l1Var, vqh vqhVar, int i) {
        return l1Var.jv(vqhVar, i).m47686M(new rl7() { // from class: o.dpg
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mrg.O0((PaginatedTokenResults) obj);
            }
        });
    }

    public static /* synthetic */ Tasks v1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static SearchableEngagementFilterInput w0(String str, String str2, String str3, boolean z) {
        l1 l1VarTB = uni.kC().TB();
        final SearchableEngagementFilterInput.Builder builderEngagementType = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactId(SearchableIDFilterInput.builder().eq(str).build()).engagementType(SearchableStringFilterInput.builder().eq(EngagementType.VIDEO.name()).build());
        Optional.ofNullable(str3).filter(new Predicate() { // from class: o.rpg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return mrg.P0((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.cqg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mrg.Q0(builderEngagementType, (String) obj);
            }
        });
        return z ? builderEngagementType.ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build()).build() : builderEngagementType.build();
    }

    public static /* synthetic */ PaginatedTokenResults w1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.kqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.v1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static x6c x0(String str, String str2) {
        uni.kC().TB();
        return B0((SearchableEngagementFilterInput) Z1(str, str2).f44265a);
    }

    public static /* synthetic */ Tasks x1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }

    public static x6c y0(List list) {
        l1 l1VarTB = uni.kC().TB();
        return o0(l1VarTB, l1VarTB.pB().m38117i(wqh.ALL.getOption()), list);
    }

    public static /* synthetic */ PaginatedTokenResults y1(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.lqg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mrg.x1((Engagement) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static x6c z0(List list) {
        l1 l1VarTB = uni.kC().TB();
        return o0(l1VarTB, l1VarTB.pB().m38117i(wqh.ME.getOption()), list);
    }

    public static /* synthetic */ Tasks z1(Engagement engagement) {
        return new EngagementSummary(engagement).toTask();
    }
}
