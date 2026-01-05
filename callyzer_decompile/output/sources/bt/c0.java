package bt;

import dt.C1813s;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import zs.C9052q;
import zs.C9053r;
import zs.C9054s;
import zs.C9055t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4786a;

    /* renamed from: b */
    public final /* synthetic */ C1813s f4787b;

    public /* synthetic */ c0(C1813s c1813s, int i10) {
        this.f4786a = i10;
        this.f4787b = c1813s;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f4786a) {
            case 0:
                this.f4787b.m5479f(new C9054s(((Integer) obj).intValue()));
                break;
            case 1:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f4787b.m5479f(new C9053r(it));
                break;
            case 2:
                String newText = (String) obj;
                AbstractC4154l.m8923f(newText, "newText");
                this.f4787b.m5479f(new C9055t(newText));
                break;
            default:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f4787b.m5479f(new C9052q(it2));
                break;
        }
        return qw.a0.f30746a;
    }
}
