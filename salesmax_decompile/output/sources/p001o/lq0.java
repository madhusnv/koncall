package p001o;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.DistributionData;
import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.LeadsUser;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.User;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC10973a;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.lq0;

/* loaded from: classes.dex */
public abstract class lq0 {

    /* renamed from: o.lq0$a */
    public static final class C15125a implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f34201a;

        public C15125a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f34201a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f34201a;
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
            this.f34201a.invoke(obj);
        }
    }

    /* renamed from: o.lq0$b */
    public static final class C15126b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ gge f34202a;

        /* renamed from: b */
        public final /* synthetic */ xmf f34203b;

        /* renamed from: o.lq0$b$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f34204a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsUser invoke(LeadTeamMember leadTeamMember) {
                return leadTeamMember.getMemberUser();
            }
        }

        /* renamed from: o.lq0$b$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f34205a = new b();

            public b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(LeadsUser leadsUser) {
                return Boolean.valueOf(leadsUser != null);
            }
        }

        /* renamed from: o.lq0$b$c */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f34206a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34206a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15126b(gge ggeVar, xmf xmfVar) {
            super(1);
            this.f34202a = ggeVar;
            this.f34203b = xmfVar;
        }

        /* renamed from: e */
        public static final void m37688e(yne yneVar, gge ggeVar, xmf xmfVar) {
            sq8.m48649h(ggeVar, "$allColleaguesExcludingYourself");
            sq8.m48649h(xmfVar, "$binding");
            Object objM58023a = yneVar.m58023a();
            sq8.m48646e(objM58023a);
            Stream stream = ((List) objM58023a).stream();
            final a aVar = a.f34204a;
            Stream map = stream.map(new Function() { // from class: o.nq0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lq0.C15126b.m37689f(aVar, obj);
                }
            });
            final b bVar = b.f34205a;
            List list = (List) map.filter(new Predicate() { // from class: o.oq0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return lq0.C15126b.m37690g(bVar, obj);
                }
            }).collect(Collectors.toList());
            ggeVar.f25106a = list;
            sq8.m48646e(list);
            if (list.isEmpty()) {
                xmfVar.q0.setVisibility(8);
            }
        }

        /* renamed from: f */
        public static final LeadsUser m37689f(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (LeadsUser) xk7Var.invoke(obj);
        }

        /* renamed from: g */
        public static final boolean m37690g(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: d */
        public final void m37691d(final yne yneVar) {
            if (yneVar != null) {
                final gge ggeVar = this.f34202a;
                final xmf xmfVar = this.f34203b;
                if (c.f34206a[yneVar.m58025c().ordinal()] != 1) {
                    return;
                }
                j0f.m33008i(new Runnable() { // from class: o.mq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lq0.C15126b.m37688e(yneVar, ggeVar, xmfVar);
                    }
                });
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m37691d((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: A */
    public static final void m37652A(DialogC10973a dialogC10973a, View view) {
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        dialogC10973a.dismiss();
    }

    /* renamed from: B */
    public static final void m37653B(ege egeVar, gge ggeVar, xmf xmfVar, gge ggeVar2, gge ggeVar3, gge ggeVar4, CompoundButton compoundButton, boolean z) {
        sq8.m48649h(egeVar, "$mPos");
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$mSelectTeam");
        sq8.m48649h(ggeVar3, "$mSelectUser");
        sq8.m48649h(ggeVar4, "$mSelectDistribution");
        if (z) {
            egeVar.f21602a = 1;
            ggeVar.f25106a = qq0.assign_to_yourself.toString();
            xmfVar.O0.setChecked(true);
            xmfVar.P0.setChecked(false);
            xmfVar.Q0.setChecked(false);
            xmfVar.R0.setChecked(false);
            xmfVar.S0.setChecked(false);
        } else {
            ggeVar.f25106a = "";
        }
        xmfVar.p0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.n0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.o0.setVisibility(8);
        xmfVar.Y0.setText("");
        AppCompatImageView appCompatImageView = xmfVar.W0;
        sq8.m48648g(appCompatImageView, "mATClose");
        if (appCompatImageView.getVisibility() == 0) {
            xmfVar.W0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = xmfVar.U0;
        sq8.m48648g(appCompatImageView2, "mACClose");
        if (appCompatImageView2.getVisibility() == 0) {
            xmfVar.U0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = xmfVar.V0;
        sq8.m48648g(appCompatImageView3, "mADClose");
        if (appCompatImageView3.getVisibility() == 0) {
            xmfVar.V0.setVisibility(8);
        }
        xmfVar.Z0.setEnabled(true);
        xmfVar.Y0.setEnabled(true);
        xmfVar.X0.setEnabled(true);
        ggeVar2.f25106a = null;
        ggeVar3.f25106a = null;
        ggeVar4.f25106a = null;
    }

    /* renamed from: C */
    public static final void m37654C(View view) {
    }

    /* renamed from: D */
    public static final void m37655D(ege egeVar, gge ggeVar, xmf xmfVar, gge ggeVar2, gge ggeVar3, gge ggeVar4, CompoundButton compoundButton, boolean z) {
        sq8.m48649h(egeVar, "$mPos");
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$mSelectTeam");
        sq8.m48649h(ggeVar3, "$mSelectUser");
        sq8.m48649h(ggeVar4, "$mSelectDistribution");
        if (z) {
            egeVar.f21602a = 2;
            ggeVar.f25106a = qq0.assign_later.toString();
            xmfVar.P0.setChecked(true);
            xmfVar.O0.setChecked(false);
            xmfVar.Q0.setChecked(false);
            xmfVar.R0.setChecked(false);
            xmfVar.S0.setChecked(false);
        } else {
            ggeVar.f25106a = "";
        }
        xmfVar.p0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.n0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.o0.setVisibility(8);
        xmfVar.Y0.setText("");
        AppCompatImageView appCompatImageView = xmfVar.W0;
        sq8.m48648g(appCompatImageView, "mATClose");
        if (appCompatImageView.getVisibility() == 0) {
            xmfVar.W0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = xmfVar.U0;
        sq8.m48648g(appCompatImageView2, "mACClose");
        if (appCompatImageView2.getVisibility() == 0) {
            xmfVar.U0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = xmfVar.V0;
        sq8.m48648g(appCompatImageView3, "mADClose");
        if (appCompatImageView3.getVisibility() == 0) {
            xmfVar.V0.setVisibility(8);
        }
        xmfVar.Z0.setEnabled(true);
        xmfVar.Y0.setEnabled(true);
        xmfVar.X0.setEnabled(true);
        ggeVar2.f25106a = null;
        ggeVar3.f25106a = null;
        ggeVar4.f25106a = null;
    }

    /* renamed from: E */
    public static final void m37656E(ege egeVar, gge ggeVar, final xmf xmfVar, final gge ggeVar2, final Context context, final gge ggeVar3, CompoundButton compoundButton, boolean z) {
        sq8.m48649h(egeVar, "$mPos");
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allTeams");
        sq8.m48649h(context, "$context");
        sq8.m48649h(ggeVar3, "$mSelectTeam");
        if (!z) {
            xmfVar.p0.setVisibility(8);
            xmfVar.Z0.setText("");
            AppCompatImageView appCompatImageView = xmfVar.V0;
            sq8.m48648g(appCompatImageView, "mADClose");
            if (appCompatImageView.getVisibility() == 0) {
                xmfVar.V0.setVisibility(8);
            }
            xmfVar.Y0.setEnabled(true);
            xmfVar.Z0.setEnabled(true);
            xmfVar.X0.setEnabled(true);
            return;
        }
        egeVar.f21602a = 3;
        ggeVar.f25106a = qq0.assign_to_team.toString();
        xmfVar.O0.setChecked(false);
        xmfVar.P0.setChecked(false);
        xmfVar.Q0.setChecked(true);
        xmfVar.R0.setChecked(false);
        xmfVar.S0.setChecked(false);
        AppCompatImageView appCompatImageView2 = xmfVar.U0;
        sq8.m48648g(appCompatImageView2, "mACClose");
        if (appCompatImageView2.getVisibility() == 0) {
            xmfVar.U0.setVisibility(8);
        }
        xmfVar.p0.setVisibility(0);
        xmfVar.Z0.setText("");
        xmfVar.n0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.o0.setVisibility(8);
        xmfVar.Y0.setText("");
        List list = (List) ggeVar2.f25106a;
        int i = p9e.item_lead_team;
        sq8.m48646e(list);
        xmfVar.Z0.setAdapter(new m31(context, i, list));
        xmfVar.Z0.setThreshold(1);
        xmfVar.Z0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.xp0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                lq0.m37657F(ggeVar3, xmfVar, ggeVar2, context, adapterView, view, i2, j);
            }
        });
    }

    /* renamed from: F */
    public static final void m37657F(final gge ggeVar, final xmf xmfVar, final gge ggeVar2, final Context context, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(ggeVar, "$mSelectTeam");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allTeams");
        sq8.m48649h(context, "$context");
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        sq8.m48647f(itemAtPosition, "null cannot be cast to non-null type ai.salesmax.model.LeadsTeam");
        LeadsTeam leadsTeam = (LeadsTeam) itemAtPosition;
        ggeVar.f25106a = leadsTeam;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = xmfVar.Z0;
        sq8.m48646e(leadsTeam);
        appCompatAutoCompleteTextView.setText(leadsTeam.getTeamName());
        xmfVar.W0.setVisibility(0);
        xmfVar.Z0.setEnabled(false);
        xmfVar.Y0.setEnabled(true);
        xmfVar.X0.setEnabled(true);
        xmfVar.W0.setOnClickListener(new View.OnClickListener() { // from class: o.bq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lq0.m37658G(ggeVar, xmfVar, ggeVar2, context, view2);
            }
        });
    }

    /* renamed from: G */
    public static final void m37658G(gge ggeVar, xmf xmfVar, gge ggeVar2, Context context, View view) {
        sq8.m48649h(ggeVar, "$mSelectTeam");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allTeams");
        sq8.m48649h(context, "$context");
        ggeVar.f25106a = null;
        xmfVar.W0.setVisibility(8);
        xmfVar.Z0.setEnabled(true);
        xmfVar.Z0.setText("");
        xmfVar.Z0.requestFocus();
        List list = (List) ggeVar2.f25106a;
        int i = p9e.item_lead_team;
        sq8.m48646e(list);
        xmfVar.Z0.setAdapter(new m31(context, i, list));
    }

    /* renamed from: q */
    public static final void m37675q(final Context context, final Fragment fragment, LayoutInflater layoutInflater, boolean z, final String str, final pq0 pq0Var) {
        User userM39171u;
        sq8.m48649h(context, "context");
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(layoutInflater, "layoutInflater");
        sq8.m48649h(str, "assignmentObject");
        sq8.m48649h(pq0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        AuthorizationLevel authorizationLevelM54445K = wi0.m54445K();
        final ege egeVar = new ege();
        final gge ggeVar = new gge();
        ggeVar.f25106a = "";
        final gge ggeVar2 = new gge();
        final gge ggeVar3 = new gge();
        final gge ggeVar4 = new gge();
        final gge ggeVar5 = new gge();
        final gge ggeVar6 = new gge();
        final xmf xmfVarH0 = xmf.h0(layoutInflater);
        sq8.m48648g(xmfVarH0, "inflate(...)");
        final DialogC10973a dialogC10973a = new DialogC10973a(context, qae.SheetDialog);
        dialogC10973a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.vp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                lq0.m37676r(dialogC10973a, dialogInterface);
            }
        });
        dialogC10973a.setContentView(xmfVarH0.m25689B());
        if (sq8.m48644c(str, "task") || sq8.m48644c(str, "chatChannel")) {
            xmfVarH0.c1.setVisibility(0);
            xmfVarH0.s0.setVisibility(8);
            xmfVarH0.t0.setVisibility(8);
            xmfVarH0.r0.setVisibility(8);
        }
        xmfVarH0.N0.setVisibility(8);
        if (!z) {
            xmfVarH0.T0.setVisibility(8);
        }
        AuthorizationLevel authorizationLevel = AuthorizationLevel.ADMIN;
        if (authorizationLevelM54445K == authorizationLevel || authorizationLevelM54445K == AuthorizationLevel.SUPERADMIN) {
            List listM54451Q = wi0.m54451Q();
            ggeVar2.f25106a = listM54451Q;
            if (listM54451Q.isEmpty()) {
                xmfVarH0.a1.setVisibility(8);
            }
            if ((authorizationLevelM54445K == authorizationLevel && wi0.m54472l()) || authorizationLevelM54445K == AuthorizationLevel.SUPERADMIN) {
                List listM37620U = lpi.m37620U("");
                sq8.m48647f(listM37620U, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
                ArrayList arrayList = (ArrayList) listM37620U;
                ggeVar3.f25106a = arrayList;
                if (arrayList.isEmpty()) {
                    xmfVarH0.q0.setVisibility(8);
                }
            } else {
                xmfVarH0.q0.setVisibility(8);
            }
        } else if (authorizationLevelM54445K == AuthorizationLevel.MANAGER) {
            mii miiVarM54444J = wi0.m54444J();
            String id = (miiVarM54444J == null || (userM39171u = miiVarM54444J.m39171u()) == null) ? null : userM39171u.getId();
            xmfVarH0.N0.setVisibility(8);
            List listM54451Q2 = wi0.m54451Q();
            ggeVar2.f25106a = listM54451Q2;
            if (listM54451Q2.isEmpty()) {
                xmfVarH0.a1.setVisibility(8);
            }
            ggeVar3.f25106a = new ArrayList();
            if (wi0.m54472l()) {
                List listM37620U2 = lpi.m37620U("");
                sq8.m48647f(listM37620U2, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
                ArrayList arrayList2 = (ArrayList) listM37620U2;
                ggeVar3.f25106a = arrayList2;
                if (arrayList2.isEmpty()) {
                    xmfVarH0.q0.setVisibility(8);
                }
            } else if (fragment.getView() != null) {
                sq8.m48646e(id);
                wi0.k0(id).observe(fragment.getViewLifecycleOwner(), new C15125a(new C15126b(ggeVar3, xmfVarH0)));
            }
        } else if (authorizationLevelM54445K == AuthorizationLevel.MEMBER) {
            ggeVar3.f25106a = new ArrayList();
            if (wi0.m54472l()) {
                List listM37620U3 = lpi.m37620U("");
                sq8.m48647f(listM37620U3, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
                ArrayList arrayList3 = (ArrayList) listM37620U3;
                ggeVar3.f25106a = arrayList3;
                sq8.m48647f(arrayList3, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
                if (arrayList3.isEmpty()) {
                    xmfVarH0.q0.setVisibility(8);
                }
            } else {
                xmfVarH0.q0.setVisibility(8);
            }
            xmfVarH0.T0.setVisibility(8);
            xmfVarH0.N0.setVisibility(8);
            List listM54454T = wi0.m54454T();
            ggeVar2.f25106a = listM54454T;
            if (listM54454T.size() == 0) {
                xmfVarH0.a1.setVisibility(8);
            }
        }
        xmfVarH0.O0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lq0.m37653B(egeVar, ggeVar, xmfVarH0, ggeVar4, ggeVar5, ggeVar6, compoundButton, z2);
            }
        });
        xmfVarH0.P0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.dq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lq0.m37655D(egeVar, ggeVar, xmfVarH0, ggeVar4, ggeVar5, ggeVar6, compoundButton, z2);
            }
        });
        xmfVarH0.Q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.eq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lq0.m37656E(egeVar, ggeVar, xmfVarH0, ggeVar2, context, ggeVar4, compoundButton, z2);
            }
        });
        xmfVarH0.R0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lq0.m37677s(egeVar, ggeVar, xmfVarH0, ggeVar3, ggeVar5, context, compoundButton, z2);
            }
        });
        xmfVarH0.S0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lq0.m37680v(egeVar, ggeVar, xmfVarH0, context, ggeVar6, compoundButton, z2);
            }
        });
        xmfVarH0.L0.setOnClickListener(new View.OnClickListener() { // from class: o.hq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq0.m37683y(ggeVar, ggeVar4, ggeVar5, ggeVar6, str, xmfVarH0, fragment, pq0Var, dialogC10973a, view);
            }
        });
        xmfVarH0.M0.setOnClickListener(new View.OnClickListener() { // from class: o.iq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq0.m37684z(ggeVar, ggeVar4, ggeVar5, ggeVar6, str, xmfVarH0, fragment, pq0Var, dialogC10973a, view);
            }
        });
        xmfVarH0.K0.setOnClickListener(new View.OnClickListener() { // from class: o.jq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq0.m37652A(dialogC10973a, view);
            }
        });
        xmfVarH0.m25689B().setOnClickListener(new View.OnClickListener() { // from class: o.kq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq0.m37654C(view);
            }
        });
        dialogC10973a.show();
    }

    /* renamed from: r */
    public static final void m37676r(DialogC10973a dialogC10973a, DialogInterface dialogInterface) {
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        View viewFindViewById = dialogC10973a.findViewById(n8e.design_bottom_sheet);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(viewFindViewById);
            sq8.m48648g(bottomSheetBehaviorQ0, "from(...)");
            bottomSheetBehaviorQ0.Z0(3);
        }
    }

    /* renamed from: s */
    public static final void m37677s(ege egeVar, gge ggeVar, final xmf xmfVar, final gge ggeVar2, final gge ggeVar3, final Context context, CompoundButton compoundButton, boolean z) {
        sq8.m48649h(egeVar, "$mPos");
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allColleaguesExcludingYourself");
        sq8.m48649h(ggeVar3, "$mSelectUser");
        sq8.m48649h(context, "$context");
        if (!z) {
            xmfVar.n0.setVisibility(8);
            xmfVar.X0.setText("");
            AppCompatImageView appCompatImageView = xmfVar.U0;
            sq8.m48648g(appCompatImageView, "mACClose");
            if (appCompatImageView.getVisibility() == 0) {
                xmfVar.U0.setVisibility(8);
            }
            xmfVar.Y0.setEnabled(true);
            xmfVar.Z0.setEnabled(true);
            xmfVar.X0.setEnabled(true);
            ggeVar3.f25106a = null;
            return;
        }
        egeVar.f21602a = 4;
        ggeVar.f25106a = qq0.assign_to_user.toString();
        xmfVar.O0.setChecked(false);
        xmfVar.P0.setChecked(false);
        xmfVar.Q0.setChecked(false);
        xmfVar.R0.setChecked(true);
        xmfVar.S0.setChecked(false);
        xmfVar.p0.setVisibility(8);
        xmfVar.Z0.setText("");
        AppCompatImageView appCompatImageView2 = xmfVar.W0;
        sq8.m48648g(appCompatImageView2, "mATClose");
        if (appCompatImageView2.getVisibility() == 0) {
            xmfVar.W0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = xmfVar.V0;
        sq8.m48648g(appCompatImageView3, "mADClose");
        if (appCompatImageView3.getVisibility() == 0) {
            xmfVar.V0.setVisibility(8);
        }
        xmfVar.n0.setVisibility(0);
        xmfVar.X0.setText("");
        xmfVar.o0.setVisibility(8);
        xmfVar.Y0.setText("");
        List list = (List) ggeVar2.f25106a;
        xmfVar.X0.setAdapter(list != null ? new b31(context, p9e.item_autocomplete_user, list) : null);
        xmfVar.X0.setThreshold(1);
        xmfVar.X0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.wp0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                lq0.m37678t(ggeVar3, xmfVar, ggeVar2, context, adapterView, view, i, j);
            }
        });
    }

    /* renamed from: t */
    public static final void m37678t(final gge ggeVar, final xmf xmfVar, final gge ggeVar2, final Context context, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(ggeVar, "$mSelectUser");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allColleaguesExcludingYourself");
        sq8.m48649h(context, "$context");
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        sq8.m48647f(itemAtPosition, "null cannot be cast to non-null type ai.salesmax.model.LeadsUser");
        LeadsUser leadsUser = (LeadsUser) itemAtPosition;
        ggeVar.f25106a = leadsUser;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = xmfVar.X0;
        sq8.m48646e(leadsUser);
        appCompatAutoCompleteTextView.setText(leadsUser.getName());
        xmfVar.U0.setVisibility(0);
        xmfVar.X0.setEnabled(false);
        xmfVar.Z0.setEnabled(true);
        xmfVar.Y0.setEnabled(true);
        xmfVar.U0.setOnClickListener(new View.OnClickListener() { // from class: o.aq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lq0.m37679u(ggeVar, xmfVar, ggeVar2, context, view2);
            }
        });
    }

    /* renamed from: u */
    public static final void m37679u(gge ggeVar, xmf xmfVar, gge ggeVar2, Context context, View view) {
        sq8.m48649h(ggeVar, "$mSelectUser");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(ggeVar2, "$allColleaguesExcludingYourself");
        sq8.m48649h(context, "$context");
        ggeVar.f25106a = null;
        xmfVar.U0.setVisibility(8);
        xmfVar.X0.setEnabled(true);
        xmfVar.X0.setText("");
        xmfVar.X0.requestFocus();
        List list = (List) ggeVar2.f25106a;
        xmfVar.X0.setAdapter(list != null ? new b31(context, p9e.item_autocomplete_user, list) : null);
    }

    /* renamed from: v */
    public static final void m37680v(ege egeVar, gge ggeVar, final xmf xmfVar, final Context context, final gge ggeVar2, CompoundButton compoundButton, boolean z) {
        sq8.m48649h(egeVar, "$mPos");
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(context, "$context");
        sq8.m48649h(ggeVar2, "$mSelectDistribution");
        if (!z) {
            xmfVar.o0.setVisibility(8);
            xmfVar.Y0.setText("");
            AppCompatImageView appCompatImageView = xmfVar.V0;
            sq8.m48648g(appCompatImageView, "mADClose");
            if (appCompatImageView.getVisibility() == 0) {
                xmfVar.V0.setVisibility(8);
            }
            xmfVar.Y0.setEnabled(true);
            xmfVar.Z0.setEnabled(true);
            xmfVar.X0.setEnabled(true);
            ggeVar2.f25106a = null;
            return;
        }
        egeVar.f21602a = 5;
        ggeVar.f25106a = qq0.send_for_distribution.toString();
        xmfVar.O0.setChecked(false);
        xmfVar.P0.setChecked(false);
        xmfVar.Q0.setChecked(false);
        xmfVar.R0.setChecked(false);
        xmfVar.S0.setChecked(true);
        AppCompatImageView appCompatImageView2 = xmfVar.W0;
        sq8.m48648g(appCompatImageView2, "mATClose");
        if (appCompatImageView2.getVisibility() == 0) {
            xmfVar.W0.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = xmfVar.U0;
        sq8.m48648g(appCompatImageView3, "mACClose");
        if (appCompatImageView3.getVisibility() == 0) {
            xmfVar.U0.setVisibility(8);
        }
        xmfVar.p0.setVisibility(8);
        xmfVar.Z0.setText("");
        xmfVar.n0.setVisibility(8);
        xmfVar.X0.setText("");
        xmfVar.o0.setVisibility(0);
        xmfVar.Y0.setText("");
        xmfVar.Y0.setAdapter(new u11(context, p9e.item_lead_team, vs6.m53367d()));
        xmfVar.Y0.setThreshold(1);
        xmfVar.Y0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.yp0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                lq0.m37681w(ggeVar2, xmfVar, context, adapterView, view, i, j);
            }
        });
    }

    /* renamed from: w */
    public static final void m37681w(final gge ggeVar, final xmf xmfVar, final Context context, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(ggeVar, "$mSelectDistribution");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(context, "$context");
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        sq8.m48647f(itemAtPosition, "null cannot be cast to non-null type ai.salesmax.model.DistributionData");
        DistributionData distributionData = (DistributionData) itemAtPosition;
        ggeVar.f25106a = distributionData;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = xmfVar.Y0;
        sq8.m48646e(distributionData);
        appCompatAutoCompleteTextView.setText(distributionData.getName());
        xmfVar.V0.setVisibility(0);
        xmfVar.Y0.setEnabled(false);
        xmfVar.Z0.setEnabled(true);
        xmfVar.X0.setEnabled(true);
        xmfVar.V0.setOnClickListener(new View.OnClickListener() { // from class: o.zp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lq0.m37682x(ggeVar, xmfVar, context, view2);
            }
        });
    }

    /* renamed from: x */
    public static final void m37682x(gge ggeVar, xmf xmfVar, Context context, View view) {
        sq8.m48649h(ggeVar, "$mSelectDistribution");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(context, "$context");
        ggeVar.f25106a = null;
        xmfVar.V0.setVisibility(8);
        xmfVar.Y0.setEnabled(true);
        xmfVar.Y0.getText().clear();
        xmfVar.Y0.requestFocus();
        xmfVar.Y0.setAdapter(new u11(context, p9e.item_lead_team, vs6.m53367d()));
    }

    /* renamed from: y */
    public static final void m37683y(gge ggeVar, gge ggeVar2, gge ggeVar3, gge ggeVar4, String str, xmf xmfVar, Fragment fragment, pq0 pq0Var, DialogC10973a dialogC10973a, View view) {
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(ggeVar2, "$mSelectTeam");
        sq8.m48649h(ggeVar3, "$mSelectUser");
        sq8.m48649h(ggeVar4, "$mSelectDistribution");
        sq8.m48649h(str, "$assignmentObject");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(fragment, "$fragment");
        sq8.m48649h(pq0Var, "$listener");
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        AssignmentOutcome assignmentOutcome = new AssignmentOutcome(null, null, null, null, false, false, false, false, Constants.MAX_HOST_LENGTH, null);
        try {
            assignmentOutcome.setAssignmentType(qq0.valueOf((String) ggeVar.f25106a).name());
            LeadsTeam leadsTeam = (LeadsTeam) ggeVar2.f25106a;
            assignmentOutcome.setAssignedTeamId(leadsTeam != null ? leadsTeam.getTeamId() : null);
            LeadsUser leadsUser = (LeadsUser) ggeVar3.f25106a;
            assignmentOutcome.setAssignedUserId(leadsUser != null ? leadsUser.getId() : null);
            DistributionData distributionData = (DistributionData) ggeVar4.f25106a;
            assignmentOutcome.setAssignedDistributionId(distributionData != null ? distributionData.getId() : null);
            if (sq8.m48644c(str, "lead")) {
                assignmentOutcome.setAssignOpenTasks(xmfVar.t0.isChecked());
                assignmentOutcome.setAssignOpenDeals(xmfVar.s0.isChecked());
                assignmentOutcome.setAssignChats(xmfVar.r0.isChecked());
            } else {
                assignmentOutcome.setAssignOpenTasks(false);
                assignmentOutcome.setAssignOpenDeals(false);
                assignmentOutcome.setAssignChats(false);
            }
            if (sq8.m48644c(str, "task") || sq8.m48644c(str, "chatChannel")) {
                assignmentOutcome.setTransferLead(xmfVar.c1.isChecked());
            } else {
                assignmentOutcome.setTransferLead(false);
            }
        } catch (Exception unused) {
        }
        if (assignmentOutcome.getAssignmentType() != null) {
            if (!sq8.m48644c(assignmentOutcome.getAssignmentType(), qq0.assign_to_user.toString()) || ggeVar3.f25106a != null) {
                pq0Var.mo1028a(assignmentOutcome);
                dialogC10973a.dismiss();
            } else if (fragment.getActivity() != null) {
                jm7.v0(fragment.requireActivity(), "Please Select Colleague to assign to", 0, 0, 12, null);
            }
        }
    }

    /* renamed from: z */
    public static final void m37684z(gge ggeVar, gge ggeVar2, gge ggeVar3, gge ggeVar4, String str, xmf xmfVar, Fragment fragment, pq0 pq0Var, DialogC10973a dialogC10973a, View view) {
        sq8.m48649h(ggeVar, "$assignType");
        sq8.m48649h(ggeVar2, "$mSelectTeam");
        sq8.m48649h(ggeVar3, "$mSelectUser");
        sq8.m48649h(ggeVar4, "$mSelectDistribution");
        sq8.m48649h(str, "$assignmentObject");
        sq8.m48649h(xmfVar, "$binding");
        sq8.m48649h(fragment, "$fragment");
        sq8.m48649h(pq0Var, "$listener");
        sq8.m48649h(dialogC10973a, "$bottomSheetDialog");
        AssignmentOutcome assignmentOutcome = new AssignmentOutcome(null, null, null, null, false, false, false, false, Constants.MAX_HOST_LENGTH, null);
        try {
            assignmentOutcome.setAssignmentType(qq0.valueOf((String) ggeVar.f25106a).name());
            LeadsTeam leadsTeam = (LeadsTeam) ggeVar2.f25106a;
            assignmentOutcome.setAssignedTeamId(leadsTeam != null ? leadsTeam.getTeamId() : null);
            LeadsUser leadsUser = (LeadsUser) ggeVar3.f25106a;
            assignmentOutcome.setAssignedUserId(leadsUser != null ? leadsUser.getId() : null);
            DistributionData distributionData = (DistributionData) ggeVar4.f25106a;
            assignmentOutcome.setAssignedDistributionId(distributionData != null ? distributionData.getId() : null);
            if (sq8.m48644c(str, "lead")) {
                assignmentOutcome.setAssignOpenTasks(xmfVar.t0.isChecked());
                assignmentOutcome.setAssignOpenDeals(xmfVar.s0.isChecked());
                assignmentOutcome.setAssignChats(xmfVar.r0.isChecked());
            } else {
                assignmentOutcome.setAssignOpenTasks(false);
                assignmentOutcome.setAssignOpenDeals(false);
                assignmentOutcome.setAssignChats(false);
            }
            if (sq8.m48644c(str, "task") || sq8.m48644c(str, "chatChannel")) {
                assignmentOutcome.setTransferLead(xmfVar.c1.isChecked());
            } else {
                assignmentOutcome.setTransferLead(false);
            }
        } catch (Exception unused) {
        }
        if (assignmentOutcome.getAssignmentType() != null) {
            if (!sq8.m48644c(assignmentOutcome.getAssignmentType(), qq0.assign_to_user.toString()) || ggeVar3.f25106a != null) {
                pq0Var.mo1028a(assignmentOutcome);
                dialogC10973a.dismiss();
            } else if (fragment.getActivity() != null) {
                jm7.v0(fragment.requireActivity(), "Please Select Colleague to assign to", 0, 0, 12, null);
            }
        }
    }
}
