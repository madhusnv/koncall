package qe;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.b */
/* loaded from: classes.dex */
public final class C6191b extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > FFmpegKitConfig.f5948c;
    }
}
