package ai.salesmax.model;

import android.content.Context;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class WebInitiatedCallEvent {
    public static final int $stable = 8;
    private String contactId;
    private String contactName;
    private Context context;
    private String direction;
    private String id;
    private Long inCallRequestedAt;
    private String phoneNumber;

    public WebInitiatedCallEvent(String str, String str2, String str3, String str4, Long l, String str5, Context context) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "phoneNumber");
        sq8.m48649h(str3, "contactId");
        sq8.m48649h(str4, "contactName");
        sq8.m48649h(str5, "direction");
        sq8.m48649h(context, "context");
        this.id = str;
        this.phoneNumber = str2;
        this.contactId = str3;
        this.contactName = str4;
        this.inCallRequestedAt = l;
        this.direction = str5;
        this.context = context;
    }

    public static /* synthetic */ WebInitiatedCallEvent copy$default(WebInitiatedCallEvent webInitiatedCallEvent, String str, String str2, String str3, String str4, Long l, String str5, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webInitiatedCallEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = webInitiatedCallEvent.phoneNumber;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = webInitiatedCallEvent.contactId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = webInitiatedCallEvent.contactName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            l = webInitiatedCallEvent.inCallRequestedAt;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            str5 = webInitiatedCallEvent.direction;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            context = webInitiatedCallEvent.context;
        }
        return webInitiatedCallEvent.copy(str, str6, str7, str8, l2, str9, context);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final String component3() {
        return this.contactId;
    }

    public final String component4() {
        return this.contactName;
    }

    public final Long component5() {
        return this.inCallRequestedAt;
    }

    public final String component6() {
        return this.direction;
    }

    public final Context component7() {
        return this.context;
    }

    public final WebInitiatedCallEvent copy(String str, String str2, String str3, String str4, Long l, String str5, Context context) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "phoneNumber");
        sq8.m48649h(str3, "contactId");
        sq8.m48649h(str4, "contactName");
        sq8.m48649h(str5, "direction");
        sq8.m48649h(context, "context");
        return new WebInitiatedCallEvent(str, str2, str3, str4, l, str5, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebInitiatedCallEvent)) {
            return false;
        }
        WebInitiatedCallEvent webInitiatedCallEvent = (WebInitiatedCallEvent) obj;
        return sq8.m48644c(this.id, webInitiatedCallEvent.id) && sq8.m48644c(this.phoneNumber, webInitiatedCallEvent.phoneNumber) && sq8.m48644c(this.contactId, webInitiatedCallEvent.contactId) && sq8.m48644c(this.contactName, webInitiatedCallEvent.contactName) && sq8.m48644c(this.inCallRequestedAt, webInitiatedCallEvent.inCallRequestedAt) && sq8.m48644c(this.direction, webInitiatedCallEvent.direction) && sq8.m48644c(this.context, webInitiatedCallEvent.context);
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getInCallRequestedAt() {
        return this.inCallRequestedAt;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.contactId.hashCode()) * 31) + this.contactName.hashCode()) * 31;
        Long l = this.inCallRequestedAt;
        return ((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.context.hashCode();
    }

    public final void setContactId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactId = str;
    }

    public final void setContactName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactName = str;
    }

    public final void setContext(Context context) {
        sq8.m48649h(context, "<set-?>");
        this.context = context;
    }

    public final void setDirection(String str) {
        sq8.m48649h(str, "<set-?>");
        this.direction = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setInCallRequestedAt(Long l) {
        this.inCallRequestedAt = l;
    }

    public final void setPhoneNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.phoneNumber = str;
    }

    public String toString() {
        return "WebInitiatedCallEvent(id=" + this.id + ", phoneNumber=" + this.phoneNumber + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", inCallRequestedAt=" + this.inCallRequestedAt + ", direction=" + this.direction + ", context=" + this.context + ")";
    }

    public /* synthetic */ WebInitiatedCallEvent(String str, String str2, String str3, String str4, Long l, String str5, Context context, int i, id5 id5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? CallDirection.OUTGOING.name() : str5, context);
    }
}
