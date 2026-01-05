package vx;

import ex.InterfaceC2139c;
import og.od;
import qw.a0;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.s */
/* loaded from: classes3.dex */
public final class C7817s implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37527a;

    /* renamed from: b */
    public final /* synthetic */ C7251k f37528b;

    public /* synthetic */ C7817s(C7251k c7251k, int i10) {
        this.f37527a = i10;
        this.f37528b = c7251k;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37527a) {
            case 0:
                C7251k c7251k = this.f37528b;
                a0 a0Var = a0.f30746a;
                c7251k.resumeWith(a0Var);
                return a0Var;
            default:
                Throwable th2 = (Throwable) obj;
                C7251k c7251k2 = this.f37528b;
                if (th2 != null) {
                    th2.printStackTrace();
                    c7251k2.resumeWith(od.m10796a(th2));
                } else {
                    c7251k2.resumeWith(od.m10796a(new Exception("RetrieveFCMToken coroutine cancel >>> CancelException is null")));
                }
                return a0.f30746a;
        }
    }
}
