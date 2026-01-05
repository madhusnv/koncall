package og;

import f00.AbstractC2175d;
import h00.InterfaceC2767c;
import h00.InterfaceC2769e;
import org.slf4j.helpers.AbstractC5717f;
import org.slf4j.helpers.C5720i;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class me {

    /* renamed from: a */
    public static InterfaceC2767c f26656a;

    /* renamed from: b */
    public static final /* synthetic */ int f26657b = 0;

    /* renamed from: a */
    public static InterfaceC2767c m10767a() {
        InterfaceC2767c c8687a;
        if (f26656a == null) {
            InterfaceC2769e interfaceC2769eM5854d = AbstractC2175d.m5854d();
            if (interfaceC2769eM5854d != null) {
                c8687a = interfaceC2769eM5854d.mo6763a();
                if (interfaceC2769eM5854d instanceof C5720i) {
                    AbstractC5717f.m11272d("Temporary mdcAdapter given by SubstituteServiceProvider.");
                    AbstractC5717f.m11272d("This mdcAdapter will be replaced after backend initialization has completed.");
                }
            } else {
                AbstractC5717f.m11269a("Failed to find provider.");
                AbstractC5717f.m11269a("Defaulting to no-operation MDCAdapter implementation.");
                c8687a = new C8687a(22);
            }
            f26656a = c8687a;
        }
        return f26656a;
    }
}
