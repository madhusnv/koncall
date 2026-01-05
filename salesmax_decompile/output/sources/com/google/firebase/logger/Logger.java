package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.message.TokenParser;
import p001o.f9g;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;
import p001o.szb;
import p001o.xk7;

/* loaded from: classes5.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    public static final class AndroidLogger extends Logger {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            sq8.m48649h(str, "tag");
            sq8.m48649h(level, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String str, Object[] objArr, Throwable th) {
            sq8.m48649h(level, FirebaseAnalytics.Param.LEVEL);
            sq8.m48649h(str, "format");
            sq8.m48649h(objArr, "args");
            if (!(objArr.length == 0)) {
                h8g h8gVar = h8g.f26398a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                sq8.m48648g(str, "format(format, *args)");
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, str, th) : Log.v(tag, str);
            }
            if (i == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, str, th) : Log.d(tag2, str);
            }
            if (i == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, str, th) : Log.i(tag3, str);
            }
            if (i == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, str, th) : Log.w(tag4, str);
            }
            if (i != 5) {
                throw new szb();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, str, th) : Log.e(tag5, str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        public final Logger getLogger(String str, boolean z, Level level) {
            Object objPutIfAbsent;
            sq8.m48649h(str, "tag");
            sq8.m48649h(level, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(str);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (androidLogger = new AndroidLogger(str, z, level)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            sq8.m48648g(androidLogger, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return (Logger) androidLogger;
        }

        public final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
            sq8.m48649h(str, "tag");
            sq8.m48649h(level, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(str, z, level);
            Logger.loggers.put(str, fakeLogger);
            return fakeLogger;
        }
    }

    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            sq8.m48649h(str, "tag");
            sq8.m48649h(level, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            if (!(objArr.length == 0)) {
                h8g h8gVar = h8g.f26398a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                sq8.m48648g(str, "format(format, *args)");
            }
            if (th != null) {
                String str2 = level + TokenParser.SP + str + TokenParser.SP + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + TokenParser.SP + str;
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(String str) {
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (f9g.m26306P((String) it.next(), str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean hasLogMessageThat(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "predicate");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) xk7Var.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String str, Object[] objArr, Throwable th) {
            sq8.m48649h(level, FirebaseAnalytics.Param.LEVEL);
            sq8.m48649h(str, "format");
            sq8.m48649h(objArr, "args");
            String logMessage = toLogMessage(level, str, objArr, th);
            System.out.println((Object) ("Log: " + logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i) {
            this.priority = i;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, id5 id5Var) {
        this(str, z, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public static final Logger getLogger(String str, boolean z, Level level) {
        return Companion.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled || (this.minLevel.getPriority$com_google_firebase_firebase_common() > level.getPriority$com_google_firebase_firebase_common() && !Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common()))) {
            return 0;
        }
        return log(level, str, objArr, th);
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    public static final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
        return Companion.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(String str) {
        sq8.m48649h(str, "msg");
        return debug$default(this, str, null, 2, null);
    }

    public final int error(String str) {
        sq8.m48649h(str, "msg");
        return error$default(this, str, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String str) {
        sq8.m48649h(str, "msg");
        return info$default(this, str, null, 2, null);
    }

    public abstract int log(Level level, String str, Object[] objArr, Throwable th);

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMinLevel(Level level) {
        sq8.m48649h(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(String str) {
        sq8.m48649h(str, "msg");
        return verbose$default(this, str, null, 2, null);
    }

    public final int warn(String str) {
        sq8.m48649h(str, "msg");
        return warn$default(this, str, null, 2, null);
    }

    private Logger(String str, boolean z, Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int debug(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int error(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return error$default(this, str, objArr, null, 4, null);
    }

    public final int info(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return info$default(this, str, objArr, null, 4, null);
    }

    public final int verbose(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int warn(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return warn$default(this, str, objArr, null, 4, null);
    }

    public final int debug(String str, Object[] objArr, Throwable th) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return logIfAble(Level.DEBUG, str, objArr, th);
    }

    public final int error(String str, Object[] objArr, Throwable th) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return logIfAble(Level.ERROR, str, objArr, th);
    }

    public final int info(String str, Object[] objArr, Throwable th) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return logIfAble(Level.INFO, str, objArr, th);
    }

    public final int verbose(String str, Object[] objArr, Throwable th) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return logIfAble(Level.VERBOSE, str, objArr, th);
    }

    public final int warn(String str, Object[] objArr, Throwable th) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        return logIfAble(Level.WARN, str, objArr, th);
    }

    public final int debug(String str, Throwable th) {
        sq8.m48649h(str, "msg");
        return logIfAble$default(this, Level.DEBUG, str, null, th, 4, null);
    }

    public final int error(String str, Throwable th) {
        sq8.m48649h(str, "msg");
        return logIfAble$default(this, Level.ERROR, str, null, th, 4, null);
    }

    public final int info(String str, Throwable th) {
        sq8.m48649h(str, "msg");
        return logIfAble$default(this, Level.INFO, str, null, th, 4, null);
    }

    public final int verbose(String str, Throwable th) {
        sq8.m48649h(str, "msg");
        return logIfAble$default(this, Level.VERBOSE, str, null, th, 4, null);
    }

    public final int warn(String str, Throwable th) {
        sq8.m48649h(str, "msg");
        return logIfAble$default(this, Level.WARN, str, null, th, 4, null);
    }
}
