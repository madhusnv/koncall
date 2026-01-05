package gm;

import com.websoptimization.callyzerbiz.MainActivity;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import xv.C8474a;
import xv.C8489p;
import yg.InterfaceC8647d;
import yv.C8805t;
import z5.InterfaceC8871d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements InterfaceC8871d, InterfaceC8647d {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f14228a;

    public /* synthetic */ a0(MainActivity mainActivity) {
        this.f14228a = mainActivity;
    }

    @Override // z5.InterfaceC8871d
    /* renamed from: a */
    public boolean mo6604a() {
        C8489p c8489p = this.f14228a.f7266k;
        if (c8489p != null) {
            return ((C8474a) c8489p.f41349E.f39340a.getValue()).f41290a;
        }
        AbstractC4154l.m8928k("permissionsViewModel");
        throw null;
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        int i10 = MainActivity.f7256m;
        exc.getMessage();
        exc.getCause();
        C8805t c8805t = this.f14228a.f7261e;
        if (c8805t != null) {
            c8805t.m16240o("In-App-Updates", AbstractC5601a.m11238i("checkForUpdate addOnFailureListener ", exc.getMessage(), " "), exc);
        } else {
            AbstractC4154l.m8928k("traceLogs");
            throw null;
        }
    }
}
