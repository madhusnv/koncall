package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;
import p001o.bs1;
import p001o.bt9;

/* loaded from: classes.dex */
public final class bt9 implements PreferenceChangeEventListener, ytb, o3d {

    /* renamed from: b */
    public static final C12492a f16783b = new C12492a(null);

    /* renamed from: c */
    public static final int f16784c = 8;

    /* renamed from: d */
    public static final bt9 f16785d = new bt9();

    /* renamed from: e */
    public static final kha f16786e = pu3.f40574b.m44184a();

    /* renamed from: f */
    public static final ReentrantReadWriteLock f16787f = new ReentrantReadWriteLock();

    /* renamed from: a */
    public volatile C12493b f16788a = new C12493b(false, null, false, false, false, 31, null);

    /* renamed from: o.bt9$a */
    public static final class C12492a {
        public C12492a() {
        }

        public /* synthetic */ C12492a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final bt9 m19757a() {
            return bt9.f16785d;
        }
    }

    /* renamed from: o.bt9$b */
    public static final class C12493b {

        /* renamed from: a */
        public boolean f16789a;

        /* renamed from: b */
        public Set f16790b;

        /* renamed from: c */
        public boolean f16791c;

        /* renamed from: d */
        public boolean f16792d;

        /* renamed from: e */
        public boolean f16793e;

        public C12493b(boolean z, Set set, boolean z2, boolean z3, boolean z4) {
            sq8.m48649h(set, "preferredSim");
            this.f16789a = z;
            this.f16790b = set;
            this.f16791c = z2;
            this.f16792d = z3;
            this.f16793e = z4;
        }

        /* renamed from: b */
        public static /* synthetic */ C12493b m19758b(C12493b c12493b, boolean z, Set set, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c12493b.f16789a;
            }
            if ((i & 2) != 0) {
                set = c12493b.f16790b;
            }
            Set set2 = set;
            if ((i & 4) != 0) {
                z2 = c12493b.f16791c;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                z3 = c12493b.f16792d;
            }
            boolean z6 = z3;
            if ((i & 16) != 0) {
                z4 = c12493b.f16793e;
            }
            return c12493b.m19759a(z, set2, z5, z6, z4);
        }

        /* renamed from: a */
        public final C12493b m19759a(boolean z, Set set, boolean z2, boolean z3, boolean z4) {
            sq8.m48649h(set, "preferredSim");
            return new C12493b(z, set, z2, z3, z4);
        }

        /* renamed from: c */
        public final boolean m19760c() {
            return this.f16793e;
        }

        /* renamed from: d */
        public final boolean m19761d() {
            return this.f16791c;
        }

