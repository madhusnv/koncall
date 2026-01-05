package j$.time.format;

/* renamed from: j$.time.format.c */
/* loaded from: classes2.dex */
public final class C3433c implements InterfaceC3435e {

    /* renamed from: a */
    public final char f18146a;

    public C3433c(char c2) {
        this.f18146a = c2;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        sb2.append(this.f18146a);
        return true;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        char c2 = this.f18146a;
        return (cCharAt == c2 || (!c3451u.f18203b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c2)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c2 = this.f18146a;
        if (c2 == '\'') {
            return "''";
        }
        return "'" + c2 + "'";
    }
}
