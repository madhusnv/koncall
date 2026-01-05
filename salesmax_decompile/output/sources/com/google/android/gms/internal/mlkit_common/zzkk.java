package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
final class zzkk implements ObjectEncoder {
    static final zzkk zza = new zzkk();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("xMin");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("yMin");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("xMax");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("yMax");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = builder4.withProperty(zzbjVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("confidenceScore");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = builder5.withProperty(zzbjVar5.zzb()).build();
    }

    private zzkk() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
