package yu;

import av.EnumC0460c;
import im.EnumC3311m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yu.k */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8785k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f42449a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f42450b;

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
        f42449a = iArr;
        int[] iArr2 = new int[EnumC3311m.values().length];
        try {
            iArr2[EnumC3311m.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC3311m.SERVER_ISSUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC3311m.SUBSCRIPTION_ISSUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC3311m.OTHER_ISSUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f42450b = iArr2;
    }
}
