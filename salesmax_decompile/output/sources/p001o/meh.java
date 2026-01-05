package p001o;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class meh {

    /* renamed from: a */
    public final boolean f35305a;

    /* renamed from: b */
    public final boolean f35306b;

    public meh(l5e l5eVar) {
        this.f35305a = CaptureIntentPreviewQuirk.m4530b(l5eVar);
        this.f35306b = l5eVar.m36593a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    /* renamed from: a */
    public Map m38863a(int i) {
        if (i == 3 && this.f35305a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i != 4 || !this.f35306b) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
