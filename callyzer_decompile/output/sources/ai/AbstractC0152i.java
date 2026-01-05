package ai;

import bi.C0665d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import hi.m1;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.nd;
import p020v.a1;
import qc.C6158d;
import qw.C6366p;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.i */
/* loaded from: classes.dex */
public abstract class AbstractC0152i {

    /* renamed from: a */
    public final Object f483a;

    /* renamed from: b */
    public final Serializable f484b;

    /* renamed from: c */
    public final Object f485c;

    public AbstractC0152i(AbstractC8894w database) {
        AbstractC4154l.m8923f(database, "database");
        this.f483a = database;
        this.f484b = new AtomicBoolean(false);
        this.f485c = nd.m10782c(new C6158d(21, this));
    }

    /* renamed from: a */
    public C4680j m347a() {
        ((AbstractC8894w) this.f483a).m16387a();
        return ((AtomicBoolean) this.f484b).compareAndSet(false, true) ? (C4680j) ((C6366p) this.f485c).getValue() : m348b();
    }

    /* renamed from: b */
    public C4680j m348b() {
        String strMo349c = mo349c();
        AbstractC8894w abstractC8894w = (AbstractC8894w) this.f483a;
        abstractC8894w.getClass();
        abstractC8894w.m16387a();
        abstractC8894w.m16388b();
        return abstractC8894w.m16392k().mo9273O().mo9264t(strMo349c);
    }

    /* renamed from: c */
    public abstract String mo349c();

    /* renamed from: d */
    public abstract String mo350d();

    /* renamed from: e */
    public Object m351e(AbstractC1374a abstractC1374a, Class cls) {
        C0665d c0665d = (C0665d) ((Map) this.f485c).get(cls);
        if (c0665d != null) {
            return c0665d.m1936a(abstractC1374a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: f */
    public abstract AbstractC0151h mo352f();

    /* renamed from: g */
    public abstract m1 mo353g();

    /* renamed from: h */
    public abstract AbstractC1374a mo354h(AbstractC1382i abstractC1382i);

    /* renamed from: i */
    public void m355i(C4680j statement) {
        AbstractC4154l.m8923f(statement, "statement");
        if (statement == ((C4680j) ((C6366p) this.f485c).getValue())) {
            ((AtomicBoolean) this.f484b).set(false);
        }
    }

    /* renamed from: j */
    public abstract void mo356j(AbstractC1374a abstractC1374a);

    public AbstractC0152i(Class cls, C0665d... c0665dArr) {
        this.f483a = cls;
        HashMap map = new HashMap();
        for (C0665d c0665d : c0665dArr) {
            Class cls2 = c0665d.f4217a;
            if (!map.containsKey(cls2)) {
                map.put(cls2, c0665d);
            } else {
                throw new IllegalArgumentException(a1.m14329i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (c0665dArr.length > 0) {
            this.f484b = c0665dArr[0].f4217a;
        } else {
            this.f484b = Void.class;
        }
        this.f485c = Collections.unmodifiableMap(map);
    }
}
