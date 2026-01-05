package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.message.TokenParser;
import p001o.m18;
import p001o.u6f;

/* loaded from: classes3.dex */
public abstract class a48 {

    /* renamed from: o.a48$a */
    public static final class C12080a extends o64 {

        /* renamed from: a */
        public Object f14120a;

        /* renamed from: b */
        public Object f14121b;

        /* renamed from: c */
        public /* synthetic */ Object f14122c;

        /* renamed from: d */
        public int f14123d;

        public C12080a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f14122c = obj;
            this.f14123d |= Integer.MIN_VALUE;
            return a48.m16406b(null, null, this);
        }
    }

    /* renamed from: o.a48$b */
    public static final class C12081b extends m18.AbstractC15197e {

        /* renamed from: a */
        public final Long f14124a;

        /* renamed from: b */
        public final boolean f14125b;

        /* renamed from: c */
        public final boolean f14126c;

        /* renamed from: d */
        public final /* synthetic */ byte[] f14127d;

        public C12081b(m18 m18Var, byte[] bArr) {
            this.f14127d = bArr;
            this.f14124a = m18Var.getContentLength();
            this.f14125b = m18Var.isOneShot();
            this.f14126c = m18Var.isDuplex();
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.f14124a;
        }

        @Override // p001o.m18
        public boolean isDuplex() {
            return this.f14126c;
        }

        @Override // p001o.m18
        public boolean isOneShot() {
            return this.f14125b;
        }

        @Override // p001o.m18.AbstractC15197e
        public h8f readFrom() {
            return m7f.m38494c(this.f14127d);
        }
    }

    /* renamed from: o.a48$c */
    public static final class C12082c extends o64 {

        /* renamed from: a */
        public Object f14128a;

        /* renamed from: b */
        public Object f14129b;

        /* renamed from: c */
        public /* synthetic */ Object f14130c;

        /* renamed from: d */
        public int f14131d;

        public C12082c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f14130c = obj;
            this.f14131d |= Integer.MIN_VALUE;
            return a48.m16407c(null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m16406b(m18 m18Var, t6f t6fVar, n64 n64Var) {
        C12080a c12080a;
        if (n64Var instanceof C12080a) {
            c12080a = (C12080a) n64Var;
            int i = c12080a.f14123d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12080a.f14123d = i - Integer.MIN_VALUE;
            } else {
                c12080a = new C12080a(n64Var);
            }
        }
        Object objM39980a = c12080a.f14122c;
        Object objM51918f = uq8.m51918f();
        int i2 = c12080a.f14123d;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            c12080a.f14120a = m18Var;
            c12080a.f14121b = t6fVar;
            c12080a.f14123d = 1;
            objM39980a = n18.m39980a(m18Var, c12080a);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t6fVar = (t6f) c12080a.f14121b;
            m18Var = (m18) c12080a.f14120a;
            wre.m54934b(objM39980a);
        }
        t6f t6fVar2 = t6fVar;
        byte[] bArr = (byte[]) objM39980a;
        if (bArr == null) {
            return m18.C15196d.f34631a;
        }
        u6f.C17307a.m51044a(t6fVar2, bArr, 0, 0, 6, null);
        return new C12081b(m18Var, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m16407c(z38 z38Var, boolean z, n64 n64Var) {
        C12082c c12082c;
        t6f t6fVar;
        Long contentLength;
        z38 z38Var2;
        t6f t6fVar2;
        if (n64Var instanceof C12082c) {
            c12082c = (C12082c) n64Var;
            int i = c12082c.f14131d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12082c.f14131d = i - Integer.MIN_VALUE;
            } else {
                c12082c = new C12082c(n64Var);
            }
        }
        Object obj = c12082c.f14130c;
        Object objM51918f = uq8.m51918f();
        int i2 = c12082c.f14131d;
        if (i2 == 0) {
            wre.m54934b(obj);
            t6fVar = new t6f();
            u6f.C17307a.m51045b(t6fVar, z38Var.m58669f() + TokenParser.SP + z38Var.m58671h().m36768i() + "\r\n", 0, 0, 6, null);
            StringBuilder sb = new StringBuilder();
            sb.append("Host: ");
            sb.append(z38Var.m58671h().m36764e());
            sb.append("\r\n");
            u6f.C17307a.m51045b(t6fVar, sb.toString(), 0, 0, 6, null);
            String str = (String) z38Var.m58668e().m59804l("Content-Length");
            long jLongValue = ((str == null || (contentLength = d9g.m22640n(str)) == null) && (contentLength = z38Var.m58667d().getContentLength()) == null) ? 0L : contentLength.longValue();
            if (jLongValue > 0) {
                u6f.C17307a.m51045b(t6fVar, "Content-Length: " + jLongValue + "\r\n", 0, 0, 6, null);
            }
            Set setM40668i = nif.m40668i("Host", "Content-Length");
            Set setM59803k = z38Var.m58668e().m59803k();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj2 : setM59803k) {
                if (!setM40668i.contains(((Map.Entry) obj2).getKey())) {
                    arrayList.add(obj2);
                }
            }
            for (Map.Entry entry : arrayList) {
                String str2 = (String) entry.getKey();
                u6f.C17307a.m51045b(t6fVar, kh3.p0((List) entry.getValue(), ";", str2 + ": ", "\r\n", 0, null, null, 56, null), 0, 0, 6, null);
            }
            u6f.C17307a.m51045b(t6fVar, "\r\n", 0, 0, 6, null);
            if (z) {
                m18 m18VarM58667d = z38Var.m58667d();
                if (m18VarM58667d instanceof m18.AbstractC15193a) {
                    u6f.C17307a.m51044a(t6fVar, ((m18.AbstractC15193a) m18VarM58667d).mo38177a(), 0, 0, 6, null);
                } else if ((m18VarM58667d instanceof m18.AbstractC15194b) || (m18VarM58667d instanceof m18.AbstractC15197e)) {
                    m18 m18VarM58667d2 = z38Var.m58667d();
                    c12082c.f14128a = t6fVar;
                    c12082c.f14129b = z38Var;
                    c12082c.f14131d = 1;
                    Object objM16406b = m16406b(m18VarM58667d2, t6fVar, c12082c);
                    if (objM16406b == objM51918f) {
                        return objM51918f;
                    }
                    z38Var2 = z38Var;
                    t6fVar2 = t6fVar;
                    obj = objM16406b;
                } else if (!(m18VarM58667d instanceof m18.C15196d)) {
                    throw new szb();
                }
            }
            return t6fVar.m49490d();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z38Var2 = (z38) c12082c.f14129b;
        t6fVar2 = (t6f) c12082c.f14128a;
        wre.m54934b(obj);
        z38Var2.m58672i((m18) obj);
        t6fVar = t6fVar2;
        return t6fVar.m49490d();
    }

    /* renamed from: d */
    public static final void m16408d(z38 z38Var, String str, String str2) {
        sq8.m48649h(z38Var, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        z38Var.m58668e().m59796c(str, str2);
    }

    /* renamed from: e */
    public static final y38 m16409e(z38 z38Var, boolean z) {
        sq8.m48649h(z38Var, "<this>");
        return new e48(z38Var, z);
    }

    /* renamed from: f */
    public static /* synthetic */ y38 m16410f(z38 z38Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m16409e(z38Var, z);
    }

    /* renamed from: g */
    public static final void m16411g(z38 z38Var, l8i l8iVar) {
        sq8.m48649h(z38Var, "<this>");
        sq8.m48649h(l8iVar, "value");
        z38Var.m58671h().m36762c(l8iVar);
    }
}
