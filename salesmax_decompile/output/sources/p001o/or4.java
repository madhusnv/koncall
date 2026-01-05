package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.ActiveProfile;
import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.model.HomeLeaderBoard;
import ai.salesmax.model.HomeProgressList;
import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.model.SavedTableViewInfoList;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import androidx.lifecycle.AbstractC2139h;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import p001o.or4;

/* loaded from: classes.dex */
public final class or4 {

    /* renamed from: a */
    public final boolean f38746a;

    /* renamed from: b */
    public final boolean f38747b;

    /* renamed from: c */
    public final boolean f38748c;

    /* renamed from: d */
    public final boolean f38749d;

    /* renamed from: e */
    public final boolean f38750e;

    /* renamed from: f */
    public final boolean f38751f;

    /* renamed from: g */
    public final boolean f38752g;

    /* renamed from: h */
    public final boolean f38753h;

    /* renamed from: i */
    public LinkedHashMap f38754i;

    /* renamed from: j */
    public final LinkedList f38755j;

    /* renamed from: k */
    public Integer f38756k;

    /* renamed from: l */
    public Integer f38757l;

    /* renamed from: m */
    public Integer f38758m;

    /* renamed from: n */
    public Integer f38759n;

    /* renamed from: o */
    public Integer f38760o;

    /* renamed from: p */
    public Integer f38761p;

    /* renamed from: q */
    public Integer f38762q;

    /* renamed from: r */
    public hpb f38763r;

    /* renamed from: s */
    public hpb f38764s;

    /* renamed from: t */
    public hpb f38765t;

    /* renamed from: u */
    public hpb f38766u;

    /* renamed from: v */
    public hpb f38767v;

    /* renamed from: w */
    public hpb f38768w;

    /* renamed from: x */
    public hpb f38769x;

    /* renamed from: y */
    public final z9b f38770y;

    /* renamed from: z */
    public xk7 f38771z;

    /* renamed from: o.or4$a */
    public static final class C15873a extends kf9 implements xk7 {
        public C15873a() {
            super(1);
        }

