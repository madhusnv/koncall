package h6;

import androidx.credentials.exceptions.CreateCredentialException;
import i00.InterfaceC3099d;
import i00.InterfaceC3102g;
import i00.p0;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.i */
/* loaded from: classes.dex */
public final class C2853i implements InterfaceC2855k, InterfaceC3102g {

    /* renamed from: a */
    public final /* synthetic */ C7251k f15863a;

    public /* synthetic */ C2853i(C7251k c7251k) {
        this.f15863a = c7251k;
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: A */
    public void mo5818A(InterfaceC3099d call, p0 p0Var) {
        AbstractC4154l.m8923f(call, "call");
        this.f15863a.resumeWith(p0Var);
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: L */
    public void mo5819L(InterfaceC3099d interfaceC3099d, Throwable th2) {
        this.f15863a.resumeWith(od.m10796a(th2));
    }

    @Override // h6.InterfaceC2855k
    /* renamed from: a */
    public void mo5820a(Object obj) {
        CreateCredentialException e2 = (CreateCredentialException) obj;
        AbstractC4154l.m8923f(e2, "e");
        C7251k c7251k = this.f15863a;
        if (c7251k.m13544v()) {
            c7251k.resumeWith(od.m10796a(e2));
        }
    }

    @Override // h6.InterfaceC2855k
    public void onResult(Object obj) {
        AbstractC2847c result = (AbstractC2847c) obj;
        AbstractC4154l.m8923f(result, "result");
        C7251k c7251k = this.f15863a;
        if (c7251k.m13544v()) {
            c7251k.resumeWith(result);
        }
    }
}
