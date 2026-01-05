package p001o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: classes2.dex */
public class r6g extends s6g {
    public r6g(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // p001o.q6g.InterfaceC16299a
    /* renamed from: b */
    public Size[] mo44880b(int i) {
        return this.f44878a.getOutputSizes(i);
    }
}
