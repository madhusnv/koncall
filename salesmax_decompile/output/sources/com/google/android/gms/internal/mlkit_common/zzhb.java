package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
final class zzhb implements ObjectEncoder {
    static final zzhb zza = new zzhb();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = builder4.withProperty(zzbjVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = builder5.withProperty(zzbjVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = builder6.withProperty(zzbjVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = builder7.withProperty(zzbjVar7.zzb()).build();
    }

    private zzhb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zznn zznnVar = (zznn) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznnVar.zzc());
        objectEncoderContext2.add(zzc, zznnVar.zzf());
        objectEncoderContext2.add(zzd, zznnVar.zza());
        objectEncoderContext2.add(zze, zznnVar.zze());
        objectEncoderContext2.add(zzf, zznnVar.zzb());
        objectEncoderContext2.add(zzg, zznnVar.zzd());
        objectEncoderContext2.add(zzh, (Object) null);
    }
}
