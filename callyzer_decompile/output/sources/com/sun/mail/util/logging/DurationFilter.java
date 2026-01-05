package com.sun.mail.util.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class DurationFilter implements Filter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long count;
    private final long duration;
    private long peak;
    private final long records;
    private long start;

    public DurationFilter() {
        this.records = checkRecords(initLong(".records"));
        this.duration = checkDuration(initLong(".duration"));
    }

    private synchronized boolean accept(long j6) {
        boolean z6;
        try {
            long j10 = this.count;
            z6 = false;
            if (j10 > 0) {
                if (j6 - this.peak > 0) {
                    this.peak = j6;
                }
                if (j10 != this.records) {
                    this.count = j10 + 1;
                } else {
                    long j11 = this.peak;
                    long j12 = j11 - this.start;
                    long j13 = this.duration;
                    if (j12 >= j13) {
                        this.count = 1L;
                        this.start = j11;
                    } else {
                        this.count = -1L;
                        this.start = j11 + j13;
                    }
                }
                z6 = true;
            } else if (j6 - this.start >= 0 || j10 == 0) {
                this.count = 1L;
                this.start = j6;
                this.peak = j6;
                z6 = true;
            }
        } finally {
        }
        return z6;
    }

    private static long checkDuration(long j6) {
        if (j6 > 0) {
            return j6;
        }
        return 900000L;
    }

    private static long checkRecords(long j6) {
        if (j6 > 0) {
            return j6;
        }
        return 1000L;
    }

    private long initLong(String str) {
        long durationToMillis;
        String strFromLogManager = LogManagerProperties.fromLogManager(getClass().getName().concat(str));
        if (strFromLogManager == null || strFromLogManager.length() == 0) {
            return Long.MIN_VALUE;
        }
        String strTrim = strFromLogManager.trim();
        if (isTimeEntry(str, strTrim)) {
            try {
                durationToMillis = LogManagerProperties.parseDurationToMillis(strTrim);
            } catch (RuntimeException | Exception | LinkageError unused) {
            }
        } else {
            durationToMillis = 0;
        }
        if (durationToMillis != 0) {
            return durationToMillis;
        }
        try {
            long jMultiplyExact = 1;
            for (String strSubstring : tokenizeLongs(strTrim)) {
                if (strSubstring.endsWith("L") || strSubstring.endsWith("l")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                }
                jMultiplyExact = multiplyExact(jMultiplyExact, Long.parseLong(strSubstring));
            }
            return jMultiplyExact;
        } catch (RuntimeException unused2) {
            return Long.MIN_VALUE;
        }
    }

    private boolean isTimeEntry(String str, String str2) {
        return (str2.charAt(0) == 'P' || str2.charAt(0) == 'p') && str.equals(".duration");
    }

    private static long multiplyExact(long j6, long j10) {
        long j11 = j6 * j10;
        if (((Math.abs(j6) | Math.abs(j10)) >>> 31) == 0 || ((j10 == 0 || j11 / j10 == j6) && !(j6 == Long.MIN_VALUE && j10 == -1))) {
            return j11;
        }
        throw new ArithmeticException();
    }

    private boolean test(long j6, long j10) {
        long j11;
        long j12;
        synchronized (this) {
            j11 = this.count;
            j12 = this.start;
        }
        return j11 > 0 ? j10 - j12 >= this.duration || j11 < j6 : j10 - j12 >= 0 || j11 == 0;
    }

    private static String[] tokenizeLongs(String str) {
        int iIndexOf = str.indexOf(42);
        if (iIndexOf > -1) {
            String[] strArrSplit = str.split("\\s*\\*\\s*");
            if (strArrSplit.length != 0) {
                if (iIndexOf == 0 || str.charAt(str.length() - 1) == '*') {
                    throw new NumberFormatException(str);
                }
                if (strArrSplit.length != 1) {
                    return strArrSplit;
                }
                throw new NumberFormatException(strArrSplit[0]);
            }
        }
        return new String[]{str};
    }

    public boolean equals(Object obj) {
        long j6;
        long j10;
        long j11;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DurationFilter durationFilter = (DurationFilter) obj;
        if (this.records != durationFilter.records || this.duration != durationFilter.duration) {
            return false;
        }
        synchronized (this) {
            j6 = this.count;
            j10 = this.peak;
            j11 = this.start;
        }
        synchronized (durationFilter) {
            try {
                if (j6 == durationFilter.count && j10 == durationFilter.peak && j11 == durationFilter.start) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public int hashCode() {
        long j6 = this.records;
        int i10 = (267 + ((int) (j6 ^ (j6 >>> 32)))) * 89;
        long j10 = this.duration;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean isIdle() {
        return test(0L, System.currentTimeMillis());
    }

    @Override // java.util.logging.Filter
    public boolean isLoggable(LogRecord logRecord) {
        return accept(logRecord.getMillis());
    }

    public String toString() {
        boolean zTest;
        boolean zTest2;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zTest = test(0L, jCurrentTimeMillis);
            zTest2 = test(this.records, jCurrentTimeMillis);
        }
        return getClass().getName() + "{records=" + this.records + ", duration=" + this.duration + ", idle=" + zTest + ", loggable=" + zTest2 + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DurationFilter m16689clone() {
        DurationFilter durationFilter = (DurationFilter) super.clone();
        durationFilter.count = 0L;
        durationFilter.peak = 0L;
        durationFilter.start = 0L;
        return durationFilter;
    }

    public boolean isLoggable() {
        return test(this.records, System.currentTimeMillis());
    }

    public DurationFilter(long j6, long j10) {
        this.records = checkRecords(j6);
        this.duration = checkDuration(j10);
    }
}
