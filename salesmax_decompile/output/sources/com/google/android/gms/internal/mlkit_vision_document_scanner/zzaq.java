package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* loaded from: classes3.dex */
final class zzaq implements zzav {
    private final int zza;
    private final zzau zzb;

    public zzaq(int i, zzau zzauVar) {
        this.zza = i;
        this.zzb = zzauVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzav.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        return this.zza == zzavVar.zza() && this.zzb.equals(zzavVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzav
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzav
    public final zzau zzb() {
        return this.zzb;
    }
}
