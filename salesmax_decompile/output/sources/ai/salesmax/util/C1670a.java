package ai.salesmax.util;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.MainActivity;
import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.MissedOpportunitiesSummary;
import ai.salesmax.model.OpenTaskDetail;
import ai.salesmax.model.Tasks;
import ai.salesmax.ui.service.CallStateManagerService;
import ai.salesmax.util.C1670a;
import android.app.ActivityManager;
import android.app.DatePickerDialog;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.app.TimePickerDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.material.chip.Chip;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import p001o.a81;
import p001o.bgb;
import p001o.c64;
import p001o.ch3;
import p001o.ck6;
import p001o.ct1;
import p001o.f9g;
import p001o.gge;
import p001o.gi6;
import p001o.gu3;
import p001o.hae;
import p001o.hi6;
import p001o.j0f;
import p001o.j4d;
import p001o.jgg;
import p001o.jm;
import p001o.jyg;
import p001o.k8j;
import p001o.lw9;
import p001o.n64;
import p001o.nd;
import p001o.p74;
import p001o.rl7;
import p001o.sq8;
import p001o.th1;
import p001o.uq8;
import p001o.vf6;
import p001o.w7e;
import p001o.wi0;
import p001o.wre;
import p001o.x6c;
import p001o.xk7;
import p001o.y1c;
import p001o.y3i;
import p001o.zed;
import type.LeadLifecycleStage;
import type.MissedOpportunityType;

/* renamed from: ai.salesmax.util.a */
/* loaded from: classes2.dex */
public final class C1670a {

    /* renamed from: a */
    public ct1 f4947a;

    /* renamed from: b */
    public zed f4948b;

    /* renamed from: c */
    public WindowManager f4949c;

    /* renamed from: d */
    public WindowManager f4950d;

    /* renamed from: e */
    public int f4951e;

    /* renamed from: f */
    public int f4952f;

    /* renamed from: g */
    public int f4953g;

    /* renamed from: h */
    public int f4954h;

    /* renamed from: i */
    public final int f4955i = 1487;

    /* renamed from: j */
    public Service f4956j;

    /* renamed from: k */
    public boolean f4957k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ai.salesmax.util.a$b */
    public static final class b {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b SHOW = new b("SHOW", 0);
        public static final b HIDE = new b("HIDE", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{SHOW, HIDE};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = hi6.m30609a(bVarArr$values);
        }

