package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class Product extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Product> CREATOR = new Creator();
    private String currency;
    private String description;
    private String hsCode;
    private String id;
    private Integer incrementBy;
    private String measurementUnit;
    private String name;
    private String parentProductId;
    private String productPicture;
    private String skuCode;
    private String standardPricePerUnit;

    /* renamed from: type, reason: collision with root package name */
    private String f58055type;

    public static final class Creator implements Parcelable.Creator<Product> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new Product(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product[] newArray(int i) {
            return new Product[i];
        }
    }

    public Product() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.currency;
    }

    public final String component11() {
        return this.parentProductId;
    }

    public final String component12() {
        return this.productPicture;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.f58055type;
    }

    public final String component5() {
        return this.measurementUnit;
    }

    public final Integer component6() {
        return this.incrementBy;
    }

    public final String component7() {
        return this.hsCode;
    }

    public final String component8() {
        return this.skuCode;
    }

    public final String component9() {
        return this.standardPricePerUnit;
    }

    public final Product copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return new Product(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return sq8.m48644c(this.id, product.id) && sq8.m48644c(this.name, product.name) && sq8.m48644c(this.description, product.description) && sq8.m48644c(this.f58055type, product.f58055type) && sq8.m48644c(this.measurementUnit, product.measurementUnit) && sq8.m48644c(this.incrementBy, product.incrementBy) && sq8.m48644c(this.hsCode, product.hsCode) && sq8.m48644c(this.skuCode, product.skuCode) && sq8.m48644c(this.standardPricePerUnit, product.standardPricePerUnit) && sq8.m48644c(this.currency, product.currency) && sq8.m48644c(this.parentProductId, product.parentProductId) && sq8.m48644c(this.productPicture, product.productPicture);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHsCode() {
        return this.hsCode;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getIncrementBy() {
        return this.incrementBy;
    }

    public final String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentProductId() {
        return this.parentProductId;
    }

    public final String getProductPicture() {
        return this.productPicture;
    }

    public final String getSkuCode() {
        return this.skuCode;
    }

    public final String getStandardPricePerUnit() {
        return this.standardPricePerUnit;
    }

    public final String getType() {
        return this.f58055type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f58055type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.measurementUnit;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.incrementBy;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.hsCode;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.skuCode;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.standardPricePerUnit;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currency;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.parentProductId;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productPicture;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setHsCode(String str) {
        this.hsCode = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setIncrementBy(Integer num) {
        this.incrementBy = num;
    }

    public final void setMeasurementUnit(String str) {
        this.measurementUnit = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParentProductId(String str) {
        this.parentProductId = str;
    }

    public final void setProductPicture(String str) {
        this.productPicture = str;
    }

    public final void setSkuCode(String str) {
        this.skuCode = str;
    }

    public final void setStandardPricePerUnit(String str) {
        this.standardPricePerUnit = str;
    }

    public final void setType(String str) {
        this.f58055type = str;
    }

    public String toString() {
        return "Product(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58055type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.f58055type);
        parcel.writeString(this.measurementUnit);
        Integer num = this.incrementBy;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.hsCode);
        parcel.writeString(this.skuCode);
        parcel.writeString(this.standardPricePerUnit);
        parcel.writeString(this.currency);
        parcel.writeString(this.parentProductId);
        parcel.writeString(this.productPicture);
    }

    public /* synthetic */ Product(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 1 : num, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? str11 : "");
    }

    public Product(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.f58055type = str4;
        this.measurementUnit = str5;
        this.incrementBy = num;
        this.hsCode = str6;
        this.skuCode = str7;
        this.standardPricePerUnit = str8;
        this.currency = str9;
        this.parentProductId = str10;
        this.productPicture = str11;
    }
}
