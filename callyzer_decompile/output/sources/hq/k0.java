package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import jp.C3820a;
import jp.C3825f;
import mq.p0;
import rt.C6617a;
import zp.C9007g;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16238a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f16239b;

    /* renamed from: c */
    public final /* synthetic */ C9008h f16240c;

    public /* synthetic */ k0(InterfaceC2139c interfaceC2139c, C9008h c9008h, int i10) {
        this.f16238a = i10;
        this.f16239b = interfaceC2139c;
        this.f16240c = c9008h;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16238a) {
            case 0:
                this.f16239b.invoke(new mq.l0(this.f16240c.f43398d));
                break;
            case 1:
                this.f16239b.invoke(new p0(this.f16240c.f43398d));
                break;
            case 2:
                this.f16239b.invoke(this.f16240c);
                break;
            case 3:
                this.f16239b.invoke(this.f16240c.f43398d);
                break;
            case 4:
                this.f16239b.invoke(new C3820a(this.f16240c.f43398d));
                break;
            case 5:
                this.f16239b.invoke(new C3825f(this.f16240c.f43398d));
                break;
            default:
                C9008h c9008h = this.f16240c;
                String str = c9008h.f43397c;
                String str2 = c9008h.f43399e;
                String str3 = c9008h.f43401g;
                String strValueOf = String.valueOf(c9008h.f43400f);
                ArrayList arrayList = c9008h.f43402h;
                this.f16239b.invoke(new C6617a(str, str2, str3, strValueOf, ((C9007g) arrayList.get(0)).f43389a.f27177b, ((C9007g) arrayList.get(0)).f43389a.f27176a, "00", null, 0, null, null, null, 3968));
                break;
        }
        return qw.a0.f30746a;
    }
}
