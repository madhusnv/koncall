package lj;

import java.util.Date;
import java.util.HashMap;
import jj.InterfaceC3778c;
import jj.InterfaceC3780e;
import jj.InterfaceC3781f;
import kj.InterfaceC4080a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lj.d */
/* loaded from: classes.dex */
public final class C4481d implements InterfaceC4080a {

    /* renamed from: f */
    public static final C4479b f22306f;

    /* renamed from: g */
    public static final C4479b f22307g;

    /* renamed from: a */
    public final HashMap f22309a;

    /* renamed from: b */
    public final HashMap f22310b;

    /* renamed from: c */
    public final C4478a f22311c;

    /* renamed from: d */
    public boolean f22312d;

    /* renamed from: e */
    public static final C4478a f22305e = new C4478a(0);

    /* renamed from: h */
    public static final C4480c f22308h = new C4480c();

    /* JADX WARN: Type inference failed for: r0v1, types: [lj.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lj.b] */
    static {
        final int i10 = 0;
        f22306f = new InterfaceC3780e() { // from class: lj.b
            @Override // jj.InterfaceC3776a
            /* renamed from: a */
            public final void mo5788a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((InterfaceC3781f) obj2).add((String) obj);
                        break;
                    default:
                        ((InterfaceC3781f) obj2).mo8307f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f22307g = new InterfaceC3780e() { // from class: lj.b
            @Override // jj.InterfaceC3776a
            /* renamed from: a */
            public final void mo5788a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((InterfaceC3781f) obj2).add((String) obj);
                        break;
                    default:
                        ((InterfaceC3781f) obj2).mo8307f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C4481d() {
        HashMap map = new HashMap();
        this.f22309a = map;
        HashMap map2 = new HashMap();
        this.f22310b = map2;
        this.f22311c = f22305e;
        this.f22312d = false;
        map2.put(String.class, f22306f);
        map.remove(String.class);
        map2.put(Boolean.class, f22307g);
        map.remove(Boolean.class);
        map2.put(Date.class, f22308h);
        map.remove(Date.class);
    }

    @Override // kj.InterfaceC4080a
    /* renamed from: c */
    public final InterfaceC4080a mo8850c(Class cls, InterfaceC3778c interfaceC3778c) {
        this.f22309a.put(cls, interfaceC3778c);
        this.f22310b.remove(cls);
        return this;
    }
}
