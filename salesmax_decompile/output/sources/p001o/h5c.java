package p001o;

/* loaded from: classes6.dex */
public class h5c extends Exception {

    /* renamed from: a */
    public EnumC13852a f26220a;

    /* renamed from: b */
    public String f26221b;

    /* renamed from: o.h5c$a */
    public enum EnumC13852a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public h5c(EnumC13852a enumC13852a, String str) {
        super(str);
        this.f26221b = str;
        this.f26220a = enumC13852a;
    }

    /* renamed from: a */
    public EnumC13852a m29824a() {
        return this.f26220a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error type: " + this.f26220a + ". " + this.f26221b;
    }
}
