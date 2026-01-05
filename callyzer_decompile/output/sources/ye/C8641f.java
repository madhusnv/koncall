package ye;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import gf.InterfaceC2585a;
import java.util.HashMap;
import tb.C7105p;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ye.f */
/* loaded from: classes.dex */
public final class C8641f {

    /* renamed from: a */
    public final C7105p f41924a;

    /* renamed from: b */
    public final C7439j f41925b;

    /* renamed from: c */
    public final HashMap f41926c;

    public C8641f(Context context, C7439j c7439j) {
        C7105p c7105p = new C7105p(context);
        this.f41926c = new HashMap();
        this.f41924a = c7105p;
        this.f41925b = c7439j;
    }

    /* renamed from: a */
    public final synchronized InterfaceC8642g m15963a(String str) {
        if (this.f41926c.containsKey(str)) {
            return (InterfaceC8642g) this.f41926c.get(str);
        }
        CctBackendFactory cctBackendFactoryM13385h = this.f41924a.m13385h(str);
        if (cctBackendFactoryM13385h == null) {
            return null;
        }
        C7439j c7439j = this.f41925b;
        InterfaceC8642g interfaceC8642gCreate = cctBackendFactoryM13385h.create(new C8637b((Context) c7439j.f35537b, (InterfaceC2585a) c7439j.f35538c, (InterfaceC2585a) c7439j.f35539d, str));
        this.f41926c.put(str, interfaceC8642gCreate);
        return interfaceC8642gCreate;
    }
}
