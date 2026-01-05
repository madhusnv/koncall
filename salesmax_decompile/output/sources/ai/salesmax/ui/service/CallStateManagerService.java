package ai.salesmax.ui.service;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.health.HealthCheckHandler;
import ai.salesmax.ui.call.CallStateListenerAsync;
import ai.salesmax.ui.service.CallStateManagerService;
import ai.salesmax.util.Prefs;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import p001o.ayh;
import p001o.bch;
import p001o.c64;
import p001o.e60;
import p001o.egf;
import p001o.fia;
import p001o.ga1;
import p001o.gd;
import p001o.ggd;
import p001o.gu3;
import p001o.hae;
import p001o.hv1;
import p001o.i5f;
import p001o.ife;
import p001o.j01;
import p001o.j0f;
import p001o.j12;
import p001o.j4d;
import p001o.jm;
import p001o.ke1;
import p001o.l1;
import p001o.mbj;
import p001o.mii;
import p001o.n9c;
import p001o.o3d;
import p001o.o83;
import p001o.of0;
import p001o.pe;
import p001o.t3c;
import p001o.uni;
import p001o.v1c;
import p001o.w02;
import p001o.w7e;
import p001o.wee;
import p001o.x6c;
import p001o.yt1;
import p001o.z9b;
import p001o.zfa;

/* loaded from: classes.dex */
public class CallStateManagerService extends Service implements RecognitionListener {

    /* renamed from: H */
    public static Service f3572H;

    /* renamed from: L */
    public static BroadcastReceiver f3573L;

    /* renamed from: b */
    public HealthCheckHandler f3575b;

    /* renamed from: c */
    public SpeechRecognizer f3576c;

    /* renamed from: d */
    public InterfaceC1217d f3577d;

    /* renamed from: h */
    public WorkManager f3581h;

    /* renamed from: x */
    public ife f3584x;

    /* renamed from: a */
    public int f3574a = 0;

    /* renamed from: e */
    public final AtomicBoolean f3578e = new AtomicBoolean(false);

    /* renamed from: f */
    public final z9b f3579f = new z9b();

    /* renamed from: g */
    public final ga1 f3580g = ga1.f24776h.m28255a();

    /* renamed from: q */
    public String f3582q = mbj.RECONCILIATION.name();

    /* renamed from: s */
    public AtomicReference f3583s = new AtomicReference();

    /* renamed from: y */
    public final BroadcastReceiver f3585y = new C1214a();

    /* renamed from: ai.salesmax.ui.service.CallStateManagerService$a */
    public class C1214a extends BroadcastReceiver {

        /* renamed from: a */
        public final List f3586a = t3c.m49220a(new Object[]{hv1.f27574f.m31195a()});

        public C1214a() {
        }

        /* renamed from: d */
        public static /* synthetic */ void m2643d(o3d o3dVar, Context context) {
            o3dVar.mo19749a(context.getApplicationContext());
        }

        /* renamed from: e */
        public static /* synthetic */ void m2644e(o3d o3dVar, Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in processing permission change listener: ");
            sb.append(o3dVar.getClass().getSimpleName());
        }

