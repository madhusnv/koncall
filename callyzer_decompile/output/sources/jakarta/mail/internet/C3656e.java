package jakarta.mail.internet;

import i0.m0;
import jakarta.mail.C3680l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.e */
/* loaded from: classes3.dex */
public final class C3656e extends C3680l {

    /* renamed from: c */
    public String f19350c;

    public C3656e(String str) {
        super("", "");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf < 0) {
            this.f19405a = str.trim();
        } else {
            this.f19405a = str.substring(0, iIndexOf).trim();
        }
        this.f19350c = str;
    }

    @Override // jakarta.mail.C3680l
    /* renamed from: a */
    public final String mo8212a() {
        char cCharAt;
        int iIndexOf = this.f19350c.indexOf(58);
        if (iIndexOf < 0) {
            return this.f19350c;
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f19350c.length() || ((cCharAt = this.f19350c.charAt(iIndexOf)) != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n')) {
                break;
            }
        }
        return this.f19350c.substring(iIndexOf);
    }

    public C3656e(String str, String str2) {
        super(str, "");
        if (str2 != null) {
            this.f19350c = m0.m7379l(str, ": ", str2);
        } else {
            this.f19350c = null;
        }
    }
}
