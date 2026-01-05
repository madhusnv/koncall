package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
final class zzgz implements ObjectEncoder {
    static final zzgz zza = new zzgz();
    private static final FieldDescriptor zzb;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = builder.withProperty(zzarVar.zzb()).build();
    }

    private zzgz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
