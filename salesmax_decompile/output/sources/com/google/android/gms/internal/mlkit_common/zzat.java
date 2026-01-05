package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzat implements Map, Serializable {
    private transient zzau zza;
    private transient zzau zzb;
    private transient zzam zzc;

    public static zzat zzc(Object obj, Object obj2) {
        zzah.zza("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzbb.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzbc.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzau zzauVar = this.zzb;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarZze = zze();
        this.zzb = zzauVarZze;
        return zzauVarZze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzam zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzam values() {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            return zzamVar;
        }
        zzam zzamVarZza = zza();
        this.zzc = zzamVarZza;
        return zzamVarZza;
    }

    public abstract zzau zzd();

    public abstract zzau zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzau entrySet() {
        zzau zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarZzd = zzd();
        this.zza = zzauVarZzd;
        return zzauVarZzd;
    }
}
