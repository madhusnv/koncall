package ai.salesmax.services.model;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.ActivityMetrics;
import com.amplifyframework.datastore.generated.model.MetricsLevel;
import com.amplifyframework.datastore.generated.model.RealTimeMetrics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p001o.lpi;

/* loaded from: classes.dex */
public class ActivityMetrices {
    private Map<ActivityMetricsKey, ActivityMetrics> activityMetricsMap = new ConcurrentHashMap();
    private String entityId;
    private MetricsLevel metricsLevel;

    public class ActivityMetricsKey {
        final String metricsName;
        final ActivityMetrics.Period period;

        public ActivityMetricsKey(ActivityMetrices activityMetrices, ActivityMetrics activityMetrics) {
            this(activityMetrics.getMetricsName(), activityMetrics.getPeriod());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ActivityMetricsKey)) {
                return false;
            }
            ActivityMetricsKey activityMetricsKey = (ActivityMetricsKey) obj;
            return activityMetricsKey.metricsName.equals(this.metricsName) && activityMetricsKey.period.equals(this.period);
        }

        public int hashCode() {
            return Objects.hash(this.metricsName, this.period);
        }

        public ActivityMetricsKey(String str, ActivityMetrics.Period period) {
            this.metricsName = str;
            this.period = period;
        }
    }

    public ActivityMetrices(String str, MetricsLevel metricsLevel) {
        this.entityId = str;
        this.metricsLevel = metricsLevel;
    }

    private ActivityMetrics emptyMetrics(String str, ActivityMetrics.Period period) {
        return new ActivityMetrics(RealTimeMetrics.builder().accountId("").metricsLevel(this.metricsLevel).entityId(this.entityId).metricsName(str).period(period.name()).metricValue(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)).build());
    }

    public void addActivityMetrics(ActivityMetrics activityMetrics) {
        if (Objects.equals(this.metricsLevel, activityMetrics.getMetricsLevel()) && Objects.equals(this.entityId, activityMetrics.getEntityId())) {
            this.activityMetricsMap.put(new ActivityMetricsKey(this, activityMetrics), activityMetrics);
        }
    }

    public void addActivityMetricsList(List<ActivityMetrics> list) {
        Iterator<ActivityMetrics> it = list.iterator();
        while (it.hasNext()) {
            addActivityMetrics(it.next());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityMetrices activityMetrices = (ActivityMetrices) obj;
        return Objects.equals(this.entityId, activityMetrices.entityId) && this.metricsLevel == activityMetrices.metricsLevel && Objects.equals(this.activityMetricsMap, activityMetrices.activityMetricsMap);
    }

    public ActivityMetrics getActivityMetrics(String str, ActivityMetrics.Period period) {
        return this.activityMetricsMap.getOrDefault(new ActivityMetricsKey(str, period), emptyMetrics(str, period));
    }

    public String getEntityId() {
        return this.entityId;
    }

    public LeadsUser getLeadUser() {
        if (this.metricsLevel == MetricsLevel.USER) {
            return lpi.a0(this.entityId);
        }
        return null;
    }

    public MetricsLevel getMetricsLevel() {
        return this.metricsLevel;
    }

    public int hashCode() {
        return Objects.hash(this.entityId, this.metricsLevel, this.activityMetricsMap);
    }

    public Collection<ActivityMetrics> listActivityMetrics() {
        return this.activityMetricsMap.values();
    }
}
