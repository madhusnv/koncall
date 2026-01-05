package com.razorpay;

/* loaded from: classes6.dex */
final /* synthetic */ class M$_J_ {

    /* renamed from: a */
    static final /* synthetic */ int[] f13653a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        f13653a = iArr;
        try {
            iArr[NetworkType.WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13653a[NetworkType.CELLULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13653a[NetworkType.BLUETOOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
