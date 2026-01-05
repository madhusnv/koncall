package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzse;
import com.google.android.gms.internal.cast.zzsh;

/* loaded from: classes3.dex */
public class zzse<MessageType extends zzsh<MessageType, BuilderType>, BuilderType extends zzse<MessageType, BuilderType>> extends zzqy<MessageType, BuilderType> {
    protected zzsh zza;
    private final zzsh zzb;

    public zzse(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzJ()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzw();
    }

    private static void zza(Object obj, Object obj2) {
        zztx.zza().zzb(obj.getClass()).zze(obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.zzqy
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzse clone() {
        zzse zzseVar = (zzse) this.zzb.zzb(5, null, null);
        zzseVar.zza = zzr();
        return zzseVar;
    }

    public final zzse zzo(zzsh zzshVar) {
        if (!this.zzb.equals(zzshVar)) {
            if (!this.zza.zzJ()) {
                zzu();
            }
            zza(this.zza, zzshVar);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzp() {
        MessageType messagetype = (MessageType) zzr();
        byte bByteValue = ((Byte) messagetype.zzb(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zZzh = zztx.zza().zzb(messagetype.getClass()).zzh(messagetype);
                messagetype.zzb(2, true != zZzh ? null : messagetype, null);
            }
            throw new zzuq(messagetype);
        }
        return messagetype;
    }

    @Override // com.google.android.gms.internal.cast.zzto
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public MessageType zzr() {
        if (!this.zza.zzJ()) {
            return (MessageType) this.zza;
        }
        this.zza.zzE();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zztq
    public final /* bridge */ /* synthetic */ zztp zzs() {
        throw null;
    }

    public final void zzt() {
        if (this.zza.zzJ()) {
            return;
        }
        zzu();
    }

    public void zzu() {
        zzsh zzshVarZzw = this.zzb.zzw();
        zza(zzshVarZzw, this.zza);
        this.zza = zzshVarZzw;
    }
}
