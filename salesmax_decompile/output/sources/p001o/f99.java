package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes6.dex */
public abstract class f99 {
    /* renamed from: a */
    public static final p79 m26298a(p79 p79Var, xk7 xk7Var) {
        sq8.m48649h(p79Var, Constants.MessagePayloadKeys.FROM);
        sq8.m48649h(xk7Var, "builderAction");
        s79 s79Var = new s79(p79Var);
        xk7Var.invoke(s79Var);
        return new d99(s79Var.m47944a(), s79Var.m47945b());
    }

    /* renamed from: b */
    public static /* synthetic */ p79 m26299b(p79 p79Var, xk7 xk7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            p79Var = p79.f39513d;
        }
        return m26298a(p79Var, xk7Var);
    }
}