        /* renamed from: e */
        public final Set m19762e() {
            return this.f16790b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12493b)) {
                return false;
            }
            C12493b c12493b = (C12493b) obj;
            return this.f16789a == c12493b.f16789a && sq8.m48644c(this.f16790b, c12493b.f16790b) && this.f16791c == c12493b.f16791c && this.f16792d == c12493b.f16792d && this.f16793e == c12493b.f16793e;
        }

        /* renamed from: f */
        public final boolean m19763f() {
            return this.f16792d;
        }

        /* renamed from: g */
        public final boolean m19764g() {
            return this.f16789a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        public int hashCode() {
            boolean z = this.f16789a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int iHashCode = ((r0 * 31) + this.f16790b.hashCode()) * 31;
            ?? r2 = this.f16791c;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            int i2 = (iHashCode + i) * 31;
            ?? r22 = this.f16792d;
            int i3 = r22;
            if (r22 != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            boolean z2 = this.f16793e;
            return i4 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            return "Tracking(trackUnknown=" + this.f16789a + ", preferredSim=" + this.f16790b + ", assigned=" + this.f16791c + ", singleSim=" + this.f16792d + ", all=" + this.f16793e + ")";
        }

        public /* synthetic */ C12493b(boolean z, Set set, boolean z2, boolean z3, boolean z4, int i, id5 id5Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new LinkedHashSet() : set, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
        }
    }

    /* renamed from: o.bt9$c */
    public /* synthetic */ class C12494c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16794a;

        static {
            int[] iArr = new int[PreferenceChangeEvent.EventType.values().length];
            try {
                iArr[PreferenceChangeEvent.EventType.PREF_TRACK_ALL_CALLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferenceChangeEvent.EventType.PREF_TRACK_ALL_CALLS_SPECIFIC_SIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferenceChangeEvent.EventType.PREF_KEEP_UNKNOWN_NUMBER_UNASSIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16794a = iArr;
        }
    }

    /* renamed from: o.bt9$d */
    public static final class C12495d extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ LeadsSummary f16795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12495d(LeadsSummary leadsSummary) {
            super(0);
            this.f16795a = leadsSummary;
        }

        /* renamed from: c */
        public static final void m19766c(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "$leadsSummary");
            for (String str : leadsSummary.getContactNumbers()) {
                bs1.C12483a c12483aM19674c = bs1.C12483a.m19674c(new bs1.C12483a(), leadsSummary, null, 2, null);
                kha khaVar = bt9.f16786e;
                sq8.m48647f(khaVar, "null cannot be cast to non-null type ai.salesmax.cache.ContactCache");
                ((pu3) khaVar).m44182l(str, c12483aM19674c.m19675a());
            }
        }

        @Override // p001o.uk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ayh invoke() {
            final LeadsSummary leadsSummary = this.f16795a;
            return ayh.Z2(new o83() { // from class: o.ct9
                @Override // p001o.o83
                public final void run() {
                    bt9.C12495d.m19766c(leadsSummary);
                }
            });
        }
    }

    /* renamed from: o.bt9$e */
    public static final class C12496e extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ String f16797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12496e(String str) {
            super(0);
            this.f16797b = str;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bs1 invoke() {
            return bt9.this.m19754v(this.f16797b);
        }
    }

    /* renamed from: o.bt9$f */
    public static final class C12497f implements rl7 {

        /* renamed from: a */
        public static final C12497f f16798a = new C12497f();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "it");
            return Optional.ofNullable(leadsSummary);
        }
    }

    /* renamed from: o.bt9$g */
    public static final class C12498g implements rl7 {

        /* renamed from: a */
        public static final C12498g f16799a = new C12498g();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "it");
            return Optional.ofNullable(leadsSummary);
        }
    }

    /* renamed from: o.bt9$h */
    public static final class C12499h extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ ey3 f16801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12499h(ey3 ey3Var) {
            super(0);
            this.f16801b = ey3Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bs1 invoke() {
            return bt9.this.m19755w(this.f16801b.m25836b(), this.f16801b.m25835a(), this.f16801b.m25840f(), this.f16801b.m25841g(), this.f16801b.m25839e(), this.f16801b.m25837c());
        }
    }

    /* renamed from: o.bt9$i */
    public static final class C12500i extends jgg implements xk7 {

        /* renamed from: a */
        public int f16802a;

        /* renamed from: b */
        public final /* synthetic */ Context f16803b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12500i(Context context, n64 n64Var) {
            super(1, n64Var);
            this.f16803b = context;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C12500i(this.f16803b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f16802a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C12500i) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: A */
    public static final void m19726A() {
        f16787f.writeLock().unlock();
    }

    /* renamed from: B */
    public static final vw9 m19727B() {
        return null;
    }

    /* renamed from: r */
    public static final bs1 m19740r(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "$tmp0");
        return (bs1) uk7Var.invoke();
    }

    /* renamed from: s */
    public static final LeadsSummary m19741s(bt9 bt9Var, ey3 ey3Var) {
        sq8.m48649h(bt9Var, "this$0");
        sq8.m48649h(ey3Var, "$contactNumber");
        vw9 vw9VarM19756x = bt9Var.m19756x(ey3Var);
        if (vw9VarM19756x != null) {
            return vw9VarM19756x.m53507b();
        }
        return null;
    }

    /* renamed from: t */
    public static final void m19742t() {
        f16787f.writeLock().unlock();
    }

    /* renamed from: u */
    public static final LeadsSummary m19743u() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final vw9 m19744y(ey3 ey3Var, bt9 bt9Var) {
        sq8.m48649h(ey3Var, "$contactNumber");
        sq8.m48649h(bt9Var, "this$0");
        C12493b c12493b = bt9Var.f16788a;
        StringBuilder sb = new StringBuilder();
        sb.append("Get lead request received with input ");
        sb.append(ey3Var);
        sb.append(" and preference was ");
        sb.append(c12493b);
        final C12499h c12499h = bt9Var.new C12499h(ey3Var);
        if (ey3Var.m25838d()) {
            kha khaVar = f16786e;
            if (!khaVar.mo26399a(ey3Var.m25836b()) && bt9Var.f16788a.m19764g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Lead is invalidated for request: ");
                sb2.append(ey3Var);
                khaVar.mo26401d(ey3Var.m25836b());
            } else if (ey3Var.m25838d()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Lead is refreshed for request: ");
                sb3.append(ey3Var);
                f16786e.mo26402e(ey3Var.m25836b());
            }
        }
        vw9 vw9Var = (vw9) f16786e.mo26400c(ey3Var.m25836b(), new Callable() { // from class: o.at9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bt9.m19745z(c12499h);
            }
        });
        if (vw9Var == null) {
            l07.f32907a.m36405b("getLead: Lead Not Found", hsa.m31056f(vyh.m53620a("contactNumber", ey3Var.m25836b())));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Contact received for request: ");
        sb4.append(ey3Var);
        sb4.append(" with response: ");
        sb4.append(vw9Var);
        return vw9Var;
    }

    /* renamed from: z */
    public static final bs1 m19745z(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "$tmp0");
        return (bs1) uk7Var.invoke();
    }

    /* renamed from: C */
    public final void m19746C(Prefs prefs, itf itfVar, Context context) {
        Set setU0;
        if (prefs != null) {
            boolean zM3264z = prefs.m3264z();
            String strM3263y = prefs.m3263y();
            boolean zM3219G = prefs.m3219G();
            boolean zM32773F = itfVar != null ? itfVar.m32773F() : false;
            if (sq8.m48644c(strM3263y, "-1")) {
                setU0 = new LinkedHashSet();
            } else {
                List listD0 = f9g.D0(strM3263y, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    Integer numM22638l = d9g.m22638l(f9g.Z0((String) it.next()).toString());
                    if (numM22638l != null) {
                        arrayList.add(numM22638l);
                    }
                }
                setU0 = kh3.U0(arrayList);
            }
            Set set = setU0;
            Set setM19748E = m19748E(set);
            itf itfVarM128d = SuperfoneApplication.f225c.m128d();
            this.f16788a = new C12493b(zM3264z, set, !zM3219G, zM32773F, m19747D(setM19748E, itfVarM128d != null ? itfVarM128d.m32771D() : null));
            StringBuilder sb = new StringBuilder();
            sb.append("Tracking preference is set for SIMs ");
            sb.append(set);
            sb.append(" with flag ");
            sb.append(zM3264z);
            sb.append(" having unassign: ");
            sb.append(zM3219G);
            sb.append(" and singleSim: ");
            sb.append(zM32773F);
            if (context != null) {
                p74.f39487a.m43079g(new C12500i(context, null));
            }
        }
    }

    /* renamed from: D */
    public final boolean m19747D(Set set, Set set2) {
        if ((set == null ? nif.m40664e() : set).size() == (set2 == null ? nif.m40664e() : set2).size()) {
            if ((set == null ? nif.m40664e() : set).containsAll(set2 == null ? nif.m40664e() : set2)) {
                if (set2 == null) {
                    set2 = nif.m40664e();
                }
                if (set == null) {
                    set = nif.m40664e();
                }
                if (set2.containsAll(set)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public final Set m19748E(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        itf itfVarM128d = SuperfoneApplication.f225c.m128d();
        Set setM32770C = itfVarM128d != null ? itfVarM128d.m32770C(set) : null;
        if (setM32770C != null) {
            linkedHashSet.addAll(setM32770C);
        }
        return linkedHashSet;
    }

    @Override // p001o.o3d
    /* renamed from: a */
    public void mo19749a(Context context) {
        sq8.m48649h(context, "context");
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        if (c0044a.m127c() != null) {
            itf itfVarM128d = c0044a.m128d();
            this.f16788a = C12493b.m19758b(this.f16788a, false, null, false, itfVarM128d != null ? itfVarM128d.m32773F() : false, false, 23, null);
        }
    }

    @Override // p001o.ytb
    /* renamed from: b */
    public void mo19750b(vtb vtbVar) {
        sq8.m48649h(vtbVar, "networkEvent");
    }

    /* renamed from: o */
    public final void m19751o(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "leadsSummary");
        p74.f39487a.m43074b(new C12495d(leadsSummary));
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent) {
        Set setU0;
        String strM3263y;
        Set setU02;
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append("Event received for preference update: ");
        sb.append(preferenceChangeEvent);
        if (preferenceChangeEvent != null) {
            PreferenceChangeEvent.EventType eventType = preferenceChangeEvent.getEventType();
            int i = eventType == null ? -1 : C12494c.f16794a[eventType.ordinal()];
            if (i == 1) {
                boolean zM39583a = mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue());
                Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
                String str = (prefsM127c == null || (strM3263y = prefsM127c.m3263y()) == null) ? "-1" : strM3263y;
                if (sq8.m48644c(str, "-1")) {
                    setU0 = new LinkedHashSet();
                } else {
                    List listD0 = f9g.D0(str, new String[]{","}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listD0.iterator();
                    while (it.hasNext()) {
                        Integer numM22638l = d9g.m22638l(f9g.Z0((String) it.next()).toString());
                        if (numM22638l != null) {
                            arrayList.add(numM22638l);
                        }
                    }
                    setU0 = kh3.U0(arrayList);
                }
                Set set = setU0;
                Set setM19748E = m19748E(set);
                itf itfVarM128d = SuperfoneApplication.f225c.m128d();
                this.f16788a = C12493b.m19758b(this.f16788a, zM39583a, set, false, false, m19747D(setM19748E, itfVarM128d != null ? itfVarM128d.m32771D() : null), 12, null);
            } else if (i == 2) {
                Object prefValue = preferenceChangeEvent.getPrefValue();
                String str2 = (prefValue == null || (string = prefValue.toString()) == null) ? "-1" : string;
                if (sq8.m48644c(str2, "-1")) {
                    setU02 = new LinkedHashSet();
                } else {
                    List listD02 = f9g.D0(str2, new String[]{","}, false, 0, 6, null);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = listD02.iterator();
                    while (it2.hasNext()) {
                        Integer numM22638l2 = d9g.m22638l(f9g.Z0((String) it2.next()).toString());
                        if (numM22638l2 != null) {
                            arrayList2.add(numM22638l2);
                        }
                    }
                    setU02 = kh3.U0(arrayList2);
                }
                Set set2 = setU02;
                Set setM19748E2 = m19748E(set2);
                itf itfVarM128d2 = SuperfoneApplication.f225c.m128d();
                this.f16788a = C12493b.m19758b(this.f16788a, false, set2, false, false, m19747D(setM19748E2, itfVarM128d2 != null ? itfVarM128d2.m32771D() : null), 13, null);
            } else if (i != 3) {
                PreferenceChangeEvent.EventType eventType2 = preferenceChangeEvent.getEventType();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown preference event type: ");
                sb2.append(eventType2);
            } else {
                this.f16788a = C12493b.m19758b(this.f16788a, false, null, !mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue()), false, false, 27, null);
            }
            C12493b c12493b = this.f16788a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Preference update for changes to the lead sourcing ");
            sb3.append(c12493b);
        }
    }

    /* renamed from: p */
    public final LeadsSummary m19752p(String str, String str2) {
        sq8.m48649h(str, "number");
        sq8.m48649h(str2, "contactId");
        final C12496e c12496e = new C12496e(str2);
        vw9 vw9Var = (vw9) f16786e.mo26400c(str, new Callable() { // from class: o.zs9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bt9.m19740r(c12496e);
            }
        });
        if (vw9Var != null) {
            return vw9Var.m53507b();
        }
        return null;
    }

    /* renamed from: q */
    public final LeadsSummary m19753q(ey3 ey3Var) {
        sq8.m48649h(ey3Var, "contactNumber");
        f16787f.writeLock().lock();
        return (LeadsSummary) ayh.H1(new ts9(this, ey3Var)).h3(new Runnable() { // from class: o.us9
            @Override // java.lang.Runnable
            public final void run() {
                bt9.m19742t();
            }
        }).B2(new Supplier() { // from class: o.vs9
            @Override // java.util.function.Supplier
            public final Object get() {
                return bt9.m19743u();
            }
        });
    }

    /* renamed from: v */
    public final bs1 m19754v(String str) {
        bs1.C12483a c12483a = new bs1.C12483a();
        try {
            Object objM47704k = lw9.c1(str).m47704k();
            sq8.m48648g(objM47704k, "blockingSingle(...)");
            bs1.C12483a.m19674c(c12483a, (LeadsSummary) objM47704k, null, 2, null);
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in fetch/create lead with id ");
            sb.append(str);
            c12483a.m19678e(Boolean.TRUE);
        }
        return c12483a.m19675a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bs1 m19755w(String str, String str2, String str3, Integer num, Integer num2, CallEvent.PhoneHandle phoneHandle) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bs1.C12483a c12483a = new bs1.C12483a();
        if (this.f16788a.m19764g()) {
            Set setM19748E = m19748E(this.f16788a.m19762e());
            if (kh3.m35708X(this.f16788a.m19762e(), num2) || this.f16788a.m19763f()) {
                z = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Phone handles available for tracking on the phone: ");
                sb.append(setM19748E);
                sb.append(" with eligibility: ");
                sb.append(z);
                if (!kh3.m35708X(this.f16788a.m19762e(), num2) || this.f16788a.m19763f()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Submitted request to load/create lead for: ");
                    sb2.append(str);
                    try {
                        Object objM55729h = lw9.m38023Z(str2, str, str3, Long.valueOf(!this.f16788a.m19761d() ? System.currentTimeMillis() : -1L), Boolean.TRUE).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).m55729h();
                        sq8.m48648g(objM55729h, "blockingSingle(...)");
                        bs1.C12483a.m19674c(c12483a, (LeadsSummary) objM55729h, null, 2, null);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Lead loaded/created for: ");
                        sb3.append(str);
                    } catch (Throwable th) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Exception in fetch/create lead with number ");
                        sb4.append(str);
                        Throwable cause = th.getCause();
                        if (sq8.m48644c(cause != null ? cause.getMessage() : null, "Could Not Add Lead. Number is marked as do not track!!!")) {
                            c12483a.m19677d(Boolean.TRUE);
                        } else {
                            c12483a.m19678e(Boolean.TRUE);
                        }
                    }
                } else {
                    if (!kh3.m35708X(setM19748E, phoneHandle != null ? phoneHandle.getId() : null) && !this.f16788a.m19760c()) {
                        try {
                            Object objM55729h2 = lw9.f1(str).d0(C12497f.f16798a).z0(x6c.c0(Optional.empty())).m55729h();
                            sq8.m48648g(objM55729h2, "blockingSingle(...)");
                            Optional optional = (Optional) objM55729h2;
                            if (!optional.isPresent()) {
                                optional = null;
                            }
                            if (optional != null) {
                                bs1.C12483a.m19674c(c12483a, (LeadsSummary) optional.get(), null, 2, null);
                            }
                        } catch (Throwable th2) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Exception in fetch/create lead with number ");
                            sb5.append(str);
                            if (th2 instanceof pv5) {
                                c12483a.m19677d(Boolean.TRUE);
                            } else {
                                c12483a.m19678e(Boolean.TRUE);
                            }
                        }
                    }
                }
            } else {
                if (!kh3.m35708X(setM19748E, phoneHandle != null ? phoneHandle.getId() : null) && !this.f16788a.m19760c()) {
                    z = false;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Phone handles available for tracking on the phone: ");
                sb6.append(setM19748E);
                sb6.append(" with eligibility: ");
                sb6.append(z);
                if (kh3.m35708X(this.f16788a.m19762e(), num2)) {
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("Submitted request to load/create lead for: ");
                    sb22.append(str);
                    Object objM55729h3 = lw9.m38023Z(str2, str, str3, Long.valueOf(!this.f16788a.m19761d() ? System.currentTimeMillis() : -1L), Boolean.TRUE).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).m55729h();
                    sq8.m48648g(objM55729h3, "blockingSingle(...)");
                    bs1.C12483a.m19674c(c12483a, (LeadsSummary) objM55729h3, null, 2, null);
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("Lead loaded/created for: ");
                    sb32.append(str);
                }
            }
        } else {
            try {
                Object objM55729h4 = lw9.f1(str).d0(C12498g.f16799a).z0(x6c.c0(Optional.empty())).m55729h();
                sq8.m48648g(objM55729h4, "blockingSingle(...)");
                Optional optional2 = (Optional) objM55729h4;
                if (!optional2.isPresent()) {
                    optional2 = null;
                }
                if (optional2 != null) {
                    bs1.C12483a.m19674c(c12483a, (LeadsSummary) optional2.get(), null, 2, null);
                }
            } catch (Throwable th3) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Exception in fetch/create lead with number ");
                sb7.append(str);
                if (th3 instanceof pv5) {
                    c12483a.m19677d(Boolean.TRUE);
                } else {
                    c12483a.m19678e(Boolean.TRUE);
                }
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Time taken to fetch contact from remote: ");
        sb8.append(jCurrentTimeMillis2);
        return c12483a.m19675a();
    }

    /* renamed from: x */
    public final vw9 m19756x(ey3 ey3Var) {
        sq8.m48649h(ey3Var, "contactNumber");
        f16787f.writeLock().lock();
        return (vw9) ayh.H1(new ws9(ey3Var, this)).h3(new Runnable() { // from class: o.xs9
            @Override // java.lang.Runnable
            public final void run() {
                bt9.m19726A();
            }
        }).B2(new Supplier() { // from class: o.ys9
            @Override // java.util.function.Supplier
            public final Object get() {
                return bt9.m19727B();
            }
        });
    }
}
