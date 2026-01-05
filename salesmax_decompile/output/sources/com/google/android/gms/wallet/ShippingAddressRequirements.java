package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "ShippingAddressRequirementsCreator")
/* loaded from: classes3.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzag();

    @SafeParcelable.Field(id = 1)
    ArrayList<String> zza;

    public final class Builder {
        public /* synthetic */ Builder(zzaf zzafVar) {
        }

        @RecentlyNonNull
        public Builder addAllowedCountryCode(@RecentlyNonNull String str) {
            Preconditions.checkNotEmpty(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zza == null) {
                shippingAddressRequirements.zza = new ArrayList<>();
            }
            ShippingAddressRequirements.this.zza.add(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addAllowedCountryCodes(@RecentlyNonNull Collection<String> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
            }
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zza == null) {
                shippingAddressRequirements.zza = new ArrayList<>();
            }
            ShippingAddressRequirements.this.zza.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }
    }

    private ShippingAddressRequirements() {
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new ShippingAddressRequirements().new Builder(null);
    }

    @RecentlyNullable
    public ArrayList<String> getAllowedCountryCodes() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ShippingAddressRequirements(@SafeParcelable.Param(id = 1) ArrayList<String> arrayList) {
        this.zza = arrayList;
    }
}
