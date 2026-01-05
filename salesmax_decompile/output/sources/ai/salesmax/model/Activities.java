package ai.salesmax.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class Activities extends yfe {
    public static final int $stable = 8;
    private String activityCategory;
    private String activityDoneById;
    private String activityDoneByName;
    private String activityDoneByProfile;
    private String activityType;
    private String content;
    private Long createdAt;
    private long duration;
    private String id;
    private boolean isSelected;
    private String note;
    private String relatedObjectId;
    private String relatedObjectType;
    private boolean showDate;
    private String title;
    private String toContactSource;
    private String toPersonId;
    private String toPersonName;
    private String toPersonNumber;
    private String toPersonNumberEdited;
    private String toPersonProfile;
    private Long updatedAt;

    public Activities() {
        this(null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194303, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.toPersonProfile;
    }

    public final String component11() {
        return this.toContactSource;
    }

    public final String component12() {
        return this.toPersonNumber;
    }

    public final String component13() {
        return this.toPersonNumberEdited;
    }

    public final String component14() {
        return this.relatedObjectType;
    }

    public final String component15() {
        return this.relatedObjectId;
    }

    public final boolean component16() {
        return this.isSelected;
    }

    public final boolean component17() {
        return this.showDate;
    }

    public final String component18() {
        return this.activityDoneByName;
    }

    public final String component19() {
        return this.activityDoneById;
    }

    public final long component2() {
        return this.duration;
    }

    public final String component20() {
        return this.activityDoneByProfile;
    }

    public final Long component21() {
        return this.updatedAt;
    }

    public final Long component22() {
        return this.createdAt;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.note;
    }

    public final String component6() {
        return this.activityType;
    }

    public final String component7() {
        return this.activityCategory;
    }

    public final String component8() {
        return this.toPersonName;
    }

    public final String component9() {
        return this.toPersonId;
    }

    public final Activities copy(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, String str15, String str16, String str17, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        sq8.m48649h(str4, "note");
        sq8.m48649h(str5, "activityType");
        sq8.m48649h(str6, "activityCategory");
        sq8.m48649h(str11, "toPersonNumber");
        sq8.m48649h(str12, "toPersonNumberEdited");
        sq8.m48649h(str13, "relatedObjectType");
        sq8.m48649h(str14, "relatedObjectId");
        return new Activities(str, j, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, z2, str15, str16, str17, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Activities)) {
            return false;
        }
        Activities activities = (Activities) obj;
        return sq8.m48644c(this.id, activities.id) && this.duration == activities.duration && sq8.m48644c(this.title, activities.title) && sq8.m48644c(this.content, activities.content) && sq8.m48644c(this.note, activities.note) && sq8.m48644c(this.activityType, activities.activityType) && sq8.m48644c(this.activityCategory, activities.activityCategory) && sq8.m48644c(this.toPersonName, activities.toPersonName) && sq8.m48644c(this.toPersonId, activities.toPersonId) && sq8.m48644c(this.toPersonProfile, activities.toPersonProfile) && sq8.m48644c(this.toContactSource, activities.toContactSource) && sq8.m48644c(this.toPersonNumber, activities.toPersonNumber) && sq8.m48644c(this.toPersonNumberEdited, activities.toPersonNumberEdited) && sq8.m48644c(this.relatedObjectType, activities.relatedObjectType) && sq8.m48644c(this.relatedObjectId, activities.relatedObjectId) && this.isSelected == activities.isSelected && this.showDate == activities.showDate && sq8.m48644c(this.activityDoneByName, activities.activityDoneByName) && sq8.m48644c(this.activityDoneById, activities.activityDoneById) && sq8.m48644c(this.activityDoneByProfile, activities.activityDoneByProfile) && sq8.m48644c(this.updatedAt, activities.updatedAt) && sq8.m48644c(this.createdAt, activities.createdAt);
    }

    public final String getActivityCategory() {
        return this.activityCategory;
    }

    public final String getActivityDoneById() {
        return this.activityDoneById;
    }

    public final String getActivityDoneByName() {
        return this.activityDoneByName;
    }

    public final String getActivityDoneByProfile() {
        return this.activityDoneByProfile;
    }

    public final String getActivityType() {
        return this.activityType;
    }

    public final String getContent() {
        return this.content;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getRelatedObjectId() {
        return this.relatedObjectId;
    }

    public final String getRelatedObjectType() {
        return this.relatedObjectType;
    }

    public final boolean getShowDate() {
        return this.showDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToContactSource() {
        return this.toContactSource;
    }

    public final String getToPersonId() {
        return this.toPersonId;
    }

    public final String getToPersonName() {
        return this.toPersonName;
    }

    public final String getToPersonNumber() {
        return this.toPersonNumber;
    }

    public final String getToPersonNumberEdited() {
        return this.toPersonNumberEdited;
    }

    public final String getToPersonProfile() {
        return this.toPersonProfile;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + Long.hashCode(this.duration)) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.note.hashCode()) * 31) + this.activityType.hashCode()) * 31) + this.activityCategory.hashCode()) * 31;
        String str = this.toPersonName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toPersonId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toPersonProfile;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toContactSource;
        int iHashCode5 = (((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.toPersonNumber.hashCode()) * 31) + this.toPersonNumberEdited.hashCode()) * 31) + this.relatedObjectType.hashCode()) * 31) + this.relatedObjectId.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode5 + i) * 31;
        boolean z2 = this.showDate;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str5 = this.activityDoneByName;
        int iHashCode6 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.activityDoneById;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.activityDoneByProfile;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.updatedAt;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setActivityCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.activityCategory = str;
    }

    public final void setActivityDoneById(String str) {
        this.activityDoneById = str;
    }

    public final void setActivityDoneByName(String str) {
        this.activityDoneByName = str;
    }

    public final void setActivityDoneByProfile(String str) {
        this.activityDoneByProfile = str;
    }

    public final void setActivityType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.activityType = str;
    }

    public final void setContent(String str) {
        sq8.m48649h(str, "<set-?>");
        this.content = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setNote(String str) {
        sq8.m48649h(str, "<set-?>");
        this.note = str;
    }

    public final void setRelatedObjectId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.relatedObjectId = str;
    }

    public final void setRelatedObjectType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.relatedObjectType = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowDate(boolean z) {
        this.showDate = z;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    public final void setToContactSource(String str) {
        this.toContactSource = str;
    }

    public final void setToPersonId(String str) {
        this.toPersonId = str;
    }

    public final void setToPersonName(String str) {
        this.toPersonName = str;
    }

    public final void setToPersonNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.toPersonNumber = str;
    }

    public final void setToPersonNumberEdited(String str) {
        sq8.m48649h(str, "<set-?>");
        this.toPersonNumberEdited = str;
    }

    public final void setToPersonProfile(String str) {
        this.toPersonProfile = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public String toString() {
        return "Activities(id=" + this.id + ", duration=" + this.duration + ", title=" + this.title + ", content=" + this.content + ", note=" + this.note + ", activityType=" + this.activityType + ", activityCategory=" + this.activityCategory + ", toPersonName=" + this.toPersonName + ", toPersonId=" + this.toPersonId + ", toPersonProfile=" + this.toPersonProfile + ", toContactSource=" + this.toContactSource + ", toPersonNumber=" + this.toPersonNumber + ", toPersonNumberEdited=" + this.toPersonNumberEdited + ", relatedObjectType=" + this.relatedObjectType + ", relatedObjectId=" + this.relatedObjectId + ", isSelected=" + this.isSelected + ", showDate=" + this.showDate + ", activityDoneByName=" + this.activityDoneByName + ", activityDoneById=" + this.activityDoneById + ", activityDoneByProfile=" + this.activityDoneByProfile + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    public /* synthetic */ Activities(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, String str15, String str16, String str17, Long l, Long l2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & Opcodes.ACC_ENUM) != 0 ? "" : str14, (i & 32768) != 0 ? false : z, (i & 65536) == 0 ? z2 : false, (i & Opcodes.ACC_DEPRECATED) != 0 ? "" : str15, (i & 262144) != 0 ? "" : str16, (i & Opcodes.ASM8) != 0 ? "" : str17, (i & 1048576) != 0 ? null : l, (i & 2097152) == 0 ? l2 : null);
    }

    public Activities(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, String str15, String str16, String str17, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        sq8.m48649h(str4, "note");
        sq8.m48649h(str5, "activityType");
        sq8.m48649h(str6, "activityCategory");
        sq8.m48649h(str11, "toPersonNumber");
        sq8.m48649h(str12, "toPersonNumberEdited");
        sq8.m48649h(str13, "relatedObjectType");
        sq8.m48649h(str14, "relatedObjectId");
        this.id = str;
        this.duration = j;
        this.title = str2;
        this.content = str3;
        this.note = str4;
        this.activityType = str5;
        this.activityCategory = str6;
        this.toPersonName = str7;
        this.toPersonId = str8;
        this.toPersonProfile = str9;
        this.toContactSource = str10;
        this.toPersonNumber = str11;
        this.toPersonNumberEdited = str12;
        this.relatedObjectType = str13;
        this.relatedObjectId = str14;
        this.isSelected = z;
        this.showDate = z2;
        this.activityDoneByName = str15;
        this.activityDoneById = str16;
        this.activityDoneByProfile = str17;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
