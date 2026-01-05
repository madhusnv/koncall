package p001o;

import java.io.IOException;

/* loaded from: classes6.dex */
public class a38 extends IOException {

    /* renamed from: a */
    public int f14091a;

    /* renamed from: b */
    public String f14092b;

    public a38(int i) {
        this.f14091a = i;
        this.f14092b = null;
    }

    /* renamed from: a */
    public String m16374a() {
        return this.f14092b;
    }

    /* renamed from: b */
    public int m16375b() {
        return this.f14091a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HttpException(");
        stringBuffer.append(this.f14091a);
        stringBuffer.append(",");
        stringBuffer.append(this.f14092b);
        stringBuffer.append(",");
        stringBuffer.append(super.getCause());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public a38(int i, String str) {
        this.f14091a = i;
        this.f14092b = str;
    }

    public a38(int i, String str, Throwable th) {
        this.f14091a = i;
        this.f14092b = str;
        initCause(th);
    }
}
