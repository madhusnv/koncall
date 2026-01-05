package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.QueryActivityListQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.ModelActivityConnection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.ActivityListQueryType;
import type.ModelActivityFilterInput;
import type.ModelSortDirection;
import type.QueryActivityListInput;

/* loaded from: classes.dex */
public interface kjc extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Q6(QueryActivityListInput queryActivityListInput, int i) {
        return new PaginatedTokenResults(new djc(this), uyh.of(queryActivityListInput, null), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelActivityConnection b6(Map map) {
        return (ModelActivityConnection) sf(map, ModelActivityConnection.class);
    }

    static /* synthetic */ QueryActivityListQuery c5(QueryActivityListQuery.Builder builder, String str) {
        return builder.nextToken(str).build();
    }

    static ModelActivityConnection iv() {
        return ModelActivityConnection.builder().items(Collections.emptyList()).nextToken(null).startedAt(Temporal.Timestamp.now()).build();
    }

    static /* synthetic */ Map ka(Map map) {
        return (Map) map.get("queryActivityList");
    }

    static /* synthetic */ ryh u2(ModelActivityConnection modelActivityConnection) {
        return uyh.of(modelActivityConnection.getItems(), modelActivityConnection.getNextToken());
    }

    default s47 L1(String str, String str2, final int i) {
        final QueryActivityListInput queryActivityListInputBuild = QueryActivityListInput.builder().accountId(on()).contactId(str).queryType(ActivityListQueryType.BY_CONTACT).build();
        return s47.m47669H(new Callable() { // from class: o.cjc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18251a.Q6(queryActivityListInputBuild, i);
            }
        });
    }

    default s47 Q9(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(iv()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.hjc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f27058a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.ijc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kjc.ka((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.jjc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f30507a.b6((Map) obj);
            }
        }).m27845m();
    }

    default s47 fv(ryh ryhVar, String str, int i) {
        return Q9(hc((QueryActivityListInput) ryhVar.f44265a, (ModelActivityFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.ejc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kjc.u2((ModelActivityConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest hc(QueryActivityListInput queryActivityListInput, ModelActivityFilterInput modelActivityFilterInput, Optional optional, int i) {
        if (Objects.isNull(queryActivityListInput) && !optional.isPresent()) {
            return null;
        }
        final QueryActivityListQuery.Builder builderSortDirection = QueryActivityListQuery.builder().input(queryActivityListInput).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(modelActivityFilterInput);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.fjc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.filter((ModelActivityFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query QueryActivityList($input: QueryActivityListInput!, $sortDirection: ModelSortDirection, $filter: ModelActivityFilterInput, $limit: Int, $nextToken: String) {\n  queryActivityList(input: $input, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      id\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    startedAt\n  }\n}", toVariablesMap((QueryActivityListQuery) optional.map(new Function() { // from class: o.gjc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kjc.c5(builderSortDirection, (String) obj);
            }
        }).orElse(builderSortDirection.build())), Map.class, new GsonVariablesSerializer());
    }
}
