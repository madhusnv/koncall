package b00;

import c00.AbstractC0835b;
import com.sun.mail.util.AbstractC1452a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import nx.AbstractC5185w;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.n */
/* loaded from: classes3.dex */
public class C0529n implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0529n f3647d = new C0529n(new byte[0]);

    /* renamed from: a */
    public final byte[] f3648a;

    /* renamed from: b */
    public transient int f3649b;

    /* renamed from: c */
    public transient String f3650c;

    public C0529n(byte[] data) {
        AbstractC4154l.m8923f(data, "data");
        this.f3648a = data;
    }

    /* renamed from: g */
    public static int m1609g(C0529n c0529n, C0529n other) {
        c0529n.getClass();
        AbstractC4154l.m8923f(other, "other");
        return c0529n.mo1565f(0, other.mo1566h());
    }

    /* renamed from: k */
    public static int m1610k(C0529n c0529n, C0529n other) {
        c0529n.getClass();
        AbstractC4154l.m8923f(other, "other");
        return c0529n.mo1568j(other.mo1566h());
    }

    /* renamed from: p */
    public static /* synthetic */ C0529n m1611p(C0529n c0529n, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return c0529n.mo1572o(i10, i11);
    }

    /* renamed from: a */
    public String mo1561a() {
        byte[] map = AbstractC0516a.f3584a;
        byte[] bArr = this.f3648a;
        AbstractC4154l.m8923f(bArr, "<this>");
        AbstractC4154l.m8923f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & 255) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return new String(bArr2, AbstractC5163a.f25245a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0529n other) {
        AbstractC4154l.m8923f(other, "other");
        int iMo1563d = mo1563d();
        int iMo1563d2 = other.mo1563d();
        int iMin = Math.min(iMo1563d, iMo1563d2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iMo1567i = mo1567i(i10) & 255;
            int iMo1567i2 = other.mo1567i(i10) & 255;
            if (iMo1567i != iMo1567i2) {
                return iMo1567i < iMo1567i2 ? -1 : 1;
            }
        }
        if (iMo1563d == iMo1563d2) {
            return 0;
        }
        return iMo1563d < iMo1563d2 ? -1 : 1;
    }

    /* renamed from: c */
    public C0529n mo1562c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f3648a, 0, mo1563d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC4154l.m8920c(bArrDigest);
        return new C0529n(bArrDigest);
    }

    /* renamed from: d */
    public int mo1563d() {
        return this.f3648a.length;
    }

    /* renamed from: e */
    public String mo1564e() {
        byte[] bArr = this.f3648a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = AbstractC0835b.f5298a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0529n) {
            C0529n c0529n = (C0529n) obj;
            int iMo1563d = c0529n.mo1563d();
            byte[] bArr = this.f3648a;
            if (iMo1563d == bArr.length && c0529n.mo1569l(0, 0, bArr, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo1565f(int i10, byte[] other) {
        AbstractC4154l.m8923f(other, "other");
        byte[] bArr = this.f3648a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC0517b.m1522a(iMax, bArr, 0, other, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* renamed from: h */
    public byte[] mo1566h() {
        return this.f3648a;
    }

    public int hashCode() {
        int i10 = this.f3649b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f3648a);
        this.f3649b = iHashCode;
        return iHashCode;
    }

    /* renamed from: i */
    public byte mo1567i(int i10) {
        return this.f3648a[i10];
    }

    /* renamed from: j */
    public int mo1568j(byte[] other) {
        AbstractC4154l.m8923f(other, "other");
        int iMo1563d = mo1563d();
        byte[] bArr = this.f3648a;
        for (int iMin = Math.min(iMo1563d, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC0517b.m1522a(iMin, bArr, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public boolean mo1569l(int i10, int i11, byte[] other, int i12) {
        AbstractC4154l.m8923f(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.f3648a;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC0517b.m1522a(i10, bArr, i11, other, i12);
    }

    /* renamed from: m */
    public boolean mo1570m(int i10, C0529n other, int i11) {
        AbstractC4154l.m8923f(other, "other");
        return other.mo1569l(0, i10, this.f3648a, i11);
    }

    /* renamed from: n */
    public String mo1571n(Charset charset) {
        AbstractC4154l.m8923f(charset, "charset");
        return new String(this.f3648a, charset);
    }

    /* renamed from: o */
    public C0529n mo1572o(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = mo1563d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3648a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(AbstractC1452a.m4563j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new C0529n(AbstractC6662l.m12723m(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* renamed from: q */
    public C0529n mo1573q() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f3648a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC4154l.m8922e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C0529n(bArrCopyOf);
            }
            i10++;
        }
    }

    /* renamed from: r */
    public final String m1613r() {
        String str = this.f3650c;
        if (str != null) {
            return str;
        }
        byte[] bArrMo1566h = mo1566h();
        AbstractC4154l.m8923f(bArrMo1566h, "<this>");
        String str2 = new String(bArrMo1566h, AbstractC5163a.f25245a);
        this.f3650c = str2;
        return str2;
    }

    /* renamed from: s */
    public void mo1574s(C0526k c0526k, int i10) {
        c0526k.write(this.f3648a, 0, i10);
    }

    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.f3648a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                int i14 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i12 += b11 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 < length && (b10 = bArr[i11]) >= 0) {
                        i11++;
                        i14 = i13 + 1;
                        if (i13 == 64) {
                            break loop0;
                        }
                        if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                            break loop0;
                        }
                        i12 += b10 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length > i15) {
                    byte b12 = bArr[i15];
                    if ((b12 & 192) == 128) {
                        int i16 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i16 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            i12 += i16 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i17 = i11 + 2;
                if (length > i17) {
                    byte b13 = bArr[i11 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i17];
                        if ((b14 & 192) == 128) {
                            int i18 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i18 < 2048) {
                                if (i13 != 64) {
                                    break;
                                }
                            } else if (55296 > i18 || i18 >= 57344) {
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    break;
                                }
                                i12 += i18 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i19 = i11 + 3;
                if (length > i19) {
                    byte b15 = bArr[i11 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i11 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i19];
                            if ((b17 & 192) == 128) {
                                int i20 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i20 > 1114111) {
                                    if (i13 != 64) {
                                        break;
                                    }
                                } else if (55296 > i20 || i20 >= 57344) {
                                    if (i20 >= 65536) {
                                        i10 = i13 + 1;
                                        if (i13 == 64) {
                                            break;
                                        }
                                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                            break;
                                        }
                                        i12 += i20 < 65536 ? 1 : 2;
                                        i11 += 4;
                                        i13 = i10;
                                    } else if (i13 != 64) {
                                        break;
                                    }
                                } else if (i13 != 64) {
                                    break;
                                }
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if (i13 != 64) {
                break;
            }
        }
        i12 = -1;
        if (i12 != -1) {
            String strM1613r = m1613r();
            String strSubstring = strM1613r.substring(0, i12);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            String strM10136r = AbstractC5185w.m10136r(AbstractC5185w.m10136r(AbstractC5185w.m10136r(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strM1613r.length()) {
                return a1.m14328h(']', "[text=", strM10136r);
            }
            return "[size=" + bArr.length + " text=" + strM10136r + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo1564e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(AbstractC1452a.m4563j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new C0529n(AbstractC6662l.m12723m(bArr, 0, 64))).mo1564e());
        sb2.append("…]");
        return sb2.toString();
    }
}
