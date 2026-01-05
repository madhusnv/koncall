package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.vre;

/* loaded from: classes.dex */
public final class jg implements kha {

    /* renamed from: b */
    public static final C14523a f30373b = new C14523a(null);

    /* renamed from: c */
    public static final int f30374c = 8;

    /* renamed from: d */
    public static final jg f30375d = new jg();

    /* renamed from: a */
    public final cha f30376a;

    /* renamed from: o.jg$a */
    public static final class C14523a {
        public C14523a() {
        }

        public /* synthetic */ C14523a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final jg m33780a() {
            return m33781b();
        }

        /* renamed from: b */
        public final jg m33781b() {
            return jg.f30375d;
        }
    }

    /* renamed from: o.jg$b */
    public static final class C14524b extends cs1 {
        public C14524b() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo21693a(String str) {
            Object objM53351b;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            jg jgVar = jg.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(jgVar.m33778j(str));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            if (vre.m53354e(objM53351b) != null) {
                objM53351b = ch3.m21246k();
            }
            return (List) objM53351b;
        }
    }

    public jg() {
        cha chaVarM53305b = vr1.m53298y().m53305b(new C14524b());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f30376a = chaVarM53305b;
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f30376a.mo30511g(str) != null;
    }

    /* renamed from: f */
    public final void m33774f(String str, List list) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(list, "value");
        if (this.f30376a.mo30511g(str) == null) {
            this.f30376a.put(str, list);
            return;
        }
        List list2 = (List) this.f30376a.get(str);
        sq8.m48646e(list2);
        Set setU0 = kh3.U0(list2);
        setU0.addAll(list);
        this.f30376a.put(str, kh3.T0(setU0));
    }

    /* renamed from: g */
    public List m33775g(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object obj = this.f30376a.get(str);
        sq8.m48648g(obj, "get(...)");
        return kh3.T0((Collection) obj);
    }

    @Override // p001o.kha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List mo26400c(String str, Callable callable) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object obj = this.f30376a.get(str);
        sq8.m48648g(obj, "get(...)");
        return kh3.T0((Collection) obj);
    }

    @Override // p001o.kha
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo26401d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f30376a.mo30509d(str);
    }

    /* renamed from: j */
    public List m33778j(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return ch3.m21246k();
    }

    @Override // p001o.kha
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo26402e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f30376a.mo21259e(str);
    }
}
