package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import com.onesignal.core.internal.config.InfluenceConfigModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.j5e;
import p001o.wja;

/* loaded from: classes2.dex */
public class ExcludedSupportedSizesQuirk implements j5e {
    /* renamed from: j */
    public static boolean m4538j() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: k */
    public static boolean m4539k() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: l */
    public static boolean m4540l() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: m */
    public static boolean m4541m() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: n */
    public static boolean m4542n() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: o */
    public static boolean m4543o() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: p */
    public static boolean m4544p() {
        return m4539k() || m4540l() || m4538j() || m4543o() || m4542n() || m4541m();
    }

    /* renamed from: c */
    public List m4545c(String str, int i) {
        if (m4539k()) {
            return m4547e(str, i);
        }
        if (m4540l()) {
            return m4548f(str, i);
        }
        if (m4538j()) {
            return m4546d(str, i, null);
        }
        if (m4543o()) {
            return m4551i(str, i, null);
        }
        if (m4542n()) {
            return m4550h(str, i, null);
        }
        if (m4541m()) {
            return m4549g(str, i);
        }
        wja.m54638l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    /* renamed from: d */
    public final List m4546d(String str, int i, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List m4547e(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m4548f(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List m4549g(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List m4550h(String str, int i, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, InfluenceConfigModel.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List m4551i(String str, int i, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }
}
