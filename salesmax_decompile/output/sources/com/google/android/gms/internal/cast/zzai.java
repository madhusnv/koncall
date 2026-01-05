package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzai extends zza implements zzaj {
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final com.google.android.gms.cast.framework.zzz zze(IObjectWrapper iObjectWrapper, CastOptions castOptions, zzal zzalVar, Map map) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zzc(parcelZza, castOptions);
        zzc.zze(parcelZza, zzalVar);
        parcelZza.writeMap(map);
        Parcel parcelZzb = zzb(1, parcelZza);
        com.google.android.gms.cast.framework.zzz zzzVarZzb = com.google.android.gms.cast.framework.zzy.zzb(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return zzzVarZzb;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final com.google.android.gms.cast.framework.zzac zzf(CastOptions castOptions, IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.zzw zzwVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, castOptions);
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zze(parcelZza, zzwVar);
        Parcel parcelZzb = zzb(3, parcelZza);
        com.google.android.gms.cast.framework.zzac zzacVarZzb = com.google.android.gms.cast.framework.zzab.zzb(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return zzacVarZzb;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final com.google.android.gms.cast.framework.zzaj zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zze(parcelZza, iObjectWrapper2);
        zzc.zze(parcelZza, iObjectWrapper3);
        Parcel parcelZzb = zzb(5, parcelZza);
        com.google.android.gms.cast.framework.zzaj zzajVarZzb = com.google.android.gms.cast.framework.zzai.zzb(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return zzajVarZzb;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final com.google.android.gms.cast.framework.zzam zzh(String str, String str2, com.google.android.gms.cast.framework.zzau zzauVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zze(parcelZza, zzauVar);
        Parcel parcelZzb = zzb(2, parcelZza);
        com.google.android.gms.cast.framework.zzam zzamVarZzb = com.google.android.gms.cast.framework.zzal.zzb(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return zzamVarZzb;
    }

    @Override // com.google.android.gms.internal.cast.zzaj
    public final com.google.android.gms.cast.framework.media.internal.zzi zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zze(parcelZza, zzkVar);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(0);
        parcelZza.writeLong(2097152L);
        parcelZza.writeInt(5);
        parcelZza.writeInt(333);
        parcelZza.writeInt(TransferRecord.MAXIMUM_UPLOAD_PARTS);
        Parcel parcelZzb = zzb(6, parcelZza);
        com.google.android.gms.cast.framework.media.internal.zzi zziVarZzb = com.google.android.gms.cast.framework.media.internal.zzh.zzb(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return zziVarZzb;
    }
}
