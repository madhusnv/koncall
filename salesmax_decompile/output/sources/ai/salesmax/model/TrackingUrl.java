package ai.salesmax.model;

import android.util.Base64;
import p001o.e9g;
import p001o.id5;
import p001o.ja8;
import p001o.sq8;

/* loaded from: classes.dex */
public final class TrackingUrl {
    public static final int $stable = 8;
    private String accountId;
    private String accountLogoUrl;
    private String accountName;
    private String accountWebsite;
    private String contactId;
    private String contactName;
    private String engagementId;
    private String fileKey;
    private String mimeType;
    private String sharedByEmail;
    private String sharedByName;
    private String sharedByNumber;
    private String templateTitle;

    public TrackingUrl() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.engagementId;
    }

    public final String component10() {
        return this.accountWebsite;
    }

    public final String component11() {
        return this.accountId;
    }

    public final String component12() {
        return this.fileKey;
    }

    public final String component13() {
        return this.mimeType;
    }

    public final String component2() {
        return this.contactId;
    }

    public final String component3() {
        return this.contactName;
    }

    public final String component4() {
        return this.sharedByName;
    }

    public final String component5() {
        return this.sharedByEmail;
    }

    public final String component6() {
        return this.sharedByNumber;
    }

    public final String component7() {
        return this.templateTitle;
    }

    public final String component8() {
        return this.accountName;
    }

    public final String component9() {
        return this.accountLogoUrl;
    }

    public final TrackingUrl copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new TrackingUrl(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public final String encode() {
        String json = ja8.f30035c.toJson(this);
        sq8.m48648g(json, "toJson(...)");
        String strEncodeToString = Base64.encodeToString(e9g.m24603u(json), 8);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingUrl)) {
            return false;
        }
        TrackingUrl trackingUrl = (TrackingUrl) obj;
        return sq8.m48644c(this.engagementId, trackingUrl.engagementId) && sq8.m48644c(this.contactId, trackingUrl.contactId) && sq8.m48644c(this.contactName, trackingUrl.contactName) && sq8.m48644c(this.sharedByName, trackingUrl.sharedByName) && sq8.m48644c(this.sharedByEmail, trackingUrl.sharedByEmail) && sq8.m48644c(this.sharedByNumber, trackingUrl.sharedByNumber) && sq8.m48644c(this.templateTitle, trackingUrl.templateTitle) && sq8.m48644c(this.accountName, trackingUrl.accountName) && sq8.m48644c(this.accountLogoUrl, trackingUrl.accountLogoUrl) && sq8.m48644c(this.accountWebsite, trackingUrl.accountWebsite) && sq8.m48644c(this.accountId, trackingUrl.accountId) && sq8.m48644c(this.fileKey, trackingUrl.fileKey) && sq8.m48644c(this.mimeType, trackingUrl.mimeType);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountLogoUrl() {
        return this.accountLogoUrl;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountWebsite() {
        return this.accountWebsite;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getEngagementId() {
        return this.engagementId;
    }

    public final String getFileKey() {
        return this.fileKey;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getSharedByEmail() {
        return this.sharedByEmail;
    }

    public final String getSharedByName() {
        return this.sharedByName;
    }

    public final String getSharedByNumber() {
        return this.sharedByNumber;
    }

    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    public int hashCode() {
        String str = this.engagementId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sharedByName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sharedByEmail;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sharedByNumber;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateTitle;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accountName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.accountLogoUrl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.accountWebsite;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.accountId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fileKey;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.mimeType;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setAccountLogoUrl(String str) {
        this.accountLogoUrl = str;
    }

    public final void setAccountName(String str) {
        this.accountName = str;
    }

    public final void setAccountWebsite(String str) {
        this.accountWebsite = str;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setContactName(String str) {
        this.contactName = str;
    }

    public final void setEngagementId(String str) {
        this.engagementId = str;
    }

    public final void setFileKey(String str) {
        this.fileKey = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setSharedByEmail(String str) {
        this.sharedByEmail = str;
    }

    public final void setSharedByName(String str) {
        this.sharedByName = str;
    }

    public final void setSharedByNumber(String str) {
        this.sharedByNumber = str;
    }

    public final void setTemplateTitle(String str) {
        this.templateTitle = str;
    }

    public String toString() {
        return "TrackingUrl(engagementId=" + this.engagementId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", sharedByName=" + this.sharedByName + ", sharedByEmail=" + this.sharedByEmail + ", sharedByNumber=" + this.sharedByNumber + ", templateTitle=" + this.templateTitle + ", accountName=" + this.accountName + ", accountLogoUrl=" + this.accountLogoUrl + ", accountWebsite=" + this.accountWebsite + ", accountId=" + this.accountId + ", fileKey=" + this.fileKey + ", mimeType=" + this.mimeType + ")";
    }

    public TrackingUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.engagementId = str;
        this.contactId = str2;
        this.contactName = str3;
        this.sharedByName = str4;
        this.sharedByEmail = str5;
        this.sharedByNumber = str6;
        this.templateTitle = str7;
        this.accountName = str8;
        this.accountLogoUrl = str9;
        this.accountWebsite = str10;
        this.accountId = str11;
        this.fileKey = str12;
        this.mimeType = str13;
    }

    public /* synthetic */ TrackingUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}
