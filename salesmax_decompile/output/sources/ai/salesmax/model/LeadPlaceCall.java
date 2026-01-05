package ai.salesmax.model;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import p001o.sq8;

/* loaded from: classes.dex */
public final class LeadPlaceCall {
    public static final int $stable = 8;
    private String contactNumber;
    private final String id;
    private final Date lastCalledTime;
    private final Long updatedAt;

    public LeadPlaceCall(String str, Date date, Long l, String str2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.id = str;
        this.lastCalledTime = date;
        this.updatedAt = l;
        this.contactNumber = str2;
    }

    public static /* synthetic */ LeadPlaceCall copy$default(LeadPlaceCall leadPlaceCall, String str, Date date, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadPlaceCall.id;
        }
        if ((i & 2) != 0) {
            date = leadPlaceCall.lastCalledTime;
        }
        if ((i & 4) != 0) {
            l = leadPlaceCall.updatedAt;
        }
        if ((i & 8) != 0) {
            str2 = leadPlaceCall.contactNumber;
        }
        return leadPlaceCall.copy(str, date, l, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final Date component2() {
        return this.lastCalledTime;
    }

    public final Long component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.contactNumber;
    }

    public final LeadPlaceCall copy(String str, Date date, Long l, String str2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return new LeadPlaceCall(str, date, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadPlaceCall)) {
            return false;
        }
        LeadPlaceCall leadPlaceCall = (LeadPlaceCall) obj;
        return sq8.m48644c(this.id, leadPlaceCall.id) && sq8.m48644c(this.lastCalledTime, leadPlaceCall.lastCalledTime) && sq8.m48644c(this.updatedAt, leadPlaceCall.updatedAt) && sq8.m48644c(this.contactNumber, leadPlaceCall.contactNumber);
    }

    public final String getContactNumber() {
        return this.contactNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final Date getLastCalledTime() {
        return this.lastCalledTime;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Date date = this.lastCalledTime;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Long l = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.contactNumber;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setContactNumber(String str) {
        this.contactNumber = str;
    }

    public String toString() {
        return "LeadPlaceCall(id=" + this.id + ", lastCalledTime=" + this.lastCalledTime + ", updatedAt=" + this.updatedAt + ", contactNumber=" + this.contactNumber + ")";
    }
}
