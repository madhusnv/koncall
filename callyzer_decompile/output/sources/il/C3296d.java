package il;

import android.util.Log;
import eb.C1979c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p020v.x0;
import qi.C6234q;
import qi.InterfaceC6222e;
import yg.InterfaceC8647d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: il.d */
/* loaded from: classes.dex */
public final class C3296d implements InterfaceC8647d, InterfaceC6222e {

    /* renamed from: a */
    public static final /* synthetic */ C3296d f17528a = new C3296d();

    /* renamed from: b */
    public static final /* synthetic */ C3296d f17529b = new C3296d();

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        Set setMo12239f = x0Var.mo12239f(C6234q.m12250a(AbstractC3295c.class));
        C3296d c3296d = new C3296d();
        new HashMap();
        new HashMap();
        Iterator it = setMo12239f.iterator();
        if (!it.hasNext()) {
            return c3296d;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        C1979c c1979c = AbstractC3294b.f17520e;
        if (Log.isLoggable(c1979c.f9280a, 6)) {
            c1979c.m5714a("Error preloading model resource");
        }
    }
}
