package pg;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import ea.AbstractC1976f;
import gc.AbstractC2562f;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.AbstractC4154l;
import p023y.AbstractC8523a;
import td.C7124a;
import td.C7126c;
import ud.InterfaceC7409m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f6 {
    /* renamed from: a */
    public static final String m11618a(InterfaceC7409m platformEnvironProvider) {
        AbstractC4154l.m8923f(platformEnvironProvider, "platformEnvironProvider");
        String str = (String) AbstractC2562f.m6572a(AbstractC1976f.f9256o, platformEnvironProvider);
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("aws-sdk-kotlin-");
        DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
        sb2.append(AbstractC5929j.m11703b(C7124a.m13407e()));
        return sb2.toString();
    }

    /* renamed from: b */
    public static int m11619b(i0.y2 y2Var, int i10) {
        int i11 = p020v.h1.f36569a[y2Var.ordinal()];
        return i11 != 1 ? (i11 == 2 && AbstractC8523a.f41447a.m5729g(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
