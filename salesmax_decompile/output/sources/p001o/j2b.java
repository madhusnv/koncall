package p001o;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C2181a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class j2b {

    /* renamed from: a */
    public static final Pattern f29633a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap f29634b = new HashMap();

    /* renamed from: c */
    public static int f29635c = -1;

    /* renamed from: o.j2b$b */
    public static final class C14434b {

        /* renamed from: a */
        public final String f29636a;

        /* renamed from: b */
        public final boolean f29637b;

        /* renamed from: c */
        public final boolean f29638c;

        public C14434b(String str, boolean z, boolean z2) {
            this.f29636a = str;
            this.f29637b = z;
            this.f29638c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C14434b.class) {
                return false;
            }
            C14434b c14434b = (C14434b) obj;
            return TextUtils.equals(this.f29636a, c14434b.f29636a) && this.f29637b == c14434b.f29637b && this.f29638c == c14434b.f29638c;
        }

        public int hashCode() {
            return ((((this.f29636a.hashCode() + 31) * 31) + (this.f29637b ? 1231 : 1237)) * 31) + (this.f29638c ? 1231 : 1237);
        }
    }

    /* renamed from: o.j2b$c */
    public static class C14435c extends Exception {
        public C14435c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: o.j2b$d */
    public interface InterfaceC14436d {
        /* renamed from: a */
        MediaCodecInfo mo33143a(int i);

        /* renamed from: b */
        boolean mo33144b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo33145c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo33146d();

        /* renamed from: e */
        boolean mo33147e();
    }

    /* renamed from: o.j2b$e */
    public static final class C14437e implements InterfaceC14436d {
        public C14437e() {
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: a */
        public MediaCodecInfo mo33143a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: b */
        public boolean mo33144b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: c */
        public boolean mo33145c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: d */
        public int mo33146d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: e */
        public boolean mo33147e() {
            return false;
        }
    }

    /* renamed from: o.j2b$f */
    public static final class C14438f implements InterfaceC14436d {

        /* renamed from: a */
        public final int f29639a;

        /* renamed from: b */
        public MediaCodecInfo[] f29640b;

        public C14438f(boolean z, boolean z2) {
            this.f29639a = (z || z2) ? 1 : 0;
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: a */
        public MediaCodecInfo mo33143a(int i) {
            m33148f();
            return this.f29640b[i];
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: b */
        public boolean mo33144b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: c */
        public boolean mo33145c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: d */
        public int mo33146d() {
            m33148f();
            return this.f29640b.length;
        }

        @Override // p001o.j2b.InterfaceC14436d
        /* renamed from: e */
        public boolean mo33147e() {
            return true;
        }

        /* renamed from: f */
        public final void m33148f() {
            if (this.f29640b == null) {
                this.f29640b = new MediaCodecList(this.f29639a).getCodecInfos();
            }
        }
    }

    /* renamed from: o.j2b$g */
    public interface InterfaceC14439g {
        /* renamed from: a */
        int mo26011a(Object obj);
    }

    /* renamed from: A */
    public static Pair m33097A(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iM33116T = m33116T(i);
            if (iM33116T == -1) {
                ria.m46824h("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iM33115S = m33115S(i2);
            if (iM33115S != -1) {
                return new Pair(Integer.valueOf(iM33116T), Integer.valueOf(iM33115S));
            }
            ria.m46824h("MediaCodecUtil", "Unknown VP9 level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: B */
    public static Integer m33098B(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
        }
        return null;
    }

    /* renamed from: C */
    public static boolean m33099C(MediaCodecInfo mediaCodecInfo) {
        return sqi.f45790a >= 29 && m33100D(mediaCodecInfo);
    }

    /* renamed from: D */
    public static boolean m33100D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* renamed from: E */
    public static boolean m33101E(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = sqi.f45790a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(sqi.f45792c))) {
            String str3 = sqi.f45791b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(sqi.f45792c)) {
            String str4 = sqi.f45791b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i == 19 && sqi.f45791b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: F */
    public static boolean m33102F(MediaCodecInfo mediaCodecInfo, String str) {
        return sqi.f45790a >= 29 ? m33103G(mediaCodecInfo) : !m33104H(mediaCodecInfo, str);
    }

    /* renamed from: G */
    public static boolean m33103G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: H */
    public static boolean m33104H(MediaCodecInfo mediaCodecInfo, String str) {
        if (sqi.f45790a >= 29) {
            return m33105I(mediaCodecInfo);
        }
        if (xeb.m56185m(str)) {
            return true;
        }
        String strM35995e = kp0.m35995e(mediaCodecInfo.getName());
        if (strM35995e.startsWith("arc.")) {
            return false;
        }
        if (strM35995e.startsWith("omx.google.") || strM35995e.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM35995e.startsWith("omx.sec.") && strM35995e.contains(".sw.")) || strM35995e.equals("omx.qcom.video.decoder.hevcswvdec") || strM35995e.startsWith("c2.android.") || strM35995e.startsWith("c2.google.")) {
            return true;
        }
        return (strM35995e.startsWith("omx.") || strM35995e.startsWith("c2.")) ? false : true;
    }

    /* renamed from: I */
    public static boolean m33105I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: J */
    public static boolean m33106J(MediaCodecInfo mediaCodecInfo) {
        if (sqi.f45790a >= 29) {
            return m33107K(mediaCodecInfo);
        }
        String strM35995e = kp0.m35995e(mediaCodecInfo.getName());
        return (strM35995e.startsWith("omx.google.") || strM35995e.startsWith("c2.android.") || strM35995e.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: K */
    public static boolean m33107K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* renamed from: L */
    public static /* synthetic */ int m33108L(q1b q1bVar) {
        String str = q1bVar.f41088a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (sqi.f45790a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: M */
    public static /* synthetic */ int m33109M(q1b q1bVar) {
        return q1bVar.f41088a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: N */
    public static /* synthetic */ int m33110N(C2181a c2181a, q1b q1bVar) {
        return q1bVar.m44695l(c2181a) ? 1 : 0;
    }

    /* renamed from: O */
    public static /* synthetic */ int m33111O(InterfaceC14439g interfaceC14439g, Object obj, Object obj2) {
        return interfaceC14439g.mo26011a(obj2) - interfaceC14439g.mo26011a(obj);
    }

    /* renamed from: P */
    public static int m33112P() {
        if (f29635c == -1) {
            int iMax = 0;
            q1b q1bVarM33135s = m33135s("video/avc", false, false);
            if (q1bVarM33135s != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM44691g = q1bVarM33135s.m44691g();
                int length = codecProfileLevelArrM44691g.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(m33124h(codecProfileLevelArrM44691g[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, sqi.f45790a >= 21 ? 345600 : 172800);
            }
            f29635c = iMax;
        }
        return f29635c;
    }

    /* renamed from: Q */
    public static int m33113Q(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: R */
    public static void m33114R(List list, final InterfaceC14439g interfaceC14439g) {
        Collections.sort(list, new Comparator() { // from class: o.i2b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j2b.m33111O(interfaceC14439g, obj, obj2);
            }
        });
    }

    /* renamed from: S */
    public static int m33115S(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case Opcodes.V16 /* 60 */:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: T */
    public static int m33116T(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    public static void m33121e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (sqi.f45790a < 26 && sqi.f45791b.equals("R9") && list.size() == 1 && ((q1b) list.get(0)).f41088a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(q1b.m44676C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m33114R(list, new InterfaceC14439g() { // from class: o.g2b
                @Override // p001o.j2b.InterfaceC14439g
                /* renamed from: a */
                public final int mo26011a(Object obj) {
                    return j2b.m33108L((q1b) obj);
                }
            });
        }
        int i = sqi.f45790a;
        if (i < 21 && list.size() > 1) {
            String str2 = ((q1b) list.get(0)).f41088a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m33114R(list, new InterfaceC14439g() { // from class: o.h2b
                    @Override // p001o.j2b.InterfaceC14439g
                    /* renamed from: a */
                    public final int mo26011a(Object obj) {
                        return j2b.m33109M((q1b) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((q1b) list.get(0)).f41088a)) {
            return;
        }
        list.add((q1b) list.remove(0));
    }

    /* renamed from: f */
    public static int m33122f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Opcodes.ACC_ENUM;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return Opcodes.ACC_DEPRECATED;
            case 18:
                return 262144;
            case 19:
                return Opcodes.ASM8;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    public static int m33123g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        return 4096;
                                    case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return Opcodes.ACC_ENUM;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    public static int m33124h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case Opcodes.ACC_ENUM /* 16384 */:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case Opcodes.ACC_DEPRECATED /* 131072 */:
            case 262144:
            case Opcodes.ASM8 /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    public static int m33125i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    public static Integer m33126j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* renamed from: k */
    public static Integer m33127k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* renamed from: l */
    public static Pair m33128l(String str, String[] strArr) {
        int iM33113Q;
        if (strArr.length != 3) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(xeb.m56178f(Integer.parseInt(strArr[1], 16))) && (iM33113Q = m33113Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iM33113Q), 0);
            }
        } catch (NumberFormatException unused) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    public static String m33129m(C2181a c2181a) {
        Pair pairM33134r;
        if ("audio/eac3-joc".equals(c2181a.f7943n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c2181a.f7943n) || (pairM33134r = m33134r(c2181a)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM33134r.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* renamed from: n */
    public static List m33130n(a2b a2bVar, C2181a c2181a, boolean z, boolean z2) {
        String strM33129m = m33129m(c2181a);
        return strM33129m == null ? nf8.m40499E() : a2bVar.mo16365a(strM33129m, z, z2);
    }

    /* renamed from: o */
    public static Pair m33131o(String str, String[] strArr, ph3 ph3Var) throws NumberFormatException {
        int i;
        if (strArr.length < 4) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                ria.m46824h("MediaCodecUtil", "Unknown AV1 profile: " + i2);
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                ria.m46824h("MediaCodecUtil", "Unknown AV1 bit depth: " + i4);
                return null;
            }
            int i5 = i4 != 8 ? (ph3Var == null || !(ph3Var.f40075d != null || (i = ph3Var.f40074c) == 7 || i == 6)) ? 2 : 4096 : 1;
            int iM33122f = m33122f(i3);
            if (iM33122f != -1) {
                return new Pair(Integer.valueOf(i5), Integer.valueOf(iM33122f));
            }
            ria.m46824h("MediaCodecUtil", "Unknown AV1 level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: p */
    public static Pair m33132p(String str, String[] strArr) throws NumberFormatException {
        int i;
        int i2;
        if (strArr.length < 2) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    ria.m46824h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iM33125i = m33125i(i2);
            if (iM33125i == -1) {
                ria.m46824h("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iM33123g = m33123g(i);
            if (iM33123g != -1) {
                return new Pair(Integer.valueOf(iM33125i), Integer.valueOf(iM33123g));
            }
            ria.m46824h("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: q */
    public static String m33133q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m33134r(C2181a c2181a) {
        String str = c2181a.f7939j;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(c2181a.f7943n)) {
            return m33141y(c2181a.f7939j, strArrSplit);
        }
        char c = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    c = 65535;
                    break;
                }
                break;
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 1;
                    break;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 2;
                    break;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 3;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 4;
                    break;
                }
                break;
            case 3356560:
                if (str2.equals("mp4a")) {
                    c = 5;
                    break;
                }
                break;
            case 3624515:
                if (str2.equals("vp09")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m33131o(c2181a.f7939j, strArrSplit, c2181a.f7918A);
            case 1:
            case 2:
                return m33132p(c2181a.f7939j, strArrSplit);
            case 3:
            case 4:
                return m33142z(c2181a.f7939j, strArrSplit, c2181a.f7918A);
            case 5:
                return m33128l(c2181a.f7939j, strArrSplit);
            case 6:
                return m33097A(c2181a.f7939j, strArrSplit);
            default:
                return null;
        }
    }

    /* renamed from: s */
    public static q1b m33135s(String str, boolean z, boolean z2) {
        List listM33136t = m33136t(str, z, z2);
        if (listM33136t.isEmpty()) {
            return null;
        }
        return (q1b) listM33136t.get(0);
    }

    /* renamed from: t */
    public static synchronized List m33136t(String str, boolean z, boolean z2) {
        C14434b c14434b = new C14434b(str, z, z2);
        HashMap map = f29634b;
        List list = (List) map.get(c14434b);
        if (list != null) {
            return list;
        }
        int i = sqi.f45790a;
        ArrayList arrayListM33137u = m33137u(c14434b, i >= 21 ? new C14438f(z, z2) : new C14437e());
        if (z && arrayListM33137u.isEmpty() && 21 <= i && i <= 23) {
            arrayListM33137u = m33137u(c14434b, new C14437e());
            if (!arrayListM33137u.isEmpty()) {
                ria.m46824h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((q1b) arrayListM33137u.get(0)).f41088a);
            }
        }
        m33121e(str, arrayListM33137u);
        nf8 nf8VarM40511y = nf8.m40511y(arrayListM33137u);
        map.put(c14434b, nf8VarM40511y);
        return nf8VarM40511y;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[Catch: Exception -> 0x0150, TRY_ENTER, TryCatch #1 {Exception -> 0x0150, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0121, B:8:0x002d, B:11:0x0038, B:55:0x00fa, B:58:0x0102, B:60:0x0108, B:62:0x012b, B:63:0x014e), top: B:70:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m33137u(C14434b c14434b, InterfaceC14436d interfaceC14436d) throws Exception {
        String strM33133q;
        String str;
        String str2;
        int i;
        boolean z;
        int i2;
        String str3;
        C14434b c14434b2 = c14434b;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = c14434b2.f29636a;
            int iMo33146d = interfaceC14436d.mo33146d();
            boolean zMo33147e = interfaceC14436d.mo33147e();
            int i3 = 0;
            while (i3 < iMo33146d) {
                MediaCodecInfo mediaCodecInfoMo33143a = interfaceC14436d.mo33143a(i3);
                if (m33099C(mediaCodecInfoMo33143a)) {
                    i = i3;
                    z = zMo33147e;
                    i2 = iMo33146d;
                } else {
                    String name = mediaCodecInfoMo33143a.getName();
                    if (m33101E(mediaCodecInfoMo33143a, name, zMo33147e, str4) && (strM33133q = m33133q(mediaCodecInfoMo33143a, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo33143a.getCapabilitiesForType(strM33133q);
                            boolean zMo33144b = interfaceC14436d.mo33144b("tunneled-playback", strM33133q, capabilitiesForType);
                            boolean zMo33145c = interfaceC14436d.mo33145c("tunneled-playback", strM33133q, capabilitiesForType);
                            boolean z2 = c14434b2.f29638c;
                            if ((z2 || !zMo33145c) && (!z2 || zMo33144b)) {
                                boolean zMo33144b2 = interfaceC14436d.mo33144b("secure-playback", strM33133q, capabilitiesForType);
                                boolean zMo33145c2 = interfaceC14436d.mo33145c("secure-playback", strM33133q, capabilitiesForType);
                                boolean z3 = c14434b2.f29637b;
                                if ((z3 || !zMo33145c2) && (!z3 || zMo33144b2)) {
                                    boolean zM33102F = m33102F(mediaCodecInfoMo33143a, str4);
                                    boolean zM33104H = m33104H(mediaCodecInfoMo33143a, str4);
                                    boolean zM33106J = m33106J(mediaCodecInfoMo33143a);
                                    if (!zMo33147e || c14434b2.f29637b != zMo33144b2) {
                                        if (!zMo33147e) {
                                            try {
                                                if (!c14434b2.f29637b) {
                                                    str = strM33133q;
                                                    str3 = name;
                                                    i = i3;
                                                    z = zMo33147e;
                                                    i2 = iMo33146d;
                                                    try {
                                                        arrayList.add(q1b.m44676C(name, str4, strM33133q, capabilitiesForType, zM33102F, zM33104H, zM33106J, false, false));
                                                    } catch (Exception e) {
                                                        e = e;
                                                        str2 = str3;
                                                        if (sqi.f45790a > 23) {
                                                        }
                                                        ria.m46819c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                str = strM33133q;
                                                str3 = name;
                                                i = i3;
                                                z = zMo33147e;
                                                i2 = iMo33146d;
                                                str2 = str3;
                                                if (sqi.f45790a > 23) {
                                                }
                                                ria.m46819c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                        str = strM33133q;
                                        i = i3;
                                        z = zMo33147e;
                                        i2 = iMo33146d;
                                        if (!z && zMo33144b2) {
                                            StringBuilder sb = new StringBuilder();
                                            try {
                                                sb.append(name);
                                                sb.append(".secure");
                                                str2 = name;
                                            } catch (Exception e3) {
                                                e = e3;
                                                str2 = name;
                                            }
                                            try {
                                                arrayList.add(q1b.m44676C(sb.toString(), str4, str, capabilitiesForType, zM33102F, zM33104H, zM33106J, false, true));
                                                return arrayList;
                                            } catch (Exception e4) {
                                                e = e4;
                                                if (sqi.f45790a > 23 || arrayList.isEmpty()) {
                                                    ria.m46819c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                ria.m46819c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i3 = i + 1;
                                                c14434b2 = c14434b;
                                                iMo33146d = i2;
                                                zMo33147e = z;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = strM33133q;
                            str2 = name;
                            i = i3;
                            z = zMo33147e;
                            i2 = iMo33146d;
                        }
                    }
                }
                i3 = i + 1;
                c14434b2 = c14434b;
                iMo33146d = i2;
                zMo33147e = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new C14435c(e6);
        }
    }

    /* renamed from: v */
    public static List m33138v(a2b a2bVar, C2181a c2181a, boolean z, boolean z2) {
        List listMo16365a = a2bVar.mo16365a(c2181a.f7943n, z, z2);
        return nf8.m40508q().m40519j(listMo16365a).m40519j(m33130n(a2bVar, c2181a, z, z2)).m40520k();
    }

    /* renamed from: w */
    public static List m33139w(List list, final C2181a c2181a) {
        ArrayList arrayList = new ArrayList(list);
        m33114R(arrayList, new InterfaceC14439g() { // from class: o.f2b
            @Override // p001o.j2b.InterfaceC14439g
            /* renamed from: a */
            public final int mo26011a(Object obj) {
                return j2b.m33110N(c2181a, (q1b) obj);
            }
        });
        return arrayList;
    }

    /* renamed from: x */
    public static q1b m33140x() {
        return m33135s("audio/raw", false, false);
    }

    /* renamed from: y */
    public static Pair m33141y(String str, String[] strArr) {
        if (strArr.length < 3) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f29633a.matcher(strArr[1]);
        if (!matcher.matches()) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM33127k = m33127k(strGroup);
        if (numM33127k == null) {
            ria.m46824h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numM33126j = m33126j(str2);
        if (numM33126j != null) {
            return new Pair(numM33127k, numM33126j);
        }
        ria.m46824h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    /* renamed from: z */
    public static Pair m33142z(String str, String[] strArr, ph3 ph3Var) {
        if (strArr.length < 4) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f29633a.matcher(strArr[1]);
        if (!matcher.matches()) {
            ria.m46824h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                ria.m46824h("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = (ph3Var == null || ph3Var.f40074c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numM33098B = m33098B(str2);
        if (numM33098B != null) {
            return new Pair(Integer.valueOf(i), numM33098B);
        }
        ria.m46824h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
