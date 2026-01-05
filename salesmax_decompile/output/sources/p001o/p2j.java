package p001o;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class p2j {

    /* renamed from: o.p2j$a */
    public static final class C15951a {

        /* renamed from: a */
        public final String f39255a;

        /* renamed from: b */
        public final String[] f39256b;

        /* renamed from: c */
        public final int f39257c;

        public C15951a(String str, String[] strArr, int i) {
            this.f39255a = str;
            this.f39256b = strArr;
            this.f39257c = i;
        }
    }

    /* renamed from: o.p2j$b */
    public static final class C15952b {

        /* renamed from: a */
        public final boolean f39258a;

        /* renamed from: b */
        public final int f39259b;

        /* renamed from: c */
        public final int f39260c;

        /* renamed from: d */
        public final int f39261d;

        public C15952b(boolean z, int i, int i2, int i3) {
            this.f39258a = z;
            this.f39259b = i;
            this.f39260c = i2;
            this.f39261d = i3;
        }
    }

    /* renamed from: o.p2j$c */
    public static final class C15953c {

        /* renamed from: a */
        public final int f39262a;

        /* renamed from: b */
        public final int f39263b;

        /* renamed from: c */
        public final int f39264c;

        /* renamed from: d */
        public final int f39265d;

        /* renamed from: e */
        public final int f39266e;

        /* renamed from: f */
        public final int f39267f;

        /* renamed from: g */
        public final int f39268g;

        /* renamed from: h */
        public final int f39269h;

        /* renamed from: i */
        public final boolean f39270i;

        /* renamed from: j */
        public final byte[] f39271j;

        public C15953c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f39262a = i;
            this.f39263b = i2;
            this.f39264c = i3;
            this.f39265d = i4;
            this.f39266e = i5;
            this.f39267f = i6;
            this.f39268g = i7;
            this.f39269h = i8;
            this.f39270i = z;
            this.f39271j = bArr;
        }
    }

    /* renamed from: a */
    public static int[] m42922a(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    /* renamed from: b */
    public static int m42923b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: c */
    public static long m42924c(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* renamed from: d */
    public static Metadata m42925d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrJ1 = sqi.j1(str, "=");
            if (strArrJ1.length != 2) {
                ria.m46824h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrJ1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m7537a(new zwc(Base64.decode(strArrJ1[1], 0))));
                } catch (RuntimeException e) {
                    ria.m46825i("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrJ1[0], strArrJ1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: e */
    public static nf8 m42926e(byte[] bArr) {
        zwc zwcVar = new zwc(bArr);
        zwcVar.m60018V(1);
        int i = 0;
        while (zwcVar.m60020a() > 0 && zwcVar.m60029j() == 255) {
            i += Constants.MAX_HOST_LENGTH;
            zwcVar.m60018V(1);
        }
        int iM60004H = i + zwcVar.m60004H();
        int i2 = 0;
        while (zwcVar.m60020a() > 0 && zwcVar.m60029j() == 255) {
            i2 += Constants.MAX_HOST_LENGTH;
            zwcVar.m60018V(1);
        }
        int iM60004H2 = i2 + zwcVar.m60004H();
        byte[] bArr2 = new byte[iM60004H];
        int iM60025f = zwcVar.m60025f();
        System.arraycopy(bArr, iM60025f, bArr2, 0, iM60004H);
        int i3 = iM60025f + iM60004H + iM60004H2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return nf8.m40501G(bArr2, bArr3);
    }

    /* renamed from: f */
    public static void m42927f(n2j n2jVar) throws byc {
        int iM40027d = n2jVar.m40027d(6) + 1;
        for (int i = 0; i < iM40027d; i++) {
            int iM40027d2 = n2jVar.m40027d(16);
            if (iM40027d2 == 0) {
                n2jVar.m40028e(8);
                n2jVar.m40028e(16);
                n2jVar.m40028e(16);
                n2jVar.m40028e(6);
                n2jVar.m40028e(8);
                int iM40027d3 = n2jVar.m40027d(4) + 1;
                for (int i2 = 0; i2 < iM40027d3; i2++) {
                    n2jVar.m40028e(8);
                }
            } else {
                if (iM40027d2 != 1) {
                    throw byc.m19921a("floor type greater than 1 not decodable: " + iM40027d2, null);
                }
                int iM40027d4 = n2jVar.m40027d(5);
                int[] iArr = new int[iM40027d4];
                int i3 = -1;
                for (int i4 = 0; i4 < iM40027d4; i4++) {
                    int iM40027d5 = n2jVar.m40027d(4);
                    iArr[i4] = iM40027d5;
                    if (iM40027d5 > i3) {
                        i3 = iM40027d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = n2jVar.m40027d(3) + 1;
                    int iM40027d6 = n2jVar.m40027d(2);
                    if (iM40027d6 > 0) {
                        n2jVar.m40028e(8);
                    }
                    for (int i7 = 0; i7 < (1 << iM40027d6); i7++) {
                        n2jVar.m40028e(8);
                    }
                }
                n2jVar.m40028e(2);
                int iM40027d7 = n2jVar.m40027d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iM40027d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        n2jVar.m40028e(iM40027d7);
                        i9++;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m42928g(int i, n2j n2jVar) throws byc {
        int iM40027d = n2jVar.m40027d(6) + 1;
        for (int i2 = 0; i2 < iM40027d; i2++) {
            int iM40027d2 = n2jVar.m40027d(16);
            if (iM40027d2 != 0) {
                ria.m46819c("VorbisUtil", "mapping type other than 0 not supported: " + iM40027d2);
            } else {
                int iM40027d3 = n2jVar.m40026c() ? n2jVar.m40027d(4) + 1 : 1;
                if (n2jVar.m40026c()) {
                    int iM40027d4 = n2jVar.m40027d(8) + 1;
                    for (int i3 = 0; i3 < iM40027d4; i3++) {
                        int i4 = i - 1;
                        n2jVar.m40028e(m42923b(i4));
                        n2jVar.m40028e(m42923b(i4));
                    }
                }
                if (n2jVar.m40027d(2) != 0) {
                    throw byc.m19921a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iM40027d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        n2jVar.m40028e(4);
                    }
                }
                for (int i6 = 0; i6 < iM40027d3; i6++) {
                    n2jVar.m40028e(8);
                    n2jVar.m40028e(8);
                    n2jVar.m40028e(8);
                }
            }
        }
    }

    /* renamed from: h */
    public static C15952b[] m42929h(n2j n2jVar) {
        int iM40027d = n2jVar.m40027d(6) + 1;
        C15952b[] c15952bArr = new C15952b[iM40027d];
        for (int i = 0; i < iM40027d; i++) {
            c15952bArr[i] = new C15952b(n2jVar.m40026c(), n2jVar.m40027d(16), n2jVar.m40027d(16), n2jVar.m40027d(8));
        }
        return c15952bArr;
    }

    /* renamed from: i */
    public static void m42930i(n2j n2jVar) throws byc {
        int iM40027d = n2jVar.m40027d(6) + 1;
        for (int i = 0; i < iM40027d; i++) {
            if (n2jVar.m40027d(16) > 2) {
                throw byc.m19921a("residueType greater than 2 is not decodable", null);
            }
            n2jVar.m40028e(24);
            n2jVar.m40028e(24);
            n2jVar.m40028e(24);
            int iM40027d2 = n2jVar.m40027d(6) + 1;
            n2jVar.m40028e(8);
            int[] iArr = new int[iM40027d2];
            for (int i2 = 0; i2 < iM40027d2; i2++) {
                iArr[i2] = ((n2jVar.m40026c() ? n2jVar.m40027d(5) : 0) * 8) + n2jVar.m40027d(3);
            }
            for (int i3 = 0; i3 < iM40027d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        n2jVar.m40028e(8);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public static C15951a m42931j(zwc zwcVar) {
        return m42932k(zwcVar, true, true);
    }

    /* renamed from: k */
    public static C15951a m42932k(zwc zwcVar, boolean z, boolean z2) throws byc {
        if (z) {
            m42936o(3, zwcVar, false);
        }
        String strM60001E = zwcVar.m60001E((int) zwcVar.m60043x());
        int length = 11 + strM60001E.length();
        long jM60043x = zwcVar.m60043x();
        String[] strArr = new String[(int) jM60043x];
        int length2 = length + 4;
        for (int i = 0; i < jM60043x; i++) {
            String strM60001E2 = zwcVar.m60001E((int) zwcVar.m60043x());
            strArr[i] = strM60001E2;
            length2 = length2 + 4 + strM60001E2.length();
        }
        if (z2 && (zwcVar.m60004H() & 1) == 0) {
            throw byc.m19921a("framing bit expected to be set", null);
        }
        return new C15951a(strM60001E, strArr, length2 + 1);
    }

    /* renamed from: l */
    public static C15953c m42933l(zwc zwcVar) throws byc {
        m42936o(1, zwcVar, false);
        int iM60044y = zwcVar.m60044y();
        int iM60004H = zwcVar.m60004H();
        int iM60044y2 = zwcVar.m60044y();
        int iM60040u = zwcVar.m60040u();
        if (iM60040u <= 0) {
            iM60040u = -1;
        }
        int iM60040u2 = zwcVar.m60040u();
        if (iM60040u2 <= 0) {
            iM60040u2 = -1;
        }
        int iM60040u3 = zwcVar.m60040u();
        if (iM60040u3 <= 0) {
            iM60040u3 = -1;
        }
        int iM60004H2 = zwcVar.m60004H();
        return new C15953c(iM60044y, iM60004H, iM60044y2, iM60040u, iM60040u2, iM60040u3, (int) Math.pow(2.0d, iM60004H2 & 15), (int) Math.pow(2.0d, (iM60004H2 & 240) >> 4), (zwcVar.m60004H() & 1) > 0, Arrays.copyOf(zwcVar.m60024e(), zwcVar.m60026g()));
    }

    /* renamed from: m */
    public static C15952b[] m42934m(zwc zwcVar, int i) throws byc {
        m42936o(5, zwcVar, false);
        int iM60004H = zwcVar.m60004H() + 1;
        n2j n2jVar = new n2j(zwcVar.m60024e());
        n2jVar.m40028e(zwcVar.m60025f() * 8);
        for (int i2 = 0; i2 < iM60004H; i2++) {
            m42935n(n2jVar);
        }
        int iM40027d = n2jVar.m40027d(6) + 1;
        for (int i3 = 0; i3 < iM40027d; i3++) {
            if (n2jVar.m40027d(16) != 0) {
                throw byc.m19921a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m42927f(n2jVar);
        m42930i(n2jVar);
        m42928g(i, n2jVar);
        C15952b[] c15952bArrM42929h = m42929h(n2jVar);
        if (n2jVar.m40026c()) {
            return c15952bArrM42929h;
        }
        throw byc.m19921a("framing bit after modes not set as expected", null);
    }

    /* renamed from: n */
    public static void m42935n(n2j n2jVar) throws byc {
        if (n2jVar.m40027d(24) != 5653314) {
            throw byc.m19921a("expected code book to start with [0x56, 0x43, 0x42] at " + n2jVar.m40025b(), null);
        }
        int iM40027d = n2jVar.m40027d(16);
        int iM40027d2 = n2jVar.m40027d(24);
        int iM40027d3 = 0;
        if (n2jVar.m40026c()) {
            n2jVar.m40028e(5);
            while (iM40027d3 < iM40027d2) {
                iM40027d3 += n2jVar.m40027d(m42923b(iM40027d2 - iM40027d3));
            }
        } else {
            boolean zM40026c = n2jVar.m40026c();
            while (iM40027d3 < iM40027d2) {
                if (!zM40026c) {
                    n2jVar.m40028e(5);
                } else if (n2jVar.m40026c()) {
                    n2jVar.m40028e(5);
                }
                iM40027d3++;
            }
        }
        int iM40027d4 = n2jVar.m40027d(4);
        if (iM40027d4 > 2) {
            throw byc.m19921a("lookup type greater than 2 not decodable: " + iM40027d4, null);
        }
        if (iM40027d4 == 1 || iM40027d4 == 2) {
            n2jVar.m40028e(32);
            n2jVar.m40028e(32);
            int iM40027d5 = n2jVar.m40027d(4) + 1;
            n2jVar.m40028e(1);
            n2jVar.m40028e((int) ((iM40027d4 == 1 ? iM40027d != 0 ? m42924c(iM40027d2, iM40027d) : 0L : iM40027d * iM40027d2) * iM40027d5));
        }
    }

    /* renamed from: o */
    public static boolean m42936o(int i, zwc zwcVar, boolean z) throws byc {
        if (zwcVar.m60020a() < 7) {
            if (z) {
                return false;
            }
            throw byc.m19921a("too short header: " + zwcVar.m60020a(), null);
        }
        if (zwcVar.m60004H() != i) {
            if (z) {
                return false;
            }
            throw byc.m19921a("expected header type " + Integer.toHexString(i), null);
        }
        if (zwcVar.m60004H() == 118 && zwcVar.m60004H() == 111 && zwcVar.m60004H() == 114 && zwcVar.m60004H() == 98 && zwcVar.m60004H() == 105 && zwcVar.m60004H() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw byc.m19921a("expected characters 'vorbis'", null);
    }
}
