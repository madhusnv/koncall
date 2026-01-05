package of;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import pg.l8;
import yg.C8656m;
import yg.InterfaceC8644a;
import yg.InterfaceC8649f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C5349d implements InterfaceC8644a, InterfaceC8649f {

    /* renamed from: b */
    public static final /* synthetic */ C5349d f26273b = new C5349d(0);

    /* renamed from: c */
    public static final /* synthetic */ C5349d f26274c = new C5349d(1);

    /* renamed from: d */
    public static final /* synthetic */ C5349d f26275d = new C5349d(2);

    /* renamed from: a */
    public final /* synthetic */ int f26276a;

    public /* synthetic */ C5349d(int i10) {
        this.f26276a = i10;
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) throws IOException {
        switch (this.f26276a) {
            case 0:
                if (c8656m.m15985l()) {
                    return (Bundle) c8656m.m15983j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(c8656m.m15982i()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", c8656m.m15982i());
            default:
                Intent intent = (Intent) ((Bundle) c8656m.m15983j()).getParcelable("notification_data");
                if (intent != null) {
                    return new C5346a(intent);
                }
                return null;
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = C5347b.f26262h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? l8.m11765f(bundle) : l8.m11765f(null);
    }
}
