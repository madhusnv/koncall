package qu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import bu.C0782a;
import d7.q0;
import ex.InterfaceC2137a;
import og.kc;
import pu.C6033a;
import pu.C6034b;
import pu.C6040h;
import qw.a0;
import tx.c0;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qu.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6321b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30655a = 0;

    /* renamed from: b */
    public final /* synthetic */ C6324e f30656b;

    /* renamed from: c */
    public final /* synthetic */ C6040h f30657c;

    public /* synthetic */ C6321b(C6040h c6040h, C6324e c6324e) {
        this.f30657c = c6040h;
        this.f30656b = c6324e;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        Intent intent;
        Intent intent2;
        switch (this.f30655a) {
            case 0:
                kc kcVar = this.f30657c.f29494g;
                if (kcVar instanceof C6034b) {
                    boolean z6 = ((C6034b) kcVar).f29483b;
                    C6324e c6324e = this.f30656b;
                    if (z6) {
                        c0.m13502y(q0.m5340g(c6324e), null, null, new C0782a(c6324e, null, 18), 3);
                    } else {
                        c6324e.m12334h("permission_not_granted");
                    }
                }
                break;
            default:
                boolean z10 = ((C6033a) this.f30657c.f29494g).f29482b;
                C6324e c6324e2 = this.f30656b;
                C8805t c8805t = c6324e2.f30664d;
                Context context = c6324e2.f30663c;
                Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
                try {
                    if (z10) {
                        intent2 = new Intent("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
                        intent2.setData(uriFromParts);
                    } else {
                        intent2 = new Intent("android.settings.WIRELESS_SETTINGS");
                    }
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    c8805t.m16233h("TroubleshootingRunViewModel", "openInternetErrorSettings failed: " + e2.getMessage(), e2);
                    try {
                        if (z10) {
                            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(uriFromParts);
                        } else {
                            intent = new Intent("android.settings.SETTINGS");
                        }
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    } catch (Exception e10) {
                        c8805t.m16233h("TroubleshootingRunViewModel", "Fallback failed: " + e10.getMessage(), e10);
                    }
                }
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C6321b(C6324e c6324e, C6040h c6040h) {
        this.f30656b = c6324e;
        this.f30657c = c6040h;
    }
}
