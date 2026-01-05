package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelEntityListConnection;
import com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.SearchableEntityListFilterInput;
import type.SearchableEntityListSortInput;
import type.SearchableEntityListSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public interface qh6 extends me1 {
    static /* synthetic */ Map Cl(Map map) {
        return (Map) map.get("searchEntityLists");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelEntityListConnection En(Map map) {
        return (ModelEntityListConnection) sf(map, ModelEntityListConnection.class);
    }

    static /* synthetic */ SearchableEntityListSortInput Ev(SearchableEntityListSortableFields searchableEntityListSortableFields) {
        return SearchableEntityListSortInput.builder().field(searchableEntityListSortableFields).build();
    }

    static /* synthetic */ boolean N7(List list) {
        return !list.isEmpty();
    }

    static /* synthetic */ SearchEntityListsQuery Rp(SearchEntityListsQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    static /* synthetic */ ryh W8(ModelEntityListConnection modelEntityListConnection) {
        return uyh.of(modelEntityListConnection.getItems(), modelEntityListConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults fw(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new jh6(this), ryhVar, i);
    }

    static /* synthetic */ boolean jc(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ void m9(SearchableEntityListFilterInput.Builder builder, String str) {
        builder.listCreationType(SearchableStringFilterInput.builder().eq(str).build());
    }

    default SearchableEntityListFilterInput B4(String str, String str2) {
        List<String> list = (List) Arrays.stream(str.split("[\\s,]+")).filter(new Predicate() { // from class: o.kh6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qh6.jc((String) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            arrayList.add(SearchableEntityListFilterInput.builder().or(Arrays.asList(SearchableEntityListFilterInput.builder().listName(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str3)).build()).build(), SearchableEntityListFilterInput.builder().description(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str3)).build()).build())).build());
        }
        final SearchableEntityListFilterInput.Builder builderAccountId = SearchableEntityListFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.lh6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                qh6.m9(builderAccountId, (String) obj);
            }
        });
        Optional optionalFilter = Optional.ofNullable(arrayList).filter(new Predicate() { // from class: o.mh6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qh6.N7((List) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        optionalFilter.ifPresent(new Consumer() { // from class: o.nh6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.and((List) obj);
            }
        });
        return builderAccountId.build();
    }

    default ModelEntityListConnection Cn() {
        return ModelEntityListConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 H8(ryh ryhVar, String str, int i) {
        return ks(Q8(uyh.of((SearchableEntityListFilterInput) ryhVar.f44265a, (SearchableEntityListSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.oh6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return qh6.W8((ModelEntityListConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest Q8(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableEntityListFilterInput searchableEntityListFilterInput = (SearchableEntityListFilterInput) ryhVar.f44265a;
        SearchableEntityListSortInput searchableEntityListSortInput = (SearchableEntityListSortInput) ryhVar.f44266b;
        final SearchEntityListsQuery.Builder builder = SearchEntityListsQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableEntityListFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.ph6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filter((SearchableEntityListFilterInput) obj);
            }
        });
        Optional.ofNullable(searchableEntityListSortInput).ifPresent(new Consumer() { // from class: o.ch6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sort((SearchableEntityListSortInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchEntityLists($filter: SearchableEntityListFilterInput, $sort: SearchableEntityListSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityLists(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchEntityListsQuery) optional.map(new Function() { // from class: o.dh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return qh6.Rp(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    /* renamed from: Z */
    default s47 m45493Z(String str, String str2, String str3, final int i) {
        final ryh ryhVarOf = uyh.of(B4(str, str2), (SearchableEntityListSortInput) Optional.ofNullable(str3).map(new Function() { // from class: o.bh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SearchableEntityListSortableFields.valueOf((String) obj);
            }
        }).map(new Function() { // from class: o.hh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return qh6.Ev((SearchableEntityListSortableFields) obj);
            }
        }).orElse(SearchableEntityListSortInput.builder().field(SearchableEntityListSortableFields.updatedAt).build()));
        return s47.m47669H(new Callable() { // from class: o.ih6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f28661a.fw(ryhVarOf, i);
            }
        });
    }

    default s47 ks(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Cn()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.eh6
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f21612a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.fh6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return qh6.Cl((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.gh6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f25159a.En((Map) obj);
            }
        }).m27845m();
    }
}
