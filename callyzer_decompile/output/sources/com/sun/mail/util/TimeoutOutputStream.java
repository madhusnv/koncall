package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
class TimeoutOutputStream extends OutputStream {

    /* renamed from: b1, reason: collision with root package name */
    private byte[] f43935b1;

    /* renamed from: os, reason: collision with root package name */
    private final OutputStream f43936os;
    private final ScheduledExecutorService ses;
    private final int timeout;
    private final Callable<Object> timeoutTask = new Callable<Object>() { // from class: com.sun.mail.util.TimeoutOutputStream.1
        @Override // java.util.concurrent.Callable
        public Object call() throws IOException {
            TimeoutOutputStream.this.f43936os.close();
            return null;
        }
    };

    public TimeoutOutputStream(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, int i10) {
        this.f43936os = outputStream;
        this.ses = scheduledExecutorService;
        this.timeout = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43936os.close();
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            if (this.f43935b1 == null) {
                this.f43935b1 = new byte[1];
            }
            byte[] bArr = this.f43935b1;
            bArr[0] = (byte) i10;
            write(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0) {
            if (i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
                if (i11 == 0) {
                    return;
                }
                ScheduledFuture scheduledFutureSchedule = null;
                try {
                    try {
                        int i13 = this.timeout;
                        if (i13 > 0) {
                            scheduledFutureSchedule = this.ses.schedule(this.timeoutTask, i13, TimeUnit.MILLISECONDS);
                        }
                    } finally {
                        if (scheduledFutureSchedule != null) {
                            scheduledFutureSchedule.cancel(true);
                        }
                    }
                } catch (RejectedExecutionException unused) {
                }
                this.f43936os.write(bArr, i10, i11);
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
