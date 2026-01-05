package p001o;

/* loaded from: classes6.dex */
public class i5c extends Exception {

    /* renamed from: a */
    public EnumC14187a f28099a;

    /* renamed from: b */
    public String f28100b;

    /* renamed from: o.i5c$a */
    public enum EnumC14187a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public i5c(EnumC14187a enumC14187a, String str) {
        super(str);
        this.f28100b = str;
        this.f28099a = enumC14187a;
    }

    /* renamed from: a */
    public EnumC14187a m31574a() {
        return this.f28099a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error type: " + this.f28099a + ". " + this.f28100b;
    }
}
