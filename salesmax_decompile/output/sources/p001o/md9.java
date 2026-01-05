package p001o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p001o.nc9;

/* loaded from: classes4.dex */
public abstract class md9 {

    /* renamed from: a */
    public final Class f35204a;

    /* renamed from: b */
    public final Map f35205b;

    /* renamed from: c */
    public final Class f35206c;

    /* renamed from: o.md9$a */
    public static abstract class AbstractC15284a {

        /* renamed from: a */
        public final Class f35207a;

        public AbstractC15284a(Class cls) {
            this.f35207a = cls;
        }

        /* renamed from: a */
        public abstract Object mo20433a(rcb rcbVar);

        /* renamed from: b */
        public final Class m38758b() {
            return this.f35207a;
        }

        /* renamed from: c */
        public abstract rcb mo20434c(yq1 yq1Var);

        /* renamed from: d */
        public abstract void mo20435d(rcb rcbVar);
    }

    /* renamed from: o.md9$b */
    public static abstract class AbstractC15285b {

        /* renamed from: a */
        public final Class f35208a;

        public AbstractC15285b(Class cls) {
            this.f35208a = cls;
        }

        /* renamed from: a */
        public abstract Object mo20431a(Object obj);

        /* renamed from: b */
        public final Class m38759b() {
            return this.f35208a;
        }
    }

    public md9(Class cls, AbstractC15285b... abstractC15285bArr) {
        this.f35204a = cls;
        HashMap map = new HashMap();
        for (AbstractC15285b abstractC15285b : abstractC15285bArr) {
            if (map.containsKey(abstractC15285b.m38759b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + abstractC15285b.m38759b().getCanonicalName());
            }
            map.put(abstractC15285b.m38759b(), abstractC15285b);
        }
        if (abstractC15285bArr.length > 0) {
            this.f35206c = abstractC15285bArr[0].m38759b();
        } else {
            this.f35206c = Void.class;
        }
        this.f35205b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Class m38754a() {
        return this.f35206c;
    }

    /* renamed from: b */
    public final Class m38755b() {
        return this.f35204a;
    }

    /* renamed from: c */
    public abstract String mo20422c();

    /* renamed from: d */
    public final Object m38756d(rcb rcbVar, Class cls) {
        AbstractC15285b abstractC15285b = (AbstractC15285b) this.f35205b.get(cls);
        if (abstractC15285b != null) {
            return abstractC15285b.mo20431a(rcbVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: e */
    public abstract AbstractC15284a mo20423e();

    /* renamed from: f */
    public abstract nc9.EnumC15545c mo20424f();

    /* renamed from: g */
    public abstract rcb mo20425g(yq1 yq1Var);

    /* renamed from: h */
    public final Set m38757h() {
        return this.f35205b.keySet();
    }

    /* renamed from: i */
    public abstract void mo20426i(rcb rcbVar);
}
