package p001o;

/* loaded from: classes2.dex */
public abstract class fb implements gb {

    /* renamed from: a */
    public String f23063a;

    /* renamed from: b */
    public final int[] f23064b = new int[2];

    /* renamed from: c */
    public final int[] m26351c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f23064b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* renamed from: d */
    public final String m26352d() {
        String str = this.f23063a;
        if (str != null) {
            return str;
        }
        sq8.m48667z("text");
        return null;
    }

    /* renamed from: e */
    public void mo5125e(String str) {
        sq8.m48649h(str, "text");
        m26353f(str);
    }

    /* renamed from: f */
    public final void m26353f(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f23063a = str;
    }
}
