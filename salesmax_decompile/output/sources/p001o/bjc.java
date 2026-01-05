package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.SearchActivitysQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelActivityConnection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.SearchableActivityFilterInput;
import type.SearchableActivitySortInput;
import type.SearchableActivitySortableFields;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public interface bjc extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Am(ryh ryhVar, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new uic(this), ryhVar, i, x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults bv(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new uic(this), ryhVar, i);
    }

    static /* synthetic */ ryh g8(ModelActivityConnection modelActivityConnection) {
        return uyh.of(modelActivityConnection.getItems(), modelActivityConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelActivityConnection gm(Map map) {
        return (ModelActivityConnection) sf(map, ModelActivityConnection.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults hb(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new uic(this), ryhVar, i);
    }

    static /* synthetic */ SearchActivitysQuery tf(SearchActivitysQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    static /* synthetic */ Map uo(Map map) {
        return (Map) map.get("searchActivitys");
    }

    default SearchableActivitySortInput C7(SearchableActivitySortInput searchableActivitySortInput) {
        return (SearchableActivitySortInput) Optional.ofNullable(searchableActivitySortInput).orElse(SearchableActivitySortInput.builder().direction(SearchableSortDirection.desc).field(SearchableActivitySortableFields.updatedAt).build());
    }

    default s47 Le(lv lvVar, final int i) {
        final ryh ryhVarM19248Y = m19248Y(lvVar);
        return s47.m47669H(new Callable() { // from class: o.sic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45456a.bv(ryhVarM19248Y, i);
            }
        });
    }

    /* renamed from: Y */
    default ryh m19248Y(lv lvVar) {
        return lvVar.m37975w(on(), Eo());
    }

    default s47 ao(final ryh ryhVar, final int i) {
        return s47.m47669H(new Callable() { // from class: o.qic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42039a.hb(ryhVar, i);
            }
        });
    }

    default s47 cp(ryh ryhVar, String str, int i) {
        return eg(yj(uyh.of((SearchableActivityFilterInput) ryhVar.f44265a, (SearchableActivitySortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.vic
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return bjc.g8((ModelActivityConnection) obj);
            }
        });
    }

    default s47 eg(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(xa()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.zic
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f57257a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.ajc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return bjc.uo((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ric
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f43679a.gm((Map) obj);
            }
        }).m27845m();
    }

    default s47 si(final ryh ryhVar, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.tic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f47203a.Am(ryhVar, i, x6cVar);
            }
        });
    }

    default ModelActivityConnection xa() {
        return ModelActivityConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default SimpleGraphQLRequest yj(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableActivityFilterInput searchableActivityFilterInput = (SearchableActivityFilterInput) ryhVar.f44265a;
        SearchableActivitySortInput searchableActivitySortInput = (SearchableActivitySortInput) ryhVar.f44266b;
        final SearchActivitysQuery.Builder builder = SearchActivitysQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableActivityFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.wic
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filter((SearchableActivityFilterInput) obj);
            }
        });
        Optional.ofNullable(C7(searchableActivitySortInput)).ifPresent(new Consumer() { // from class: o.xic
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sort((SearchableActivitySortInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchActivitys($filter: SearchableActivityFilterInput, $sort: SearchableActivitySortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchActivitys(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      id\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      contact {\n         __typename\n         id\n         accountId\n         ownerId\n         contactSource\n         name\n         profilePhotoUrl\n      }\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchActivitysQuery) optional.map(new Function() { // from class: o.yic
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bjc.tf(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }
}
