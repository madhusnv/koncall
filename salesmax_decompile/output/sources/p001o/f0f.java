package p001o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class f0f implements gi9, Serializable {

    /* renamed from: d */
    public static final C13305a f22497d = new C13305a(null);

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f22498e = AtomicReferenceFieldUpdater.newUpdater(f0f.class, Object.class, "b");

    /* renamed from: a */
    public volatile uk7 f22499a;

    /* renamed from: b */
    public volatile Object f22500b;

    /* renamed from: c */
    public final Object f22501c;

    /* renamed from: o.f0f$a */
    public static final class C13305a {
        public C13305a() {
        }

        public /* synthetic */ C13305a(id5 id5Var) {
            this();
        }
    }

    public f0f(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "initializer");
        this.f22499a = uk7Var;
        u0i u0iVar = u0i.f48151a;
        this.f22500b = u0iVar;
        this.f22501c = u0iVar;
    }

    private final Object writeReplace() {
        return new oi8(getValue());
    }

    @Override // p001o.gi9
    public Object getValue() {
        Object obj = this.f22500b;
        u0i u0iVar = u0i.f48151a;
        if (obj != u0iVar) {
            return obj;
        }
        uk7 uk7Var = this.f22499a;
        if (uk7Var != null) {
            Object objInvoke = uk7Var.invoke();
            if (j9.m33417a(f22498e, this, u0iVar, objInvoke)) {
                this.f22499a = null;
                return objInvoke;
            }
        }
        return this.f22500b;
    }

    @Override // p001o.gi9
    public boolean isInitialized() {
        return this.f22500b != u0i.f48151a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
