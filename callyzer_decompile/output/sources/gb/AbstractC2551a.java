package gb;

import ac.EnumC0091d;
import ac.EnumC0092e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gb.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2551a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f13882a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f13883b;

    static {
        int[] iArr = new int[EnumC0092e.values().length];
        try {
            iArr[EnumC0092e.WHEN_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0092e.WHEN_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13882a = iArr;
        int[] iArr2 = new int[EnumC0091d.values().length];
        try {
            iArr2[EnumC0091d.WHEN_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0091d.WHEN_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f13883b = iArr2;
    }
}
