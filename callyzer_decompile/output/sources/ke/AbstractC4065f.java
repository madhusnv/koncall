package ke;

import android.widget.ImageView;
import he.EnumC2915f;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ke.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4065f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f20919a;

    static {
        int[] iArr = new int[EnumC8622e.values().length];
        try {
            iArr[EnumC8622e.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC8622e.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC8622e.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC8622e.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[EnumC2915f.values().length];
        try {
            iArr3[EnumC2915f.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EnumC2915f.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f20919a = iArr3;
    }
}
