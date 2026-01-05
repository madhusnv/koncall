package p001o;

import ai.salesmax.services.model.ModelAccountMemberActivityConnection;
import com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface xe extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelAccountMemberActivityConnection Ii(ListAccountMemberActivityQuery.ListAccountMemberActivity listAccountMemberActivity) {
        return (ModelAccountMemberActivityConnection) sf(listAccountMemberActivity, ModelAccountMemberActivityConnection.class);
    }

    static /* synthetic */ ListAccountMemberActivityQuery q5(ListAccountMemberActivityQuery.Builder builder, String str) {
        return builder.nextToken(str).build();
    }

    static /* synthetic */ ryh x3(ModelAccountMemberActivityConnection modelAccountMemberActivityConnection) {
        return uyh.of(modelAccountMemberActivityConnection.getItems(), modelAccountMemberActivityConnection.getNextToken());
    }

    default s47 at() {
        final String strOn = on();
        final int i = 500;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.qe
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f41738a.Be(strOn, i, (String) obj);
            }
        });
    }

    default s47 j1(String str, String str2, int i) {
        final ListAccountMemberActivityQuery.Builder builderLimit = ListAccountMemberActivityQuery.builder().accountId(str).limit(Integer.valueOf(i));
        return executeGraphQL(new SimpleGraphQLRequest("query ListAccountMemberActivity($accountId: ID, $userId: ModelIDKeyConditionInput, $filter: ModelAccountMemberActivityFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listAccountMemberActivity(accountId: $accountId, userId: $userId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    items {\n      userId\n      lastActivityId\n      lastActivityTime\n      lastActivityType\n      lastActivityBody\n    }\n    nextToken\n  }\n}", toVariablesMap((ListAccountMemberActivityQuery) Optional.ofNullable(str2).map(new Function() { // from class: o.se
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return xe.q5(builderLimit, (String) obj);
            }
        }).orElse(builderLimit.build())), ListAccountMemberActivityQuery.Data.class, new GsonVariablesSerializer())).m55014i(new ggd() { // from class: o.te
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f46917a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new rl7() { // from class: o.ue
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (ListAccountMemberActivityQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.ve
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ListAccountMemberActivityQuery.Data) obj).listAccountMemberActivity();
            }
        }).m27844k(new rl7() { // from class: o.we
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f51825a.Ii((ListAccountMemberActivityQuery.ListAccountMemberActivity) obj);
            }
        }).m27845m();
    }

    /* renamed from: qz, reason: merged with bridge method [inline-methods] */
    default s47 Be(String str, String str2, int i) {
        return j1(str, str2, i).m47686M(new rl7() { // from class: o.re
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return xe.x3((ModelAccountMemberActivityConnection) obj);
            }
        });
    }
}
