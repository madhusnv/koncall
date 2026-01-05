package p001o;

import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.vre;

/* loaded from: classes.dex */
public final class fbh implements kha {

    /* renamed from: b */
    public static final C13382a f23102b = new C13382a(null);

    /* renamed from: c */
    public static final int f23103c = 8;

    /* renamed from: d */
    public static final fbh f23104d = new fbh();

    /* renamed from: a */
    public final cha f23105a;

    /* renamed from: o.fbh$a */
    public static final class C13382a {
        public C13382a() {
        }

        public /* synthetic */ C13382a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fbh m26410a() {
            return m26411b();
        }

        /* renamed from: b */
        public final fbh m26411b() {
            return fbh.f23104d;
        }
    }

    /* renamed from: o.fbh$b */
    public interface InterfaceC13383b {
    }

    /* renamed from: o.fbh$c */
    public static final class C13384c implements InterfaceC13383b {

        /* renamed from: a */
        public final String f23106a;

        /* renamed from: b */
        public final String f23107b;

        public C13384c(String str, String str2) {
            sq8.m48649h(str, "teamId");
            sq8.m48649h(str2, "accountId");
            this.f23106a = str;
            this.f23107b = str2;
        }

        /* renamed from: a */
        public final String m26412a() {
            return this.f23107b;
        }

