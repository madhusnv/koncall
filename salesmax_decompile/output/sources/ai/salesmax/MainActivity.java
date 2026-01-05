package ai.salesmax;

import ai.salesmax.MainActivity;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.ChatChannelSummary;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.ProfileView;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import ai.salesmax.services.model.GlobalChatParticipantNotification;
import ai.salesmax.ui.chat.BuzzDialogFragment;
import ai.salesmax.ui.landing.LandingFragment;
import ai.salesmax.ui.leads.details.PlaceCallFragment;
import ai.salesmax.ui.service.CallStateManagerRestarterBroadcastReceiver;
import ai.salesmax.ui.service.CallStateManagerService;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.C2345l;
import androidx.navigation.fragment.C2339b;
import androidx.navigation.fragment.NavHostFragment;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.ChatChannel;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubSubscriber;
import com.amplifyframework.hub.SubscriptionToken;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.badge.C10936a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.razorpay.PaymentData;
import com.razorpay.PaymentResultWithDataListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.a81;
import p001o.am7;
import p001o.bn0;
import p001o.bub;
import p001o.c64;
import p001o.cn0;
import p001o.dh3;
import p001o.dm7;
import p001o.dn0;
import p001o.en0;
import p001o.eu5;
import p001o.gu3;
import p001o.h84;
import p001o.hae;
import p001o.i5f;
import p001o.i84;
import p001o.ih0;
import p001o.iwi;
import p001o.j01;
import p001o.j0f;
import p001o.j4d;
import p001o.jga;
import p001o.jgg;
import p001o.jm;
import p001o.jm7;
import p001o.jpa;
import p001o.jq2;
import p001o.k8j;
import p001o.kf9;
import p001o.kh3;
import p001o.ltf;
import p001o.lw9;
import p001o.mii;
import p001o.ml1;
import p001o.mma;
import p001o.n0g;
import p001o.n64;
import p001o.n8e;
import p001o.n9c;
import p001o.nk5;
import p001o.nl7;
import p001o.ns;
import p001o.nta;
import p001o.oaj;
import p001o.of0;
import p001o.p69;
import p001o.p74;
import p001o.pm1;
import p001o.pz7;
import p001o.q5g;
import p001o.qm1;
import p001o.qma;
import p001o.r9j;
import p001o.rl7;
import p001o.rm1;
import p001o.s07;
import p001o.sh2;
import p001o.sq8;
import p001o.ssb;
import p001o.tl7;
import p001o.u6e;
import p001o.uih;
import p001o.uk7;
import p001o.uni;
import p001o.uq8;
import p001o.vq;
import p001o.vre;
import p001o.vs;
import p001o.w8j;
import p001o.wi0;
import p001o.wre;
import p001o.ws;
import p001o.x6c;
import p001o.x8c;
import p001o.xk1;
import p001o.xk7;
import p001o.xmd;
import p001o.y3i;
import p001o.yc9;
import p001o.yca;
import p001o.yne;
import p001o.z74;
import p001o.z8e;
import type.UserStatus;

