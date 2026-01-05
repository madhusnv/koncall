package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.application.ActivityLifecycleHandlerBase;
import com.onesignal.core.internal.application.AppEntryAction;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p001o.kf9;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ApplicationService implements IApplicationService, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final EventProducer<IActivityLifecycleHandler> activityLifecycleNotifier = new EventProducer<>();
    private final EventProducer<IApplicationLifecycleHandler> applicationLifecycleNotifier = new EventProducer<>();
    private final EventProducer<ISystemConditionHandler> systemConditionNotifier = new EventProducer<>();
    private AppEntryAction entryState = AppEntryAction.APP_CLOSE;

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$handleFocus$1 */
    public static final class C115921 extends kf9 implements xk7 {
        public static final C115921 INSTANCE = new C115921();

        public C115921() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IApplicationLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
            sq8.m48649h(iApplicationLifecycleHandler, "it");
            iApplicationLifecycleHandler.onFocus(false);
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$handleLostFocus$1 */
    public static final class C115931 extends kf9 implements xk7 {
        public static final C115931 INSTANCE = new C115931();

        public C115931() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IApplicationLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
            sq8.m48649h(iApplicationLifecycleHandler, "it");
            iApplicationLifecycleHandler.onUnfocused();
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$onActivityStopped$1 */
    public static final class C115941 extends kf9 implements xk7 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115941(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IActivityLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
            sq8.m48649h(iActivityLifecycleHandler, "it");
            iActivityLifecycleHandler.onActivityStopped(this.$activity);
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$onGlobalLayout$1 */
    public static final class C115951 extends kf9 implements xk7 {
        public static final C115951 INSTANCE = new C115951();

        public C115951() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISystemConditionHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISystemConditionHandler iSystemConditionHandler) {
            sq8.m48649h(iSystemConditionHandler, "it");
            iSystemConditionHandler.systemConditionChanged();
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$onOrientationChanged$1 */
    public static final class C115961 extends kf9 implements xk7 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115961(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IActivityLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
            sq8.m48649h(iActivityLifecycleHandler, "it");
            iActivityLifecycleHandler.onActivityStopped(this.$activity);
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$onOrientationChanged$2 */
    public static final class C115972 extends kf9 implements xk7 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115972(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IActivityLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
            sq8.m48649h(iActivityLifecycleHandler, "it");
            iActivityLifecycleHandler.onActivityAvailable(this.$activity);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.application.impl.ApplicationService", m36648f = "ApplicationService.kt", m36649l = {309}, m36650m = "waitUntilActivityReady")
    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilActivityReady$1 */
    public static final class C115981 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C115981(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApplicationService.this.waitUntilActivityReady(this);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.application.impl.ApplicationService", m36648f = "ApplicationService.kt", m36649l = {238, 269, 296}, m36650m = "waitUntilSystemConditionsAvailable")
    /* renamed from: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$1 */
    public static final class C115991 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C115991(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApplicationService.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decorViewReady$lambda-1, reason: not valid java name */
    public static final void m68745decorViewReady$lambda1(final ApplicationService applicationService, final Runnable runnable, final ApplicationService applicationService2) {
        sq8.m48649h(applicationService, "$self");
        sq8.m48649h(runnable, "$runnable");
        sq8.m48649h(applicationService2, "this$0");
        applicationService.addActivityLifecycleHandler(new ActivityLifecycleHandlerBase() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$decorViewReady$1$1
            @Override // com.onesignal.core.internal.application.ActivityLifecycleHandlerBase, com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity activity) {
                sq8.m48649h(activity, "currentActivity");
                this.$self.removeActivityLifecycleHandler(this);
                if (AndroidUtils.INSTANCE.isActivityFullyReady(activity)) {
                    runnable.run();
                } else {
                    applicationService2.decorViewReady(activity, runnable);
                }
            }
        });
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            Logging.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        Logging.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != AppEntryAction.NOTIFICATION_CLICK) {
            setEntryState(AppEntryAction.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(C115921.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            Logging.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        Logging.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(AppEntryAction.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(C115931.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i, Activity activity) {
        if (i == 1) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity, null, 2, null);
        } else if (i == 2) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new C115961(activity));
        this.activityLifecycleNotifier.fire(new C115972(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: waitUntilActivityReady$lambda-0, reason: not valid java name */
    public static final void m68746waitUntilActivityReady$lambda0(Waiter waiter) throws Exception {
        sq8.m48649h(waiter, "$waiter");
        waiter.wake();
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler) {
        sq8.m48649h(iActivityLifecycleHandler, "handler");
        this.activityLifecycleNotifier.subscribe(iActivityLifecycleHandler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            sq8.m48646e(current);
            iActivityLifecycleHandler.onActivityAvailable(current);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
        sq8.m48649h(iApplicationLifecycleHandler, "handler");
        this.applicationLifecycleNotifier.subscribe(iApplicationLifecycleHandler);
        if (getCurrent() != null) {
            iApplicationLifecycleHandler.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, final Runnable runnable) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(runnable, "runnable");
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new Runnable() { // from class: o.vn0
            @Override // java.lang.Runnable
            public final void run() {
                ApplicationService.m68745decorViewReady$lambda1(this.f50566a, runnable, this);
            }
        });
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public Context getAppContext() {
        Context context = this._appContext;
        sq8.m48646e(context);
        return context;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public Activity getCurrent() {
        return this._current;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public AppEntryAction getEntryState() {
        return this.entryState;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!sq8.m48644c(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "p0");
        sq8.m48649h(bundle, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (sq8.m48644c(getCurrent(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = zIsChangingConfigurations;
        if (!zIsChangingConfigurations) {
            int i = this.activityReferences - 1;
            this.activityReferences = i;
            if (i <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new C115941(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(C115951.INSTANCE);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler) {
        sq8.m48649h(iActivityLifecycleHandler, "handler");
        this.activityLifecycleNotifier.unsubscribe(iActivityLifecycleHandler);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
        sq8.m48649h(iApplicationLifecycleHandler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(iApplicationLifecycleHandler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        Logging.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new ApplicationService$current$1(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void setEntryState(AppEntryAction appEntryAction) {
        sq8.m48649h(appEntryAction, "<set-?>");
        this.entryState = appEntryAction;
    }

    public final void start(Context context) {
        sq8.m48649h(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        sq8.m48647f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$start$configuration$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
                sq8.m48649h(configuration, "newConfig");
                if (this.this$0.getCurrent() != null) {
                    AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                    Activity current = this.this$0.getCurrent();
                    sq8.m48646e(current);
                    if (androidUtils.hasConfigChangeFlag(current, 128)) {
                        ApplicationService applicationService = this.this$0;
                        int i = configuration.orientation;
                        Activity current2 = applicationService.getCurrent();
                        sq8.m48646e(current2);
                        applicationService.onOrientationChanged(i, current2);
                    }
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }
        });
        boolean z = context instanceof Activity;
        boolean z2 = getCurrent() == null;
        if (!z2 || z) {
            setEntryState(AppEntryAction.APP_OPEN);
            if (z2 && z) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(AppEntryAction.APP_CLOSE);
        }
        Logging.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(n64 n64Var) {
        C115981 c115981;
        if (n64Var instanceof C115981) {
            c115981 = (C115981) n64Var;
            int i = c115981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115981.label = i - Integer.MIN_VALUE;
            } else {
                c115981 = new C115981(n64Var);
            }
        }
        Object obj = c115981.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c115981.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            Activity current = getCurrent();
            if (current == null) {
                return ml1.m39301a(false);
            }
            final Waiter waiter = new Waiter();
            decorViewReady(current, new Runnable() { // from class: o.wn0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    ApplicationService.m68746waitUntilActivityReady$lambda0(waiter);
                }
            });
            c115981.label = 1;
            if (waiter.waitForWake(c115981) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return ml1.m39301a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0091 -> B:22:0x005d). Please report as a decompilation issue!!! */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(n64 n64Var) {
        C115991 c115991;
        ApplicationService applicationService;
        Activity current;
        int i;
        ApplicationService applicationService2;
        C115991 c1159912;
        final ApplicationService applicationService3;
        ISystemConditionHandler iSystemConditionHandler;
        ISystemConditionHandler iSystemConditionHandler2;
        if (n64Var instanceof C115991) {
            c115991 = (C115991) n64Var;
            int i2 = c115991.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c115991.label = i2 - Integer.MIN_VALUE;
            } else {
                c115991 = new C115991(n64Var);
            }
        }
        Object obj = c115991.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c115991.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            applicationService = this;
            current = getCurrent();
            i = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
            if (current != null) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iSystemConditionHandler2 = (C11601x6b9b737) c115991.L$1;
                    applicationService3 = (ApplicationService) c115991.L$0;
                    wre.m54934b(obj);
                    iSystemConditionHandler = iSystemConditionHandler2;
                    applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                    return ml1.m39301a(true);
                }
                current = (Activity) c115991.L$1;
                applicationService2 = (ApplicationService) c115991.L$0;
                try {
                    wre.m54934b(obj);
                } catch (NoClassDefFoundError e) {
                    e = e;
                    Logging.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                    c1159912 = c115991;
                    applicationService3 = applicationService2;
                    final Waiter waiter = new Waiter();
                    iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                        @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                        public void systemConditionChanged() throws Exception {
                            if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(this.this$0.getCurrent()))) {
                                return;
                            }
                            waiter.wake();
                        }
                    };
                    applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                    if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    }
                    applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                    return ml1.m39301a(true);
                }
                c1159912 = c115991;
                applicationService3 = applicationService2;
                final Waiter waiter2 = new Waiter();
                iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                    @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                    public void systemConditionChanged() throws Exception {
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(this.this$0.getCurrent()))) {
                            return;
                        }
                        waiter2.wake();
                    }
                };
                applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                    c1159912.L$0 = applicationService3;
                    c1159912.L$1 = iSystemConditionHandler;
                    c1159912.label = 3;
                    if (waiter2.waitForWake(c1159912) == objM51918f) {
                        return objM51918f;
                    }
                    iSystemConditionHandler2 = iSystemConditionHandler;
                    iSystemConditionHandler = iSystemConditionHandler2;
                }
                applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                return ml1.m39301a(true);
            }
            int i4 = c115991.I$0;
            applicationService = (ApplicationService) c115991.L$0;
            wre.m54934b(obj);
            i = i4;
            current = applicationService.getCurrent();
            if (current != null) {
                try {
                } catch (NoClassDefFoundError e2) {
                    e = e2;
                    applicationService2 = applicationService;
                    Logging.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                    c1159912 = c115991;
                    applicationService3 = applicationService2;
                    final Waiter waiter22 = new Waiter();
                    iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                        @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                        public void systemConditionChanged() throws Exception {
                            if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(this.this$0.getCurrent()))) {
                                return;
                            }
                            waiter22.wake();
                        }
                    };
                    applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                    if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    }
                    applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                    return ml1.m39301a(true);
                }
                if (current instanceof AppCompatActivity) {
                    final FragmentManager supportFragmentManager = ((AppCompatActivity) current).getSupportFragmentManager();
                    sq8.m48648g(supportFragmentManager, "currentActivity.supportFragmentManager");
                    List listB0 = supportFragmentManager.B0();
                    sq8.m48648g(listB0, "manager.fragments");
                    Fragment fragment = (Fragment) kh3.s0(listB0);
                    if (fragment != null && fragment.isVisible() && (fragment instanceof DialogFragment)) {
                        final Waiter waiter3 = new Waiter();
                        supportFragmentManager.u1(new FragmentManager.AbstractC2104k() { // from class: com.onesignal.core.internal.application.impl.ApplicationService.waitUntilSystemConditionsAvailable.2
                            @Override // androidx.fragment.app.FragmentManager.AbstractC2104k
                            public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment2) throws Exception {
                                sq8.m48649h(fragmentManager, "fm");
                                sq8.m48649h(fragment2, "fragmentDetached");
                                super.onFragmentDetached(fragmentManager, fragment2);
                                if (fragment2 instanceof DialogFragment) {
                                    supportFragmentManager.P1(this);
                                    waiter3.wake();
                                }
                            }
                        }, true);
                        c115991.L$0 = applicationService;
                        c115991.L$1 = current;
                        c115991.label = 2;
                        if (waiter3.waitForWake(c115991) == objM51918f) {
                            return objM51918f;
                        }
                        applicationService2 = applicationService;
                        c1159912 = c115991;
                        applicationService3 = applicationService2;
                        final Waiter waiter222 = new Waiter();
                        iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                            @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                            public void systemConditionChanged() throws Exception {
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(this.this$0.getCurrent()))) {
                                    return;
                                }
                                waiter222.wake();
                            }
                        };
                        applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return ml1.m39301a(true);
                    }
                }
                c1159912 = c115991;
                applicationService3 = applicationService;
                final Waiter waiter2222 = new Waiter();
                iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                    @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                    public void systemConditionChanged() throws Exception {
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(this.this$0.getCurrent()))) {
                            return;
                        }
                        waiter2222.wake();
                    }
                };
                applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                }
                applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                return ml1.m39301a(true);
            }
            i4 = i + 1;
            if (i4 > 50) {
                Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                return ml1.m39301a(false);
            }
            c115991.L$0 = applicationService;
            c115991.I$0 = i4;
            c115991.label = 1;
            if (nk5.m40720b(100L, c115991) == objM51918f) {
                return objM51918f;
            }
            i = i4;
            current = applicationService.getCurrent();
            if (current != null) {
            }
        }
    }
}
