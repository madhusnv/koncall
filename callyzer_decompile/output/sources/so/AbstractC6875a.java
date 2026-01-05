package so;

import com.google.i18n.phonenumbers.NumberParseException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: so.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6875a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f32688a;

    static {
        int[] iArr = new int[NumberParseException.EnumC1403a.values().length];
        try {
            iArr[NumberParseException.EnumC1403a.NOT_A_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NumberParseException.EnumC1403a.TOO_SHORT_AFTER_IDD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NumberParseException.EnumC1403a.TOO_SHORT_NSN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NumberParseException.EnumC1403a.TOO_LONG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f32688a = iArr;
    }
}
