package g2;

import androidx.compose.ui.viewinterop.AbstractC0265a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k3 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11903a = 2;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11904b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f11905c;

    /* renamed from: d */
    public final /* synthetic */ int f11906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, int i10) {
        super(2);
        this.f11905c = interfaceC2139c;
        this.f11904b = interfaceC7879r;
        this.f11906d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11903a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                f4.m6146f(this.f11904b, this.f11906d, this.f11905c, interfaceC3962k, C3953b.m8496A(7));
                break;
            case 1:
                pg.e0.m11594a(C3953b.m8496A(this.f11906d | 1), this.f11905c, interfaceC3962k, this.f11904b);
                break;
            default:
                AbstractC0265a.m728a(C3953b.m8496A(this.f11906d | 1), this.f11905c, interfaceC3962k, this.f11904b);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(InterfaceC7879r interfaceC7879r, int i10, InterfaceC2139c interfaceC2139c, int i11) {
        super(2);
        this.f11904b = interfaceC7879r;
        this.f11906d = i10;
        this.f11905c = interfaceC2139c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c, int i10) {
        super(2);
        this.f11904b = interfaceC7879r;
        this.f11905c = interfaceC2139c;
        this.f11906d = i10;
    }
}
