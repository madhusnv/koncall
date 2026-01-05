package p001o;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class gd7 extends xle {

    /* renamed from: d */
    public static final C13683b f25002d = new C13683b(null);

    /* renamed from: e */
    public static final y9b f25003e = y9b.f55104e.m57403a("application/x-www-form-urlencoded");

    /* renamed from: b */
    public final List f25004b;

    /* renamed from: c */
    public final List f25005c;

    /* renamed from: o.gd7$a */
    public static final class C13682a {

        /* renamed from: a */
        public final Charset f25006a;

        /* renamed from: b */
        public final List f25007b;

        /* renamed from: c */
        public final List f25008c;

        /* JADX WARN: Multi-variable type inference failed */
        public C13682a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final C13682a m28475a(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            this.f25007b.add(fgj.m26670d(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f25006a, 91, null));
            this.f25008c.add(fgj.m26670d(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f25006a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final C13682a m28476b(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            this.f25007b.add(fgj.m26670d(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f25006a, 83, null));
            this.f25008c.add(fgj.m26670d(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f25006a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final gd7 m28477c() {
            return new gd7(this.f25007b, this.f25008c);
        }

        public C13682a(Charset charset) {
            this.f25006a = charset;
            this.f25007b = new ArrayList();
            this.f25008c = new ArrayList();
        }

        public /* synthetic */ C13682a(Charset charset, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: o.gd7$b */
    public static final class C13683b {
        public C13683b() {
        }

        public /* synthetic */ C13683b(id5 id5Var) {
            this();
        }
    }

    public gd7(List list, List list2) {
        sq8.m48649h(list, "encodedNames");
        sq8.m48649h(list2, "encodedValues");
        this.f25004b = jgj.m33829w(list);
        this.f25005c = jgj.m33829w(list2);
    }

    @Override // p001o.xle
    /* renamed from: a */
    public long mo18953a() {
        return m28474j(null, true);
    }

    @Override // p001o.xle
    /* renamed from: b */
    public y9b mo18954b() {
        return f25003e;
    }

    @Override // p001o.xle
    /* renamed from: i */
    public void mo18955i(gm1 gm1Var) throws EOFException {
        sq8.m48649h(gm1Var, "sink");
        m28474j(gm1Var, false);
    }

    /* renamed from: j */
    public final long m28474j(gm1 gm1Var, boolean z) throws EOFException {
        rl1 buffer;
        if (z) {
            buffer = new rl1();
        } else {
            sq8.m48646e(gm1Var);
            buffer = gm1Var.getBuffer();
        }
        int size = this.f25004b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.T1(38);
            }
            buffer.n0((String) this.f25004b.get(i));
            buffer.T1(61);
            buffer.n0((String) this.f25005c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jF0 = buffer.f0();
        buffer.clear();
        return jF0;
    }
}
