package p001o;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.AbstractC11951a;

/* loaded from: classes6.dex */
public abstract class lcc {
    /* renamed from: a */
    public static final void m36947a(xk7 xk7Var, Object obj, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f3i f3iVarM36948b = m36948b(xk7Var, obj, null);
        if (f3iVarM36948b != null) {
            AbstractC11951a.m16250a(q74Var, f3iVarM36948b);
        }
    }

    /* renamed from: b */
    public static final f3i m36948b(xk7 xk7Var, Object obj, f3i f3iVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            xk7Var.invoke(obj);
        } catch (Throwable th) {
            if (f3iVar == null || f3iVar.getCause() == th) {
                return new f3i("Exception in undelivered element handler for " + obj, th);
            }
            cl6.m21376a(f3iVar, th);
        }
        return f3iVar;
    }

    /* renamed from: c */
    public static /* synthetic */ f3i m36949c(xk7 xk7Var, Object obj, f3i f3iVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            f3iVar = null;
        }
        return m36948b(xk7Var, obj, f3iVar);
    }
}
