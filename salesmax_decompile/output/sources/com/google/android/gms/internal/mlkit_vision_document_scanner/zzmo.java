package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.encoders.annotations.Encodable;
import org.objectweb.asm.Opcodes;

@Encodable
/* loaded from: classes3.dex */
public final class zzmo {
    private final zzqe zza;
    private final zzml zzb;
    private final zznw zzc;
    private final zznw zzd;
    private final zznw zze;

    public /* synthetic */ zzmo(zzmm zzmmVar, zzmn zzmnVar) {
        this.zza = zzmmVar.zza;
        this.zzb = zzmmVar.zzb;
        this.zzc = zzmmVar.zzc;
        this.zzd = zzmmVar.zzd;
        this.zze = zzmmVar.zze;
    }

    @zzav(zza = 2)
    public final zzml zza() {
        return this.zzb;
    }

    @zzav(zza = Opcodes.LSHR)
    public final zznw zzb() {
        return this.zze;
    }

    @zzav(zza = 120)
    public final zznw zzc() {
        return this.zzd;
    }

    @zzav(zza = Opcodes.DNEG)
    public final zznw zzd() {
        return this.zzc;
    }

    @zzav(zza = 1)
    public final zzqe zze() {
        return this.zza;
    }
}
