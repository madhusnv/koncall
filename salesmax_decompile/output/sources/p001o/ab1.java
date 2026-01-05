package p001o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes4.dex */
public abstract class ab1 {

    /* renamed from: a */
    public static final Charset f14417a = Charset.forName(HTTP.UTF_8);

    /* renamed from: o.ab1$a */
    public static abstract class AbstractC12126a {

        /* renamed from: a */
        public byte[] f14418a;

        /* renamed from: b */
        public int f14419b;
    }

    /* renamed from: o.ab1$b */
    public static class C12127b extends AbstractC12126a {

        /* renamed from: f */
        public static final int[] f14420f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        public static final int[] f14421g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        public int f14422c;

        /* renamed from: d */
        public int f14423d;

        /* renamed from: e */
        public final int[] f14424e;

        public C12127b(int i, byte[] bArr) {
            this.f14418a = bArr;
            this.f14424e = (i & 8) == 0 ? f14420f : f14421g;
            this.f14422c = 0;
            this.f14423d = 0;
        }

        /* renamed from: a */
        public boolean m16801a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.f14422c;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.f14423d;
            byte[] bArr2 = this.f14418a;
            int[] iArr = this.f14424e;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i7 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 == 1) {
                        if (i12 < 0) {
                            if (i12 != -1) {
                                this.f14422c = 6;
                                return false;
                            }
                        }
                        i12 |= i7 << 6;
                    } else if (i8 == 2) {
                        if (i12 < 0) {
                            if (i12 == -2) {
                                bArr2[i6] = (byte) (i7 >> 4);
                                i6++;
                                i8 = 4;
                            } else if (i12 != -1) {
                                this.f14422c = 6;
                                return false;
                            }
                        }
                        i12 |= i7 << 6;
                    } else if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5 && i12 != -1) {
                                this.f14422c = 6;
                                return false;
                            }
                        } else if (i12 == -2) {
                            i8++;
                        } else if (i12 != -1) {
                            this.f14422c = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        int i13 = i12 | (i7 << 6);
                        bArr2[i6 + 2] = (byte) i13;
                        bArr2[i6 + 1] = (byte) (i13 >> 8);
                        bArr2[i6] = (byte) (i13 >> 16);
                        i6 += 3;
                        i7 = i13;
                        i8 = 0;
                    } else if (i12 == -2) {
                        bArr2[i6 + 1] = (byte) (i7 >> 2);
                        bArr2[i6] = (byte) (i7 >> 10);
                        i6 += 2;
                        i8 = 5;
                    } else if (i12 != -1) {
                        this.f14422c = 6;
                        return false;
                    }
                    i8++;
                    i7 = i12;
                } else if (i12 >= 0) {
                    i8++;
                    i7 = i12;
                } else if (i12 != -1) {
                    this.f14422c = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.f14422c = i8;
                this.f14423d = i7;
                this.f14419b = i6;
                return true;
            }
            if (i8 == 1) {
                this.f14422c = 6;
                return false;
            }
            if (i8 == 2) {
                bArr2[i6] = (byte) (i7 >> 4);
                i6++;
            } else if (i8 == 3) {
                int i14 = i6 + 1;
                bArr2[i6] = (byte) (i7 >> 10);
                i6 = i14 + 1;
                bArr2[i14] = (byte) (i7 >> 2);
            } else if (i8 == 4) {
                this.f14422c = 6;
                return false;
            }
            this.f14422c = i8;
            this.f14419b = i6;
            return true;
        }
    }

    /* renamed from: o.ab1$c */
    public static class C12128c extends AbstractC12126a {

        /* renamed from: j */
        public static final byte[] f14425j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        public static final byte[] f14426k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        public final byte[] f14427c;

        /* renamed from: d */
        public int f14428d;

        /* renamed from: e */
        public int f14429e;

        /* renamed from: f */
        public final boolean f14430f;

        /* renamed from: g */
        public final boolean f14431g;

        /* renamed from: h */
        public final boolean f14432h;

        /* renamed from: i */
        public final byte[] f14433i;

        public C12128c(int i, byte[] bArr) {
            this.f14418a = bArr;
            this.f14430f = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f14431g = z;
            this.f14432h = (i & 4) != 0;
            this.f14433i = (i & 8) == 0 ? f14425j : f14426k;
            this.f14427c = new byte[2];
            this.f14428d = 0;
            this.f14429e = z ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m16802a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p001o.ab1.C12128c.m16802a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m16794a(String str, int i) {
        return m16795b(str.getBytes(f14417a), i);
    }

    /* renamed from: b */
    public static byte[] m16795b(byte[] bArr, int i) {
        return m16796c(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static byte[] m16796c(byte[] bArr, int i, int i2, int i3) {
        C12127b c12127b = new C12127b(i3, new byte[(i2 * 3) / 4]);
        if (!c12127b.m16801a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i4 = c12127b.f14419b;
        byte[] bArr2 = c12127b.f14418a;
        if (i4 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr2, 0, bArr3, 0, i4);
        return bArr3;
    }

    /* renamed from: d */
    public static String m16797d(byte[] bArr) {
        return m16800g(bArr, 2);
    }

    /* renamed from: e */
    public static byte[] m16798e(byte[] bArr, int i) {
        return m16799f(bArr, 0, bArr.length, i);
    }

    /* renamed from: f */
    public static byte[] m16799f(byte[] bArr, int i, int i2, int i3) {
        C12128c c12128c = new C12128c(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c12128c.f14430f) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c12128c.f14431g && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (c12128c.f14432h ? 2 : 1);
        }
        c12128c.f14418a = new byte[i4];
        c12128c.m16802a(bArr, i, i2, true);
        return c12128c.f14418a;
    }

    /* renamed from: g */
    public static String m16800g(byte[] bArr, int i) {
        try {
            return new String(m16798e(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
