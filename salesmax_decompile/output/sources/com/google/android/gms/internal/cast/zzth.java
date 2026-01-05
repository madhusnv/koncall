package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zzth implements zzub {
    private static final zztn zza = new zztf();
    private final zztn zzb;

    public zzth() {
        zztn zztnVar;
        zztn[] zztnVarArr = new zztn[2];
        zztnVarArr[0] = zzsd.zza();
        try {
            zztnVar = (zztn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zztnVar = zza;
        }
        zztnVarArr[1] = zztnVar;
        zztg zztgVar = new zztg(zztnVarArr);
        byte[] bArr = zzsq.zzd;
        this.zzb = zztgVar;
    }

    private static boolean zzb(zztm zztmVar) {
        return zztmVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.cast.zzub
    public final zzua zza(Class cls) {
        zzuc.zzC(cls);
        zztm zztmVarZzb = this.zzb.zzb(cls);
        return zztmVarZzb.zzb() ? zzsh.class.isAssignableFrom(cls) ? zztt.zzi(zzuc.zzA(), zzrz.zzb(), zztmVarZzb.zza()) : zztt.zzi(zzuc.zzy(), zzrz.zza(), zztmVarZzb.zza()) : zzsh.class.isAssignableFrom(cls) ? zzb(zztmVarZzb) ? zzts.zzi(cls, zztmVarZzb, zztv.zzb(), zztd.zzd(), zzuc.zzA(), zzrz.zzb(), zztl.zzb()) : zzts.zzi(cls, zztmVarZzb, zztv.zzb(), zztd.zzd(), zzuc.zzA(), null, zztl.zzb()) : zzb(zztmVarZzb) ? zzts.zzi(cls, zztmVarZzb, zztv.zza(), zztd.zzc(), zzuc.zzy(), zzrz.zza(), zztl.zza()) : zzts.zzi(cls, zztmVarZzb, zztv.zza(), zztd.zzc(), zzuc.zzz(), null, zztl.zza());
    }
}
