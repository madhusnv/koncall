package p001o;

import ai.salesmax.model.LeadsDeal;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Deal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.DealOutcome;
import type.DealState;
import type.SearchableDealFilterInput;
import type.SearchableDealSortInput;
import type.SearchableDealSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public abstract class l35 {
    /* renamed from: A */
    public static /* synthetic */ SearchableDealFilterInput m36484A(String str) {
        return SearchableDealFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: D */
    public static /* synthetic */ x8c m36487D(String str, int i, l1 l1Var) {
        return l1Var.pc(str, i).h0();
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m36488E(LeadsDeal leadsDeal) {
        return DealState.ACTIVE.name().equalsIgnoreCase(leadsDeal.getState());
    }

    /* renamed from: F */
    public static /* synthetic */ List m36489F(List list) {
        return (List) list.stream().map(new i35()).filter(new Predicate() { // from class: o.j35
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l35.m36488E((LeadsDeal) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: G */
    public static x6c m36490G(final String str, final int i) {
        return uni.LB().d0(new gd()).d0(new hd()).m55717M(new rl7() { // from class: o.e35
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return l35.m36487D(str, i, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.f35
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return l35.m36489F((List) obj);
            }
        });
    }

    /* renamed from: H */
    public static s47 m36491H(String str, String str2, int i, String str3) {
        l1 l1VarTB = uni.kC().TB();
        return m36516n(l1VarTB, m36500Q(l1VarTB, str, str2, str3), i);
    }

    /* renamed from: I */
    public static x6c m36492I(String str, String str2, String str3) {
        l1 l1VarTB = uni.kC().TB();
        return m36517o(l1VarTB, m36500Q(l1VarTB, str, str2, str3));
    }

    /* renamed from: J */
    public static x6c m36493J(String str, String str2, String str3, String str4) {
        return StringUtils.isBlank(str) ? m36492I(str2, str3, str4) : m36497N(str, str2, str3, str4);
    }

    /* renamed from: K */
    public static s47 m36494K(String str, String str2, int i, String str3) {
        l1 l1VarTB = uni.kC().TB();
        return m36516n(l1VarTB, m36501R(l1VarTB, l1VarTB.Eo(), str, str2, str3), i);
    }

    /* renamed from: L */
    public static x6c m36495L(String str, String str2, String str3) {
        l1 l1VarTB = uni.kC().TB();
        return m36517o(l1VarTB, m36501R(l1VarTB, l1VarTB.Eo(), str, str2, str3));
    }

    /* renamed from: M */
    public static s47 m36496M(String str, String str2, String str3, int i, String str4) {
        l1 l1VarTB = uni.kC().TB();
        return m36516n(l1VarTB, m36502S(l1VarTB, str, str2, str3, str4), i);
    }

    /* renamed from: N */
    public static x6c m36497N(String str, String str2, String str3, String str4) {
        l1 l1VarTB = uni.kC().TB();
        return m36517o(l1VarTB, m36502S(l1VarTB, str, str2, str3, str4));
    }

    /* renamed from: O */
    public static x6c m36498O(LeadsDeal leadsDeal) {
        return uni.kC().TB().Ft(leadsDeal.getUnderlyingDeal()).d0(new rl7() { // from class: o.b35
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return new LeadsDeal((Deal) obj);
            }
        });
    }

    /* renamed from: P */
    public static x6c m36499P(LeadsDeal leadsDeal) {
        return uni.kC().TB().W0(leadsDeal.getUnderlyingDeal(), leadsDeal.getContactId(), leadsDeal.getNextFollowupOn(), leadsDeal.getTaskBody(), leadsDeal.getTaskAssigneeUserId(), leadsDeal.getTaskAssigneeTeamId(), leadsDeal.getTransferLead(), leadsDeal.getFormId());
    }

    /* renamed from: Q */
    public static SearchableDealFilterInput m36500Q(l1 l1Var, String str, String str2, String str3) {
        SearchableDealFilterInput.Builder builderAccountId = SearchableDealFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build());
        m36518p(builderAccountId, str, str2, str3);
        return builderAccountId.build();
    }

    /* renamed from: R */
    public static SearchableDealFilterInput m36501R(l1 l1Var, String str, String str2, String str3, String str4) {
        SearchableDealFilterInput.Builder builderOwnerId = SearchableDealFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).ownerId(SearchableIDFilterInput.builder().eq(str).build());
        m36518p(builderOwnerId, str2, str3, str4);
        return builderOwnerId.build();
    }

    /* renamed from: S */
    public static SearchableDealFilterInput m36502S(l1 l1Var, String str, String str2, String str3, String str4) {
        SearchableDealFilterInput.Builder builderM36520r = m36520r(SearchableDealFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()), str);
        m36518p(builderM36520r, str2, str3, str4);
        return builderM36520r.build();
    }

    /* renamed from: n */
    public static s47 m36516n(l1 l1Var, SearchableDealFilterInput searchableDealFilterInput, int i) {
        return l1Var.K5(uyh.of(searchableDealFilterInput, SearchableDealSortInput.builder().field(SearchableDealSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()), i).m47686M(new rl7() { // from class: o.h35
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return l35.m36522t((PaginatedTokenResults) obj);
            }
        });
    }

    /* renamed from: o */
    public static x6c m36517o(l1 l1Var, SearchableDealFilterInput searchableDealFilterInput) {
        return l1Var.bf(uyh.of(searchableDealFilterInput, SearchableDealSortInput.builder().field(SearchableDealSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()));
    }

    /* renamed from: p */
    public static SearchableDealFilterInput.Builder m36518p(final SearchableDealFilterInput.Builder builder, String str, final String str2, final String str3) {
        Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.k35
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l35.m36525w(str3, builder, str2, (String) obj);
            }
        });
        return builder;
    }

    /* renamed from: q */
    public static x6c m36519q(String str, String[] strArr, Boolean bool, String str2) {
        ArrayList arrayList = new ArrayList();
        for (final String str3 : strArr) {
            arrayList.add(bool.booleanValue() ? m36495L(str3, str3, str2).d0(new rl7() { // from class: o.w25
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return uyh.of(str3, (Integer) obj);
                }
            }) : m36493J(str, str3, str3, str2).d0(new rl7() { // from class: o.c35
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return uyh.of(str3, (Integer) obj);
                }
            }));
        }
        return x6c.e0(arrayList).m55733m(new LinkedHashMap(), new eh1() { // from class: o.d35
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                l35.m36528z((Map) obj, (ryh) obj2);
            }
        }).m55027y();
    }

    /* renamed from: r */
    public static SearchableDealFilterInput.Builder m36520r(SearchableDealFilterInput.Builder builder, String str) {
        return (StringUtils.isBlank(str) || "ALL".equalsIgnoreCase(str)) ? builder.or((List) m36521s().stream().map(new Function() { // from class: o.g35
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l35.m36484A((String) obj);
            }
        }).collect(Collectors.toList())) : builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* renamed from: s */
    public static List m36521s() {
        AuthorizationLevel authorizationLevelM39162l = wi0.m54444J().m39162l();
        new ArrayList();
        return (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) ? (List) wi0.m54451Q().stream().map(new Function() { // from class: o.x25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LeadsTeam) obj).getTeamId();
            }
        }).collect(Collectors.toList()) : (List) wi0.m54453S().stream().map(new Function() { // from class: o.y25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LeadsTeam) obj).getTeamId();
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: t */
    public static /* synthetic */ PaginatedTokenResults m36522t(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new i35());
        map.loadInitial();
        return map;
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m36523u(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: v */
    public static /* synthetic */ void m36524v(SearchableDealFilterInput.Builder builder, String str) {
        builder.name(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str)).build());
    }

    /* renamed from: w */
    public static /* synthetic */ void m36525w(String str, final SearchableDealFilterInput.Builder builder, String str2, String str3) {
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.z25
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l35.m36523u((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.a35
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l35.m36524v(builder, (String) obj);
            }
        });
        str3.hashCode();
        switch (str3) {
            case "Deals Lost":
                builder.dealOutcome(SearchableStringFilterInput.builder().eq(DealOutcome.LOSS.name()).build());
                break;
            case "Moved Today":
                String strM16653h = a81.m16653h(Long.valueOf(a81.m16664s()));
                builder.dealStageUpdatedAt(SearchableStringFilterInput.builder().gt(strM16653h).build());
                builder.createdAt(SearchableStringFilterInput.builder().lt(strM16653h).build());
                break;
            case "Active Deals":
                builder.dealState(SearchableStringFilterInput.builder().eq(DealState.ACTIVE.name()).build());
                if (!str2.isEmpty() && !str2.equals("All Deals")) {
                    builder.dealStage(SearchableStringFilterInput.builder().eq(str2).build());
                    break;
                }
                break;
            case "Deals Won":
                builder.dealOutcome(SearchableStringFilterInput.builder().eq(DealOutcome.WIN.name()).build());
                break;
            case "Created Today":
                builder.createdAt(SearchableStringFilterInput.builder().gt(a81.m16653h(Long.valueOf(a81.m16664s()))).build());
                break;
            case "Stuck Deals":
                builder.dealStageUpdatedAt(SearchableStringFilterInput.builder().lt(a81.m16653h(Long.valueOf(a81.m16664s() - 604800000))).build());
                builder.dealState(SearchableStringFilterInput.builder().eq(DealState.ACTIVE.name()).build());
                if (!str2.isEmpty() && !str2.equals("All Deals")) {
                    builder.dealStage(SearchableStringFilterInput.builder().eq(str2).build());
                    break;
                }
                break;
            default:
                if (!str2.isEmpty() && !str2.equals("All Deals")) {
                    builder.dealStage(SearchableStringFilterInput.builder().eq(str2).build());
                    break;
                }
                break;
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m36528z(Map map, ryh ryhVar) {
        map.put((String) ryhVar.f44265a, (Integer) ryhVar.f44266b);
    }
}
