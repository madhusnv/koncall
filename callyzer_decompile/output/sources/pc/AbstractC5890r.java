package pc;

import nc.EnumC4990a;
import zc.EnumC8936m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.r */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5890r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f28718a;

    static {
        int[] iArr = new int[EnumC4990a.values().length];
        try {
            iArr[EnumC4990a.HTTP1_1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC4990a.HTTP2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC4990a.H2_PRIOR_KNOWLEDGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC8936m.values().length];
        try {
            iArr2[EnumC8936m.TLS_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC8936m.TLS_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC8936m.TLS_1_2.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC8936m.TLS_1_3.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f28718a = iArr2;
    }
}
