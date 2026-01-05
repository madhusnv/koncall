package ai.salesmax.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class Notifications {
    public static final int $stable = 8;
    private String content;
    private long duration;
    private String id;
    private boolean isSelected;
    private String linkedEntityId;
    private String linkedEntityType;
    private String logo;
    private Long notificationTime;
    private String originatingEntityId;
    private String originatingEntityType;
    private String title;
    private String triggeredByUserId;

    public Notifications() {
        this(null, 0L, null, null, null, false, null, null, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.linkedEntityType;
    }

    public final String component11() {
        return this.triggeredByUserId;
    }

    public final Long component12() {
        return this.notificationTime;
    }

    public final long component2() {
        return this.duration;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.logo;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final String component7() {
        return this.originatingEntityId;
    }

    public final String component8() {
        return this.originatingEntityType;
    }

    public final String component9() {
        return this.linkedEntityId;
    }

    public final Notifications copy(String str, long j, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, Long l) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        return new Notifications(str, j, str2, str3, str4, z, str5, str6, str7, str8, str9, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notifications)) {
            return false;
        }
        Notifications notifications = (Notifications) obj;
        return sq8.m48644c(this.id, notifications.id) && this.duration == notifications.duration && sq8.m48644c(this.title, notifications.title) && sq8.m48644c(this.content, notifications.content) && sq8.m48644c(this.logo, notifications.logo) && this.isSelected == notifications.isSelected && sq8.m48644c(this.originatingEntityId, notifications.originatingEntityId) && sq8.m48644c(this.originatingEntityType, notifications.originatingEntityType) && sq8.m48644c(this.linkedEntityId, notifications.linkedEntityId) && sq8.m48644c(this.linkedEntityType, notifications.linkedEntityType) && sq8.m48644c(this.triggeredByUserId, notifications.triggeredByUserId) && sq8.m48644c(this.notificationTime, notifications.notificationTime);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLinkedEntityId() {
        return this.linkedEntityId;
    }

    public final String getLinkedEntityType() {
        return this.linkedEntityType;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Long getNotificationTime() {
        return this.notificationTime;
    }

    public final String getOriginatingEntityId() {
        return this.originatingEntityId;
    }

    public final String getOriginatingEntityType() {
        return this.originatingEntityType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTriggeredByUserId() {
        return this.triggeredByUserId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Long.hashCode(this.duration)) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.logo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        String str2 = this.originatingEntityId;
        int iHashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originatingEntityType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkedEntityId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkedEntityType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.triggeredByUserId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.notificationTime;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setContent(String str) {
        sq8.m48649h(str, "<set-?>");
        this.content = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setLinkedEntityId(String str) {
        this.linkedEntityId = str;
    }

    public final void setLinkedEntityType(String str) {
        this.linkedEntityType = str;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setNotificationTime(Long l) {
        this.notificationTime = l;
    }

    public final void setOriginatingEntityId(String str) {
        this.originatingEntityId = str;
    }

    public final void setOriginatingEntityType(String str) {
        this.originatingEntityType = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    public final void setTriggeredByUserId(String str) {
        this.triggeredByUserId = str;
    }

    public String toString() {
        return "Notifications(id=" + this.id + ", duration=" + this.duration + ", title=" + this.title + ", content=" + this.content + ", logo=" + this.logo + ", isSelected=" + this.isSelected + ", originatingEntityId=" + this.originatingEntityId + ", originatingEntityType=" + this.originatingEntityType + ", linkedEntityId=" + this.linkedEntityId + ", linkedEntityType=" + this.linkedEntityType + ", triggeredByUserId=" + this.triggeredByUserId + ", notificationTime=" + this.notificationTime + ")";
    }

    public Notifications(String str, long j, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, Long l) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        this.id = str;
        this.duration = j;
        this.title = str2;
        this.content = str3;
        this.logo = str4;
        this.isSelected = z;
        this.originatingEntityId = str5;
        this.originatingEntityType = str6;
        this.linkedEntityId = str7;
        this.linkedEntityType = str8;
        this.triggeredByUserId = str9;
        this.notificationTime = l;
    }

    public /* synthetic */ Notifications(String str, long j, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, Long l, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) == 0 ? l : null);
    }
}
