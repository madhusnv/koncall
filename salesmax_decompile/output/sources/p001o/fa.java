package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class fa {

    /* renamed from: a */
    public static final int[] f23006a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f23007b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f23008c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f23009d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f23010e = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f23011f = {69, 87, 104, Opcodes.LSHL, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: o.fa$b */
    public static final class C13373b {

        /* renamed from: a */
        public final String f23012a;

        /* renamed from: b */
        public final int f23013b;

        /* renamed from: c */
        public final int f23014c;

        /* renamed from: d */
        public final int f23015d;

        /* renamed from: e */
        public final int f23016e;

        /* renamed from: f */
        public final int f23017f;

        /* renamed from: g */
        public final int f23018g;

        public C13373b(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f23012a = str;
            this.f23013b = i;
            this.f23015d = i2;
            this.f23014c = i3;
            this.f23016e = i4;
            this.f23017f = i5;
            this.f23018g = i6;
        }
    }

    /* renamed from: a */
    public static int m26322a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    /* renamed from: b */
    public static int m26323b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((sqi.m48710O(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m26324c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f23007b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f23011f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f23010e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: d */
    public static C2181a m26325d(zwc zwcVar, String str, String str2, DrmInitData drmInitData) {
        ywc ywcVar = new ywc();
        ywcVar.m58449m(zwcVar);
        int i = f23007b[ywcVar.m58444h(2)];
        ywcVar.m58454r(8);
        int i2 = f23009d[ywcVar.m58444h(3)];
        if (ywcVar.m58444h(1) != 0) {
            i2++;
        }
        int i3 = f23010e[ywcVar.m58444h(5)] * 1000;
        ywcVar.m58439c();
        zwcVar.m60017U(ywcVar.m58440d());
        return new C2181a.b().a0(str).o0("audio/ac3").m6751N(i2).p0(i).m6758U(drmInitData).e0(str2).m6750M(i3).j0(i3).m6748K();
    }

    /* renamed from: e */
    public static int m26326e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f23006a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: f */
    public static C13373b m26327f(ywc ywcVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM58441e = ywcVar.m58441e();
        ywcVar.m58454r(40);
        boolean z = ywcVar.m58444h(5) > 10;
        ywcVar.m58452p(iM58441e);
        int i13 = -1;
        if (z) {
            ywcVar.m58454r(16);
            int iM58444h = ywcVar.m58444h(2);
            if (iM58444h == 0) {
                i13 = 0;
            } else if (iM58444h == 1) {
                i13 = 1;
            } else if (iM58444h == 2) {
                i13 = 2;
            }
            ywcVar.m58454r(3);
            int iM58444h2 = (ywcVar.m58444h(11) + 1) * 2;
            int iM58444h3 = ywcVar.m58444h(2);
            if (iM58444h3 == 3) {
                i8 = f23008c[ywcVar.m58444h(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int iM58444h4 = ywcVar.m58444h(2);
                int i14 = f23006a[iM58444h4];
                i7 = iM58444h4;
                i8 = f23007b[iM58444h3];
                i9 = i14;
            }
            int i15 = i9 * 256;
            int iM26322a = m26322a(iM58444h2, i8, i9);
            int iM58444h5 = ywcVar.m58444h(3);
            boolean zM58443g = ywcVar.m58443g();
            i = f23009d[iM58444h5] + (zM58443g ? 1 : 0);
            ywcVar.m58454r(10);
            if (ywcVar.m58443g()) {
                ywcVar.m58454r(8);
            }
            if (iM58444h5 == 0) {
                ywcVar.m58454r(5);
                if (ywcVar.m58443g()) {
                    ywcVar.m58454r(8);
                }
            }
            if (i13 == 1 && ywcVar.m58443g()) {
                ywcVar.m58454r(16);
            }
            if (ywcVar.m58443g()) {
                if (iM58444h5 > 2) {
                    ywcVar.m58454r(2);
                }
                if ((iM58444h5 & 1) == 0 || iM58444h5 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    ywcVar.m58454r(6);
                }
                if ((iM58444h5 & 4) != 0) {
                    ywcVar.m58454r(i11);
                }
                if (zM58443g && ywcVar.m58443g()) {
                    ywcVar.m58454r(5);
                }
                if (i13 == 0) {
                    if (ywcVar.m58443g()) {
                        i12 = 6;
                        ywcVar.m58454r(6);
                    } else {
                        i12 = 6;
                    }
                    if (iM58444h5 == 0 && ywcVar.m58443g()) {
                        ywcVar.m58454r(i12);
                    }
                    if (ywcVar.m58443g()) {
                        ywcVar.m58454r(i12);
                    }
                    int iM58444h6 = ywcVar.m58444h(2);
                    if (iM58444h6 == 1) {
                        ywcVar.m58454r(5);
                    } else if (iM58444h6 == 2) {
                        ywcVar.m58454r(12);
                    } else if (iM58444h6 == 3) {
                        int iM58444h7 = ywcVar.m58444h(5);
                        if (ywcVar.m58443g()) {
                            ywcVar.m58454r(5);
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(4);
                            }
                            if (ywcVar.m58443g()) {
                                if (ywcVar.m58443g()) {
                                    ywcVar.m58454r(4);
                                }
                                if (ywcVar.m58443g()) {
                                    ywcVar.m58454r(4);
                                }
                            }
                        }
                        if (ywcVar.m58443g()) {
                            ywcVar.m58454r(5);
                            if (ywcVar.m58443g()) {
                                ywcVar.m58454r(7);
                                if (ywcVar.m58443g()) {
                                    ywcVar.m58454r(8);
                                }
                            }
                        }
                        ywcVar.m58454r((iM58444h7 + 2) * 8);
                        ywcVar.m58439c();
                    }
                    if (iM58444h5 < 2) {
                        if (ywcVar.m58443g()) {
                            ywcVar.m58454r(14);
                        }
                        if (iM58444h5 == 0 && ywcVar.m58443g()) {
                            ywcVar.m58454r(14);
                        }
                    }
                    if (ywcVar.m58443g()) {
                        if (i7 == 0) {
                            ywcVar.m58454r(5);
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (ywcVar.m58443g()) {
                                    ywcVar.m58454r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (ywcVar.m58443g()) {
                ywcVar.m58454r(5);
                if (iM58444h5 == 2) {
                    ywcVar.m58454r(4);
                }
                if (iM58444h5 >= 6) {
                    ywcVar.m58454r(2);
                }
                if (ywcVar.m58443g()) {
                    ywcVar.m58454r(8);
                }
                if (iM58444h5 == 0 && ywcVar.m58443g()) {
                    ywcVar.m58454r(8);
                }
                if (iM58444h3 < 3) {
                    ywcVar.m58453q();
                }
            }
            if (i13 == 0 && i7 != 3) {
                ywcVar.m58453q();
            }
            if (i13 == 2 && (i7 == 3 || ywcVar.m58443g())) {
                i10 = 6;
                ywcVar.m58454r(6);
            } else {
                i10 = 6;
            }
            str = (ywcVar.m58443g() && ywcVar.m58444h(i10) == 1 && ywcVar.m58444h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i13;
            i3 = i15;
            i5 = iM58444h2;
            i6 = i8;
            i4 = iM26322a;
        } else {
            ywcVar.m58454r(32);
            int iM58444h8 = ywcVar.m58444h(2);
            String str2 = iM58444h8 == 3 ? null : "audio/ac3";
            int iM58444h9 = ywcVar.m58444h(6);
            int i17 = f23010e[iM58444h9 / 2] * 1000;
            int iM26324c = m26324c(iM58444h8, iM58444h9);
            ywcVar.m58454r(8);
            int iM58444h10 = ywcVar.m58444h(3);
            if ((iM58444h10 & 1) != 0 && iM58444h10 != 1) {
                ywcVar.m58454r(2);
            }
            if ((iM58444h10 & 4) != 0) {
                ywcVar.m58454r(2);
            }
            if (iM58444h10 == 2) {
                ywcVar.m58454r(2);
            }
            int[] iArr = f23007b;
            int i18 = iM58444h8 < iArr.length ? iArr[iM58444h8] : -1;
            i = f23009d[iM58444h10] + (ywcVar.m58443g() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = 1536;
            i4 = i17;
            i5 = iM26324c;
            i6 = i18;
        }
        return new C13373b(str, i2, i, i6, i5, i3, i4);
    }

    /* renamed from: g */
    public static int m26328g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m26324c((b & 192) >> 6, b & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2181a m26329h(zwc zwcVar, String str, String str2, DrmInitData drmInitData) {
        String str3;
        ywc ywcVar = new ywc();
        ywcVar.m58449m(zwcVar);
        int iM58444h = ywcVar.m58444h(13) * 1000;
        ywcVar.m58454r(3);
        int i = f23007b[ywcVar.m58444h(2)];
        ywcVar.m58454r(10);
        int i2 = f23009d[ywcVar.m58444h(3)];
        if (ywcVar.m58444h(1) != 0) {
            i2++;
        }
        ywcVar.m58454r(3);
        int iM58444h2 = ywcVar.m58444h(4);
        ywcVar.m58454r(1);
        if (iM58444h2 > 0) {
            ywcVar.m58454r(6);
            if (ywcVar.m58444h(1) != 0) {
                i2 += 2;
            }
            ywcVar.m58454r(1);
        }
        if (ywcVar.m58438b() > 7) {
            ywcVar.m58454r(7);
            str3 = ywcVar.m58444h(1) != 0 ? "audio/eac3-joc" : "audio/eac3";
        }
        ywcVar.m58439c();
        zwcVar.m60017U(ywcVar.m58440d());
        return new C2181a.b().a0(str).o0(str3).m6751N(i2).p0(i).m6758U(drmInitData).e0(str2).j0(iM58444h).m6748K();
    }

    /* renamed from: i */
    public static int m26330i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m26331j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
