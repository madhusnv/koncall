package p001o;

import android.content.Context;
import com.facebook.C10773c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class uk0 {

    /* renamed from: a */
    public final HashMap f49008a = new HashMap();

    /* renamed from: a */
    public final synchronized void m51664a(ua uaVar, tk0 tk0Var) {
        sq8.m48649h(uaVar, "accessTokenAppIdPair");
        sq8.m48649h(tk0Var, "appEvent");
        ghf ghfVarM51668e = m51668e(uaVar);
        if (ghfVarM51668e != null) {
            ghfVarM51668e.m28718a(tk0Var);
        }
    }

    /* renamed from: b */
    public final synchronized void m51665b(m4d m4dVar) {
        if (m4dVar == null) {
            return;
        }
        for (Map.Entry entry : m4dVar.m38353b()) {
            ghf ghfVarM51668e = m51668e((ua) entry.getKey());
            if (ghfVarM51668e != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ghfVarM51668e.m28718a((tk0) it.next());
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized ghf m51666c(ua uaVar) {
        sq8.m48649h(uaVar, "accessTokenAppIdPair");
        return (ghf) this.f49008a.get(uaVar);
    }

    /* renamed from: d */
    public final synchronized int m51667d() {
        int iM28720c;
        Iterator it = this.f49008a.values().iterator();
        iM28720c = 0;
        while (it.hasNext()) {
            iM28720c += ((ghf) it.next()).m28720c();
        }
        return iM28720c;
    }

    /* renamed from: e */
    public final synchronized ghf m51668e(ua uaVar) {
        Context contextM13019l;
        vx0 vx0VarM53530e;
        ghf ghfVar = (ghf) this.f49008a.get(uaVar);
        if (ghfVar == null && (vx0VarM53530e = vx0.f50974f.m53530e((contextM13019l = C10773c.m13019l()))) != null) {
            ghfVar = new ghf(vx0VarM53530e, nl0.f36985b.m40735b(contextM13019l));
        }
        if (ghfVar == null) {
            return null;
        }
        this.f49008a.put(uaVar, ghfVar);
        return ghfVar;
    }

    /* renamed from: f */
    public final synchronized Set m51669f() {
        Set setKeySet;
        setKeySet = this.f49008a.keySet();
        sq8.m48648g(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
