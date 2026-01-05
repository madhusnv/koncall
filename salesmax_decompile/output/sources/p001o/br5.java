package p001o;

import androidx.camera.core.impl.C1896a;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class br5 {
    /* renamed from: a */
    public static List m19625a(C1896a c1896a) {
        ArrayList arrayList = new ArrayList();
        if (c1896a.m4697a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.m4824f())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (c1896a.m4697a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.m4820c())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
