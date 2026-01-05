package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Constants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class PhoneContacts implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PhoneContacts> CREATOR = new Creator();
    private String contactEmail;
    private String contactID;
    private String contactName;
    private String contactNumber;
    private String contactNumberEdited;
    private boolean isSelected;
    private String lookupKey;
    private String profileUrl;

    public static final class Creator implements Parcelable.Creator<PhoneContacts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneContacts createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PhoneContacts(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneContacts[] newArray(int i) {
            return new PhoneContacts[i];
        }
    }

    public PhoneContacts() {
        this(null, null, null, null, null, null, null, false, Constants.MAX_HOST_LENGTH, null);
    }

    public final String component1() {
        return this.contactID;
    }

    public final String component2() {
        return this.lookupKey;
    }

    public final String component3() {
        return this.contactName;
    }

    public final String component4() {
        return this.contactNumberEdited;
    }

    public final String component5() {
        return this.contactNumber;
    }

    public final String component6() {
        return this.contactEmail;
    }

    public final String component7() {
        return this.profileUrl;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    public final PhoneContacts copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        sq8.m48649h(str, "contactID");
        sq8.m48649h(str2, "lookupKey");
        sq8.m48649h(str3, "contactName");
        sq8.m48649h(str4, "contactNumberEdited");
        sq8.m48649h(str5, "contactNumber");
        sq8.m48649h(str6, "contactEmail");
        sq8.m48649h(str7, "profileUrl");
        return new PhoneContacts(str, str2, str3, str4, str5, str6, str7, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneContacts)) {
            return false;
        }
        PhoneContacts phoneContacts = (PhoneContacts) obj;
        return sq8.m48644c(this.contactID, phoneContacts.contactID) && sq8.m48644c(this.lookupKey, phoneContacts.lookupKey) && sq8.m48644c(this.contactName, phoneContacts.contactName) && sq8.m48644c(this.contactNumberEdited, phoneContacts.contactNumberEdited) && sq8.m48644c(this.contactNumber, phoneContacts.contactNumber) && sq8.m48644c(this.contactEmail, phoneContacts.contactEmail) && sq8.m48644c(this.profileUrl, phoneContacts.profileUrl) && this.isSelected == phoneContacts.isSelected;
    }

    public final String getContactEmail() {
        return this.contactEmail;
    }

    public final String getContactID() {
        return this.contactID;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getContactNumber() {
        return this.contactNumber;
    }

    public final String getContactNumberEdited() {
        return this.contactNumberEdited;
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((this.contactID.hashCode() * 31) + this.lookupKey.hashCode()) * 31) + this.contactName.hashCode()) * 31) + this.contactNumberEdited.hashCode()) * 31) + this.contactNumber.hashCode()) * 31) + this.contactEmail.hashCode()) * 31) + this.profileUrl.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setContactEmail(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactEmail = str;
    }

    public final void setContactID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactID = str;
    }

    public final void setContactName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactName = str;
    }

    public final void setContactNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactNumber = str;
    }

    public final void setContactNumberEdited(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactNumberEdited = str;
    }

    public final void setLookupKey(String str) {
        sq8.m48649h(str, "<set-?>");
        this.lookupKey = str;
    }

    public final void setProfileUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.profileUrl = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "PhoneContacts(contactID=" + this.contactID + ", lookupKey=" + this.lookupKey + ", contactName=" + this.contactName + ", contactNumberEdited=" + this.contactNumberEdited + ", contactNumber=" + this.contactNumber + ", contactEmail=" + this.contactEmail + ", profileUrl=" + this.profileUrl + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.contactID);
        parcel.writeString(this.lookupKey);
        parcel.writeString(this.contactName);
        parcel.writeString(this.contactNumberEdited);
        parcel.writeString(this.contactNumber);
        parcel.writeString(this.contactEmail);
        parcel.writeString(this.profileUrl);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public PhoneContacts(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        sq8.m48649h(str, "contactID");
        sq8.m48649h(str2, "lookupKey");
        sq8.m48649h(str3, "contactName");
        sq8.m48649h(str4, "contactNumberEdited");
        sq8.m48649h(str5, "contactNumber");
        sq8.m48649h(str6, "contactEmail");
        sq8.m48649h(str7, "profileUrl");
        this.contactID = str;
        this.lookupKey = str2;
        this.contactName = str3;
        this.contactNumberEdited = str4;
        this.contactNumber = str5;
        this.contactEmail = str6;
        this.profileUrl = str7;
        this.isSelected = z;
    }

    public /* synthetic */ PhoneContacts(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? false : z);
    }
}
