package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzba {
    private final Map zza;
    private final Map zzb;
    private final ObjectEncoder zzc;

    public zzba(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = objectEncoder;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzax(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
