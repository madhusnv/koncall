package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class DocTypeDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DocTypeDefinition> CREATOR = new Creator();
    private boolean selected;
    private List<String> subCategory;
    private String value;
    private String viewValue;

    public static final class Creator implements Parcelable.Creator<DocTypeDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocTypeDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new DocTypeDefinition(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocTypeDefinition[] newArray(int i) {
            return new DocTypeDefinition[i];
        }
    }

    public DocTypeDefinition() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocTypeDefinition copy$default(DocTypeDefinition docTypeDefinition, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docTypeDefinition.value;
        }
        if ((i & 2) != 0) {
            str2 = docTypeDefinition.viewValue;
        }
        if ((i & 4) != 0) {
            list = docTypeDefinition.subCategory;
        }
        if ((i & 8) != 0) {
            z = docTypeDefinition.selected;
        }
        return docTypeDefinition.copy(str, str2, list, z);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.viewValue;
    }

    public final List<String> component3() {
        return this.subCategory;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final DocTypeDefinition copy(String str, String str2, List<String> list, boolean z) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        sq8.m48649h(list, "subCategory");
        return new DocTypeDefinition(str, str2, list, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocTypeDefinition)) {
            return false;
        }
        DocTypeDefinition docTypeDefinition = (DocTypeDefinition) obj;
        return sq8.m48644c(this.value, docTypeDefinition.value) && sq8.m48644c(this.viewValue, docTypeDefinition.viewValue) && sq8.m48644c(this.subCategory, docTypeDefinition.subCategory) && this.selected == docTypeDefinition.selected;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final List<String> getSubCategory() {
        return this.subCategory;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getViewValue() {
        return this.viewValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.value.hashCode() * 31) + this.viewValue.hashCode()) * 31) + this.subCategory.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setSubCategory(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.subCategory = list;
    }

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public final void setViewValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.viewValue = str;
    }

    public String toString() {
        return "DocTypeDefinition(value=" + this.value + ", viewValue=" + this.viewValue + ", subCategory=" + this.subCategory + ", selected=" + this.selected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.value);
        parcel.writeString(this.viewValue);
        parcel.writeStringList(this.subCategory);
        parcel.writeInt(this.selected ? 1 : 0);
    }

    public /* synthetic */ DocTypeDefinition(String str, String str2, List list, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? false : z);
    }

    public DocTypeDefinition(String str, String str2, List<String> list, boolean z) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        sq8.m48649h(list, "subCategory");
        this.value = str;
        this.viewValue = str2;
        this.subCategory = list;
        this.selected = z;
    }
}
