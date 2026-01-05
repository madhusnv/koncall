package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p001o.pp1;
import p001o.sl1;

/* loaded from: classes6.dex */
public abstract class t6 implements sl1 {

    /* renamed from: x */
    public static final /* synthetic */ boolean f46470x;

    /* renamed from: y */
    public static /* synthetic */ Class f46471y;

    /* renamed from: a */
    public int f46472a;

    /* renamed from: b */
    public boolean f46473b;

    /* renamed from: c */
    public int f46474c;

    /* renamed from: d */
    public int f46475d;

    /* renamed from: e */
    public int f46476e;

    /* renamed from: f */
    public int f46477f;

    /* renamed from: g */
    public int f46478g;

    /* renamed from: h */
    public int f46479h;

    /* renamed from: q */
    public String f46480q;

    /* renamed from: s */
    public nvi f46481s;

    static {
        if (f46471y == null) {
            f46471y = m49420b("org.mortbay.io.AbstractBuffer");
        }
        f46470x = true;
    }

    public t6(int i, boolean z) {
        if (i == 0 && z) {
            throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
        }
        q3(-1);
        this.f46472a = i;
        this.f46473b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ Class m49420b(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // p001o.sl1
    public boolean D2() {
        return this.f46475d > this.f46474c;
    }

    @Override // p001o.sl1
    public int H0(InputStream inputStream, int i) throws IOException {
        byte[] bArrJ0 = j0();
        int iV0 = V0();
        if (iV0 <= i) {
            i = iV0;
        }
        if (bArrJ0 != null) {
            int i2 = inputStream.read(bArrJ0, this.f46475d, i);
            if (i2 > 0) {
                this.f46475d += i2;
            }
            return i2;
        }
        int i3 = i <= 1024 ? i : 1024;
        byte[] bArr = new byte[i3];
        while (i > 0) {
            int i4 = inputStream.read(bArr, 0, i3);
            if (i4 < 0) {
                return -1;
            }
            int iU2 = U2(bArr, 0, i4);
            if (!f46470x && i4 != iU2) {
                throw new AssertionError();
            }
            i -= i4;
        }
        return 0;
    }

    @Override // p001o.sl1
    public abstract int I1(int i, byte[] bArr, int i2, int i3);

    @Override // p001o.sl1
    public int K0(byte[] bArr, int i, int i2) {
        int iMo48451r = mo48451r();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i2 > length) {
            i2 = length;
        }
        int iG0 = G0(iMo48451r, bArr, i, i2);
        if (iG0 > 0) {
            w2(iMo48451r + iG0);
        }
        return iG0;
    }

    @Override // p001o.sl1
    public sl1 O1(int i, int i2) {
        nvi nviVar = this.f46481s;
        if (nviVar == null) {
            this.f46481s = new nvi(this, -1, i, i + i2, isReadOnly() ? 1 : 2);
        } else {
            nviVar.m41184h(mo41182e());
            this.f46481s.q3(-1);
            this.f46481s.w2(0);
            this.f46481s.k0(i2 + i);
            this.f46481s.w2(i);
        }
        return this.f46481s;
    }

    @Override // p001o.sl1
    public String S1() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(super.hashCode());
        stringBuffer.append(",");
        stringBuffer.append(j0().hashCode());
        stringBuffer.append(",m=");
        stringBuffer.append(d2());
        stringBuffer.append(",g=");
        stringBuffer.append(mo48451r());
        stringBuffer.append(",p=");
        stringBuffer.append(Y2());
        stringBuffer.append(",c=");
        stringBuffer.append(capacity());
        stringBuffer.append("]={");
        if (d2() >= 0) {
            for (int iD2 = d2(); iD2 < mo48451r(); iD2++) {
                char cMo41185o = (char) mo41185o(iD2);
                if (Character.isISOControl(cMo41185o)) {
                    stringBuffer.append(cMo41185o < 16 ? "\\0" : "\\");
                    stringBuffer.append(Integer.toString(cMo41185o, 16));
                } else {
                    stringBuffer.append(cMo41185o);
                }
            }
            stringBuffer.append("}{");
        }
        int iMo48451r = mo48451r();
        int i = 0;
        while (iMo48451r < Y2()) {
            char cMo41185o2 = (char) mo41185o(iMo48451r);
            if (Character.isISOControl(cMo41185o2)) {
                stringBuffer.append(cMo41185o2 < 16 ? "\\0" : "\\");
                stringBuffer.append(Integer.toString(cMo41185o2, 16));
            } else {
                stringBuffer.append(cMo41185o2);
            }
            int i2 = i + 1;
            if (i == 50 && Y2() - iMo48451r > 20) {
                stringBuffer.append(" ... ");
                iMo48451r = Y2() - 20;
            }
            iMo48451r++;
            i = i2;
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // p001o.sl1
    public int U2(byte[] bArr, int i, int i2) {
        int iY2 = Y2();
        int iI1 = I1(iY2, bArr, i, i2);
        k0(iY2 + iI1);
        return iI1;
    }

    @Override // p001o.sl1
    public int V0() {
        return capacity() - this.f46475d;
    }

    @Override // p001o.sl1
    public sl1 W0() {
        return m49423f((mo48451r() - d2()) - 1);
    }

    @Override // p001o.sl1
    public final int Y2() {
        return this.f46475d;
    }

    /* renamed from: a */
    public byte[] m49421a() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] bArrJ0 = j0();
        if (bArrJ0 != null) {
            ped.m43532a(bArrJ0, mo48451r(), bArr, 0, length);
        } else {
            G0(mo48451r(), bArr, 0, length());
        }
        return bArr;
    }

