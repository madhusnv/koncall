package p001o;

import java.util.Arrays;
import p001o.p9g;

/* loaded from: classes6.dex */
public final class da9 {

    /* renamed from: a */
    public Object[] f19487a = new Object[8];

    /* renamed from: b */
    public int[] f19488b;

    /* renamed from: c */
    public int f19489c;

    /* renamed from: o.da9$a */
    public static final class C12853a {

        /* renamed from: a */
        public static final C12853a f19490a = new C12853a();
    }

    public da9() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f19488b = iArr;
        this.f19489c = -1;
    }

    /* renamed from: a */
    public final String m22677a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.f19489c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f19487a[i2];
            if (obj instanceof uef) {
                uef uefVar = (uef) obj;
                if (!sq8.m48644c(uefVar.getKind(), p9g.C16038b.f39682a)) {
                    int i3 = this.f19488b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(uefVar.mo16763e(i3));
                    }
                } else if (this.f19488b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.f19488b[i2]);
                    sb.append("]");
                }
            } else if (obj != C12853a.f19490a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final void m22678b() {
        int i = this.f19489c;
        int[] iArr = this.f19488b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f19489c = i - 1;
        }
        int i2 = this.f19489c;
        if (i2 != -1) {
            this.f19489c = i2 - 1;
        }
    }

    /* renamed from: c */
    public final void m22679c(uef uefVar) {
        sq8.m48649h(uefVar, "sd");
        int i = this.f19489c + 1;
        this.f19489c = i;
        if (i == this.f19487a.length) {
            m22681e();
        }
        this.f19487a[i] = uefVar;
    }

    /* renamed from: d */
    public final void m22680d() {
        int[] iArr = this.f19488b;
        int i = this.f19489c;
        if (iArr[i] == -2) {
            this.f19487a[i] = C12853a.f19490a;
        }
    }

    /* renamed from: e */
    public final void m22681e() {
        int i = this.f19489c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f19487a, i);
        sq8.m48648g(objArrCopyOf, "copyOf(...)");
        this.f19487a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f19488b, i);
        sq8.m48648g(iArrCopyOf, "copyOf(...)");
        this.f19488b = iArrCopyOf;
    }

    /* renamed from: f */
    public final void m22682f(Object obj) {
        int[] iArr = this.f19488b;
        int i = this.f19489c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f19489c = i2;
            if (i2 == this.f19487a.length) {
                m22681e();
            }
        }
        Object[] objArr = this.f19487a;
        int i3 = this.f19489c;
        objArr[i3] = obj;
        this.f19488b[i3] = -2;
    }

    /* renamed from: g */
    public final void m22683g(int i) {
        this.f19488b[this.f19489c] = i;
    }

    public String toString() {
        return m22677a();
    }
}
