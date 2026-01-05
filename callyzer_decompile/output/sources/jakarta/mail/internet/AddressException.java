package jakarta.mail.internet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class AddressException extends ParseException {

    /* renamed from: a */
    public final String f19331a;

    /* renamed from: b */
    public final int f19332b;

    public AddressException(String str) {
        super(str);
        this.f19331a = null;
        this.f19332b = -1;
    }

    @Override // jakarta.mail.MessagingException, java.lang.Throwable
    public final String toString() {
        String string = super.toString();
        String str = this.f19331a;
        if (str == null) {
            return string;
        }
        String str2 = string + " in string ``" + str + "''";
        int i10 = this.f19332b;
        if (i10 < 0) {
            return str2;
        }
        return str2 + " at position " + i10;
    }

    public AddressException(String str, String str2) {
        super(str);
        this.f19332b = -1;
        this.f19331a = str2;
    }

    public AddressException(String str, String str2, int i10) {
        super(str);
        this.f19331a = str2;
        this.f19332b = i10;
    }

    public AddressException() {
        this.f19331a = null;
        this.f19332b = -1;
    }
}
