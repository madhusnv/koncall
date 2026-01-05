package p001o;

import ai.salesmax.model.LeadFilter;
import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.UserContactDetail;
import com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.TeamRole;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.ContactAssignmentStatus;
import type.SearchableContactFilterInput;
import type.SearchableContactSortInput;
import type.SearchableContactSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public abstract class iu9 {

    /* renamed from: o.iu9$a */
    public static /* synthetic */ class C14375a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29241a;

        static {
            int[] iArr = new int[AuthorizationLevel.values().length];
            f29241a = iArr;
            try {
                iArr[AuthorizationLevel.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29241a[AuthorizationLevel.SUPERADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29241a[AuthorizationLevel.MEMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29241a[AuthorizationLevel.MANAGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: B */
    public static ryh m32798B(l1 l1Var, String str) {
        final SearchableContactFilterInput.Builder beAssigned = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1Var.on()).build()).toBeAssigned(SearchableStringFilterInput.builder().eq(ContactAssignmentStatus.UNASSIGNED.name()).build());
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.ft9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return iu9.m32801E((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.gt9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                iu9.m32802F(beAssigned, (String) obj);
            }
        });
        return uyh.of(beAssigned.build(), SearchableContactSortInput.builder().field(SearchableContactSortableFields.updatedAt).direction(SearchableSortDirection.desc).build());
    }

    /* renamed from: C */
    public static s47 m32799C(l1 l1Var, vx9 vx9Var, int i) {
        return l1Var.Lc(vx9Var, i).m47686M(new rl7() { // from class: o.st9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32804H((PaginatedTokenResults) obj);
            }
        });
    }

    /* renamed from: D */
    public static s47 m32800D(final List list) {
        return t0((List) list.stream().map(new Function() { // from class: o.ht9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UserContactDetail) obj).getPhoneNumber();
            }
        }).flatMap(new Function() { // from class: o.it9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ArrayList) obj).stream();
            }
        }).collect(Collectors.toList())).m47686M(new rl7() { // from class: o.jt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32805I(list, (Map) obj);
            }
        });
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m32801E(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: F */
    public static /* synthetic */ void m32802F(SearchableContactFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* renamed from: G */
    public static /* synthetic */ Leads m32803G(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    /* renamed from: H */
    public static /* synthetic */ PaginatedTokenResults m32804H(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.wt9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return iu9.m32803G((Contact) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    /* renamed from: I */
    public static /* synthetic */ List m32805I(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserContactDetail userContactDetail = (UserContactDetail) it.next();
            Iterator<String> it2 = userContactDetail.getPhoneNumber().iterator();
            while (it2.hasNext()) {
                if (map.containsKey(it2.next())) {
                    userContactDetail.setAlreadyImported(true);
                }
            }
        }
        return list;
    }

    /* renamed from: J */
    public static /* synthetic */ g3e m32806J(int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, null), i);
    }

    /* renamed from: K */
    public static /* synthetic */ g3e m32807K(int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, null), i);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m32808L(LeadTeamMember leadTeamMember) {
        return TeamRole.TEAM_LEADER.name().equalsIgnoreCase(leadTeamMember.getTeamRole());
    }

    /* renamed from: M */
    public static /* synthetic */ List m32809M(List list) {
        return (List) list.stream().filter(new Predicate() { // from class: o.hu9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return iu9.m32808L((LeadTeamMember) obj);
            }
        }).map(new et9()).collect(Collectors.toList());
    }

    /* renamed from: O */
    public static /* synthetic */ g3e m32811O(int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, null), i);
    }

    /* renamed from: P */
    public static /* synthetic */ SearchableContactFilterInput m32812P(String str, String str2, String str3, ryh ryhVar, List list) {
        return SearchableContactFilterInput.builder().and(Arrays.asList(vx9.d0(str, str2, str3, list), (SearchableContactFilterInput) ryhVar.f44265a)).accountId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: Q */
    public static /* synthetic */ g3e m32813Q(ryh ryhVar, int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, (SearchableContactSortInput) ryhVar.f44266b), i);
    }

    /* renamed from: R */
    public static /* synthetic */ g3e m32814R(ryh ryhVar, int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, (SearchableContactSortInput) ryhVar.f44266b), i);
    }

    /* renamed from: S */
    public static /* synthetic */ g3e m32815S(ryh ryhVar, int i, SearchableContactFilterInput searchableContactFilterInput) {
        return l0(uyh.of(searchableContactFilterInput, (SearchableContactSortInput) ryhVar.f44266b), i);
    }

    /* renamed from: T */
    public static /* synthetic */ boolean m32816T(LeadTeamMember leadTeamMember) {
        return TeamRole.TEAM_LEADER.name().equalsIgnoreCase(leadTeamMember.getTeamRole());
    }

    /* renamed from: U */
    public static /* synthetic */ List m32817U(List list) {
        return (List) list.stream().filter(new Predicate() { // from class: o.vt9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return iu9.m32816T((LeadTeamMember) obj);
            }
        }).map(new et9()).collect(Collectors.toList());
    }

    /* renamed from: V */
    public static /* synthetic */ Leads m32818V(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    /* renamed from: W */
    public static /* synthetic */ PaginatedTokenResults m32819W(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.fu9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return iu9.m32818V((Contact) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    /* renamed from: X */
    public static /* synthetic */ Leads m32820X(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    /* renamed from: Y */
    public static /* synthetic */ PaginatedTokenResults m32821Y(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.rt9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return iu9.m32820X((Contact) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    /* renamed from: Z */
    public static /* synthetic */ Leads m32822Z(Contact contact) {
        LeadsSummary leadsSummary = new LeadsSummary(contact);
        bt9.f16783b.m19757a().m19751o(leadsSummary);
        return leadsSummary.toLeads();
    }

    public static /* synthetic */ PaginatedTokenResults a0(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.au9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return iu9.m32822Z((Contact) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ PaginatedTokenResults b0(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new kt9());
        map.loadInitial();
        return map;
    }

    public static /* synthetic */ ryh c0(SearchContactNumbersQuery.Item item) {
        return uyh.of(item.phoneNumber(), item.contactId());
    }

    public static /* synthetic */ ryh d0(ryh ryhVar) {
        return uyh.of((List) ((List) ryhVar.f44265a).stream().map(new Function() { // from class: o.xt9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return iu9.c0((SearchContactNumbersQuery.Item) obj);
            }
        }).collect(Collectors.toList()), (String) ryhVar.f44266b);
    }

    public static /* synthetic */ Map e0(ryh ryhVar) {
        List<ryh> list = (List) ryhVar.f44265a;
        HashMap map = new HashMap();
        for (ryh ryhVar2 : list) {
            map.put((String) ryhVar2.f44265a, (String) ryhVar2.f44266b);
        }
        return map;
    }

    public static s47 f0(int i) {
        l1 l1VarTB = uni.kC().TB();
        return m32799C(l1VarTB, l1VarTB.pB().m38114f(wx9.ALL.getOption()), i);
    }

    public static s47 g0(LeadFilter leadFilter, int i) {
        return l0(leadFilter.getSearchableContactSortInput(leadFilter.getSearchableContactFilterInput(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(uni.kC().TB().on()).build()))), i);
    }

    public static x6c h0(LeadFilter leadFilter) {
        return m0(leadFilter.getSearchableContactSortInput(leadFilter.getSearchableContactFilterInput(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(uni.kC().TB().on()).build()))));
    }

    public static s47 i0(final String str, final int i) {
        l1 l1VarTB = uni.kC().TB();
        final String strEo = l1VarTB.Eo();
        final String strOn = l1VarTB.on();
        int i2 = C14375a.f29241a[l1VarTB.oB().getAuthorizationLevel().ordinal()];
        return (i2 == 1 || i2 == 2) ? s47.m47673L(vx9.d0(strOn, null, str, Collections.emptyList())).m47684F(new rl7() { // from class: o.ot9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32806J(i, (SearchableContactFilterInput) obj);
            }
        }) : i2 != 3 ? i2 != 4 ? s47.m47673L(PaginatedTokenResults.empty()) : o4h.m41549M(strEo).m47686M(new rl7() { // from class: o.bu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32809M((List) obj);
            }
        }).m47686M(new rl7() { // from class: o.cu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return vx9.d0(strOn, strEo, str, (List) obj);
            }
        }).m47684F(new rl7() { // from class: o.du9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32811O(i, (SearchableContactFilterInput) obj);
            }
        }) : s47.m47673L(vx9.d0(strOn, strEo, str, Collections.emptyList())).m47684F(new rl7() { // from class: o.zt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32807K(i, (SearchableContactFilterInput) obj);
            }
        });
    }

    public static s47 j0(vx9 vx9Var, final String str, final int i) {
        l1 l1VarTB = uni.kC().TB();
        final String strEo = l1VarTB.Eo();
        final String strOn = l1VarTB.on();
        AuthorizationLevel authorizationLevel = l1VarTB.oB().getAuthorizationLevel();
        final ryh ryhVarOf = l1VarTB.Of(vx9Var);
        int i2 = C14375a.f29241a[authorizationLevel.ordinal()];
        return (i2 == 1 || i2 == 2) ? s47.m47673L(SearchableContactFilterInput.builder().and(Arrays.asList(vx9.d0(strOn, null, str, Collections.emptyList()), (SearchableContactFilterInput) ryhVarOf.f44265a)).accountId(SearchableIDFilterInput.builder().eq(strOn).build()).build()).m47684F(new rl7() { // from class: o.lt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32814R(ryhVarOf, i, (SearchableContactFilterInput) obj);
            }
        }) : i2 != 3 ? i2 != 4 ? s47.m47673L(PaginatedTokenResults.empty()) : o4h.m41549M(strEo).m47686M(new rl7() { // from class: o.nt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32817U((List) obj);
            }
        }).m47686M(new rl7() { // from class: o.pt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32812P(strOn, strEo, str, ryhVarOf, (List) obj);
            }
        }).m47684F(new rl7() { // from class: o.qt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32813Q(ryhVarOf, i, (SearchableContactFilterInput) obj);
            }
        }) : s47.m47673L(SearchableContactFilterInput.builder().and(Arrays.asList(vx9.d0(strOn, strEo, str, Collections.emptyList()), (SearchableContactFilterInput) ryhVarOf.f44265a)).accountId(SearchableIDFilterInput.builder().eq(strOn).build()).build()).m47684F(new rl7() { // from class: o.mt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32815S(ryhVarOf, i, (SearchableContactFilterInput) obj);
            }
        });
    }

    public static s47 k0(String str, int i) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Nk(m32798B(l1VarTB, str), i).m47686M(new rl7() { // from class: o.dt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32819W((PaginatedTokenResults) obj);
            }
        });
    }

    public static s47 l0(ryh ryhVar, int i) {
        return uni.kC().TB().Nk(ryhVar, i).m47686M(new rl7() { // from class: o.gu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.m32821Y((PaginatedTokenResults) obj);
            }
        });
    }

    public static x6c m0(ryh ryhVar) {
        return uni.kC().TB().ky(ryhVar);
    }

    public static s47 n0(String str, int i) {
        l1 l1VarTB = uni.kC().TB();
        String[] strArrSplit = str.split("[\\s,]+");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            SearchableContactFilterInput.Builder builderAccountId = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build());
            SearchableContactFilterInput.Builder builderName = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).name(SearchableStringFilterInput.builder().matchPhrasePrefix(str2).build());
            SearchableContactFilterInput.Builder builderContactNumberDetail__phoneNumber = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).contactNumberDetail__phoneNumber(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str2)).build());
            int i2 = C14375a.f29241a[l1VarTB.oB().getAuthorizationLevel().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 4) {
                    builderName.ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build());
                    builderContactNumberDetail__phoneNumber.ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build());
                } else {
                    List listM39154L = uni.kC().SB().m39154L();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).name(SearchableStringFilterInput.builder().matchPhrasePrefix(str2).build()).ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build()).build());
                    Iterator it = listM39154L.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).name(SearchableStringFilterInput.builder().matchPhrasePrefix(str2).build()).primaryTeamId(SearchableIDFilterInput.builder().eq((String) it.next()).build()).build());
                    }
                    builderName.or(arrayList2);
                    builderContactNumberDetail__phoneNumber.or(arrayList2);
                }
            }
            arrayList.add(builderAccountId.or(Arrays.asList(builderName.build(), builderContactNumberDetail__phoneNumber.build())).build());
        }
        return l1VarTB.Nk(uyh.of(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).and(arrayList).build(), SearchableContactSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableContactSortableFields.updatedAt).build()), i).m47686M(new rl7() { // from class: o.yt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.a0((PaginatedTokenResults) obj);
            }
        });
    }

    public static s47 o0(int i) {
        l1 l1VarTB = uni.kC().TB();
        return m32799C(l1VarTB, l1VarTB.pB().m38114f(wx9.ME.getOption()), i);
    }

    public static s47 p0(Long l, Long l2, int i) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.Bu(l1VarTB.Eo(), null, l, l2, i).m47686M(new rl7() { // from class: o.eu9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.b0((PaginatedTokenResults) obj);
            }
        });
    }

    public static s47 q0(LeadFilter leadFilter, int i) {
        l1 l1VarTB = uni.kC().TB();
        return l0(leadFilter.getSearchableContactSortInput(leadFilter.getSearchableContactFilterInput(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build()))), i);
    }

    public static x6c r0(LeadFilter leadFilter) {
        l1 l1VarTB = uni.kC().TB();
        return m0(leadFilter.getSearchableContactSortInput(leadFilter.getSearchableContactFilterInput(SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(l1VarTB.on()).build()).ownerId(SearchableIDFilterInput.builder().eq(l1VarTB.Eo()).build()))));
    }

    public static s47 s0(int i) {
        l1 l1VarTB = uni.kC().TB();
        return m32799C(l1VarTB, l1VarTB.pB().m38114f(wx9.MY_TEAM.getOption()), i);
    }

    public static s47 t0(List list) {
        return list.isEmpty() ? s47.m47673L(Collections.emptyMap()) : uni.kC().TB().Yb(list, null, list.size()).m47686M(new rl7() { // from class: o.tt9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.d0((ryh) obj);
            }
        }).m47686M(new rl7() { // from class: o.ut9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return iu9.e0((ryh) obj);
            }
        });
    }
}
