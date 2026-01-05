package p001o;

import p001o.d9i;

/* loaded from: classes2.dex */
public abstract class nfh {

    /* renamed from: o.nfh$a */
    public static /* synthetic */ class C15577a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36799a;

        static {
            int[] iArr = new int[d9i.EnumC12848b.values().length];
            f36799a = iArr;
            try {
                iArr[d9i.EnumC12848b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36799a[d9i.EnumC12848b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36799a[d9i.EnumC12848b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36799a[d9i.EnumC12848b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36799a[d9i.EnumC12848b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static int m40525a(d9i.EnumC12848b enumC12848b, int i) {
        int i2 = C15577a.f36799a[enumC12848b.ordinal()];
        return i2 != 1 ? i2 != 2 ? 1 : 3 : i == 2 ? 5 : 2;
    }

    /* renamed from: b */
    public static int m40526b(d9i.EnumC12848b enumC12848b, int i) {
        int i2 = C15577a.f36799a[enumC12848b.ordinal()];
        return i2 != 1 ? i2 != 2 ? 1 : 3 : i == 2 ? 5 : 1;
    }
}
