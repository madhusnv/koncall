package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import kk.AbstractC4103w;
import mk.InterfaceC4777p;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.c */
/* loaded from: classes.dex */
public final class C5080c extends AbstractC4103w {

    /* renamed from: a */
    public final /* synthetic */ int f24894a = 1;

    /* renamed from: b */
    public final Object f24895b;

    /* renamed from: c */
    public final Object f24896c;

    public C5080c(C5097t c5097t, InterfaceC4777p interfaceC4777p) {
        this.f24895b = c5097t;
        this.f24896c = interfaceC4777p;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        switch (this.f24894a) {
            case 0:
                if (c6564a.E0() == EnumC6565b.NULL) {
                    c6564a.A0();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC4777p) this.f24896c).mo28i();
                c6564a.mo10024h();
                while (c6564a.mo10023R()) {
                    collection.add(((C5097t) this.f24895b).f24983c.mo8851b(c6564a));
                }
                c6564a.mo10026w();
                return collection;
            default:
                Class cls = (Class) this.f24895b;
                Object objMo8851b = ((b1) this.f24896c).f24893c.mo8851b(c6564a);
                if (objMo8851b == null || cls.isInstance(objMo8851b)) {
                    return objMo8851b;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objMo8851b.getClass().getName() + "; at path " + c6564a.mo10022P());
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        switch (this.f24894a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c6566c.mo10030j();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C5097t) this.f24895b).mo8852c(c6566c, it.next());
                    }
                    c6566c.mo10032w();
                    break;
                } else {
                    c6566c.mo10029J();
                    break;
                }
            default:
                ((b1) this.f24896c).f24893c.mo8852c(c6566c, obj);
                break;
        }
    }

    public C5080c(b1 b1Var, Class cls) {
        this.f24896c = b1Var;
        this.f24895b = cls;
    }
}
