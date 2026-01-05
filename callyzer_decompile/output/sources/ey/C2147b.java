package ey;

import androidx.credentials.exceptions.GetCredentialException;
import h6.C2864t;
import h6.InterfaceC2855k;
import i00.C3113r;
import i00.InterfaceC3099d;
import i00.InterfaceC3102g;
import i00.p0;
import iz.InterfaceC3372e;
import iz.k0;
import java.io.IOException;
import jz.C3890a;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import nz.C5205p;
import og.od;
import retrofit2.HttpException;
import tx.C7251k;
import yg.C8656m;
import yg.InterfaceC8646c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ey.b */
/* loaded from: classes3.dex */
public final class C2147b implements InterfaceC8646c, InterfaceC2855k, InterfaceC3102g, InterfaceC3372e {

    /* renamed from: a */
    public final /* synthetic */ C7251k f9994a;

    public /* synthetic */ C2147b(C7251k c7251k) {
        this.f9994a = c7251k;
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: A */
    public void mo5818A(InterfaceC3099d call, p0 p0Var) {
        AbstractC4154l.m8923f(call, "call");
        boolean z6 = p0Var.f16730a.f17932r;
        C7251k c7251k = this.f9994a;
        if (!z6) {
            c7251k.resumeWith(od.m10796a(new HttpException(p0Var)));
            return;
        }
        Object obj = p0Var.f16731b;
        if (obj != null) {
            c7251k.resumeWith(obj);
            return;
        }
        Object objM14479O = call.mo7443u().m14479O(C3113r.class);
        AbstractC4154l.m8920c(objM14479O);
        C3113r c3113r = (C3113r) objM14479O;
        c7251k.resumeWith(od.m10796a(new KotlinNullPointerException("Response from " + c3113r.f16739a.getName() + '.' + c3113r.f16741c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: L */
    public void mo5819L(InterfaceC3099d interfaceC3099d, Throwable th2) {
        this.f9994a.resumeWith(od.m10796a(th2));
    }

    @Override // h6.InterfaceC2855k
    /* renamed from: a */
    public void mo5820a(Object obj) {
        GetCredentialException e2 = (GetCredentialException) obj;
        AbstractC4154l.m8923f(e2, "e");
        C7251k c7251k = this.f9994a;
        if (c7251k.m13544v()) {
            c7251k.resumeWith(od.m10796a(e2));
        }
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: d */
    public void mo2561d(C5205p c5205p, IOException iOException) {
        this.f9994a.resumeWith(od.m10796a(iOException));
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: e */
    public void mo2562e(C5205p c5205p, k0 k0Var) throws DispatchException {
        this.f9994a.mo5485f(k0Var, C3890a.f19986a);
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m c8656m) {
        Exception excM15982i = c8656m.m15982i();
        if (excM15982i != null) {
            this.f9994a.resumeWith(od.m10796a(excM15982i));
        } else if (c8656m.f41952d) {
            this.f9994a.cancel(null);
        } else {
            this.f9994a.resumeWith(c8656m.m15983j());
        }
    }

    @Override // h6.InterfaceC2855k
    public void onResult(Object obj) {
        C2864t result = (C2864t) obj;
        AbstractC4154l.m8923f(result, "result");
        C7251k c7251k = this.f9994a;
        if (c7251k.m13544v()) {
            c7251k.resumeWith(result);
        }
    }
}
