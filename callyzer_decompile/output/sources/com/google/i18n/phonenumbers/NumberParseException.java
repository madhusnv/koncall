package com.google.i18n.phonenumbers;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NumberParseException extends Exception {

    /* renamed from: a */
    public final EnumC1403a f7183a;

    /* renamed from: b */
    public final String f7184b;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.google.i18n.phonenumbers.NumberParseException$a */
    public enum EnumC1403a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(EnumC1403a enumC1403a, String str) {
        super(str);
        this.f7184b = str;
        this.f7183a = enumC1403a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.f7183a + ". " + this.f7184b;
    }
}
