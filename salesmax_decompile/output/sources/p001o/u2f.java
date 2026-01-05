package p001o;

import com.amazonaws.amplify.generated.graphql.UpdateSavedTableViewsMutation;
import com.amplifyframework.datastore.generated.model.SavedTableViews;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import type.ScopeLevel;
import type.UpdateSavedTableViewsInput;

/* loaded from: classes.dex */
public interface u2f extends me1 {
    default UpdateSavedTableViewsInput Ib(SavedTableViews savedTableViews) {
        final UpdateSavedTableViewsInput.Builder builder = UpdateSavedTableViewsInput.builder();
        builder.accountId(on());
        builder.ownerId(Eo());
        Optional.ofNullable(savedTableViews.getOwnerId()).ifPresent(new Consumer() { // from class: o.k2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.ownerId((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getTableName()).ifPresent(new Consumer() { // from class: o.a2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.tableName((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getColumnState()).ifPresent(new Consumer() { // from class: o.f2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.columnState((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getFilterModel()).ifPresent(new Consumer() { // from class: o.g2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.filterModel((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getAddedToAppHomeOn()).map(new ri()).ifPresent(new Consumer() { // from class: o.h2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.addedToAppHomeOn((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getForAuthorizations()).ifPresent(new Consumer() { // from class: o.i2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.forAuthorizations((List) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getForTeamIds()).ifPresent(new Consumer() { // from class: o.j2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.forTeamIds((List) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getForAuthorizations()).ifPresent(new Consumer() { // from class: o.i2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.forAuthorizations((List) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getForUserIds()).ifPresent(new Consumer() { // from class: o.l2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.forUserIds((List) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getScopeId()).ifPresent(new Consumer() { // from class: o.m2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.scopeId((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getScopeLevel()).map(new bwc()).map(new nsc()).ifPresent(new Consumer() { // from class: o.n2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.scopeLevel((ScopeLevel) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getHiddenColumnms()).ifPresent(new Consumer() { // from class: o.o2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.hiddenColumnms((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getIsMetrics()).ifPresent(new Consumer() { // from class: o.p2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isMetrics((Boolean) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getIsSystemCreated()).ifPresent(new Consumer() { // from class: o.q2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isSystemCreated((Boolean) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getShowMetricsInApp()).ifPresent(new Consumer() { // from class: o.r2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.showMetricsInApp((Boolean) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getShowMetricsOnDashboard()).ifPresent(new Consumer() { // from class: o.s2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.showMetricsOnDashboard((Boolean) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getSortModel()).ifPresent(new Consumer() { // from class: o.t2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.sortModel((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getIsOnlyMetrics()).ifPresent(new Consumer() { // from class: o.b2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isOnlyMetrics((Boolean) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getCreatedAt()).map(new ri()).ifPresent(new Consumer() { // from class: o.c2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.createdAt((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getUpdatedAt()).map(new ri()).ifPresent(new Consumer() { // from class: o.d2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.updatedAt((String) obj);
            }
        });
        Optional.ofNullable(savedTableViews.getViewName()).ifPresent(new Consumer() { // from class: o.e2f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.viewName((String) obj);
            }
        });
        return builder.build();
    }

    default x6c Rn(UpdateSavedTableViewsInput updateSavedTableViewsInput) {
        return graphqlMutation(UpdateSavedTableViewsMutation.builder().input(updateSavedTableViewsInput).build(), "mutation UpdateSavedTableViews($input: UpdateSavedTableViewsInput!, $condition: ModelSavedTableViewsConditionInput) {\n  updateSavedTableViews(input: $input, condition: $condition) {\n    __typename\n    accountId\n    ownerId\n    tableName\n    viewName\n    isSystemCreated\n    includeAll\n    filterModel\n    columnState\n    sortModel\n    hiddenColumnms\n    scopeLevel\n    scopeId\n    showMetricsInApp\n    addedToAppHomeOn\n    createdAt\n    updatedAt\n  }\n}", UpdateSavedTableViewsMutation.Data.class, new Function() { // from class: o.z1f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateSavedTableViewsMutation.Data) obj).updateSavedTableViews();
            }
        }, SavedTableViews.class);
    }

    default x6c bx(SavedTableViews savedTableViews) {
        return Rn(Ib(savedTableViews));
    }
}
