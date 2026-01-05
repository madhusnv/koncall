package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public abstract class kf7 extends qf7 implements rr1 {
    @Override // p001o.rr1
    /* renamed from: a */
    public ConcurrentMap mo21258a() {
        return mo30539k().mo21258a();
    }

    @Override // p001o.rr1
    /* renamed from: c */
    public Object mo30508c(Object obj, Callable callable) {
        return mo30539k().mo30508c(obj, callable);
    }

    @Override // p001o.rr1
    /* renamed from: d */
    public void mo30509d(Object obj) {
        mo30539k().mo30509d(obj);
    }

    @Override // p001o.rr1
    /* renamed from: f */
    public void mo30510f() {
        mo30539k().mo30510f();
    }

    @Override // p001o.rr1
    /* renamed from: g */
    public Object mo30511g(Object obj) {
        return mo30539k().mo30511g(obj);
    }

    /* renamed from: k */
    public abstract rr1 mo30539k();

    @Override // p001o.rr1
    public void put(Object obj, Object obj2) {
        mo30539k().put(obj, obj2);
    }
}
