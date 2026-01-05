package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzan extends zza implements zzap {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzA(boolean z) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzB(float f) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzC(float f) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final boolean zzD(zzap zzapVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzapVar);
        Parcel parcelZzJ = zzJ(15, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final boolean zzE() {
        Parcel parcelZzJ = zzJ(18, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final boolean zzF() {
        Parcel parcelZzJ = zzJ(14, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final boolean zzG() {
        Parcel parcelZzJ = zzJ(12, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final float zzd() {
        Parcel parcelZzJ = zzJ(6, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final float zze() {
        Parcel parcelZzJ = zzJ(10, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final int zzf() {
        Parcel parcelZzJ = zzJ(8, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final int zzg() {
        Parcel parcelZzJ = zzJ(24, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final int zzh() {
        Parcel parcelZzJ = zzJ(16, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final IObjectWrapper zzi() {
        Parcel parcelZzJ = zzJ(28, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Cap zzj() {
        Parcel parcelZzJ = zzJ(22, zza());
        Cap cap = (Cap) zzc.zza(parcelZzJ, Cap.CREATOR);
        parcelZzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Cap zzk() {
        Parcel parcelZzJ = zzJ(20, zza());
        Cap cap = (Cap) zzc.zza(parcelZzJ, Cap.CREATOR);
        parcelZzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final String zzl() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final List zzm() {
        Parcel parcelZzJ = zzJ(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final List zzn() {
        Parcel parcelZzJ = zzJ(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(LatLng.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final List zzo() {
        Parcel parcelZzJ = zzJ(30, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(StyleSpan.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzp() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzq(boolean z) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzr(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzs(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, cap);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzt(boolean z) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzu(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzv(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzw(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzx(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzy(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, cap);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }
}