        private b(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: ai.salesmax.util.a$c */
    public static final class c implements gu3 {
        public c() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(EngagementUpdateSummary engagementUpdateSummary) {
            sq8.m48649h(engagementUpdateSummary, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$d */
    public static final class d implements gu3 {
        public d() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$e */
    public static final class e implements gu3 {
        public e() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$f */
    public static final class f implements gu3 {
        public f() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$g */
    public static final class g extends jgg implements xk7 {

        /* renamed from: a */
        public int f4966a;

        /* renamed from: b */
        public final /* synthetic */ a f4967b;

        /* renamed from: c */
        public final /* synthetic */ C1670a f4968c;

        /* renamed from: ai.salesmax.util.a$g$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4969a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.SHOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.HIDE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4969a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar, C1670a c1670a, n64 n64Var) {
            super(1, n64Var);
            this.f4967b = aVar;
            this.f4968c = c1670a;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new g(this.f4967b, this.f4968c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f4966a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            int i = a.f4969a[this.f4967b.m3320c().ordinal()];
            if (i == 1) {
                this.f4968c.m3312M(this.f4967b.m3318a(), this.f4967b.m3319b(), this.f4967b.m3321d());
            } else if (i == 2) {
                this.f4968c.i0(this.f4967b.m3318a());
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((g) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.util.a$h */
    public static final class h implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ Handler f4970a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f4971b;

        /* renamed from: c */
        public final /* synthetic */ C1670a f4972c;

        /* renamed from: d */
        public final /* synthetic */ Context f4973d;

        /* renamed from: e */
        public final /* synthetic */ Tasks f4974e;

        /* renamed from: f */
        public final /* synthetic */ Leads f4975f;

        public h(Handler handler, Runnable runnable, C1670a c1670a, Context context, Tasks tasks, Leads leads) {
            this.f4970a = handler;
            this.f4971b = runnable;
            this.f4972c = c1670a;
            this.f4973d = context;
            this.f4974e = tasks;
            this.f4975f = leads;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            this.f4970a.removeCallbacks(this.f4971b);
            int id = view.getId();
            ct1 ct1Var = this.f4972c.f4947a;
            ct1 ct1Var2 = null;
            if (ct1Var == null) {
                sq8.m48667z("binding");
                ct1Var = null;
            }
            if (id == ct1Var.o0.getId()) {
                ct1 ct1Var3 = this.f4972c.f4947a;
                if (ct1Var3 == null) {
                    sq8.m48667z("binding");
                } else {
                    ct1Var2 = ct1Var3;
                }
                ct1Var2.o0.performHapticFeedback(1);
                this.f4972c.i0(this.f4973d);
                Tasks tasks = this.f4974e;
                if (tasks != null) {
                    this.f4972c.m3315V(tasks, this.f4975f, "positive", this.f4973d);
                    return;
                }
                return;
            }
            int id2 = view.getId();
            ct1 ct1Var4 = this.f4972c.f4947a;
            if (ct1Var4 == null) {
                sq8.m48667z("binding");
            } else {
                ct1Var2 = ct1Var4;
            }
            if (id2 == ct1Var2.n0.getId()) {
                this.f4972c.i0(this.f4973d);
                return;
            }
            view.performHapticFeedback(1);
            this.f4972c.i0(this.f4973d);
            Intent intent = new Intent(this.f4973d, (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(this.f4973d.getString(hae.argumentLeads), this.f4975f);
            intent.putExtra(this.f4973d.getString(hae.argumentLeadsOpenCallDetails), false);
            intent.putExtra(this.f4973d.getString(hae.argumentLeadsIsInCall), false);
            this.f4973d.startActivity(intent);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.util.a$i */
    public static final class i implements View.OnTouchListener {

        /* renamed from: a */
        public boolean f4976a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f4977b;

        /* renamed from: c */
        public int f4978c;

        /* renamed from: d */
        public int f4979d;

        /* renamed from: e */
        public float f4980e;

        /* renamed from: f */
        public float f4981f;

        /* renamed from: g */
        public final /* synthetic */ C1670a f4982g;

        public i(gge ggeVar, C1670a c1670a) {
            this.f4982g = c1670a;
            this.f4977b = (WindowManager.LayoutParams) ggeVar.f25106a;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            sq8.m48649h(motionEvent, "event");
            StringBuilder sb = new StringBuilder();
            sb.append("on touch invoked with param: ");
            sb.append(view);
            sb.append(" and event: ");
            sb.append(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f4976a = false;
                WindowManager.LayoutParams layoutParams = this.f4977b;
                this.f4978c = layoutParams.x;
                this.f4979d = layoutParams.y;
                this.f4980e = motionEvent.getRawX();
                this.f4981f = motionEvent.getRawY();
            } else if (action == 1) {
                Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
                if (prefsM127c != null) {
                    WindowManager.LayoutParams layoutParams2 = this.f4977b;
                    prefsM127c.L0(layoutParams2.x, layoutParams2.y);
                }
            } else if (action == 2) {
                int rawX = (int) (motionEvent.getRawX() - this.f4980e);
                int rawY = (int) (motionEvent.getRawY() - this.f4981f);
                WindowManager.LayoutParams layoutParams3 = this.f4977b;
                layoutParams3.x = this.f4978c + rawX;
                layoutParams3.y = this.f4979d + rawY;
                if (Math.abs(rawX) > 10 || Math.abs(rawY) > 10) {
                    this.f4976a = true;
                    WindowManager windowManager = this.f4982g.f4949c;
                    if (windowManager != null) {
                        ct1 ct1Var = this.f4982g.f4947a;
                        if (ct1Var == null) {
                            sq8.m48667z("binding");
                            ct1Var = null;
                        }
                        windowManager.updateViewLayout(ct1Var.m25689B(), this.f4977b);
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ai.salesmax.util.a$j */
    public static final class j implements CallStateManagerService.InterfaceC1217d {

        /* renamed from: b */
        public final /* synthetic */ Handler f4984b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f4985c;

        public j(Handler handler, Runnable runnable) {
            this.f4984b = handler;
            this.f4985c = runnable;
        }

        @Override // ai.salesmax.ui.service.CallStateManagerService.InterfaceC1217d
        /* renamed from: a */
        public void mo2646a() {
            this.f4984b.removeCallbacks(this.f4985c);
            zed zedVar = C1670a.this.f4948b;
            if (zedVar == null) {
                sq8.m48667z("postCallbinding");
                zedVar = null;
            }
            zedVar.J0.setEndIconDrawable(w7e.ic_speak_now);
        }

        @Override // ai.salesmax.ui.service.CallStateManagerService.InterfaceC1217d
        /* renamed from: b */
        public void mo2647b() {
            zed zedVar = C1670a.this.f4948b;
            if (zedVar == null) {
                sq8.m48667z("postCallbinding");
                zedVar = null;
            }
            zedVar.J0.setEndIconDrawable(w7e.ic_microphone);
        }

        @Override // ai.salesmax.ui.service.CallStateManagerService.InterfaceC1217d
        /* renamed from: c */
        public void mo2648c(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            zed zedVar = C1670a.this.f4948b;
            zed zedVar2 = null;
            if (zedVar == null) {
                sq8.m48667z("postCallbinding");
                zedVar = null;
            }
            String string = f9g.Z0(String.valueOf(zedVar.I0.getText())).toString();
            if (!(true ^ f9g.d0(string))) {
                String str2 = str + " ";
                zed zedVar3 = C1670a.this.f4948b;
                if (zedVar3 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar3 = null;
                }
                zedVar3.I0.setText(str2);
                zed zedVar4 = C1670a.this.f4948b;
                if (zedVar4 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar2 = zedVar4;
                }
                zedVar2.I0.setSelection(str2.length());
                return;
            }
            String str3 = string + " " + str + " ";
            zed zedVar5 = C1670a.this.f4948b;
            if (zedVar5 == null) {
                sq8.m48667z("postCallbinding");
                zedVar5 = null;
            }
            zedVar5.I0.setText(str3);
            zed zedVar6 = C1670a.this.f4948b;
            if (zedVar6 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar2 = zedVar6;
            }
            zedVar2.I0.setSelection(str3.length());
        }
    }

    /* renamed from: ai.salesmax.util.a$k */
    public static final class k implements ck6 {

        /* renamed from: b */
        public final /* synthetic */ Handler f4987b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f4988c;

        /* renamed from: d */
        public final /* synthetic */ Tasks f4989d;

        /* renamed from: e */
        public final /* synthetic */ gge f4990e;

        /* renamed from: f */
        public final /* synthetic */ Context f4991f;

        /* renamed from: g */
        public final /* synthetic */ WindowManager.LayoutParams f4992g;

        /* renamed from: h */
        public final /* synthetic */ Leads f4993h;

        /* renamed from: ai.salesmax.util.a$k$a */
        public static final class a implements TextWatcher {

            /* renamed from: a */
            public final /* synthetic */ C1670a f4994a;

            /* renamed from: b */
            public final /* synthetic */ gge f4995b;

            /* renamed from: c */
            public final /* synthetic */ Tasks f4996c;

            /* renamed from: d */
            public final /* synthetic */ String f4997d;

            /* renamed from: e */
            public final /* synthetic */ Context f4998e;

            public a(C1670a c1670a, gge ggeVar, Tasks tasks, String str, Context context) {
                this.f4994a = c1670a;
                this.f4995b = ggeVar;
                this.f4996c = tasks;
                this.f4997d = str;
                this.f4998e = context;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Long lM16645F = a81.m16645F(new Temporal.DateTime(String.valueOf(editable)));
                C1670a c1670a = this.f4994a;
                Leads leads = (Leads) this.f4995b.f25106a;
                String strName = MissedOpportunityType.CALL_LATER.name();
                sq8.m48646e(lM16645F);
                c1670a.k0(leads, strName, lM16645F.longValue(), this.f4996c, this.f4997d);
                this.f4994a.j0(this.f4998e);
                this.f4994a.v0(this.f4998e, this.f4996c);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* renamed from: ai.salesmax.util.a$k$b */
        public static final class b implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ Leads f4999a;

            public b(Leads leads) {
                this.f4999a = leads;
            }

            /* renamed from: a */
            public final void m3328a(boolean z) {
                String contactID = this.f4999a.getContactID();
                StringBuilder sb = new StringBuilder();
                sb.append("The lead ");
                sb.append(contactID);
                sb.append(" successfully deleted and marked for track never");
            }

            @Override // p001o.gu3
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                m3328a(((Boolean) obj).booleanValue());
            }
        }

        /* renamed from: ai.salesmax.util.a$k$c */
        public static final class c implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ Leads f5000a;

            public c(Leads leads) {
                this.f5000a = leads;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "it");
                String contactID = this.f5000a.getContactID();
                StringBuilder sb = new StringBuilder();
                sb.append("couldn't delete lead ");
                sb.append(contactID);
            }
        }

        /* renamed from: ai.salesmax.util.a$k$d */
        public static final class d implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ gge f5001a;

            /* renamed from: b */
            public final /* synthetic */ C1670a f5002b;

            /* renamed from: c */
            public final /* synthetic */ Tasks f5003c;

            /* renamed from: d */
            public final /* synthetic */ Context f5004d;

            public d(gge ggeVar, C1670a c1670a, Tasks tasks, Context context) {
                this.f5001a = ggeVar;
                this.f5002b = c1670a;
                this.f5003c = tasks;
                this.f5004d = context;
            }

            /* renamed from: c */
            public static final void m3331c(C1670a c1670a, Leads leads, Tasks tasks, gge ggeVar, Context context) {
                sq8.m48649h(c1670a, "this$0");
                sq8.m48649h(leads, "$it");
                sq8.m48649h(tasks, "$newCall");
                sq8.m48649h(ggeVar, "$inputLeads");
                sq8.m48649h(context, "$context");
                zed zedVar = c1670a.f4948b;
                zed zedVar2 = null;
                if (zedVar == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar = null;
                }
                zedVar.e1.setVisibility(8);
                zed zedVar3 = c1670a.f4948b;
                if (zedVar3 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar2 = zedVar3;
                }
                zedVar2.l0(leads);
                c1670a.m3315V(tasks, (Leads) ggeVar.f25106a, "positive", context);
                c1670a.j0(context);
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(final Leads leads) {
                sq8.m48649h(leads, "it");
                final gge ggeVar = this.f5001a;
                ggeVar.f25106a = leads;
                final C1670a c1670a = this.f5002b;
                final Tasks tasks = this.f5003c;
                final Context context = this.f5004d;
                j0f.m33008i(new Runnable() { // from class: o.v22
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1670a.k.d.m3331c(c1670a, leads, tasks, ggeVar, context);
                    }
                });
            }
        }

        /* renamed from: ai.salesmax.util.a$k$e */
        public static final class e implements gu3 {

            /* renamed from: b */
            public final /* synthetic */ C1670a f5006b;

            /* renamed from: c */
            public final /* synthetic */ Context f5007c;

            public e(C1670a c1670a, Context context) {
                this.f5006b = c1670a;
                this.f5007c = context;
            }

            /* renamed from: c */
            public static final void m3334c(C1670a c1670a) {
                sq8.m48649h(c1670a, "this$0");
                zed zedVar = c1670a.f4948b;
                if (zedVar == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar = null;
                }
                zedVar.e1.setVisibility(8);
            }

            @Override // p001o.gu3
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "it");
                k.this.getClass();
                final C1670a c1670a = this.f5006b;
                j0f.m33008i(new Runnable() { // from class: o.w22
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1670a.k.e.m3334c(c1670a);
                    }
                });
                this.f5006b.j0(this.f5007c);
            }
        }

        public k(Handler handler, Runnable runnable, Tasks tasks, gge ggeVar, Context context, WindowManager.LayoutParams layoutParams, Leads leads) {
            this.f4987b = handler;
            this.f4988c = runnable;
            this.f4989d = tasks;
            this.f4990e = ggeVar;
            this.f4991f = context;
            this.f4992g = layoutParams;
            this.f4993h = leads;
        }

        /* renamed from: e */
        public static final void m3327e() {
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            zed zedVar;
            zed zedVar2;
            zed zedVar3;
            zed zedVar4;
            zed zedVar5;
            zed zedVar6;
            sq8.m48649h(view, "view");
            zed zedVar7 = C1670a.this.f4948b;
            zed zedVar8 = null;
            if (zedVar7 == null) {
                sq8.m48667z("postCallbinding");
                zedVar7 = null;
            }
            String strValueOf = String.valueOf(zedVar7.I0.getText());
            this.f4987b.removeCallbacks(this.f4988c);
            int id = view.getId();
            zed zedVar9 = C1670a.this.f4948b;
            if (zedVar9 == null) {
                sq8.m48667z("postCallbinding");
                zedVar9 = null;
            }
            if (id == zedVar9.K0.getId()) {
                zed zedVar10 = C1670a.this.f4948b;
                if (zedVar10 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar10;
                }
                zedVar8.K0.performHapticFeedback(1);
                C1670a.this.m3315V(this.f4989d, (Leads) this.f4990e.f25106a, "positive", this.f4991f);
                C1670a.this.j0(this.f4991f);
                return;
            }
            int id2 = view.getId();
            zed zedVar11 = C1670a.this.f4948b;
            if (zedVar11 == null) {
                sq8.m48667z("postCallbinding");
                zedVar11 = null;
            }
            if (id2 == zedVar11.f1.getId()) {
                zed zedVar12 = C1670a.this.f4948b;
                if (zedVar12 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar12;
                }
                zedVar8.f1.performHapticFeedback(1);
                C1670a.this.m3316W(this.f4989d, (Leads) this.f4990e.f25106a, this.f4991f);
                C1670a.this.j0(this.f4991f);
                return;
            }
            int id3 = view.getId();
            zed zedVar13 = C1670a.this.f4948b;
            if (zedVar13 == null) {
                sq8.m48667z("postCallbinding");
                zedVar13 = null;
            }
            if (id3 == zedVar13.H0.getId()) {
                zed zedVar14 = C1670a.this.f4948b;
                if (zedVar14 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar14 = null;
                }
                zedVar14.H0.performHapticFeedback(1);
                zed zedVar15 = C1670a.this.f4948b;
                if (zedVar15 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar15 = null;
                }
                zedVar15.p0.setVisibility(8);
                zed zedVar16 = C1670a.this.f4948b;
                if (zedVar16 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar16 = null;
                }
                zedVar16.q0.setVisibility(8);
                zed zedVar17 = C1670a.this.f4948b;
                if (zedVar17 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar17 = null;
                }
                zedVar17.b1.setText("Do not wish to track this number?");
                zed zedVar18 = C1670a.this.f4948b;
                if (zedVar18 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar18 = null;
                }
                zedVar18.x0.setVisibility(8);
                zed zedVar19 = C1670a.this.f4948b;
                if (zedVar19 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar19 = null;
                }
                zedVar19.B0.setVisibility(8);
                zed zedVar20 = C1670a.this.f4948b;
                if (zedVar20 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar20 = null;
                }
                zedVar20.t0.setVisibility(8);
                zed zedVar21 = C1670a.this.f4948b;
                if (zedVar21 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar21;
                }
                zedVar8.G0.setVisibility(0);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id4 = view.getId();
            zed zedVar22 = C1670a.this.f4948b;
            if (zedVar22 == null) {
                sq8.m48667z("postCallbinding");
                zedVar22 = null;
            }
            if (id4 == zedVar22.Q0.getId()) {
                zed zedVar23 = C1670a.this.f4948b;
                if (zedVar23 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar23 = null;
                }
                zedVar23.Q0.performHapticFeedback(1);
                zed zedVar24 = C1670a.this.f4948b;
                if (zedVar24 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar24 = null;
                }
                zedVar24.b1.setText("Schedule follow-up for " + this.f4993h.getName());
                zed zedVar25 = C1670a.this.f4948b;
                if (zedVar25 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar25 = null;
                }
                zedVar25.q0.setVisibility(0);
                zed zedVar26 = C1670a.this.f4948b;
                if (zedVar26 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar26 = null;
                }
                zedVar26.x0.setVisibility(8);
                zed zedVar27 = C1670a.this.f4948b;
                if (zedVar27 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar27 = null;
                }
                zedVar27.B0.setVisibility(8);
                zed zedVar28 = C1670a.this.f4948b;
                if (zedVar28 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar28 = null;
                }
                zedVar28.t0.setVisibility(8);
                zed zedVar29 = C1670a.this.f4948b;
                if (zedVar29 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar29;
                }
                zedVar8.G0.setVisibility(8);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id5 = view.getId();
            zed zedVar30 = C1670a.this.f4948b;
            if (zedVar30 == null) {
                sq8.m48667z("postCallbinding");
                zedVar30 = null;
            }
            if (id5 == zedVar30.X0.getId()) {
                zed zedVar31 = C1670a.this.f4948b;
                if (zedVar31 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar31 = null;
                }
                zedVar31.X0.performHapticFeedback(1);
                if (C1670a.this.m3313T()) {
                    zed zedVar32 = C1670a.this.f4948b;
                    if (zedVar32 == null) {
                        sq8.m48667z("postCallbinding");
                        zedVar32 = null;
                    }
                    zedVar32.b1.setText("Schedule follow-up on open deal for " + this.f4993h.getName());
                } else {
                    zed zedVar33 = C1670a.this.f4948b;
                    if (zedVar33 == null) {
                        sq8.m48667z("postCallbinding");
                        zedVar33 = null;
                    }
                    zedVar33.b1.setText("Schedule follow-up on open task for " + this.f4993h.getName());
                }
                zed zedVar34 = C1670a.this.f4948b;
                if (zedVar34 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar34 = null;
                }
                zedVar34.q0.setVisibility(0);
                zed zedVar35 = C1670a.this.f4948b;
                if (zedVar35 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar35 = null;
                }
                zedVar35.z0.setVisibility(8);
                zed zedVar36 = C1670a.this.f4948b;
                if (zedVar36 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar36 = null;
                }
                zedVar36.B0.setVisibility(8);
                zed zedVar37 = C1670a.this.f4948b;
                if (zedVar37 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar37;
                }
                zedVar8.t0.setVisibility(8);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id6 = view.getId();
            zed zedVar38 = C1670a.this.f4948b;
            if (zedVar38 == null) {
                sq8.m48667z("postCallbinding");
                zedVar38 = null;
            }
            if (id6 == zedVar38.h1.getId()) {
                zed zedVar39 = C1670a.this.f4948b;
                if (zedVar39 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar39;
                }
                zedVar8.h1.performHapticFeedback(1);
                C1670a.this.m3307F(this.f4989d);
                C1670a.this.j0(this.f4991f);
                return;
            }
            int id7 = view.getId();
            zed zedVar40 = C1670a.this.f4948b;
            if (zedVar40 == null) {
                sq8.m48667z("postCallbinding");
                zedVar40 = null;
            }
            if (id7 == zedVar40.i1.getId()) {
                zed zedVar41 = C1670a.this.f4948b;
                if (zedVar41 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar41;
                }
                zedVar8.i1.performHapticFeedback(1);
                lw9.q1(wi0.m54458X(), ch3.m21242g(((Leads) this.f4990e.f25106a).getContactID()), true).v0(new b(this.f4993h), new c(this.f4993h));
                C1670a.this.j0(this.f4991f);
                return;
            }
            int id8 = view.getId();
            zed zedVar42 = C1670a.this.f4948b;
            if (zedVar42 == null) {
                sq8.m48667z("postCallbinding");
                zedVar42 = null;
            }
            if (id8 == zedVar42.U0.getId()) {
                C1670a.s0(C1670a.this, (Leads) this.f4990e.f25106a, null, 2, null);
                zed zedVar43 = C1670a.this.f4948b;
                if (zedVar43 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar43 = null;
                }
                zedVar43.p0.setVisibility(0);
                zed zedVar44 = C1670a.this.f4948b;
                if (zedVar44 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar44 = null;
                }
                zedVar44.q0.setVisibility(0);
                zed zedVar45 = C1670a.this.f4948b;
                if (zedVar45 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar45 = null;
                }
                zedVar45.x0.setVisibility(0);
                zed zedVar46 = C1670a.this.f4948b;
                if (zedVar46 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar46 = null;
                }
                zedVar46.B0.setVisibility(0);
                zed zedVar47 = C1670a.this.f4948b;
                if (zedVar47 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar47 = null;
                }
                zedVar47.t0.setVisibility(0);
                zed zedVar48 = C1670a.this.f4948b;
                if (zedVar48 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar48;
                }
                zedVar8.G0.setVisibility(8);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id9 = view.getId();
            zed zedVar49 = C1670a.this.f4948b;
            if (zedVar49 == null) {
                sq8.m48667z("postCallbinding");
                zedVar49 = null;
            }
            if (id9 == zedVar49.T0.getId()) {
                C1670a.s0(C1670a.this, (Leads) this.f4990e.f25106a, null, 2, null);
                zed zedVar50 = C1670a.this.f4948b;
                if (zedVar50 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar50 = null;
                }
                zedVar50.p0.setVisibility(0);
                zed zedVar51 = C1670a.this.f4948b;
                if (zedVar51 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar51 = null;
                }
                zedVar51.q0.setVisibility(0);
                zed zedVar52 = C1670a.this.f4948b;
                if (zedVar52 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar52 = null;
                }
                zedVar52.x0.setVisibility(0);
                zed zedVar53 = C1670a.this.f4948b;
                if (zedVar53 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar53 = null;
                }
                zedVar53.B0.setVisibility(0);
                zed zedVar54 = C1670a.this.f4948b;
                if (zedVar54 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar54 = null;
                }
                zedVar54.t0.setVisibility(0);
                zed zedVar55 = C1670a.this.f4948b;
                if (zedVar55 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar55 = null;
                }
                zedVar55.G0.setVisibility(8);
                zed zedVar56 = C1670a.this.f4948b;
                if (zedVar56 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar56;
                }
                zedVar8.F0.setVisibility(8);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id10 = view.getId();
            zed zedVar57 = C1670a.this.f4948b;
            if (zedVar57 == null) {
                sq8.m48667z("postCallbinding");
                zedVar57 = null;
            }
            if (id10 == zedVar57.u0.getId()) {
                C1670a.s0(C1670a.this, (Leads) this.f4990e.f25106a, null, 2, null);
                zed zedVar58 = C1670a.this.f4948b;
                if (zedVar58 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar58 = null;
                }
                zedVar58.q0.setVisibility(8);
                if (this.f4993h.getLeadLifecycleStage() == null || !sq8.m48644c(this.f4993h.getLeadLifecycleStage(), "OPPORTUNITY")) {
                    zed zedVar59 = C1670a.this.f4948b;
                    if (zedVar59 == null) {
                        sq8.m48667z("postCallbinding");
                        zedVar59 = null;
                    }
                    zedVar59.x0.setVisibility(0);
                } else {
                    zed zedVar60 = C1670a.this.f4948b;
                    if (zedVar60 == null) {
                        sq8.m48667z("postCallbinding");
                        zedVar60 = null;
                    }
                    zedVar60.z0.setVisibility(0);
                }
                zed zedVar61 = C1670a.this.f4948b;
                if (zedVar61 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar61 = null;
                }
                zedVar61.B0.setVisibility(0);
                zed zedVar62 = C1670a.this.f4948b;
                if (zedVar62 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar62 = null;
                }
                zedVar62.t0.setVisibility(0);
                zed zedVar63 = C1670a.this.f4948b;
                if (zedVar63 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar63;
                }
                zedVar8.G0.setVisibility(8);
                this.f4992g.height = C1670a.this.m3310K();
                this.f4992g.width = C1670a.this.m3311L();
                return;
            }
            int id11 = view.getId();
            zed zedVar64 = C1670a.this.f4948b;
            if (zedVar64 == null) {
                sq8.m48667z("postCallbinding");
                zedVar64 = null;
            }
            if (id11 == zedVar64.w0.getId()) {
                zed zedVar65 = C1670a.this.f4948b;
                if (zedVar65 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar8 = zedVar65;
                }
                zedVar8.w0.performHapticFeedback(1);
                C1670a.this.k0((Leads) this.f4990e.f25106a, MissedOpportunityType.CALL_LATER.name(), a81.m16645F(a81.m16641B()).longValue() + 604800000, this.f4989d, strValueOf);
                C1670a.this.j0(this.f4991f);
                C1670a.this.v0(this.f4991f, this.f4989d);
                return;
            }
            int id12 = view.getId();
            zed zedVar66 = C1670a.this.f4948b;
            if (zedVar66 == null) {
                sq8.m48667z("postCallbinding");
                zedVar66 = null;
            }
            if (id12 == zedVar66.v0.getId()) {
                zed zedVar67 = C1670a.this.f4948b;
                if (zedVar67 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar67 = null;
                }
                zedVar67.v0.performHapticFeedback(1);
                Calendar calendar = Calendar.getInstance();
                sq8.m48648g(calendar, "getInstance(...)");
                calendar.add(6, 2);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Date time = calendar.getTime();
                sq8.m48648g(time, "getTime(...)");
                C1670a.this.k0((Leads) this.f4990e.f25106a, MissedOpportunityType.CALL_LATER.name(), time.getTime(), this.f4989d, strValueOf);
                C1670a.this.j0(this.f4991f);
                C1670a.this.v0(this.f4991f, this.f4989d);
                return;
            }
            int id13 = view.getId();
            zed zedVar68 = C1670a.this.f4948b;
            if (zedVar68 == null) {
                sq8.m48667z("postCallbinding");
                zedVar68 = null;
            }
            if (id13 == zedVar68.C0.getId()) {
                zed zedVar69 = C1670a.this.f4948b;
                if (zedVar69 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar69 = null;
                }
                zedVar69.C0.performHapticFeedback(1);
                Calendar calendar2 = Calendar.getInstance();
                sq8.m48648g(calendar2, "getInstance(...)");
                calendar2.add(6, 1);
                calendar2.set(11, 10);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                Date time2 = calendar2.getTime();
                sq8.m48648g(time2, "getTime(...)");
                C1670a.this.k0((Leads) this.f4990e.f25106a, MissedOpportunityType.CALL_LATER.name(), time2.getTime(), this.f4989d, strValueOf);
                C1670a.this.j0(this.f4991f);
                C1670a.this.v0(this.f4991f, this.f4989d);
                return;
            }
            int id14 = view.getId();
            zed zedVar70 = C1670a.this.f4948b;
            if (zedVar70 == null) {
                sq8.m48667z("postCallbinding");
                zedVar70 = null;
            }
            if (id14 == zedVar70.M0.getId()) {
                zed zedVar71 = C1670a.this.f4948b;
                if (zedVar71 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar6 = null;
                } else {
                    zedVar6 = zedVar71;
                }
                zedVar6.M0.performHapticFeedback(1);
                C1670a.this.k0((Leads) this.f4990e.f25106a, MissedOpportunityType.CALL_LATER.name(), System.currentTimeMillis() + 14400000, this.f4989d, strValueOf);
                C1670a.this.j0(this.f4991f);
                C1670a.this.v0(this.f4991f, this.f4989d);
                return;
            }
            int id15 = view.getId();
            zed zedVar72 = C1670a.this.f4948b;
            if (zedVar72 == null) {
                sq8.m48667z("postCallbinding");
                zedVar72 = null;
            }
            if (id15 == zedVar72.N0.getId()) {
                zed zedVar73 = C1670a.this.f4948b;
                if (zedVar73 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar5 = null;
                } else {
                    zedVar5 = zedVar73;
                }
                zedVar5.N0.performHapticFeedback(1);
                C1670a.this.k0((Leads) this.f4990e.f25106a, MissedOpportunityType.CALL_LATER.name(), System.currentTimeMillis() + GmsVersion.VERSION_PARMESAN, this.f4989d, strValueOf);
                C1670a.this.j0(this.f4991f);
                C1670a.this.v0(this.f4991f, this.f4989d);
                return;
            }
            int id16 = view.getId();
            zed zedVar74 = C1670a.this.f4948b;
            if (zedVar74 == null) {
                sq8.m48667z("postCallbinding");
                zedVar74 = null;
            }
            if (id16 == zedVar74.s0.getId()) {
                zed zedVar75 = C1670a.this.f4948b;
                if (zedVar75 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar75 = null;
                }
                zedVar75.s0.performHapticFeedback(1);
                zed zedVar76 = C1670a.this.f4948b;
                if (zedVar76 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar76 = null;
                }
                Chip chip = zedVar76.s0;
                sq8.m48648g(chip, "callCustomDate");
                chip.addTextChangedListener(new a(C1670a.this, this.f4990e, this.f4989d, strValueOf, this.f4991f));
                C1670a c1670a = C1670a.this;
                zed zedVar77 = c1670a.f4948b;
                if (zedVar77 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar4 = null;
                } else {
                    zedVar4 = zedVar77;
                }
                c1670a.m3308H(zedVar4.s0, this.f4991f);
                return;
            }
            int id17 = view.getId();
            zed zedVar78 = C1670a.this.f4948b;
            if (zedVar78 == null) {
                sq8.m48667z("postCallbinding");
                zedVar78 = null;
            }
            if (id17 == zedVar78.W0.getId()) {
                zed zedVar79 = C1670a.this.f4948b;
                if (zedVar79 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar79 = null;
                }
                zedVar79.W0.performHapticFeedback(1);
                zed zedVar80 = C1670a.this.f4948b;
                if (zedVar80 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar80 = null;
                }
                zedVar80.e1.setVisibility(0);
                zed zedVar81 = C1670a.this.f4948b;
                if (zedVar81 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar3 = null;
                } else {
                    zedVar3 = zedVar81;
                }
                zedVar3.y0.setVisibility(8);
                C1670a.this.g0((Leads) this.f4990e.f25106a).w0(new d(this.f4990e, C1670a.this, this.f4989d, this.f4991f), new e(C1670a.this, this.f4991f), new jm() { // from class: o.u22
                    @Override // p001o.jm
                    public final void run() {
                        C1670a.k.m3327e();
                    }
                });
                return;
            }
            int id18 = view.getId();
            zed zedVar82 = C1670a.this.f4948b;
            if (zedVar82 == null) {
                sq8.m48667z("postCallbinding");
                zedVar82 = null;
            }
            if (id18 == zedVar82.L0.getId()) {
                zed zedVar83 = C1670a.this.f4948b;
                if (zedVar83 == null) {
                    sq8.m48667z("postCallbinding");
                    zedVar2 = null;
                } else {
                    zedVar2 = zedVar83;
                }
                zedVar2.L0.performHapticFeedback(1);
                C1670a.this.m3315V(this.f4989d, (Leads) this.f4990e.f25106a, "positive", this.f4991f);
                C1670a.this.j0(this.f4991f);
                return;
            }
            int id19 = view.getId();
            zed zedVar84 = C1670a.this.f4948b;
            if (zedVar84 == null) {
                sq8.m48667z("postCallbinding");
                zedVar84 = null;
            }
            if (id19 == zedVar84.R0.getId()) {
                C1670a.m3278Z(C1670a.this, this.f4991f, this.f4989d, this.f4993h, null, 8, null);
                return;
            }
            int id20 = view.getId();
            zed zedVar85 = C1670a.this.f4948b;
            if (zedVar85 == null) {
                sq8.m48667z("postCallbinding");
                zedVar85 = null;
            }
            if (id20 != zedVar85.d1.getId()) {
                C1670a.this.j0(this.f4991f);
                return;
            }
            zed zedVar86 = C1670a.this.f4948b;
            if (zedVar86 == null) {
                sq8.m48667z("postCallbinding");
                zedVar86 = null;
            }
            zedVar86.H0.performHapticFeedback(1);
            zed zedVar87 = C1670a.this.f4948b;
            if (zedVar87 == null) {
                sq8.m48667z("postCallbinding");
                zedVar87 = null;
            }
            zedVar87.p0.setVisibility(8);
            zed zedVar88 = C1670a.this.f4948b;
            if (zedVar88 == null) {
                sq8.m48667z("postCallbinding");
                zedVar88 = null;
            }
            zedVar88.q0.setVisibility(8);
            zed zedVar89 = C1670a.this.f4948b;
            if (zedVar89 == null) {
                sq8.m48667z("postCallbinding");
                zedVar89 = null;
            }
            zedVar89.b1.setText("Confirm closing this lead?");
            zed zedVar90 = C1670a.this.f4948b;
            if (zedVar90 == null) {
                sq8.m48667z("postCallbinding");
                zedVar90 = null;
            }
            zedVar90.x0.setVisibility(8);
            zed zedVar91 = C1670a.this.f4948b;
            if (zedVar91 == null) {
                sq8.m48667z("postCallbinding");
                zedVar91 = null;
            }
            zedVar91.B0.setVisibility(8);
            zed zedVar92 = C1670a.this.f4948b;
            if (zedVar92 == null) {
                sq8.m48667z("postCallbinding");
                zedVar92 = null;
            }
            zedVar92.t0.setVisibility(8);
            zed zedVar93 = C1670a.this.f4948b;
            if (zedVar93 == null) {
                sq8.m48667z("postCallbinding");
                zedVar = null;
            } else {
                zedVar = zedVar93;
            }
            zedVar.F0.setVisibility(0);
            this.f4992g.height = C1670a.this.m3310K();
            this.f4992g.width = C1670a.this.m3311L();
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.util.a$l */
    public static final class l implements rl7 {

        /* renamed from: a */
        public static final l f5008a = new l();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Leads apply(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "it");
            return leadsSummary.toLeads();
        }
    }

    /* renamed from: ai.salesmax.util.a$m */
    public static final class m implements gu3 {
        public m() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$n */
    public static final class n implements gu3 {
        public n() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$o */
    public static final class o implements gu3 {
        public o() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(MissedOpportunitiesSummary missedOpportunitiesSummary) {
            sq8.m48649h(missedOpportunitiesSummary, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$p */
    public static final class p implements gu3 {
        public p() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            C1670a.this.getClass();
        }
    }

    /* renamed from: ai.salesmax.util.a$q */
    public static final class q implements rl7 {

        /* renamed from: a */
        public static final q f5013a = new q();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Tasks apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            return engagementSummary.toTask();
        }
    }

    /* renamed from: ai.salesmax.util.a$r */
    public static final class r implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f5014a;

        /* renamed from: b */
        public final /* synthetic */ long f5015b;

        /* renamed from: c */
        public final /* synthetic */ C1670a f5016c;

        /* renamed from: ai.salesmax.util.a$r$a */
        public static final class a implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ C1670a f5017a;

            public a(C1670a c1670a) {
                this.f5017a = c1670a;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(EngagementSummary engagementSummary) {
                sq8.m48649h(engagementSummary, "it");
                this.f5017a.getClass();
            }
        }

        /* renamed from: ai.salesmax.util.a$r$b */
        public static final class b implements gu3 {

            /* renamed from: a */
            public final /* synthetic */ C1670a f5018a;

            public b(C1670a c1670a) {
                this.f5018a = c1670a;
            }

            @Override // p001o.gu3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                sq8.m48649h(th, "it");
                this.f5018a.getClass();
            }
        }

        public r(String str, long j, C1670a c1670a) {
            this.f5014a = str;
            this.f5015b = j;
            this.f5016c = c1670a;
        }

        /* renamed from: c */
        public static final void m3343c(C1670a c1670a) {
            sq8.m48649h(c1670a, "this$0");
            c1670a.getClass();
        }

        @Override // p001o.gu3
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Tasks tasks) {
            sq8.m48649h(tasks, "taskToComplete");
            EngagementUpdateSummary engagementUpdateSummary = new EngagementUpdateSummary(null, 1, null);
            engagementUpdateSummary.setEngagementId(String.valueOf(tasks.getId()));
            engagementUpdateSummary.setNote(f9g.Z0(this.f5014a).toString());
            tasks.setNextFollowUpOn(Long.valueOf(this.f5015b));
            tasks.setNextFollowUpSetBy("USER");
            tasks.setTaskReminderTimeInMillis(1800000L);
            String id = tasks.getId();
            if (id != null) {
                this.f5016c.m3305C(id, engagementUpdateSummary);
            }
            tasks.setTaskCompletionNote("");
            tasks.setTaskNextStep("");
            tasks.setNextTaskDateInMillis(-1L);
            tasks.setNextTaskDateTimeInMillis(0L);
            tasks.setNextTaskTimeInMillis(0L);
            x6c x6cVarE3 = jyg.e3(th1.m49863o(tasks, null, 1, null));
            a aVar = new a(this.f5016c);
            b bVar = new b(this.f5016c);
            final C1670a c1670a = this.f5016c;
            x6cVarE3.w0(aVar, bVar, new jm() { // from class: o.x22
                @Override // p001o.jm
                public final void run() {
                    C1670a.r.m3343c(c1670a);
                }
            });
        }
    }

    /* renamed from: ai.salesmax.util.a$s */
    public static final class s implements gu3 {
        public s() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            C1670a.this.getClass();
        }
    }

    public C1670a() {
        Boolean boolM40355p = nd.m40355p();
        sq8.m48648g(boolM40355p, "isAccountDealManual(...)");
        this.f4957k = boolM40355p.booleanValue();
    }

    /* renamed from: D */
    public static final void m3268D(C1670a c1670a) {
        sq8.m48649h(c1670a, "this$0");
        c1670a.getClass();
    }

    /* renamed from: G */
    public static final void m3269G(C1670a c1670a) {
        sq8.m48649h(c1670a, "this$0");
        c1670a.getClass();
    }

    /* renamed from: I */
    public static final void m3270I(C1670a c1670a, Chip chip, Context context, DatePicker datePicker, int i2, int i3, int i4) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(context, "$context");
        c1670a.x0(chip, i2, i3, i4, context);
    }

    /* renamed from: N */
    public static /* synthetic */ void m3271N(C1670a c1670a, Context context, Leads leads, Tasks tasks, int i2, Object obj) {
        C1670a c1670a2;
        Context context2;
        Tasks tasks2;
        Leads leads2 = (i2 & 2) != 0 ? new Leads(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, null) : leads;
        if ((i2 & 4) != 0) {
            tasks2 = null;
            c1670a2 = c1670a;
            context2 = context;
        } else {
            c1670a2 = c1670a;
            context2 = context;
            tasks2 = tasks;
        }
        c1670a2.m3312M(context2, leads2, tasks2);
    }

    /* renamed from: O */
    public static final void m3272O(Context context, Intent intent) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        context.startActivity(intent);
    }

    /* renamed from: P */
    public static final void m3273P(Context context, Intent intent) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        context.startActivity(intent);
    }

    /* renamed from: Q */
    public static final void m3274Q(C1670a c1670a, Context context) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(context, "$context");
        c1670a.h0(context);
    }

    /* renamed from: R */
    public static final void m3275R(Context context, Intent intent) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        context.startActivity(intent);
    }

    /* renamed from: S */
    public static final void m3276S(C1670a c1670a, Context context) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(context, "$context");
        if (c1670a.f4947a == null) {
            sq8.m48667z("binding");
        }
        ct1 ct1Var = c1670a.f4947a;
        if (ct1Var == null) {
            sq8.m48667z("binding");
            ct1Var = null;
        }
        if (ct1Var.p0.isShown()) {
            c1670a.i0(context);
        }
    }

    /* renamed from: X */
    public static final void m3277X(C1670a c1670a, Leads leads, Tasks tasks, Context context) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(tasks, "$newCall");
        sq8.m48649h(context, "$context");
        if (c1670a.f4957k) {
            c1670a.t0(leads, tasks.getId(), "deal-update", context, tasks);
        } else {
            c1670a.t0(leads, tasks.getId(), "task-update", context, tasks);
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m3278Z(C1670a c1670a, Context context, Tasks tasks, Leads leads, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            leads = null;
        }
        if ((i2 & 8) != 0) {
            str = "";
        }
        c1670a.m3317Y(context, tasks, leads, str);
    }

    public static final void b0(Context context, Handler handler, final C1670a c1670a, View view) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(handler, "$mainHandler");
        sq8.m48649h(c1670a, "this$0");
        if (c64.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
            handler.post(new Runnable() { // from class: o.b22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.c0(this.f15471a);
                }
            });
            return;
        }
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        if (prefsM127c == null) {
            return;
        }
        prefsM127c.z1(true);
    }

    public static final void c0(C1670a c1670a) {
        sq8.m48649h(c1670a, "this$0");
        if (c1670a.f4956j != null) {
            zed zedVar = c1670a.f4948b;
            if (zedVar == null) {
                sq8.m48667z("postCallbinding");
                zedVar = null;
            }
            zedVar.J0.performHapticFeedback(1);
            Service service = c1670a.f4956j;
            sq8.m48647f(service, "null cannot be cast to non-null type ai.salesmax.ui.service.CallStateManagerService");
            ((CallStateManagerService) service).r0();
        }
    }

    public static final void d0(Context context, View view, boolean z) {
        sq8.m48649h(context, "$context");
        if (z) {
            Object systemService = context.getSystemService("input_method");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        } else {
            Object systemService2 = context.getSystemService("input_method");
            sq8.m48647f(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void e0(C1670a c1670a, Context context) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(context, "$context");
        if (c1670a.f4948b == null) {
            sq8.m48667z("postCallbinding");
        }
        zed zedVar = c1670a.f4948b;
        zed zedVar2 = null;
        if (zedVar == null) {
            sq8.m48667z("postCallbinding");
            zedVar = null;
        }
        if (!zedVar.O0.isShown()) {
            zed zedVar3 = c1670a.f4948b;
            if (zedVar3 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar2 = zedVar3;
            }
            if (!zedVar2.m25689B().isAttachedToWindow()) {
                return;
            }
        }
        c1670a.j0(context);
    }

    public static final void f0(C1670a c1670a, Handler handler, Runnable runnable) {
        sq8.m48649h(c1670a, "this$0");
        sq8.m48649h(handler, "$postCallHandler");
        sq8.m48649h(runnable, "$postCallRunnable");
        j jVar = c1670a.new j(handler, runnable);
        Service service = c1670a.f4956j;
        if (service != null) {
            sq8.m48647f(service, "null cannot be cast to non-null type ai.salesmax.ui.service.CallStateManagerService");
            ((CallStateManagerService) service).w0(jVar);
        }
    }

    public static final void m0(C1670a c1670a) {
        sq8.m48649h(c1670a, "this$0");
        c1670a.getClass();
    }

    public static final void o0(C1670a c1670a) {
        sq8.m48649h(c1670a, "this$0");
        c1670a.getClass();
    }

    public static final void q0() {
    }

    public static /* synthetic */ void s0(C1670a c1670a, Leads leads, Tasks tasks, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            tasks = null;
        }
        c1670a.r0(leads, tasks);
    }

    public static final void u0(Context context, Intent intent) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        context.startActivity(intent);
    }

    public static final void w0(Context context, Intent intent) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        context.startActivity(intent);
    }

    public static final void y0(Chip chip, int i2, int i3, int i4, TimePicker timePicker, int i5, int i6) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        calendar.set(12, i6);
        calendar.set(11, i5);
        new SimpleDateFormat("dd MMM HH:mm", Locale.getDefault()).format(calendar.getTime());
        if (chip == null) {
            return;
        }
        chip.setText(a81.m16653h(Long.valueOf(calendar.getTime().getTime())));
    }

    /* renamed from: C */
    public final void m3305C(String str, EngagementUpdateSummary engagementUpdateSummary) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        engagementUpdateSummary.setEngagementId(str);
        vf6.m52698c(engagementUpdateSummary).w0(new c(), new d(), new jm() { // from class: o.l22
            @Override // p001o.jm
            public final void run() {
                C1670a.m3268D(this.f33005a);
            }
        });
    }

    /* renamed from: E */
    public final void m3306E(Leads leads, Tasks tasks) {
        zed zedVar = null;
        if (tasks == null || !sq8.m48644c(tasks.getCallDirection(), "OUTGOING") || tasks.getCallDurationInMillis() != 0 || leads.getUnsuccessfulCallAttempts() == null || leads.getUnsuccessfulCallAttempts().intValue() < 3) {
            zed zedVar2 = this.f4948b;
            if (zedVar2 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar2;
            }
            zedVar.d1.setVisibility(8);
            return;
        }
        int iIntValue = leads.getUnsuccessfulCallAttempts().intValue() + 1;
        if (sq8.m48644c(leads.getLeadLifecycleStage(), "OPPORTUNITY") || sq8.m48644c(leads.getLeadLifecycleStage(), "CLOSED")) {
            zed zedVar3 = this.f4948b;
            if (zedVar3 == null) {
                sq8.m48667z("postCallbinding");
                zedVar3 = null;
            }
            zedVar3.d1.setText("⚠️ Your last " + iIntValue + " Calls were not picked");
        } else {
            zed zedVar4 = this.f4948b;
            if (zedVar4 == null) {
                sq8.m48667z("postCallbinding");
                zedVar4 = null;
            }
            zedVar4.d1.setText("⚠️ Your last " + iIntValue + " Calls were not picked. Close this Lead?");
        }
        zed zedVar5 = this.f4948b;
        if (zedVar5 == null) {
            sq8.m48667z("postCallbinding");
        } else {
            zedVar = zedVar5;
        }
        zedVar.d1.setVisibility(0);
    }

    /* renamed from: F */
    public final void m3307F(Tasks tasks) {
        tasks.setCallInputNotes("Multiple RNR");
        EngagementSummary engagementSummaryM49863o = th1.m49863o(tasks, null, 1, null);
        engagementSummaryM49863o.setCallOutcome("MULTIPLE_RNR");
        engagementSummaryM49863o.setCallOutcomeNature("negative");
        jyg.e3(engagementSummaryM49863o).w0(new e(), new f(), new jm() { // from class: o.d22
            @Override // p001o.jm
            public final void run() {
                C1670a.m3269G(this.f19012a);
            }
        });
    }

    /* renamed from: H */
    public final void m3308H(final Chip chip, final Context context) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() { // from class: o.f22
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                C1670a.m3270I(this.f22557a, chip, context, datePicker, i2, i3, i4);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        if (Build.VERSION.SDK_INT >= 26) {
            Window window = datePickerDialog.getWindow();
            if (window != null) {
                window.setType(2038);
            }
        } else {
            Window window2 = datePickerDialog.getWindow();
            if (window2 != null) {
                window2.setType(CastStatusCodes.CANCELED);
            }
        }
        datePickerDialog.show();
    }

    /* renamed from: J */
    public final void m3309J(a aVar) {
        sq8.m48649h(aVar, "action");
        p74.f39487a.m43080h(new g(aVar, this, null));
    }

    /* renamed from: K */
    public final int m3310K() {
        return this.f4953g;
    }

    /* renamed from: L */
    public final int m3311L() {
        return this.f4954h;
    }

    /* renamed from: M */
    public final void m3312M(final Context context, Leads leads, Tasks tasks) {
        ct1 ct1Var;
        WindowManager.LayoutParams layoutParamsM3265a;
        sq8.m48649h(context, "context");
        sq8.m48649h(leads, "leads");
        Object systemService = context.getSystemService("keyguard");
        ct1 ct1Var2 = null;
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        Boolean boolValueOf = keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Locked screen: ");
        sb.append(boolValueOf);
        boolean zM3314U = m3314U(context);
        if (boolValueOf != null && sq8.m48644c(boolValueOf, Boolean.TRUE)) {
            final Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra(context.getString(hae.argumentLeads), leads);
            intent.setFlags(268435456);
            if (zM3314U) {
                intent.setFlags(intent.getFlags() | 67108864);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.m22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.m3272O(context, intent);
                }
            }, 1000L);
            if (zM3314U) {
                return;
            }
            final Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.putExtra(context.getString(hae.argumentLeads), leads);
            intent2.setFlags(335544320);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.n22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.m3273P(context, intent2);
                }
            }, 1000L);
            String str = "salesmax://ai.salesmax/lead/" + leads.getContactID();
            Notification notificationM57109c = new y1c().m57109c(context, "Getting call from " + leads.getName(), "Your phone is locked. Tap on this notification to view the lead", w7e.icon_transparent, str, 10000L);
            NotificationManager notificationManager = (NotificationManager) c64.getSystemService(context, NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify(this.f4955i, notificationM57109c);
            }
            new Runnable() { // from class: o.o22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.m3274Q(this.f37545a, context);
                }
            };
            new Handler(Looper.getMainLooper());
            return;
        }
        if (!zM3314U) {
            final Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
            intent3.putExtra(context.getString(hae.argumentLeads), leads);
            intent3.setFlags(335544320);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.p22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.m3275R(context, intent3);
                }
            }, 1000L);
        }
        Object systemService2 = context.getSystemService("window");
        sq8.m48647f(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        this.f4949c = (WindowManager) systemService2;
        int i2 = Build.VERSION.SDK_INT;
        WindowManager.LayoutParams layoutParams = i2 >= 26 ? new WindowManager.LayoutParams(-1, -1, 2046, 8, -3) : new WindowManager.LayoutParams(-1, -1, CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, 40, -2);
        layoutParams.height = -2;
        layoutParams.width = -1;
        this.f4952f = -1;
        this.f4951e = -2;
        layoutParams.format = -3;
        layoutParams.gravity = 80;
        ct1 ct1VarH0 = ct1.h0(LayoutInflater.from(context));
        sq8.m48648g(ct1VarH0, "inflate(...)");
        this.f4947a = ct1VarH0;
        if (ct1VarH0 == null) {
            sq8.m48667z("binding");
            ct1VarH0 = null;
        }
        ct1VarH0.k0(leads);
        ct1 ct1Var3 = this.f4947a;
        if (ct1Var3 == null) {
            sq8.m48667z("binding");
            ct1Var3 = null;
        }
        ct1Var3.l0(0);
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: o.q22
            @Override // java.lang.Runnable
            public final void run() {
                C1670a.m3276S(this.f41159a, context);
            }
        };
        ct1 ct1Var4 = this.f4947a;
        if (ct1Var4 == null) {
            sq8.m48667z("binding");
            ct1Var = null;
        } else {
            ct1Var = ct1Var4;
        }
        ct1Var.j0(new h(handler, runnable, this, context, tasks, leads));
        gge ggeVar = new gge();
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 2038, 8, -3);
        ggeVar.f25106a = layoutParams2;
        if (i2 < 26) {
            layoutParams2.type = CastStatusCodes.CANCELED;
        }
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        if (prefsM127c == null || (layoutParamsM3265a = prefsM127c.m3249k()) == null) {
            layoutParamsM3265a = Prefs.Y0.m3265a();
        }
        ggeVar.f25106a = layoutParamsM3265a;
        try {
            WindowManager windowManager = this.f4949c;
            sq8.m48646e(windowManager);
            ct1 ct1Var5 = this.f4947a;
            if (ct1Var5 == null) {
                sq8.m48667z("binding");
                ct1Var5 = null;
            }
            windowManager.addView(ct1Var5.m25689B(), (ViewGroup.LayoutParams) ggeVar.f25106a);
        } catch (WindowManager.BadTokenException e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to add view: ");
            sb2.append(message);
        } catch (IllegalStateException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Window count exceeded: ");
            sb3.append(message2);
        }
        try {
            ct1 ct1Var6 = this.f4947a;
            if (ct1Var6 == null) {
                sq8.m48667z("binding");
            } else {
                ct1Var2 = ct1Var6;
            }
            ct1Var2.m25689B().setOnTouchListener(new i(ggeVar, this));
        } catch (Exception unused) {
        }
    }

    /* renamed from: T */
    public final boolean m3313T() {
        return this.f4957k;
    }

    /* renamed from: U */
    public final boolean m3314U(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        String packageName = context.getPackageName();
        if (activityManager == null || (runningTasks = activityManager.getRunningTasks(Api.BaseClientBuilder.API_PRIORITY_OTHER)) == null) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            ComponentName componentName = runningTaskInfo.baseActivity;
            if (sq8.m48644c(componentName != null ? componentName.getPackageName() : null, packageName)) {
                ComponentName componentName2 = runningTaskInfo.baseActivity;
                if (sq8.m48644c(componentName2 != null ? componentName2.getClassName() : null, MainActivity.class.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: V */
    public final void m3315V(Tasks tasks, Leads leads, String str, Context context) {
        sq8.m48649h(tasks, "newCall");
        sq8.m48649h(context, "context");
        if (j4d.o0(context)) {
            String id = tasks.getId();
            StringBuilder sb = new StringBuilder();
            sb.append("Launching call disposition form ");
            sb.append(id);
            if ((leads != null ? leads.getLeadLifecycleStage() : null) == null || !sq8.m48644c(leads.getLeadLifecycleStage(), "OPPORTUNITY")) {
                t0(leads, tasks.getId(), str, context, tasks);
            } else if (this.f4957k) {
                t0(leads, tasks.getId(), "deal-update", context, tasks);
            } else {
                t0(leads, tasks.getId(), "task-update", context, tasks);
            }
        }
    }

    /* renamed from: W */
    public final void m3316W(final Tasks tasks, final Leads leads, final Context context) {
        sq8.m48649h(tasks, "newCall");
        sq8.m48649h(context, "context");
        if (j4d.o0(context)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.e22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.m3277X(this.f20807a, leads, tasks, context);
                }
            });
        }
    }

    /* renamed from: Y */
    public final void m3317Y(Context context, Tasks tasks, Leads leads, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(tasks, "obj");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        String str2 = null;
        if ((leads != null ? leads.getPhoneNumbers() : null) != null) {
            ArrayList<String> phoneNumbers = leads != null ? leads.getPhoneNumbers() : null;
            sq8.m48646e(phoneNumbers);
            if (phoneNumbers.size() > 0) {
                sq8.m48646e(leads);
                str2 = leads.getPhoneNumbers().get(0);
            }
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        boolean zM3262x = AbstractC0059a.m132a().m3262x();
        String str3 = "http://api.whatsapp.com/send?phone=" + str2 + "&text=" + str;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str3));
        if (zM3262x) {
            intent.setPackage("com.whatsapp.w4b");
        } else {
            intent.setPackage("com.whatsapp");
        }
        if (k8j.m35178a(context, String.valueOf(intent.getPackage()))) {
            try {
                intent.addFlags(268435456);
                intent.addFlags(134217728);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public final void a0(final Context context, Leads leads, Tasks tasks) {
        zed zedVar;
        zed zedVar2;
        sq8.m48649h(context, "context");
        sq8.m48649h(leads, "leads");
        sq8.m48649h(tasks, "newCall");
        gge ggeVar = new gge();
        ggeVar.f25106a = leads;
        String id = tasks.getId();
        StringBuilder sb = new StringBuilder();
        sb.append("starting post call screen pop ");
        sb.append(id);
        NotificationManager notificationManager = (NotificationManager) c64.getSystemService(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(this.f4955i);
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        Boolean boolValueOf = keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Locked screen: ");
        sb2.append(boolValueOf);
        if (boolValueOf != null && sq8.m48644c(boolValueOf, Boolean.TRUE)) {
            if (j4d.o0(context)) {
                m3315V(tasks, (Leads) ggeVar.f25106a, "lock-screen", context);
                return;
            }
            return;
        }
        Object systemService2 = context.getSystemService("window");
        sq8.m48647f(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        this.f4950d = (WindowManager) systemService2;
        WindowManager.LayoutParams layoutParams = Build.VERSION.SDK_INT >= 26 ? new WindowManager.LayoutParams(-1, -1, 2038, 262688, -3) : new WindowManager.LayoutParams(-1, -1, CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, 32, -2);
        layoutParams.height = -2;
        layoutParams.width = -1;
        this.f4954h = -1;
        this.f4953g = -2;
        layoutParams.format = -3;
        layoutParams.gravity = 80;
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: o.r22
            @Override // java.lang.Runnable
            public final void run() {
                C1670a.e0(this.f42770a, context);
            }
        };
        zed zedVarH0 = zed.h0(LayoutInflater.from(context));
        sq8.m48648g(zedVarH0, "inflate(...)");
        this.f4948b = zedVarH0;
        if (zedVarH0 == null) {
            sq8.m48667z("postCallbinding");
            zedVarH0 = null;
        }
        zedVarH0.l0((Leads) ggeVar.f25106a);
        zed zedVar3 = this.f4948b;
        if (zedVar3 == null) {
            sq8.m48667z("postCallbinding");
            zedVar3 = null;
        }
        zedVar3.j0(tasks);
        zed zedVar4 = this.f4948b;
        if (zedVar4 == null) {
            sq8.m48667z("postCallbinding");
            zedVar4 = null;
        }
        zedVar4.m0(0);
        zed zedVar5 = this.f4948b;
        if (zedVar5 == null) {
            sq8.m48667z("postCallbinding");
            zedVar5 = null;
        }
        zedVar5.J0.setEndIconVisible(false);
        if (this.f4957k) {
            zed zedVar6 = this.f4948b;
            if (zedVar6 == null) {
                sq8.m48667z("postCallbinding");
                zedVar6 = null;
            }
            zedVar6.f1.setText("Update Deal");
        }
        r0(leads, tasks);
        m3306E(leads, tasks);
        this.f4956j = CallStateManagerService.m2593J();
        if (!wi0.m54473m()) {
            zed zedVar7 = this.f4948b;
            if (zedVar7 == null) {
                sq8.m48667z("postCallbinding");
                zedVar7 = null;
            }
            zedVar7.H0.setVisibility(8);
        }
        final Handler handler2 = new Handler(context.getApplicationContext().getMainLooper());
        handler2.post(new Runnable() { // from class: o.s22
            @Override // java.lang.Runnable
            public final void run() {
                C1670a.f0(this.f44441a, handler, runnable);
            }
        });
        zed zedVar8 = this.f4948b;
        if (zedVar8 == null) {
            sq8.m48667z("postCallbinding");
            zedVar8 = null;
        }
        zedVar8.J0.setEndIconOnClickListener(new View.OnClickListener() { // from class: o.t22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1670a.b0(context, handler2, this, view);
            }
        });
        if (tasks.getCallDurationInMillis() > 0) {
            zed zedVar9 = this.f4948b;
            if (zedVar9 == null) {
                sq8.m48667z("postCallbinding");
                zedVar9 = null;
            }
            zedVar9.J0.setVisibility(0);
            zed zedVar10 = this.f4948b;
            if (zedVar10 == null) {
                sq8.m48667z("postCallbinding");
                zedVar10 = null;
            }
            zedVar10.o0.setText("Add a quick follow-up...");
        } else {
            zed zedVar11 = this.f4948b;
            if (zedVar11 == null) {
                sq8.m48667z("postCallbinding");
                zedVar11 = null;
            }
            zedVar11.J0.setVisibility(8);
            zed zedVar12 = this.f4948b;
            if (zedVar12 == null) {
                sq8.m48667z("postCallbinding");
                zedVar12 = null;
            }
            zedVar12.o0.setText("Call Back again in...");
        }
        zed zedVar13 = this.f4948b;
        if (zedVar13 == null) {
            sq8.m48667z("postCallbinding");
            zedVar = null;
        } else {
            zedVar = zedVar13;
        }
        zedVar.k0(new k(handler, runnable, tasks, ggeVar, context, layoutParams, leads));
        try {
            WindowManager windowManager = this.f4950d;
            sq8.m48646e(windowManager);
            zed zedVar14 = this.f4948b;
            if (zedVar14 == null) {
                sq8.m48667z("postCallbinding");
                zedVar14 = null;
            }
            windowManager.addView(zedVar14.m25689B(), layoutParams);
        } catch (WindowManager.BadTokenException e2) {
            String message = e2.getMessage();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to add view: ");
            sb3.append(message);
            FirebaseCrashlytics.getInstance().recordException(new RuntimeException("CallLogEvent: postCallPopup Unable to add view: " + e2.getMessage()));
        } catch (IllegalStateException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Window count exceeded: ");
            sb4.append(message2);
            FirebaseCrashlytics.getInstance().recordException(new RuntimeException("CallLogEvent: postCallPopup Window count exceeded: " + e3.getMessage()));
        }
        zed zedVar15 = this.f4948b;
        if (zedVar15 == null) {
            sq8.m48667z("postCallbinding");
            zedVar2 = null;
        } else {
            zedVar2 = zedVar15;
        }
        zedVar2.I0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.a22
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C1670a.d0(context, view, z);
            }
        });
    }

    public final x6c g0(Leads leads) {
        x6c x6cVarD0 = lw9.l1(leads.getContactID(), "CALL").d0(l.f5008a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    public final void h0(Context context) {
        NotificationManager notificationManager = (NotificationManager) c64.getSystemService(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(this.f4955i);
        }
    }

    public final void i0(Context context) {
        sq8.m48649h(context, "context");
        try {
            try {
                ct1 ct1Var = this.f4947a;
                if (ct1Var != null) {
                    if (ct1Var == null) {
                        sq8.m48667z("binding");
                        ct1Var = null;
                    }
                    if (ct1Var.p0.isShown()) {
                        WindowManager windowManager = this.f4949c;
                        if (windowManager != null) {
                            ct1 ct1Var2 = this.f4947a;
                            if (ct1Var2 == null) {
                                sq8.m48667z("binding");
                                ct1Var2 = null;
                            }
                            windowManager.removeView(ct1Var2.m25689B());
                        }
                        ct1 ct1Var3 = this.f4947a;
                        if (ct1Var3 == null) {
                            sq8.m48667z("binding");
                            ct1Var3 = null;
                        }
                        ct1Var3.c0();
                    }
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Error removing view: ");
                sb.append(message);
            }
        } finally {
            this.f4949c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0058, Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:3:0x0006, B:7:0x000e, B:8:0x0012, B:10:0x001a, B:12:0x001e, B:13:0x0022, B:15:0x002c, B:17:0x0030, B:19:0x0034, B:20:0x0038, B:21:0x003f, B:23:0x0043, B:24:0x0048, B:26:0x004c, B:27:0x0050), top: B:37:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(Context context) {
        sq8.m48649h(context, "context");
        try {
            try {
                zed zedVar = this.f4948b;
                if (zedVar != null) {
                    if (zedVar == null) {
                        sq8.m48667z("postCallbinding");
                        zedVar = null;
                    }
                    if (zedVar.O0.isShown()) {
                        WindowManager windowManager = this.f4950d;
                        if (windowManager != null) {
                            zed zedVar2 = this.f4948b;
                            if (zedVar2 == null) {
                                sq8.m48667z("postCallbinding");
                                zedVar2 = null;
                            }
                            windowManager.removeView(zedVar2.m25689B());
                        }
                        Service service = this.f4956j;
                        if (service != null) {
                            ((CallStateManagerService) service).w0(null);
                        }
                        zed zedVar3 = this.f4948b;
                        if (zedVar3 == null) {
                            sq8.m48667z("postCallbinding");
                            zedVar3 = null;
                        }
                        zedVar3.c0();
                    } else {
                        zed zedVar4 = this.f4948b;
                        if (zedVar4 == null) {
                            sq8.m48667z("postCallbinding");
                            zedVar4 = null;
                        }
                        if (zedVar4.m25689B().isAttachedToWindow()) {
                        }
                    }
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Error removing post-call view: ");
                sb.append(message);
            }
        } finally {
            this.f4950d = null;
            this.f4956j = null;
        }
    }

    public final void k0(Leads leads, String str, long j2, Tasks tasks, String str2) {
        if (sq8.m48644c(leads.getLeadLifecycleStage(), LeadLifecycleStage.OPPORTUNITY.name())) {
            p0(leads, str, j2, tasks, str2);
        } else {
            l0(leads, str, j2, tasks, str2);
        }
    }

    public final void l0(Leads leads, String str, long j2, Tasks tasks, String str2) {
        MissedOpportunitiesSummary missedOpportunitiesSummary = new MissedOpportunitiesSummary(null, 1, null);
        missedOpportunitiesSummary.setContactId(leads.getContactID());
        missedOpportunitiesSummary.setMissedOpportunityType(str);
        missedOpportunitiesSummary.setContactId(leads.getContactID());
        missedOpportunitiesSummary.setCallLaterDateTime(Long.valueOf(j2));
        String callPlacementId = tasks.getCallPlacementId();
        if (callPlacementId == null) {
            callPlacementId = "";
        }
        missedOpportunitiesSummary.setEngagementId(callPlacementId);
        String name = leads.getName();
        missedOpportunitiesSummary.setMessageBody("This is a reminder to call your lead " + (name != null ? name : ""));
        if (str2.length() > 0) {
            missedOpportunitiesSummary.setMessageBody(missedOpportunitiesSummary.getMessageBody() + " - " + str2);
        }
        n0(missedOpportunitiesSummary);
        tasks.setNextFollowUpOn(Long.valueOf(j2));
        tasks.setNextFollowUpSetBy("USER");
        if (tasks.getCallInputNotes().length() == 0) {
            if (str2.length() > 0) {
                tasks.setCallInputNotes(str2);
            }
        }
        EngagementSummary engagementSummaryM49863o = th1.m49863o(tasks, null, 1, null);
        Object objOrElse = Optional.ofNullable(str).orElse("CALL_LATER");
        sq8.m48648g(objOrElse, "orElse(...)");
        engagementSummaryM49863o.setCallOutcome((String) objOrElse);
        jyg.e3(engagementSummaryM49863o).w0(new m(), new n(), new jm() { // from class: o.g22
            @Override // p001o.jm
            public final void run() {
                C1670a.m0(this.f24478a);
            }
        });
    }

    public final void n0(MissedOpportunitiesSummary missedOpportunitiesSummary) {
        bgb.m18881j(missedOpportunitiesSummary).w0(new o(), new p(), new jm() { // from class: o.i22
            @Override // p001o.jm
            public final void run() {
                C1670a.o0(this.f27949a);
            }
        });
    }

    public final void p0(Leads leads, String str, long j2, Tasks tasks, String str2) {
        String id;
        OpenTaskDetail openTaskDetail = leads.getOpenTaskDetail();
        if (openTaskDetail == null || (id = openTaskDetail.getId()) == null) {
            return;
        }
        jyg.e1(id).d0(q.f5013a).w0(new r(str2, j2, this), new s(), new jm() { // from class: o.h22
            @Override // p001o.jm
            public final void run() {
                C1670a.q0();
            }
        });
    }

    public final void r0(Leads leads, Tasks tasks) {
        zed zedVar = null;
        if (leads.getLeadLifecycleStage() != null && (sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_NEW") || sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_RECHURNED"))) {
            if (tasks != null && tasks.getCallDurationInMillis() == 0) {
                zed zedVar2 = this.f4948b;
                if (zedVar2 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar = zedVar2;
                }
                zedVar.b1.setText("Did not pick this call");
                return;
            }
            zed zedVar3 = this.f4948b;
            if (zedVar3 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar3;
            }
            zedVar.b1.setText("Something important to record about this initial call with " + leads.getName() + " ?");
            return;
        }
        if (leads.getLeadLifecycleStage() != null && sq8.m48644c(leads.getLeadLifecycleStage(), "PROSPECTING")) {
            if (tasks != null && tasks.getCallDurationInMillis() == 0) {
                zed zedVar4 = this.f4948b;
                if (zedVar4 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar = zedVar4;
                }
                zedVar.b1.setText("Did not pick this call");
                return;
            }
            zed zedVar5 = this.f4948b;
            if (zedVar5 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar5;
            }
            zedVar.b1.setText("Any update on requirements for " + leads.getName() + " ?");
            return;
        }
        if (leads.getLeadLifecycleStage() != null && sq8.m48644c(leads.getLeadLifecycleStage(), "OPPORTUNITY")) {
            if (tasks != null && tasks.getCallDurationInMillis() == 0) {
                zed zedVar6 = this.f4948b;
                if (zedVar6 == null) {
                    sq8.m48667z("postCallbinding");
                } else {
                    zedVar = zedVar6;
                }
                zedVar.b1.setText("Did not pick this call");
                return;
            }
            zed zedVar7 = this.f4948b;
            if (zedVar7 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar7;
            }
            zedVar.b1.setText("Record any progress on open Deal for " + leads.getName() + " ");
            return;
        }
        if (leads.getLeadLifecycleStage() == null || !sq8.m48644c(leads.getLeadLifecycleStage(), "CLOSED")) {
            zed zedVar8 = this.f4948b;
            if (zedVar8 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar8;
            }
            zedVar.b1.setText("Something important to record about call with " + leads.getName() + " ?");
            return;
        }
        if (leads.getLeadLifecycleStageSubCategory() != null && sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_WON")) {
            zed zedVar9 = this.f4948b;
            if (zedVar9 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar9;
            }
            zedVar.b1.setText("This is a closed lead (existing customer). Select what to do next for " + leads.getName());
            return;
        }
        if (leads.getLeadLifecycleStageSubCategory() == null || !sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_LOST")) {
            zed zedVar10 = this.f4948b;
            if (zedVar10 == null) {
                sq8.m48667z("postCallbinding");
            } else {
                zedVar = zedVar10;
            }
            zedVar.b1.setText("This is a closed lead. Select what to do next for " + leads.getName());
            return;
        }
        zed zedVar11 = this.f4948b;
        if (zedVar11 == null) {
            sq8.m48667z("postCallbinding");
        } else {
            zedVar = zedVar11;
        }
        zedVar.b1.setText("This is a closed lead (lost deal). Select what to do next for " + leads.getName());
    }

    public final void t0(Leads leads, String str, String str2, final Context context, Tasks tasks) {
        sq8.m48649h(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("preparing to start main activity ");
        sb.append(str);
        if (leads != null) {
            final Intent intent = new Intent(context.getApplicationContext(), (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(134217728);
            intent.putExtra(context.getString(hae.argumentLeads), leads);
            intent.putExtra(context.getString(hae.argumentTasks), tasks);
            intent.putExtra(context.getString(hae.argumentEngagementID), str);
            intent.putExtra(context.getString(hae.argumentOutcomeNature), str2);
            intent.putExtra(context.getString(hae.argumentLeadsOpenCallDetails), true);
            j0f.m33008i(new Runnable() { // from class: o.c22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.u0(context, intent);
                }
            });
        }
    }

    public final void v0(final Context context, Tasks tasks) {
        sq8.m48649h(context, "context");
        AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
        if (autoCallConfigM54443I == null || !autoCallConfigM54443I.getAutoCallMode() || autoCallConfigM54443I.isPaused()) {
            return;
        }
        int lastActionIndex = autoCallConfigM54443I.getLastActionIndex();
        int size = autoCallConfigM54443I.getContactIds().size();
        StringBuilder sb = new StringBuilder();
        sb.append("going to invoke main activity with lastActionIndex: ");
        sb.append(lastActionIndex);
        sb.append(" having size: ");
        sb.append(size);
        sb.append(" and task: ");
        sb.append(tasks);
        if (autoCallConfigM54443I.getLastActionIndex() < autoCallConfigM54443I.getContactIds().size() - 1) {
            final Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(134217728);
            intent.putExtra(context.getString(hae.argumentLeadsContinueAutoCall), true);
            j0f.m33008i(new Runnable() { // from class: o.k22
                @Override // java.lang.Runnable
                public final void run() {
                    C1670a.w0(context, intent);
                }
            });
        }
    }

    public final void x0(final Chip chip, final int i2, final int i3, final int i4, Context context) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() { // from class: o.j22
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i5, int i6) {
                C1670a.y0(chip, i2, i3, i4, timePicker, i5, i6);
            }
        }, 10, 30, false);
        if (Build.VERSION.SDK_INT >= 26) {
            Window window = timePickerDialog.getWindow();
            if (window != null) {
                window.setType(2038);
            }
        } else {
            Window window2 = timePickerDialog.getWindow();
            if (window2 != null) {
                window2.setType(CastStatusCodes.CANCELED);
            }
        }
        timePickerDialog.show();
    }

    /* renamed from: ai.salesmax.util.a$a */
    public static final class a {

        /* renamed from: a */
        public b f4958a;

        /* renamed from: b */
        public Context f4959b;

        /* renamed from: c */
        public Leads f4960c;

        /* renamed from: d */
        public Tasks f4961d;

        public a(b bVar, Context context, Leads leads, Tasks tasks) {
            sq8.m48649h(bVar, "name");
            sq8.m48649h(context, "context");
            sq8.m48649h(leads, "leads");
            this.f4958a = bVar;
            this.f4959b = context;
            this.f4960c = leads;
            this.f4961d = tasks;
        }

        /* renamed from: a */
        public final Context m3318a() {
            return this.f4959b;
        }

        /* renamed from: b */
        public final Leads m3319b() {
            return this.f4960c;
        }

        /* renamed from: c */
        public final b m3320c() {
            return this.f4958a;
        }

        /* renamed from: d */
        public final Tasks m3321d() {
            return this.f4961d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4958a == aVar.f4958a && sq8.m48644c(this.f4959b, aVar.f4959b) && sq8.m48644c(this.f4960c, aVar.f4960c) && sq8.m48644c(this.f4961d, aVar.f4961d);
        }

        public int hashCode() {
            int iHashCode = ((((this.f4958a.hashCode() * 31) + this.f4959b.hashCode()) * 31) + this.f4960c.hashCode()) * 31;
            Tasks tasks = this.f4961d;
            return iHashCode + (tasks == null ? 0 : tasks.hashCode());
        }

        public String toString() {
            return "Action(name=" + this.f4958a + ", context=" + this.f4959b + ", leads=" + this.f4960c + ", tasks=" + this.f4961d + ")";
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ a(ai.salesmax.util.C1670a.b r106, android.content.Context r107, ai.salesmax.model.Leads r108, ai.salesmax.model.Tasks r109, int r110, p001o.id5 r111) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.salesmax.util.C1670a.a.<init>(ai.salesmax.util.a$b, android.content.Context, ai.salesmax.model.Leads, ai.salesmax.model.Tasks, int, o.id5):void");
        }
    }
}
