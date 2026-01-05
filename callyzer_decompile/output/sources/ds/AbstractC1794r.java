package ds;

import im.EnumC3319u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.r */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1794r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8694a;

    static {
        int[] iArr = new int[EnumC3319u.values().length];
        try {
            iArr[EnumC3319u.TOTAL_PHONE_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC3319u.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC3319u.INCOMING.ordinal()] = 3;
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
        f8694a = iArr;
    }
}
