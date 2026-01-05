package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class s82 {

    /* renamed from: b */
    public final InterfaceC16767a f44918b;

    /* renamed from: c */
    public final String f44919c;

    /* renamed from: a */
    public final Map f44917a = new HashMap();

    /* renamed from: d */
    public q6g f44920d = null;

    /* renamed from: o.s82$a */
    public interface InterfaceC16767a {
        /* renamed from: a */
        Object mo44959a(CameraCharacteristics.Key key);
    }

    public s82(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f44918b = new p82(cameraCharacteristics);
        } else {
            this.f44918b = new q82(cameraCharacteristics);
        }
        this.f44919c = str;
    }

    /* renamed from: e */
    public static s82 m47964e(CameraCharacteristics cameraCharacteristics, String str) {
        return new s82(cameraCharacteristics, str);
    }

    /* renamed from: a */
    public Object m47965a(CameraCharacteristics.Key key) {
        if (m47967c(key)) {
            return this.f44918b.mo44959a(key);
        }
        synchronized (this) {
            Object obj = this.f44917a.get(key);
            if (obj != null) {
                return obj;
            }
            Object objMo44959a = this.f44918b.mo44959a(key);
            if (objMo44959a != null) {
                this.f44917a.put(key, objMo44959a);
            }
            return objMo44959a;
        }
    }

    /* renamed from: b */
    public q6g m47966b() {
        if (this.f44920d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m47965a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f44920d = q6g.m44874e(streamConfigurationMap, new lgc(this.f44919c));
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f44920d;
    }

    /* renamed from: c */
    public final boolean m47967c(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: d */
    public boolean m47968d() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f44918b.mo44959a(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
