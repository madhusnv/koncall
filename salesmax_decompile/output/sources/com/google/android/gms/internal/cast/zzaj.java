package com.google.android.gms.internal.cast;

import android.os.IInterface;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public interface zzaj extends IInterface {
    com.google.android.gms.cast.framework.zzz zze(IObjectWrapper iObjectWrapper, CastOptions castOptions, zzal zzalVar, Map map);

    com.google.android.gms.cast.framework.zzac zzf(CastOptions castOptions, IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.zzw zzwVar);

    com.google.android.gms.cast.framework.zzaj zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    com.google.android.gms.cast.framework.zzam zzh(String str, String str2, com.google.android.gms.cast.framework.zzau zzauVar);

    com.google.android.gms.cast.framework.media.internal.zzi zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5);
}
