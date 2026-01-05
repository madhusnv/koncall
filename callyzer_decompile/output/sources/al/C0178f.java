package al;

import android.content.Context;
import c9.C0917l;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k4.C4001v;
import mk.C4764c;
import qi.C6219b;
import qi.C6225h;
import qi.InterfaceC6223f;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.f */
/* loaded from: classes.dex */
public final class C0178f {

    /* renamed from: b */
    public static final Object f543b = new Object();

    /* renamed from: c */
    public static C0178f f544c;

    /* renamed from: a */
    public C6225h f545a;

    /* renamed from: c */
    public static C0178f m403c() {
        C0178f c0178f;
        synchronized (f543b) {
            AbstractC6840z.m13038i("MlKitContext has not been initialized", f544c != null);
            c0178f = f544c;
            AbstractC6840z.m13036g(c0178f);
        }
        return c0178f;
    }

    /* renamed from: d */
    public static C0178f m404d(Context context, Executor executor) {
        C0178f c0178f;
        synchronized (f543b) {
            AbstractC6840z.m13038i("MlKitContext is already initialized", f544c == null);
            C0178f c0178f2 = new C0178f();
            f544c = c0178f2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM2641e = new C0917l(13, context, new C4001v(21, MlKitComponentDiscoveryService.class)).m2641e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C4764c c4764c = InterfaceC6223f.S0;
            arrayList.addAll(arrayListM2641e);
            arrayList2.add(C6219b.m12233c(context, Context.class, new Class[0]));
            arrayList2.add(C6219b.m12233c(c0178f2, C0178f.class, new Class[0]));
            C6225h c6225h = new C6225h(executor, arrayList, arrayList2, c4764c);
            c0178f2.f545a = c6225h;
            c6225h.m12242i(true);
            c0178f = f544c;
        }
        return c0178f;
    }

    /* renamed from: a */
    public final Object m405a(Class cls) {
        AbstractC6840z.m13038i("MlKitContext has been deleted", f544c == this);
        AbstractC6840z.m13036g(this.f545a);
        return this.f545a.mo12234a(cls);
    }

    /* renamed from: b */
    public final Context m406b() {
        return (Context) m405a(Context.class);
    }
}
