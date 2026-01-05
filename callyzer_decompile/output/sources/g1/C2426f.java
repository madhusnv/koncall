package g1;

import d7.C1639l;
import d7.InterfaceC1649u;
import ex.InterfaceC2137a;
import java.util.Map;
import l7.C4409i;
import n7.C4970o;
import t2.C7006e;
import t2.InterfaceC7009h;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.f */
/* loaded from: classes.dex */
public final class C2426f implements k2.e0 {

    /* renamed from: a */
    public final /* synthetic */ int f10979a;

    /* renamed from: b */
    public final /* synthetic */ Object f10980b;

    /* renamed from: c */
    public final /* synthetic */ Object f10981c;

    /* renamed from: d */
    public final /* synthetic */ Object f10982d;

    public /* synthetic */ C2426f(int i10, Object obj, Object obj2, Object obj3) {
        this.f10979a = i10;
        this.f10980b = obj;
        this.f10981c = obj2;
        this.f10982d = obj3;
    }

    @Override // k2.e0
    public final void dispose() {
        switch (this.f10979a) {
            case 0:
                C7320q c7320q = (C7320q) this.f10980b;
                Object obj = this.f10981c;
                c7320q.remove(obj);
                ((C2438r) this.f10982d).f11063d.m5577j(obj);
                break;
            case 1:
                ((InterfaceC2137a) this.f10980b).invoke();
                ((InterfaceC1649u) this.f10981c).getLifecycle().mo5346d((C1639l) this.f10982d);
                break;
            case 2:
                C4970o c4970o = (C4970o) this.f10981c;
                C4409i c4409i = (C4409i) this.f10982d;
                c4970o.m9225b().m9217c(c4409i);
                ((C7320q) this.f10980b).remove(c4409i);
                break;
            default:
                C7006e c7006e = (C7006e) this.f10980b;
                e1.j0 j0Var = c7006e.f33939b;
                Object obj2 = this.f10981c;
                Object objM5577j = j0Var.m5577j(obj2);
                InterfaceC7009h interfaceC7009h = (InterfaceC7009h) this.f10982d;
                if (objM5577j == interfaceC7009h) {
                    Map map = c7006e.f33938a;
                    Map mapMo12857c = interfaceC7009h.mo12857c();
                    if (!mapMo12857c.isEmpty()) {
                        map.put(obj2, mapMo12857c);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public C2426f(C4970o c4970o, C4409i c4409i, C7320q c7320q) {
        this.f10979a = 2;
        this.f10981c = c4970o;
        this.f10982d = c4409i;
        this.f10980b = c7320q;
    }
}
