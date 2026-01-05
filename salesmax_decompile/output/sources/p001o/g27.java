package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.List;
import p001o.j27;

/* loaded from: classes2.dex */
public abstract class g27 {

    /* renamed from: o.g27$a */
    public static final class C13613a {

        /* renamed from: a */
        public j27 f24481a;

        public C13613a(j27 j27Var) {
            this.f24481a = j27Var;
        }
    }

    /* renamed from: a */
    public static boolean m27989a(uq6 uq6Var) {
        zwc zwcVar = new zwc(4);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, 4);
        return zwcVar.m60006J() == 1716281667;
    }

    /* renamed from: b */
    public static int m27990b(uq6 uq6Var) throws byc {
        uq6Var.mo40490c();
        zwc zwcVar = new zwc(2);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, 2);
        int iM60010N = zwcVar.m60010N();
        if ((iM60010N >> 2) == 16382) {
            uq6Var.mo40490c();
            return iM60010N;
        }
        uq6Var.mo40490c();
        throw byc.m19921a("First frame does not start with sync code.", null);
    }

    /* renamed from: c */
    public static Metadata m27991c(uq6 uq6Var, boolean z) {
        Metadata metadataM52494a = new va8().m52494a(uq6Var, z ? null : ua8.f48638b);
        if (metadataM52494a == null || metadataM52494a.m6697e() == 0) {
            return null;
        }
        return metadataM52494a;
    }

    /* renamed from: d */
    public static Metadata m27992d(uq6 uq6Var, boolean z) {
        uq6Var.mo40490c();
        long jMo40493g = uq6Var.mo40493g();
        Metadata metadataM27991c = m27991c(uq6Var, z);
        uq6Var.mo40496k((int) (uq6Var.mo40493g() - jMo40493g));
        return metadataM27991c;
    }

    /* renamed from: e */
    public static boolean m27993e(uq6 uq6Var, C13613a c13613a) {
        uq6Var.mo40490c();
        ywc ywcVar = new ywc(new byte[4]);
        uq6Var.mo40498m(ywcVar.f56210a, 0, 4);
        boolean zM58443g = ywcVar.m58443g();
        int iM58444h = ywcVar.m58444h(7);
        int iM58444h2 = ywcVar.m58444h(24) + 4;
        if (iM58444h == 0) {
            c13613a.f24481a = m27996h(uq6Var);
        } else {
            j27 j27Var = c13613a.f24481a;
            if (j27Var == null) {
                throw new IllegalArgumentException();
            }
            if (iM58444h == 3) {
                c13613a.f24481a = j27Var.m33090b(m27994f(uq6Var, iM58444h2));
            } else if (iM58444h == 4) {
                c13613a.f24481a = j27Var.m33091c(m27998j(uq6Var, iM58444h2));
            } else if (iM58444h == 6) {
                zwc zwcVar = new zwc(iM58444h2);
                uq6Var.readFully(zwcVar.m60024e(), 0, iM58444h2);
                zwcVar.m60018V(4);
                c13613a.f24481a = j27Var.m33089a(nf8.m40500F(PictureFrame.m7537a(zwcVar)));
            } else {
                uq6Var.mo40496k(iM58444h2);
            }
        }
        return zM58443g;
    }

    /* renamed from: f */
    public static j27.C14432a m27994f(uq6 uq6Var, int i) {
        zwc zwcVar = new zwc(i);
        uq6Var.readFully(zwcVar.m60024e(), 0, i);
        return m27995g(zwcVar);
    }

    /* renamed from: g */
    public static j27.C14432a m27995g(zwc zwcVar) {
        zwcVar.m60018V(1);
        int iM60007K = zwcVar.m60007K();
        long jM60025f = zwcVar.m60025f() + iM60007K;
        int i = iM60007K / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jM59997A = zwcVar.m59997A();
            if (jM59997A == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM59997A;
            jArrCopyOf2[i2] = zwcVar.m59997A();
            zwcVar.m60018V(2);
            i2++;
        }
        zwcVar.m60018V((int) (jM60025f - zwcVar.m60025f()));
        return new j27.C14432a(jArrCopyOf, jArrCopyOf2);
    }

    /* renamed from: h */
    public static j27 m27996h(uq6 uq6Var) {
        byte[] bArr = new byte[38];
        uq6Var.readFully(bArr, 0, 38);
        return new j27(bArr, 4);
    }

    /* renamed from: i */
    public static void m27997i(uq6 uq6Var) throws byc {
        zwc zwcVar = new zwc(4);
        uq6Var.readFully(zwcVar.m60024e(), 0, 4);
        if (zwcVar.m60006J() != 1716281667) {
            throw byc.m19921a("Failed to read FLAC stream marker.", null);
        }
    }

    /* renamed from: j */
    public static List m27998j(uq6 uq6Var, int i) {
        zwc zwcVar = new zwc(i);
        uq6Var.readFully(zwcVar.m60024e(), 0, i);
        zwcVar.m60018V(4);
        return Arrays.asList(p2j.m42932k(zwcVar, false, false).f39256b);
    }
}