        /* renamed from: f */
        public static /* synthetic */ void m2645f(final Context context, final o3d o3dVar) {
            ayh.Z2(new o83() { // from class: o.x12
                @Override // p001o.o83
                public final void run() {
                    CallStateManagerService.C1214a.m2643d(o3dVar, context);
                }
            }).q1(new Consumer() { // from class: o.y12
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    CallStateManagerService.C1214a.m2644e(o3dVar, (Throwable) obj);
                }
            });
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            StringBuilder sb = new StringBuilder();
            sb.append("Received intent: ");
            sb.append(intent.getAction());
            if ("ai.salesmax.RESTART_CALL_STATE_MANAGER_SERVICE".equalsIgnoreCase(intent.getAction())) {
                CallStateManagerService.this.stopSelf();
            } else {
                this.f3586a.forEach(new Consumer() { // from class: o.w12
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        CallStateManagerService.C1214a.m2645f(context, (o3d) obj);
                    }
                });
            }
        }
    }

    /* renamed from: ai.salesmax.ui.service.CallStateManagerService$b */
    public static /* synthetic */ class C1215b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3588a;

        static {
            int[] iArr = new int[mbj.values().length];
            f3588a = iArr;
            try {
                iArr[mbj.RECONCILIATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3588a[mbj.CALL_RECONCILIATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3588a[mbj.RECORDING_RECONCILIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3588a[mbj.ENGAGEMENT_CLEANUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3588a[mbj.APP_VERSION_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3588a[mbj.LOCATION_RECONCILIATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: ai.salesmax.ui.service.CallStateManagerService$c */
    public class BinderC1216c extends Binder {
    }

    /* renamed from: ai.salesmax.ui.service.CallStateManagerService$d */
    public interface InterfaceC1217d {
        /* renamed from: a */
        void mo2646a();

        /* renamed from: b */
        void mo2647b();

        /* renamed from: c */
        void mo2648c(String str);
    }

    /* renamed from: J */
    public static Service m2593J() {
        return f3572H;
    }

    /* renamed from: L */
    public static x6c m2594L() {
        return j01.f29455d.m32992a().m32986o();
    }

    /* renamed from: N */
    public static /* synthetic */ void m2595N(Prefs prefs) {
        prefs.m3239a(fia.f23398f.m26768a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m2596O() {
        unregisterReceiver(f3573L);
    }

    /* renamed from: P */
    public static /* synthetic */ void m2597P(Throwable th) {
    }

    /* renamed from: Q */
    public static /* synthetic */ void m2598Q(Void r0) {
    }

    /* renamed from: R */
    public static /* synthetic */ void m2599R() {
        f3573L.clearAbortBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m2600S() {
        f3573L = new CallStateListenerAsync(this.f3575b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
        intentFilter.addAction(this.f3575b.healthCheckAction());
        intentFilter.setPriority(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(f3573L, intentFilter, 2);
        } else {
            registerReceiver(f3573L, intentFilter);
        }
    }

    /* renamed from: T */
    public static /* synthetic */ void m2601T(Throwable th) {
        FirebaseCrashlytics.getInstance().log("Couldn't register server" + th.getMessage());
        FirebaseCrashlytics.getInstance().recordException(th);
    }

    /* renamed from: U */
    public static /* synthetic */ void m2602U(Void r0) {
    }

    /* renamed from: V */
    public static /* synthetic */ boolean m2603V(WorkInfo workInfo, WorkInfo workInfo2) {
        return workInfo.getId().equals(workInfo2.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ boolean m2604W(final WorkInfo workInfo, mbj mbjVar) {
        zfa workInfosForUniqueWork = this.f3581h.getWorkInfosForUniqueWork(mbjVar.name());
        Objects.requireNonNull(workInfosForUniqueWork);
        return ((List) ayh.H1(new j12(workInfosForUniqueWork)).B2(new bch())).stream().anyMatch(new Predicate() { // from class: o.k12
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CallStateManagerService.m2603V(workInfo, (WorkInfo) obj);
            }
        });
    }

    /* renamed from: X */
    public static /* synthetic */ void m2605X(uni uniVar) {
    }

    /* renamed from: Y */
    public static /* synthetic */ void m2606Y(Prefs prefs) {
        prefs.B0(fia.f23398f.m26768a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ String m2607Z() {
        return getString(hae.app_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(l1 l1Var) {
        this.f3579f.setValue(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(mii miiVar) {
        String.format("Starting service for user: %s and account: %s", miiVar.m39171u().getId(), miiVar.m39156f().getId());
        final l1 l1VarUB = l1.uB(miiVar.m39156f().getId(), miiVar.m39171u().getId());
        l1VarUB.wC(getBaseContext());
        j0f.m33008i(new Runnable() { // from class: o.c12
            @Override // java.lang.Runnable
            public final void run() {
                this.f17089a.a0(l1VarUB);
            }
        });
    }

    public static /* synthetic */ void c0(Throwable th) {
    }

    public static /* synthetic */ void d0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0() {
        this.f3578e.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(n9c n9cVar, mbj mbjVar) {
        this.f3581h.getWorkInfosForUniqueWorkLiveData(mbjVar.name()).observeForever(n9cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(final n9c n9cVar) {
        t3c.m49220a(new Object[]{mbj.RECONCILIATION, mbj.LOCATION_RECONCILIATION, mbj.APP_VERSION_UPDATE}).forEach(new Consumer() { // from class: o.b12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f15436a.f0(n9cVar, (mbj) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        final n9c n9cVar = new n9c() { // from class: o.z02
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f56350a.o0((List) obj);
            }
        };
        this.f3583s.set(n9cVar);
        j0f.m33008i(new Runnable() { // from class: o.a12
            @Override // java.lang.Runnable
            public final void run() {
                this.f14020a.g0(n9cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(n9c n9cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Watcher already registered for name: ");
        sb.append(this.f3582q);
    }

    public static /* synthetic */ boolean j0(WorkInfo workInfo) {
        return workInfo.getState() == WorkInfo.State.CANCELLED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(AccountMembership accountMembership) {
        wee.f51856a.m54267a().m54266f(getApplicationContext(), accountMembership.getAccount().getId(), accountMembership.getUserId(), SuperfoneApplication.f225c.m127c(), ExistingPeriodicWorkPolicy.UPDATE);
        StringBuilder sb = new StringBuilder();
        sb.append("Work re-queued with name: ");
        sb.append(this.f3582q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(uni uniVar) {
        Optional.ofNullable(uniVar).map(new Function() { // from class: o.l12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((uni) obj).SB();
            }
        }).flatMap(new Function() { // from class: o.m12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((mii) obj).m39158h();
            }
        }).ifPresent(new Consumer() { // from class: o.n12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f36210a.k0((AccountMembership) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(WorkInfo workInfo, mbj mbjVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("resubmitting jobs for which were cancelled for: ");
        sb.append(mbjVar);
        sb.append(" and work info: ");
        sb.append(workInfo);
        switch (C1215b.f3588a[mbjVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                uni.LB().y0(i5f.m31599c()).h0(of0.m42164c()).u0(new gu3() { // from class: o.h12
                    @Override // p001o.gu3
                    public final void accept(Object obj) {
                        this.f26075a.l0((uni) obj);
                    }
                });
                break;
            case 5:
                e60.f21028a.m24371a().m24370c(getApplicationContext());
                break;
            case 6:
                e60.f21028a.m24371a().m24369b(getApplicationContext());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(final WorkInfo workInfo) {
        m2637I(workInfo).ifPresent(new Consumer() { // from class: o.f12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f22518a.m0(workInfo, (mbj) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(List list) {
        if (list != null) {
            x6c.m55699W(list).m55714J(new ggd() { // from class: o.d12
                @Override // p001o.ggd
                public final boolean test(Object obj) {
                    return CallStateManagerService.j0((WorkInfo) obj);
                }
            }).y0(i5f.m31599c()).h0(of0.m42164c()).u0(new gu3() { // from class: o.e12
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    this.f20724a.n0((WorkInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        this.f3579f.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(n9c n9cVar) {
        this.f3581h.getWorkInfosForUniqueWorkLiveData(this.f3582q).removeObserver(n9cVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Worker monitoring cancelled wor name: ");
        sb.append(this.f3582q);
        this.f3583s.set(null);
    }

    public void A0(mii miiVar) {
        this.f3580g.m28253y(false, this.f3579f);
        j0f.m33008i(new Runnable() { // from class: o.p12
            @Override // java.lang.Runnable
            public final void run() {
                this.f39170a.p0();
            }
        });
        this.f3578e.set(false);
    }

    public final void B0() {
        ife ifeVar = this.f3584x;
        if (ifeVar != null) {
            ifeVar.m32073m(getApplicationContext());
        }
    }

    public final void C0() {
        Optional.ofNullable((n9c) this.f3583s.get()).ifPresent(new Consumer() { // from class: o.r12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f42678a.q0((n9c) obj);
            }
        });
    }

    /* renamed from: F */
    public final void m2634F() {
        Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.t02
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CallStateManagerService.m2595N((Prefs) obj);
            }
        });
    }

    /* renamed from: G */
    public final void m2635G() {
        BroadcastReceiver broadcastReceiver = f3573L;
        if (broadcastReceiver == null) {
            return;
        }
        try {
            unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        f3573L.clearAbortBroadcast();
        f3573L = null;
    }

    /* renamed from: H */
    public final void m2636H() {
        Boolean boolHealthStatus = this.f3575b.healthStatus();
        if (f3573L == null || !boolHealthStatus.booleanValue()) {
            if (!boolHealthStatus.booleanValue() && f3573L != null) {
                ayh.Z2(new o83() { // from class: o.s12
                    @Override // p001o.o83
                    public final void run() {
                        this.f44427a.m2596O();
                    }
                }).q1(new Consumer() { // from class: o.t12
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        CallStateManagerService.m2597P((Throwable) obj);
                    }
                }).J1(new Consumer() { // from class: o.u12
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        CallStateManagerService.m2598Q((Void) obj);
                    }
                }).h3(new Runnable() { // from class: o.m02
                    @Override // java.lang.Runnable
                    public final void run() {
                        CallStateManagerService.m2599R();
                    }
                });
            }
            ayh.Z2(new o83() { // from class: o.n02
                @Override // p001o.o83
                public final void run() {
                    this.f36148a.m2600S();
                }
            }).q1(new Consumer() { // from class: o.o02
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    CallStateManagerService.m2601T((Throwable) obj);
                }
            }).J1(new Consumer() { // from class: o.p02
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    CallStateManagerService.m2602U((Void) obj);
                }
            });
        }
    }

    /* renamed from: I */
    public final Optional m2637I(final WorkInfo workInfo) {
        return mbj.getEntries().stream().filter(new Predicate() { // from class: o.i12
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f27889a.m2604W(workInfo, (mbj) obj);
            }
        }).findFirst();
    }

    /* renamed from: K */
    public final void m2638K() {
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        if (prefsM127c != null && prefsM127c.m3251m()) {
            this.f3584x.m32068g(getApplicationContext(), prefsM127c);
        }
    }

    /* renamed from: M */
    public final boolean m2639M(Context context) {
        try {
            for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).getActiveNotifications()) {
                if (statusBarNotification.getId() == 1337) {
                    return true;
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error checking notification: ");
            sb.append(e.getMessage());
        }
        return false;
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            v0();
        }
        ke1.f32003i.m35526b(getApplicationContext());
        this.f3584x = ife.f28606f.m32075a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ai.salesmax.RESTART_CALL_STATE_MANAGER_SERVICE");
        intentFilter.addAction("ai.salesmax.PERMISSION_GRANTED");
        if (i >= 33) {
            registerReceiver(this.f3585y, intentFilter, 4);
        } else {
            registerReceiver(this.f3585y, intentFilter);
        }
        fia.f23398f.m26768a().m26761k(getApplicationContext(), SuperfoneApplication.f225c.m127c());
        this.f3575b = new HealthCheckHandler(this);
        f3572H = this;
        s0();
        this.f3581h = WorkManager.getInstance(this);
        y0();
        i5f.m31597a().mo20302c(new Runnable() { // from class: o.q12
            @Override // java.lang.Runnable
            public final void run() {
                this.f41084a.z0();
            }
        });
        m2634F();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3585y);
        m2635G();
        u0();
        Intent intent = new Intent("ai.salesmax.callstatemanager.restarter");
        intent.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent);
        t0();
        A0(null);
        B0();
        C0();
        fia.f23398f.m26768a().m26766p(getApplicationContext());
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        InterfaceC1217d interfaceC1217d = this.f3577d;
        if (interfaceC1217d != null) {
            interfaceC1217d.mo2647b();
        }
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i) {
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
        InterfaceC1217d interfaceC1217d = this.f3577d;
        if (interfaceC1217d != null) {
            interfaceC1217d.mo2646a();
        }
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || stringArrayList.isEmpty()) {
            return;
        }
        String str = stringArrayList.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("Recognized text: ");
        sb.append(str);
        InterfaceC1217d interfaceC1217d = this.f3577d;
        if (interfaceC1217d != null) {
            interfaceC1217d.mo2648c(str);
        }
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float f) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (Build.VERSION.SDK_INT < 26 || Objects.equals(action, "ai.salesmax.callstatemanager.NOTIFICATION_DISMISSED") || !m2639M(this)) {
            v0();
        }
        super.onStartCommand(intent, i, i2);
        this.f3574a = 0;
        uni.LB().y0(i5f.m31599c()).h0(of0.m42164c()).u0(new gu3() { // from class: o.o12
            @Override // p001o.gu3
            public final void accept(Object obj) {
                CallStateManagerService.m2605X((uni) obj);
            }
        });
        if (intent == null) {
            v0();
        }
        m2636H();
        m2638K();
        if (this.f3576c != null) {
            return 1;
        }
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getApplicationContext());
        this.f3576c = speechRecognizerCreateSpeechRecognizer;
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this);
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Intent intent2 = new Intent("ai.salesmax.callstatemanager.restarter");
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
    }

    public void r0() {
        if (c64.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0 || this.f3576c == null) {
            return;
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", "en-US");
        this.f3576c.startListening(intent);
    }

    public final void s0() {
    }

    public final void t0() {
        SpeechRecognizer speechRecognizer = this.f3576c;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            this.f3576c = null;
        }
    }

    public final void u0() {
        Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.g12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CallStateManagerService.m2606Y((Prefs) obj);
            }
        });
    }

    public void v0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            v1c v1cVar = new v1c();
            String str = (String) ayh.H1(new w02(this)).m51980C("Salesmax");
            String str2 = String.format("%s Service", str);
            String str3 = String.format("%s service is running", str);
            int i = (!j4d.m33203J(getApplicationContext()) || Build.VERSION.SDK_INT < 29) ? 1073741824 : 1073741832;
            if (Build.VERSION.SDK_INT >= 29) {
                egf.m24975a(this, 1337, v1cVar.m52230a(this, str2, str3, w7e.icon_transparent), i);
            } else {
                startForeground(1337, v1cVar.m52230a(this, str2, str3, w7e.icon_transparent));
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder();
            sb.append("restartForeground successful, took ");
            sb.append(jCurrentTimeMillis2);
            sb.append(" ms");
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error in notification ");
            sb2.append(e.getMessage());
        }
    }

    public void w0(InterfaceC1217d interfaceC1217d) {
        this.f3577d = interfaceC1217d;
    }

    public void x0(final mii miiVar) {
        if (miiVar.m39171u() == null || miiVar.m39156f() == null) {
            return;
        }
        ayh.Z2(new o83() { // from class: o.x02
            @Override // p001o.o83
            public final void run() {
                this.f53003a.b0(miiVar);
            }
        }).q1(new Consumer() { // from class: o.y02
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CallStateManagerService.c0((Throwable) obj);
            }
        });
    }

    public final void y0() {
        StringBuilder sb = new StringBuilder();
        sb.append("starting startEntityWatcher for background with registered: ");
        sb.append(this.f3578e.get());
        if (this.f3578e.get()) {
            return;
        }
        this.f3580g.m28249s(AccountMemberActivity.class, new pe());
        this.f3580g.m28253y(true, this.f3579f);
        uni.LB().y0(i5f.m31599c()).d0(new gd()).h0(i5f.m31599c()).w0(new gu3() { // from class: o.q02
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f41028a.x0((mii) obj);
            }
        }, new gu3() { // from class: o.r02
            @Override // p001o.gu3
            public final void accept(Object obj) {
                CallStateManagerService.d0((Throwable) obj);
            }
        }, new jm() { // from class: o.s02
            @Override // p001o.jm
            public final void run() {
                this.f44356a.e0();
            }
        });
    }

    public final void z0() {
        yt1.m58188a(Optional.ofNullable((n9c) this.f3583s.get()), new Consumer() { // from class: o.u02
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f48135a.i0((n9c) obj);
            }
        }, new Runnable() { // from class: o.v02
            @Override // java.lang.Runnable
            public final void run() {
                this.f49716a.h0();
            }
        });
    }
}
