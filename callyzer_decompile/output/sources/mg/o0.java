package mg;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: d */
    public static final m0 f23681d;

    /* renamed from: a */
    public final l0 f23682a;

    /* renamed from: b */
    public final Character f23683b;

    /* renamed from: c */
    public volatile o0 f23684c;

    static {
        new n0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new n0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new o0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new o0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f23681d = new m0(new l0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public o0(l0 l0Var, Character ch2) {
        this.f23682a = l0Var;
        if (ch2 != null) {
            byte[] bArr = l0Var.f23670g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC4723b.m9601c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f23683b = ch2;
    }

    /* renamed from: a */
    public void mo9625a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        AbstractC4723b.m9611m(0, i10, bArr.length);
        while (i11 < i10) {
            l0 l0Var = this.f23682a;
            m9630b(sb2, bArr, i11, Math.min(l0Var.f23669f, i10 - i11));
            i11 += l0Var.f23669f;
        }
    }

    /* renamed from: b */
    public final void m9630b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        AbstractC4723b.m9611m(i10, i10 + i11, bArr.length);
        l0 l0Var = this.f23682a;
        int i12 = l0Var.f23669f;
        int i13 = l0Var.f23667d;
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        int i14 = 0;
        long j6 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j6 = (j6 | (bArr[i10 + i15] & 255)) << 8;
        }
        int i16 = (i11 + 1) * 8;
        while (i14 < i11 * 8) {
            sb2.append(l0Var.f23665b[((int) (j6 >>> ((i16 - i13) - i14))) & l0Var.f23666c]);
            i14 += i13;
        }
        if (this.f23683b != null) {
            while (i14 < l0Var.f23669f * 8) {
                sb2.append('=');
                i14 += i13;
            }
        }
    }

    /* renamed from: c */
    public final String m9631c(int i10, byte[] bArr) {
        AbstractC4723b.m9611m(0, i10, bArr.length);
        l0 l0Var = this.f23682a;
        int i11 = l0Var.f23669f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(l0Var.f23668e * AbstractC4723b.m9599a(i10, i11));
        try {
            mo9625a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.f23682a.equals(o0Var.f23682a) && Objects.equals(this.f23683b, o0Var.f23683b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23682a.hashCode() ^ Objects.hashCode(this.f23683b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        l0 l0Var = this.f23682a;
        sb2.append(l0Var);
        if (8 % l0Var.f23667d != 0) {
            Character ch2 = this.f23683b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public o0(String str, String str2) {
        this(new l0(str, str2.toCharArray()), (Character) '=');
    }
}
