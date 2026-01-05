package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelEngagementUpdateConnection;
import com.amazonaws.amplify.generated.graphql.ListAllUpdatesOnEngagementQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.ModelEngagementUpdateFilterInput;
import type.ModelSortDirection;

/* loaded from: classes.dex */
public interface hpc extends me1 {
    static /* synthetic */ ListAllUpdatesOnEngagementQuery Dg(ListAllUpdatesOnEngagementQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    static /* synthetic */ Map Gl(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Px(String str, int i) {
        return new PaginatedTokenResults(new apc(this), uyh.of(str, null), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelEngagementUpdateConnection Y8(Map map) {
        return (ModelEngagementUpdateConnection) sf(map, ModelEngagementUpdateConnection.class);
    }

    static /* synthetic */ ryh b4(ModelEngagementUpdateConnection modelEngagementUpdateConnection) {
        return uyh.of(modelEngagementUpdateConnection.getItems(), modelEngagementUpdateConnection.getNextToken());
    }

    default SimpleGraphQLRequest Br(String str, ModelEngagementUpdateFilterInput modelEngagementUpdateFilterInput, Optional optional, final int i) {
        if (Objects.isNull(str) && !optional.isPresent()) {
            return null;
        }
        final ListAllUpdatesOnEngagementQuery.Builder builderEngagementId = ListAllUpdatesOnEngagementQuery.builder().limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC).engagementId(str);
        Optional optionalOfNullable = Optional.ofNullable(modelEngagementUpdateFilterInput);
        Objects.requireNonNull(builderEngagementId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.fpc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderEngagementId.filter((ModelEngagementUpdateFilterInput) obj);
            }
        });
        ListAllUpdatesOnEngagementQuery listAllUpdatesOnEngagementQuery = (ListAllUpdatesOnEngagementQuery) optional.map(new Function() { // from class: o.gpc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return hpc.Dg(builderEngagementId, i, (String) obj);
            }
        }).orElse(builderEngagementId.build());
        return new SimpleGraphQLRequest(listAllUpdatesOnEngagementQuery.queryDocument(), toVariablesMap(listAllUpdatesOnEngagementQuery), Map.class, new GsonVariablesSerializer());
    }

    default s47 G4(ryh ryhVar, String str, int i) {
        return fm(Re((String) ryhVar.f44265a, (ModelEngagementUpdateFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), "listAllUpdatesOnEngagement").m47686M(new rl7() { // from class: o.bpc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return hpc.b4((ModelEngagementUpdateConnection) obj);
            }
        });
    }

    default ModelEngagementUpdateConnection Hq() {
        return ModelEngagementUpdateConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 Kh(final String str, final int i) {
        return s47.m47669H(new Callable() { // from class: o.zoc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f57457a.Px(str, i);
            }
        });
    }

    default SimpleGraphQLRequest Re(String str, ModelEngagementUpdateFilterInput modelEngagementUpdateFilterInput, Optional optional, int i) {
        return Br(str, modelEngagementUpdateFilterInput, optional, i);
    }

    default s47 fm(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Hq()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.cpc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f18486a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.dpc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return hpc.Gl(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.epc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22027a.Y8((Map) obj);
            }
        }).m27845m();
    }
}
