package ai.salesmax.services.model;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.ActivityMetrics;
import com.amplifyframework.datastore.generated.model.MetricsLevel;
import java.util.Objects;

/* loaded from: classes.dex */
public class LeaderboardActivityMetrics {
    private final ActivityMetrices activityMetrices;
    private final String entityId;
    private final MetricsLevel metricsLevel;
    private final ActivityMetrics.Period period;

    public LeaderboardActivityMetrics(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        this.activityMetrices = activityMetrices;
        this.entityId = activityMetrices.getEntityId();
        this.metricsLevel = activityMetrices.getMetricsLevel();
        this.period = period;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LeaderboardActivityMetrics leaderboardActivityMetrics = (LeaderboardActivityMetrics) obj;
        return Objects.equals(this.entityId, leaderboardActivityMetrics.entityId) && this.metricsLevel == leaderboardActivityMetrics.metricsLevel && Objects.equals(this.activityMetrices, leaderboardActivityMetrics.activityMetrices) && this.period == leaderboardActivityMetrics.period;
    }

    public ActivityMetrices getActivityMetrices() {
        return this.activityMetrices;
    }

    public ActivityMetrices getAllActivityMetrics() {
        return this.activityMetrices;
    }

    public ActivityMetrics getCallLogged() {
        return this.activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CONNECTED_CALL_LOGGED.name(), this.period);
    }

    public String getEntityId() {
        return this.entityId;
    }

    public LeadsUser getLeadUser() {
        return this.activityMetrices.getLeadUser();
    }

    public MetricsLevel getMetricsLevel() {
        return this.metricsLevel;
    }

    public ActivityMetrics getNotesAdded() {
        return this.activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.NOTE_ADDED.name(), this.period);
    }

    public ActivityMetrics.Period getPeriod() {
        return this.period;
    }

    public ActivityMetrics getTasksCompleted() {
        return this.activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.TASK_COMPLETE_SUCCESS.name(), this.period);
    }

    public ActivityMetrics getVisitLogged() {
        return this.activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.VISIT_LOGGED.name(), this.period);
    }

    public int hashCode() {
        return Objects.hash(this.entityId, this.metricsLevel, this.activityMetrices, this.period);
    }

    public long score() {
        return getCallLogged().getMetricsValue().longValue() + getVisitLogged().getMetricsValue().longValue() + getNotesAdded().getMetricsValue().longValue() + getTasksCompleted().getMetricsValue().longValue();
    }
}
