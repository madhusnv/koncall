package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j$.time.zone.h */
/* loaded from: classes2.dex */
public final class C3497h implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ List f18334a;

    public C3497h(List list) {
        this.f18334a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C3498i c3498i = (C3498i) C3498i.class.cast(Class.forName(property, true, C3498i.class.getClassLoader()).newInstance());
                C3498i.m8051b(c3498i);
                ((ArrayList) this.f18334a).add(c3498i);
                return null;
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }
        C3498i.m8051b(new C3498i());
        return null;
    }
}
