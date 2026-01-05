package il;

import android.os.SystemClock;
import android.util.Log;
import eb.C1979c;
import hl.C2964a;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: il.a */
/* loaded from: classes.dex */
public final class C3293a {

    /* renamed from: c */
    public static final C1979c f17517c = new C1979c("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f17518a = new LinkedList();

    /* renamed from: b */
    public long f17519b = -1;

    /* renamed from: a */
    public final void m7638a(C2964a c2964a) {
        if (c2964a.f16028f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.f17518a;
        linkedList.add(lValueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l9 = (Long) linkedList.peekFirst();
            AbstractC6840z.m13036g(l9);
            if (jElapsedRealtime - l9.longValue() < 5000) {
                long j6 = this.f17519b;
                if (j6 == -1 || jElapsedRealtime - j6 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f17519b = jElapsedRealtime;
                    C1979c c1979c = f17517c;
                    if (Log.isLoggable(c1979c.f9280a, 5)) {
                        c1979c.m5714a("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                    }
                }
            }
        }
    }
}
