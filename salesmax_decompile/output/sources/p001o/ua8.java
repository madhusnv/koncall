package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p001o.nf8;

/* loaded from: classes2.dex */
public final class ua8 extends ntf {

    /* renamed from: b */
    public static final InterfaceC17345a f48638b = new InterfaceC17345a() { // from class: o.ta8
        @Override // p001o.ua8.InterfaceC17345a
        /* renamed from: a */
        public final boolean mo19449a(int i, int i2, int i3, int i4, int i5) {
            return ua8.m51277A(i, i2, i3, i4, i5);
        }
    };

    /* renamed from: a */
    public final InterfaceC17345a f48639a;

    /* renamed from: o.ua8$a */
    public interface InterfaceC17345a {
        /* renamed from: a */
        boolean mo19449a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: o.ua8$b */
    public static final class C17346b {

        /* renamed from: a */
        public final int f48640a;

        /* renamed from: b */
        public final boolean f48641b;

        /* renamed from: c */
        public final int f48642c;

        public C17346b(int i, boolean z, int i2) {
            this.f48640a = i;
            this.f48641b = z;
            this.f48642c = i2;
        }
    }

    public ua8() {
        this(null);
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m51277A(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: B */
    public static int m51278B(zwc zwcVar, int i) {
        byte[] bArrM60024e = zwcVar.m60024e();
        int iM60025f = zwcVar.m60025f();
        int i2 = iM60025f;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM60025f + i) {
                return i;
            }
            if ((bArrM60024e[i2] & 255) == 255 && bArrM60024e[i3] == 0) {
                System.arraycopy(bArrM60024e, i2 + 2, bArrM60024e, i3, (i - (i2 - iM60025f)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r3
      0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m51279C(zwc zwcVar, int i, int i2, boolean z) {
        int iM60007K;
        long jM60007K;
        int iM60010N;
        int i3;
        int iM60025f = zwcVar.m60025f();
        while (true) {
            try {
                boolean z2 = true;
                if (zwcVar.m60020a() < i2) {
                    return true;
                }
                if (i >= 3) {
                    iM60007K = zwcVar.m60036q();
                    jM60007K = zwcVar.m60006J();
                    iM60010N = zwcVar.m60010N();
                } else {
                    iM60007K = zwcVar.m60007K();
                    jM60007K = zwcVar.m60007K();
                    iM60010N = 0;
                }
                if (iM60007K == 0 && jM60007K == 0 && iM60010N == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM60007K) != 0) {
                        return false;
                    }
                    jM60007K = (((jM60007K >> 24) & 255) << 21) | (jM60007K & 255) | (((jM60007K >> 8) & 255) << 7) | (((jM60007K >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM60010N & 64) != 0 ? 1 : 0;
                    if ((iM60010N & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM60010N & 32) != 0 ? 1 : 0;
                    if ((iM60010N & 128) == 0) {
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM60007K < i3) {
                    return false;
                }
                if (zwcVar.m60020a() < jM60007K) {
                    return false;
                }
                zwcVar.m60018V((int) jM60007K);
            } finally {
                zwcVar.m60017U(iM60025f);
            }
        }
    }

    /* renamed from: d */
    public static byte[] m51281d(byte[] bArr, int i, int i2) {
        return i2 <= i ? sqi.f45795f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: f */
    public static ApicFrame m51282f(zwc zwcVar, int i, int i2) {
        int iM51302z;
        String str;
        int iM60004H = zwcVar.m60004H();
        Charset charsetM51299w = m51299w(iM60004H);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        zwcVar.m60031l(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + kp0.m35995e(new String(bArr, 0, 3, uh2.f48930b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iM51302z = 2;
        } else {
            iM51302z = m51302z(bArr, 0);
            String strM35995e = kp0.m35995e(new String(bArr, 0, iM51302z, uh2.f48930b));
            if (strM35995e.indexOf(47) == -1) {
                str = "image/" + strM35995e;
            } else {
                str = strM35995e;
            }
        }
        int i4 = bArr[iM51302z + 1] & 255;
        int i5 = iM51302z + 2;
        int iM51301y = m51301y(bArr, i5, iM60004H);
        return new ApicFrame(str, new String(bArr, i5, iM51301y - i5, charsetM51299w), i4, m51281d(bArr, iM51301y + m51298v(iM60004H), i3));
    }

    /* renamed from: g */
    public static BinaryFrame m51283g(zwc zwcVar, int i, String str) {
        byte[] bArr = new byte[i];
        zwcVar.m60031l(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: h */
    public static ChapterFrame m51284h(zwc zwcVar, int i, int i2, boolean z, int i3, InterfaceC17345a interfaceC17345a) {
        int iM60025f = zwcVar.m60025f();
        int iM51302z = m51302z(zwcVar.m60024e(), iM60025f);
        String str = new String(zwcVar.m60024e(), iM60025f, iM51302z - iM60025f, uh2.f48930b);
        zwcVar.m60017U(iM51302z + 1);
        int iM60036q = zwcVar.m60036q();
        int iM60036q2 = zwcVar.m60036q();
        long jM60006J = zwcVar.m60006J();
        long j = jM60006J == 4294967295L ? -1L : jM60006J;
        long jM60006J2 = zwcVar.m60006J();
        long j2 = jM60006J2 == 4294967295L ? -1L : jM60006J2;
        ArrayList arrayList = new ArrayList();
        int i4 = iM60025f + i;
        while (zwcVar.m60025f() < i4) {
            Id3Frame id3FrameM51287k = m51287k(i2, zwcVar, z, i3, interfaceC17345a);
            if (id3FrameM51287k != null) {
                arrayList.add(id3FrameM51287k);
            }
        }
        return new ChapterFrame(str, iM60036q, iM60036q2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: i */
    public static ChapterTocFrame m51285i(zwc zwcVar, int i, int i2, boolean z, int i3, InterfaceC17345a interfaceC17345a) {
        int iM60025f = zwcVar.m60025f();
        int iM51302z = m51302z(zwcVar.m60024e(), iM60025f);
        String str = new String(zwcVar.m60024e(), iM60025f, iM51302z - iM60025f, uh2.f48930b);
        zwcVar.m60017U(iM51302z + 1);
        int iM60004H = zwcVar.m60004H();
        boolean z2 = (iM60004H & 2) != 0;
        boolean z3 = (iM60004H & 1) != 0;
        int iM60004H2 = zwcVar.m60004H();
        String[] strArr = new String[iM60004H2];
        for (int i4 = 0; i4 < iM60004H2; i4++) {
            int iM60025f2 = zwcVar.m60025f();
            int iM51302z2 = m51302z(zwcVar.m60024e(), iM60025f2);
            strArr[i4] = new String(zwcVar.m60024e(), iM60025f2, iM51302z2 - iM60025f2, uh2.f48930b);
            zwcVar.m60017U(iM51302z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM60025f + i;
        while (zwcVar.m60025f() < i5) {
            Id3Frame id3FrameM51287k = m51287k(i2, zwcVar, z, i3, interfaceC17345a);
            if (id3FrameM51287k != null) {
                arrayList.add(id3FrameM51287k);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: j */
    public static CommentFrame m51286j(zwc zwcVar, int i) {
        if (i < 4) {
            return null;
        }
        int iM60004H = zwcVar.m60004H();
        Charset charsetM51299w = m51299w(iM60004H);
        byte[] bArr = new byte[3];
        zwcVar.m60031l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        zwcVar.m60031l(bArr2, 0, i2);
        int iM51301y = m51301y(bArr2, 0, iM60004H);
        String str2 = new String(bArr2, 0, iM51301y, charsetM51299w);
        int iM51298v = iM51301y + m51298v(iM60004H);
        return new CommentFrame(str, str2, m51292p(bArr2, iM51298v, m51301y(bArr2, iM51298v, iM60004H), charsetM51299w));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #2 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:91:0x011a, B:93:0x0122, B:106:0x0141, B:108:0x0149, B:116:0x0163, B:125:0x017b, B:136:0x0196, B:143:0x01a8, B:149:0x01b7, B:154:0x01cf, B:160:0x01e9, B:161:0x01ee), top: B:171:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0209  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame m51287k(int i, zwc zwcVar, boolean z, int i2, InterfaceC17345a interfaceC17345a) {
        int iM60008L;
        String str;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Id3Frame id3FrameM51286j;
        int iM60004H = zwcVar.m60004H();
        int iM60004H2 = zwcVar.m60004H();
        int iM60004H3 = zwcVar.m60004H();
        int iM60004H4 = i >= 3 ? zwcVar.m60004H() : 0;
        if (i == 4) {
            iM60008L = zwcVar.m60008L();
            if (!z) {
                iM60008L = (((iM60008L >> 24) & Constants.MAX_HOST_LENGTH) << 21) | (iM60008L & Constants.MAX_HOST_LENGTH) | (((iM60008L >> 8) & Constants.MAX_HOST_LENGTH) << 7) | (((iM60008L >> 16) & Constants.MAX_HOST_LENGTH) << 14);
            }
        } else {
            iM60008L = i == 3 ? zwcVar.m60008L() : zwcVar.m60007K();
        }
        int iM51278B = iM60008L;
        int iM60010N = i >= 3 ? zwcVar.m60010N() : 0;
        Id3Frame id3Frame = null;
        if (iM60004H == 0 && iM60004H2 == 0 && iM60004H3 == 0 && iM60004H4 == 0 && iM51278B == 0 && iM60010N == 0) {
            zwcVar.m60017U(zwcVar.m60026g());
            return null;
        }
        int iM60025f = zwcVar.m60025f() + iM51278B;
        if (iM60025f > zwcVar.m60026g()) {
            ria.m46824h("Id3Decoder", "Frame size exceeds remaining tag data");
            zwcVar.m60017U(zwcVar.m60026g());
            return null;
        }
        if (interfaceC17345a != null) {
            str = "Id3Decoder";
            i3 = iM60025f;
            i4 = iM60010N;
            if (!interfaceC17345a.mo19449a(i, iM60004H, iM60004H2, iM60004H3, iM60004H4)) {
                zwcVar.m60017U(i3);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i3 = iM60025f;
            i4 = iM60010N;
        }
        if (i == 3) {
            boolean z7 = (i4 & 128) != 0;
            z6 = (i4 & 64) != 0;
            z5 = false;
            z4 = z7;
            z3 = (i4 & 32) != 0;
            z2 = z4;
        } else if (i == 4) {
            z3 = (i4 & 64) != 0;
            boolean z8 = (i4 & 8) != 0;
            boolean z9 = (i4 & 4) != 0;
            z5 = (i4 & 2) != 0;
            z6 = z9;
            boolean z10 = z8;
            z4 = (i4 & 1) != 0;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            ria.m46824h(str, "Skipping unsupported compressed or encrypted frame");
            zwcVar.m60017U(i3);
            return null;
        }
        if (z3) {
            iM51278B--;
            zwcVar.m60018V(1);
        }
        if (z4) {
            iM51278B -= 4;
            zwcVar.m60018V(4);
        }
        if (z5) {
            iM51278B = m51278B(zwcVar, iM51278B);
        }
        try {
        } catch (Exception e) {
            e = e;
            zwcVar.m60017U(i3);
            if (id3Frame == null) {
            }
            return id3Frame;
        } catch (OutOfMemoryError e2) {
            e = e2;
            zwcVar.m60017U(i3);
            if (id3Frame == null) {
            }
            return id3Frame;
        } catch (Throwable th) {
            zwcVar.m60017U(i3);
            throw th;
        }
        if (iM60004H == 84 && iM60004H2 == 88 && iM60004H3 == 88 && (i == 2 || iM60004H4 == 88)) {
            id3FrameM51286j = m51295s(zwcVar, iM51278B);
        } else if (iM60004H == 84) {
            id3FrameM51286j = m51293q(zwcVar, iM51278B, m51300x(i, iM60004H, iM60004H2, iM60004H3, iM60004H4));
        } else if (iM60004H == 87 && iM60004H2 == 88 && iM60004H3 == 88 && (i == 2 || iM60004H4 == 88)) {
            id3FrameM51286j = m51297u(zwcVar, iM51278B);
        } else if (iM60004H == 87) {
            id3FrameM51286j = m51296t(zwcVar, iM51278B, m51300x(i, iM60004H, iM60004H2, iM60004H3, iM60004H4));
        } else if (iM60004H == 80 && iM60004H2 == 82 && iM60004H3 == 73 && iM60004H4 == 86) {
            id3FrameM51286j = m51291o(zwcVar, iM51278B);
        } else if (iM60004H == 71 && iM60004H2 == 69 && iM60004H3 == 79 && (iM60004H4 == 66 || i == 2)) {
            id3FrameM51286j = m51288l(zwcVar, iM51278B);
        } else if (i == 2) {
            if (iM60004H == 80 && iM60004H2 == 73 && iM60004H3 == 67) {
                id3FrameM51286j = m51282f(zwcVar, iM51278B, i);
            }
            id3FrameM51286j = (iM60004H != 67 && iM60004H2 == 79 && iM60004H3 == 77 && (iM60004H4 == 77 || i == 2)) ? m51286j(zwcVar, iM51278B) : (iM60004H != 67 && iM60004H2 == 72 && iM60004H3 == 65 && iM60004H4 == 80) ? m51284h(zwcVar, iM51278B, i, z, i2, interfaceC17345a) : (iM60004H != 67 && iM60004H2 == 84 && iM60004H3 == 79 && iM60004H4 == 67) ? m51285i(zwcVar, iM51278B, i, z, i2, interfaceC17345a) : (iM60004H != 77 && iM60004H2 == 76 && iM60004H3 == 76 && iM60004H4 == 84) ? m51290n(zwcVar, iM51278B) : m51283g(zwcVar, iM51278B, m51300x(i, iM60004H, iM60004H2, iM60004H3, iM60004H4));
        } else {
            if (iM60004H != 65 || iM60004H2 != 80 || iM60004H3 != 73 || iM60004H4 != 67) {
                if (iM60004H != 67) {
                }
                if (id3Frame == null) {
                    ria.m46825i(str, "Failed to decode frame: id=" + m51300x(i, iM60004H, iM60004H2, iM60004H3, iM60004H4) + ", frameSize=" + iM51278B, e);
                }
                return id3Frame;
            }
            id3FrameM51286j = m51282f(zwcVar, iM51278B, i);
        }
        zwcVar.m60017U(i3);
        id3Frame = id3FrameM51286j;
        e = null;
        if (id3Frame == null) {
        }
        return id3Frame;
    }

    /* renamed from: l */
    public static GeobFrame m51288l(zwc zwcVar, int i) {
        int iM60004H = zwcVar.m60004H();
        Charset charsetM51299w = m51299w(iM60004H);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zwcVar.m60031l(bArr, 0, i2);
        int iM51302z = m51302z(bArr, 0);
        String strM56190r = xeb.m56190r(new String(bArr, 0, iM51302z, uh2.f48930b));
        int i3 = iM51302z + 1;
        int iM51301y = m51301y(bArr, i3, iM60004H);
        String strM51292p = m51292p(bArr, i3, iM51301y, charsetM51299w);
        int iM51298v = iM51301y + m51298v(iM60004H);
        int iM51301y2 = m51301y(bArr, iM51298v, iM60004H);
        return new GeobFrame(strM56190r, strM51292p, m51292p(bArr, iM51298v, iM51301y2, charsetM51299w), m51281d(bArr, iM51301y2 + m51298v(iM60004H), i2));
    }

    /* renamed from: m */
    public static C17346b m51289m(zwc zwcVar) {
        if (zwcVar.m60020a() < 10) {
            ria.m46824h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iM60007K = zwcVar.m60007K();
        if (iM60007K != 4801587) {
            ria.m46824h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iM60007K)));
            return null;
        }
        int iM60004H = zwcVar.m60004H();
        zwcVar.m60018V(1);
        int iM60004H2 = zwcVar.m60004H();
        int iM60003G = zwcVar.m60003G();
        if (iM60004H == 2) {
            if ((iM60004H2 & 64) != 0) {
                ria.m46824h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iM60004H == 3) {
            if ((iM60004H2 & 64) != 0) {
                int iM60036q = zwcVar.m60036q();
                zwcVar.m60018V(iM60036q);
                iM60003G -= iM60036q + 4;
            }
        } else {
            if (iM60004H != 4) {
                ria.m46824h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM60004H);
                return null;
            }
            if ((iM60004H2 & 64) != 0) {
                int iM60003G2 = zwcVar.m60003G();
                zwcVar.m60018V(iM60003G2 - 4);
                iM60003G -= iM60003G2;
            }
            if ((iM60004H2 & 16) != 0) {
                iM60003G -= 10;
            }
        }
        return new C17346b(iM60004H, iM60004H < 4 && (iM60004H2 & 128) != 0, iM60003G);
    }

    /* renamed from: n */
    public static MlltFrame m51290n(zwc zwcVar, int i) {
        int iM60010N = zwcVar.m60010N();
        int iM60007K = zwcVar.m60007K();
        int iM60007K2 = zwcVar.m60007K();
        int iM60004H = zwcVar.m60004H();
        int iM60004H2 = zwcVar.m60004H();
        ywc ywcVar = new ywc();
        ywcVar.m58449m(zwcVar);
        int i2 = ((i - 10) * 8) / (iM60004H + iM60004H2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM58444h = ywcVar.m58444h(iM60004H);
            int iM58444h2 = ywcVar.m58444h(iM60004H2);
            iArr[i3] = iM58444h;
            iArr2[i3] = iM58444h2;
        }
        return new MlltFrame(iM60010N, iM60007K, iM60007K2, iArr, iArr2);
    }

    /* renamed from: o */
    public static PrivFrame m51291o(zwc zwcVar, int i) {
        byte[] bArr = new byte[i];
        zwcVar.m60031l(bArr, 0, i);
        int iM51302z = m51302z(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iM51302z, uh2.f48930b), m51281d(bArr, iM51302z + 1, i));
    }

    /* renamed from: p */
    public static String m51292p(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* renamed from: q */
    public static TextInformationFrame m51293q(zwc zwcVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iM60004H = zwcVar.m60004H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zwcVar.m60031l(bArr, 0, i2);
        return new TextInformationFrame(str, null, m51294r(bArr, iM60004H, 0));
    }

    /* renamed from: r */
    public static nf8 m51294r(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return nf8.m40500F("");
        }
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        int iM51301y = m51301y(bArr, i2, i);
        while (i2 < iM51301y) {
            c15566aM40508q.mo32056a(new String(bArr, i2, iM51301y - i2, m51299w(i)));
            i2 = m51298v(i) + iM51301y;
            iM51301y = m51301y(bArr, i2, i);
        }
        nf8 nf8VarM40520k = c15566aM40508q.m40520k();
        return nf8VarM40520k.isEmpty() ? nf8.m40500F("") : nf8VarM40520k;
    }

    /* renamed from: s */
    public static TextInformationFrame m51295s(zwc zwcVar, int i) {
        if (i < 1) {
            return null;
        }
        int iM60004H = zwcVar.m60004H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zwcVar.m60031l(bArr, 0, i2);
        int iM51301y = m51301y(bArr, 0, iM60004H);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iM51301y, m51299w(iM60004H)), m51294r(bArr, iM60004H, iM51301y + m51298v(iM60004H)));
    }

    /* renamed from: t */
    public static UrlLinkFrame m51296t(zwc zwcVar, int i, String str) {
        byte[] bArr = new byte[i];
        zwcVar.m60031l(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m51302z(bArr, 0), uh2.f48930b));
    }

    /* renamed from: u */
    public static UrlLinkFrame m51297u(zwc zwcVar, int i) {
        if (i < 1) {
            return null;
        }
        int iM60004H = zwcVar.m60004H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zwcVar.m60031l(bArr, 0, i2);
        int iM51301y = m51301y(bArr, 0, iM60004H);
        String str = new String(bArr, 0, iM51301y, m51299w(iM60004H));
        int iM51298v = iM51301y + m51298v(iM60004H);
        return new UrlLinkFrame("WXXX", str, m51292p(bArr, iM51298v, m51302z(bArr, iM51298v), uh2.f48930b));
    }

    /* renamed from: v */
    public static int m51298v(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: w */
    public static Charset m51299w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? uh2.f48930b : uh2.f48931c : uh2.f48932d : uh2.f48934f;
    }

    /* renamed from: x */
    public static String m51300x(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: y */
    public static int m51301y(byte[] bArr, int i, int i2) {
        int iM51302z = m51302z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM51302z;
        }
        while (iM51302z < bArr.length - 1) {
            if ((iM51302z - i) % 2 == 0 && bArr[iM51302z + 1] == 0) {
                return iM51302z;
            }
            iM51302z = m51302z(bArr, iM51302z + 1);
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static int m51302z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // p001o.ntf
    /* renamed from: b */
    public Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer) {
        return m51303e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public Metadata m51303e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        zwc zwcVar = new zwc(bArr, i);
        C17346b c17346bM51289m = m51289m(zwcVar);
        if (c17346bM51289m == null) {
            return null;
        }
        int iM60025f = zwcVar.m60025f();
        int i2 = c17346bM51289m.f48640a == 2 ? 6 : 10;
        int iM51278B = c17346bM51289m.f48642c;
        if (c17346bM51289m.f48641b) {
            iM51278B = m51278B(zwcVar, c17346bM51289m.f48642c);
        }
        zwcVar.m60016T(iM60025f + iM51278B);
        boolean z = false;
        if (!m51279C(zwcVar, c17346bM51289m.f48640a, i2, false)) {
            if (c17346bM51289m.f48640a != 4 || !m51279C(zwcVar, 4, i2, true)) {
                ria.m46824h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c17346bM51289m.f48640a);
                return null;
            }
            z = true;
        }
        while (zwcVar.m60020a() >= i2) {
            Id3Frame id3FrameM51287k = m51287k(c17346bM51289m.f48640a, zwcVar, z, i2, this.f48639a);
            if (id3FrameM51287k != null) {
                arrayList.add(id3FrameM51287k);
            }
        }
        return new Metadata(arrayList);
    }

    public ua8(InterfaceC17345a interfaceC17345a) {
        this.f48639a = interfaceC17345a;
    }
}
