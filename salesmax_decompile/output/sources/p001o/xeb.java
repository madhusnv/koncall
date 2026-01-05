package p001o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class xeb {

    /* renamed from: a */
    public static final ArrayList f53648a = new ArrayList();

    /* renamed from: b */
    public static final Pattern f53649b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: o.xeb$a */
    public static final class C18129a {

        /* renamed from: a */
        public final int f53650a;

        /* renamed from: b */
        public final int f53651b;

        public C18129a(int i, int i2) {
            this.f53650a = i;
            this.f53651b = i2;
        }

        /* renamed from: a */
        public int m56191a() {
            int i = this.f53651b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m56173a(String str, String str2) {
        C18129a c18129aM56179g;
        int iM56191a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (c18129aM56179g = m56179g(str2)) != null && (iM56191a = c18129aM56179g.m56191a()) != 0 && iM56191a != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    /* renamed from: b */
    public static String m56174b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sqi.k1(str)) {
            String strM56177e = m56177e(str2);
            if (strM56177e != null && m56185m(strM56177e)) {
                return strM56177e;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m56175c(String str) {
        ArrayList arrayList = f53648a;
        if (arrayList.size() <= 0) {
            return null;
        }
        tq.m50332a(arrayList.get(0));
        throw null;
    }

    /* renamed from: d */
    public static int m56176d(String str, String str2) {
        C18129a c18129aM56179g;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c18129aM56179g = m56179g(str2)) == null) {
                    return 0;
                }
                return c18129aM56179g.m56191a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public static String m56177e(String str) {
        C18129a c18129aM56179g;
        String strM56178f = null;
        if (str == null) {
            return null;
        }
        String strM35995e = kp0.m35995e(str.trim());
        if (strM35995e.startsWith("avc1") || strM35995e.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM35995e.startsWith("hev1") || strM35995e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM35995e.startsWith("dvav") || strM35995e.startsWith("dva1") || strM35995e.startsWith("dvhe") || strM35995e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM35995e.startsWith("av01")) {
            return "video/av01";
        }
        if (strM35995e.startsWith("vp9") || strM35995e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM35995e.startsWith("vp8") || strM35995e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strM35995e.startsWith("mp4a")) {
            return strM35995e.startsWith("mha1") ? "audio/mha1" : strM35995e.startsWith("mhm1") ? "audio/mhm1" : (strM35995e.startsWith("ac-3") || strM35995e.startsWith("dac3")) ? "audio/ac3" : (strM35995e.startsWith("ec-3") || strM35995e.startsWith("dec3")) ? "audio/eac3" : strM35995e.startsWith("ec+3") ? "audio/eac3-joc" : (strM35995e.startsWith("ac-4") || strM35995e.startsWith("dac4")) ? "audio/ac4" : strM35995e.startsWith("dtsc") ? "audio/vnd.dts" : strM35995e.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strM35995e.startsWith("dtsh") || strM35995e.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strM35995e.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strM35995e.startsWith("opus") ? "audio/opus" : strM35995e.startsWith("vorbis") ? "audio/vorbis" : strM35995e.startsWith("flac") ? "audio/flac" : strM35995e.startsWith("stpp") ? "application/ttml+xml" : strM35995e.startsWith("wvtt") ? "text/vtt" : strM35995e.contains("cea708") ? "application/cea-708" : (strM35995e.contains("eia608") || strM35995e.contains("cea608")) ? "application/cea-608" : m56175c(strM35995e);
        }
        if (strM35995e.startsWith("mp4a.") && (c18129aM56179g = m56179g(strM35995e)) != null) {
            strM56178f = m56178f(c18129aM56179g.f53650a);
        }
        return strM56178f == null ? "audio/mp4a-latm" : strM56178f;
    }

    /* renamed from: f */
    public static String m56178f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case Opcodes.LADD /* 97 */:
            case Opcodes.FADD /* 98 */:
            case Opcodes.DADD /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case Opcodes.DMUL /* 107 */:
                return "audio/mpeg";
            case Opcodes.FMUL /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case Opcodes.RET /* 169 */:
                    case Opcodes.IRETURN /* 172 */:
                        return "audio/vnd.dts";
                    case Opcodes.TABLESWITCH /* 170 */:
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return "audio/vnd.dts.hd";
                    case Opcodes.LRETURN /* 173 */:
                        return "audio/opus";
                    case Opcodes.FRETURN /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: g */
    public static C18129a m56179g(String str) {
        Matcher matcher = f53649b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) op0.m42515e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new C18129a(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m56180h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* renamed from: i */
    public static int m56181i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m56185m(str)) {
            return 1;
        }
        if (m56189q(str)) {
            return 2;
        }
        if (m56188p(str)) {
            return 3;
        }
        if (m56186n(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m56182j(str);
    }

    /* renamed from: j */
    public static int m56182j(String str) {
        ArrayList arrayList = f53648a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        tq.m50332a(arrayList.get(0));
        throw null;
    }

    /* renamed from: k */
    public static int m56183k(String str) {
        return m56181i(m56177e(str));
    }

    /* renamed from: l */
    public static String m56184l(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sqi.k1(str)) {
            String strM56177e = m56177e(str2);
            if (strM56177e != null && m56189q(strM56177e)) {
                return strM56177e;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m56185m(String str) {
        return "audio".equals(m56180h(str));
    }

    /* renamed from: n */
    public static boolean m56186n(String str) {
        return "image".equals(m56180h(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: o */
    public static boolean m56187o(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: p */
    public static boolean m56188p(String str) {
        return "text".equals(m56180h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: q */
    public static boolean m56189q(String str) {
        return "video".equals(m56180h(str));
    }

    /* renamed from: r */
    public static String m56190r(String str) {
        String strM35995e;
        if (str == null) {
            return null;
        }
        strM35995e = kp0.m35995e(str);
        strM35995e.hashCode();
        switch (strM35995e) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM35995e;
        }
    }
}
