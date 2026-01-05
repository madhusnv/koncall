package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
final class zzka implements ObjectEncoder {
    static final zzka zza = new zzka();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(3);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(4);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(5);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
    }

    private zzka() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
