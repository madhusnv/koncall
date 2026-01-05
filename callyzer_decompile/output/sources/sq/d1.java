package sq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import w2.InterfaceC7879r;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f32803a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f32804b;

    /* renamed from: c */
    public final /* synthetic */ Object f32805c;

    /* renamed from: d */
    public final /* synthetic */ int f32806d;

    /* renamed from: e */
    public final /* synthetic */ int f32807e;

    /* renamed from: f */
    public final /* synthetic */ Object f32808f;

    public /* synthetic */ d1(int i10, InterfaceC7879r interfaceC7879r, InterfaceC7879r interfaceC7879r2, InterfaceC2137a interfaceC2137a, int i11) {
        this.f32806d = i10;
        this.f32804b = interfaceC7879r;
        this.f32805c = interfaceC7879r2;
        this.f32808f = interfaceC2137a;
        this.f32807e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32803a) {
            case 0:
                ((Integer) obj2).getClass();
                b1.m13082L(this.f32806d, (InterfaceC7879r) this.f32804b, (InterfaceC7879r) this.f32805c, (InterfaceC2137a) this.f32808f, (InterfaceC3962k) obj, C3953b.m8496A(this.f32807e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b1.m13109m((List) this.f32808f, (InterfaceC7879r) this.f32804b, (InterfaceC7879r) this.f32805c, this.f32806d, (InterfaceC3962k) obj, C3953b.m8496A(this.f32807e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16149t((List) this.f32805c, this.f32806d, (InterfaceC2141e) this.f32808f, (InterfaceC7879r) this.f32804b, (InterfaceC3962k) obj, C3953b.m8496A(this.f32807e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16137h((String) this.f32804b, (String) this.f32805c, this.f32806d, (InterfaceC2139c) this.f32808f, (InterfaceC3962k) obj, C3953b.m8496A(this.f32807e | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ d1(String str, String str2, int i10, InterfaceC2139c interfaceC2139c, int i11) {
        this.f32804b = str;
        this.f32805c = str2;
        this.f32806d = i10;
        this.f32808f = interfaceC2139c;
        this.f32807e = i11;
    }

    public /* synthetic */ d1(List list, int i10, InterfaceC2141e interfaceC2141e, InterfaceC7879r interfaceC7879r, int i11) {
        this.f32805c = list;
        this.f32806d = i10;
        this.f32808f = interfaceC2141e;
        this.f32804b = interfaceC7879r;
        this.f32807e = i11;
    }

    public /* synthetic */ d1(List list, InterfaceC7879r interfaceC7879r, InterfaceC7879r interfaceC7879r2, int i10, int i11) {
        this.f32808f = list;
        this.f32804b = interfaceC7879r;
        this.f32805c = interfaceC7879r2;
        this.f32806d = i10;
        this.f32807e = i11;
    }
}
