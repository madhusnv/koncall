package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class Field implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Field> CREATOR = new Creator();
    private String fieldName;
    private String fieldParentObjectType;
    private FieldDisplayCondition hideCondition;
    private String hintText;
    private Boolean isHidden;
    private Boolean isMandatory;
    private Boolean isViewOnly;
    private String preSetValue;
    private PropertyDefinition propertyDefinition;
    private String propertyDefinitionId;
    private FieldDisplayCondition showCondition;
    private String viewType;

    public static final class Creator implements Parcelable.Creator<Field> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Field createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Field(string, string2, string3, boolValueOf, boolValueOf2, string4, string5, boolValueOf3, parcel.readString(), parcel.readInt() == 0 ? null : PropertyDefinition.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FieldDisplayCondition.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FieldDisplayCondition.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Field[] newArray(int i) {
            return new Field[i];
        }
    }

    public Field() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.fieldName;
    }

    public final PropertyDefinition component10() {
        return this.propertyDefinition;
    }

    public final FieldDisplayCondition component11() {
        return this.showCondition;
    }

    public final FieldDisplayCondition component12() {
        return this.hideCondition;
    }

    public final String component2() {
        return this.fieldParentObjectType;
    }

    public final String component3() {
        return this.viewType;
    }

    public final Boolean component4() {
        return this.isMandatory;
    }

    public final Boolean component5() {
        return this.isViewOnly;
    }

    public final String component6() {
        return this.hintText;
    }

    public final String component7() {
        return this.preSetValue;
    }

    public final Boolean component8() {
        return this.isHidden;
    }

    public final String component9() {
        return this.propertyDefinitionId;
    }

    public final Field copy(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Boolean bool3, String str6, PropertyDefinition propertyDefinition, FieldDisplayCondition fieldDisplayCondition, FieldDisplayCondition fieldDisplayCondition2) {
        sq8.m48649h(str, "fieldName");
        sq8.m48649h(str2, "fieldParentObjectType");
        return new Field(str, str2, str3, bool, bool2, str4, str5, bool3, str6, propertyDefinition, fieldDisplayCondition, fieldDisplayCondition2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return sq8.m48644c(this.fieldName, field.fieldName) && sq8.m48644c(this.fieldParentObjectType, field.fieldParentObjectType) && sq8.m48644c(this.viewType, field.viewType) && sq8.m48644c(this.isMandatory, field.isMandatory) && sq8.m48644c(this.isViewOnly, field.isViewOnly) && sq8.m48644c(this.hintText, field.hintText) && sq8.m48644c(this.preSetValue, field.preSetValue) && sq8.m48644c(this.isHidden, field.isHidden) && sq8.m48644c(this.propertyDefinitionId, field.propertyDefinitionId) && sq8.m48644c(this.propertyDefinition, field.propertyDefinition) && sq8.m48644c(this.showCondition, field.showCondition) && sq8.m48644c(this.hideCondition, field.hideCondition);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getFieldParentObjectType() {
        return this.fieldParentObjectType;
    }

    public final FieldDisplayCondition getHideCondition() {
        return this.hideCondition;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final String getPreSetValue() {
        return this.preSetValue;
    }

    public final PropertyDefinition getPropertyDefinition() {
        return this.propertyDefinition;
    }

    public final String getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public final FieldDisplayCondition getShowCondition() {
        return this.showCondition;
    }

    public final String getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iHashCode = ((this.fieldName.hashCode() * 31) + this.fieldParentObjectType.hashCode()) * 31;
        String str = this.viewType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isMandatory;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isViewOnly;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.hintText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preSetValue;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isHidden;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.propertyDefinitionId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PropertyDefinition propertyDefinition = this.propertyDefinition;
        int iHashCode9 = (iHashCode8 + (propertyDefinition == null ? 0 : propertyDefinition.hashCode())) * 31;
        FieldDisplayCondition fieldDisplayCondition = this.showCondition;
        int iHashCode10 = (iHashCode9 + (fieldDisplayCondition == null ? 0 : fieldDisplayCondition.hashCode())) * 31;
        FieldDisplayCondition fieldDisplayCondition2 = this.hideCondition;
        return iHashCode10 + (fieldDisplayCondition2 != null ? fieldDisplayCondition2.hashCode() : 0);
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isMandatory() {
        return this.isMandatory;
    }

    public final Boolean isViewOnly() {
        return this.isViewOnly;
    }

    public final void setFieldName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fieldName = str;
    }

    public final void setFieldParentObjectType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fieldParentObjectType = str;
    }

    public final void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    public final void setHideCondition(FieldDisplayCondition fieldDisplayCondition) {
        this.hideCondition = fieldDisplayCondition;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }

    public final void setMandatory(Boolean bool) {
        this.isMandatory = bool;
    }

    public final void setPreSetValue(String str) {
        this.preSetValue = str;
    }

    public final void setPropertyDefinition(PropertyDefinition propertyDefinition) {
        this.propertyDefinition = propertyDefinition;
    }

    public final void setPropertyDefinitionId(String str) {
        this.propertyDefinitionId = str;
    }

    public final void setShowCondition(FieldDisplayCondition fieldDisplayCondition) {
        this.showCondition = fieldDisplayCondition;
    }

    public final void setViewOnly(Boolean bool) {
        this.isViewOnly = bool;
    }

    public final void setViewType(String str) {
        this.viewType = str;
    }

    public String toString() {
        return "Field(fieldName=" + this.fieldName + ", fieldParentObjectType=" + this.fieldParentObjectType + ", viewType=" + this.viewType + ", isMandatory=" + this.isMandatory + ", isViewOnly=" + this.isViewOnly + ", hintText=" + this.hintText + ", preSetValue=" + this.preSetValue + ", isHidden=" + this.isHidden + ", propertyDefinitionId=" + this.propertyDefinitionId + ", propertyDefinition=" + this.propertyDefinition + ", showCondition=" + this.showCondition + ", hideCondition=" + this.hideCondition + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.fieldName);
        parcel.writeString(this.fieldParentObjectType);
        parcel.writeString(this.viewType);
        Boolean bool = this.isMandatory;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isViewOnly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.hintText);
        parcel.writeString(this.preSetValue);
        Boolean bool3 = this.isHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.propertyDefinitionId);
        PropertyDefinition propertyDefinition = this.propertyDefinition;
        if (propertyDefinition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propertyDefinition.writeToParcel(parcel, i);
        }
        FieldDisplayCondition fieldDisplayCondition = this.showCondition;
        if (fieldDisplayCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fieldDisplayCondition.writeToParcel(parcel, i);
        }
        FieldDisplayCondition fieldDisplayCondition2 = this.hideCondition;
        if (fieldDisplayCondition2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fieldDisplayCondition2.writeToParcel(parcel, i);
        }
    }

    public Field(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Boolean bool3, String str6, PropertyDefinition propertyDefinition, FieldDisplayCondition fieldDisplayCondition, FieldDisplayCondition fieldDisplayCondition2) {
        sq8.m48649h(str, "fieldName");
        sq8.m48649h(str2, "fieldParentObjectType");
        this.fieldName = str;
        this.fieldParentObjectType = str2;
        this.viewType = str3;
        this.isMandatory = bool;
        this.isViewOnly = bool2;
        this.hintText = str4;
        this.preSetValue = str5;
        this.isHidden = bool3;
        this.propertyDefinitionId = str6;
        this.propertyDefinition = propertyDefinition;
        this.showCondition = fieldDisplayCondition;
        this.hideCondition = fieldDisplayCondition2;
    }

    public /* synthetic */ Field(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Boolean bool3, String str6, PropertyDefinition propertyDefinition, FieldDisplayCondition fieldDisplayCondition, FieldDisplayCondition fieldDisplayCondition2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : propertyDefinition, (i & 1024) != 0 ? null : fieldDisplayCondition, (i & 2048) == 0 ? fieldDisplayCondition2 : null);
    }
}
