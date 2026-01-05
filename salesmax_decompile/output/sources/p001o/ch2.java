package p001o;

/* loaded from: classes6.dex */
public abstract class ch2 {

    /* renamed from: a */
    public final oo0 f18178a = new oo0();

    /* renamed from: b */
    public int f18179b;

    /* renamed from: a */
    public final void m21240a(char[] cArr) {
        sq8.m48649h(cArr, "array");
        synchronized (this) {
            if (this.f18179b + cArr.length < xo0.f53989a) {
                this.f18179b += cArr.length;
                this.f18178a.m42481o(cArr);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: b */
    public final char[] m21241b(int i) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f18178a.m42477R();
            if (cArr != null) {
                this.f18179b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
