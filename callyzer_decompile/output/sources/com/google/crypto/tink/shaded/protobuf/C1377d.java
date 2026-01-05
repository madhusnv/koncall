package com.google.crypto.tink.shaded.protobuf;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* loaded from: classes.dex */
public final class C1377d {

    /* renamed from: a */
    public int f7027a;

    /* renamed from: b */
    public long f7028b;

    /* renamed from: c */
    public Object f7029c;

    public C1377d(long j6, Exception exc) {
        this.f7028b = SystemClock.elapsedRealtime() - j6;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.f7027a = 2;
            this.f7029c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.f7027a = 0;
            this.f7029c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f7029c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.f7027a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f7027a = 1;
        } else {
            this.f7027a = 0;
        }
    }

    public C1377d(int i10, URL url, long j6) {
        this.f7027a = i10;
        this.f7029c = url;
        this.f7028b = j6;
    }
}
