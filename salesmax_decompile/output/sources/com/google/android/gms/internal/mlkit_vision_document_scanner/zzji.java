package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
final class zzji implements ObjectEncoder {
    static final zzji zza = new zzji();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzar zzarVar = new zzar();
        zzarVar.zza(3);
        zzb = builder.withProperty(zzarVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(4);
        zzc = builder2.withProperty(zzarVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(5);
        zzd = builder3.withProperty(zzarVar3.zzb()).build();
    }

    private zzji() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
