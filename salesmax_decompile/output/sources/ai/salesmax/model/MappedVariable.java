package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class MappedVariable extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MappedVariable> CREATOR = new Creator();
    private String fallBackValue;
    private Integer index;
    private String mappedObject;
    private String mappedProperty;
    private String sub_type;
    private String taType;
    private String variableId;

    public static final class Creator implements Parcelable.Creator<MappedVariable> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MappedVariable createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new MappedVariable(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MappedVariable[] newArray(int i) {
            return new MappedVariable[i];
        }
    }

    public MappedVariable() {
        this(null, null, null, null, null, null, null, Opcodes.LAND, null);
    }

    public static /* synthetic */ MappedVariable copy$default(MappedVariable mappedVariable, String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mappedVariable.taType;
        }
        if ((i & 2) != 0) {
            str2 = mappedVariable.variableId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = mappedVariable.mappedObject;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = mappedVariable.mappedProperty;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = mappedVariable.fallBackValue;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            num = mappedVariable.index;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            str6 = mappedVariable.sub_type;
        }
        return mappedVariable.copy(str, str7, str8, str9, str10, num2, str6);
    }

    public final String component1() {
        return this.taType;
    }

    public final String component2() {
        return this.variableId;
    }

    public final String component3() {
        return this.mappedObject;
    }

    public final String component4() {
        return this.mappedProperty;
    }

    public final String component5() {
        return this.fallBackValue;
    }

    public final Integer component6() {
        return this.index;
    }

    public final String component7() {
        return this.sub_type;
    }

    public final MappedVariable copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        return new MappedVariable(str, str2, str3, str4, str5, num, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MappedVariable)) {
            return false;
        }
        MappedVariable mappedVariable = (MappedVariable) obj;
        return sq8.m48644c(this.taType, mappedVariable.taType) && sq8.m48644c(this.variableId, mappedVariable.variableId) && sq8.m48644c(this.mappedObject, mappedVariable.mappedObject) && sq8.m48644c(this.mappedProperty, mappedVariable.mappedProperty) && sq8.m48644c(this.fallBackValue, mappedVariable.fallBackValue) && sq8.m48644c(this.index, mappedVariable.index) && sq8.m48644c(this.sub_type, mappedVariable.sub_type);
    }

    public final String getFallBackValue() {
        return this.fallBackValue;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getMappedObject() {
        return this.mappedObject;
    }

    public final String getMappedProperty() {
        return this.mappedProperty;
    }

    public final String getSub_type() {
        return this.sub_type;
    }

    public final String getTaType() {
        return this.taType;
    }

    public final String getVariableId() {
        return this.variableId;
    }

    public int hashCode() {
        String str = this.taType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variableId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mappedObject;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mappedProperty;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fallBackValue;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.index;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.sub_type;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setFallBackValue(String str) {
        this.fallBackValue = str;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setMappedObject(String str) {
        this.mappedObject = str;
    }

    public final void setMappedProperty(String str) {
        this.mappedProperty = str;
    }

    public final void setSub_type(String str) {
        this.sub_type = str;
    }

    public final void setTaType(String str) {
        this.taType = str;
    }

    public final void setVariableId(String str) {
        this.variableId = str;
    }

    public String toString() {
        return "MappedVariable(taType=" + this.taType + ", variableId=" + this.variableId + ", mappedObject=" + this.mappedObject + ", mappedProperty=" + this.mappedProperty + ", fallBackValue=" + this.fallBackValue + ", index=" + this.index + ", sub_type=" + this.sub_type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.taType);
        parcel.writeString(this.variableId);
        parcel.writeString(this.mappedObject);
        parcel.writeString(this.mappedProperty);
        parcel.writeString(this.fallBackValue);
        Integer num = this.index;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sub_type);
    }

    public /* synthetic */ MappedVariable(String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6);
    }

    public MappedVariable(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.taType = str;
        this.variableId = str2;
        this.mappedObject = str3;
        this.mappedProperty = str4;
        this.fallBackValue = str5;
        this.index = num;
        this.sub_type = str6;
    }
}
