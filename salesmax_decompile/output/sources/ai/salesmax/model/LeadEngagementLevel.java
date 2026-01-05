package ai.salesmax.model;

import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import android.content.Context;
import p001o.c64;
import p001o.id5;
import p001o.sq8;
import p001o.u6e;

/* loaded from: classes.dex */
public final class LeadEngagementLevel {
    private float engagementIndex;
    private String engagementLevel;
    private String frequency;
    private String frequentContactMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float MAX_EXPECTED_CALL_COUNT = 5.0f;
    private static final float MAX_EXPECTED_VISIT_COUNT = 3.0f;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final LeadEngagementLevel fromActivityMetrices(ActivityMetrices activityMetrices) {
            Long metricsValue;
            Long metricsValue2;
            Long lValueOf = null;
            ActivityMetrics activityMetrics = activityMetrices != null ? activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CONNECTED_CALL_LOGGED.name(), ActivityMetrics.Period.MONTH) : null;
            ActivityMetrics activityMetrics2 = activityMetrices != null ? activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.VISIT_LOGGED.name(), ActivityMetrics.Period.MONTH) : null;
            Long lValueOf2 = (activityMetrics == null || (metricsValue2 = activityMetrics.getMetricsValue()) == null) ? null : Long.valueOf(metricsValue2.longValue() | 0);
            sq8.m48646e(lValueOf2);
            long jLongValue = lValueOf2.longValue();
            if (activityMetrics2 != null && (metricsValue = activityMetrics2.getMetricsValue()) != null) {
                lValueOf = Long.valueOf(metricsValue.longValue() | 0);
            }
            sq8.m48646e(lValueOf);
            String str = sq8.m48652k(jLongValue, lValueOf.longValue()) > 0 ? "Call" : "Visit";
            long j = 100;
            float fMax = Float.max(Float.max((jLongValue * j) / getMAX_EXPECTED_CALL_COUNT(), (r0 * j) / getMAX_EXPECTED_VISIT_COUNT()), 5.0f);
            return new LeadEngagementLevel(fMax < 25.0f ? "Low" : fMax < 50.0f ? "Medium" : fMax < 75.0f ? "High" : "Excellent", "Monthly", str, fMax);
        }

        public final float getMAX_EXPECTED_CALL_COUNT() {
            return LeadEngagementLevel.MAX_EXPECTED_CALL_COUNT;
        }

        public final float getMAX_EXPECTED_VISIT_COUNT() {
            return LeadEngagementLevel.MAX_EXPECTED_VISIT_COUNT;
        }
    }

    public LeadEngagementLevel() {
        this(null, null, null, 0.0f, 15, null);
    }

    public static /* synthetic */ LeadEngagementLevel copy$default(LeadEngagementLevel leadEngagementLevel, String str, String str2, String str3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadEngagementLevel.engagementLevel;
        }
        if ((i & 2) != 0) {
            str2 = leadEngagementLevel.frequency;
        }
        if ((i & 4) != 0) {
            str3 = leadEngagementLevel.frequentContactMode;
        }
        if ((i & 8) != 0) {
            f = leadEngagementLevel.engagementIndex;
        }
        return leadEngagementLevel.copy(str, str2, str3, f);
    }

    public final String component1() {
        return this.engagementLevel;
    }

    public final String component2() {
        return this.frequency;
    }

    public final String component3() {
        return this.frequentContactMode;
    }

    public final float component4() {
        return this.engagementIndex;
    }

    public final LeadEngagementLevel copy(String str, String str2, String str3, float f) {
        sq8.m48649h(str, "engagementLevel");
        sq8.m48649h(str2, "frequency");
        sq8.m48649h(str3, "frequentContactMode");
        return new LeadEngagementLevel(str, str2, str3, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadEngagementLevel)) {
            return false;
        }
        LeadEngagementLevel leadEngagementLevel = (LeadEngagementLevel) obj;
        return sq8.m48644c(this.engagementLevel, leadEngagementLevel.engagementLevel) && sq8.m48644c(this.frequency, leadEngagementLevel.frequency) && sq8.m48644c(this.frequentContactMode, leadEngagementLevel.frequentContactMode) && Float.compare(this.engagementIndex, leadEngagementLevel.engagementIndex) == 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final int getDisplayColor(Context context) {
        sq8.m48649h(context, "context");
        String str = this.engagementLevel;
        switch (str.hashCode()) {
            case -1994163307:
                if (str.equals("Medium")) {
                    return c64.getColor(context, u6e.backgroundVisits);
                }
                break;
            case -813309930:
                if (str.equals("Excellent")) {
                    return c64.getColor(context, u6e.backgroundTasks);
                }
                break;
            case 76596:
                if (str.equals("Low")) {
                    return c64.getColor(context, u6e.superfone_red);
                }
                break;
            case 2249154:
                if (str.equals("High")) {
                    return c64.getColor(context, u6e.superfone_blue);
                }
                break;
        }
        return c64.getColor(context, u6e.superfone_red);
    }

    public final float getEngagementIndex() {
        return this.engagementIndex;
    }

    public final String getEngagementLevel() {
        return this.engagementLevel;
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final String getFrequentContactMode() {
        return this.frequentContactMode;
    }

    public int hashCode() {
        return (((((this.engagementLevel.hashCode() * 31) + this.frequency.hashCode()) * 31) + this.frequentContactMode.hashCode()) * 31) + Float.hashCode(this.engagementIndex);
    }

    public final void setEngagementIndex(float f) {
        this.engagementIndex = f;
    }

    public final void setEngagementLevel(String str) {
        sq8.m48649h(str, "<set-?>");
        this.engagementLevel = str;
    }

    public final void setFrequency(String str) {
        sq8.m48649h(str, "<set-?>");
        this.frequency = str;
    }

    public final void setFrequentContactMode(String str) {
        sq8.m48649h(str, "<set-?>");
        this.frequentContactMode = str;
    }

    public String toString() {
        return "LeadEngagementLevel(engagementLevel=" + this.engagementLevel + ", frequency=" + this.frequency + ", frequentContactMode=" + this.frequentContactMode + ", engagementIndex=" + this.engagementIndex + ")";
    }

    public LeadEngagementLevel(String str, String str2, String str3, float f) {
        sq8.m48649h(str, "engagementLevel");
        sq8.m48649h(str2, "frequency");
        sq8.m48649h(str3, "frequentContactMode");
        this.engagementLevel = str;
        this.frequency = str2;
        this.frequentContactMode = str3;
        this.engagementIndex = f;
    }

    public /* synthetic */ LeadEngagementLevel(String str, String str2, String str3, float f, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Low" : str, (i & 2) != 0 ? "Monthly" : str2, (i & 4) != 0 ? "Call" : str3, (i & 8) != 0 ? 65.0f : f);
    }
}
