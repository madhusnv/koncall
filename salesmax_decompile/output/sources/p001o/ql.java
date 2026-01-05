package p001o;

import ai.salesmax.services.model.ModelAccountUpdatesConnection;
import com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import type.ModelAccountUpdatesFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes.dex */
public interface ql extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 A5(String str, int i, String str2) {
        return z3(uyh.of(str, on(), null), str2, i);
    }

    static /* synthetic */ Map At(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelAccountUpdatesConnection Z1(Map map) {
        return (ModelAccountUpdatesConnection) sf(map, ModelAccountUpdatesConnection.class);
    }

    static /* synthetic */ ryh nt(ModelAccountUpdatesConnection modelAccountUpdatesConnection) {
        return uyh.of(modelAccountUpdatesConnection.getItems(), modelAccountUpdatesConnection.getNextToken());
    }

    static /* synthetic */ GetAccountChangesByAccountQuery p9(GetAccountChangesByAccountQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    default s47 Gj(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(xb()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.ll
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f33980a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.nl
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ql.At(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ol
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38521a.Z1((Map) obj);
            }
        }).m27845m();
    }

    default s47 Tj(final String str) {
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.pl
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f40206a.A5(str, i, (String) obj);
            }
        });
    }

    default SimpleGraphQLRequest md(String str, String str2, ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput, Optional optional, final int i) {
        if (Objects.isNull(str2) && !optional.isPresent()) {
            return null;
        }
        final GetAccountChangesByAccountQuery.Builder builderLimit = GetAccountChangesByAccountQuery.builder().accountId(str2).updatedAt(ModelStringKeyConditionInput.builder().ge(str).build()).sortDirection(ModelSortDirection.DESC).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(modelAccountUpdatesFilterInput);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.jl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.filter((ModelAccountUpdatesFilterInput) obj);
            }
        });
        GetAccountChangesByAccountQuery getAccountChangesByAccountQuery = (GetAccountChangesByAccountQuery) optional.map(new Function() { // from class: o.kl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ql.p9(builderLimit, i, (String) obj);
            }
        }).orElse(builderLimit.build());
        return new SimpleGraphQLRequest(getAccountChangesByAccountQuery.queryDocument(), toVariablesMap(getAccountChangesByAccountQuery), Map.class, new GsonVariablesSerializer());
    }

    default SimpleGraphQLRequest mv(String str, String str2, ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput, Optional optional, int i) {
        return md(str, str2, modelAccountUpdatesFilterInput, optional, i);
    }

    default ModelAccountUpdatesConnection xb() {
        return ModelAccountUpdatesConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 z3(syh syhVar, String str, int i) {
        return Gj(mv((String) syhVar.f46121a, (String) syhVar.f46122b, (ModelAccountUpdatesFilterInput) syhVar.f46123c, Optional.ofNullable(str), i), "getAccountChangesByAccount").m47686M(new rl7() { // from class: o.il
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ql.nt((ModelAccountUpdatesConnection) obj);
            }
        });
    }
}
