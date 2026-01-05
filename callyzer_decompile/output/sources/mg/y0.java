package mg;

import java.util.Arrays;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends c1 {

    /* renamed from: a */
    public final u0 f23715a;

    public y0(u0 u0Var) {
        this.f23715a = u0Var;
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iMo9597a = c1Var.mo9597a();
        int iM9616d = c1.m9616d((byte) 64);
        if (iM9616d != iMo9597a) {
            return iM9616d - c1Var.mo9597a();
        }
        u0 u0Var = ((y0) c1Var).f23715a;
        u0 u0Var2 = this.f23715a;
        byte[] bArr = u0Var2.f23704b;
        int length = bArr.length;
        byte[] bArr2 = u0Var.f23704b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return r0.f23690a.compare(u0Var2.m9652m(), u0Var.m9652m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            return this.f23715a.equals(((y0) obj).f23715a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.m9616d((byte) 64)), this.f23715a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        l0 l0Var;
        int i10;
        boolean z6;
        m0 m0Var = o0.f23681d;
        o0 m0Var2 = m0Var.f23684c;
        if (m0Var2 == null) {
            l0 l0Var2 = m0Var.f23682a;
            char[] cArr = l0Var2.f23665b;
            int i11 = 0;
            while (true) {
                if (i11 >= cArr.length) {
                    l0Var = l0Var2;
                    break;
                }
                char c2 = cArr[i11];
                if (c2 < 'a' || c2 > 'z') {
                    i11++;
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= cArr.length) {
                            z6 = false;
                            break;
                        }
                        char c10 = cArr[i12];
                        if (c10 >= 'A' && c10 <= 'Z') {
                            z6 = true;
                            break;
                        }
                        i12++;
                    }
                    if (z6) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i13 = 0; i13 < cArr.length; i13++) {
                        char c11 = cArr[i13];
                        if (c11 >= 97 && c11 <= 122) {
                            c11 ^= 32;
                        }
                        cArr2[i13] = (char) c11;
                    }
                    l0Var = new l0(l0Var2.f23664a.concat(".upperCase()"), cArr2);
                    byte[] bArr = l0Var.f23670g;
                    if (l0Var2.f23671h && !l0Var.f23671h) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i10 = 65; i10 <= 90; i10++) {
                            int i14 = i10 | 32;
                            byte b10 = bArr[i10];
                            byte b11 = bArr[i14];
                            if (b10 == -1) {
                                bArrCopyOf[i10] = b11;
                            } else {
                                char c12 = (char) i10;
                                char c13 = (char) i14;
                                if (b11 != -1) {
                                    throw new IllegalStateException(AbstractC4723b.m9601c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                }
                                bArrCopyOf[i14] = b10;
                            }
                        }
                        l0Var = new l0(l0Var.f23664a.concat(".ignoreCase()"), l0Var.f23665b, bArrCopyOf, true);
                    }
                }
            }
            m0Var2 = l0Var == l0Var2 ? m0Var : new m0(l0Var);
            m0Var.f23684c = m0Var2;
        }
        byte[] bArrM9652m = this.f23715a.m9652m();
        return AbstractC5601a.m11238i("h'", m0Var2.m9631c(bArrM9652m.length, bArrM9652m), "'");
    }
}
