package p001o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class awe extends h7 {

    /* renamed from: d */
    public final fl3 f15315d;

    public awe(q74 q74Var, fl3 fl3Var) {
        super(q74Var, false, true);
        this.f15315d = fl3Var;
    }

    @Override // p001o.h7
    public void T0(Throwable th, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f15315d.mo17341a(th)) {
                return;
            }
        } catch (Throwable th2) {
            cl6.m21376a(th, th2);
        }
        zve.m59988a(th, getContext());
    }

    @Override // p001o.h7
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void U0(y3i y3iVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f15315d.onComplete();
        } catch (Throwable th) {
            zve.m59988a(th, getContext());
        }
    }
}
