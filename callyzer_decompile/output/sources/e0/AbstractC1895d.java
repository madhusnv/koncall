package e0;

import f0.EnumC2167b;
import i0.y2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e0.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1895d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8916a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f8917b;

    static {
        int[] iArr = new int[y2.values().length];
        try {
            iArr[y2.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y2.PREVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y2.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y2.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f8916a = iArr;
        int[] iArr2 = new int[EnumC2167b.values().length];
        try {
            iArr2[EnumC2167b.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC2167b.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC2167b.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC2167b.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f8917b = iArr2;
    }
}
