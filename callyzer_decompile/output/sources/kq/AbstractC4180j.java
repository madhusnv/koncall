package kq;

import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kq.j */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4180j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f21187a;

    static {
        int[] iArr = new int[EnumC8994d.values().length];
        try {
            iArr[EnumC8994d.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC8994d.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC8994d.MISSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC8994d.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21187a = iArr;
    }
}
