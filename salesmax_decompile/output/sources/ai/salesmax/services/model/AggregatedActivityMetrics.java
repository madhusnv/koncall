package ai.salesmax.services.model;

import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.AggregatedActivityMetrics;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class AggregatedActivityMetrics extends ActivityMetrics {
    private Set<ActivityMetrics> activityMetricsList;
    private String entityId;

    public AggregatedActivityMetrics(String str) {
        this(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$updateRealTimeMetrics$0(ActivityMetrics activityMetrics, ActivityMetrics activityMetrics2) {
        return activityMetrics2.getId().equalsIgnoreCase(activityMetrics.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateRealTimeMetrics$1(ActivityMetrics activityMetrics, ActivityMetrics activityMetrics2) {
        activityMetrics2.updateRealTimeMetrics(activityMetrics.realTimeMetrics);
    }

    public void aggregate(ActivityMetrics activityMetrics) {
        if (Objects.isNull(activityMetrics)) {
            return;
        }
        if (this.activityMetricsList.isEmpty()) {
            this.realTimeMetrics = activityMetrics.realTimeMetrics;
            this.activityMetricsList.add(activityMetrics);
        } else if (activityMetrics.getMetricsName().equalsIgnoreCase(getMetricsName()) && activityMetrics.getPeriod().equals(getPeriod())) {
            this.activityMetricsList.add(activityMetrics);
        }
    }

    @Override // ai.salesmax.services.model.ActivityMetrics
    public String getEntityId() {
        return this.entityId;
    }

    @Override // ai.salesmax.services.model.ActivityMetrics
    public String getId() {
        return (String) this.activityMetricsList.stream().map(new Function() { // from class: o.c90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ActivityMetrics) obj).getId();
            }
        }).collect(Collectors.joining(","));
    }

    @Override // ai.salesmax.services.model.ActivityMetrics
    public Long getMetricsValue() {
        return (Long) this.activityMetricsList.stream().map(new Function() { // from class: o.d90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ActivityMetrics) obj).getMetricsValue();
            }
        }).collect(Collectors.summingLong(new ToLongFunction() { // from class: o.e90
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Long) obj).longValue();
            }
        }));
    }

    public ActivityMetrics updateRealTimeMetrics(final ActivityMetrics activityMetrics) {
        this.activityMetricsList.stream().filter(new Predicate() { // from class: o.a90
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AggregatedActivityMetrics.lambda$updateRealTimeMetrics$0(activityMetrics, (ActivityMetrics) obj);
            }
        }).forEach(new Consumer() { // from class: o.b90
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AggregatedActivityMetrics.lambda$updateRealTimeMetrics$1(activityMetrics, (ActivityMetrics) obj);
            }
        });
        return this;
    }

    public AggregatedActivityMetrics(String str, ActivityMetrics activityMetrics) {
        this.activityMetricsList = new HashSet();
        this.entityId = str;
        aggregate(activityMetrics);
    }
}
