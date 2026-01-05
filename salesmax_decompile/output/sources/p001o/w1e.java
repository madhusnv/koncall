package p001o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class w1e {

    /* renamed from: c */
    public static final w1e f51295c = new w1e();

    /* renamed from: b */
    public final ConcurrentMap f51297b = new ConcurrentHashMap();

    /* renamed from: a */
    public final q5f f51296a = new ypa();

    /* renamed from: a */
    public static w1e m53800a() {
        return f51295c;
    }

    /* renamed from: b */
    public o5f m53801b(Class cls, o5f o5fVar) {
        xn8.m56500b(cls, "messageType");
        xn8.m56500b(o5fVar, "schema");
        return (o5f) this.f51297b.putIfAbsent(cls, o5fVar);
    }

    /* renamed from: c */
    public o5f m53802c(Class cls) {
        xn8.m56500b(cls, "messageType");
        o5f o5fVar = (o5f) this.f51297b.get(cls);
        if (o5fVar != null) {
            return o5fVar;
        }
        o5f o5fVarMo44828a = this.f51296a.mo44828a(cls);
        o5f o5fVarM53801b = m53801b(cls, o5fVarMo44828a);
        return o5fVarM53801b != null ? o5fVarM53801b : o5fVarMo44828a;
    }

    /* renamed from: d */
    public o5f m53803d(Object obj) {
        return m53802c(obj.getClass());
    }
}