/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity implements j4d, PaymentResultWithDataListener {

    /* renamed from: L */
    public boolean f6L;

    /* renamed from: M */
    public Intent f7M;

    /* renamed from: Q */
    public boolean f8Q;

    /* renamed from: X */
    public SubscriptionToken f9X;

    /* renamed from: Y */
    public cn0 f10Y;

    /* renamed from: a */
    public vq f12a;

    /* renamed from: b */
    public xmd f13b;

    /* renamed from: c */
    public pz7 f14c;

    /* renamed from: d */
    public AbstractC2333d f15d;

    /* renamed from: e */
    public jga f16e;

    /* renamed from: f */
    public AbstractC2333d.c f17f;

    /* renamed from: g */
    public n9c f18g;

    /* renamed from: h */
    public Snackbar f19h;
    public boolean i0;
    public p69 k0;
    public final ws m0;

    /* renamed from: q */
    public boolean f20q;

    /* renamed from: x */
    public FirebaseAnalytics f22x;

    /* renamed from: y */
    public jq2 f23y;

    /* renamed from: s */
    public List f21s = new ArrayList();

    /* renamed from: H */
    public final int f5H = 1487;

    /* renamed from: Z */
    public final int f11Z = 100;
    public final List h0 = new ArrayList();
    public final h84 j0 = p74.f39487a.m43082j();
    public Handler l0 = new Handler(Looper.getMainLooper());

    /* renamed from: ai.salesmax.MainActivity$a */
    public static final class C0003a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C10936a f24a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f25b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003a(C10936a c10936a, MainActivity mainActivity) {
            super(1);
            this.f24a = c10936a;
            this.f25b = mainActivity;
        }

        /* renamed from: a */
        public final void m15a(GlobalChatParticipantNotification globalChatParticipantNotification) {
            sq8.m48649h(globalChatParticipantNotification, "it");
            if (globalChatParticipantNotification.unreadChannelCount <= 0) {
                C10936a c10936a = this.f24a;
                if (c10936a != null) {
                    c10936a.m14041T(false);
                }
                C10936a c10936a2 = this.f24a;
                if (c10936a2 != null) {
                    c10936a2.m14049e();
                    return;
                }
                return;
            }
            C10936a c10936a3 = this.f24a;
            if (c10936a3 != null) {
                c10936a3.m14041T(true);
            }
            C10936a c10936a4 = this.f24a;
            if (c10936a4 != null) {
                c10936a4.m14040S(globalChatParticipantNotification.unreadChannelCount);
            }
            C10936a c10936a5 = this.f24a;
            if (c10936a5 != null) {
                c10936a5.m14038Q(c64.getColor(this.f25b, u6e.superfone_purple));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m15a((GlobalChatParticipantNotification) obj);
            return y3i.f54824a;
        }
    }

    public static final class a0 extends kf9 implements xk7 {
        public a0() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return y3i.f54824a;
        }

        public final void invoke(Boolean bool) {
            MainActivity mainActivity = MainActivity.this;
            sq8.m48646e(bool);
            mainActivity.k2(bool.booleanValue());
        }
    }

    /* renamed from: ai.salesmax.MainActivity$b */
    public static final class C0004b extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.MainActivity$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28a;

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
                f28a = iArr;
            }
        }

        public C0004b() {
            super(1);
        }

        /* renamed from: a */
        public final void m16a(yne yneVar) {
            if (yneVar != null) {
                MainActivity mainActivity = MainActivity.this;
                int i = a.f28a[yneVar.m58025c().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    FirebaseCrashlytics.getInstance().recordException(new RuntimeException("checkIsSignedInAsync error in main Activity, checkAndStartObserveOnActivity"));
                } else if (sq8.m48644c(yneVar.m58023a(), Boolean.TRUE)) {
                    mainActivity.o3();
                    mainActivity.p3();
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16a((yne) obj);
            return y3i.f54824a;
        }
    }

    public static final class b0 implements DrawerLayout.InterfaceC2057e {

        /* renamed from: a */
        public final /* synthetic */ vq f29a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f30b;

        public b0(vq vqVar, MainActivity mainActivity) {
            this.f29a = vqVar;
            this.f30b = mainActivity;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: a */
        public void mo17a(View view) {
            sq8.m48649h(view, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: b */
        public void mo18b(View view) {
            sq8.m48649h(view, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: c */
        public void mo19c(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: d */
        public void mo20d(View view, float f) {
            sq8.m48649h(view, "drawerView");
            mii miiVarM54444J = uni.gC() ? wi0.m54444J() : null;
            if (miiVarM54444J != null) {
                AuthorizationLevel authorizationLevelM39162l = miiVarM54444J.m39162l();
                if (authorizationLevelM39162l == AuthorizationLevel.ADMIN || authorizationLevelM39162l == AuthorizationLevel.SUPERADMIN || miiVarM54444J.m39156f().getAccountType() == AccountType.INDIVIDUAL) {
                    this.f29a.p0.r0.setVisibility(0);
                } else {
                    this.f29a.p0.r0.setVisibility(8);
                }
                AccountType accountType = miiVarM54444J.m39156f().getAccountType();
                AccountType accountType2 = AccountType.TEAM_TRIAL;
                if (accountType != accountType2) {
                    this.f29a.p0.q0.setText(this.f30b.getString(hae.you_re_in_basic_plan));
                    this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_purple));
                    return;
                }
                if (miiVarM54444J.m39156f().getTrialAccountEndDate() == null) {
                    if (miiVarM54444J.m39156f().getAccountType() == accountType2) {
                        this.f29a.p0.q0.setText("Your Trial has ended");
                        this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_red));
                        return;
                    } else {
                        this.f29a.p0.q0.setText(this.f30b.getString(hae.you_re_in_basic_plan));
                        this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_purple));
                        return;
                    }
                }
                long days = TimeUnit.MILLISECONDS.toDays(a81.m16645F(miiVarM54444J.m39156f().getTrialAccountEndDate()).longValue() - System.currentTimeMillis());
                if (days <= 0) {
                    if (miiVarM54444J.m39156f().getAccountType() == accountType2) {
                        this.f29a.p0.q0.setText("Your Trial has ended");
                        this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_red));
                        return;
                    } else {
                        this.f29a.p0.q0.setText(this.f30b.getString(hae.you_re_in_basic_plan));
                        this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_purple));
                        return;
                    }
                }
                this.f29a.p0.q0.setText("Trial expiring in " + days + " Days");
                this.f29a.p0.q0.setTextColor(c64.getColor(this.f30b, u6e.superfone_red));
            }
        }
    }

    /* renamed from: ai.salesmax.MainActivity$c */
    public static final class C0005c extends Snackbar.C11130a {

        /* renamed from: a */
        public final /* synthetic */ Snackbar f31a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f32b;

        public C0005c(Snackbar snackbar, MainActivity mainActivity) {
            this.f31a = snackbar;
            this.f32b = mainActivity;
        }

        /* renamed from: g */
        public static final void m23g(Snackbar snackbar, final MainActivity mainActivity, View view) {
            sq8.m48649h(snackbar, "$snackbar");
            sq8.m48649h(mainActivity, "this$0");
            j0f.m33008i(new Runnable() { // from class: o.bpa
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C0005c.m24h(mainActivity);
                }
            });
            snackbar.mo15170x();
        }

        /* renamed from: h */
        public static final void m24h(MainActivity mainActivity) {
            sq8.m48649h(mainActivity, "this$0");
            mainActivity.g2().m8605V(z8e.placeCall, null, C2345l.a.m8813k(new C2345l.a().m8817d(true), z8e.placeCall, true, false, 4, null).m8814a());
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC11128q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo25b(Snackbar snackbar) {
            TextView textView = (TextView) this.f31a.m15146G().findViewById(n8e.snackbar_text);
            final Snackbar snackbar2 = this.f31a;
            final MainActivity mainActivity = this.f32b;
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.apa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.C0005c.m23g(snackbar2, mainActivity, view);
                }
            });
        }
    }

    public static final class c0 extends kf9 implements xk7 {
        public c0() {
            super(1);
        }

        /* renamed from: a */
        public final void m27a(bn0 bn0Var) {
            if (bn0Var.m19396c() == 3) {
                cn0 cn0Var = MainActivity.this.f10Y;
                if (cn0Var == null) {
                    sq8.m48667z("appUpdateManager");
                    cn0Var = null;
                }
                cn0Var.mo21440b(bn0Var, MainActivity.this.m0, en0.m25343d(1).mo25346a());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27a((bn0) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.MainActivity$d */
    public static final class C0006d extends kf9 implements xk7 {
        public C0006d() {
            super(1);
        }

        /* renamed from: a */
        public final void m28a(bn0 bn0Var) {
            if (bn0Var.m19396c() != 2 || !bn0Var.m19394a(0)) {
                MainActivity.this.b2();
                return;
            }
            cn0 cn0Var = MainActivity.this.f10Y;
            if (cn0Var == null) {
                sq8.m48667z("appUpdateManager");
                cn0Var = null;
            }
            cn0Var.mo21440b(bn0Var, MainActivity.this.m0, en0.m25343d(1).mo25346a());
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28a((bn0) obj);
            return y3i.f54824a;
        }
    }

    public static final class d0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f35a;

        /* renamed from: ai.salesmax.MainActivity$d0$a */
        public /* synthetic */ class C0007a extends dm7 implements uk7 {
            public C0007a(Object obj) {
                super(0, obj, MainActivity.class, "onViewNextClicked", "onViewNextClicked()V", 0);
            }

            /* renamed from: b */
            public final void m29b() {
                ((MainActivity) this.receiver).a3();
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m29b();
                return y3i.f54824a;
            }
        }

        /* renamed from: ai.salesmax.MainActivity$d0$b */
        public /* synthetic */ class C0008b extends dm7 implements uk7 {
            public C0008b(Object obj) {
                super(0, obj, MainActivity.class, "onDismissAllClicked", "onDismissAllClicked()V", 0);
            }

            /* renamed from: b */
            public final void m30b() {
                ((MainActivity) this.receiver).Y2();
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m30b();
                return y3i.f54824a;
            }
        }

        public d0(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return MainActivity.this.new d0(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f35a;
            if (i == 0) {
                wre.m54934b(obj);
                this.f35a = 1;
                if (nk5.m40720b(2000L, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            if (!AbstractC0059a.m132a().q0() || MainActivity.this.isFinishing() || MainActivity.this.h0.isEmpty()) {
                return y3i.f54824a;
            }
            if (MainActivity.this.i0) {
                Fragment fragmentM0 = MainActivity.this.getSupportFragmentManager().m0("BuzzDialogFragment");
                BuzzDialogFragment buzzDialogFragment = fragmentM0 instanceof BuzzDialogFragment ? (BuzzDialogFragment) fragmentM0 : null;
                if (buzzDialogFragment != null) {
                    buzzDialogFragment.A1(MainActivity.this.h0.size());
                    return y3i.f54824a;
                }
            } else if (!MainActivity.this.getSupportFragmentManager().W0() && !MainActivity.this.isDestroyed() && MainActivity.this.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.RESUMED)) {
                try {
                    MainActivity.this.i0 = true;
                    Intent intent = (Intent) MainActivity.this.h0.remove(0);
                    String stringExtra = intent.getStringExtra("notificationId");
                    String str = stringExtra == null ? "" : stringExtra;
                    String stringExtra2 = intent.getStringExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                    String str2 = stringExtra2 == null ? "" : stringExtra2;
                    String stringExtra3 = intent.getStringExtra(FirebaseAnalytics.Param.CONTENT);
                    String str3 = stringExtra3 == null ? "" : stringExtra3;
                    String stringExtra4 = intent.getStringExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                    String str4 = stringExtra4 == null ? "" : stringExtra4;
                    String stringExtra5 = intent.getStringExtra("notificationType");
                    String str5 = stringExtra5 == null ? "" : stringExtra5;
                    String stringExtra6 = intent.getStringExtra("contactId");
                    String str6 = stringExtra6 == null ? "" : stringExtra6;
                    String stringExtra7 = intent.getStringExtra("linkedContactId");
                    String str7 = stringExtra7 == null ? "" : stringExtra7;
                    String stringExtra8 = intent.getStringExtra("linkedEngagementId");
                    String str8 = stringExtra8 == null ? "" : stringExtra8;
                    BuzzDialogFragment.C0310a c0310a = BuzzDialogFragment.f474Q;
                    FragmentManager supportFragmentManager = MainActivity.this.getSupportFragmentManager();
                    sq8.m48648g(supportFragmentManager, "getSupportFragmentManager(...)");
                    c0310a.m784b(supportFragmentManager, str, str2, str3, str4, str5, str6, str7, str8, MainActivity.this.h0.size(), new C0007a(MainActivity.this), new C0008b(MainActivity.this));
                } catch (IllegalStateException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to show BuzzDialogFragment: ");
                    sb.append(message);
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((d0) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$e */
    public static final class C0009e extends jgg implements xk7 {

        /* renamed from: a */
        public int f37a;

        /* renamed from: b */
        public final /* synthetic */ String f38b;

        /* renamed from: c */
        public final /* synthetic */ String f39c;

        /* renamed from: d */
        public final /* synthetic */ MainActivity f40d;

        /* renamed from: e */
        public final /* synthetic */ View f41e;

        /* renamed from: ai.salesmax.MainActivity$e$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f42a;

            /* renamed from: b */
            public final /* synthetic */ int f43b;

            /* renamed from: c */
            public final /* synthetic */ int f44c;

            /* renamed from: d */
            public final /* synthetic */ View f45d;

            /* renamed from: e */
            public final /* synthetic */ MainActivity f46e;

            /* renamed from: f */
            public final /* synthetic */ String f47f;

            /* renamed from: ai.salesmax.MainActivity$e$a$a, reason: collision with other inner class name */
            public static final class C19506a extends Snackbar.C11130a {

                /* renamed from: a */
                public final /* synthetic */ Snackbar f48a;

                /* renamed from: b */
                public final /* synthetic */ MainActivity f49b;

                /* renamed from: c */
                public final /* synthetic */ String f50c;

                public C19506a(Snackbar snackbar, MainActivity mainActivity, String str) {
                    this.f48a = snackbar;
                    this.f49b = mainActivity;
                    this.f50c = str;
                }

                /* renamed from: f */
                public static final void m34f(MainActivity mainActivity, Snackbar snackbar, String str, View view) {
                    sq8.m48649h(mainActivity, "this$0");
                    sq8.m48649h(snackbar, "$snackbar");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    mainActivity.startActivity(intent);
                    snackbar.mo15170x();
                }

                @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC11128q
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public void mo25b(Snackbar snackbar) {
                    TextView textView = (TextView) this.f48a.m15146G().findViewById(n8e.snackbar_text);
                    final MainActivity mainActivity = this.f49b;
                    final Snackbar snackbar2 = this.f48a;
                    final String str = this.f50c;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: o.dpa
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MainActivity.C0009e.a.C19506a.m34f(mainActivity, snackbar2, str, view);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, View view, MainActivity mainActivity, String str, n64 n64Var) {
                super(2, n64Var);
                this.f43b = i;
                this.f44c = i2;
                this.f45d = view;
                this.f46e = mainActivity;
                this.f47f = str;
            }

            /* renamed from: g */
            public static final void m32g(Snackbar snackbar, View view) {
                snackbar.mo15170x();
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f43b, this.f44c, this.f45d, this.f46e, this.f47f, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f42a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                if (this.f43b > this.f44c) {
                    final Snackbar snackbarL0 = Snackbar.l0(this.f45d, "Tap here to update to the latest app version", -2);
                    sq8.m48648g(snackbarL0, "make(...)");
                    snackbarL0.n0("Later", new View.OnClickListener() { // from class: o.cpa
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MainActivity.C0009e.a.m32g(snackbarL0, view);
                        }
                    });
                    snackbarL0.m15166r(new C19506a(snackbarL0, this.f46e, this.f47f));
                    snackbarL0.mo15162W();
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* renamed from: ai.salesmax.MainActivity$e$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f51a;

            public b(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new b(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f51a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return ml1.m39304d(Log.e("ManualUpdate", "Application ID not found in update info JSON"));
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* renamed from: ai.salesmax.MainActivity$e$c */
        public static final class c extends jgg implements nl7 {

            /* renamed from: a */
            public int f52a;

            /* renamed from: b */
            public final /* synthetic */ Exception f53b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Exception exc, n64 n64Var) {
                super(2, n64Var);
                this.f53b = exc;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new c(this.f53b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f52a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return ml1.m39304d(Log.e("ManualUpdate", "Failed to check for manual updates", this.f53b));
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009e(String str, String str2, MainActivity mainActivity, View view, n64 n64Var) {
            super(1, n64Var);
            this.f38b = str;
            this.f39c = str2;
            this.f40d = mainActivity;
            this.f41e = view;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C0009e(this.f38b, this.f39c, this.f40d, this.f41e, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM51918f = uq8.m51918f();
            int i = this.f37a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    JSONObject jSONObject = new JSONObject(new String(uih.m51643c(new URL(this.f38b)), sh2.f45422b)).getJSONObject("versions");
                    if (!jSONObject.has(this.f39c)) {
                        jpa jpaVarM25612c = eu5.m25612c();
                        b bVar = new b(null);
                        this.f37a = 2;
                        Object objM43867g = pm1.m43867g(jpaVarM25612c, bVar, this);
                        return objM43867g == objM51918f ? objM51918f : objM43867g;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(this.f39c);
                    int i2 = jSONObject2.getInt("latest_version_code");
                    String string = jSONObject2.getString("update_url");
                    int i3 = this.f40d.getPackageManager().getPackageInfo(this.f40d.getPackageName(), 0).versionCode;
                    jpa jpaVarM25612c2 = eu5.m25612c();
                    a aVar = new a(i2, i3, this.f41e, this.f40d, string, null);
                    this.f37a = 1;
                    if (pm1.m43867g(jpaVarM25612c2, aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            wre.m54934b(obj);
                            return obj;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return obj;
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            } catch (Exception e) {
                jpa jpaVarM25612c3 = eu5.m25612c();
                c cVar = new c(e, null);
                this.f37a = 3;
                Object objM43867g2 = pm1.m43867g(jpaVarM25612c3, cVar, this);
                return objM43867g2 == objM51918f ? objM51918f : objM43867g2;
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0009e) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class e0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f54a;

        public e0(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return MainActivity.this.new e0(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f54a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01VarM32992a = j01.f29455d.m32992a();
                    this.f54a = 1;
                    if (j01VarM32992a.m32987p(true, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
            } catch (Exception unused) {
                MainActivity.this.g2().m8603T(z8e.landing);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((e0) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$f */
    public static final class C0010f implements gu3 {
        public C0010f() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ProfileView profileView) {
            sq8.m48649h(profileView, "profileView");
            vq vqVarE2 = MainActivity.this.e2();
            if (vqVarE2 == null) {
                return;
            }
            vqVarE2.j0(profileView);
        }
    }

    public static final class f0 implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f57a;

        public f0(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f57a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f57a;
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
            this.f57a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$g */
    public static final class C0011g implements gu3 {

        /* renamed from: a */
        public static final C0011g f58a = new C0011g();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
    }

    public static final class g0 implements rl7 {

        /* renamed from: a */
        public static final g0 f59a = new g0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(x6c x6cVar) {
            return x6cVar;
        }
    }

    /* renamed from: ai.salesmax.MainActivity$h */
    public static final class C0012h implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f61b;

        public C0012h(Bundle bundle) {
            this.f61b = bundle;
        }

        /* renamed from: c */
        public static final void m41c(MainActivity mainActivity, Bundle bundle) {
            sq8.m48649h(mainActivity, "this$0");
            sq8.m48649h(bundle, "$bundle");
            mainActivity.g2().m8604U(z8e.handleFile, bundle);
        }

        @Override // p001o.gu3
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            final MainActivity mainActivity = MainActivity.this;
            final Bundle bundle = this.f61b;
            j0f.m33008i(new Runnable() { // from class: o.epa
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.C0012h.m41c(mainActivity, bundle);
                }
            });
        }
    }

    public static final class h0 implements gu3 {

        /* renamed from: ai.salesmax.MainActivity$h0$a */
        public static final class C0013a extends jgg implements nl7 {

            /* renamed from: a */
            public int f63a;

            /* renamed from: b */
            public final /* synthetic */ AccountMembership f64b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0013a(AccountMembership accountMembership, n64 n64Var) {
                super(2, n64Var);
                this.f64b = accountMembership;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new C0013a(this.f64b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f63a;
                if (i == 0) {
                    wre.m54934b(obj);
                    s07 s07Var = s07.f44359a;
                    AccountMembership accountMembership = this.f64b;
                    this.f63a = 1;
                    obj = s07Var.m47382k(accountMembership, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return obj;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((C0013a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public h0() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            Optional optionalM39158h;
            sq8.m48649h(uniVar, "inst");
            try {
                mii miiVarM54444J = wi0.m54444J();
                AccountMembership accountMembership = (miiVarM54444J == null || (optionalM39158h = miiVarM54444J.m39158h()) == null) ? null : (AccountMembership) optionalM39158h.orElse(null);
                if (accountMembership == null || !((Boolean) qm1.m45641b(null, new C0013a(accountMembership, null), 1, null)).booleanValue()) {
                    return;
                }
                uniVar.ID(MainActivity.this);
            } catch (Exception unused) {
                FirebaseCrashlytics.getInstance().recordException(new RuntimeException("could not call observeOnActivity in main Activity"));
            }
        }
    }

    /* renamed from: ai.salesmax.MainActivity$i */
    public static final class C0014i implements gu3 {

        /* renamed from: a */
        public static final C0014i f65a = new C0014i();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    public static final class i0 implements gu3 {

        /* renamed from: a */
        public static final i0 f66a = new i0();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(new RuntimeException("could not call observeOnActivity outer block in main Activity"));
        }
    }

    /* renamed from: ai.salesmax.MainActivity$j */
    public static final class C0015j implements rl7 {

        /* renamed from: a */
        public static final C0015j f67a = new C0015j();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Leads apply(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "it");
            return leadsSummary.toLeads();
        }
    }

    /* renamed from: ai.salesmax.MainActivity$k */
    public static final class C0016k implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f68a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f69b;

        public C0016k(String str, MainActivity mainActivity) {
            this.f68a = str;
            this.f69b = mainActivity;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Leads leads) {
            sq8.m48649h(leads, "it");
            String str = this.f68a;
            StringBuilder sb = new StringBuilder();
            sb.append("placing call for lead ");
            sb.append(str);
            String str2 = leads.getPhoneNumbers().get(0);
            sq8.m48648g(str2, "get(...)");
            jm7.m34050j(str2, this.f69b, leads);
            String str3 = this.f68a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("In MainActivity successfully placed call for lead ");
            sb2.append(str3);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$l */
    public static final class C0017l implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f70a;

        public C0017l(String str) {
            this.f70a = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            String str = this.f70a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error occurred while placing call for lead ");
            sb.append(str);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$m */
    public static final class C0018m extends jgg implements nl7 {

        /* renamed from: a */
        public int f71a;

        /* renamed from: b */
        public /* synthetic */ Object f72b;

        /* renamed from: ai.salesmax.MainActivity$m$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f74a;

            public a(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f74a;
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01VarM32992a = j01.f29455d.m32992a();
                    this.f74a = 1;
                    if (j01VarM32992a.m32982i(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return uni.LB();
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C0018m(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C0018m c0018m = MainActivity.this.new C0018m(n64Var);
            c0018m.f72b = obj;
            return c0018m;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            h84 h84Var;
            Object objM51918f = uq8.m51918f();
            int i = this.f71a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var2 = (h84) this.f72b;
                try {
                    z74 z74VarM25611b = eu5.m25611b();
                    a aVar = new a(null);
                    this.f72b = h84Var2;
                    this.f71a = 1;
                    if (pm1.m43867g(z74VarM25611b, aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                    h84Var = h84Var2;
                } catch (Exception unused) {
                    h84Var = h84Var2;
                    h84Var.getClass();
                    return y3i.f54824a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h84Var = (h84) this.f72b;
                try {
                    wre.m54934b(obj);
                } catch (Exception unused2) {
                    h84Var.getClass();
                    return y3i.f54824a;
                }
            }
            MainActivity.this.g2().m8605V(z8e.placeCall, null, C2345l.a.m8813k(new C2345l.a().m8817d(true), z8e.placeCall, true, false, 4, null).m8814a());
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C0018m) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$n */
    public static final class C0019n extends jgg implements nl7 {

        /* renamed from: a */
        public int f75a;

        /* renamed from: b */
        public /* synthetic */ Object f76b;

        /* renamed from: d */
        public final /* synthetic */ boolean f78d;

        /* renamed from: e */
        public final /* synthetic */ String f79e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f80f;

        /* renamed from: ai.salesmax.MainActivity$n$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f81a;

            public a(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f81a;
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01VarM32992a = j01.f29455d.m32992a();
                    this.f81a = 1;
                    if (j01VarM32992a.m32982i(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return uni.LB();
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* renamed from: ai.salesmax.MainActivity$n$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f82a;

            /* renamed from: b */
            public final /* synthetic */ MainActivity f83b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f84c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MainActivity mainActivity, Bundle bundle, n64 n64Var) {
                super(2, n64Var);
                this.f83b = mainActivity;
                this.f84c = bundle;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new b(this.f83b, this.f84c, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f82a;
                if (i == 0) {
                    wre.m54934b(obj);
                    this.f82a = 1;
                    if (nk5.m40720b(1000L, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                if (!this.f83b.isFinishing() && !this.f83b.isDestroyed() && this.f83b.g2().m8591G() != null) {
                    try {
                        if (!this.f83b.getSupportFragmentManager().W0() && !this.f83b.getSupportFragmentManager().O0()) {
                            MainActivity mainActivity = this.f83b;
                            if (mainActivity.B2(z8e.lockScreenDisposition, mainActivity.g2())) {
                                this.f83b.g2().m8605V(z8e.lockScreenDisposition, this.f84c, C2345l.a.m8813k(new C2345l.a().m8817d(true), z8e.lockScreenDisposition, true, false, 4, null).m8814a());
                            } else {
                                this.f83b.g2().m8604U(z8e.lockScreenDisposition, this.f84c);
                            }
                        }
                        return y3i.f54824a;
                    } catch (Exception unused) {
                    }
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0019n(boolean z, String str, Bundle bundle, n64 n64Var) {
            super(2, n64Var);
            this.f78d = z;
            this.f79e = str;
            this.f80f = bundle;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C0019n c0019n = MainActivity.this.new C0019n(this.f78d, this.f79e, this.f80f, n64Var);
            c0019n.f76b = obj;
            return c0019n;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x0177
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: Exception -> 0x01d5, TryCatch #4 {Exception -> 0x01d5, blocks: (B:6:0x0010, B:15:0x0038, B:17:0x0041, B:19:0x0045, B:26:0x005a, B:36:0x00b6, B:46:0x0112, B:49:0x011b), top: B:83:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0144 A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:51:0x0136, B:53:0x0144, B:54:0x0169), top: B:75:0x0136, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0169 A[Catch: Exception -> 0x0177, TRY_LEAVE, TryCatch #1 {Exception -> 0x0177, blocks: (B:51:0x0136, B:53:0x0144, B:54:0x0169), top: B:75:0x0136, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.salesmax.MainActivity.C0019n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C0019n) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$o */
    public static final class C0020o implements rl7 {

        /* renamed from: a */
        public static final C0020o f85a = new C0020o();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(x6c x6cVar) {
            return x6cVar;
        }
    }

    /* renamed from: ai.salesmax.MainActivity$p */
    public static final class C0021p implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ Intent f86a;

        public C0021p(Intent intent) {
            this.f86a = intent;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            String stringExtra;
            sq8.m48649h(uniVar, "inst");
            try {
                if (!sq8.m48644c(this.f86a.getType(), HTTP.PLAIN_TEXT_TYPE) || (stringExtra = this.f86a.getStringExtra("android.intent.extra.PROCESS_TEXT")) == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Received text ");
                sb.append(stringExtra);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ai.salesmax.MainActivity$q */
    public static final class C0022q implements gu3 {

        /* renamed from: a */
        public static final C0022q f87a = new C0022q();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: ai.salesmax.MainActivity$r */
    public static final class C0023r implements rl7 {

        /* renamed from: a */
        public static final C0023r f88a = new C0023r();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(x6c x6cVar) {
            return x6cVar;
        }
    }

    /* renamed from: ai.salesmax.MainActivity$s */
    public static final class C0024s implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ Intent f90b;

        public C0024s(Intent intent) {
            this.f90b = intent;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "inst");
            try {
                MainActivity.this.h0.add(this.f90b);
                MainActivity.this.b3();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ai.salesmax.MainActivity$t */
    public static final class C0025t implements gu3 {

        /* renamed from: a */
        public static final C0025t f91a = new C0025t();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: ai.salesmax.MainActivity$u */
    public static final class C0026u extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Intent f92a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f93b;

        /* renamed from: ai.salesmax.MainActivity$u$a */
        public static final class a implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ MainActivity f94a;

            /* renamed from: b */
            public final /* synthetic */ Intent f95b;

            /* renamed from: ai.salesmax.MainActivity$u$a$a, reason: collision with other inner class name */
            public static final class C19507a implements gu3 {

                /* renamed from: a */
                public static final C19507a f96a = new C19507a();

                /* renamed from: a */
                public final void m59a(boolean z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Waba Account is present: ");
                    sb.append(z);
                }

                @Override // p001o.gu3
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    m59a(((Boolean) obj).booleanValue());
                }
            }

            /* renamed from: ai.salesmax.MainActivity$u$a$b */
            public static final class b implements gu3 {

                /* renamed from: a */
                public static final b f97a = new b();

                @Override // p001o.gu3
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(Throwable th) {
                    sq8.m48649h(th, "it");
                }
            }

            public a(MainActivity mainActivity, Intent intent) {
                this.f94a = mainActivity;
                this.f95b = intent;
            }

            /* renamed from: c */
            public static final void m57c(MainActivity mainActivity, Intent intent) {
                sq8.m48649h(mainActivity, "this$0");
                sq8.m48649h(intent, "$intent");
                if (mainActivity.f15d != null) {
                    try {
                        AbstractC2333d abstractC2333dG2 = mainActivity.g2();
                        Uri uri = Uri.parse(String.valueOf(intent.getStringExtra(ImagesContract.URL)));
                        sq8.m48648g(uri, "parse(...)");
                        abstractC2333dG2.m8607X(uri);
                    } catch (Exception unused) {
                    }
                }
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(uni uniVar) {
                sq8.m48649h(uniVar, "it");
                wi0.r0(null, 1, null).v0(C19507a.f96a, b.f97a);
                final MainActivity mainActivity = this.f94a;
                final Intent intent = this.f95b;
                j0f.m33008i(new Runnable() { // from class: o.fpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C0026u.a.m57c(mainActivity, intent);
                    }
                });
            }
        }

        /* renamed from: ai.salesmax.MainActivity$u$b */
        public static final class b implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ MainActivity f98a;

            public b(MainActivity mainActivity) {
                this.f98a = mainActivity;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "it");
                this.f98a.getClass();
            }
        }

        /* renamed from: ai.salesmax.MainActivity$u$c */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f99a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f99a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0026u(Intent intent, MainActivity mainActivity) {
            super(1);
            this.f92a = intent;
            this.f93b = mainActivity;
        }

        /* renamed from: a */
        public final void m55a(yne yneVar) {
            Intent intent = this.f92a;
            MainActivity mainActivity = this.f93b;
            if (c.f99a[yneVar.m58025c().ordinal()] != 1) {
                mainActivity.getClass();
                return;
            }
            int intExtra = intent.getIntExtra("notificationId", -1);
            Object systemService = mainActivity.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(intExtra);
            if (sq8.m48644c(yneVar.m58023a(), Boolean.TRUE)) {
                uni.LB().y0(i5f.m31599c()).v0(new a(mainActivity, intent), new b(mainActivity));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m55a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.MainActivity$v */
    public static final class C0027v implements gu3 {
        public C0027v() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ChatChannel chatChannel) {
            sq8.m48649h(chatChannel, "it");
            Bundle bundle = new Bundle();
            bundle.putParcelable(MainActivity.this.getString(hae.argumentChannel), new ChatChannelSummary(chatChannel).toChatChannel());
            AbstractC2341h abstractC2341hM8591G = MainActivity.this.g2().m8591G();
            if (abstractC2341hM8591G != null) {
                bundle.putInt(MainActivity.this.getString(hae.argumentCurrentDestination), abstractC2341hM8591G.m8753A());
            }
            AbstractC2341h abstractC2341hM8591G2 = MainActivity.this.g2().m8591G();
            if (abstractC2341hM8591G2 != null) {
                abstractC2341hM8591G2.m8753A();
            }
            MainActivity.this.g2().m8604U(z8e.supportChatWindow, bundle);
        }
    }

    /* renamed from: ai.salesmax.MainActivity$w */
    public static final class C0028w implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ vq f101a;

        public C0028w(vq vqVar) {
            this.f101a = vqVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            this.f101a.getClass();
        }
    }

    /* renamed from: ai.salesmax.MainActivity$x */
    public static final class C0029x implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ vq f103b;

        /* renamed from: ai.salesmax.MainActivity$x$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f104a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(mii miiVar) {
                return Boolean.valueOf(sq8.m48644c(UserStatus.ACTIVE.name(), miiVar.m39172v()));
            }
        }

        /* renamed from: ai.salesmax.MainActivity$x$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f105a = new b();

            public b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(mii miiVar) {
                return Boolean.valueOf(AccountType.INDIVIDUAL != miiVar.m39156f().getAccountType());
            }
        }

        /* renamed from: ai.salesmax.MainActivity$x$c */
        public static final class c extends jgg implements nl7 {

            /* renamed from: a */
            public int f106a;

            /* renamed from: b */
            public final /* synthetic */ MainActivity f107b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MainActivity mainActivity, n64 n64Var) {
                super(2, n64Var);
                this.f107b = mainActivity;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new c(this.f107b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f106a;
                if (i == 0) {
                    wre.m54934b(obj);
                    this.f106a = 1;
                    if (nk5.m40720b(1000L, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                this.f107b.g2().m8603T(z8e.workspaceSelector);
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C0029x(vq vqVar) {
            this.f103b = vqVar;
        }

        /* renamed from: e */
        public static final boolean m67e(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: f */
        public static final boolean m68f(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: g */
        public static final void m69g(MainActivity mainActivity, vq vqVar) {
            sq8.m48649h(mainActivity, "this$0");
            sq8.m48649h(vqVar, "$this_apply");
            mainActivity.w2();
            vqVar.o0.m6007e();
        }

        @Override // p001o.gu3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void accept(List list) {
            sq8.m48649h(list, "it");
            if (MainActivity.this.e2() != null) {
                List list2 = (List) Optional.ofNullable(list).orElse(new ArrayList());
                MainActivity mainActivity = MainActivity.this;
                sq8.m48646e(list2);
                Stream stream = list2.stream();
                final a aVar = a.f104a;
                Stream streamFilter = stream.filter(new Predicate() { // from class: o.gpa
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return MainActivity.C0029x.m67e(aVar, obj);
                    }
                });
                final b bVar = b.f105a;
                Object objCollect = streamFilter.filter(new Predicate() { // from class: o.hpa
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return MainActivity.C0029x.m68f(bVar, obj);
                    }
                }).collect(Collectors.toList());
                sq8.m48648g(objCollect, "collect(...)");
                mainActivity.f21s = (List) objCollect;
                if (!bub.m19823b(MainActivity.this) || MainActivity.this.f21s.size() <= 1) {
                    return;
                }
                final MainActivity mainActivity2 = MainActivity.this;
                final vq vqVar = this.f103b;
                j0f.m33008i(new Runnable() { // from class: o.ipa
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.C0029x.m69g(mainActivity2, vqVar);
                    }
                });
                rm1.m46952d(MainActivity.this.j0, null, null, new c(MainActivity.this, null), 3, null);
            }
        }
    }

    /* renamed from: ai.salesmax.MainActivity$y */
    public static final class C0030y implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ vq f108a;

        public C0030y(vq vqVar) {
            this.f108a = vqVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            this.f108a.getClass();
        }
    }

    /* renamed from: ai.salesmax.MainActivity$z */
    public static final class C0031z implements AbstractC2333d.c {
        public C0031z() {
        }

        @Override // androidx.navigation.AbstractC2333d.c
        /* renamed from: a */
        public void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
            sq8.m48649h(abstractC2333d, "controller");
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            MainActivity.this.e2().n0.setEnabled(true);
            MainActivity.this.f8Q = true;
            MainActivity.this.g2().t0(this);
        }
    }

    public MainActivity() {
        ws wsVarRegisterForActivityResult = registerForActivityResult(new vs(), new ns() { // from class: o.tna
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                MainActivity.Q1(this.f47462a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.m0 = wsVarRegisterForActivityResult;
    }

    public static final void A2(MainActivity mainActivity) {
        sq8.m48649h(mainActivity, "this$0");
        if (mainActivity.f12a != null) {
            mainActivity.e2().q0.m10125h();
            mainActivity.e2().q0.setVisibility(8);
        }
    }

    public static final void E2(final MainActivity mainActivity, DialogInterface dialogInterface, int i) {
        sq8.m48649h(mainActivity, "this$0");
        AbstractC0059a.m132a().c2(new jm() { // from class: o.ooa
            @Override // p001o.jm
            public final void run() {
                MainActivity.F2(this.f38664a);
            }
        });
    }

    public static final void F2(MainActivity mainActivity) {
        sq8.m48649h(mainActivity, "this$0");
        try {
            mainActivity.stopService(new Intent(mainActivity, (Class<?>) CallStateManagerService.class));
        } catch (Exception unused) {
            mainActivity.getClass();
        }
    }

    public static final void G2(DialogInterface dialogInterface, int i) {
    }

    public static final void H2(DialogInterface dialogInterface) {
    }

    public static final boolean I2(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    public static final void K2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.s0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            Context context = view.getContext();
            sq8.m48648g(context, "getContext(...)");
            jm7.j0(context, "https://app.salesmax.ai/");
        }
    }

    public static final void L2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.t0.performHapticFeedback(1);
        vqVar.o0.m6007e();
        if (bub.m19823b(mainActivity)) {
            mii miiVarM54444J = wi0.m54444J();
            Account accountM39156f = miiVarM54444J != null ? miiVarM54444J.m39156f() : null;
            wi0.m54459Y((accountM39156f != null ? accountM39156f.getId() : null) + "__SALESMAX_SUPPORT_ALL").v0(mainActivity.new C0027v(), new C0028w(vqVar));
        }
    }

    public static final void M2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.v0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.D2();
        }
    }

    public static final void N2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.n0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.g2().m8603T(z8e.profile);
        }
    }

    public static final void O2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.z0.performHapticFeedback(1);
        xmd xmdVar = mainActivity.f13b;
        if (xmdVar == null) {
            sq8.m48667z("viewModel");
            xmdVar = null;
        }
        xmdVar.m56474f().w0(mainActivity.new C0029x(vqVar), new C0030y(vqVar), new jm() { // from class: o.zna
            @Override // p001o.jm
            public final void run() {
                MainActivity.P2();
            }
        });
    }

    public static final void P2() {
    }

    public static final void Q1(MainActivity mainActivity, ActivityResult activityResult) {
        sq8.m48649h(mainActivity, "this$0");
        if (activityResult.m3726b() == -1) {
            return;
        }
        int iM3726b = activityResult.m3726b();
        StringBuilder sb = new StringBuilder();
        sb.append("Update flow failed! Result code: ");
        sb.append(iM3726b);
        jm7.v0(mainActivity, "Looks like app update failed. Try uninstalling first and reinstalling the app from play store", 0, 0, 12, null);
    }

    public static final boolean Q2(vq vqVar, MainActivity mainActivity, MenuItem menuItem) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        sq8.m48649h(menuItem, "item");
        if (menuItem.getItemId() != vqVar.n0.getSelectedItemId()) {
            vqVar.n0.performHapticFeedback(1);
        }
        ssb.m48875e(menuItem, mainActivity.g2());
        return true;
    }

    public static final void R2(MainActivity mainActivity, final vq vqVar, AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
        sq8.m48649h(mainActivity, "this$0");
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(abstractC2333d, "<anonymous parameter 0>");
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        Bundle bundle2 = new Bundle();
        AbstractC2341h abstractC2341hM8591G = mainActivity.g2().m8591G();
        sq8.m48647f(abstractC2341hM8591G, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        String strM8730V = ((C2339b.c) abstractC2341hM8591G).m8730V();
        bundle2.putString(FirebaseAnalytics.Param.SCREEN_NAME, String.valueOf(abstractC2341h.m8754B()));
        bundle2.putString(FirebaseAnalytics.Param.SCREEN_CLASS, strM8730V);
        FirebaseAnalytics firebaseAnalytics = mainActivity.f22x;
        if (firebaseAnalytics == null) {
            sq8.m48667z("firebaseAnalytics");
            firebaseAnalytics = null;
        }
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle2);
        int iM8753A = abstractC2341h.m8753A();
        if ((((iM8753A == z8e.home_start || iM8753A == z8e.leads_start) || iM8753A == z8e.activity_start) || iM8753A == z8e.todo_start) || iM8753A == z8e.chat_start) {
            j0f.m33008i(new Runnable() { // from class: o.goa
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.S2(vqVar);
                }
            });
        } else {
            j0f.m33008i(new Runnable() { // from class: o.ioa
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.T2(vqVar);
                }
            });
        }
    }

    public static final void S1(final MainActivity mainActivity, jq2 jq2Var) {
        vq vqVarE2;
        sq8.m48649h(mainActivity, "this$0");
        sq8.m48649h(jq2Var, "$chatMessageWatcher1");
        mainActivity.f23y = jq2Var;
        if (mainActivity.isDestroyed() || mainActivity.isFinishing() || !mainActivity.f8Q || (vqVarE2 = mainActivity.e2()) == null) {
            return;
        }
        final C10936a c10936aM14840d = vqVarE2.n0.m14840d(z8e.chat);
        sq8.m48648g(c10936aM14840d, "getOrCreateBadge(...)");
        jq2 jq2Var2 = mainActivity.f23y;
        if (jq2Var2 != null) {
            jq2Var2.m34261A(mainActivity, new ResultsChangeListener() { // from class: o.roa
                @Override // ai.salesmax.model.event.ResultsChangeListener
                public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                    MainActivity.T1(c10936aM14840d, mainActivity, resultsChangedEvent);
                }
            });
        }
    }

    public static final void S2(vq vqVar) {
        sq8.m48649h(vqVar, "$this_apply");
        vqVar.o0.setDrawerLockMode(0);
        BottomNavigationView bottomNavigationView = vqVar.n0;
        sq8.m48648g(bottomNavigationView, "bottomNav");
        iwi.m32871b(bottomNavigationView);
    }

    public static final void T1(C10936a c10936a, MainActivity mainActivity, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(c10936a, "$badge");
        sq8.m48649h(mainActivity, "this$0");
        Optional optionalFindFirst = resultsChangedEvent.itemsChanged().stream().findFirst();
        final C0003a c0003a = new C0003a(c10936a, mainActivity);
        optionalFindFirst.ifPresent(new Consumer() { // from class: o.toa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MainActivity.U1(c0003a, obj);
            }
        });
    }

    public static final void T2(vq vqVar) {
        sq8.m48649h(vqVar, "$this_apply");
        vqVar.o0.setDrawerLockMode(1);
        BottomNavigationView bottomNavigationView = vqVar.n0;
        sq8.m48648g(bottomNavigationView, "bottomNav");
        iwi.m32870a(bottomNavigationView);
    }

    public static final void U1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void U2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.w0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.g2().m8603T(z8e.content);
        }
    }

    public static final void V2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.x0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.g2().m8603T(z8e.settings);
        }
    }

    public static final void W2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.r0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.g2().m8603T(z8e.admin);
        }
    }

    public static final void X1(Snackbar snackbar, View view) {
        sq8.m48649h(snackbar, "$snackbar");
        snackbar.mo15170x();
        wi0.y0();
    }

    public static final void X2(vq vqVar, MainActivity mainActivity, View view) {
        sq8.m48649h(vqVar, "$this_apply");
        sq8.m48649h(mainActivity, "this$0");
        vqVar.p0.y0.performHapticFeedback(1);
        if (bub.m19823b(mainActivity)) {
            mainActivity.g2().m8603T(z8e.support);
        }
    }

    public static final void Z1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void Z2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void a2(MainActivity mainActivity, Exception exc) {
        sq8.m48649h(mainActivity, "this$0");
        sq8.m48649h(exc, "e");
        mainActivity.b2();
    }

    public static final void d3(MainActivity mainActivity, HubEvent hubEvent) {
        sq8.m48649h(mainActivity, "this$0");
        sq8.m48649h(hubEvent, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("calling observeOnActivity from registerAuthListeners ");
        sb.append(hubEvent);
        if (sq8.m48644c(hubEvent.getName(), AuthChannelEventName.SIGNED_IN.toString())) {
            mainActivity.p3();
        }
        if (sq8.m48644c(hubEvent.getName(), AuthChannelEventName.SESSION_EXPIRED.toString())) {
            rm1.m46952d(mainActivity.j0, null, null, mainActivity.new e0(null), 3, null);
        }
    }

    public static final void f3(MainActivity mainActivity) {
        sq8.m48649h(mainActivity, "this$0");
        mainActivity.g2().g0(z8e.home, true);
        mainActivity.g2().m8603T(z8e.landing);
    }

    public static final void j2() {
    }

    public static /* synthetic */ void l3(MainActivity mainActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mainActivity.k3(z);
    }

    public static final void m3(MainActivity mainActivity, boolean z) {
        sq8.m48649h(mainActivity, "this$0");
        if (mainActivity.f12a != null) {
            mainActivity.e2().q0.m10124g(new yc9("**"), mma.f35706K, new qma(new ltf(c64.getColor(mainActivity, z ? u6e.superfone_white : u6e.superfone_blue))));
            mainActivity.e2().q0.setVisibility(0);
            mainActivity.e2().q0.m10135r();
        }
    }

    public static final x6c q2() {
        return uni.LB();
    }

    public static final x6c q3() {
        return uni.LB();
    }

    public static final void r2() {
    }

    public static final void r3() {
    }

    public static final x6c t2() {
        return uni.LB();
    }

    public static final void u2() {
    }

    public static final void y2() {
    }

    public final boolean B2(int i, AbstractC2333d abstractC2333d) {
        Object objM53351b;
        try {
            vre.C17665a c17665a = vre.f50797b;
            abstractC2333d.m8588D(i);
            objM53351b = vre.m53351b(Boolean.TRUE);
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        Boolean boolValueOf = Boolean.valueOf(vre.m53357h(objM53351b));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean C2() {
        FragmentManager childFragmentManager;
        Fragment fragmentL0 = getSupportFragmentManager().l0(z8e.nav_host);
        Fragment fragmentG0 = null;
        NavHostFragment navHostFragment = fragmentL0 instanceof NavHostFragment ? (NavHostFragment) fragmentL0 : null;
        if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null) {
            fragmentG0 = childFragmentManager.G0();
        }
        return fragmentG0 instanceof PlaceCallFragment;
    }

    public final void D2() {
        new nta(this).mo3873f("Are you sure you want to logout?").mo3878k("Yes", new DialogInterface.OnClickListener() { // from class: o.joa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.E2(this.f30849a, dialogInterface, i);
            }
        }).mo3874g("No", new DialogInterface.OnClickListener() { // from class: o.koa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.G2(dialogInterface, i);
            }
        }).mo3869b(false).mo3876i(new DialogInterface.OnCancelListener() { // from class: o.loa
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MainActivity.H2(dialogInterface);
            }
        }).mo3877j(new DialogInterface.OnKeyListener() { // from class: o.moa
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return MainActivity.I2(dialogInterface, i, keyEvent);
            }
        }).m3880m();
    }

    public final void J2() {
        AbstractC0059a.m132a().Z1(System.currentTimeMillis());
    }

    public void R1(final jq2 jq2Var) {
        sq8.m48649h(jq2Var, "chatMessageWatcher1");
        j0f.m33008i(new Runnable() { // from class: o.qoa
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.S1(this.f42244a, jq2Var);
            }
        });
    }

    public final void V1() {
        j01.f29455d.m32992a().m32981h().observe(this, new f0(new C0004b()));
    }

    public final void W1() {
        AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
        View viewFindViewById = findViewById(android.R.id.content);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        boolean z = false;
        if (autoCallConfigM54443I != null && autoCallConfigM54443I.isPaused()) {
            z = true;
        }
        if (!z || C2()) {
            return;
        }
        final Snackbar snackbarL0 = Snackbar.l0(viewFindViewById, "Auto Calling is Paused. Tap here to go back & resume", -2);
        sq8.m48648g(snackbarL0, "make(...)");
        View viewM15146G = snackbarL0.m15146G();
        sq8.m48648g(viewM15146G, "getView(...)");
        viewM15146G.setElevation(25.0f);
        if (viewM15146G.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = viewM15146G.getLayoutParams();
            sq8.m48647f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = 100;
            viewM15146G.setLayoutParams(layoutParams2);
        }
        snackbarL0.n0("No, Stop", new View.OnClickListener() { // from class: o.wna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.X1(snackbarL0, view);
            }
        });
        snackbarL0.m15166r(new C0005c(snackbarL0, this));
        snackbarL0.mo15162W();
    }

    public final void Y1() {
        try {
            cn0 cn0VarM23570a = dn0.m23570a(this);
            sq8.m48648g(cn0VarM23570a, "create(...)");
            this.f10Y = cn0VarM23570a;
            if (cn0VarM23570a == null) {
                sq8.m48667z("appUpdateManager");
                cn0VarM23570a = null;
            }
            Task taskMo21439a = cn0VarM23570a.mo21439a();
            sq8.m48648g(taskMo21439a, "getAppUpdateInfo(...)");
            final C0006d c0006d = new C0006d();
            taskMo21439a.addOnSuccessListener(new OnSuccessListener() { // from class: o.xna
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MainActivity.Z1(c0006d, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: o.yna
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    MainActivity.a2(this.f55733a, exc);
                }
            });
        } catch (Exception unused) {
            b2();
        }
    }

    public final void Y2() {
        this.h0.clear();
        this.i0 = false;
    }

    public final void a3() {
        this.i0 = false;
        if (!this.h0.isEmpty()) {
            b3();
        }
    }

    public final void b2() {
        p74.f39487a.m43079g(new C0009e("https://superfone-user-content185347-pqa.s3.ap-south-1.amazonaws.com/public/salesmax_app_version_latest.json", "ai.salesmax", this, ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0), null));
    }

    public final void b3() {
        p69 p69Var = this.k0;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.k0 = rm1.m46952d(this.j0, null, null, new d0(null), 3, null);
    }

    public final void c2() {
        if (this.f6L) {
            return;
        }
        oaj oajVarM54105a = w8j.m54105a(getWindow(), getWindow().getDecorView());
        sq8.m48648g(oajVarM54105a, "getInsetsController(...)");
        oajVarM54105a.m41890e(2);
        oajVarM54105a.m41886a(r9j.C16576m.m46449e());
        this.f6L = true;
    }

    public final void c3() {
        SubscriptionToken subscriptionToken = this.f9X;
        if (subscriptionToken != null) {
            Amplify.Hub.unsubscribe(subscriptionToken);
        }
        this.f9X = Amplify.Hub.subscribe(HubChannel.AUTH, new HubSubscriber() { // from class: o.coa
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                MainActivity.d3(this.f18458a, hubEvent);
            }
        });
    }

    public final void d2() {
        if (this.f6L) {
            oaj oajVarM54105a = w8j.m54105a(getWindow(), getWindow().getDecorView());
            sq8.m48648g(oajVarM54105a, "getInsetsController(...)");
            oajVarM54105a.m41891f(r9j.C16576m.m46449e());
            this.f6L = false;
        }
    }

    public final vq e2() {
        vq vqVar = this.f12a;
        sq8.m48646e(vqVar);
        return vqVar;
    }

    public final void e3() {
        j0f.m33008i(new Runnable() { // from class: o.foa
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.f3(this.f23855a);
            }
        });
    }

    public final String f2(Context context) {
        context.getPackageManager();
        boolean zM35178a = k8j.m35178a(context, "com.whatsapp");
        boolean zM35178a2 = k8j.m35178a(context, "com.whatsapp.w4b");
        if (zM35178a && !zM35178a2) {
            return "com.whatsapp";
        }
        if (zM35178a2 && !zM35178a) {
            return "com.whatsapp.w4b";
        }
        if (zM35178a2 && zM35178a) {
            return "both";
        }
        return null;
    }

    public final AbstractC2333d g2() {
        AbstractC2333d abstractC2333d = this.f15d;
        if (abstractC2333d != null) {
            return abstractC2333d;
        }
        sq8.m48667z("navController");
        return null;
    }

    public final void g3(AbstractC2333d abstractC2333d) {
        sq8.m48649h(abstractC2333d, "<set-?>");
        this.f15d = abstractC2333d;
    }

    public final void h2() {
        xmd xmdVar = this.f13b;
        if (xmdVar == null) {
            sq8.m48667z("viewModel");
            xmdVar = null;
        }
        xmdVar.m56475g().m55025w(i5f.m31599c()).m55020q(of0.m42164c()).m55024u(new C0010f(), C0011g.f58a);
    }

    public final boolean h3() {
        return System.currentTimeMillis() - AbstractC0059a.m132a().w0() > TimeUnit.DAYS.toMillis(1L);
    }

    public final void i2(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        Bundle bundle = new Bundle();
        bundle.putParcelable(getString(hae.argumentSharedFile), uri);
        uni.LB().w0(new C0012h(bundle), C0014i.f65a, new jm() { // from class: o.noa
            @Override // p001o.jm
            public final void run() {
                MainActivity.j2();
            }
        });
    }

    public final void i3() {
        e2().n0.setVisibility(0);
    }

    public final void j3(boolean z) {
        if (!z) {
            e2().o0.m6007e();
        } else {
            h2();
            e2().o0.mo6003a();
        }
    }

    public final void k2(boolean z) {
        FragmentManager childFragmentManager;
        List listB0;
        if (!z) {
            if (bub.m19823b(this)) {
                this.f20q = false;
                return;
            } else {
                this.f20q = true;
                this.f19h = jm7.v0(this, "No Internet Availability", -2, 0, 8, null);
                return;
            }
        }
        Snackbar snackbar = this.f19h;
        if (snackbar != null) {
            snackbar.mo15170x();
        }
        if (this.f20q) {
            try {
                List listB02 = getSupportFragmentManager().B0();
                sq8.m48648g(listB02, "getFragments(...)");
                Fragment fragment = (Fragment) kh3.r0(listB02);
                if (((fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null || (listB0 = childFragmentManager.B0()) == null) ? null : (Fragment) listB0.get(0)) instanceof LandingFragment) {
                    g2().m8603T(z8e.home);
                }
            } catch (Exception e) {
                e.toString();
            }
        }
        this.f20q = false;
    }

    public final void k3(final boolean z) {
        j0f.m33008i(new Runnable() { // from class: o.hoa
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.m3(this.f27252a, z);
            }
        });
    }

    public final void l2(Intent intent) {
        String stringExtra = intent.getStringExtra("lead-id-to-call");
        lw9.c1(stringExtra).m47686M(C0015j.f67a).m47697Z(new C0016k(stringExtra, this), new C0017l(stringExtra));
    }

    public final void m2(Intent intent) {
        String stringExtra = intent.getStringExtra("channelId");
        String stringExtra2 = intent.getStringExtra("contactId");
        if (stringExtra != null) {
            Bundle bundle = new Bundle();
            bundle.putString(getString(hae.argumentLeadId), stringExtra2);
            bundle.putString(getString(hae.argumentChatWindowMode), "standalone");
            if (!B2(z8e.chatWindow, g2())) {
                g2().m8604U(z8e.chatWindow, bundle);
            } else {
                g2().m8605V(z8e.chatWindow, bundle, C2345l.a.m8813k(new C2345l.a().m8817d(true), z8e.chatWindow, true, false, 4, null).m8814a());
            }
        }
    }

    public final void n2(Intent intent) {
        String action = intent.getAction();
        String type2 = intent.getType();
        StringBuilder sb = new StringBuilder();
        sb.append("intent received with action: ");
        sb.append(action);
        sb.append(", and type: ");
        sb.append(type2);
        sb.append(", and intent: ");
        sb.append(intent);
        Leads leads = (Leads) intent.getParcelableExtra(getString(hae.argumentLeads));
        String stringExtra = intent.getStringExtra(getString(hae.argumentLeadId));
        String stringExtra2 = intent.getStringExtra(getString(hae.argumentEngagementID));
        Tasks tasks = (Tasks) intent.getParcelableExtra(getString(hae.argumentTasks));
        String stringExtra3 = intent.getStringExtra(getString(hae.argumentOutcomeNature));
        boolean booleanExtra = intent.getBooleanExtra(getString(hae.argumentLeadsOpenCallDetails), false);
        boolean booleanExtra2 = intent.getBooleanExtra(getString(hae.argumentLeadsContinueAutoCall), false);
        boolean booleanExtra3 = intent.getBooleanExtra(getString(hae.argumentLeadsIsInCall), false);
        if (booleanExtra2) {
            intent.removeExtra(getString(hae.argumentLeadsContinueAutoCall));
            intent.removeExtra(getString(hae.argumentLeadsIsInCall));
            rm1.m46952d(yca.m57521a(this), null, null, new C0018m(null), 3, null);
            return;
        }
        if (leads == null) {
            this.f7M = null;
            return;
        }
        intent.removeExtra(getString(hae.argumentLeads));
        intent.removeExtra(getString(hae.argumentTasks));
        intent.removeExtra(getString(hae.argumentEngagementID));
        intent.removeExtra(getString(hae.argumentOutcomeNature));
        intent.removeExtra(getString(hae.argumentLeadsOpenCallDetails));
        intent.removeExtra(getString(hae.argumentLeadsContinueAutoCall));
        intent.removeExtra(getString(hae.argumentLeadsIsInCall));
        intent.removeExtra(getString(hae.argumentLeadId));
        Bundle bundle = new Bundle();
        bundle.putParcelable(getString(hae.argumentLeads), leads);
        bundle.putParcelable(getString(hae.argumentTasks), tasks);
        bundle.putString("callLogId", stringExtra2);
        bundle.putString("callOutcomeType", stringExtra3);
        bundle.putBoolean("callInProgress", booleanExtra3);
        bundle.putString(getString(hae.argumentLeadId), stringExtra);
        bundle.putBoolean(getString(hae.argumentLeadsOpenCallDetails), booleanExtra);
        rm1.m46952d(yca.m57521a(this), null, null, new C0019n(booleanExtra, stringExtra3, bundle, null), 3, null);
    }

    public final void n3() {
        if (Build.VERSION.SDK_INT < 27) {
            getWindow().addFlags(6815872);
        } else {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        }
    }

    public final void o2() {
        if (isFinishing() || isDestroyed() || !this.f8Q) {
            this.f7M = null;
            return;
        }
        Intent intent = this.f7M;
        if (intent != null) {
            if (sq8.m48644c("android.intent.action.PROCESS_TEXT", intent.getAction())) {
                p2(intent);
                return;
            }
            if (sq8.m48644c("ai.salesmax.ACTION_DEVICE_REGISTERED", intent.getAction())) {
                return;
            }
            if (sq8.m48644c("ai.salesmax.SHOW_ALERT", intent.getAction())) {
                s2(intent);
                this.f7M = null;
                setIntent(null);
                return;
            }
            if (sq8.m48644c("ai.salesmax.OPEN_CHAT", intent.getAction())) {
                m2(intent);
                this.f7M = null;
                setIntent(null);
                return;
            }
            if (intent.getStringExtra(ImagesContract.URL) != null) {
                v2(intent);
                this.f7M = null;
                setIntent(null);
            } else if (intent.getStringExtra("lead-id-to-call") != null) {
                l2(intent);
                this.f7M = null;
                setIntent(null);
            } else if (sq8.m48644c("android.intent.action.SEND", intent.getAction())) {
                i2(intent);
                this.f7M = null;
                setIntent(null);
            } else {
                n2(intent);
                this.f7M = null;
                setIntent(null);
            }
        }
    }

    public final void o3() {
        try {
            CallStateManagerRestarterBroadcastReceiver.m2586n(getApplicationContext());
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(new RuntimeException("MainActivity: startCallStateManagerService, couldn't get current user required to start call state manager service", e));
        }
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 15426) {
            int i3 = Settings.canDrawOverlays(this) ? 0 : -1;
            List<String> list = j4d.f29774E;
            sq8.m48648g(list, "DRAW_OVER_APP_PERMISSIONS");
            String[] strArr = (String[]) list.toArray(new String[0]);
            sq8.m48648g(list, "DRAW_OVER_APP_PERMISSIONS");
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            for (String str : list) {
                arrayList.add(Integer.valueOf(i3));
            }
            n0(i, strArr, kh3.P0(arrayList));
        }
        if (i == 16421) {
            u0(i);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        n3();
        n0g.f36171b.m39952a(this);
        cn0 cn0VarM23570a = dn0.m23570a(this);
        sq8.m48648g(cn0VarM23570a, "create(...)");
        this.f10Y = cn0VarM23570a;
        super.onCreate(bundle);
        this.f22x = AnalyticsKt.getAnalytics(Firebase.INSTANCE);
        this.f12a = vq.h0(getLayoutInflater());
        this.f13b = (xmd) new androidx.lifecycle.b0(this).m6505a(xmd.class);
        this.f14c = (pz7) new androidx.lifecycle.b0(this).m6505a(pz7.class);
        setContentView(e2().m25689B());
        e2().n0.setEnabled(false);
        if (h3()) {
            Y1();
            J2();
        }
        c3();
        V1();
        AppCompatActivity appCompatActivityM32119a = ih0.m32119a(this);
        AbstractC2333d.c cVar = null;
        String strF2 = appCompatActivityM32119a != null ? f2(appCompatActivityM32119a) : null;
        if (!sq8.m48644c(strF2, "both")) {
            AbstractC0059a.m132a().X0(sq8.m48644c(strF2, "com.whatsapp.w4b"));
        }
        final vq vqVarE2 = e2();
        h2();
        Fragment fragmentL0 = getSupportFragmentManager().l0(z8e.nav_host);
        NavHostFragment navHostFragment = fragmentL0 instanceof NavHostFragment ? (NavHostFragment) fragmentL0 : null;
        if (navHostFragment != null && navHostFragment.isAdded()) {
            g3(navHostFragment.J0());
            g2().m8611r(new C0031z());
            BottomNavigationView bottomNavigationView = vqVarE2.n0;
            sq8.m48648g(bottomNavigationView, "bottomNav");
            xk1.m56383a(bottomNavigationView, g2());
            vqVarE2.n0.setOnItemSelectedListener(new NavigationBarView.InterfaceC11080c() { // from class: o.soa
                @Override // com.google.android.material.navigation.NavigationBarView.InterfaceC11080c
                /* renamed from: a */
                public final boolean mo14848a(MenuItem menuItem) {
                    return MainActivity.Q2(vqVarE2, this, menuItem);
                }
            });
        }
        vqVarE2.n0.setItemActiveIndicatorColor(getColorStateList(u6e.superfone_purple_10));
        this.f17f = new AbstractC2333d.c() { // from class: o.voa
            @Override // androidx.navigation.AbstractC2333d.c
            /* renamed from: a */
            public final void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle2) {
                MainActivity.R2(this.f50668a, vqVarE2, abstractC2333d, abstractC2341h, bundle2);
            }
        };
        AbstractC2333d abstractC2333dG2 = g2();
        AbstractC2333d.c cVar2 = this.f17f;
        if (cVar2 == null) {
            sq8.m48667z("destinationListener");
        } else {
            cVar = cVar2;
        }
        abstractC2333dG2.m8611r(cVar);
        vqVarE2.o0.setDrawerLockMode(0);
        Application application = getApplication();
        sq8.m48648g(application, "getApplication(...)");
        jga jgaVar = new jga(application);
        this.f16e = jgaVar;
        jgaVar.observe(this, new f0(new a0()));
        vqVarE2.o0.m6004b(new b0(vqVarE2, this));
        vqVarE2.p0.w0.setOnClickListener(new View.OnClickListener() { // from class: o.woa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.U2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.x0.setOnClickListener(new View.OnClickListener() { // from class: o.xoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.V2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.r0.setOnClickListener(new View.OnClickListener() { // from class: o.yoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.W2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.y0.setOnClickListener(new View.OnClickListener() { // from class: o.zoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.X2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.s0.setOnClickListener(new View.OnClickListener() { // from class: o.nna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.K2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.t0.setOnClickListener(new View.OnClickListener() { // from class: o.ona
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.L2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.v0.setOnClickListener(new View.OnClickListener() { // from class: o.pna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.M2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.qna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.N2(vqVarE2, this, view);
            }
        });
        vqVarE2.p0.z0.setOnClickListener(new View.OnClickListener() { // from class: o.uoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.O2(vqVarE2, this, view);
            }
        });
        bub.m19822a();
        z2();
        if (getIntent() != null) {
            this.f7M = getIntent();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        n9c n9cVar;
        try {
            jq2 jq2Var = this.f23y;
            if (jq2Var != null) {
                jq2Var.f0();
            }
        } catch (Exception unused) {
        }
        SubscriptionToken subscriptionToken = this.f9X;
        if (subscriptionToken != null) {
            Amplify.Hub.unsubscribe(subscriptionToken);
        }
        this.f9X = null;
        if (isFinishing() && !isChangingConfigurations()) {
            try {
                uni.OB();
                jga jgaVar = this.f16e;
                if (jgaVar != null && (n9cVar = this.f18g) != null) {
                    if (jgaVar == null) {
                        sq8.m48667z("cld");
                        jgaVar = null;
                    }
                    jgaVar.removeObserver(n9cVar);
                    this.f18g = null;
                }
            } catch (IllegalStateException unused2) {
            }
        }
        if (this.f15d != null && this.f17f != null) {
            AbstractC2333d abstractC2333dG2 = g2();
            AbstractC2333d.c cVar = this.f17f;
            if (cVar == null) {
                sq8.m48667z("destinationListener");
                cVar = null;
            }
            abstractC2333dG2.t0(cVar);
        }
        i84.m31710d(this.j0, null, 1, null);
        this.f12a = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        n3();
        setIntent(intent);
        if (intent != null) {
            this.f7M = intent;
            if (sq8.m48644c("ai.salesmax.SHOW_ALERT", intent.getAction())) {
                this.f7M = intent;
            }
        }
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentError(int i, String str, PaymentData paymentData) {
        jm7.v0(this, "Payment Failed due to error : " + (paymentData != null ? paymentData.getData() : null), 0, 0, 12, null);
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentSuccess(String str, PaymentData paymentData) {
        jm7.v0(this, "Payment is successful : " + (paymentData != null ? paymentData.getData() : null), 0, 0, 12, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        sq8.m48649h(strArr, "permissions");
        sq8.m48649h(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        n0(i, strArr, iArr);
        strArr.toString();
        String.valueOf(i);
        iArr.toString();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        W1();
        cn0 cn0Var = this.f10Y;
        if (cn0Var == null) {
            sq8.m48667z("appUpdateManager");
            cn0Var = null;
        }
        Task taskMo21439a = cn0Var.mo21439a();
        final c0 c0Var = new c0();
        taskMo21439a.addOnSuccessListener(new OnSuccessListener() { // from class: o.rna
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MainActivity.Z2(c0Var, obj);
            }
        });
        if (bub.m19823b(this)) {
            this.f20q = false;
        } else {
            this.f20q = true;
            this.f19h = jm7.v0(this, "No Internet Availability", -2, 0, 8, null);
        }
        o2();
    }

    public final void p2(Intent intent) {
        j0f.m33011l(x6c.m55697U(new Callable() { // from class: o.una
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MainActivity.q2();
            }
        }).m55717M(C0020o.f85a), new C0021p(intent), C0022q.f87a, new jm() { // from class: o.vna
            @Override // p001o.jm
            public final void run() {
                MainActivity.r2();
            }
        });
    }

    public final void p3() {
        j0f.m33011l(x6c.m55697U(new Callable() { // from class: o.aoa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MainActivity.q3();
            }
        }).m55717M(g0.f59a), new h0(), i0.f66a, new jm() { // from class: o.boa
            @Override // p001o.jm
            public final void run() {
                MainActivity.r3();
            }
        });
    }

    public final void s2(Intent intent) {
        j0f.m33011l(x6c.m55697U(new Callable() { // from class: o.doa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MainActivity.t2();
            }
        }).m55717M(C0023r.f88a), new C0024s(intent), C0025t.f91a, new jm() { // from class: o.eoa
            @Override // p001o.jm
            public final void run() {
                MainActivity.u2();
            }
        });
    }

    public final void s3(String str) {
        Window window = getWindow();
        sq8.m48648g(window, "getWindow(...)");
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(Color.parseColor(str));
        String hexString = Integer.toHexString(c64.getColor(this, u6e.superfone_white));
        sq8.m48648g(hexString, "toHexString(...)");
        String strSubstring = hexString.substring(2);
        sq8.m48648g(strSubstring, "substring(...)");
        window.setNavigationBarColor(Color.parseColor(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strSubstring));
    }

    public final void v2(Intent intent) {
        try {
            j01.f29455d.m32992a().m32981h().observe(this, new f0(new C0026u(intent, this)));
        } catch (Exception unused) {
        }
    }

    public final void w2() {
        e2().n0.setVisibility(8);
    }

    public final void x2() {
        j0f.m33008i(new Runnable() { // from class: o.poa
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.y2();
            }
        });
    }

    public final void z2() {
        j0f.m33008i(new Runnable() { // from class: o.sna
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.A2(this.f45678a);
            }
        });
    }
}
