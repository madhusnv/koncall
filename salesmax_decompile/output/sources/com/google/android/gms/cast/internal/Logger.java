package com.google.android.gms.cast.internal;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

@KeepForSdk
/* loaded from: classes5.dex */
public class Logger {
    protected final String zza;
    private final boolean zzb;
    private boolean zzc;
    private final String zzd;

    @KeepForSdk
    public Logger(String str) {
        this(str, null);
    }

    @KeepForSdk
    /* renamed from: d */
    public void m13795d(String str, Object... objArr) {
        if (zzc()) {
            zza(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m13797e(String str, Object... objArr) {
        zza(str, objArr);
    }

    @KeepForSdk
    /* renamed from: i */
    public void m13799i(String str, Object... objArr) {
        zza(str, objArr);
    }

    @KeepForSdk
    /* renamed from: v */
    public void m13801v(String str, Object... objArr) {
    }

    @KeepForSdk
    /* renamed from: w */
    public void m13802w(String str, Object... objArr) {
        zza(str, objArr);
    }

    public final String zza(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        return !TextUtils.isEmpty(this.zzd) ? String.valueOf(this.zzd).concat(String.valueOf(str)) : str;
    }

    public final void zzb(boolean z) {
        this.zzc = true;
    }

    public final boolean zzc() {
        if (Build.TYPE.equals("user")) {
            return false;
        }
        if (this.zzc) {
            return true;
        }
        return this.zzb && Log.isLoggable(this.zza, 3);
    }

    public Logger(String str, String str2) {
        Preconditions.checkNotEmpty(str, "The log tag cannot be null or empty.");
        this.zza = str;
        this.zzb = str.length() <= 23;
        this.zzc = false;
        this.zzd = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
    }

    @KeepForSdk
    /* renamed from: e */
    public void m13798e(Throwable th, String str, Object... objArr) {
        zza(str, objArr);
    }

    @KeepForSdk
    /* renamed from: i */
    public void m13800i(Throwable th, String str, Object... objArr) {
        zza(str, objArr);
    }

    @KeepForSdk
    /* renamed from: w */
    public void m13803w(Throwable th, String str, Object... objArr) {
        zza(str, objArr);
    }

    @KeepForSdk
    /* renamed from: d */
    public void m13796d(Throwable th, String str, Object... objArr) {
        if (zzc()) {
            zza(str, objArr);
        }
    }
}
