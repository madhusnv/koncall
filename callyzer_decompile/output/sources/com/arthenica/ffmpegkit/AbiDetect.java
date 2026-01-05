package com.arthenica.ffmpegkit;

import og.cd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AbiDetect {

    /* renamed from: a */
    public static boolean f5945a = false;

    static {
        cd.m10578b("ffmpegkit_abidetect");
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();
}
