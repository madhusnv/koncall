package ai.salesmax.model;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FileObjectRelationships {
    public static final int $stable = 0;
    private final String accountId;
    private final Long atedAt;
    private final String businessAccountId;
    private final String contactId;
    private final Long createdAt;
    private final String dealId;
    private final String engagementId;
    private final String fileId;
    private final String id;

    public FileObjectRelationships(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileId");
        sq8.m48649h(str4, "contactId");
        sq8.m48649h(str5, "dealId");
        sq8.m48649h(str6, "businessAccountId");
        sq8.m48649h(str7, "engagementId");
        this.id = str;
        this.accountId = str2;
        this.fileId = str3;
        this.contactId = str4;
        this.dealId = str5;
        this.businessAccountId = str6;
        this.engagementId = str7;
        this.createdAt = l;
        this.atedAt = l2;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.fileId;
    }

    public final String component4() {
        return this.contactId;
    }

    public final String component5() {
        return this.dealId;
    }

    public final String component6() {
        return this.businessAccountId;
    }

    public final String component7() {
        return this.engagementId;
    }

    public final Long component8() {
        return this.createdAt;
    }

    public final Long component9() {
        return this.atedAt;
    }

    public final FileObjectRelationships copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileId");
        sq8.m48649h(str4, "contactId");
        sq8.m48649h(str5, "dealId");
        sq8.m48649h(str6, "businessAccountId");
        sq8.m48649h(str7, "engagementId");
        return new FileObjectRelationships(str, str2, str3, str4, str5, str6, str7, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileObjectRelationships)) {
            return false;
        }
        FileObjectRelationships fileObjectRelationships = (FileObjectRelationships) obj;
        return sq8.m48644c(this.id, fileObjectRelationships.id) && sq8.m48644c(this.accountId, fileObjectRelationships.accountId) && sq8.m48644c(this.fileId, fileObjectRelationships.fileId) && sq8.m48644c(this.contactId, fileObjectRelationships.contactId) && sq8.m48644c(this.dealId, fileObjectRelationships.dealId) && sq8.m48644c(this.businessAccountId, fileObjectRelationships.businessAccountId) && sq8.m48644c(this.engagementId, fileObjectRelationships.engagementId) && sq8.m48644c(this.createdAt, fileObjectRelationships.createdAt) && sq8.m48644c(this.atedAt, fileObjectRelationships.atedAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Long getAtedAt() {
        return this.atedAt;
    }

    public final String getBusinessAccountId() {
        return this.businessAccountId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDealId() {
        return this.dealId;
    }

    public final String getEngagementId() {
        return this.engagementId;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.fileId.hashCode()) * 31) + this.contactId.hashCode()) * 31) + this.dealId.hashCode()) * 31) + this.businessAccountId.hashCode()) * 31) + this.engagementId.hashCode()) * 31;
        Long l = this.createdAt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.atedAt;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final void toFileObjectRelationshipSummary() {
        FileObjectRelationshipSummary fileObjectRelationshipSummary = new FileObjectRelationshipSummary(null, 1, null);
        fileObjectRelationshipSummary.setFileId(this.fileId);
        fileObjectRelationshipSummary.setAccountId(this.accountId);
        fileObjectRelationshipSummary.setContactId(this.contactId);
        fileObjectRelationshipSummary.setDealId(this.dealId);
        fileObjectRelationshipSummary.setEngagementId(this.engagementId);
    }

    public String toString() {
        return "FileObjectRelationships(id=" + this.id + ", accountId=" + this.accountId + ", fileId=" + this.fileId + ", contactId=" + this.contactId + ", dealId=" + this.dealId + ", businessAccountId=" + this.businessAccountId + ", engagementId=" + this.engagementId + ", createdAt=" + this.createdAt + ", atedAt=" + this.atedAt + ")";
    }

    public /* synthetic */ FileObjectRelationships(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, int i, id5 id5Var) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? 0L : l, (i & 256) != 0 ? 0L : l2);
    }
}
