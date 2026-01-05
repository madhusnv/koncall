package p001o;

import java.util.HashMap;
import java.util.Map;
import p001o.c0f;

/* loaded from: classes2.dex */
public class bt6 extends c0f {

    /* renamed from: e */
    public final HashMap f16781e = new HashMap();

    public boolean contains(Object obj) {
        return this.f16781e.containsKey(obj);
    }

    @Override // p001o.c0f
    /* renamed from: d */
    public c0f.C12526c mo19711d(Object obj) {
        return (c0f.C12526c) this.f16781e.get(obj);
    }

    @Override // p001o.c0f
    /* renamed from: l */
    public Object mo19712l(Object obj, Object obj2) {
        c0f.C12526c c12526cMo19711d = mo19711d(obj);
        if (c12526cMo19711d != null) {
            return c12526cMo19711d.f17073b;
        }
        this.f16781e.put(obj, m20020j(obj, obj2));
        return null;
    }

    @Override // p001o.c0f
    /* renamed from: m */
    public Object mo19713m(Object obj) {
        Object objMo19713m = super.mo19713m(obj);
        this.f16781e.remove(obj);
        return objMo19713m;
    }

    /* renamed from: n */
    public Map.Entry m19714n(Object obj) {
        if (contains(obj)) {
            return ((c0f.C12526c) this.f16781e.get(obj)).f17075d;
        }
        return null;
    }
}
