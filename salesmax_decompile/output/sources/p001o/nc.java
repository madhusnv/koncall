package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p001o.vre;

/* loaded from: classes.dex */
public final class nc implements kha {

    /* renamed from: b */
    public static final C15536a f36666b = new C15536a(null);

    /* renamed from: c */
    public static final int f36667c = 8;

    /* renamed from: d */
    public static final nc f36668d = new nc();

    /* renamed from: a */
    public final cha f36669a;

    /* renamed from: o.nc$a */
    public static final class C15536a {
        public C15536a() {
        }

        public /* synthetic */ C15536a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final nc m40300a() {
            return m40301b();
        }

        /* renamed from: b */
        public final nc m40301b() {
            return nc.f36668d;
        }
    }

    /* renamed from: o.nc$b */
    public static final class C15537b extends cs1 {
        public C15537b() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Optional mo21693a(String str) {
            Object objM53351b;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            nc ncVar = nc.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(ncVar.m40297i(str));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            if (vre.m53354e(objM53351b) != null) {
                objM53351b = Optional.empty();
                sq8.m48648g(objM53351b, "empty(...)");
            }
            return (Optional) objM53351b;
        }
    }

    /* renamed from: o.nc$c */
    public static final class C15538c implements rl7 {

        /* renamed from: a */
        public static final C15538c f36671a = new C15538c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.nc$d */
    public static final class C15539d implements rl7 {

        /* renamed from: a */
        public static final C15539d f36672a = new C15539d();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.nc$e */
    public static final class C15540e implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f36673a;

        public C15540e(String str) {
            this.f36673a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(l1 l1Var) {
            String str = this.f36673a;
            StringBuilder sb = new StringBuilder();
            sb.append("Loading account fr id: ");
            sb.append(str);
            return Optional.ofNullable(l1Var.fg(this.f36673a));
        }
    }

    /* renamed from: o.nc$f */
    public static final class C15541f implements gu3 {

        /* renamed from: a */
        public static final C15541f f36674a = new C15541f();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    public nc() {
        cha chaVarM53305b = vr1.m53298y().m53326w(50L).m53309f(10L, TimeUnit.MINUTES).m53305b(new C15537b());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f36669a = chaVarM53305b;
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f36669a.mo30511g(str) != null;
    }

    @Override // p001o.kha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Optional mo26400c(String str, Callable callable) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return (Optional) this.f36669a.get(str);
    }

    @Override // p001o.kha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo26401d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f36669a.mo30509d(str);
    }

    /* renamed from: i */
    public final Optional m40297i(String str) {
        Object objM55727f = uni.LB().d0(C15538c.f36671a).d0(C15539d.f36672a).d0(new C15540e(str)).m55708A(C15541f.f36674a).y0(i5f.m31599c()).h0(i5f.m31599c()).m55727f();
        sq8.m48648g(objM55727f, "blockingFirst(...)");
        return (Optional) objM55727f;
    }

    /* renamed from: j */
    public final void m40298j(String str, Optional optional) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(optional, "value");
        this.f36669a.put(str, optional);
    }

    @Override // p001o.kha
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo26402e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f36669a.mo21259e(str);
    }
}
