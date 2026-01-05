package p001o;

import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.y54;

/* loaded from: classes6.dex */
public final class nkh extends y54.AbstractC18324f {

    /* renamed from: a */
    public static final Logger f36982a = Logger.getLogger(nkh.class.getName());

    /* renamed from: b */
    public static final ThreadLocal f36983b = new ThreadLocal();

    @Override // p001o.y54.AbstractC18324f
    /* renamed from: a */
    public y54 mo40729a() {
        y54 y54Var = (y54) f36983b.get();
        return y54Var == null ? y54.f54905f : y54Var;
    }

    @Override // p001o.y54.AbstractC18324f
    /* renamed from: b */
    public void mo40730b(y54 y54Var, y54 y54Var2) {
        if (mo40729a() != y54Var) {
            f36982a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (y54Var2 != y54.f54905f) {
            f36983b.set(y54Var2);
        } else {
            f36983b.set(null);
        }
    }

    @Override // p001o.y54.AbstractC18324f
    /* renamed from: c */
    public y54 mo40731c(y54 y54Var) {
        y54 y54VarMo40729a = mo40729a();
        f36983b.set(y54Var);
        return y54VarMo40729a;
    }
}
