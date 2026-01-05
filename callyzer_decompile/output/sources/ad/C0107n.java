package ad;

import ac.C0088a;
import com.google.android.gms.internal.measurement.j4;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import sd.C6813g;
import sd.InterfaceC6811e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0107n implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f371a;

    /* renamed from: b */
    public final /* synthetic */ C0104k f372b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0114u f373c;

    public /* synthetic */ C0107n(C0104k c0104k, AbstractC0114u abstractC0114u, int i10) {
        this.f371a = i10;
        this.f372b = c0104k;
        this.f373c = abstractC0114u;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f371a) {
            case 0:
                AbstractC4154l.m8923f(it, "it");
                C0100g c0100g = this.f372b.f362e;
                c0100g.getClass();
                if (this.f373c.m298a(C0113t.f385d)) {
                    c0100g.m268i(c0100g.f352d, it);
                } else {
                    c0100g.m268i(c0100g.f351c, it);
                }
                break;
            case 1:
                AbstractC4154l.m8923f(it, "it");
                boolean zM298a = this.f373c.m298a(C0111r.f383d);
                C0104k c0104k = this.f372b;
                if (zM298a) {
                    c0104k.f364g = C6813g.f32361k.mo12985b(it);
                } else {
                    c0104k.f364g = C6813g.f32361k.mo12984a(it);
                }
                break;
            default:
                AbstractC4154l.m8923f(it, "it");
                j4 j4Var = this.f372b.f361d;
                j4Var.getClass();
                if (this.f373c.m298a(C0112s.f384d)) {
                    j4Var.m3398p(it);
                } else {
                    j4Var.m3397o(new C0088a(1, C6813g.f32359i, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 9), it);
                }
                break;
        }
        return a0.f30746a;
    }
}
