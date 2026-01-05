package com.onesignal.debug.internal.logging;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.LogLevel;
import java.io.PrintWriter;
import java.io.StringWriter;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.x8g;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class Logging {
    private static final String TAG = "OneSignal";
    private static IApplicationService applicationService;
    public static final Logging INSTANCE = new Logging();
    private static LogLevel logLevel = LogLevel.WARN;
    private static LogLevel visualLogLevel = LogLevel.NONE;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            iArr[LogLevel.VERBOSE.ordinal()] = 1;
            iArr[LogLevel.DEBUG.ordinal()] = 2;
            iArr[LogLevel.INFO.ordinal()] = 3;
            iArr[LogLevel.WARN.ordinal()] = 4;
            iArr[LogLevel.ERROR.ordinal()] = 5;
            iArr[LogLevel.FATAL.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.debug.internal.logging.Logging$log$1", m36648f = "Logging.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.debug.internal.logging.Logging$log$1 */
    public static final class C116291 extends jgg implements xk7 {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ LogLevel $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116291(LogLevel logLevel, String str, n64 n64Var) {
            super(1, n64Var);
            this.$level = logLevel;
            this.$finalFullMessage = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116291(this.$level, this.$finalFullMessage, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            IApplicationService applicationService = Logging.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116291) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    private Logging() {
    }

    public static final boolean atLogLevel(LogLevel logLevel2) {
        sq8.m48649h(logLevel2, FirebaseAnalytics.Param.LEVEL);
        return logLevel2.compareTo(visualLogLevel) < 1 || logLevel2.compareTo(logLevel) < 1;
    }

    public static final void debug(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.DEBUG, str, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.ERROR, str, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.FATAL, str, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final LogLevel getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final LogLevel getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.INFO, str, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(LogLevel logLevel2, String str) {
        sq8.m48649h(logLevel2, FirebaseAnalytics.Param.LEVEL);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(logLevel2, str, null);
    }

    public static final void setLogLevel(LogLevel logLevel2) {
        sq8.m48649h(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }

    public static final void setVisualLogLevel(LogLevel logLevel2) {
        sq8.m48649h(logLevel2, "<set-?>");
        visualLogLevel = logLevel2;
    }

    public static final void verbose(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.VERBOSE, str, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        log(LogLevel.WARN, str, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final IApplicationService getApplicationService() {
        return applicationService;
    }

    public final void setApplicationService(IApplicationService iApplicationService) {
        applicationService = iApplicationService;
    }

    public static final void log(LogLevel logLevel2, String str, Throwable th) {
        sq8.m48649h(logLevel2, FirebaseAnalytics.Param.LEVEL);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        if (logLevel2.compareTo(logLevel) < 1) {
            int i = WhenMappings.$EnumSwitchMapping$0[logLevel2.ordinal()];
        }
        if (logLevel2.compareTo(visualLogLevel) < 1) {
            IApplicationService iApplicationService = applicationService;
            if ((iApplicationService != null ? iApplicationService.getCurrent() : null) != null) {
                try {
                    String strM55850f = x8g.m55850f(str + '\n');
                    if (th != null) {
                        String str2 = strM55850f + th.getMessage();
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter(stringWriter));
                        strM55850f = str2 + stringWriter;
                    }
                    ThreadUtilsKt.suspendifyOnMain(new C116291(logLevel2, strM55850f, null));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
