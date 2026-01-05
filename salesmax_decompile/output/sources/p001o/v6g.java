package p001o;

import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public final class v6g implements x61 {

    /* renamed from: a */
    public final C2181a f49925a;

    public v6g(C2181a c2181a) {
        this.f49925a = c2181a;
    }

    /* renamed from: a */
    public static String m52358a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m52359b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: c */
    public static x61 m52360c(zwc zwcVar) {
        zwcVar.m60018V(4);
        int iM60040u = zwcVar.m60040u();
        int iM60040u2 = zwcVar.m60040u();
        zwcVar.m60018V(4);
        int iM60040u3 = zwcVar.m60040u();
        String strM52358a = m52358a(iM60040u3);
        if (strM52358a != null) {
            C2181a.b bVar = new C2181a.b();
            bVar.v0(iM60040u).m6762Y(iM60040u2).o0(strM52358a);
            return new v6g(bVar.m6748K());
        }
        ria.m46824h("StreamFormatChunk", "Ignoring track with unsupported compression " + iM60040u3);
        return null;
    }

    /* renamed from: d */
    public static x61 m52361d(int i, zwc zwcVar) {
        if (i == 2) {
            return m52360c(zwcVar);
        }
        if (i == 1) {
            return m52362e(zwcVar);
        }
        ria.m46824h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + sqi.s0(i));
        return null;
    }

    /* renamed from: e */
    public static x61 m52362e(zwc zwcVar) {
        int iM60045z = zwcVar.m60045z();
        String strM52359b = m52359b(iM60045z);
        if (strM52359b == null) {
            ria.m46824h("StreamFormatChunk", "Ignoring track with unsupported format tag " + iM60045z);
            return null;
        }
        int iM60045z2 = zwcVar.m60045z();
        int iM60040u = zwcVar.m60040u();
        zwcVar.m60018V(6);
        int iG0 = sqi.g0(zwcVar.m60045z());
        int iM60045z3 = zwcVar.m60020a() > 0 ? zwcVar.m60045z() : 0;
        byte[] bArr = new byte[iM60045z3];
        zwcVar.m60031l(bArr, 0, iM60045z3);
        C2181a.b bVar = new C2181a.b();
        bVar.o0(strM52359b).m6751N(iM60045z2).p0(iM60040u);
        if ("audio/raw".equals(strM52359b) && iG0 != 0) {
            bVar.i0(iG0);
        }
        if ("audio/mp4a-latm".equals(strM52359b) && iM60045z3 > 0) {
            bVar.b0(nf8.m40500F(bArr));
        }
        return new v6g(bVar.m6748K());
    }

    @Override // p001o.x61
    public int getType() {
        return 1718776947;
    }
}
