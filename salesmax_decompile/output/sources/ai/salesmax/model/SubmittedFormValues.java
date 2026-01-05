package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class SubmittedFormValues extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubmittedFormValues> CREATOR = new Creator();
    private String accountId;
    private String contactId;
    private String extensionOfObject;
    private String extensionOfProperty;
    private FormDefinition formDefinition;
    private String id;
    private String objectId;
    private String submittedBy;
    private String submittedByIdType;
    private String value;

    public static final class Creator implements Parcelable.Creator<SubmittedFormValues> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmittedFormValues createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new SubmittedFormValues(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FormDefinition.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmittedFormValues[] newArray(int i) {
            return new SubmittedFormValues[i];
        }
    }

    public SubmittedFormValues() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.submittedByIdType;
    }

    public final String component2() {
        return this.accountId;
    }

    public final FormDefinition component3() {
        return this.formDefinition;
    }

    public final String component4() {
        return this.value;
    }

    public final String component5() {
        return this.extensionOfProperty;
    }

    public final String component6() {
        return this.extensionOfObject;
    }

    public final String component7() {
        return this.objectId;
    }

    public final String component8() {
        return this.contactId;
    }

    public final String component9() {
        return this.submittedBy;
    }

    public final SubmittedFormValues copy(String str, String str2, FormDefinition formDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new SubmittedFormValues(str, str2, formDefinition, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmittedFormValues)) {
            return false;
        }
        SubmittedFormValues submittedFormValues = (SubmittedFormValues) obj;
        return sq8.m48644c(this.id, submittedFormValues.id) && sq8.m48644c(this.accountId, submittedFormValues.accountId) && sq8.m48644c(this.formDefinition, submittedFormValues.formDefinition) && sq8.m48644c(this.value, submittedFormValues.value) && sq8.m48644c(this.extensionOfProperty, submittedFormValues.extensionOfProperty) && sq8.m48644c(this.extensionOfObject, submittedFormValues.extensionOfObject) && sq8.m48644c(this.objectId, submittedFormValues.objectId) && sq8.m48644c(this.contactId, submittedFormValues.contactId) && sq8.m48644c(this.submittedBy, submittedFormValues.submittedBy) && sq8.m48644c(this.submittedByIdType, submittedFormValues.submittedByIdType);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getExtensionOfObject() {
        return this.extensionOfObject;
    }

    public final String getExtensionOfProperty() {
        return this.extensionOfProperty;
    }

    public final FormDefinition getFormDefinition() {
        return this.formDefinition;
    }

    public final String getId() {
        return this.id;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getSubmittedBy() {
        return this.submittedBy;
    }

    public final String getSubmittedByIdType() {
        return this.submittedByIdType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FormDefinition formDefinition = this.formDefinition;
        int iHashCode3 = (iHashCode2 + (formDefinition == null ? 0 : formDefinition.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extensionOfProperty;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extensionOfObject;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.objectId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contactId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.submittedBy;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.submittedByIdType;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setExtensionOfObject(String str) {
        this.extensionOfObject = str;
    }

    public final void setExtensionOfProperty(String str) {
        this.extensionOfProperty = str;
    }

    public final void setFormDefinition(FormDefinition formDefinition) {
        this.formDefinition = formDefinition;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setObjectId(String str) {
        this.objectId = str;
    }

    public final void setSubmittedBy(String str) {
        this.submittedBy = str;
    }

    public final void setSubmittedByIdType(String str) {
        this.submittedByIdType = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "SubmittedFormValues(id=" + this.id + ", accountId=" + this.accountId + ", formDefinition=" + this.formDefinition + ", value=" + this.value + ", extensionOfProperty=" + this.extensionOfProperty + ", extensionOfObject=" + this.extensionOfObject + ", objectId=" + this.objectId + ", contactId=" + this.contactId + ", submittedBy=" + this.submittedBy + ", submittedByIdType=" + this.submittedByIdType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        FormDefinition formDefinition = this.formDefinition;
        if (formDefinition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formDefinition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.value);
        parcel.writeString(this.extensionOfProperty);
        parcel.writeString(this.extensionOfObject);
        parcel.writeString(this.objectId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.submittedBy);
        parcel.writeString(this.submittedByIdType);
    }

    public /* synthetic */ SubmittedFormValues(String str, String str2, FormDefinition formDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : formDefinition, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }

    public SubmittedFormValues(String str, String str2, FormDefinition formDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.id = str;
        this.accountId = str2;
        this.formDefinition = formDefinition;
        this.value = str3;
        this.extensionOfProperty = str4;
        this.extensionOfObject = str5;
        this.objectId = str6;
        this.contactId = str7;
        this.submittedBy = str8;
        this.submittedByIdType = str9;
    }
}
