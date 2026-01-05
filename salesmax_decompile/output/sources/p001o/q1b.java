package p001o;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.C2181a;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class q1b {

    /* renamed from: a */
    public final String f41088a;

    /* renamed from: b */
    public final String f41089b;

    /* renamed from: c */
    public final String f41090c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f41091d;

    /* renamed from: e */
    public final boolean f41092e;

    /* renamed from: f */
    public final boolean f41093f;

    /* renamed from: g */
    public final boolean f41094g;

    /* renamed from: h */
    public final boolean f41095h;

    /* renamed from: i */
    public final boolean f41096i;

    /* renamed from: j */
    public final boolean f41097j;

    /* renamed from: k */
    public final boolean f41098k;

    public q1b(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f41088a = (String) op0.m42515e(str);
        this.f41089b = str2;
        this.f41090c = str3;
        this.f41091d = codecCapabilities;
        this.f41095h = z;
        this.f41096i = z2;
        this.f41097j = z3;
        this.f41092e = z4;
        this.f41093f = z5;
        this.f41094g = z6;
        this.f41098k = xeb.m56189q(str2);
    }

    /* renamed from: A */
    public static boolean m44674A(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = sqi.f45791b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m44675B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(sqi.f45791b)) ? false : true;
    }

    /* renamed from: C */
    public static q1b m44676C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new q1b(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !m44681h(codecCapabilities) || m44688z(str)) ? false : true, codecCapabilities != null && m44684s(codecCapabilities), z5 || (codecCapabilities != null && m44682q(codecCapabilities)));
    }

    /* renamed from: a */
    public static int m44677a(String str, String str2, int i) {
        if (i > 1 || ((sqi.f45790a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        ria.m46824h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: c */
    public static Point m44678c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(sqi.m48731j(i, widthAlignment) * widthAlignment, sqi.m48731j(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    public static boolean m44679d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM44678c = m44678c(videoCapabilities, i, i2);
        int i3 = pointM44678c.x;
        int i4 = pointM44678c.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: f */
    public static MediaCodecInfo.CodecProfileLevel[] m44680f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    public static boolean m44681h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: q */
    public static boolean m44682q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sqi.f45790a >= 21 && m44683r(codecCapabilities);
    }

    /* renamed from: r */
    public static boolean m44683r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: s */
    public static boolean m44684s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sqi.f45790a >= 21 && m44685t(codecCapabilities);
    }

    /* renamed from: t */
    public static boolean m44685t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: x */
    public static boolean m44686x(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: y */
    public static boolean m44687y(String str) {
        return sqi.f45793d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: z */
    public static boolean m44688z(String str) {
        if (sqi.f45790a <= 22) {
            String str2 = sqi.f45793d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Point m44689b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f41091d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m44678c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public c85 m44690e(C2181a c2181a, C2181a c2181a2) {
        int i = !sqi.m48724c(c2181a.f7943n, c2181a2.f7943n) ? 8 : 0;
        if (this.f41098k) {
            if (c2181a.f7952w != c2181a2.f7952w) {
                i |= 1024;
            }
            if (!this.f41092e && (c2181a.f7949t != c2181a2.f7949t || c2181a.f7950u != c2181a2.f7950u)) {
                i |= 512;
            }
            if ((!ph3.m43660h(c2181a.f7918A) || !ph3.m43660h(c2181a2.f7918A)) && !sqi.m48724c(c2181a.f7918A, c2181a2.f7918A)) {
                i |= 2048;
            }
            if (m44687y(this.f41088a) && !c2181a.m6710e(c2181a2)) {
                i |= 2;
            }
            if (i == 0) {
                return new c85(this.f41088a, c2181a, c2181a2, c2181a.m6710e(c2181a2) ? 3 : 2, 0);
            }
        } else {
            if (c2181a.f7919B != c2181a2.f7919B) {
                i |= 4096;
            }
            if (c2181a.f7920C != c2181a2.f7920C) {
                i |= 8192;
            }
            if (c2181a.f7921D != c2181a2.f7921D) {
                i |= Opcodes.ACC_ENUM;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f41089b)) {
                Pair pairM33134r = j2b.m33134r(c2181a);
                Pair pairM33134r2 = j2b.m33134r(c2181a2);
                if (pairM33134r != null && pairM33134r2 != null) {
                    int iIntValue = ((Integer) pairM33134r.first).intValue();
                    int iIntValue2 = ((Integer) pairM33134r2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new c85(this.f41088a, c2181a, c2181a2, 3, 0);
                    }
                }
            }
            if (!c2181a.m6710e(c2181a2)) {
                i |= 32;
            }
            if (m44686x(this.f41089b)) {
                i |= 2;
            }
            if (i == 0) {
                return new c85(this.f41088a, c2181a, c2181a2, 1, 0);
            }
        }
        return new c85(this.f41088a, c2181a, c2181a2, 0, i);
    }

    /* renamed from: g */
    public MediaCodecInfo.CodecProfileLevel[] m44691g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f41091d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: i */
    public boolean m44692i(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f41091d;
        if (codecCapabilities == null) {
            m44702w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m44702w("channelCount.aCaps");
            return false;
        }
        if (m44677a(this.f41088a, this.f41089b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        m44702w("channelCount.support, " + i);
        return false;
    }

    /* renamed from: j */
    public boolean m44693j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f41091d;
        if (codecCapabilities == null) {
            m44702w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m44702w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        m44702w("sampleRate.support, " + i);
        return false;
    }

    /* renamed from: k */
    public final boolean m44694k(C2181a c2181a, boolean z) {
        Pair pairM33134r = j2b.m33134r(c2181a);
        if (pairM33134r == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM33134r.first).intValue();
        int iIntValue2 = ((Integer) pairM33134r.second).intValue();
        if ("video/dolby-vision".equals(c2181a.f7943n)) {
            if (!"video/avc".equals(this.f41089b)) {
                iIntValue = "video/hevc".equals(this.f41089b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f41098k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM44691g = m44691g();
        if (sqi.f45790a <= 23 && "video/x-vnd.on2.vp9".equals(this.f41089b) && codecProfileLevelArrM44691g.length == 0) {
            codecProfileLevelArrM44691g = m44680f(this.f41091d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrM44691g) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !m44674A(this.f41089b, iIntValue))) {
                return true;
            }
        }
        m44702w("codec.profileLevel, " + c2181a.f7939j + ", " + this.f41090c);
        return false;
    }

    /* renamed from: l */
    public boolean m44695l(C2181a c2181a) {
        return m44698o(c2181a) && m44694k(c2181a, false);
    }

    /* renamed from: m */
    public boolean m44696m(C2181a c2181a) {
        int i;
        if (!m44698o(c2181a) || !m44694k(c2181a, true)) {
            return false;
        }
        if (!this.f41098k) {
            if (sqi.f45790a >= 21) {
                int i2 = c2181a.f7920C;
                if (i2 != -1 && !m44693j(i2)) {
                    return false;
                }
                int i3 = c2181a.f7919B;
                if (i3 != -1 && !m44692i(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = c2181a.f7949t;
        if (i4 <= 0 || (i = c2181a.f7950u) <= 0) {
            return true;
        }
        if (sqi.f45790a >= 21) {
            return m44700u(i4, i, c2181a.f7951v);
        }
        boolean z = i4 * i <= j2b.m33112P();
        if (!z) {
            m44702w("legacyFrameSize, " + c2181a.f7949t + "x" + c2181a.f7950u);
        }
        return z;
    }

    /* renamed from: n */
    public boolean m44697n() {
        if (sqi.f45790a >= 29 && "video/x-vnd.on2.vp9".equals(this.f41089b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m44691g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m44698o(C2181a c2181a) {
        return this.f41089b.equals(c2181a.f7943n) || this.f41089b.equals(j2b.m33129m(c2181a));
    }

    /* renamed from: p */
    public boolean m44699p(C2181a c2181a) {
        if (this.f41098k) {
            return this.f41092e;
        }
        Pair pairM33134r = j2b.m33134r(c2181a);
        return pairM33134r != null && ((Integer) pairM33134r.first).intValue() == 42;
    }

    public String toString() {
        return this.f41088a;
    }

    /* renamed from: u */
    public boolean m44700u(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f41091d;
        if (codecCapabilities == null) {
            m44702w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m44702w("sizeAndRate.vCaps");
            return false;
        }
        if (sqi.f45790a >= 29) {
            int iM53795c = w1b.m53795c(videoCapabilities, i, i2, d);
            if (iM53795c == 2) {
                return true;
            }
            if (iM53795c == 1) {
                m44702w("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!m44679d(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !m44675B(this.f41088a) || !m44679d(videoCapabilities, i2, i, d)) {
                m44702w("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            m44701v("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    /* renamed from: v */
    public final void m44701v(String str) {
        ria.m46818b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f41088a + ", " + this.f41089b + "] [" + sqi.f45794e + "]");
    }

    /* renamed from: w */
    public final void m44702w(String str) {
        ria.m46818b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f41088a + ", " + this.f41089b + "] [" + sqi.f45794e + "]");
    }
}
