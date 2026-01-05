package mv;

import ex.InterfaceC2139c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import ov.C5751b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mv.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4887a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f24400a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f24401b;

    /* renamed from: c */
    public final /* synthetic */ w0 f24402c;

    public /* synthetic */ C4887a(int i10, InterfaceC2139c interfaceC2139c, w0 w0Var) {
        this.f24400a = i10;
        this.f24401b = interfaceC2139c;
        this.f24402c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f24400a) {
            case 0:
                Map permissionsMap = (Map) obj;
                AbstractC4154l.m8923f(permissionsMap, "permissionsMap");
                boolean zIsEmpty = permissionsMap.values().isEmpty();
                w0 w0Var = this.f24402c;
                if (zIsEmpty) {
                    w0Var.setValue(Boolean.FALSE);
                } else {
                    Collection collectionValues = permissionsMap.values();
                    if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                        this.f24401b.invoke(C5751b.f28308a);
                    } else {
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                w0Var.setValue(Boolean.TRUE);
                            }
                        }
                        this.f24401b.invoke(C5751b.f28308a);
                    }
                }
                return a0.f30746a;
            case 1:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f24402c.setValue(Boolean.TRUE);
                this.f24401b.invoke(it2);
                break;
            case 2:
                C4381z newValue = (C4381z) obj;
                AbstractC4154l.m8923f(newValue, "newValue");
                this.f24402c.setValue(newValue);
                this.f24401b.invoke(newValue.f21945a.f13620b);
                break;
            case 3:
                String it3 = (String) obj;
                AbstractC4154l.m8923f(it3, "it");
                this.f24402c.setValue(it3);
                this.f24401b.invoke(it3);
                break;
            default:
                l7.a0 controller = (l7.a0) obj;
                AbstractC4154l.m8923f(controller, "controller");
                this.f24402c.setValue(controller);
                this.f24401b.invoke(controller);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C4887a(w0 w0Var, InterfaceC2139c interfaceC2139c) {
        this.f24400a = 2;
        this.f24402c = w0Var;
        this.f24401b = interfaceC2139c;
    }
}
