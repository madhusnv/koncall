package p001o;

/* loaded from: classes2.dex */
public abstract class wh9 {
    /* renamed from: b */
    public static final int m54402b(vla vlaVar, s90 s90Var) {
        vla vlaVarMo52911X = vlaVar.mo52911X();
        if (!(vlaVarMo52911X != null)) {
            throw new IllegalStateException(("Child of " + vlaVar + " cannot be null when calculating alignment line").toString());
        }
        if (vlaVar.b0().mo18091b().containsKey(s90Var)) {
            Integer num = (Integer) vlaVar.b0().mo18091b().get(s90Var);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iM52910W = vlaVarMo52911X.m52910W(s90Var);
        if (iM52910W == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        vlaVarMo52911X.j0(true);
        vlaVar.i0(true);
        vlaVar.h0();
        vlaVarMo52911X.j0(false);
        vlaVar.i0(false);
        return iM52910W + (s90Var instanceof v08 ? gl8.m29002g(vlaVarMo52911X.d0()) : gl8.m29001f(vlaVarMo52911X.d0()));
    }
}
