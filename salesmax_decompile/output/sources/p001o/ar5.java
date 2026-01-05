package p001o;

import androidx.camera.core.impl.C1896a;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ar5 {
    /* renamed from: a */
    public static List m17701a(C1896a c1896a) {
        ArrayList arrayList = new ArrayList();
        if (c1896a.m4697a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.m4709h())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (c1896a.m4697a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.m4722c())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (c1896a.m4697a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.m4703d())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (c1896a.m4697a(LowMemoryQuirk.class, LowMemoryQuirk.m4721c())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (c1896a.m4697a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.m4719f())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (c1896a.m4697a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.m4712g())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
