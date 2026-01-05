package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.MetricsLevel;
import com.amplifyframework.datastore.generated.model.RealTimeMetrics;

/* loaded from: classes.dex */
public class ActivityMetrics {
    RealTimeMetrics realTimeMetrics;

    public enum MetricsName {
        CALL_DURATION,
        CALL_DURATION_INCOMING,
        CALL_DURATION_OUTGOING,
        CALL_LOGGED,
        CALL_OUTCOME_LOGGED,
        COMMENT_ADDED,
        CONNECTED_CALL_LOGGED,
        CONNECTED_INCOMING_CALL_LOGGED,
        CONNECTED_OUTGOING_CALL_LOGGED,
        POSITIVE_CALL_DISPOSITION,
        NEGATIVE_CALL_DISPOSITION,
        POSITIVE_VISIT_DISPOSITION,
        NEGATIVE_VISIT_DISPOSITION,
        CONTACT_CREATED,
        INCOMING_CALL_LOGGED,
        NOTE_ADDED,
        OUTGOING_CALL_LOGGED,
        TASK_CREATED,
        TASK_COMPLETED,
        TASK_COMPLETE_SUCCESS,
        TASK_COMPLETE_FAILRE,
        TASK_EXPIRED,
        TASK_UPDATED,
        VISIT_LOGGED,
        VISIT_OUTCOME_LOGGED,
        BUSINESS_CREATED,
        WHATSAPP_MESSAGE_SENT,
        SMS_SENT,
        EMAIL_SENT,
        UNIQUE_INCOMING_CALL_LOGGED,
        UNIQUE_CALL_LOGGED,
        UNIQUE_CALL_OUTCOME_LOGGED,
        UNIQUE_CONNECTED_CALL_LOGGED,
        UNIQUE_CONNECTED_INCOMING_CALL_LOGGED,
        UNIQUE_CONNECTED_OUTGOING_CALL_LOGGED,
        UNIQUE_POSITIVE_CALL_DISPOSITION,
        UNIQUE_NEGATIVE_CALL_DISPOSITION,
        UNIQUE_OUTGOING_CALL_LOGGED,
        FRESH_UP_CALL,
        UNIQUE_FRESH_UP_CALL,
        DEAL_CREATED,
        DEAL_STAGE_CHANGED,
        DEAL_WIN,
        DEAL_LOSS
    }

    public enum Period {
        MONTH,
        WEEK,
        DAY,
        PREVIOUS_DAY,
        PREVIOUS_WEEK,
        PREVIOUS_MONTH,
        EVER
    }

    public ActivityMetrics() {
        this(RealTimeMetrics.justId(""));
    }

    public String getAccountId() {
        return this.realTimeMetrics.getAccountId();
    }

    public String getEntityId() {
        return this.realTimeMetrics.getEntityId();
    }

    public String getId() {
        return this.realTimeMetrics.getId();
    }

    public MetricsLevel getMetricsLevel() {
        return this.realTimeMetrics.getMetricsLevel();
    }

    public String getMetricsName() {
        return this.realTimeMetrics.getMetricsName();
    }

    public Long getMetricsValue() {
        return Long.valueOf(this.realTimeMetrics.getMetricValue().longValue());
    }

    public Period getPeriod() {
        return Period.valueOf(this.realTimeMetrics.getPeriod());
    }

    public ActivityMetrics updateRealTimeMetrics(RealTimeMetrics realTimeMetrics) {
        this.realTimeMetrics = realTimeMetrics;
        return this;
    }

    public ActivityMetrics(RealTimeMetrics realTimeMetrics) {
        this.realTimeMetrics = realTimeMetrics;
    }
}
