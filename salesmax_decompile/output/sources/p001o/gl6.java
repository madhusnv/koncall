package p001o;

import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class gl6 {

    /* renamed from: a */
    public final String f25413a;

    public gl6(String str) {
        this.f25413a = str;
    }

    /* renamed from: a */
    public List m28995a(int i) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) zq5.m59712b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.m4545c(this.f25413a, i);
    }
}
