package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
final class zzks implements ObjectEncoder {
    static final zzks zza = new zzks();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final FieldDescriptor zzi;
    private static final FieldDescriptor zzj;
    private static final FieldDescriptor zzk;
    private static final FieldDescriptor zzl;
    private static final FieldDescriptor zzm;
    private static final FieldDescriptor zzn;
    private static final FieldDescriptor zzo;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = builder4.withProperty(zzbjVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = builder5.withProperty(zzbjVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = builder6.withProperty(zzbjVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = builder7.withProperty(zzbjVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzbj zzbjVar8 = new zzbj();
        zzbjVar8.zza(8);
        zzi = builder8.withProperty(zzbjVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzbj zzbjVar9 = new zzbj();
        zzbjVar9.zza(9);
        zzj = builder9.withProperty(zzbjVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzbj zzbjVar10 = new zzbj();
        zzbjVar10.zza(10);
        zzk = builder10.withProperty(zzbjVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzbj zzbjVar11 = new zzbj();
        zzbjVar11.zza(11);
        zzl = builder11.withProperty(zzbjVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzbj zzbjVar12 = new zzbj();
        zzbjVar12.zza(12);
        zzm = builder12.withProperty(zzbjVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzbj zzbjVar13 = new zzbj();
        zzbjVar13.zza(13);
        zzn = builder13.withProperty(zzbjVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzbj zzbjVar14 = new zzbj();
        zzbjVar14.zza(14);
        zzo = builder14.withProperty(zzbjVar14.zzb()).build();
    }

    private zzks() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzrg zzrgVar = (zzrg) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzrgVar.zzg());
        objectEncoderContext2.add(zzc, zzrgVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzrgVar.zzj());
        objectEncoderContext2.add(zzf, zzrgVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzrgVar.zza());
        objectEncoderContext2.add(zzj, zzrgVar.zzi());
        objectEncoderContext2.add(zzk, zzrgVar.zzb());
        objectEncoderContext2.add(zzl, zzrgVar.zzd());
        objectEncoderContext2.add(zzm, zzrgVar.zzc());
        objectEncoderContext2.add(zzn, zzrgVar.zze());
        objectEncoderContext2.add(zzo, zzrgVar.zzf());
    }
}
