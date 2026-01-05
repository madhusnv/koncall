package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class fn7 {
    /* renamed from: a */
    public static float m27123a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m27124b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m27125c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float f3 = ((i >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float f4 = ((i >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float f5 = ((i2 >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float f6 = ((i2 >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float f7 = ((i2 >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float fM27123a = m27123a(f3);
        float fM27123a2 = m27123a(f4);
        float fM27123a3 = m27123a((i & Constants.MAX_HOST_LENGTH) / 255.0f);
        float fM27123a4 = m27123a(f6);
        float f8 = f2 + ((f5 - f2) * f);
        float fM27123a5 = fM27123a2 + ((m27123a(f7) - fM27123a2) * f);
        float fM27123a6 = fM27123a3 + (f * (m27123a((i2 & Constants.MAX_HOST_LENGTH) / 255.0f) - fM27123a3));
        return (Math.round(m27124b(fM27123a + ((fM27123a4 - fM27123a) * f)) * 255.0f) << 16) | (Math.round(f8 * 255.0f) << 24) | (Math.round(m27124b(fM27123a5) * 255.0f) << 8) | Math.round(m27124b(fM27123a6) * 255.0f);
    }
}
