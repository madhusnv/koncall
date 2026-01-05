package p001o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class kwe extends h7 {

    /* renamed from: d */
    public final auf f32771d;

    public kwe(q74 q74Var, auf aufVar) {
        super(q74Var, false, true);
        this.f32771d = aufVar;
    }

    @Override // p001o.h7
    public void T0(Throwable th, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f32771d.mo17847a(th)) {
                return;
            }
        } catch (Throwable th2) {
            cl6.m21376a(th, th2);
        }
        zve.m59988a(th, getContext());
    }

    @Override // p001o.h7
    public void U0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f32771d.onSuccess(obj);
        } catch (Throwable th) {
            zve.m59988a(th, getContext());
        }
    }
}
