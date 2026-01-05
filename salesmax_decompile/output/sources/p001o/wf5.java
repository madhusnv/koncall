package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class wf5 {

    /* renamed from: a */
    public final CharSequence f51897a;

    /* renamed from: b */
    public final int f51898b;

    /* renamed from: c */
    public final int f51899c;

    /* renamed from: d */
    public final byte[] f51900d;

    public wf5(CharSequence charSequence, int i, int i2) {
        this.f51897a = charSequence;
        this.f51899c = i;
        this.f51898b = i2;
        byte[] bArr = new byte[i * i2];
        this.f51900d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void m54318a(int i) {
        m54324g(this.f51898b - 1, 0, i, 1);
        m54324g(this.f51898b - 1, 1, i, 2);
        m54324g(this.f51898b - 1, 2, i, 3);
        m54324g(0, this.f51899c - 2, i, 4);
        m54324g(0, this.f51899c - 1, i, 5);
        m54324g(1, this.f51899c - 1, i, 6);
        m54324g(2, this.f51899c - 1, i, 7);
        m54324g(3, this.f51899c - 1, i, 8);
    }

    /* renamed from: b */
    public final void m54319b(int i) {
        m54324g(this.f51898b - 3, 0, i, 1);
        m54324g(this.f51898b - 2, 0, i, 2);
        m54324g(this.f51898b - 1, 0, i, 3);
        m54324g(0, this.f51899c - 4, i, 4);
        m54324g(0, this.f51899c - 3, i, 5);
        m54324g(0, this.f51899c - 2, i, 6);
        m54324g(0, this.f51899c - 1, i, 7);
        m54324g(1, this.f51899c - 1, i, 8);
    }

    /* renamed from: c */
    public final void m54320c(int i) {
        m54324g(this.f51898b - 3, 0, i, 1);
        m54324g(this.f51898b - 2, 0, i, 2);
        m54324g(this.f51898b - 1, 0, i, 3);
        m54324g(0, this.f51899c - 2, i, 4);
        m54324g(0, this.f51899c - 1, i, 5);
        m54324g(1, this.f51899c - 1, i, 6);
        m54324g(2, this.f51899c - 1, i, 7);
        m54324g(3, this.f51899c - 1, i, 8);
    }

    /* renamed from: d */
    public final void m54321d(int i) {
        m54324g(this.f51898b - 1, 0, i, 1);
        m54324g(this.f51898b - 1, this.f51899c - 1, i, 2);
        m54324g(0, this.f51899c - 3, i, 3);
        m54324g(0, this.f51899c - 2, i, 4);
        m54324g(0, this.f51899c - 1, i, 5);
        m54324g(1, this.f51899c - 3, i, 6);
        m54324g(1, this.f51899c - 2, i, 7);
        m54324g(1, this.f51899c - 1, i, 8);
    }

    /* renamed from: e */
    public final boolean m54322e(int i, int i2) {
        return this.f51900d[(i2 * this.f51899c) + i] == 1;
    }

    /* renamed from: f */
    public final boolean m54323f(int i, int i2) {
        return this.f51900d[(i2 * this.f51899c) + i] >= 0;
    }

    /* renamed from: g */
    public final void m54324g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f51898b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f51899c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        m54326i(i2, i, (this.f51897a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    /* renamed from: h */
    public final void m54325h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f51898b && i3 == 0) {
                m54318a(i4);
                i4++;
            }
            if (i5 == this.f51898b - 2 && i3 == 0 && this.f51899c % 4 != 0) {
                m54319b(i4);
                i4++;
            }
            if (i5 == this.f51898b - 2 && i3 == 0 && this.f51899c % 8 == 4) {
                m54320c(i4);
                i4++;
            }
            if (i5 == this.f51898b + 4 && i3 == 2 && this.f51899c % 8 == 0) {
                m54321d(i4);
                i4++;
            }
            do {
                if (i5 < this.f51898b && i3 >= 0 && !m54323f(i3, i5)) {
                    m54327j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f51899c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f51899c && !m54323f(i7, i6)) {
                    m54327j(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f51898b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f51899c)) {
                break;
            }
        }
        if (m54323f(i2 - 1, i - 1)) {
            return;
        }
        m54326i(this.f51899c - 1, this.f51898b - 1, true);
        m54326i(this.f51899c - 2, this.f51898b - 2, true);
    }

    /* renamed from: i */
    public final void m54326i(int i, int i2, boolean z) {
        this.f51900d[(i2 * this.f51899c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    public final void m54327j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m54324g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m54324g(i4, i6, i3, 2);
        int i7 = i - 1;
        m54324g(i7, i5, i3, 3);
        m54324g(i7, i6, i3, 4);
        m54324g(i7, i2, i3, 5);
        m54324g(i, i5, i3, 6);
        m54324g(i, i6, i3, 7);
        m54324g(i, i2, i3, 8);
    }
}
