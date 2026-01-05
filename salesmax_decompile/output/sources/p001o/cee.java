package p001o;

import ai.salesmax.services.model.ActivityMetrics;
import com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery;
import com.amazonaws.amplify.generated.graphql.ListRealTimeMetricssQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.RealTimeMetrics;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.MetricsLevel;
import type.ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput;
import type.ModelRealTimeMetricsMetricsByLevelCompositeKeyInput;
import type.ModelRealTimeMetricsPrimaryCompositeKeyConditionInput;
import type.ModelRealTimeMetricsPrimaryCompositeKeyInput;

/* loaded from: classes.dex */
public interface cee extends me1 {

    /* renamed from: d */
    public static final rr1 f18007d;

    /* renamed from: e */
    public static final rr1 f18008e;

    static {
        vr1 vr1VarM53298y = vr1.m53298y();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f18007d = vr1VarM53298y.m53310g(2L, timeUnit).m53304a();
        f18008e = vr1.m53298y().m53310g(2L, timeUnit).m53304a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default RealTimeMetrics Mn(GetMetricsByLevelQuery.Item item) {
        return (RealTimeMetrics) sf(item, RealTimeMetrics.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void Vh(final f3e f3eVar, final f3e f3eVar2, final int i, final GetMetricsByLevelQuery getMetricsByLevelQuery) {
        s47 s47VarIk = ik(getMetricsByLevelQuery);
        gu3 gu3Var = new gu3() { // from class: o.aee
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f14577a.ap(f3eVar, f3eVar2, getMetricsByLevelQuery, i, (GetMetricsByLevelQuery.GetMetricsByLevel) obj);
            }
        };
        Objects.requireNonNull(f3eVar);
        s47VarIk.m47697Z(gu3Var, new wr(f3eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void ap(final f3e f3eVar, final f3e f3eVar2, final GetMetricsByLevelQuery getMetricsByLevelQuery, final int i, GetMetricsByLevelQuery.GetMetricsByLevel getMetricsByLevel) {
        String strNextToken = getMetricsByLevel.nextToken();
        List listW2 = W2(getMetricsByLevel.items());
        Objects.requireNonNull(f3eVar);
        listW2.forEach(new Consumer() { // from class: o.bee
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                f3eVar.mo16560e((RealTimeMetrics) obj);
            }
        });
        if (Optional.ofNullable(strNextToken).isPresent()) {
            Optional.of(strNextToken).ifPresent(new Consumer() { // from class: o.pde
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f39916a.wh(getMetricsByLevelQuery, i, f3eVar2, (String) obj);
                }
            });
        } else {
            f3eVar2.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default RealTimeMetrics kn(ListRealTimeMetricssQuery.Item item) {
        return (RealTimeMetrics) sf(item, RealTimeMetrics.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void wh(GetMetricsByLevelQuery getMetricsByLevelQuery, int i, f3e f3eVar, String str) {
        f3eVar.mo16560e(GetMetricsByLevelQuery.builder().accountId(on()).metricsLevelPeriod(getMetricsByLevelQuery.variables().metricsLevelPeriod()).nextToken(str).limit(Integer.valueOf(i)).build());
    }

    default x6c Fi(String str) {
        return ha(ListRealTimeMetricssQuery.builder().accountId(on()).entityIdMetricsLevelPeriodMetricsName(ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.builder().beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput.builder().entityId(str).metricsLevel(MetricsLevel.LEAD).build()).build()).limit(Integer.valueOf(((ActivityMetrics.MetricsName.values().length + 10) * ActivityMetrics.Period.values().length) + 1)).build());
    }

    default List Oe(List list) {
        return (List) list.stream().map(new Function() { // from class: o.yde
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f55323a.kn((ListRealTimeMetricssQuery.Item) obj);
            }
        }).collect(Collectors.toList());
    }

    default x6c Pj(String str) {
        return ha(ListRealTimeMetricssQuery.builder().accountId(on()).entityIdMetricsLevelPeriodMetricsName(ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.builder().beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput.builder().entityId(str).metricsLevel(MetricsLevel.USER).build()).build()).limit(Integer.valueOf(((ActivityMetrics.MetricsName.values().length + 10) * ActivityMetrics.Period.values().length) + 1)).build());
    }

    default x6c Su(String str) {
        return ha(ListRealTimeMetricssQuery.builder().accountId(on()).entityIdMetricsLevelPeriodMetricsName(ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.builder().beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput.builder().entityId(str).metricsLevel(MetricsLevel.ACCOUNT).build()).build()).limit(Integer.valueOf(((ActivityMetrics.MetricsName.values().length + 10) * ActivityMetrics.Period.values().length) + 1)).build());
    }

    default x6c Sx(MetricsLevel metricsLevel, ActivityMetrics.Period period, int i) {
        final GetMetricsByLevelQuery getMetricsByLevelQueryBuild = GetMetricsByLevelQuery.builder().accountId(on()).metricsLevelPeriod(ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.builder().eq(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.builder().metricsLevel(metricsLevel).period(period.name()).build()).build()).limit(Integer.valueOf(i)).build();
        final f3e f3eVarN0 = f3e.N0();
        f3e f3eVarN02 = f3e.N0();
        gu3 gu3VarNc = nc(f3eVarN0, f3eVarN02, i);
        Objects.requireNonNull(f3eVarN02);
        f3eVarN0.w0(gu3VarNc, new wr(f3eVarN02), new js3(f3eVarN02));
        return f3eVarN02.C0(la1.BUFFER).m47680A(new gu3() { // from class: o.xde
            @Override // p001o.gu3
            public final void accept(Object obj) {
                f3eVarN0.mo16560e(getMetricsByLevelQueryBuild);
            }
        }).h0();
    }

    default x6c Ve(String str, ActivityMetrics.Period period) {
        return ha(ListRealTimeMetricssQuery.builder().accountId(on()).entityIdMetricsLevelPeriodMetricsName(ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.builder().beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput.builder().entityId(str).metricsLevel(MetricsLevel.USER).period(period.name()).build()).build()).limit(Integer.valueOf(ActivityMetrics.MetricsName.values().length + 11)).build());
    }

    default List W2(List list) {
        return (List) list.stream().map(new Function() { // from class: o.sde
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45290a.Mn((GetMetricsByLevelQuery.Item) obj);
            }
        }).collect(Collectors.toList());
    }

    default x6c ha(ListRealTimeMetricssQuery listRealTimeMetricssQuery) {
        return executeGraphQL(new SimpleGraphQLRequest("query ListRealTimeMetricss($accountId: ID, $entityIdMetricsLevelPeriodMetricsName: ModelRealTimeMetricsPrimaryCompositeKeyConditionInput, $filter: ModelRealTimeMetricsFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listRealTimeMetricss(accountId: $accountId, entityIdMetricsLevelPeriodMetricsName: $entityIdMetricsLevelPeriodMetricsName, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    items {\n      metricsLevel\n      entityId\n      metricsName\n      period\n      metricValue\n    }\n    nextToken\n  }\n}", toVariablesMap(listRealTimeMetricssQuery), ListRealTimeMetricssQuery.Data.class, new GsonVariablesSerializer())).m55014i(new ode(this)).m27844k(new rl7() { // from class: o.tde
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (ListRealTimeMetricssQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.ude
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ListRealTimeMetricssQuery.Data) obj).listRealTimeMetricss();
            }
        }).m27844k(new rl7() { // from class: o.vde
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ListRealTimeMetricssQuery.ListRealTimeMetricss) obj).items();
            }
        }).m27844k(new rl7() { // from class: o.wde
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f51820a.Oe((List) obj);
            }
        }).m27846n();
    }

    default s47 ik(GetMetricsByLevelQuery getMetricsByLevelQuery) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetMetricsByLevel($accountId: ID, $metricsLevelPeriod: ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelRealTimeMetricsFilterInput, $limit: Int, $nextToken: String){\n  getMetricsByLevel(accountId: $accountId, metricsLevelPeriod: $metricsLevelPeriod, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    items {\n      metricsLevel\n      entityId\n      metricsName\n      period\n      metricValue\n    }\n    nextToken\n  }\n}", toVariablesMap(getMetricsByLevelQuery), GetMetricsByLevelQuery.Data.class, new GsonVariablesSerializer())).m55014i(new ode(this)).m27844k(new rl7() { // from class: o.qde
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (GetMetricsByLevelQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.rde
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((GetMetricsByLevelQuery.Data) obj).getMetricsByLevel();
            }
        }).m27845m();
    }

    default gu3 nc(final f3e f3eVar, final f3e f3eVar2, final int i) {
        return new gu3() { // from class: o.zde
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f56994a.Vh(f3eVar2, f3eVar, i, (GetMetricsByLevelQuery) obj);
            }
        };
    }

    default x6c t2(String str) {
        return ha(ListRealTimeMetricssQuery.builder().accountId(on()).entityIdMetricsLevelPeriodMetricsName(ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.builder().beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput.builder().entityId(str).metricsLevel(MetricsLevel.TEAM).build()).build()).limit(Integer.valueOf(((ActivityMetrics.MetricsName.values().length + 10) * ActivityMetrics.Period.values().length) + 1)).build());
    }
}
