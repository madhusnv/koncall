package p001o;

import android.media.MediaCodecInfo;
import androidx.media3.common.C2181a;
import java.util.List;
import p001o.j2b;

/* loaded from: classes2.dex */
public abstract class w1b {

    /* renamed from: a */
    public static Boolean f51293a;

    /* renamed from: o.w1b$a */
    public static final class C17741a {
        /* renamed from: a */
        public static int m53796a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            s1b.m47447a();
            int iM53797b = m53797b(supportedPerformancePoints, r1b.m46046a(i, i2, (int) d));
            if (iM53797b == 1 && w1b.f51293a == null) {
                Boolean unused = w1b.f51293a = Boolean.valueOf(m53798c());
                if (w1b.f51293a.booleanValue()) {
                    return 0;
                }
            }
            return iM53797b;
        }

        /* renamed from: b */
        public static int m53797b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (u1b.m50846a(list.get(i)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        /* renamed from: c */
        public static boolean m53798c() {
            List supportedPerformancePoints;
            if (sqi.f45790a >= 35) {
                return false;
            }
            try {
                C2181a c2181aM6748K = new C2181a.b().o0("video/avc").m6748K();
                if (c2181aM6748K.f7943n != null) {
                    List listM33138v = j2b.m33138v(a2b.f14065a, c2181aM6748K, false, false);
                    for (int i = 0; i < listM33138v.size(); i++) {
                        if (((q1b) listM33138v.get(i)).f41091d != null && ((q1b) listM33138v.get(i)).f41091d.getVideoCapabilities() != null && (supportedPerformancePoints = ((q1b) listM33138v.get(i)).f41091d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            s1b.m47447a();
                            return m53797b(supportedPerformancePoints, r1b.m46046a(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (j2b.C14435c unused) {
            }
            return true;
        }
    }

    /* renamed from: c */
    public static int m53795c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (sqi.f45790a < 29) {
            return 0;
        }
        Boolean bool = f51293a;
        if (bool == null || !bool.booleanValue()) {
            return C17741a.m53796a(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
