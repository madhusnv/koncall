package ai.salesmax.model;

import com.google.firebase.perf.util.Constants;
import java.util.Date;
import p001o.id5;
import p001o.lpi;

/* loaded from: classes.dex */
public final class LeadInteractionsSummary {
    public static final int $stable = 8;
    private final String callDirection;
    private final Integer callDuration;
    private final String engagementId;
    private final Date engagementTime;
    private final String engagementType;
    private final String engagementUserId;
    private final String interactionTitle;
    private final String outcome;

    public LeadInteractionsSummary() {
        this(null, null, null, null, null, null, null, null, Constants.MAX_HOST_LENGTH, null);
    }

    public final String getCallDirection() {
        return this.callDirection;
    }

    public final Integer getCallDuration() {
        return this.callDuration;
    }

    public final String getEngagementId() {
        return this.engagementId;
    }

    public final Date getEngagementTime() {
        return this.engagementTime;
    }

    public final String getEngagementType() {
        return this.engagementType;
    }

    public final LeadsUser getEngagementUser() {
        return lpi.a0(this.engagementUserId);
    }

    public final String getEngagementUserId() {
        return this.engagementUserId;
    }

    public final String getInteractionTitle() {
        return this.interactionTitle;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public LeadInteractionsSummary(String str, String str2, String str3, String str4, String str5, Date date, String str6, Integer num) {
        this.engagementId = str;
        this.engagementType = str2;
        this.interactionTitle = str3;
        this.engagementUserId = str4;
        this.outcome = str5;
        this.engagementTime = date;
        this.callDirection = str6;
        this.callDuration = num;
    }

    public /* synthetic */ LeadInteractionsSummary(String str, String str2, String str3, String str4, String str5, Date date, String str6, Integer num, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : date, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? num : null);
    }
}
