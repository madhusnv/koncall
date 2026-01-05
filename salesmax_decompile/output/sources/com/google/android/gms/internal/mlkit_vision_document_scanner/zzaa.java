package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaa extends zzx {
    public zzaa() {
        super(4);
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int iHighestOneBit = Integer.highestOneBit(i - 1);
                i2 = iHighestOneBit + iHighestOneBit;
            }
            if (i2 < 0) {
                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i2);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }

    public final zzad zzb() {
        this.zzc = true;
        return zzad.zzg(this.zza, this.zzb);
    }
}