        /* renamed from: a */
        public final void m42578a(ActiveProfile activeProfile) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42568o(), activeProfile, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42578a((ActiveProfile) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$b */
    public static final class C15874b extends kf9 implements xk7 {
        public C15874b() {
            super(1);
        }

        /* renamed from: a */
        public final void m42579a(HomeLeaderBoard homeLeaderBoard) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42564k(), homeLeaderBoard, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42579a((HomeLeaderBoard) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$c */
    public static final class C15875c extends kf9 implements xk7 {
        public C15875c() {
            super(1);
        }

        /* renamed from: a */
        public final void m42580a(HomeProgressList homeProgressList) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42562i(), homeProgressList, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42580a((HomeProgressList) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$d */
    public static final class C15876d extends kf9 implements xk7 {
        public C15876d() {
            super(1);
        }

        /* renamed from: a */
        public final void m42581a(HomeTasksStatus homeTasksStatus) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42563j(), homeTasksStatus, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42581a((HomeTasksStatus) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$e */
    public static final class C15877e extends kf9 implements xk7 {
        public C15877e() {
            super(1);
        }

        /* renamed from: a */
        public final void m42582a(uwi uwiVar) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42566m(), uwiVar, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42582a((uwi) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$f */
    public static final class C15878f extends kf9 implements xk7 {
        public C15878f() {
            super(1);
        }

        /* renamed from: a */
        public final void m42583a(AutoCompleteListModel autoCompleteListModel) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42560g(), autoCompleteListModel, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42583a((AutoCompleteListModel) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$g */
    public static final class C15879g extends kf9 implements xk7 {
        public C15879g() {
            super(1);
        }

        /* renamed from: a */
        public final void m42584a(SavedTableViewInfoList savedTableViewInfoList) {
            or4.this.m42561h().setValue(uyh.of(or4.this.m42567n(), savedTableViewInfoList, Boolean.TRUE));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42584a((SavedTableViewInfoList) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$h */
    public static final class C15880h extends kf9 implements xk7 {
        public C15880h() {
            super(1);
        }

        /* renamed from: c */
        public static final void m42586c(syh syhVar, or4 or4Var) {
            sq8.m48649h(syhVar, "$it");
            sq8.m48649h(or4Var, "this$0");
            Object obj = syhVar.f46121a;
            if (obj != null) {
                sq8.m48648g(obj, "_1");
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = syhVar.f46122b;
                sq8.m48648g(obj2, "_2");
                Object obj3 = syhVar.f46123c;
                sq8.m48648g(obj3, "_3");
                or4Var.m42558e(iIntValue, obj2, ((Boolean) obj3).booleanValue());
            }
        }

        /* renamed from: b */
        public final void m42587b(final syh syhVar) {
            sq8.m48649h(syhVar, "it");
            sq8.m48648g(String.format(" eventInserter - Observe dashboard data list index: %s", Arrays.copyOf(new Object[]{syhVar.f46121a}, 1)), "format(...)");
            final or4 or4Var = or4.this;
            j0f.m33008i(new Runnable() { // from class: o.pr4
                @Override // java.lang.Runnable
                public final void run() {
                    or4.C15880h.m42586c(syhVar, or4Var);
                }
            });
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42587b((syh) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.or4$i */
    public static final class C15881i implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f38780a;

        public C15881i(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f38780a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f38780a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38780a.invoke(obj);
        }
    }

    public or4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f38746a = z;
        this.f38747b = z2;
        this.f38748c = z3;
        this.f38749d = z4;
        this.f38750e = z5;
        this.f38751f = z6;
        this.f38752g = z7;
        this.f38753h = z8;
        this.f38754i = new LinkedHashMap();
        this.f38755j = new LinkedList();
        this.f38763r = new hpb(new ActiveProfile(null, null, null, null, 15, null));
        this.f38764s = new hpb(new HomeLeaderBoard(null, null, 3, null));
        this.f38765t = new hpb(new HomeProgressList(null, null, null, null, 15, null));
        this.f38766u = new hpb(new HomeTasksStatus(null, null, null, null, null, false, 63, null));
        int i = 0;
        this.f38767v = new hpb(new uwi(null, false, 3, null));
        this.f38768w = new hpb(new AutoCompleteListModel(null, null, 3, null));
        this.f38769x = new hpb(new SavedTableViewInfoList(null, false, 3, null));
        z9b z9bVar = new z9b();
        this.f38770y = z9bVar;
        if (z6) {
            this.f38761p = 0;
            LinkedHashMap linkedHashMap = this.f38754i;
            sq8.m48646e(0);
            linkedHashMap.put(0, this.f38768w);
            i = 1;
        }
        if (z) {
            Integer numValueOf = Integer.valueOf(i);
            this.f38757l = numValueOf;
            LinkedHashMap linkedHashMap2 = this.f38754i;
            sq8.m48646e(numValueOf);
            linkedHashMap2.put(numValueOf, this.f38763r);
            i++;
        }
        if (z3) {
            Integer numValueOf2 = Integer.valueOf(i);
            this.f38756k = numValueOf2;
            LinkedHashMap linkedHashMap3 = this.f38754i;
            sq8.m48646e(numValueOf2);
            linkedHashMap3.put(numValueOf2, this.f38765t);
            i++;
        }
        if (z5) {
            Integer numValueOf3 = Integer.valueOf(i);
            this.f38760o = numValueOf3;
            LinkedHashMap linkedHashMap4 = this.f38754i;
            sq8.m48646e(numValueOf3);
            linkedHashMap4.put(numValueOf3, this.f38767v);
            i++;
        }
        if (z4) {
            Integer numValueOf4 = Integer.valueOf(i);
            this.f38758m = numValueOf4;
            LinkedHashMap linkedHashMap5 = this.f38754i;
            sq8.m48646e(numValueOf4);
            linkedHashMap5.put(numValueOf4, this.f38766u);
            i++;
        }
        if (z8) {
            Integer numValueOf5 = Integer.valueOf(i);
            this.f38762q = numValueOf5;
            LinkedHashMap linkedHashMap6 = this.f38754i;
            sq8.m48646e(numValueOf5);
            linkedHashMap6.put(numValueOf5, this.f38769x);
            i++;
        }
        if (z2) {
            Integer numValueOf6 = Integer.valueOf(i);
            this.f38759n = numValueOf6;
            LinkedHashMap linkedHashMap7 = this.f38754i;
            sq8.m48646e(numValueOf6);
            linkedHashMap7.put(numValueOf6, this.f38764s);
        }
        z9bVar.addSource(this.f38763r, new C15881i(new C15873a()));
        z9bVar.addSource(this.f38764s, new C15881i(new C15874b()));
        z9bVar.addSource(this.f38765t, new C15881i(new C15875c()));
        z9bVar.addSource(this.f38766u, new C15881i(new C15876d()));
        z9bVar.addSource(this.f38767v, new C15881i(new C15877e()));
        z9bVar.addSource(this.f38768w, new C15881i(new C15878f()));
        z9bVar.addSource(this.f38769x, new C15881i(new C15879g()));
        this.f38771z = new C15880h();
    }

    /* renamed from: a */
    public final void m42554a(xca xcaVar, ResultsChangeListener resultsChangeListener) {
        sq8.m48649h(xcaVar, "lifecycleOwner");
        sq8.m48649h(resultsChangeListener, "changeListener");
        this.f38755j.add(resultsChangeListener);
    }

    /* renamed from: b */
    public final void m42555b() {
        this.f38754i.clear();
        this.f38755j.clear();
        m42556c();
    }

    /* renamed from: c */
    public final void m42556c() {
        xk7 xk7Var = this.f38771z;
        StringBuilder sb = new StringBuilder();
        sb.append("Disabling event inserter ");
        sb.append(xk7Var);
        xk7 xk7Var2 = this.f38771z;
        if (xk7Var2 != null) {
            this.f38770y.removeObserver(new C15881i(xk7Var2));
        }
    }

    /* renamed from: d */
    public final void m42557d(xca xcaVar) {
        sq8.m48649h(xcaVar, "lifecycleOwner");
        AbstractC2139h.b bVarMo6522b = xcaVar.getLifecycle().mo6522b();
        xk7 xk7Var = this.f38771z;
        StringBuilder sb = new StringBuilder();
        sb.append("Enabling event inserter ");
        sb.append(bVarMo6522b);
        sb.append("-");
        sb.append(xk7Var);
        xk7 xk7Var2 = this.f38771z;
        if (xk7Var2 != null) {
            this.f38770y.observe(xcaVar, new C15881i(xk7Var2));
        }
    }

    /* renamed from: e */
    public final void m42558e(int i, Object obj, boolean z) {
        sq8.m48649h(obj, "obj");
        for (ResultsChangeListener resultsChangeListener : this.f38755j) {
            StringBuilder sb = new StringBuilder();
            sb.append("firing alerts ");
            sb.append(obj);
            sb.append(" to listener ");
            sb.append(resultsChangeListener);
            if (z) {
                resultsChangeListener.fireUpdatedEvent(ch3.m21242g(obj), i);
            } else {
                resultsChangeListener.fireInsertedEvent(ch3.m21242g(obj), i);
            }
        }
    }

    /* renamed from: f */
    public final Object m42559f(int i) {
        hpb hpbVar = (hpb) this.f38754i.get(Integer.valueOf(i));
        if (hpbVar != null) {
            return hpbVar.getValue();
        }
        return null;
    }

    /* renamed from: g */
    public final Integer m42560g() {
        return this.f38761p;
    }

    /* renamed from: h */
    public final z9b m42561h() {
        return this.f38770y;
    }

    /* renamed from: i */
    public final Integer m42562i() {
        return this.f38756k;
    }

    /* renamed from: j */
    public final Integer m42563j() {
        return this.f38758m;
    }

    /* renamed from: k */
    public final Integer m42564k() {
        return this.f38759n;
    }

    /* renamed from: l */
    public final int m42565l() {
        return this.f38754i.size();
    }

    /* renamed from: m */
    public final Integer m42566m() {
        return this.f38760o;
    }

    /* renamed from: n */
    public final Integer m42567n() {
        return this.f38762q;
    }

    /* renamed from: o */
    public final Integer m42568o() {
        return this.f38757l;
    }

    /* renamed from: p */
    public final boolean m42569p() {
        return this.f38752g;
    }

    /* renamed from: q */
    public final void m42570q(ResultsChangeListener resultsChangeListener) {
        sq8.m48649h(resultsChangeListener, "changeListener");
        this.f38755j.remove(resultsChangeListener);
    }

    /* renamed from: r */
    public final void m42571r(ActiveProfile activeProfile) {
        Context contextM3259u;
        sq8.m48649h(activeProfile, "welcomeProfile");
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        if (prefsM127c != null && (contextM3259u = prefsM127c.m3259u()) != null) {
            activeProfile.reloadPermissionIssues(contextM3259u);
        }
        this.f38763r.setValue(activeProfile);
    }

    /* renamed from: s */
    public final void m42572s(AutoCompleteListModel autoCompleteListModel) {
        sq8.m48649h(autoCompleteListModel, "autoListModel");
        this.f38768w.setValue(autoCompleteListModel);
    }

    /* renamed from: t */
    public final void m42573t(HomeLeaderBoard homeLeaderBoard) {
        sq8.m48649h(homeLeaderBoard, "leaderBoard");
        this.f38764s.setValue(homeLeaderBoard);
    }

    /* renamed from: u */
    public final void m42574u(HomeProgressList homeProgressList) {
        sq8.m48649h(homeProgressList, "hpList");
        this.f38765t.setValue(homeProgressList);
    }

    /* renamed from: v */
    public final void m42575v(HomeTasksStatus homeTasksStatus) {
        sq8.m48649h(homeTasksStatus, "homeTasksStatus");
        this.f38766u.setValue(homeTasksStatus);
    }

    /* renamed from: w */
    public final void m42576w(SavedTableViewInfoList savedTableViewInfoList) {
        sq8.m48649h(savedTableViewInfoList, "viewInfoList");
        this.f38769x.setValue(savedTableViewInfoList);
    }

    /* renamed from: x */
    public final void m42577x(uwi uwiVar) {
        sq8.m48649h(uwiVar, "vItems");
        this.f38767v.setValue(uwiVar);
    }

    public /* synthetic */ or4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, id5 id5Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) == 0 ? z6 : true, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
