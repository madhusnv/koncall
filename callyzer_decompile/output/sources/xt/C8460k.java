package xt;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import vt.C7782m;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xt.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8460k implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41256a = 0;

    /* renamed from: b */
    public final /* synthetic */ C8774f f41257b;

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41256a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                String name = (String) obj2;
                AbstractC4154l.m8923f(name, "name");
                this.f41257b.m16129f(new C7782m(iIntValue, name));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                AbstractC8450a.m15758e(this.f41257b, (InterfaceC3962k) obj, iM8496A);
                break;
        }
        return a0.f30746a;
    }
}
