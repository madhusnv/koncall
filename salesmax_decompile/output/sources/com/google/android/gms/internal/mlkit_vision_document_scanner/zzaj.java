package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzaj extends zzag {
    private final transient zzaf zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzaj(zzaf zzafVar, Object[] objArr, int i, int i2) {
        this.zza = zzafVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzag, com.google.android.gms.internal.mlkit_vision_document_scanner.zzz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzag, com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    /* renamed from: zzd */
    public final zzao iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzag
    public final zzad zzg() {
        return new zzai(this);
    }
}
