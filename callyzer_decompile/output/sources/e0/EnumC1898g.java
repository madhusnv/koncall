package e0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import c0.b2;
import i0.w2;
import kotlin.NoWhenBranchMatchedException;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class EnumC1898g {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC1898g[] $VALUES;
    public static final C1896e Companion;
    private final int defaultImageFormat;
    private final Class<?> surfaceClass;
    public static final EnumC1898g PREVIEW = new EnumC1898g("PREVIEW", 0, SurfaceHolder.class, 34);
    public static final EnumC1898g IMAGE_CAPTURE = new EnumC1898g("IMAGE_CAPTURE", 1, null, 256);
    public static final EnumC1898g VIDEO_CAPTURE = new EnumC1898g("VIDEO_CAPTURE", 2, MediaCodec.class, 34);
    public static final EnumC1898g STREAM_SHARING = new EnumC1898g("STREAM_SHARING", 3, SurfaceTexture.class, 34);
    public static final EnumC1898g UNDEFINED = new EnumC1898g("UNDEFINED", 4, null, 34);

    private static final /* synthetic */ EnumC1898g[] $values() {
        return new EnumC1898g[]{PREVIEW, IMAGE_CAPTURE, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    static {
        EnumC1898g[] enumC1898gArr$values = $values();
        $VALUES = enumC1898gArr$values;
        $ENTRIES = b8.m11548b(enumC1898gArr$values);
        Companion = new C1896e();
    }

    private EnumC1898g(String str, int i10, Class cls, int i11) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static final EnumC1898g getFeatureGroupUseCaseType(b2 b2Var) {
        Companion.getClass();
        return C1896e.m5515a(b2Var);
    }

    public static /* synthetic */ int getImageFormat$default(EnumC1898g enumC1898g, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getImageFormat");
        }
        if ((i10 & 1) != 0) {
            num = null;
        }
        return enumC1898g.getImageFormat(num);
    }

    public static EnumC1898g valueOf(String str) {
        return (EnumC1898g) Enum.valueOf(EnumC1898g.class, str);
    }

    public static EnumC1898g[] values() {
        return (EnumC1898g[]) $VALUES.clone();
    }

    public final int getDefaultImageFormat() {
        return this.defaultImageFormat;
    }

    public final int getImageFormat(Integer num) {
        return (this != IMAGE_CAPTURE || num == null) ? this.defaultImageFormat : num.intValue();
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AbstractC1897f.f8918a[ordinal()];
        if (i10 == 1) {
            return "Preview";
        }
        if (i10 == 2) {
            return "ImageCapture";
        }
        if (i10 == 3) {
            return "VideoCapture";
        }
        if (i10 == 4) {
            return "StreamSharing";
        }
        if (i10 == 5) {
            return "Undefined";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final EnumC1898g getFeatureGroupUseCaseType(w2 w2Var) {
        Companion.getClass();
        return C1896e.m5516b(w2Var);
    }
}
