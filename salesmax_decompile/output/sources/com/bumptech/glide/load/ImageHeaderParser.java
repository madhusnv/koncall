package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.wo0;

/* loaded from: classes5.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i = C10729a.f11199a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C10729a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11199a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f11199a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11199a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11199a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo12685a(ByteBuffer byteBuffer, wo0 wo0Var);

    /* renamed from: b */
    ImageType mo12686b(ByteBuffer byteBuffer);

    /* renamed from: c */
    int mo12687c(InputStream inputStream, wo0 wo0Var);

    /* renamed from: d */
    ImageType mo12688d(InputStream inputStream);
}
