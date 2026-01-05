package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ProductWa implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProductWa> CREATOR = new Creator();
    private String product_retailer_id;

    public static final class Creator implements Parcelable.Creator<ProductWa> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductWa createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ProductWa(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductWa[] newArray(int i) {
            return new ProductWa[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductWa() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProductWa copy$default(ProductWa productWa, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productWa.product_retailer_id;
        }
        return productWa.copy(str);
    }

    public final String component1() {
        return this.product_retailer_id;
    }

    public final ProductWa copy(String str) {
        return new ProductWa(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductWa) && sq8.m48644c(this.product_retailer_id, ((ProductWa) obj).product_retailer_id);
    }

    public final String getProduct_retailer_id() {
        return this.product_retailer_id;
    }

    public int hashCode() {
        String str = this.product_retailer_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setProduct_retailer_id(String str) {
        this.product_retailer_id = str;
    }

    public String toString() {
        return "ProductWa(product_retailer_id=" + this.product_retailer_id + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.product_retailer_id);
    }

    public ProductWa(String str) {
        this.product_retailer_id = str;
    }

    public /* synthetic */ ProductWa(String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
