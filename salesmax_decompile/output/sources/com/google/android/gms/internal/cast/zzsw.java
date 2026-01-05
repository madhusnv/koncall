package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzsw extends zzra implements RandomAccess, zzsx {

    @Deprecated
    public static final zzsx zza;
    private static final zzsw zzb;
    private final List zzc;

    static {
        zzsw zzswVar = new zzsw(false);
        zzb = zzswVar;
        zza = zzswVar;
    }

    public zzsw() {
        this(10);
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzrm ? ((zzrm) obj).zzl(zzsq.zzb) : zzsq.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzsx) {
            collection = ((zzsx) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object objRemove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzi(objRemove);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzi(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final zzsx zzd() {
        return zzc() ? new zzuw(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzrm) {
            zzrm zzrmVar = (zzrm) obj;
            String strZzl = zzrmVar.zzl(zzsq.zzb);
            if (zzrmVar.zzi()) {
                this.zzc.set(i, strZzl);
            }
            return strZzl;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzsq.zzd(bArr);
        if (zzvf.zzd(bArr)) {
            this.zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.cast.zzsp
    public final /* bridge */ /* synthetic */ zzsp zzg(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzsw(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzsw(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.zzc = arrayList;
    }

    private zzsw(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzsw(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
