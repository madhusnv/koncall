package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class SupportResource extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportResource> CREATOR = new Creator();
    private String category;
    private Long createdAt;
    private String description;
    private String externalLinkUrl;
    private String format;
    private String id;
    private boolean isActive;
    private List<String> relevantForAuthorization;
    private String subCategory;
    private List<String> tags;
    private String thumbnailUrl;
    private Long timeRequired;
    private String title;
    private Long updatedAt;

    public static final class Creator implements Parcelable.Creator<SupportResource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportResource createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new SupportResource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportResource[] newArray(int i) {
            return new SupportResource[i];
        }
    }

    public SupportResource() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.externalLinkUrl;
    }

    public final List<String> component11() {
        return this.tags;
    }

    public final List<String> component12() {
        return this.relevantForAuthorization;
    }

    public final Long component13() {
        return this.updatedAt;
    }

    public final Long component14() {
        return this.createdAt;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.category;
    }

    public final String component5() {
        return this.subCategory;
    }

    public final boolean component6() {
        return this.isActive;
    }

    public final String component7() {
        return this.format;
    }

    public final Long component8() {
        return this.timeRequired;
    }

    public final String component9() {
        return this.thumbnailUrl;
    }

    public final SupportResource copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Long l, String str7, String str8, List<String> list, List<String> list2, Long l2, Long l3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "category");
        sq8.m48649h(str5, "subCategory");
        sq8.m48649h(str6, "format");
        sq8.m48649h(str7, "thumbnailUrl");
        sq8.m48649h(str8, "externalLinkUrl");
        sq8.m48649h(list, "tags");
        sq8.m48649h(list2, "relevantForAuthorization");
        return new SupportResource(str, str2, str3, str4, str5, z, str6, l, str7, str8, list, list2, l2, l3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportResource)) {
            return false;
        }
        SupportResource supportResource = (SupportResource) obj;
        return sq8.m48644c(this.id, supportResource.id) && sq8.m48644c(this.title, supportResource.title) && sq8.m48644c(this.description, supportResource.description) && sq8.m48644c(this.category, supportResource.category) && sq8.m48644c(this.subCategory, supportResource.subCategory) && this.isActive == supportResource.isActive && sq8.m48644c(this.format, supportResource.format) && sq8.m48644c(this.timeRequired, supportResource.timeRequired) && sq8.m48644c(this.thumbnailUrl, supportResource.thumbnailUrl) && sq8.m48644c(this.externalLinkUrl, supportResource.externalLinkUrl) && sq8.m48644c(this.tags, supportResource.tags) && sq8.m48644c(this.relevantForAuthorization, supportResource.relevantForAuthorization) && sq8.m48644c(this.updatedAt, supportResource.updatedAt) && sq8.m48644c(this.createdAt, supportResource.createdAt);
    }

    public final String getCategory() {
        return this.category;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExternalLinkUrl() {
        return this.externalLinkUrl;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getRelevantForAuthorization() {
        return this.relevantForAuthorization;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final Long getTimeRequired() {
        return this.timeRequired;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.category.hashCode()) * 31) + this.subCategory.hashCode()) * 31;
        boolean z = this.isActive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (((iHashCode + i) * 31) + this.format.hashCode()) * 31;
        Long l = this.timeRequired;
        int iHashCode3 = (((((((((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.externalLinkUrl.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.relevantForAuthorization.hashCode()) * 31;
        Long l2 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.createdAt;
        return iHashCode4 + (l3 != null ? l3.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.category = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setExternalLinkUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.externalLinkUrl = str;
    }

    public final void setFormat(String str) {
        sq8.m48649h(str, "<set-?>");
        this.format = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setRelevantForAuthorization(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.relevantForAuthorization = list;
    }

    public final void setSubCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.subCategory = str;
    }

    public final void setTags(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.tags = list;
    }

    public final void setThumbnailUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.thumbnailUrl = str;
    }

    public final void setTimeRequired(Long l) {
        this.timeRequired = l;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public String toString() {
        return "SupportResource(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", category=" + this.category + ", subCategory=" + this.subCategory + ", isActive=" + this.isActive + ", format=" + this.format + ", timeRequired=" + this.timeRequired + ", thumbnailUrl=" + this.thumbnailUrl + ", externalLinkUrl=" + this.externalLinkUrl + ", tags=" + this.tags + ", relevantForAuthorization=" + this.relevantForAuthorization + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.category);
        parcel.writeString(this.subCategory);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeString(this.format);
        Long l = this.timeRequired;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.externalLinkUrl);
        parcel.writeStringList(this.tags);
        parcel.writeStringList(this.relevantForAuthorization);
        Long l2 = this.updatedAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.createdAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public /* synthetic */ SupportResource(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Long l, String str7, String str8, List list, List list2, Long l2, Long l3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : l, (i & 256) != 0 ? "" : str7, (i & 512) == 0 ? str8 : "", (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? new ArrayList() : list2, (i & 4096) != 0 ? null : l2, (i & 8192) == 0 ? l3 : null);
    }

    public SupportResource(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Long l, String str7, String str8, List<String> list, List<String> list2, Long l2, Long l3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "category");
        sq8.m48649h(str5, "subCategory");
        sq8.m48649h(str6, "format");
        sq8.m48649h(str7, "thumbnailUrl");
        sq8.m48649h(str8, "externalLinkUrl");
        sq8.m48649h(list, "tags");
        sq8.m48649h(list2, "relevantForAuthorization");
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.category = str4;
        this.subCategory = str5;
        this.isActive = z;
        this.format = str6;
        this.timeRequired = l;
        this.thumbnailUrl = str7;
        this.externalLinkUrl = str8;
        this.tags = list;
        this.relevantForAuthorization = list2;
        this.updatedAt = l2;
        this.createdAt = l3;
    }
}
