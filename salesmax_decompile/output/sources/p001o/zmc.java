package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelDealConnection;
import com.amazonaws.amplify.generated.graphql.SearchDealsQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.SearchableDealFilterInput;
import type.SearchableDealSortInput;
import type.SearchableDealSortableFields;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public interface zmc extends onc {
    static /* synthetic */ SearchDealsQuery Kn(SearchDealsQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void Me(Map map, Map map2) {
        List list = (List) map2.get("items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Map map3 = (Map) obj;
            map3.put("contact", (Map) Optional.ofNullable((Map) map3.getOrDefault("contact", Collections.emptyMap())).map(new Function() { // from class: o.qmc
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return this.f42173a.Tn((Map) obj2);
                }
            }).orElse(null));
            arrayList.add(obj);
        }
        map.put("associations", list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map T5(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.pmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f40269a.Fm((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ Map T7(Map map) {
        return (Map) map.get("searchDeals");
    }

    static /* synthetic */ void i8(Map map, Map map2) {
        map.put("businesses", (List) map2.get("items"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults r6(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new xmc(this), ryhVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelDealConnection s3(Map map) {
        return (ModelDealConnection) sf(map, ModelDealConnection.class);
    }

    static /* synthetic */ ryh v5(ModelDealConnection modelDealConnection) {
        return uyh.of(modelDealConnection.getItems(), modelDealConnection.getNextToken());
    }

    default Map Fm(final Map map) {
        Optional.ofNullable((Map) map.get("associations")).ifPresent(new Consumer() { // from class: o.imc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f28914a.Me(map, (Map) obj);
            }
        });
        return map;
    }

    default s47 K5(final ryh ryhVar, final int i) {
        return s47.m47669H(new Callable() { // from class: o.wmc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f52347a.r6(ryhVar, i);
            }
        });
    }

    default Map Tn(final Map map) {
        Optional.ofNullable((Map) map.get("businesses")).ifPresent(new Consumer() { // from class: o.rmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zmc.i8(map, (Map) obj);
            }
        });
        return map;
    }

    default SearchableDealSortInput Uy(SearchableDealSortInput searchableDealSortInput) {
        return (SearchableDealSortInput) Optional.ofNullable(searchableDealSortInput).orElse(SearchableDealSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableDealSortableFields.updatedAt).build());
    }

    default x6c bf(ryh ryhVar) {
        return executeGraphQL(new SimpleGraphQLRequest("query SearchDeals($filter: SearchableDealFilterInput, $sort: SearchableDealSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchDeals(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(SearchDealsQuery.builder().filter((SearchableDealFilterInput) ryhVar.f44265a).limit(1).build()), SearchDealsQuery.Data.class, new GsonVariablesSerializer())).m55014i(new smc(this)).m27844k(new rl7() { // from class: o.tmc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (SearchDealsQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.umc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((SearchDealsQuery.Data) obj).searchDeals();
            }
        }).m27844k(new rl7() { // from class: o.vmc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((SearchDealsQuery.SearchDeals) obj).total();
            }
        }).m27846n();
    }

    default SimpleGraphQLRequest fA(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableDealFilterInput searchableDealFilterInput = (SearchableDealFilterInput) ryhVar.f44265a;
        SearchableDealSortInput searchableDealSortInput = (SearchableDealSortInput) ryhVar.f44266b;
        final SearchDealsQuery.Builder builder = SearchDealsQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableDealFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.mmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filter((SearchableDealFilterInput) obj);
            }
        });
        Optional.ofNullable(Uy(searchableDealSortInput)).ifPresent(new Consumer() { // from class: o.nmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sort((SearchableDealSortInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchDeals($filter: SearchableDealFilterInput, $sort: SearchableDealSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchDeals(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      tags\n      recentEngagements\n      lastActivity\n      customDealData\n      dealStageCustomValues {\n         __typename\n         dealStage\n         customValue\n      }\n      createdAt\n      updatedAt\n         associations(filter: {contactId: {attributeExists: true}}) {\n             items {\n      __typename\n      id\n      accountId\n      dealId\n      contactId\n      contact {\n      id\n      ownerId\n      toBeAssigned\n      contactNumberDetail {\n        phoneNumber\n        isWhatsappNumber\n      }\n      contactSource\n      emails {\n        email\n      }\n      businessDetail {\n          id\n          name\n          website\n          industry\n      }\n      name\n      profilePhotoUrl\n      lastCalledTime\n      lastCallDirection\n      lastCallDuration\n      unsuccessfulCallAttempts\n      isCustomer\n      becameCustomerOn\n      latestRemark\n      paymentRequestDetail\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      nextProspectingDueOn\n      nextProspectingNote\n      openVideoCallDetail\n      createdAt\n      updatedAt\n      }\n      businessId\n      createdAt\n      updatedAt\n             }\n         }\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchDealsQuery) optional.map(new Function() { // from class: o.omc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return zmc.Kn(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 h2(ryh ryhVar, String str, int i) {
        return vn(fA(uyh.of((SearchableDealFilterInput) ryhVar.f44265a, (SearchableDealSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.ymc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return zmc.v5((ModelDealConnection) obj);
            }
        });
    }

    default ModelDealConnection v2() {
        return ModelDealConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 vn(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(v2()) : executeGraphQL(simpleGraphQLRequest).m55014i(new smc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.jmc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return zmc.T7((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.kmc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f32450a.T5((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.lmc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f34044a.s3((Map) obj);
            }
        }).m27845m();
    }
}
