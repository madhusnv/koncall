package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class NotificationStagingInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationStagingInfo> CREATOR = new Creator();
    private String accountId;
    private String activityDoneByUserId;
    private String contactId;
    private String content;
    private String id;
    private String notificationChannel;
    private String notificationId;
    private String notificationRelatedObjectId;
    private String notificationRelatedObjectType;
    private String notificationStatus;
    private String notificationType;
    private String ownerId;
    private String primaryTeamId;
    private Long scheduledAt;

    public static final class Creator implements Parcelable.Creator<NotificationStagingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationStagingInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new NotificationStagingInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationStagingInfo[] newArray(int i) {
            return new NotificationStagingInfo[i];
        }
    }

    public NotificationStagingInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.primaryTeamId;
    }

    public final String component11() {
        return this.contactId;
    }

    public final String component12() {
        return this.activityDoneByUserId;
    }

    public final String component13() {
        return this.content;
    }

    public final Long component14() {
        return this.scheduledAt;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.notificationId;
    }

    public final String component4() {
        return this.notificationChannel;
    }

    public final String component5() {
        return this.notificationStatus;
    }

    public final String component6() {
        return this.notificationType;
    }

    public final String component7() {
        return this.notificationRelatedObjectType;
    }

    public final String component8() {
        return this.notificationRelatedObjectId;
    }

    public final String component9() {
        return this.ownerId;
    }

    public final NotificationStagingInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return new NotificationStagingInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, l);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationStagingInfo)) {
            return false;
        }
        NotificationStagingInfo notificationStagingInfo = (NotificationStagingInfo) obj;
        return sq8.m48644c(this.id, notificationStagingInfo.id) && sq8.m48644c(this.accountId, notificationStagingInfo.accountId) && sq8.m48644c(this.notificationId, notificationStagingInfo.notificationId) && sq8.m48644c(this.notificationChannel, notificationStagingInfo.notificationChannel) && sq8.m48644c(this.notificationStatus, notificationStagingInfo.notificationStatus) && sq8.m48644c(this.notificationType, notificationStagingInfo.notificationType) && sq8.m48644c(this.notificationRelatedObjectType, notificationStagingInfo.notificationRelatedObjectType) && sq8.m48644c(this.notificationRelatedObjectId, notificationStagingInfo.notificationRelatedObjectId) && sq8.m48644c(this.ownerId, notificationStagingInfo.ownerId) && sq8.m48644c(this.primaryTeamId, notificationStagingInfo.primaryTeamId) && sq8.m48644c(this.contactId, notificationStagingInfo.contactId) && sq8.m48644c(this.activityDoneByUserId, notificationStagingInfo.activityDoneByUserId) && sq8.m48644c(this.content, notificationStagingInfo.content) && sq8.m48644c(this.scheduledAt, notificationStagingInfo.scheduledAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getActivityDoneByUserId() {
        return this.activityDoneByUserId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNotificationChannel() {
        return this.notificationChannel;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getNotificationRelatedObjectId() {
        return this.notificationRelatedObjectId;
    }

    public final String getNotificationRelatedObjectType() {
        return this.notificationRelatedObjectType;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public final Long getScheduledAt() {
        return this.scheduledAt;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.accountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notificationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notificationChannel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.notificationStatus;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.notificationType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.notificationRelatedObjectType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.notificationRelatedObjectId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ownerId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.primaryTeamId;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.contactId;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.activityDoneByUserId;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.content;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l = this.scheduledAt;
        return iHashCode13 + (l != null ? l.hashCode() : 0);
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setActivityDoneByUserId(String str) {
        this.activityDoneByUserId = str;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setNotificationChannel(String str) {
        this.notificationChannel = str;
    }

    public final void setNotificationId(String str) {
        this.notificationId = str;
    }

    public final void setNotificationRelatedObjectId(String str) {
        this.notificationRelatedObjectId = str;
    }

    public final void setNotificationRelatedObjectType(String str) {
        this.notificationRelatedObjectType = str;
    }

    public final void setNotificationStatus(String str) {
        this.notificationStatus = str;
    }

    public final void setNotificationType(String str) {
        this.notificationType = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setPrimaryTeamId(String str) {
        this.primaryTeamId = str;
    }

    public final void setScheduledAt(Long l) {
        this.scheduledAt = l;
    }

    public String toString() {
        return "NotificationStagingInfo(id=" + this.id + ", accountId=" + this.accountId + ", notificationId=" + this.notificationId + ", notificationChannel=" + this.notificationChannel + ", notificationStatus=" + this.notificationStatus + ", notificationType=" + this.notificationType + ", notificationRelatedObjectType=" + this.notificationRelatedObjectType + ", notificationRelatedObjectId=" + this.notificationRelatedObjectId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", content=" + this.content + ", scheduledAt=" + this.scheduledAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.notificationId);
        parcel.writeString(this.notificationChannel);
        parcel.writeString(this.notificationStatus);
        parcel.writeString(this.notificationType);
        parcel.writeString(this.notificationRelatedObjectType);
        parcel.writeString(this.notificationRelatedObjectId);
        parcel.writeString(this.ownerId);
        parcel.writeString(this.primaryTeamId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.activityDoneByUserId);
        parcel.writeString(this.content);
        Long l = this.scheduledAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public /* synthetic */ NotificationStagingInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? l : null);
    }

    public NotificationStagingInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.id = str;
        this.accountId = str2;
        this.notificationId = str3;
        this.notificationChannel = str4;
        this.notificationStatus = str5;
        this.notificationType = str6;
        this.notificationRelatedObjectType = str7;
        this.notificationRelatedObjectId = str8;
        this.ownerId = str9;
        this.primaryTeamId = str10;
        this.contactId = str11;
        this.activityDoneByUserId = str12;
        this.content = str13;
        this.scheduledAt = l;
    }
}
