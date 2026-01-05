package au;

import android.content.Context;
import ct.C1502a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ja.C3631y;
import ja.C3632z;
import ja.b0;
import k2.w0;
import kotlin.jvm.internal.C4168z;
import kq.C4181k;
import nx.AbstractC5178p;
import pg.a8;
import pg.f9;
import qw.a0;
import sv.C6955c;
import tu.C7226b;
import vs.C7769k;
import ws.C8167h;
import ws.C8173n;
import ws.C8176q;
import xs.C8449k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.l */
/* loaded from: classes3.dex */
public final class C0448l implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3241a;

    /* renamed from: b */
    public final /* synthetic */ Object f3242b;

    /* renamed from: c */
    public final /* synthetic */ Object f3243c;

    /* renamed from: d */
    public final /* synthetic */ Object f3244d;

    public /* synthetic */ C0448l(int i10, Object obj, Object obj2, Object obj3) {
        this.f3241a = i10;
        this.f3243c = obj;
        this.f3244d = obj2;
        this.f3242b = obj3;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3241a) {
            case 0:
                ((InterfaceC2139c) this.f3243c).invoke(new C0452p(((C6955c) this.f3244d).f33680a));
                ((w0) this.f3242b).setValue(Boolean.TRUE);
                break;
            case 1:
                ((w0) this.f3242b).setValue((C4181k) this.f3243c);
                ((w0) this.f3244d).setValue(Boolean.TRUE);
                break;
            case 2:
                StringBuilder sb2 = new StringBuilder("'");
                sb2.append(((C3631y) ((b0) this.f3244d)).f19271a);
                sb2.append("' defined multiple times in ");
                C4168z c4168z = (C4168z) this.f3242b;
                sb2.append(a8.m11536a((C3632z) c4168z.f21164a));
                sb2.append(" '");
                break;
            case 3:
                ((InterfaceC2139c) this.f3243c).invoke("troubleshooting_run/".concat(f9.m11628b((Context) this.f3242b, ((C7226b) this.f3244d).f34558b)));
                break;
            case 4:
                break;
            case 5:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f3243c;
                C1502a c1502a = (C1502a) this.f3244d;
                interfaceC2139c.invoke(c1502a);
                ((InterfaceC2139c) this.f3242b).invoke(c1502a);
                break;
            case 6:
                ((w0) this.f3242b).setValue(Boolean.TRUE);
                ((C8449k) this.f3243c).m15752h(new C8167h((C8176q) this.f3244d));
                break;
            default:
                String str = (String) this.f3244d;
                if (str == null || AbstractC5178p.m10101L(str)) {
                    ((InterfaceC2139c) this.f3243c).invoke(new C8173n(((C7769k) this.f3242b).f37432b));
                }
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C0448l(int i10, Object obj, Object obj2, w0 w0Var) {
        this.f3241a = i10;
        this.f3242b = w0Var;
        this.f3243c = obj;
        this.f3244d = obj2;
    }

    public C0448l(String str, InterfaceC2139c interfaceC2139c, C7769k c7769k) {
        this.f3241a = 7;
        this.f3244d = str;
        this.f3243c = interfaceC2139c;
        this.f3242b = c7769k;
    }
}
