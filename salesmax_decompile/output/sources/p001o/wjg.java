package p001o;

/* loaded from: classes6.dex */
public abstract class wjg {

    /* renamed from: a */
    public final String f52238a;

    /* renamed from: b */
    public final boolean f52239b;

    /* renamed from: c */
    public tog f52240c;

    /* renamed from: d */
    public long f52241d;

    public wjg(String str, boolean z) {
        sq8.m48649h(str, "name");
        this.f52238a = str;
        this.f52239b = z;
        this.f52241d = -1L;
    }

    /* renamed from: a */
    public final boolean m54641a() {
        return this.f52239b;
    }

    /* renamed from: b */
    public final String m54642b() {
        return this.f52238a;
    }

    /* renamed from: c */
    public final long m54643c() {
        return this.f52241d;
    }

    /* renamed from: d */
    public final tog m54644d() {
        return this.f52240c;
    }

    /* renamed from: e */
    public final void m54645e(tog togVar) {
        sq8.m48649h(togVar, "queue");
        tog togVar2 = this.f52240c;
        if (togVar2 == togVar) {
            return;
        }
        if (!(togVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f52240c = togVar;
    }

    /* renamed from: f */
    public abstract long mo16932f();

    /* renamed from: g */
    public final void m54646g(long j) {
        this.f52241d = j;
    }

    public String toString() {
        return this.f52238a;
    }

    public /* synthetic */ wjg(String str, boolean z, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
