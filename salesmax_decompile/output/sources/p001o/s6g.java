package p001o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import p001o.q6g;

/* loaded from: classes2.dex */
public abstract class s6g implements q6g.InterfaceC16299a {

    /* renamed from: a */
    public final StreamConfigurationMap f44878a;

    /* renamed from: o.s6g$a */
    public static class C16760a {
        /* renamed from: a */
        public static Size[] m47913a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public s6g(StreamConfigurationMap streamConfigurationMap) {
        this.f44878a = streamConfigurationMap;
    }

    @Override // p001o.q6g.InterfaceC16299a
    /* renamed from: a */
    public StreamConfigurationMap mo44879a() {
        return this.f44878a;
    }

    @Override // p001o.q6g.InterfaceC16299a
    /* renamed from: c */
    public int[] mo44881c() {
        try {
            return this.f44878a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            wja.m54639m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            return null;
        }
    }

    @Override // p001o.q6g.InterfaceC16299a
    /* renamed from: d */
    public Size[] mo44882d(int i) {
        return C16760a.m47913a(this.f44878a, i);
    }
}
