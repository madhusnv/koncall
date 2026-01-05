package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelNotificationStagingConnection;
import com.amazonaws.amplify.generated.graphql.ListAllNotificationsByOwnerQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import type.C19192x9c702555;
import type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput;
import type.ModelSortDirection;

/* loaded from: classes.dex */
public interface qqc extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelNotificationStagingConnection Na(ListAllNotificationsByOwnerQuery.ListAllNotificationsByOwner listAllNotificationsByOwner) {
        return (ModelNotificationStagingConnection) sf(listAllNotificationsByOwner, ModelNotificationStagingConnection.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults jm(String str, int i) {
        return new PaginatedTokenResults(new iqc(this), str, i);
    }

    static /* synthetic */ ryh rm(ModelNotificationStagingConnection modelNotificationStagingConnection) {
        return uyh.of(modelNotificationStagingConnection.getItems(), modelNotificationStagingConnection.getNextToken());
    }

    static /* synthetic */ void up(ListAllNotificationsByOwnerQuery.Builder builder, String str, String str2, String str3) {
        builder.ownerIdScheduledAt(C19192x9c702555.builder().between(Arrays.asList(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.builder().ownerId(str3).scheduledAt(str).build(), ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.builder().ownerId(str3).scheduledAt(str2).build())).build());
    }

    default s47 C6(String str, String str2, int i) {
        final ListAllNotificationsByOwnerQuery.Builder builderAccountId = ListAllNotificationsByOwnerQuery.builder().accountId(on());
        final String strM16653h = a81.m16653h(Long.valueOf(System.currentTimeMillis()));
        final String strM16653h2 = a81.m16653h(Long.valueOf(a81.m16664s() - 604800000));
        Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.jqc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                qqc.up(builderAccountId, strM16653h2, strM16653h, (String) obj);
            }
        });
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderAccountId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.kqc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.nextToken((String) obj);
            }
        });
        ListAllNotificationsByOwnerQuery listAllNotificationsByOwnerQueryBuild = builderAccountId.limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC).build();
        return executeGraphQL(new SimpleGraphQLRequest(listAllNotificationsByOwnerQueryBuild.queryDocument(), toVariablesMap(listAllNotificationsByOwnerQueryBuild), ListAllNotificationsByOwnerQuery.Data.class, new GsonVariablesSerializer())).m55014i(new ggd() { // from class: o.lqc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f34258a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new rl7() { // from class: o.mqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (ListAllNotificationsByOwnerQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.nqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ListAllNotificationsByOwnerQuery.Data) obj).listAllNotificationsByOwner();
            }
        }).m27844k(new rl7() { // from class: o.oqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38730a.Na((ListAllNotificationsByOwnerQuery.ListAllNotificationsByOwner) obj);
            }
        }).m27844k(new rl7() { // from class: o.pqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return qqc.rm((ModelNotificationStagingConnection) obj);
            }
        }).m27845m();
    }

    default s47 xi(final String str, final int i) {
        return s47.m47669H(new Callable() { // from class: o.hqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27371a.jm(str, i);
            }
        });
    }
}
