package com.sun.mail.util.logging;

import java.io.Serializable;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SeverityComparator implements Comparator<LogRecord>, Serializable {
    private static final Comparator<LogRecord> INSTANCE = new SeverityComparator();
    private static final long serialVersionUID = -2620442245251791965L;

    private int compare(long j6, long j10) {
        if (j6 < j10) {
            return -1;
        }
        return j6 > j10 ? 1 : 0;
    }

    public static SeverityComparator getInstance() {
        return (SeverityComparator) INSTANCE;
    }

    private static String toString(Object obj, Object obj2) {
        return obj + ", " + obj2;
    }

    public Throwable apply(Throwable th2) {
        Throwable th3 = null;
        Throwable th4 = null;
        int i10 = 0;
        Throwable th5 = th2;
        while (true) {
            if (th2 == null) {
                th2 = th5;
                break;
            }
            if (isNormal(th2)) {
                th3 = th2;
            }
            if (th3 == null && (th2 instanceof Error)) {
                th4 = th2;
            }
            i10++;
            if (i10 == 65536) {
                break;
            }
            th5 = th2;
            th2 = th2.getCause();
        }
        return th4 != null ? th4 : th3 != null ? th3 : th2;
    }

    public final int applyThenCompare(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return 0;
        }
        return compareThrowable(apply(th2), apply(th3));
    }

    public int compareThrowable(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return 0;
        }
        if (th2 == null) {
            return isNormal(th3) ? 1 : -1;
        }
        if (th3 == null) {
            return isNormal(th2) ? -1 : 1;
        }
        if (th2.getClass() == th3.getClass()) {
            return 0;
        }
        if (isNormal(th2)) {
            return isNormal(th3) ? 0 : -1;
        }
        if (isNormal(th3)) {
            return 1;
        }
        if (th2 instanceof Error) {
            return th3 instanceof Error ? 0 : 1;
        }
        if (!(th2 instanceof RuntimeException)) {
            return ((th3 instanceof Error) || (th3 instanceof RuntimeException)) ? -1 : 0;
        }
        if (th3 instanceof Error) {
            return -1;
        }
        return th3 instanceof RuntimeException ? 0 : 1;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass();
    }

    public int hashCode() {
        return getClass().hashCode() * 31;
    }

    public boolean isNormal(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        for (Class<?> superclass = th2.getClass(); superclass != Throwable.class; superclass = superclass.getSuperclass()) {
            if (Error.class.isAssignableFrom(superclass)) {
                if (superclass.getName().equals("java.lang.ThreadDeath")) {
                    return true;
                }
            } else if (superclass.getName().contains("Interrupt")) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Comparator
    public int compare(LogRecord logRecord, LogRecord logRecord2) {
        if (logRecord == null || logRecord2 == null) {
            throw new NullPointerException(toString(logRecord, logRecord2));
        }
        if (logRecord == logRecord2) {
            return 0;
        }
        int iCompare = compare(logRecord.getLevel(), logRecord2.getLevel());
        return (iCompare == 0 && (iCompare = applyThenCompare(logRecord.getThrown(), logRecord2.getThrown())) == 0 && (iCompare = compare(logRecord.getSequenceNumber(), logRecord2.getSequenceNumber())) == 0) ? compare(logRecord.getMillis(), logRecord2.getMillis()) : iCompare;
    }

    private int compare(Level level, Level level2) {
        if (level == level2) {
            return 0;
        }
        return compare(level.intValue(), level2.intValue());
    }
}
