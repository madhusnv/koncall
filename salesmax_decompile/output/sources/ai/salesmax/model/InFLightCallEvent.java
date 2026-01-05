package ai.salesmax.model;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

/* loaded from: classes.dex */
public final class InFLightCallEvent {
    public static final int $stable = 8;
    private String direction;
    private String id;
    private long inCallRequestedAt;
    private String phoneNumber;

    public InFLightCallEvent(String str, String str2, long j, String str3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "phoneNumber");
        sq8.m48649h(str3, "direction");
        this.id = str;
        this.phoneNumber = str2;
        this.inCallRequestedAt = j;
        this.direction = str3;
    }

    public static /* synthetic */ InFLightCallEvent copy$default(InFLightCallEvent inFLightCallEvent, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inFLightCallEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = inFLightCallEvent.phoneNumber;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = inFLightCallEvent.inCallRequestedAt;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = inFLightCallEvent.direction;
        }
        return inFLightCallEvent.copy(str, str4, j2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final long component3() {
        return this.inCallRequestedAt;
    }

    public final String component4() {
        return this.direction;
    }

    public final InFLightCallEvent copy(String str, String str2, long j, String str3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "phoneNumber");
        sq8.m48649h(str3, "direction");
        return new InFLightCallEvent(str, str2, j, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InFLightCallEvent)) {
            return false;
        }
        InFLightCallEvent inFLightCallEvent = (InFLightCallEvent) obj;
        return sq8.m48644c(this.id, inFLightCallEvent.id) && sq8.m48644c(this.phoneNumber, inFLightCallEvent.phoneNumber) && this.inCallRequestedAt == inFLightCallEvent.inCallRequestedAt && sq8.m48644c(this.direction, inFLightCallEvent.direction);
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getId() {
        return this.id;
    }

    public final long getInCallRequestedAt() {
        return this.inCallRequestedAt;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + Long.hashCode(this.inCallRequestedAt)) * 31) + this.direction.hashCode();
    }

    public final void setDirection(String str) {
        sq8.m48649h(str, "<set-?>");
        this.direction = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setInCallRequestedAt(long j) {
        this.inCallRequestedAt = j;
    }

    public final void setPhoneNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.phoneNumber = str;
    }

    public String toString() {
        return "InFLightCallEvent(id=" + this.id + ", phoneNumber=" + this.phoneNumber + ", inCallRequestedAt=" + this.inCallRequestedAt + ", direction=" + this.direction + ")";
    }
}
