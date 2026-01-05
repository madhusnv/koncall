package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes3.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzu();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    CommonWalletObject zzc;

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zzd;

    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzt zztVar) {
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUri(@RecentlyNonNull UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUris(@RecentlyNonNull Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabelValueRow(@RecentlyNonNull LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabelValueRows(@RecentlyNonNull Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUri(@RecentlyNonNull UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUris(@RecentlyNonNull Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocation(@RecentlyNonNull LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocations(@RecentlyNonNull Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessage(@RecentlyNonNull WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessages(@RecentlyNonNull Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModuleData(@RecentlyNonNull TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModulesData(@RecentlyNonNull Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        @RecentlyNonNull
        public OfferWalletObject build() {
            OfferWalletObject.this.zzc = this.zzb.zzz();
            return OfferWalletObject.this;
        }

        @RecentlyNonNull
        public Builder setBarcodeAlternateText(@RecentlyNonNull String str) {
            this.zzb.zzm(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setBarcodeLabel(@RecentlyNonNull String str) {
            this.zzb.zzn(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeType(@RecentlyNonNull String str) {
            this.zzb.zzo(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeValue(@RecentlyNonNull String str) {
            this.zzb.zzp(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setClassId(@RecentlyNonNull String str) {
            this.zzb.zzq(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setId(@RecentlyNonNull String str) {
            this.zzb.zzr(str);
            OfferWalletObject.this.zza = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@RecentlyNonNull String str) {
            this.zzb.zzs(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@RecentlyNonNull String str) {
            this.zzb.zzt(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.zzb.zzu(z);
            return this;
        }

        @RecentlyNonNull
        public Builder setIssuerName(@RecentlyNonNull String str) {
            this.zzb.zzv(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setRedemptionCode(@RecentlyNonNull String str) {
            OfferWalletObject.this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setState(int i) {
            this.zzb.zzx(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setTitle(@RecentlyNonNull String str) {
            this.zzb.zzw(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setValidTimeInterval(@RecentlyNonNull TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }
    }

    public OfferWalletObject() {
        this.zzd = 3;
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new OfferWalletObject().new Builder(null);
    }

    @RecentlyNonNull
    public String getBarcodeAlternateText() {
        return this.zzc.zzd();
    }

    @RecentlyNonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zzc.zze();
    }

    @RecentlyNonNull
    public String getBarcodeType() {
        return this.zzc.zzf();
    }

    @RecentlyNonNull
    public String getBarcodeValue() {
        return this.zzc.zzg();
    }

    @RecentlyNonNull
    public String getClassId() {
        return this.zzc.zzh();
    }

    @RecentlyNonNull
    public String getId() {
        return this.zzc.zzi();
    }

    @RecentlyNonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzc.zzn();
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzc.zzj();
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzc.zzk();
    }

    @RecentlyNonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzc.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzc.zzt();
    }

    @RecentlyNonNull
    public String getIssuerName() {
        return this.zzc.zzl();
    }

    @RecentlyNonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzc.zzp();
    }

    @RecentlyNonNull
    public ArrayList<LatLng> getLocations() {
        return this.zzc.zzq();
    }

    @RecentlyNonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzc.zzr();
    }

    @RecentlyNonNull
    public String getRedemptionCode() {
        return this.zzb;
    }

    public int getState() {
        return this.zzc.zza();
    }

    @RecentlyNonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzc.zzs();
    }

    @RecentlyNonNull
    public String getTitle() {
        return this.zzc.zzm();
    }

    @RecentlyNonNull
    public TimeInterval getValidTimeInterval() {
        return this.zzc.zzc();
    }

    public int getVersionCode() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzbVarZzb = CommonWalletObject.zzb();
        zzbVarZzb.zzr(str);
        this.zzc = zzbVarZzb.zzz();
    }
}
