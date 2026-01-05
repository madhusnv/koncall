package jakarta.mail.internet;

import bj.C0669a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.c */
/* loaded from: classes3.dex */
public final class C3654c {

    /* renamed from: e */
    public static final C0669a f19345e = new C0669a(-4, null, 1);

    /* renamed from: a */
    public final String f19346a;

    /* renamed from: b */
    public int f19347b;

    /* renamed from: c */
    public final int f19348c;

    /* renamed from: d */
    public int f19349d;

    public C3654c(String str) {
        str = str == null ? "" : str;
        this.f19346a = str;
        this.f19349d = 0;
        this.f19347b = 0;
        this.f19348c = str.length();
    }

    /* renamed from: b */
    public static String m8202b(String str, int i10, int i11, boolean z6) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n' && z10) {
                z10 = false;
            } else if (z11) {
                if (z6) {
                    sb2.append('\\');
                }
                sb2.append(cCharAt);
                z10 = false;
                z11 = false;
            } else if (cCharAt == '\\') {
                z10 = false;
                z11 = true;
            } else if (cCharAt == '\r') {
                z10 = true;
            } else {
                sb2.append(cCharAt);
                z10 = false;
            }
            i10++;
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m8203e(String str) {
        int length = str.length() - 1;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                break;
            }
            length--;
        }
        return length <= 0 ? "" : str.substring(0, length + 1);
    }

    /* renamed from: a */
    public final C0669a m8204a(char c2, boolean z6) throws ParseException {
        int i10 = this.f19347b;
        boolean z10 = false;
        while (true) {
            int i11 = this.f19347b;
            int i12 = this.f19348c;
            String str = this.f19346a;
            if (i11 >= i12) {
                if (c2 != '\"') {
                    return new C0669a(-2, m8203e(z10 ? m8202b(str, i10, i11, z6) : str.substring(i10, i11)), 1);
                }
                throw new ParseException("Unbalanced quoted string");
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\\') {
                this.f19347b++;
            } else {
                if (cCharAt != '\r') {
                    if (cCharAt == c2) {
                        int i13 = this.f19347b;
                        this.f19347b = i13 + 1;
                        String strM8202b = z10 ? m8202b(str, i10, i13, z6) : str.substring(i10, i13);
                        if (cCharAt != '\"') {
                            strM8202b = m8203e(strM8202b);
                            this.f19347b--;
                        }
                        return new C0669a(-2, strM8202b, 1);
                    }
                }
                this.f19347b++;
            }
            z10 = true;
            this.f19347b++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ac, code lost:
    
        if (r12 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r9 == r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        r11.f19347b = r0;
        r1 = m8204a(r12, r13);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bj.C0669a m8205c(char r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3654c.m8205c(char, boolean):bj.a");
    }

    /* renamed from: d */
    public final int m8206d() {
        while (true) {
            int i10 = this.f19347b;
            if (i10 >= this.f19348c) {
                return -4;
            }
            char cCharAt = this.f19346a.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                return this.f19347b;
            }
            this.f19347b++;
        }
    }
}
