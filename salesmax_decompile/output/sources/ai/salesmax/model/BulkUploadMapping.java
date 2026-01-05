package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class BulkUploadMapping extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BulkUploadMapping> CREATOR = new Creator();
    private String mappedField;
    private String sampleItem;
    private String sheetHeader;

    public static final class Creator implements Parcelable.Creator<BulkUploadMapping> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkUploadMapping createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new BulkUploadMapping(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkUploadMapping[] newArray(int i) {
            return new BulkUploadMapping[i];
        }
    }

    public BulkUploadMapping() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BulkUploadMapping copy$default(BulkUploadMapping bulkUploadMapping, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bulkUploadMapping.sheetHeader;
        }
        if ((i & 2) != 0) {
            str2 = bulkUploadMapping.mappedField;
        }
        if ((i & 4) != 0) {
            str3 = bulkUploadMapping.sampleItem;
        }
        return bulkUploadMapping.copy(str, str2, str3);
    }

    public final String component1() {
        return this.sheetHeader;
    }

    public final String component2() {
        return this.mappedField;
    }

    public final String component3() {
        return this.sampleItem;
    }

    public final BulkUploadMapping copy(String str, String str2, String str3) {
        sq8.m48649h(str, "sheetHeader");
        sq8.m48649h(str2, "mappedField");
        sq8.m48649h(str3, "sampleItem");
        return new BulkUploadMapping(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkUploadMapping)) {
            return false;
        }
        BulkUploadMapping bulkUploadMapping = (BulkUploadMapping) obj;
        return sq8.m48644c(this.sheetHeader, bulkUploadMapping.sheetHeader) && sq8.m48644c(this.mappedField, bulkUploadMapping.mappedField) && sq8.m48644c(this.sampleItem, bulkUploadMapping.sampleItem);
    }

    public final String getMappedField() {
        return this.mappedField;
    }

    public final String getSampleItem() {
        return this.sampleItem;
    }

    public final String getSheetHeader() {
        return this.sheetHeader;
    }

    public int hashCode() {
        return (((this.sheetHeader.hashCode() * 31) + this.mappedField.hashCode()) * 31) + this.sampleItem.hashCode();
    }

    public final void setMappedField(String str) {
        sq8.m48649h(str, "<set-?>");
        this.mappedField = str;
    }

    public final void setSampleItem(String str) {
        sq8.m48649h(str, "<set-?>");
        this.sampleItem = str;
    }

    public final void setSheetHeader(String str) {
        sq8.m48649h(str, "<set-?>");
        this.sheetHeader = str;
    }

    public String toString() {
        return "BulkUploadMapping(sheetHeader=" + this.sheetHeader + ", mappedField=" + this.mappedField + ", sampleItem=" + this.sampleItem + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.sheetHeader);
        parcel.writeString(this.mappedField);
        parcel.writeString(this.sampleItem);
    }

    public /* synthetic */ BulkUploadMapping(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public BulkUploadMapping(String str, String str2, String str3) {
        sq8.m48649h(str, "sheetHeader");
        sq8.m48649h(str2, "mappedField");
        sq8.m48649h(str3, "sampleItem");
        this.sheetHeader = str;
        this.mappedField = str2;
        this.sampleItem = str3;
    }
}
