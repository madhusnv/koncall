package p021w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import c9.C0910e;
import java.util.HashMap;
import uf.C7427b;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.i */
/* loaded from: classes.dex */
public final class C7843i {

    /* renamed from: b */
    public final C7427b f37608b;

    /* renamed from: c */
    public final String f37609c;

    /* renamed from: a */
    public final HashMap f37607a = new HashMap();

    /* renamed from: d */
    public C7439j f37610d = null;

    public C7843i(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f37608b = new C7842h(7, cameraCharacteristics);
        } else {
            this.f37608b = new C7427b(7, cameraCharacteristics);
        }
        this.f37609c = str;
    }

    /* renamed from: a */
    public final Object m14823a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f37608b.f35231b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f37607a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f37608b.f35231b).get(key);
                if (obj2 != null) {
                    this.f37607a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final int m14824b() {
        Integer num = (!m14826d() || Build.VERSION.SDK_INT < 35) ? null : (Integer) m14823a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final C7439j m14825c() {
        if (this.f37610d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m14823a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f37610d = new C7439j(streamConfigurationMap, new C0910e(this.f37609c));
            } catch (AssertionError | NullPointerException e2) {
                throw new IllegalArgumentException(e2.getMessage());
            }
        }
        return this.f37610d;
    }

    /* renamed from: d */
    public final boolean m14826d() {
        Boolean bool = (Boolean) m14823a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: e */
    public final boolean m14827e() {
        int i10;
        if (!m14826d() || (i10 = Build.VERSION.SDK_INT) < 35) {
            return false;
        }
        Integer num = (!m14826d() || i10 < 35) ? null : (Integer) m14823a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return (num == null ? 1 : num.intValue()) > 1;
    }

    /* renamed from: f */
    public final boolean m14828f() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) this.f37608b.f35231b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
