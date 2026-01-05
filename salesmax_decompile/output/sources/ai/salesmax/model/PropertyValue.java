package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PropertyValue extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PropertyValue> CREATOR = new Creator();
    private String accountId;
    private String createSourceId;
    private String createSourceType;
    private String createdById;
    private String id;
    private String parentObject;
    private String parentObjectId;
    private String parentObjectType;
    private PropertyDefinition propertyDefinition;
    private String updatedById;
    private String value;

    public static final class Creator implements Parcelable.Creator<PropertyValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyValue createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PropertyValue(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PropertyDefinition.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyValue[] newArray(int i) {
            return new PropertyValue[i];
        }
    }

    public PropertyValue() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.updatedById;
    }

    public final String component11() {
        return this.createdById;
    }

    public final String component2() {
        return this.accountId;
    }

    public final PropertyDefinition component3() {
        return this.propertyDefinition;
    }

    public final String component4() {
        return this.parentObjectId;
    }

    public final String component5() {
        return this.parentObject;
    }

    public final String component6() {
        return this.parentObjectType;
    }

    public final String component7() {
        return this.value;
    }

    public final String component8() {
        return this.createSourceId;
    }

    public final String component9() {
        return this.createSourceType;
    }

    public final PropertyValue copy(String str, String str2, PropertyDefinition propertyDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "parentObjectId");
        sq8.m48649h(str4, "parentObject");
        sq8.m48649h(str7, "createSourceId");
        sq8.m48649h(str8, "createSourceType");
        sq8.m48649h(str9, "updatedById");
        sq8.m48649h(str10, "createdById");
        return new PropertyValue(str, str2, propertyDefinition, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyValue)) {
            return false;
        }
        PropertyValue propertyValue = (PropertyValue) obj;
        return sq8.m48644c(this.id, propertyValue.id) && sq8.m48644c(this.accountId, propertyValue.accountId) && sq8.m48644c(this.propertyDefinition, propertyValue.propertyDefinition) && sq8.m48644c(this.parentObjectId, propertyValue.parentObjectId) && sq8.m48644c(this.parentObject, propertyValue.parentObject) && sq8.m48644c(this.parentObjectType, propertyValue.parentObjectType) && sq8.m48644c(this.value, propertyValue.value) && sq8.m48644c(this.createSourceId, propertyValue.createSourceId) && sq8.m48644c(this.createSourceType, propertyValue.createSourceType) && sq8.m48644c(this.updatedById, propertyValue.updatedById) && sq8.m48644c(this.createdById, propertyValue.createdById);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCreateSourceId() {
        return this.createSourceId;
    }

    public final String getCreateSourceType() {
        return this.createSourceType;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentObject() {
        return this.parentObject;
    }

    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    public final PropertyDefinition getPropertyDefinition() {
        return this.propertyDefinition;
    }

    public final String getUpdatedById() {
        return this.updatedById;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31;
        PropertyDefinition propertyDefinition = this.propertyDefinition;
        int iHashCode2 = (((((iHashCode + (propertyDefinition == null ? 0 : propertyDefinition.hashCode())) * 31) + this.parentObjectId.hashCode()) * 31) + this.parentObject.hashCode()) * 31;
        String str = this.parentObjectType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return ((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.createSourceId.hashCode()) * 31) + this.createSourceType.hashCode()) * 31) + this.updatedById.hashCode()) * 31) + this.createdById.hashCode();
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setCreateSourceId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createSourceId = str;
    }

    public final void setCreateSourceType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createSourceType = str;
    }

    public final void setCreatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createdById = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setParentObject(String str) {
        sq8.m48649h(str, "<set-?>");
        this.parentObject = str;
    }

    public final void setParentObjectId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.parentObjectId = str;
    }

    public final void setParentObjectType(String str) {
        this.parentObjectType = str;
    }

    public final void setPropertyDefinition(PropertyDefinition propertyDefinition) {
        this.propertyDefinition = propertyDefinition;
    }

    public final void setUpdatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.updatedById = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "PropertyValue(id=" + this.id + ", accountId=" + this.accountId + ", propertyDefinition=" + this.propertyDefinition + ", parentObjectId=" + this.parentObjectId + ", parentObject=" + this.parentObject + ", parentObjectType=" + this.parentObjectType + ", value=" + this.value + ", createSourceId=" + this.createSourceId + ", createSourceType=" + this.createSourceType + ", updatedById=" + this.updatedById + ", createdById=" + this.createdById + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        PropertyDefinition propertyDefinition = this.propertyDefinition;
        if (propertyDefinition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propertyDefinition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.parentObjectId);
        parcel.writeString(this.parentObject);
        parcel.writeString(this.parentObjectType);
        parcel.writeString(this.value);
        parcel.writeString(this.createSourceId);
        parcel.writeString(this.createSourceType);
        parcel.writeString(this.updatedById);
        parcel.writeString(this.createdById);
    }

    public /* synthetic */ PropertyValue(String str, String str2, PropertyDefinition propertyDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : propertyDefinition, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "{}" : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
    }

    public PropertyValue(String str, String str2, PropertyDefinition propertyDefinition, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "parentObjectId");
        sq8.m48649h(str4, "parentObject");
        sq8.m48649h(str7, "createSourceId");
        sq8.m48649h(str8, "createSourceType");
        sq8.m48649h(str9, "updatedById");
        sq8.m48649h(str10, "createdById");
        this.id = str;
        this.accountId = str2;
        this.propertyDefinition = propertyDefinition;
        this.parentObjectId = str3;
        this.parentObject = str4;
        this.parentObjectType = str5;
        this.value = str6;
        this.createSourceId = str7;
        this.createSourceType = str8;
        this.updatedById = str9;
        this.createdById = str10;
    }
}
