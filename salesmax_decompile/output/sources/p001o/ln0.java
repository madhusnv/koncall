package p001o;

/* loaded from: classes6.dex */
public class ln0 {

    /* renamed from: a */
    public final int f34097a;

    /* renamed from: b */
    public final Object[] f34098b;

    /* renamed from: c */
    public Object[] f34099c;

    /* renamed from: d */
    public int f34100d;

    /* renamed from: o.ln0$a */
    public interface InterfaceC15107a extends ggd {
        @Override // p001o.ggd
        boolean test(Object obj);
    }

    public ln0(int i) {
        this.f34097a = i;
        Object[] objArr = new Object[i + 1];
        this.f34098b = objArr;
        this.f34099c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m37506a(m9c m9cVar) {
        Object[] objArr = this.f34098b;
        int i = this.f34097a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (d3c.acceptFull(objArr2, m9cVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public void m37507b(Object obj) {
        int i = this.f34097a;
        int i2 = this.f34100d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f34099c[i] = objArr;
            this.f34099c = objArr;
            i2 = 0;
        }
        this.f34099c[i2] = obj;
        this.f34100d = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m37508c(InterfaceC15107a interfaceC15107a) {
        int i = this.f34097a;
        for (Object[] objArr = this.f34098b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (interfaceC15107a.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m37509d(Object obj) {
        this.f34098b[0] = obj;
    }
}
