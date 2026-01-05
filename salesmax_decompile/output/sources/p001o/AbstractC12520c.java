package p001o;

/* renamed from: o.c */
/* loaded from: classes6.dex */
public abstract class AbstractC12520c {

    /* renamed from: a */
    public static final char[] f17035a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:162:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0081 A[EDGE_INSN: B:261:0x0081->B:55:0x0081 BREAK  A[LOOP:1: B:31:0x0051->B:59:0x0088, LOOP_LABEL: LOOP:0: B:3:0x0008->B:289:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m19988c(byte[] bArr, int i) {
        byte b;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (b2 != 10 && b2 != 13) {
                    if (!(b2 >= 0 && b2 < 32)) {
                        if (!(127 <= b2 && b2 < 160)) {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        return -1;
                    }
                    z2 = true;
                    if (z2) {
                    }
                    return -1;
                }
                if (b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 >= length || (b = bArr[i3]) < 0) {
                        break;
                    }
                    i3++;
                    i6 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if (b != 10 && b != 13) {
                        if (b >= 0 && b < 32) {
                            z = true;
                            if (!z) {
                                break loop0;
                            }
                        } else {
                            if (!(127 <= b && b < 160)) {
                                z = false;
                            }
                            if (!z) {
                            }
                        }
                    } else {
                        if (b == 65533) {
                            break loop0;
                        }
                        i4 += b < 65536 ? 1 : 2;
                    }
                }
                return -1;
            }
            if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b3 = bArr[i7];
                if (!((b3 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i8 = (b3 ^ 3968) ^ (b2 << 6);
                if (i8 < 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (i8 != 10 && i8 != 13) {
                    if (i8 >= 0 && i8 < 32) {
                        z5 = true;
                        if (z5) {
                        }
                        return -1;
                    }
                    if (!(127 <= i8 && i8 < 160)) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                    return -1;
                }
                if (i8 == 65533) {
                    return -1;
                }
                i4 += i8 < 65536 ? 1 : 2;
                y3i y3iVar = y3i.f54824a;
                i3 += 2;
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length <= i9) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b4 = bArr[i3 + 1];
                if (!((b4 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b5 = bArr[i9];
                if (!((b5 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i10 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                if (i10 < 2048) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                if (55296 <= i10 && i10 < 57344) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (i10 != 10 && i10 != 13) {
                    if (i10 >= 0 && i10 < 32) {
                        z4 = true;
                        if (z4) {
                        }
                        return -1;
                    }
                    if (!(127 <= i10 && i10 < 160)) {
                        z4 = false;
                    }
                    if (z4) {
                    }
                    return -1;
                }
                if (i10 == 65533) {
                    return -1;
                }
                i4 += i10 < 65536 ? 1 : 2;
                y3i y3iVar2 = y3i.f54824a;
                i3 += 3;
            } else {
                if ((b2 >> 3) != -2) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i11 = i3 + 3;
                if (length <= i11) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b6 = bArr[i3 + 1];
                if (!((b6 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b7 = bArr[i3 + 2];
                if (!((b7 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b8 = bArr[i11];
                if (!((b8 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i12 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                if (i12 > 1114111) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                if (55296 <= i12 && i12 < 57344) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                if (i12 < 65536) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (i12 != 10 && i12 != 13) {
                    if (i12 >= 0 && i12 < 32) {
                        z3 = true;
                        if (z3) {
                        }
                        return -1;
                    }
                    if (!(127 <= i12 && i12 < 160)) {
                        z3 = false;
                    }
                    if (z3) {
                    }
                    return -1;
                }
                if (i12 == 65533) {
                    return -1;
                }
                i4 += i12 < 65536 ? 1 : 2;
                y3i y3iVar3 = y3i.f54824a;
                i3 += 4;
            }
            i5 = i2;
        }
        return i4;
    }

    /* renamed from: d */
    public static final void m19989d(zq1 zq1Var, rl1 rl1Var, int i, int i2) {
        sq8.m48649h(zq1Var, "<this>");
        sq8.m48649h(rl1Var, "buffer");
        rl1Var.write(zq1Var.m59700j(), i, i2);
    }

    /* renamed from: e */
    public static final int m19990e(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    public static final char[] m19991f() {
        return f17035a;
    }
}
