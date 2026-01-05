package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes3.dex */
final class zzhq implements ObjectEncoder {
    static final zzhq zza = new zzhq();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("classificationName");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(NewHtcHomeBadger.COUNT);
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
    }

    private zzhq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
