package com.sun.mail.util;

import jakarta.mail.c0;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class MailLogger {
    private final boolean debug;
    private final Logger logger;
    private final PrintStream out;
    private final String prefix;

    public MailLogger(String str, String str2, boolean z6, PrintStream printStream) {
        this.logger = Logger.getLogger(str);
        this.prefix = str2;
        this.debug = z6;
        this.out = printStream == null ? System.out : printStream;
    }

    private void debugOut(String str) {
        if (this.prefix == null) {
            this.out.println(str);
            return;
        }
        this.out.println(this.prefix + ": " + str);
    }

    private void ifDebugOut(String str) {
        if (this.debug) {
            debugOut(str);
        }
    }

    private StackTraceElement inferCaller() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i10 = 0;
        while (i10 < stackTrace.length && !isLoggerImplFrame(stackTrace[i10].getClassName())) {
            i10++;
        }
        while (i10 < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!isLoggerImplFrame(stackTraceElement.getClassName())) {
                return stackTraceElement;
            }
            i10++;
        }
        return new StackTraceElement(MailLogger.class.getName(), "log", MailLogger.class.getName(), -1);
    }

    private boolean isLoggerImplFrame(String str) {
        return MailLogger.class.getName().equals(str);
    }

    private String packageOf(Class<?> cls) {
        Package r02 = cls.getPackage();
        if (r02 != null) {
            return r02.getName();
        }
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : "";
    }

    public void config(String str) {
        log(Level.CONFIG, str);
    }

    public void fine(String str) {
        log(Level.FINE, str);
    }

    public void finer(String str) {
        log(Level.FINER, str);
    }

    public void finest(String str) {
        log(Level.FINEST, str);
    }

    public MailLogger getLogger(String str, String str2) {
        return new MailLogger(str, str2, this.debug, this.out);
    }

    public MailLogger getSubLogger(String str, String str2) {
        return new MailLogger(this.logger.getName() + "." + str, str2, this.debug, this.out);
    }

    public boolean isLoggable(Level level) {
        return this.debug || this.logger.isLoggable(level);
    }

    public void log(Level level, String str) {
        ifDebugOut(str);
        if (this.logger.isLoggable(level)) {
            StackTraceElement stackTraceElementInferCaller = inferCaller();
            this.logger.logp(level, stackTraceElementInferCaller.getClassName(), stackTraceElementInferCaller.getMethodName(), str);
        }
    }

    public void logf(Level level, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        ifDebugOut(str2);
        this.logger.log(level, str2);
    }

    public MailLogger getLogger(Class<?> cls, String str) {
        return new MailLogger(cls, str, this.debug, this.out);
    }

    public MailLogger getSubLogger(String str, String str2, boolean z6) {
        return new MailLogger(this.logger.getName() + "." + str, str2, z6, this.out);
    }

    public void log(Level level, String str, Object obj) {
        if (this.debug) {
            str = MessageFormat.format(str, obj);
            debugOut(str);
        }
        String str2 = str;
        if (this.logger.isLoggable(level)) {
            StackTraceElement stackTraceElementInferCaller = inferCaller();
            this.logger.logp(level, stackTraceElementInferCaller.getClassName(), stackTraceElementInferCaller.getMethodName(), str2, obj);
        }
    }

    public MailLogger(Class<?> cls, String str, boolean z6, PrintStream printStream) {
        this.logger = Logger.getLogger(packageOf(cls));
        this.prefix = str;
        this.debug = z6;
        this.out = printStream == null ? System.out : printStream;
    }

    public void log(Level level, String str, Object... objArr) {
        if (this.debug) {
            str = MessageFormat.format(str, objArr);
            debugOut(str);
        }
        String str2 = str;
        if (this.logger.isLoggable(level)) {
            StackTraceElement stackTraceElementInferCaller = inferCaller();
            this.logger.logp(level, stackTraceElementInferCaller.getClassName(), stackTraceElementInferCaller.getMethodName(), str2, objArr);
        }
    }

    public MailLogger(Class<?> cls, String str, String str2, boolean z6, PrintStream printStream) {
        this.logger = Logger.getLogger(packageOf(cls) + "." + str);
        this.prefix = str2;
        this.debug = z6;
        this.out = printStream == null ? System.out : printStream;
    }

    public void log(Level level, String str, Throwable th2) {
        if (this.debug) {
            if (th2 != null) {
                debugOut(AbstractC1452a.m4561h(str, ", THROW: "));
                th2.printStackTrace(this.out);
            } else {
                debugOut(str);
            }
        }
        if (this.logger.isLoggable(level)) {
            StackTraceElement stackTraceElementInferCaller = inferCaller();
            this.logger.logp(level, stackTraceElementInferCaller.getClassName(), stackTraceElementInferCaller.getMethodName(), str, th2);
        }
    }

    @Deprecated
    public MailLogger(String str, String str2, c0 c0Var) {
        this(str, str2, c0Var.m8181b(), c0Var.m8182c());
    }

    @Deprecated
    public MailLogger(Class<?> cls, String str, c0 c0Var) {
        this(cls, str, c0Var.m8181b(), c0Var.m8182c());
    }
}
