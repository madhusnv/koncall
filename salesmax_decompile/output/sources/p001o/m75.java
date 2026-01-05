package p001o;

import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public abstract class m75 {
    /* renamed from: a */
    public static final void m38475a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final l75 m38476b(vb1 vb1Var) {
        return (l75) vb1Var.getClass().getAnnotation(l75.class);
    }

    /* renamed from: c */
    public static final int m38477c(vb1 vb1Var) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = vb1Var.getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(vb1Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m38478d(vb1 vb1Var) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strM36647c;
        sq8.m48649h(vb1Var, "<this>");
        l75 l75VarM38476b = m38476b(vb1Var);
        if (l75VarM38476b == null) {
            return null;
        }
        m38475a(1, l75VarM38476b.m36651v());
        int iM38477c = m38477c(vb1Var);
        int i = iM38477c < 0 ? -1 : l75VarM38476b.m36649l()[iM38477c];
        String strM39315b = mlb.f35649a.m39315b(vb1Var);
        if (strM39315b == null) {
            strM36647c = l75VarM38476b.m36647c();
        } else {
            strM36647c = strM39315b + '/' + l75VarM38476b.m36647c();
        }
        return new StackTraceElement(strM36647c, l75VarM38476b.m36650m(), l75VarM38476b.m36648f(), i);
    }
}
