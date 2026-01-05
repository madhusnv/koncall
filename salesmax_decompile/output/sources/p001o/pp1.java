package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p001o.sl1;

/* loaded from: classes6.dex */
public class pp1 extends t6 {

    /* renamed from: H */
    public byte[] f40360H;

    /* renamed from: o.pp1$a */
    public static class C16152a extends pp1 implements sl1.InterfaceC16857a {
        public C16152a(String str) {
            super(str);
        }

        @Override // p001o.pp1, p001o.t6
        public boolean equals(Object obj) {
            return d0((sl1) obj);
        }

        public C16152a(byte[] bArr, int i, int i2, int i3) {
            super(bArr, i, i2, i3);
        }
    }

    public pp1(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    @Override // p001o.sl1
    public int G0(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        ped.m43532a(this.f40360H, i, bArr, i2, i3);
        return i3;
    }

    @Override // p001o.t6, p001o.sl1
    public int H0(InputStream inputStream, int i) throws IOException {
        if (i < 0 || i > V0()) {
            i = V0();
        }
        int iY2 = Y2();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < i) {
            i4 = inputStream.read(this.f40360H, iY2, i3);
            if (i4 < 0) {
                break;
            }
            if (i4 > 0) {
                iY2 += i4;
                i2 += i4;
                i3 -= i4;
                k0(iY2);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i4 >= 0 || i2 != 0) {
            return i2;
        }
        return -1;
    }

    @Override // p001o.t6, p001o.sl1
    public int I1(int i, byte[] bArr, int i2, int i3) {
        this.f46476e = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        ped.m43532a(bArr, i2, this.f40360H, i, i3);
        return i3;
    }

    @Override // p001o.sl1
    public void R0() {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        int iD2 = d2() >= 0 ? d2() : mo48451r();
        if (iD2 > 0) {
            int iY2 = Y2() - iD2;
            if (iY2 > 0) {
                byte[] bArr = this.f40360H;
                ped.m43532a(bArr, iD2, bArr, 0, iY2);
            }
            if (d2() > 0) {
                q3(d2() - iD2);
            }
            w2(mo48451r() - iD2);
            k0(Y2() - iD2);
        }
    }

    @Override // p001o.t6, p001o.sl1
    public int V0() {
        return this.f40360H.length - this.f46475d;
    }

    @Override // p001o.sl1
    public int capacity() {
        return this.f40360H.length;
    }

    @Override // p001o.t6, p001o.sl1
    public boolean d0(sl1 sl1Var) {
        int i;
        if (sl1Var == this) {
            return true;
        }
        if (sl1Var == null || sl1Var.length() != length()) {
            return false;
        }
        int i2 = this.f46476e;
        if (i2 != 0 && (sl1Var instanceof t6) && (i = ((t6) sl1Var).f46476e) != 0 && i2 != i) {
            return false;
        }
        int iMo48451r = mo48451r();
        int iY2 = sl1Var.Y2();
        byte[] bArrJ0 = sl1Var.j0();
        if (bArrJ0 != null) {
            int iY22 = Y2();
            while (true) {
                int i3 = iY22 - 1;
                if (iY22 <= iMo48451r) {
                    break;
                }
                byte b = this.f40360H[i3];
                iY2--;
                byte b2 = bArrJ0[iY2];
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
                byte b3 = this.f40360H[i4];
                iY2--;
                byte bMo41185o = sl1Var.mo41185o(iY2);
                if (b3 != bMo41185o) {
                    if (97 <= b3 && b3 <= 122) {
                        b3 = (byte) ((b3 - 97) + 65);
                    }
                    if (97 <= bMo41185o && bMo41185o <= 122) {
                        bMo41185o = (byte) ((bMo41185o - 97) + 65);
                    }
                    if (b3 != bMo41185o) {
                        return false;
                    }
                }
                iY23 = i4;
            }
        }
        return true;
    }

    @Override // p001o.t6
    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof sl1)) {
            return false;
        }
        if (obj instanceof sl1.InterfaceC16857a) {
            return d0((sl1) obj);
        }
        sl1 sl1Var = (sl1) obj;
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
            if (this.f40360H[i3] != sl1Var.mo41185o(iY2)) {
                return false;
            }
            iY22 = i3;
        }
    }

    /* renamed from: g */
    public void m43999g(byte[] bArr) {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        if (y0()) {
            throw new IllegalStateException("IMMUTABLE");
        }
        this.f40360H = bArr;
        w2(0);
        k0(bArr.length);
    }

    @Override // p001o.t6, p001o.sl1
    public byte get() {
        byte[] bArr = this.f40360H;
        int i = this.f46474c;
        this.f46474c = i + 1;
        return bArr[i];
    }

    /* renamed from: h */
    public void m44000h(byte[] bArr, int i, int i2) {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        if (y0()) {
            throw new IllegalStateException("IMMUTABLE");
        }
        this.f40360H = bArr;
        clear();
        w2(i);
        k0(i + i2);
    }

    @Override // p001o.t6
    public int hashCode() {
        if (this.f46476e == 0 || this.f46477f != this.f46474c || this.f46478g != this.f46475d) {
            int iMo48451r = mo48451r();
            int iY2 = Y2();
            while (true) {
                int i = iY2 - 1;
                if (iY2 <= iMo48451r) {
                    break;
                }
                byte b = this.f40360H[i];
                if (97 <= b && b <= 122) {
                    b = (byte) ((b - 97) + 65);
                }
                this.f46476e = (this.f46476e * 31) + b;
                iY2 = i;
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
    public byte[] j0() {
        return this.f40360H;
    }

    @Override // p001o.sl1
    /* renamed from: o */
    public byte mo41185o(int i) {
        return this.f40360H[i];
    }

    @Override // p001o.t6, p001o.sl1
    public int p3(int i, sl1 sl1Var) {
        int i2 = 0;
        this.f46476e = 0;
        int length = sl1Var.length();
        if (i + length > capacity()) {
            length = capacity() - i;
        }
        byte[] bArrJ0 = sl1Var.j0();
        if (bArrJ0 != null) {
            ped.m43532a(bArrJ0, sl1Var.mo48451r(), this.f40360H, i, length);
        } else if (bArrJ0 != null) {
            int iMo48451r = sl1Var.mo48451r();
            while (i2 < length) {
                v0(i, bArrJ0[iMo48451r]);
                i2++;
                i++;
                iMo48451r++;
            }
        } else {
            int iMo48451r2 = sl1Var.mo48451r();
            while (i2 < length) {
                this.f40360H[i] = sl1Var.mo41185o(iMo48451r2);
                i2++;
                i++;
                iMo48451r2++;
            }
        }
        return length;
    }

    @Override // p001o.sl1
    public void v0(int i, byte b) {
        this.f40360H[i] = b;
    }

    @Override // p001o.t6, p001o.sl1
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f40360H, mo48451r(), length());
        clear();
    }

    public pp1(byte[] bArr, int i, int i2, int i3) {
        super(2, false);
        this.f40360H = bArr;
        k0(i2 + i);
        w2(i);
        this.f46472a = i3;
    }

    public pp1(int i) {
        this(new byte[i], 0, i, 2);
        k0(0);
    }

    public pp1(String str) {
        super(2, false);
        this.f40360H = ped.m43533b(str);
        w2(0);
        k0(this.f40360H.length);
        this.f46472a = 0;
        this.f46480q = str;
    }
}
