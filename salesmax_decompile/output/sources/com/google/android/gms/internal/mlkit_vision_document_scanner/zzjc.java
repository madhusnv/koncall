package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
final class zzjc implements ObjectEncoder {
    static final zzjc zza = new zzjc();
    private static final FieldDescriptor zzb;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("userSelectedArea");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = builder.withProperty(zzarVar.zzb()).build();
    }

    private zzjc() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
