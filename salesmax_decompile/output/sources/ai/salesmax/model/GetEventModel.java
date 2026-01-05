package ai.salesmax.model;

import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class GetEventModel {
    public static final int $stable = 8;
    private String contactId;
    private String contactName;
    private String description;
    private String endDate;
    private String eventUrl;
    private String id;
    private String primaryParticipantEmail;
    private String primaryParticipantName;
    private String startDate;
    private String summary;

    public GetEventModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.primaryParticipantEmail;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.startDate;
    }

    public final String component4() {
        return this.endDate;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.eventUrl;
    }

    public final String component7() {
        return this.contactId;
    }

    public final String component8() {
        return this.contactName;
    }

    public final String component9() {
        return this.primaryParticipantName;
    }

    public final GetEventModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str3, "startDate");
        sq8.m48649h(str4, "endDate");
        sq8.m48649h(str5, MediaTrack.ROLE_DESCRIPTION);
        return new GetEventModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEventModel)) {
            return false;
        }
        GetEventModel getEventModel = (GetEventModel) obj;
        return sq8.m48644c(this.id, getEventModel.id) && sq8.m48644c(this.summary, getEventModel.summary) && sq8.m48644c(this.startDate, getEventModel.startDate) && sq8.m48644c(this.endDate, getEventModel.endDate) && sq8.m48644c(this.description, getEventModel.description) && sq8.m48644c(this.eventUrl, getEventModel.eventUrl) && sq8.m48644c(this.contactId, getEventModel.contactId) && sq8.m48644c(this.contactName, getEventModel.contactName) && sq8.m48644c(this.primaryParticipantName, getEventModel.primaryParticipantName) && sq8.m48644c(this.primaryParticipantEmail, getEventModel.primaryParticipantEmail);
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getEventUrl() {
        return this.eventUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPrimaryParticipantEmail() {
        return this.primaryParticipantEmail;
    }

    public final String getPrimaryParticipantName() {
        return this.primaryParticipantName;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.summary;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str2 = this.eventUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryParticipantName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.primaryParticipantEmail;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setContactName(String str) {
        this.contactName = str;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setEndDate(String str) {
        sq8.m48649h(str, "<set-?>");
        this.endDate = str;
    }

    public final void setEventUrl(String str) {
        this.eventUrl = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setPrimaryParticipantEmail(String str) {
        this.primaryParticipantEmail = str;
    }

    public final void setPrimaryParticipantName(String str) {
        this.primaryParticipantName = str;
    }

    public final void setStartDate(String str) {
        sq8.m48649h(str, "<set-?>");
        this.startDate = str;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public String toString() {
        return "GetEventModel(id=" + this.id + ", summary=" + this.summary + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", description=" + this.description + ", eventUrl=" + this.eventUrl + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", primaryParticipantName=" + this.primaryParticipantName + ", primaryParticipantEmail=" + this.primaryParticipantEmail + ")";
    }

    public GetEventModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str3, "startDate");
        sq8.m48649h(str4, "endDate");
        sq8.m48649h(str5, MediaTrack.ROLE_DESCRIPTION);
        this.id = str;
        this.summary = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.description = str5;
        this.eventUrl = str6;
        this.contactId = str7;
        this.contactName = str8;
        this.primaryParticipantName = str9;
        this.primaryParticipantEmail = str10;
    }

    public /* synthetic */ GetEventModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, id5 id5Var) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
