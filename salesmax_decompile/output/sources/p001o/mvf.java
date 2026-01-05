package p001o;

import android.util.Size;
import com.onesignal.core.internal.config.InfluenceConfigModel;

/* loaded from: classes2.dex */
public abstract class mvf {

    /* renamed from: a */
    public static final Size f36038a = new Size(0, 0);

    /* renamed from: b */
    public static final Size f36039b = new Size(320, 240);

    /* renamed from: c */
    public static final Size f36040c = new Size(640, 480);

    /* renamed from: d */
    public static final Size f36041d = new Size(720, 480);

    /* renamed from: e */
    public static final Size f36042e = new Size(1280, 720);

    /* renamed from: f */
    public static final Size f36043f = new Size(1920, 1080);

    /* renamed from: g */
    public static final Size f36044g = new Size(1920, InfluenceConfigModel.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);

    /* renamed from: a */
    public static int m39725a(int i, int i2) {
        return i * i2;
    }

    /* renamed from: b */
    public static int m39726b(Size size) {
        return m39725a(size.getWidth(), size.getHeight());
    }

    /* renamed from: c */
    public static boolean m39727c(Size size, Size size2) {
        return m39726b(size) < m39726b(size2);
    }
}
