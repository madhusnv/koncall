package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import kk.AbstractC4103w;
import og.xb;
import pk.AbstractC5973c;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a0 extends AbstractC4103w {

    /* renamed from: a */
    public final c0 f24886a;

    public a0(c0 c0Var) {
        this.f24886a = c0Var;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        Object objMo10009d = mo10009d();
        Map map = this.f24886a.f24898a;
        try {
            c6564a.mo10025j();
            while (c6564a.mo10023R()) {
                C5103z c5103z = (C5103z) map.get(c6564a.v0());
                if (c5103z == null) {
                    c6564a.L0();
                } else {
                    mo10011f(objMo10009d, c6564a, c5103z);
                }
            }
            c6564a.mo10027z();
            return mo10010e(objMo10009d);
        } catch (IllegalAccessException e2) {
            xb xbVar = AbstractC5973c.f29216a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c6566c.mo10029J();
            return;
        }
        c6566c.mo10031n();
        try {
            Iterator it = this.f24886a.f24899b.iterator();
            while (it.hasNext()) {
                ((C5103z) it.next()).m10036a(c6566c, obj);
            }
            c6566c.mo10033z();
        } catch (IllegalAccessException e2) {
            xb xbVar = AbstractC5973c.f29216a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    /* renamed from: d */
    public abstract Object mo10009d();

    /* renamed from: e */
    public abstract Object mo10010e(Object obj);

    /* renamed from: f */
    public abstract void mo10011f(Object obj, C6564a c6564a, C5103z c5103z);
}
