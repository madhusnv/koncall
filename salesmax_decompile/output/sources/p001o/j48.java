package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.List;
import p001o.m18;
import p001o.u6f;

/* loaded from: classes3.dex */
public abstract class j48 {

    /* renamed from: o.j48$a */
    public static final class C14448a extends o64 {

        /* renamed from: a */
        public Object f29764a;

        /* renamed from: b */
        public Object f29765b;

        /* renamed from: c */
        public Object f29766c;

        /* renamed from: d */
        public /* synthetic */ Object f29767d;

        /* renamed from: e */
        public int f29768e;

        public C14448a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f29767d = obj;
            this.f29768e |= Integer.MIN_VALUE;
            return j48.m33190e(null, false, this);
        }
    }

    /* renamed from: b */
    public static final g48 m33187b(s48 s48Var, ux7 ux7Var, m18 m18Var) {
        sq8.m48649h(s48Var, "status");
        sq8.m48649h(ux7Var, "headers");
        sq8.m48649h(m18Var, "body");
        return new oe5(s48Var, ux7Var, m18Var);
    }

    /* renamed from: c */
    public static final g48 m33188c(g48 g48Var, s48 s48Var, ux7 ux7Var, m18 m18Var) {
        sq8.m48649h(g48Var, "<this>");
        sq8.m48649h(s48Var, "status");
        sq8.m48649h(ux7Var, "headers");
        sq8.m48649h(m18Var, "body");
        return m33187b(s48Var, ux7Var, m18Var);
    }

    /* renamed from: d */
    public static /* synthetic */ g48 m33189d(g48 g48Var, s48 s48Var, ux7 ux7Var, m18 m18Var, int i, Object obj) {
        if ((i & 1) != 0) {
            s48Var = g48Var.getStatus();
        }
        if ((i & 2) != 0) {
            ux7Var = g48Var.getHeaders();
        }
        if ((i & 4) != 0) {
            m18Var = g48Var.getBody();
        }
        return m33188c(g48Var, s48Var, ux7Var, m18Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m33190e(g48 g48Var, boolean z, n64 n64Var) {
        C14448a c14448a;
        final t6f t6fVar;
        g48 g48Var2;
        t6f t6fVar2;
        if (n64Var instanceof C14448a) {
            c14448a = (C14448a) n64Var;
            int i = c14448a.f29768e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14448a.f29768e = i - Integer.MIN_VALUE;
            } else {
                c14448a = new C14448a(n64Var);
            }
        }
        Object obj = c14448a.f29767d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14448a.f29768e;
        if (i2 == 0) {
            wre.m54934b(obj);
            t6fVar = new t6f();
            u6f.C17307a.m51045b(t6fVar, "HTTP " + g48Var.getStatus() + "\r\n", 0, 0, 6, null);
            g48Var.getHeaders().mo17774d(new nl7() { // from class: o.i48
                @Override // p001o.nl7
                public final Object invoke(Object obj2, Object obj3) {
                    return j48.m33191f(t6fVar, (String) obj2, (List) obj3);
                }
            });
            u6f.C17307a.m51045b(t6fVar, "\r\n", 0, 0, 6, null);
            if (z) {
                m18 body = g48Var.getBody();
                if (body instanceof m18.AbstractC15193a) {
                    u6f.C17307a.m51044a(t6fVar, ((m18.AbstractC15193a) body).mo38177a(), 0, 0, 6, null);
                } else if ((body instanceof m18.AbstractC15194b) || (body instanceof m18.AbstractC15197e)) {
                    c14448a.f29764a = g48Var;
                    c14448a.f29765b = t6fVar;
                    c14448a.f29766c = g48Var;
                    c14448a.f29768e = 1;
                    Object objM39980a = n18.m39980a(body, c14448a);
                    if (objM39980a == objM51918f) {
                        return objM51918f;
                    }
                    g48Var2 = g48Var;
                    obj = objM39980a;
                    t6fVar2 = t6fVar;
                } else if (!(body instanceof m18.C15196d)) {
                    throw new szb();
                }
            }
            return vyh.m53620a(g48Var, t6fVar.m49490d());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g48Var = (g48) c14448a.f29766c;
        t6fVar2 = (t6f) c14448a.f29765b;
        g48 g48Var3 = (g48) c14448a.f29764a;
        wre.m54934b(obj);
        g48Var2 = g48Var3;
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            u6f.C17307a.m51044a(t6fVar2, bArr, 0, 0, 6, null);
            g48Var = m33189d(g48Var2, null, null, new sp1(bArr), 3, null);
        }
        t6fVar = t6fVar2;
        return vyh.m53620a(g48Var, t6fVar.m49490d());
    }

    /* renamed from: f */
    public static final y3i m33191f(t6f t6fVar, String str, List list) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(list, "values");
        u6f.C17307a.m51045b(t6fVar, kh3.p0(list, ";", str + ": ", "\r\n", 0, null, null, 56, null), 0, 0, 6, null);
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final String m33192g(d2e d2eVar, String str) {
        ux7 headers;
        sq8.m48649h(d2eVar, "<this>");
        sq8.m48649h(str, "name");
        g48 g48Var = d2eVar instanceof g48 ? (g48) d2eVar : null;
        if (g48Var == null || (headers = g48Var.getHeaders()) == null) {
            return null;
        }
        return (String) headers.get(str);
    }

    /* renamed from: h */
    public static final h48 m33193h(g48 g48Var) {
        sq8.m48649h(g48Var, "<this>");
        h48 h48Var = new h48();
        h48Var.m29801f(g48Var.getStatus());
        h48Var.m29799d().m59798e(g48Var.getHeaders());
        h48Var.m29800e(g48Var.getBody());
        return h48Var;
    }
}
