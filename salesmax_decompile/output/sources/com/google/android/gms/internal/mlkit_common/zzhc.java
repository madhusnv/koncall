package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
final class zzhc implements ObjectEncoder {
    static final zzhc zza = new zzhc();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final FieldDescriptor zzi;
    private static final FieldDescriptor zzj;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = builder.withProperty(zzbjVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = builder2.withProperty(zzbjVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = builder3.withProperty(zzbjVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = builder4.withProperty(zzbjVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = builder5.withProperty(zzbjVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = builder6.withProperty(zzbjVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = builder7.withProperty(zzbjVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzbj zzbjVar8 = new zzbj();
        zzbjVar8.zza(8);
        zzi = builder8.withProperty(zzbjVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzbj zzbjVar9 = new zzbj();
        zzbjVar9.zza(9);
        zzj = builder9.withProperty(zzbjVar9.zzb()).build();
    }

    private zzhc() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzns zznsVar = (zzns) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznsVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zznsVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zznsVar.zzc());
        objectEncoderContext2.add(zzg, zznsVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
