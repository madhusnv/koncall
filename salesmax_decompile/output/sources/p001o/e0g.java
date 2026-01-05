package p001o;

/* loaded from: classes2.dex */
public abstract class e0g {

    /* renamed from: a */
    public static final Object f20717a = new Object();

    /* renamed from: c */
    public static final Object m24057c(d0g d0gVar, int i) {
        Object obj;
        sq8.m48649h(d0gVar, "<this>");
        int iM29727a = h14.m29727a(d0gVar.f18937b, d0gVar.f18939d, i);
        if (iM29727a < 0 || (obj = d0gVar.f18938c[iM29727a]) == f20717a) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static final void m24058d(d0g d0gVar) {
        int i = d0gVar.f18939d;
        int[] iArr = d0gVar.f18937b;
        Object[] objArr = d0gVar.f18938c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f20717a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        d0gVar.f18936a = false;
        d0gVar.f18939d = i2;
    }
}
