package p001o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p001o.nvi;
import p001o.pp1;
import p001o.sl1;

/* loaded from: classes6.dex */
public class ul1 {

    /* renamed from: a */
    public HashMap f49049a = new HashMap();

    /* renamed from: b */
    public m8g f49050b = new m8g(true);

    /* renamed from: c */
    public ArrayList f49051c = new ArrayList();

    /* renamed from: o.ul1$a */
    public static class C17390a extends pp1.C16152a {

        /* renamed from: L */
        public int f49052L;

        /* renamed from: M */
        public HashMap f49053M;

        public C17390a(String str, int i) {
            super(str);
            this.f49053M = null;
            this.f49052L = i;
        }

        /* renamed from: i */
        public C17390a m51697i(Object obj) {
            HashMap map = this.f49053M;
            if (map == null) {
                return null;
            }
            return (C17390a) map.get(obj);
        }

        /* renamed from: j */
        public int m51698j() {
            return this.f49052L;
        }

        /* renamed from: k */
        public void m51699k(Object obj, C17390a c17390a) {
            if (this.f49053M == null) {
                this.f49053M = new HashMap();
            }
            this.f49053M.put(obj, c17390a);
        }
    }

    /* renamed from: a */
    public C17390a m51689a(String str, int i) {
        C17390a c17390a = new C17390a(str, i);
        this.f49049a.put(c17390a, c17390a);
        this.f49050b.m38567e(str, c17390a);
        while (i - this.f49051c.size() > 0) {
            this.f49051c.add(null);
        }
        this.f49051c.add(i, c17390a);
        return c17390a;
    }

    /* renamed from: b */
    public C17390a m51690b(int i) {
        if (i < 0 || i >= this.f49051c.size()) {
            return null;
        }
        return (C17390a) this.f49051c.get(i);
    }

    /* renamed from: c */
    public C17390a m51691c(String str) {
        return (C17390a) this.f49050b.m38564a(str);
    }

    /* renamed from: d */
    public C17390a m51692d(sl1 sl1Var) {
        return (C17390a) this.f49049a.get(sl1Var);
    }

    /* renamed from: e */
    public C17390a m51693e(byte[] bArr, int i, int i2) {
        Map.Entry entryM38565c = this.f49050b.m38565c(bArr, i, i2);
        if (entryM38565c != null) {
            return (C17390a) entryM38565c.getValue();
        }
        return null;
    }

    /* renamed from: f */
    public int m51694f(sl1 sl1Var) {
        if (sl1Var instanceof C17390a) {
            return ((C17390a) sl1Var).m51698j();
        }
        sl1 sl1VarM51696h = m51696h(sl1Var);
        if (sl1VarM51696h == null || !(sl1VarM51696h instanceof C17390a)) {
            return -1;
        }
        return ((C17390a) sl1VarM51696h).m51698j();
    }

    /* renamed from: g */
    public sl1 m51695g(String str) {
        C17390a c17390aM51691c = m51691c(str);
        return c17390aM51691c == null ? new C17390a(str, -1) : c17390aM51691c;
    }

    /* renamed from: h */
    public sl1 m51696h(sl1 sl1Var) {
        C17390a c17390aM51692d = m51692d(sl1Var);
        return c17390aM51692d == null ? sl1Var instanceof sl1.InterfaceC16857a ? sl1Var : new nvi.C15675a(sl1Var) : c17390aM51692d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CACHE[bufferMap=");
        stringBuffer.append(this.f49049a);
        stringBuffer.append(",stringMap=");
        stringBuffer.append(this.f49050b);
        stringBuffer.append(",index=");
        stringBuffer.append(this.f49051c);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
