package p001o;

import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Optional;
import java.util.concurrent.Callable;
import p001o.vre;

/* loaded from: classes.dex */
public final class gci implements kha {

    /* renamed from: b */
    public static final C13678a f24985b = new C13678a(null);

    /* renamed from: c */
    public static final int f24986c = 8;

    /* renamed from: d */
    public static final gci f24987d = new gci();

    /* renamed from: a */
    public final cha f24988a;

    /* renamed from: o.gci$a */
    public static final class C13678a {
        public C13678a() {
        }

        public /* synthetic */ C13678a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final gci m28455a() {
            return m28456b();
        }

        /* renamed from: b */
        public final gci m28456b() {
            return gci.f24987d;
        }
    }

    /* renamed from: o.gci$b */
    public static final class C13679b extends cs1 {
        public C13679b() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Optional mo21693a(String str) {
            Object objM53351b;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            gci gciVar = gci.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(gciVar.m28452i(str));
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

    /* renamed from: o.gci$c */
    public static final class C13680c implements qpi {
    }

    public gci() {
        cha chaVarM53305b = vr1.m53298y().m53305b(new C13679b());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f24988a = chaVarM53305b;
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f24988a.mo30511g(str) != null;
    }

    /* renamed from: f */
    public Optional m28449f(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        tji.f47295d.m50080a().n0(str);
        Object obj = this.f24988a.get(str);
        sq8.m48648g(obj, "get(...)");
        return (Optional) obj;
    }

    @Override // p001o.kha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Optional mo26400c(String str, Callable callable) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        tji.f47295d.m50080a().n0(str);
        return (Optional) this.f24988a.get(str);
    }

    @Override // p001o.kha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo26401d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f24988a.mo30509d(str);
    }

    /* renamed from: i */
    public Optional m28452i(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object objM47704k = new C13680c().Os(str).m47704k();
        sq8.m48648g(objM47704k, "blockingSingle(...)");
        Optional optionalOfNullable = Optional.ofNullable((User) objM47704k);
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    /* renamed from: j */
    public final void m28453j(String str, Optional optional) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(optional, "value");
        this.f24988a.put(str, optional);
    }

    @Override // p001o.kha
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo26402e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f24988a.mo21259e(str);
    }
}
