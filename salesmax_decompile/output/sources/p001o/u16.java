package p001o;

import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class u16 {

    /* renamed from: a */
    public final String f48165a;

    /* renamed from: b */
    public final Function f48166b;

    /* renamed from: c */
    public final Function f48167c;

    /* renamed from: d */
    public final boolean f48168d;

    /* renamed from: e */
    public final Function f48169e;

    /* renamed from: f */
    public final Function f48170f;

    /* renamed from: g */
    public final t64 f48171g;

    /* renamed from: h */
    public final Function f48172h;

    /* renamed from: i */
    public final Function f48173i;

    /* renamed from: j */
    public final HashMap f48174j;

    public u16(String str, Function function, Function function2, boolean z, Function function3, Function function4, t64 t64Var, Function function5) {
        this.f48174j = new HashMap();
        this.f48165a = str;
        this.f48166b = function;
        this.f48167c = function2;
        this.f48168d = z;
        this.f48169e = function3;
        this.f48170f = function4;
        this.f48171g = t64Var;
        this.f48172h = function5;
        this.f48173i = null;
    }

    /* renamed from: a */
    public static double m50840a(double d, double d2) {
        double dM47897d = s64.m47897d(d, d2);
        double dM47895b = s64.m47895b(d, d2);
        double dM47898e = s64.m47898e(dM47897d, d);
        double dM47898e2 = s64.m47898e(dM47895b, d);
        if (m50842f(d)) {
            return (dM47898e >= d2 || dM47898e >= dM47898e2 || ((Math.abs(dM47898e - dM47898e2) > 0.1d ? 1 : (Math.abs(dM47898e - dM47898e2) == 0.1d ? 0 : -1)) < 0 && (dM47898e > d2 ? 1 : (dM47898e == d2 ? 0 : -1)) < 0 && (dM47898e2 > d2 ? 1 : (dM47898e2 == d2 ? 0 : -1)) < 0)) ? dM47897d : dM47895b;
        }
        return (dM47898e2 >= d2 || dM47898e2 >= dM47898e) ? dM47895b : dM47897d;
    }

    /* renamed from: b */
    public static u16 m50841b(String str, Function function, Function function2) {
        return new u16(str, function, function2, false, null, null, null, null);
    }

    /* renamed from: f */
    public static boolean m50842f(double d) {
        return Math.round(d) < 60;
    }

    /* renamed from: c */
    public int m50843c(i26 i26Var) {
        int iM34657g = m50844d(i26Var).m34657g();
        Function function = this.f48173i;
        if (function == null) {
            return iM34657g;
        }
        return (nza.m41314b(0, Constants.MAX_HOST_LENGTH, (int) Math.round(((Double) function.apply(i26Var)).doubleValue() * 255.0d)) << 24) | (iM34657g & 16777215);
    }

    /* renamed from: d */
    public jx7 m50844d(i26 i26Var) {
        jx7 jx7Var = (jx7) this.f48174j.get(i26Var);
        if (jx7Var != null) {
            return jx7Var;
        }
        jx7 jx7VarM27404d = ((frh) this.f48166b.apply(i26Var)).m27404d(m50845e(i26Var));
        if (this.f48174j.size() > 4) {
            this.f48174j.clear();
        }
        this.f48174j.put(i26Var, jx7VarM27404d);
        return jx7VarM27404d;
    }

    /* renamed from: e */
    public double m50845e(i26 i26Var) {
        double dMin;
        boolean z = i26Var.f27955e < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        Function function = this.f48172h;
        if (function == null) {
            double dDoubleValue = ((Double) this.f48167c.apply(i26Var)).doubleValue();
            Function function2 = this.f48169e;
            if (function2 == null) {
                return dDoubleValue;
            }
            double dM50845e = ((u16) function2.apply(i26Var)).m50845e(i26Var);
            double dM49426a = this.f48171g.m49426a(i26Var.f27955e);
            if (s64.m47898e(dM50845e, dDoubleValue) < dM49426a) {
                dDoubleValue = m50840a(dM50845e, dM49426a);
            }
            if (z) {
                dDoubleValue = m50840a(dM50845e, dM49426a);
            }
            double d = (!this.f48168d || 50.0d > dDoubleValue || dDoubleValue >= 60.0d) ? dDoubleValue : s64.m47898e(49.0d, dM50845e) >= dM49426a ? 49.0d : 60.0d;
            if (this.f48170f == null) {
                return d;
            }
            double dM50845e2 = ((u16) this.f48169e.apply(i26Var)).m50845e(i26Var);
            double dM50845e3 = ((u16) this.f48170f.apply(i26Var)).m50845e(i26Var);
            double dMax = Math.max(dM50845e2, dM50845e3);
            double dMin2 = Math.min(dM50845e2, dM50845e3);
            if (s64.m47898e(dMax, d) >= dM49426a && s64.m47898e(dMin2, d) >= dM49426a) {
                return d;
            }
            double dM47896c = s64.m47896c(dMax, dM49426a);
            double dM47894a = s64.m47894a(dMin2, dM49426a);
            ArrayList arrayList = new ArrayList();
            if (dM47896c != -1.0d) {
                arrayList.add(Double.valueOf(dM47896c));
            }
            if (dM47894a != -1.0d) {
                arrayList.add(Double.valueOf(dM47894a));
            }
            if (!(m50842f(dM50845e2) || m50842f(dM50845e3))) {
                return arrayList.size() == 1 ? ((Double) arrayList.get(0)).doubleValue() : dM47894a == -1.0d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : dM47894a;
            }
            if (dM47896c == -1.0d) {
                return 100.0d;
            }
            return dM47896c;
        }
        grh grhVar = (grh) function.apply(i26Var);
        u16 u16VarM29411c = grhVar.m29411c();
        u16 u16VarM29412d = grhVar.m29412d();
        double dM29409a = grhVar.m29409a();
        hrh hrhVarM29410b = grhVar.m29410b();
        boolean zM29413e = grhVar.m29413e();
        double dM50845e4 = ((u16) this.f48169e.apply(i26Var)).m50845e(i26Var);
        boolean z2 = hrhVarM29410b == hrh.NEARER || (hrhVarM29410b == hrh.LIGHTER && !i26Var.f27954d) || (hrhVarM29410b == hrh.DARKER && i26Var.f27954d);
        u16 u16Var = z2 ? u16VarM29411c : u16VarM29412d;
        u16 u16Var2 = z2 ? u16VarM29412d : u16VarM29411c;
        boolean zEquals = this.f48165a.equals(u16Var.f48165a);
        double d2 = i26Var.f27954d ? 1.0d : -1.0d;
        double dM49426a2 = u16Var.f48171g.m49426a(i26Var.f27955e);
        double dM49426a3 = u16Var2.f48171g.m49426a(i26Var.f27955e);
        double dDoubleValue2 = ((Double) u16Var.f48167c.apply(i26Var)).doubleValue();
        if (s64.m47898e(dM50845e4, dDoubleValue2) < dM49426a2) {
            dDoubleValue2 = m50840a(dM50845e4, dM49426a2);
        }
        double dM41313a = dDoubleValue2;
        double dDoubleValue3 = ((Double) u16Var2.f48167c.apply(i26Var)).doubleValue();
        if (s64.m47898e(dM50845e4, dDoubleValue3) < dM49426a3) {
            dDoubleValue3 = m50840a(dM50845e4, dM49426a3);
        }
        if (z) {
            dM41313a = m50840a(dM50845e4, dM49426a2);
            dDoubleValue3 = m50840a(dM50845e4, dM49426a3);
        }
        if ((dDoubleValue3 - dM41313a) * d2 < dM29409a) {
            double d3 = dM29409a * d2;
            dDoubleValue3 = nza.m41313a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d, dM41313a + d3);
            if ((dDoubleValue3 - dM41313a) * d2 < dM29409a) {
                dM41313a = nza.m41313a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d, dDoubleValue3 - d3);
            }
        }
        if (50.0d > dM41313a || dM41313a >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMin = dDoubleValue3;
            } else if (!zM29413e) {
                dMin = d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 60.0d : 49.0d;
            } else if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMin = Math.max(dDoubleValue3, (dM29409a * d2) + 60.0d);
                dM41313a = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (dM29409a * d2) + 49.0d);
                dM41313a = 49.0d;
            }
        } else if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            dM41313a = 60.0d;
            dMin = Math.max(dDoubleValue3, (dM29409a * d2) + 60.0d);
        } else {
            dMin = Math.min(dDoubleValue3, (dM29409a * d2) + 49.0d);
            dM41313a = 49.0d;
        }
        return zEquals ? dM41313a : dMin;
    }

    public u16(String str, Function function, Function function2, boolean z, Function function3, Function function4, t64 t64Var, Function function5, Function function6) {
        this.f48174j = new HashMap();
        this.f48165a = str;
        this.f48166b = function;
        this.f48167c = function2;
        this.f48168d = z;
        this.f48169e = function3;
        this.f48170f = function4;
        this.f48171g = t64Var;
        this.f48172h = function5;
        this.f48173i = function6;
    }
}
