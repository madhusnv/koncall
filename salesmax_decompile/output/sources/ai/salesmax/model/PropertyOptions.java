package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class PropertyOptions implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PropertyOptions> CREATOR = new Creator();
    private boolean isSelected;
    private String otherAttributes;
    private String value;
    private String viewValue;

    public static final class Creator implements Parcelable.Creator<PropertyOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyOptions createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PropertyOptions(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyOptions[] newArray(int i) {
            return new PropertyOptions[i];
        }
    }

    public PropertyOptions() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ PropertyOptions copy$default(PropertyOptions propertyOptions, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyOptions.value;
        }
        if ((i & 2) != 0) {
            str2 = propertyOptions.viewValue;
        }
        if ((i & 4) != 0) {
            str3 = propertyOptions.otherAttributes;
        }
        if ((i & 8) != 0) {
            z = propertyOptions.isSelected;
        }
        return propertyOptions.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.viewValue;
    }

    public final String component3() {
        return this.otherAttributes;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final PropertyOptions copy(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "value");
        return new PropertyOptions(str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyOptions)) {
            return false;
        }
        PropertyOptions propertyOptions = (PropertyOptions) obj;
        return sq8.m48644c(this.value, propertyOptions.value) && sq8.m48644c(this.viewValue, propertyOptions.viewValue) && sq8.m48644c(this.otherAttributes, propertyOptions.otherAttributes) && this.isSelected == propertyOptions.isSelected;
    }

    public final String getOtherAttributes() {
        return this.otherAttributes;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getViewValue() {
        return this.viewValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.viewValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.otherAttributes;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode3 + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setOtherAttributes(String str) {
        this.otherAttributes = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public final void setViewValue(String str) {
        this.viewValue = str;
    }

    public String toString() {
        return "PropertyOptions(value=" + this.value + ", viewValue=" + this.viewValue + ", otherAttributes=" + this.otherAttributes + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.value);
        parcel.writeString(this.viewValue);
        parcel.writeString(this.otherAttributes);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public PropertyOptions(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "value");
        this.value = str;
        this.viewValue = str2;
        this.otherAttributes = str3;
        this.isSelected = z;
    }

    public /* synthetic */ PropertyOptions(String str, String str2, String str3, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
