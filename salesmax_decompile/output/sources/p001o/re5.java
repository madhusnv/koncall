package p001o;

import p001o.cg5;

/* loaded from: classes5.dex */
public class re5 extends cg5.C12679c {

    /* renamed from: e */
    public static final String f43433e;

    /* renamed from: f */
    public static final re5 f43434f;

    /* renamed from: b */
    public final char[] f43435b;

    /* renamed from: c */
    public final int f43436c;

    /* renamed from: d */
    public final String f43437d;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f43433e = property;
        f43434f = new re5("  ", property);
    }

    public re5(String str, String str2) {
        this.f43436c = str.length();
        this.f43435b = new char[str.length() * 16];
        int length = 0;
        for (int i = 0; i < 16; i++) {
            str.getChars(0, str.length(), this.f43435b, length);
            length += str.length();
        }
        this.f43437d = str2;
    }

    @Override // p001o.cg5.C12679c, p001o.cg5.InterfaceC12678b
    /* renamed from: a */
    public void mo21182a(b99 b99Var, int i) {
        b99Var.mo18443Q(this.f43437d);
        if (i <= 0) {
            return;
        }
        int length = i * this.f43436c;
        while (true) {
            char[] cArr = this.f43435b;
            if (length <= cArr.length) {
                b99Var.mo18445T(cArr, 0, length);
                return;
            } else {
                b99Var.mo18445T(cArr, 0, cArr.length);
                length -= this.f43435b.length;
            }
        }
    }

    @Override // p001o.cg5.C12679c, p001o.cg5.InterfaceC12678b
    public boolean isInline() {
        return false;
    }
}