        /* renamed from: b */
        public final String m26413b() {
            return this.f23106a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13384c)) {
                return false;
            }
            C13384c c13384c = (C13384c) obj;
            return sq8.m48644c(this.f23106a, c13384c.f23106a) && sq8.m48644c(this.f23107b, c13384c.f23107b);
        }

        public int hashCode() {
            return (this.f23106a.hashCode() * 31) + this.f23107b.hashCode();
        }

        public String toString() {
            return "TeamKey(teamId=" + this.f23106a + ", accountId=" + this.f23107b + ")";
        }
    }

    /* renamed from: o.fbh$d */
    public static final class C13385d implements InterfaceC13383b {

        /* renamed from: a */
        public final String f23108a;

        /* renamed from: b */
        public final String f23109b;

        public C13385d(String str, String str2) {
            sq8.m48649h(str, "userId");
            sq8.m48649h(str2, "accountId");
            this.f23108a = str;
            this.f23109b = str2;
        }

        /* renamed from: a */
        public final String m26414a() {
            return this.f23109b;
        }

        /* renamed from: b */
        public final String m26415b() {
            return this.f23108a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13385d)) {
                return false;
            }
            C13385d c13385d = (C13385d) obj;
            return sq8.m48644c(this.f23108a, c13385d.f23108a) && sq8.m48644c(this.f23109b, c13385d.f23109b);
        }

        public int hashCode() {
            return (this.f23108a.hashCode() * 31) + this.f23109b.hashCode();
        }

        public String toString() {
            return "UserKey(userId=" + this.f23108a + ", accountId=" + this.f23109b + ")";
        }
    }

    /* renamed from: o.fbh$e */
    public static final class C13386e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13386e f23110a = new C13386e();

        public C13386e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TeamMember teamMember) {
            return Boolean.valueOf(teamMember.getTeamRole() == TeamRole.TEAM_LEADER || teamMember.getTeamRole() == TeamRole.SUPERBOSS);
        }
    }

    /* renamed from: o.fbh$f */
    public static final class C13387f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13387f f23111a = new C13387f();

        public C13387f() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TeamMember teamMember) {
            return Boolean.valueOf(teamMember.getTeamRole() == TeamRole.REPORTEE);
        }
    }

    /* renamed from: o.fbh$g */
    public static final class C13388g implements rl7 {

        /* renamed from: a */
        public static final C13388g f23112a = new C13388g();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.fbh$h */
    public static final class C13389h implements rl7 {

        /* renamed from: a */
        public static final C13389h f23113a = new C13389h();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.fbh$i */
    public static final class C13390i implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC13383b f23114a;

        public C13390i(InterfaceC13383b interfaceC13383b) {
            this.f23114a = interfaceC13383b;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.pb(((C13384c) this.f23114a).m26413b(), ((C13384c) this.f23114a).m26412a());
        }
    }

    /* renamed from: o.fbh$j */
    public static final class C13391j implements rl7 {

        /* renamed from: a */
        public static final C13391j f23115a = new C13391j();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.fbh$k */
    public static final class C13392k implements rl7 {

        /* renamed from: a */
        public static final C13392k f23116a = new C13392k();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.fbh$l */
    public static final class C13393l implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC13383b f23117a;

        public C13393l(InterfaceC13383b interfaceC13383b) {
            this.f23117a = interfaceC13383b;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.u4(((C13385d) this.f23117a).m26415b(), ((C13385d) this.f23117a).m26414a(), 1000);
        }
    }

    /* renamed from: o.fbh$m */
    public static final class C13394m extends cs1 {
        public C13394m() {
        }

        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo21693a(InterfaceC13383b interfaceC13383b) {
            sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
            fbh fbhVar = fbh.this;
            try {
                vre.C17665a c17665a = vre.f50797b;
                return fbhVar.m26408o(interfaceC13383b);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                Object objM53351b = vre.m53351b(wre.m54933a(th));
                if (vre.m53354e(objM53351b) != null) {
                    objM53351b = ch3.m21246k();
                }
                return (List) objM53351b;
            }
        }
    }

    public fbh() {
        cha chaVarM53305b = vr1.m53298y().m53305b(new C13394m());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f23105a = chaVarM53305b;
    }

    /* renamed from: k */
    public static final boolean m26397k(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: m */
    public static final boolean m26398m(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f23105a.mo30511g(str) != null;
    }

    /* renamed from: h */
    public List m26403h(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        List list = (List) this.f23105a.get(interfaceC13383b);
        sq8.m48646e(list);
        return list;
    }

    @Override // p001o.kha
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List mo26400c(InterfaceC13383b interfaceC13383b, Callable callable) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        return (List) this.f23105a.get(interfaceC13383b);
    }

    /* renamed from: j */
    public final List m26405j(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        Stream stream = ((List) this.f23105a.get(interfaceC13383b)).stream();
        final C13386e c13386e = C13386e.f23110a;
        Object objCollect = stream.filter(new Predicate() { // from class: o.dbh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return fbh.m26397k(c13386e, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    /* renamed from: l */
    public final List m26406l(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        Stream stream = ((List) this.f23105a.get(interfaceC13383b)).stream();
        final C13387f c13387f = C13387f.f23111a;
        Object objCollect = stream.filter(new Predicate() { // from class: o.ebh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return fbh.m26398m(c13387f, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    @Override // p001o.kha
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo26401d(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        this.f23105a.mo30509d(interfaceC13383b);
    }

    /* renamed from: o */
    public List m26408o(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        ArrayList arrayList = new ArrayList();
        if (interfaceC13383b instanceof C13385d) {
            Object objM55727f = uni.LB().d0(C13391j.f23115a).d0(C13392k.f23116a).m55717M(new C13393l(interfaceC13383b)).y0(i5f.m31599c()).h0(i5f.m31599c()).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            arrayList.addAll((List) objM55727f);
        } else if (interfaceC13383b instanceof C13384c) {
            Object objM55727f2 = uni.LB().d0(C13388g.f23112a).d0(C13389h.f23113a).m55717M(new C13390i(interfaceC13383b)).y0(i5f.m31599c()).h0(i5f.m31599c()).m55727f();
            sq8.m48648g(objM55727f2, "blockingFirst(...)");
            arrayList.addAll((List) objM55727f2);
        }
        return arrayList;
    }

    @Override // p001o.kha
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo26402e(InterfaceC13383b interfaceC13383b) {
        sq8.m48649h(interfaceC13383b, TransferTable.COLUMN_KEY);
        this.f23105a.mo21259e(interfaceC13383b);
    }
}
