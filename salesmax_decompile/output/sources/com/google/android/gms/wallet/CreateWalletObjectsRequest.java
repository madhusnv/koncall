package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzi();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;

    @SafeParcelable.Field(id = 2)
    LoyaltyWalletObject zza;

    @SafeParcelable.Field(id = 3)
    OfferWalletObject zzb;

    @SafeParcelable.Field(id = 4)
    GiftCardWalletObject zzc;

    @SafeParcelable.Field(id = 5)
    int zzd;

    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @RecentlyNonNull
        public CreateWalletObjectsRequest build() {
            CreateWalletObjectsRequest createWalletObjectsRequest = CreateWalletObjectsRequest.this;
            Preconditions.checkState(((createWalletObjectsRequest.zzc == null ? 0 : 1) + (createWalletObjectsRequest.zza == null ? 0 : 1)) + (createWalletObjectsRequest.zzb == null ? 0 : 1) == 1, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return CreateWalletObjectsRequest.this;
        }

        @RecentlyNonNull
        public Builder setCreateMode(int i) {
            CreateWalletObjectsRequest.this.zzd = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setGiftCardWalletObject(@RecentlyNonNull GiftCardWalletObject giftCardWalletObject) {
            CreateWalletObjectsRequest.this.zzc = giftCardWalletObject;
            return this;
        }

        @RecentlyNonNull
        public Builder setLoyaltyWalletObject(@RecentlyNonNull LoyaltyWalletObject loyaltyWalletObject) {
            CreateWalletObjectsRequest.this.zza = loyaltyWalletObject;
            return this;
        }

        @RecentlyNonNull
        public Builder setOfferWalletObject(@RecentlyNonNull OfferWalletObject offerWalletObject) {
            CreateWalletObjectsRequest.this.zzb = offerWalletObject;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreateMode {
    }

    public CreateWalletObjectsRequest() {
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new CreateWalletObjectsRequest().new Builder(null);
    }

    public int getCreateMode() {
        return this.zzd;
    }

    @RecentlyNonNull
    public GiftCardWalletObject getGiftCardWalletObject() {
        return this.zzc;
    }

    @RecentlyNonNull
    public LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.zza;
    }

    @RecentlyNonNull
    public OfferWalletObject getOfferWalletObject() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public CreateWalletObjectsRequest(@RecentlyNonNull GiftCardWalletObject giftCardWalletObject) {
        this.zzc = giftCardWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@RecentlyNonNull LoyaltyWalletObject loyaltyWalletObject) {
        this.zza = loyaltyWalletObject;
    }

    @SafeParcelable.Constructor
    public CreateWalletObjectsRequest(@SafeParcelable.Param(id = 2) LoyaltyWalletObject loyaltyWalletObject, @SafeParcelable.Param(id = 3) OfferWalletObject offerWalletObject, @SafeParcelable.Param(id = 4) GiftCardWalletObject giftCardWalletObject, @SafeParcelable.Param(id = 5) int i) {
        this.zza = loyaltyWalletObject;
        this.zzb = offerWalletObject;
        this.zzc = giftCardWalletObject;
        this.zzd = i;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@RecentlyNonNull OfferWalletObject offerWalletObject) {
        this.zzb = offerWalletObject;
    }
}
