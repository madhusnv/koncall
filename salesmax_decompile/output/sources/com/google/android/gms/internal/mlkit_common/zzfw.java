package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
final class zzfw implements ObjectEncoder {
    static final zzfw zza = new zzfw();
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

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("device");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = builder4.withProperty(zzbjVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = builder5.withProperty(zzbjVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = builder6.withProperty(zzbjVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = builder7.withProperty(zzbjVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzbj zzbjVar8 = new zzbj();
        zzbjVar8.zza(8);
        zzi = builder8.withProperty(zzbjVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzbj zzbjVar9 = new zzbj();
        zzbjVar9.zza(9);
        zzj = builder9.withProperty(zzbjVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzbj zzbjVar10 = new zzbj();
        zzbjVar10.zza(10);
        zzk = builder10.withProperty(zzbjVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("fingerprint");
        zzbj zzbjVar11 = new zzbj();
        zzbjVar11.zza(11);
        zzl = builder11.withProperty(zzbjVar11.zzb()).build();
    }

    private zzfw() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
