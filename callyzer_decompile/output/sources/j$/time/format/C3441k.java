package j$.time.format;

import j$.time.C3401c;

/* renamed from: j$.time.format.k */
/* loaded from: classes2.dex */
public final class C3441k implements InterfaceC3435e {

    /* renamed from: a */
    public final InterfaceC3435e f18171a;

    /* renamed from: b */
    public final int f18172b;

    /* renamed from: c */
    public final char f18173c;

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        boolean z6 = c3451u.f18204c;
        if (i10 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        int length = this.f18172b + i10;
        if (length > charSequence.length()) {
            if (z6) {
                return ~i10;
            }
            length = charSequence.length();
        }
        int i11 = i10;
        while (i11 < length && c3451u.m7985a(charSequence.charAt(i11), this.f18173c)) {
            i11++;
        }
        int iMo7962C = this.f18171a.mo7962C(c3451u, charSequence.subSequence(0, length), i11);
        return (iMo7962C == length || !z6) ? iMo7962C : ~(i10 + i11);
    }

    public C3441k(InterfaceC3435e interfaceC3435e, int i10, char c2) {
        this.f18171a = interfaceC3435e;
        this.f18172b = i10;
        this.f18173c = c2;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f18171a.mo7963t(c3453w, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f18172b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f18173c);
            }
            return true;
        }
        throw new C3401c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    public final String toString() {
        String str;
        char c2 = this.f18173c;
        if (c2 == ' ') {
            str = ")";
        } else {
            str = ",'" + c2 + "')";
        }
        return "Pad(" + this.f18171a + "," + this.f18172b + str;
    }
}