    /* renamed from: c */
    public pp1 m49422c(int i) {
        return mo41182e() instanceof sl1.InterfaceC16857a ? new pp1.C16152a(m49421a(), 0, length(), i) : new pp1(m49421a(), 0, length(), i);
    }

    @Override // p001o.sl1
    public void clear() {
        q3(-1);
        w2(0);
        k0(0);
    }

    @Override // p001o.sl1
    /* renamed from: d */
    public int mo48450d(int i) {
        if (length() < i) {
            i = length();
        }
        w2(mo48451r() + i);
        return i;
    }

    @Override // p001o.sl1
    public boolean d0(sl1 sl1Var) {
        int i;
        if (sl1Var == this) {
            return true;
        }
        if (sl1Var.length() != length()) {
            return false;
        }
        int i2 = this.f46476e;
        if (i2 != 0 && (sl1Var instanceof t6) && (i = ((t6) sl1Var).f46476e) != 0 && i2 != i) {
            return false;
        }
        int iMo48451r = mo48451r();
        int iY2 = sl1Var.Y2();
        byte[] bArrJ0 = j0();
        byte[] bArrJ02 = sl1Var.j0();
        if (bArrJ0 != null && bArrJ02 != null) {
            int iY22 = Y2();
            while (true) {
                int i3 = iY22 - 1;
                if (iY22 <= iMo48451r) {
                    break;
                }
                byte b = bArrJ0[i3];
                iY2--;
                byte b2 = bArrJ02[iY2];
                if (b != b2) {
                    if (97 <= b && b <= 122) {
                        b = (byte) ((b - 97) + 65);
                    }
                    if (97 <= b2 && b2 <= 122) {
                        b2 = (byte) ((b2 - 97) + 65);
                    }
                    if (b != b2) {
                        return false;
                    }
                }
                iY22 = i3;
            }
        } else {
            int iY23 = Y2();
            while (true) {
                int i4 = iY23 - 1;
                if (iY23 <= iMo48451r) {
                    break;
                }
                byte bMo41185o = mo41185o(i4);
                iY2--;
                byte bMo41185o2 = sl1Var.mo41185o(iY2);
                if (bMo41185o != bMo41185o2) {
                    if (97 <= bMo41185o && bMo41185o <= 122) {
                        bMo41185o = (byte) ((bMo41185o - 97) + 65);
                    }
                    if (97 <= bMo41185o2 && bMo41185o2 <= 122) {
                        bMo41185o2 = (byte) ((bMo41185o2 - 97) + 65);
                    }
                    if (bMo41185o != bMo41185o2) {
                        return false;
                    }
                }
                iY23 = i4;
            }
        }
        return true;
    }

    @Override // p001o.sl1
    public void d1(byte b) {
        int iY2 = Y2();
        v0(iY2, b);
        k0(iY2 + 1);
    }

    @Override // p001o.sl1
    public int d2() {
        return this.f46479h;
    }

