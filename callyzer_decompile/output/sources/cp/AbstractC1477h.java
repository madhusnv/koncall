package cp;

import im.EnumC3319u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cp.h */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1477h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7537a;

    static {
        int[] iArr = new int[EnumC3319u.values().length];
        try {
            iArr[EnumC3319u.TOTAL_PHONE_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC3319u.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC3319u.OUTGOING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC3319u.MISSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC3319u.REJECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC3319u.UNIQUE_CALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC3319u.CONNECTED_CALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[EnumC3319u.UNIQUE_CONNECTED_CALL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[EnumC3319u.NEVER_ATTENDED_CALL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[EnumC3319u.NOT_PICKUP_BY_CLIENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f7537a = iArr;
    }
}
