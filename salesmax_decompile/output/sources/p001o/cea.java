package p001o;

/* loaded from: classes2.dex */
public final class cea {

    /* renamed from: a */
    public final Object f17999a;

    /* renamed from: b */
    public final Object f18000b;

    public cea(Object obj, Object obj2) {
        this.f17999a = obj;
        this.f18000b = obj2;
    }

    /* renamed from: a */
    public final boolean m21066a() {
        return this.f18000b != x76.f53298a;
    }

    /* renamed from: b */
    public final boolean m21067b() {
        return this.f17999a != x76.f53298a;
    }

    /* renamed from: c */
    public final Object m21068c() {
        return this.f18000b;
    }

    /* renamed from: d */
    public final Object m21069d() {
        return this.f17999a;
    }

    /* renamed from: e */
    public final cea m21070e(Object obj) {
        return new cea(this.f17999a, obj);
    }

    /* renamed from: f */
    public final cea m21071f(Object obj) {
        return new cea(obj, this.f18000b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cea() {
        x76 x76Var = x76.f53298a;
        this(x76Var, x76Var);
    }

    public cea(Object obj) {
        this(obj, x76.f53298a);
    }
}