    @Override // p001o.sl1
    /* renamed from: e */
    public sl1 mo41182e() {
        return this;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof sl1)) {
            return false;
        }
        sl1 sl1Var = (sl1) obj;
        if ((this instanceof sl1.InterfaceC16857a) || (sl1Var instanceof sl1.InterfaceC16857a)) {
            return d0(sl1Var);
        }
        if (sl1Var.length() != length()) {
            return false;
        }
        int i2 = this.f46476e;
        if (i2 != 0 && (obj instanceof t6) && (i = ((t6) obj).f46476e) != 0 && i2 != i) {
            return false;
        }
        int iMo48451r = mo48451r();
        int iY2 = sl1Var.Y2();
        int iY22 = Y2();
        while (true) {
            int i3 = iY22 - 1;
            if (iY22 <= iMo48451r) {
                return true;
            }
            iY2--;
            if (mo41185o(i3) != sl1Var.mo41185o(iY2)) {
                return false;
            }
            iY22 = i3;
        }
    }

    /* renamed from: f */
    public sl1 m49423f(int i) {
        if (d2() < 0) {
            return null;
        }
        sl1 sl1VarO1 = O1(d2(), i);
        q3(-1);
        return sl1VarO1;
    }

    @Override // p001o.sl1
    public byte get() {
        int i = this.f46474c;
        this.f46474c = i + 1;
        return mo41185o(i);
    }

    public int hashCode() {
        if (this.f46476e == 0 || this.f46477f != this.f46474c || this.f46478g != this.f46475d) {
            int iMo48451r = mo48451r();
            byte[] bArrJ0 = j0();
            if (bArrJ0 != null) {
                int iY2 = Y2();
                while (true) {
                    int i = iY2 - 1;
                    if (iY2 <= iMo48451r) {
                        break;
                    }
                    byte b = bArrJ0[i];
                    if (97 <= b && b <= 122) {
                        b = (byte) ((b - 97) + 65);
                    }
                    this.f46476e = (this.f46476e * 31) + b;
                    iY2 = i;
                }
            } else {
                int iY22 = Y2();
                while (true) {
                    int i2 = iY22 - 1;
                    if (iY22 <= iMo48451r) {
                        break;
                    }
                    byte bMo41185o = mo41185o(i2);
                    if (97 <= bMo41185o && bMo41185o <= 122) {
                        bMo41185o = (byte) ((bMo41185o - 97) + 65);
                    }
                    this.f46476e = (this.f46476e * 31) + bMo41185o;
                    iY22 = i2;
                }
            }
            if (this.f46476e == 0) {
                this.f46476e = -1;
            }
            this.f46477f = this.f46474c;
            this.f46478g = this.f46475d;
        }
        return this.f46476e;
    }

    @Override // p001o.sl1
    public boolean isReadOnly() {
        return this.f46472a <= 1;
    }

    @Override // p001o.sl1
    public void k0(int i) {
        this.f46475d = i;
        this.f46476e = 0;
    }

    @Override // p001o.sl1
    public sl1 k3() {
        return y0() ? this : m49422c(0);
    }

    @Override // p001o.sl1
    public int length() {
        return this.f46475d - this.f46474c;
    }

    @Override // p001o.sl1
    public boolean o2() {
        return this.f46473b;
    }

    @Override // p001o.sl1
    public abstract int p3(int i, sl1 sl1Var);

    @Override // p001o.sl1
    public byte peek() {
        return mo41185o(this.f46474c);
    }

    @Override // p001o.sl1
    public void q3(int i) {
        this.f46479h = i;
    }

    @Override // p001o.sl1
    /* renamed from: r */
    public final int mo48451r() {
        return this.f46474c;
    }

    @Override // p001o.sl1
    public int s2(sl1 sl1Var) {
        int iY2 = Y2();
        int iP3 = p3(iY2, sl1Var);
        k0(iY2 + iP3);
        return iP3;
    }

    public String toString() {
        if (!y0()) {
            return new String(m49421a(), 0, length());
        }
        if (this.f46480q == null) {
            this.f46480q = new String(m49421a(), 0, length());
        }
        return this.f46480q;
    }

    @Override // p001o.sl1
    public int u0(byte[] bArr) {
        int iY2 = Y2();
        int iI1 = I1(iY2, bArr, 0, bArr.length);
        k0(iY2 + iI1);
        return iI1;
    }

    @Override // p001o.sl1
    public void w2(int i) {
        this.f46474c = i;
        this.f46476e = 0;
    }

    @Override // p001o.sl1
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArrJ0 = j0();
        if (bArrJ0 != null) {
            outputStream.write(bArrJ0, mo48451r(), length());
        } else {
            int length = length();
            int i = length <= 1024 ? length : 1024;
            byte[] bArr = new byte[i];
            int i2 = this.f46474c;
            while (length > 0) {
                int iG0 = G0(i2, bArr, 0, length > i ? i : length);
                outputStream.write(bArr, 0, iG0);
                i2 += iG0;
                length -= iG0;
            }
        }
        clear();
    }

    @Override // p001o.sl1
    public void x2() {
        q3(this.f46474c - 1);
    }

    @Override // p001o.sl1
    public boolean y0() {
        return this.f46472a <= 0;
    }

    @Override // p001o.sl1
    public sl1 get(int i) {
        int iMo48451r = mo48451r();
        sl1 sl1VarO1 = O1(iMo48451r, i);
        w2(iMo48451r + i);
        return sl1VarO1;
    }
}
