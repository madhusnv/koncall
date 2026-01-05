package p001o;

/* loaded from: classes2.dex */
public class ied implements ged {

    /* renamed from: a */
    public final Object[] f28565a;

    /* renamed from: b */
    public int f28566b;

    public ied(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f28565a = new Object[i];
    }

    @Override // p001o.ged
    /* renamed from: a */
    public boolean mo28525a(Object obj) {
        sq8.m48649h(obj, "instance");
        if (!(!m31996c(obj))) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i = this.f28566b;
        Object[] objArr = this.f28565a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f28566b = i + 1;
        return true;
    }

    @Override // p001o.ged
    /* renamed from: b */
    public Object mo28526b() {
        int i = this.f28566b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.f28565a[i2];
        sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f28565a[i2] = null;
        this.f28566b--;
        return obj;
    }

    /* renamed from: c */
    public final boolean m31996c(Object obj) {
        int i = this.f28566b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28565a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
