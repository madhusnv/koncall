package cv;

import av.EnumC0460c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.y */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1529y {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7697a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f7698b;

    static {
        int[] iArr = new int[EnumC0460c.values().length];
        try {
            iArr[EnumC0460c.NotProcessed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0460c.Saved.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0460c.Error.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0460c.NotApplicable.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7697a = iArr;
        int[] iArr2 = new int[EnumC8994d.values().length];
        try {
            iArr2[EnumC8994d.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC8994d.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC8994d.MISSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC8994d.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f7698b = iArr2;
    }
}
