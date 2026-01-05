package com.google.android.gms.internal.p002authapi;

import android.os.Build;
import com.google.api.client.googleapis.media.MediaHttpDownloader;

/* loaded from: classes3.dex */
public final class zbbk {
    public static final int zba;

    static {
        zba = Build.VERSION.SDK_INT >= 31 ? MediaHttpDownloader.MAXIMUM_CHUNK_SIZE : 0;
    }
}
