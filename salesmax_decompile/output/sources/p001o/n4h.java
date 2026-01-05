package p001o;

import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Optional;
import java.util.concurrent.Callable;
import p001o.vre;

/* loaded from: classes.dex */
public final class n4h implements kha {

    /* renamed from: b */
    public static final C15492a f36372b = new C15492a(null);

    /* renamed from: c */
    public static final int f36373c = 8;

    /* renamed from: d */
    public static final n4h f36374d = new n4h();

    /* renamed from: a */
    public final cha f36375a;

    /* renamed from: o.n4h$a */
    public static final class C15492a {
        public C15492a() {
        }

        public /* synthetic */ C15492a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final n4h m40084a() {
            return m40085b();
        }

        /* renamed from: b */
        public final n4h m40085b() {
            return n4h.f36374d;
        }
    }

    /* renamed from: o.n4h$b */
    public static final class C15493b implements rl7 {

        /* renamed from: a */
        public static final C15493b f36376a = new C15493b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.n4h$c */
    public static final class C15494c implements rl7 {

        /* renamed from: a */
        public static final C15494c f36377a = new C15494c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.n4h$d */
    public static final class C15495d implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f36378a;

        public C15495d(String str) {
            this.f36378a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.s5(this.f36378a);
        }
    }

    /* renamed from: o.n4h$e */
    public static final class C15496e implements rl7 {

        /* renamed from: a */
        public static final C15496e f36379a = new C15496e();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(Team team) {
            sq8.m48649h(team, "it");
            return Optional.ofNullable(team);
        }
    }

    /* renamed from: o.n4h$f */
    public static final class C15497f implements rl7 {

        /* renamed from: a */
        public static final C15497f f36380a = new C15497f();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(Throwable th) {
            sq8.m48649h(th, "it");
            return Optional.empty();
        }
    }

    /* renamed from: o.n4h$g */
    public static final class C15498g extends cs1 {
        public C15498g() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Optional mo21693a(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            n4h n4hVar = n4h.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                return n4hVar.m40082i(str);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                Object objM53351b = vre.m53351b(wre.m54933a(th));
                if (vre.m53354e(objM53351b) != null) {
                    objM53351b = Optional.empty();
                }
                sq8.m48648g(objM53351b, "getOrElse(...)");
                return (Optional) objM53351b;
            }
        }
    }

    public n4h() {
        cha chaVarM53305b = vr1.m53298y().m53305b(new C15498g());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f36375a = chaVarM53305b;
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f36375a.mo30511g(str) != null;
    }

    /* renamed from: f */
    public Optional m40079f(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object obj = this.f36375a.get(str);
        sq8.m48648g(obj, "get(...)");
        return (Optional) obj;
    }

    @Override // p001o.kha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Optional mo26400c(String str, Callable callable) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return (Optional) this.f36375a.get(str);
    }

    @Override // p001o.kha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo26401d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f36375a.mo30509d(str);
    }

    /* renamed from: i */
    public Optional m40082i(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object objM55727f = uni.LB().d0(C15493b.f36376a).d0(C15494c.f36377a).m55717M(new C15495d(str)).d0(C15496e.f36379a).j0(C15497f.f36380a).y0(i5f.m31599c()).h0(i5f.m31599c()).m55727f();
        sq8.m48648g(objM55727f, "blockingFirst(...)");
        return (Optional) objM55727f;
    }

    @Override // p001o.kha
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo26402e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f36375a.mo21259e(str);
    }
}
