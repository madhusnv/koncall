package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class r2g {

    /* renamed from: a */
    public final ArrayList f42788a = new ArrayList();

    /* renamed from: a */
    public final void m46070a() {
        this.f42788a.clear();
    }

    /* renamed from: b */
    public final int m46071b() {
        return this.f42788a.size();
    }

    /* renamed from: c */
    public final boolean m46072c() {
        return this.f42788a.isEmpty();
    }

    /* renamed from: d */
    public final boolean m46073d() {
        return !m46072c();
    }

    /* renamed from: e */
    public final Object m46074e() {
        return this.f42788a.get(m46071b() - 1);
    }

    /* renamed from: f */
    public final Object m46075f(int i) {
        return this.f42788a.get(i);
    }

    /* renamed from: g */
    public final Object m46076g() {
        return this.f42788a.remove(m46071b() - 1);
    }

    /* renamed from: h */
    public final boolean m46077h(Object obj) {
        return this.f42788a.add(obj);
    }

    /* renamed from: i */
    public final Object[] m46078i() {
        int size = this.f42788a.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.f42788a.get(i);
        }
        return objArr;
    }
}
