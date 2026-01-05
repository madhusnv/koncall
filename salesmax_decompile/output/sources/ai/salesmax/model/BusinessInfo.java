package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class BusinessInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BusinessInfo> CREATOR = new Creator();
    private String id;
    private String industry;
    private String name;
    private String priority;
    private String website;

    public static final class Creator implements Parcelable.Creator<BusinessInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new BusinessInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessInfo[] newArray(int i) {
            return new BusinessInfo[i];
        }
    }

    public BusinessInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BusinessInfo copy$default(BusinessInfo businessInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = businessInfo.industry;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = businessInfo.website;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = businessInfo.name;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = businessInfo.priority;
        }
        return businessInfo.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.industry;
    }

    public final String component3() {
        return this.website;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.priority;
    }

    public final BusinessInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new BusinessInfo(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessInfo)) {
            return false;
        }
        BusinessInfo businessInfo = (BusinessInfo) obj;
        return sq8.m48644c(this.id, businessInfo.id) && sq8.m48644c(this.industry, businessInfo.industry) && sq8.m48644c(this.website, businessInfo.website) && sq8.m48644c(this.name, businessInfo.name) && sq8.m48644c(this.priority, businessInfo.priority);
    }

    public final String getId() {
        return this.id;
    }

    public final String getIndustry() {
        return this.industry;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.industry;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.website;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priority;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIndustry(String str) {
        this.industry = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPriority(String str) {
        this.priority = str;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }

    public String toString() {
        return "BusinessInfo(id=" + this.id + ", industry=" + this.industry + ", website=" + this.website + ", name=" + this.name + ", priority=" + this.priority + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.industry);
        parcel.writeString(this.website);
        parcel.writeString(this.name);
        parcel.writeString(this.priority);
    }

    public /* synthetic */ BusinessInfo(String str, String str2, String str3, String str4, String str5, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5);
    }

    public BusinessInfo(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.industry = str2;
        this.website = str3;
        this.name = str4;
        this.priority = str5;
    }
}
