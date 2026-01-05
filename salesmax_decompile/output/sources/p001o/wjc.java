package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelBusinessConnection;
import com.amazonaws.amplify.generated.graphql.SearchBusinesssQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.SearchableBusinessFilterInput;
import type.SearchableBusinessSortInput;
import type.SearchableBusinessSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public interface wjc extends xjc {
    static /* synthetic */ Map E5(Map map) {
        return (Map) map.get("searchBusinesss");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelBusinessConnection F7(Map map) {
        return (ModelBusinessConnection) sf(map, ModelBusinessConnection.class);
    }

    static /* synthetic */ ryh Xv(ModelBusinessConnection modelBusinessConnection) {
        return uyh.of(modelBusinessConnection.getItems(), modelBusinessConnection.getNextToken());
    }

    static /* synthetic */ SearchBusinesssQuery Y9(SearchBusinesssQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    static /* synthetic */ SearchableBusinessSortInput uy(SearchableBusinessSortableFields searchableBusinessSortableFields) {
        return SearchableBusinessSortInput.builder().field(searchableBusinessSortableFields).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults vb(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new pjc(this), ryhVar, i);
    }

    default s47 Bj(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Ov()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.rjc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f43718a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.sjc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return wjc.E5((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.tjc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f47291a.F7((Map) obj);
            }
        }).m27845m();
    }

    default SimpleGraphQLRequest G3(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableBusinessFilterInput searchableBusinessFilterInput = (SearchableBusinessFilterInput) ryhVar.f44265a;
        SearchableBusinessSortInput searchableBusinessSortInput = (SearchableBusinessSortInput) ryhVar.f44266b;
        final SearchBusinesssQuery.Builder builder = SearchBusinesssQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableBusinessFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.ujc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filter((SearchableBusinessFilterInput) obj);
            }
        });
        Optional.ofNullable(searchableBusinessSortInput).ifPresent(new Consumer() { // from class: o.vjc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sort((SearchableBusinessSortInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchBusinesss($filter: SearchableBusinessFilterInput, $sort: SearchableBusinessSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchBusinesss(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      industry\n      priority\n      website\n      domain\n      logo\n      userDefinedTags\n      addedById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchBusinesssQuery) optional.map(new Function() { // from class: o.mjc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wjc.Y9(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 h6(String str, String str2, final int i) {
        final ryh ryhVarOf = uyh.of(SearchableBusinessFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).name(SearchableStringFilterInput.builder().matchPhrasePrefix(str).build()).build(), (SearchableBusinessSortInput) Optional.ofNullable(str2).map(new Function() { // from class: o.ljc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SearchableBusinessSortableFields.valueOf((String) obj);
            }
        }).map(new Function() { // from class: o.njc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wjc.uy((SearchableBusinessSortableFields) obj);
            }
        }).orElse(SearchableBusinessSortInput.builder().field(SearchableBusinessSortableFields.updatedAt).build()));
        return s47.m47669H(new Callable() { // from class: o.ojc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f38447a.vb(ryhVarOf, i);
            }
        });
    }

    default s47 i7(ryh ryhVar, String str, int i) {
        return Bj(G3(uyh.of((SearchableBusinessFilterInput) ryhVar.f44265a, (SearchableBusinessSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.qjc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return wjc.Xv((ModelBusinessConnection) obj);
            }
        });
    }
}
