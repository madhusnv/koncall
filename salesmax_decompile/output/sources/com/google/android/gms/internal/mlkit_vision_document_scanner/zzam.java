package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzam extends zzaf {
    static final zzaf zza = new zzam(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzam(Object obj, Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public static zzam zzg(int i, Object[] objArr, zzae zzaeVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzw.zza(obj, obj2);
        return new zzam(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzc;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    public final zzz zza() {
        return new zzal(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    public final zzag zzd() {
        return new zzaj(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    public final zzag zze() {
        return new zzak(this, new zzal(this.zzb, 0, this.zzc));
    }
}
