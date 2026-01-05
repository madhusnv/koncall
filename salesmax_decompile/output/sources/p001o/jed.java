package p001o;

/* loaded from: classes2.dex */
public class jed implements hed {

    /* renamed from: a */
    public final Object[] f30292a;

    /* renamed from: b */
    public int f30293b;

    public jed(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f30292a = new Object[i];
    }

    @Override // p001o.hed
    /* renamed from: a */
    public boolean mo30308a(Object obj) {
        int i = this.f30293b;
        Object[] objArr = this.f30292a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f30293b = i + 1;
        return true;
    }

    @Override // p001o.hed
    /* renamed from: b */
    public Object mo30309b() {
        int i = this.f30293b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f30292a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f30293b = i - 1;
        return obj;
    }

    @Override // p001o.hed
    /* renamed from: c */
    public void mo30310c(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f30293b;
            Object[] objArr2 = this.f30292a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f30293b = i3 + 1;
            }
        }
    }
}
