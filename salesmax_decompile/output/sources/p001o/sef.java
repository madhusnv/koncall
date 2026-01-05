package p001o;

import java.io.IOException;
import p001o.fve;

/* loaded from: classes6.dex */
public final class sef implements fl6 {

    /* renamed from: a */
    public final fve f45324a;

    public sef(fve fveVar) {
        sq8.m48649h(fveVar, "routePlanner");
        this.f45324a = fveVar;
    }

    @Override // p001o.fl6
    /* renamed from: a */
    public zce mo27015a() throws Throwable {
        fve.InterfaceC13582b interfaceC13582bMo24819d;
        IOException iOException = null;
        while (!mo27016b().isCanceled()) {
            try {
                interfaceC13582bMo24819d = mo27016b().mo24819d();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    cl6.m21376a(iOException, e);
                }
                if (!fve.m27567e(mo27016b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!interfaceC13582bMo24819d.isReady()) {
                fve.C13581a c13581aMo25601f = interfaceC13582bMo24819d.mo25601f();
                if (c13581aMo25601f.m27573f()) {
                    c13581aMo25601f = interfaceC13582bMo24819d.mo25599d();
                }
                fve.InterfaceC13582b interfaceC13582bM27568a = c13581aMo25601f.m27568a();
                Throwable thM27569b = c13581aMo25601f.m27569b();
                if (thM27569b != null) {
                    throw thM27569b;
                }
                if (interfaceC13582bM27568a != null) {
                    mo27016b().mo24817b().m42480j(interfaceC13582bM27568a);
                }
            }
            return interfaceC13582bMo24819d.mo25596a();
        }
        throw new IOException("Canceled");
    }

    @Override // p001o.fl6
    /* renamed from: b */
    public fve mo27016b() {
        return this.f45324a;
    }
}
