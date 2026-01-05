package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import d7.g0;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AdvancedSessionProcessor$ExtensionMetadataMonitor {
    private final g0 mCurrentExtensionTypeLiveData;
    private final g0 mExtensionStrengthLiveData;

    public AdvancedSessionProcessor$ExtensionMetadataMonitor(g0 g0Var, g0 g0Var2) {
        this.mCurrentExtensionTypeLiveData = g0Var;
        this.mExtensionStrengthLiveData = g0Var2;
    }

    private int convertExtensionMode(int i10) {
        if (i10 == 0) {
            return 5;
        }
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 3;
        }
        return 2;
    }

    public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
        Object obj;
        Object obj2;
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                Integer num = (Integer) obj2;
                if (!Objects.equals(this.mCurrentExtensionTypeLiveData.mo5314d(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                    this.mCurrentExtensionTypeLiveData.m5319i(Integer.valueOf(convertExtensionMode(num.intValue())));
                }
            }
            if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.mo5314d(), obj)) {
                return;
            }
            this.mExtensionStrengthLiveData.m5319i((Integer) obj);
        }
    }
}
