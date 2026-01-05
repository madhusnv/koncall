package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class CommonWalletObject extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    String zze;

    @SafeParcelable.Field(id = 7)
    String zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @SafeParcelable.Field(id = 9)
    @Deprecated
    String zzh;

    @SafeParcelable.Field(id = 10)
    int zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 11)
    ArrayList<WalletObjectMessage> zzj;

    @SafeParcelable.Field(id = 12)
    TimeInterval zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 13)
    ArrayList<LatLng> zzl;

    @SafeParcelable.Field(id = 14)
    @Deprecated
    String zzm;

    @SafeParcelable.Field(id = 15)
    @Deprecated
    String zzn;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 16)
    ArrayList<LabelValueRow> zzo;

    @SafeParcelable.Field(id = 17)
    boolean zzp;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 18)
    ArrayList<UriData> zzq;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 19)
    ArrayList<TextModuleData> zzr;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 20)
    ArrayList<UriData> zzs;

    public CommonWalletObject() {
        this.zzj = ArrayUtils.newArrayList();
        this.zzl = ArrayUtils.newArrayList();
        this.zzo = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzr = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
    }

    public static zzb zzb() {
        return new zzb(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeTypedList(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.zzr, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzs, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }

    @RecentlyNonNull
    public final TimeInterval zzc() {
        return this.zzk;
    }

    @RecentlyNonNull
    public final String zzd() {
        return this.zze;
    }

    @RecentlyNonNull
    @Deprecated
    public final String zze() {
        return this.zzh;
    }

    @RecentlyNonNull
    public final String zzf() {
        return this.zzf;
    }

    @RecentlyNonNull
    public final String zzg() {
        return this.zzg;
    }

    @RecentlyNonNull
    public final String zzh() {
        return this.zzb;
    }

    @RecentlyNonNull
    public final String zzi() {
        return this.zza;
    }

    @RecentlyNonNull
    @Deprecated
    public final String zzj() {
        return this.zzn;
    }

    @RecentlyNonNull
    @Deprecated
    public final String zzk() {
        return this.zzm;
    }

    @RecentlyNonNull
    public final String zzl() {
        return this.zzd;
    }

    @RecentlyNonNull
    public final String zzm() {
        return this.zzc;
    }

    @RecentlyNonNull
    public final ArrayList<UriData> zzn() {
        return this.zzq;
    }

    @RecentlyNonNull
    public final ArrayList<LabelValueRow> zzo() {
        return this.zzo;
    }

    @RecentlyNonNull
    public final ArrayList<UriData> zzp() {
        return this.zzs;
    }

    @RecentlyNonNull
    public final ArrayList<LatLng> zzq() {
        return this.zzl;
    }

    @RecentlyNonNull
    public final ArrayList<WalletObjectMessage> zzr() {
        return this.zzj;
    }

    @RecentlyNonNull
    public final ArrayList<TextModuleData> zzs() {
        return this.zzr;
    }

    public final boolean zzt() {
        return this.zzp;
    }

    @SafeParcelable.Constructor
    public CommonWalletObject(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 11) ArrayList<WalletObjectMessage> arrayList, @SafeParcelable.Param(id = 12) TimeInterval timeInterval, @SafeParcelable.Param(id = 13) ArrayList<LatLng> arrayList2, @SafeParcelable.Param(id = 14) String str9, @SafeParcelable.Param(id = 15) String str10, @SafeParcelable.Param(id = 16) ArrayList<LabelValueRow> arrayList3, @SafeParcelable.Param(id = 17) boolean z, @SafeParcelable.Param(id = 18) ArrayList<UriData> arrayList4, @SafeParcelable.Param(id = 19) ArrayList<TextModuleData> arrayList5, @SafeParcelable.Param(id = 20) ArrayList<UriData> arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }
}
