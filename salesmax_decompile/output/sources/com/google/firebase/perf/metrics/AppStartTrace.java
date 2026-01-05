package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    private static final int CORE_POOL_SIZE = 0;
    private static final long MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1);
    private static final int MAX_POOL_SIZE = 1;
    private static ExecutorService executorService;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private WeakReference<Activity> launchActivity;
    private PerfSession startSession;
    private final TransportManager transportManager;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isTooLateToInitUI = false;
    private Timer appStartTime = null;
    private Timer onCreateTime = null;
    private Timer onStartTime = null;
    private Timer onResumeTime = null;
    private Timer firstDrawDone = null;
    private boolean isStartedFromBackground = false;

    public static class StartFromBackgroundRunnable implements Runnable {
        private final AppStartTrace trace;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.trace = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.trace.onCreateTime == null) {
                this.trace.isStartedFromBackground = true;
            }
        }
    }

    public AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ExecutorService executorService2) {
        this.transportManager = transportManager;
        this.clock = clock;
        this.configResolver = configResolver;
        executorService = executorService2;
    }

    public static AppStartTrace getInstance() {
        return instance != null ? instance : getInstance(TransportManager.getInstance(), new Clock());
    }

    private static Timer getStartTimer() {
        return Timer.ofElapsedRealtime(Process.getStartElapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordFirstDrawDone$0() {
        logColdStart(getStartTimer(), this.firstDrawDone, this.startSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAppStartTrace() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(Constants.TraceNames.APP_START_TRACE_NAME.toString()).setClientStartTimeUs(getappStartTime().getMicros()).setDurationUs(getappStartTime().getDurationMicros(this.onResumeTime));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((TraceMetric) TraceMetric.newBuilder().setName(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).setClientStartTimeUs(getappStartTime().getMicros()).setDurationUs(getappStartTime().getDurationMicros(this.onCreateTime)).build());
        TraceMetric.Builder builderNewBuilder = TraceMetric.newBuilder();
        builderNewBuilder.setName(Constants.TraceNames.ON_START_TRACE_NAME.toString()).setClientStartTimeUs(this.onCreateTime.getMicros()).setDurationUs(this.onCreateTime.getDurationMicros(this.onStartTime));
        arrayList.add((TraceMetric) builderNewBuilder.build());
        TraceMetric.Builder builderNewBuilder2 = TraceMetric.newBuilder();
        builderNewBuilder2.setName(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).setClientStartTimeUs(this.onStartTime.getMicros()).setDurationUs(this.onStartTime.getDurationMicros(this.onResumeTime));
        arrayList.add((TraceMetric) builderNewBuilder2.build());
        durationUs.addAllSubtraces(arrayList).addPerfSessions(this.startSession.build());
        this.transportManager.log((TraceMetric) durationUs.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    private void logColdStart(Timer timer, Timer timer2, PerfSession perfSession) {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName("_experiment_app_start_ttid").setClientStartTimeUs(timer.getMicros()).setDurationUs(timer.getDurationMicros(timer2));
        durationUs.addSubtraces(TraceMetric.newBuilder().setName("_experiment_classLoadTime").setClientStartTimeUs(FirebasePerfProvider.getAppStartTime().getMicros()).setDurationUs(FirebasePerfProvider.getAppStartTime().getDurationMicros(timer2))).addPerfSessions(this.startSession.build());
        this.transportManager.log((TraceMetric) durationUs.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordFirstDrawDone() {
        if (this.firstDrawDone != null) {
            return;
        }
        this.firstDrawDone = this.clock.getTime();
        executorService.execute(new Runnable() { // from class: o.rm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f43787a.lambda$recordFirstDrawDone$0();
            }
        });
        if (this.isRegisteredForLifecycleCallbacks) {
            unregisterActivityLifecycleCallbacks();
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @VisibleForTesting
    public Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    @VisibleForTesting
    public Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    @VisibleForTesting
    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    @VisibleForTesting
    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    @VisibleForTesting
    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    @VisibleForTesting
    public Timer getappStartTime() {
        return this.appStartTime;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.isStartedFromBackground && this.onCreateTime == null) {
            this.launchActivity = new WeakReference<>(activity);
            this.onCreateTime = this.clock.getTime();
            if (FirebasePerfProvider.getAppStartTime().getDurationMicros(this.onCreateTime) > MAX_LATENCY_BEFORE_UI_INIT) {
                this.isTooLateToInitUI = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.isStartedFromBackground && !this.isTooLateToInitUI) {
            boolean isExperimentTTIDEnabled = this.configResolver.getIsExperimentTTIDEnabled();
            if (isExperimentTTIDEnabled) {
                FirstDrawDoneListener.registerForNextDraw(activity.findViewById(R.id.content), new Runnable() { // from class: o.pm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40249a.recordFirstDrawDone();
                    }
                });
            }
            if (this.onResumeTime != null) {
                return;
            }
            this.appStartActivity = new WeakReference<>(activity);
            this.onResumeTime = this.clock.getTime();
            this.appStartTime = FirebasePerfProvider.getAppStartTime();
            this.startSession = SessionManager.getInstance().perfSession();
            AndroidLogger.getInstance().debug("onResume(): " + activity.getClass().getName() + ": " + this.appStartTime.getDurationMicros(this.onResumeTime) + " microseconds");
            executorService.execute(new Runnable() { // from class: o.qm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42131a.logAppStartTrace();
                }
            });
            if (!isExperimentTTIDEnabled && this.isRegisteredForLifecycleCallbacks) {
                unregisterActivityLifecycleCallbacks();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.isStartedFromBackground && this.onStartTime == null && !this.isTooLateToInitUI) {
            this.onStartTime = this.clock.getTime();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        if (this.isRegisteredForLifecycleCallbacks) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = true;
            this.appContext = applicationContext;
        }
    }

    @VisibleForTesting
    public void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    public static AppStartTrace getInstance(TransportManager transportManager, Clock clock) {
        if (instance == null) {
            synchronized (AppStartTrace.class) {
                if (instance == null) {
                    instance = new AppStartTrace(transportManager, clock, ConfigResolver.getInstance(), new ThreadPoolExecutor(0, 1, MAX_LATENCY_BEFORE_UI_INIT + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return instance;
    }
}
