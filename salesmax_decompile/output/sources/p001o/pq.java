package p001o;

import ai.salesmax.services.model.ModelActivityLocationConnection;
import com.amazonaws.amplify.generated.graphql.CreateActivityLocationMutation;
import com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery;
import com.amplifyframework.datastore.generated.model.ActivityLocation;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import type.CreateActivityLocationInput;
import type.SearchableActivityLocationFilterInput;
import type.SearchableActivityLocationSortInput;
import type.SearchableActivityLocationSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public interface pq extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c bc(Optional optional) {
        final CreateActivityLocationInput.Builder builderOwnerId = CreateActivityLocationInput.builder().accountId(on()).ownerId(Eo());
        Optional map = optional.map(new Function() { // from class: o.lq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((vha) obj).m52776g());
            }
        }).map(new Function() { // from class: o.nq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Double) obj);
            }
        });
        Objects.requireNonNull(builderOwnerId);
        map.ifPresent(new Consumer() { // from class: o.oq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.lng((String) obj);
            }
        });
        optional.map(new Function() { // from class: o.bq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((vha) obj).m52775f());
            }
        }).map(new Function() { // from class: o.nq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Double) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.cq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.lat((String) obj);
            }
        });
        optional.map(new Function() { // from class: o.dq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((vha) obj).m52773d());
            }
        }).map(new Function() { // from class: o.eq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a81.m16658m((Long) obj);
            }
        }).map(new ri()).ifPresent(new Consumer() { // from class: o.fq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.createdAt((String) obj);
            }
        });
        return graphqlMutation(CreateActivityLocationMutation.builder().input(builderOwnerId.build()).build(), "mutation CreateActivityLocation($input: CreateActivityLocationInput!, $condition: ModelActivityLocationConditionInput) {\n  createActivityLocation(input: $input, condition: $condition) {\n    id\n    accountId\n    engagementId\n    lat\n    lng\n    ownerId\n    createdAt\n    updatedAt\n  }\n}", CreateActivityLocationMutation.Data.class, new mq(), ActivityLocation.class);
    }

    static /* synthetic */ SearchableIDFilterInput r4(String str) {
        return SearchableIDFilterInput.builder().eq(str).build();
    }

    default x6c b9(vha vhaVar) {
        return x6c.c0(Optional.ofNullable(vhaVar)).m55714J(new aq()).m55717M(new rl7() { // from class: o.gq
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f25651a.bc((Optional) obj);
            }
        });
    }

    default x6c lastKnownLocation(String str) {
        final SearchableActivityLocationFilterInput.Builder builderAccountId = SearchableActivityLocationFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build());
        Optional map = Optional.ofNullable(str).map(new Function() { // from class: o.hq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return pq.r4((String) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        map.ifPresent(new Consumer() { // from class: o.iq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderAccountId.ownerId((SearchableIDFilterInput) obj);
            }
        });
        return graphqlQuery(LastKnownLocationQuery.builder().filter(builderAccountId.build()).sort(SearchableActivityLocationSortInput.builder().field(SearchableActivityLocationSortableFields.createdAt).direction(SearchableSortDirection.desc).build()).build(), LastKnownLocationQuery.Data.class, new Function() { // from class: o.jq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LastKnownLocationQuery.Data) obj).lastKnownLocation();
            }
        }, ModelActivityLocationConnection.class).d0(new rl7() { // from class: o.kq
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ModelActivityLocationConnection) obj).getItems();
            }
        });
    }
}
