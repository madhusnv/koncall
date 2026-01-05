package pf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.a */
/* loaded from: classes.dex */
public final class ServiceConnectionC5901a implements ServiceConnection {

    /* renamed from: a */
    public boolean f28732a = false;

    /* renamed from: b */
    public final LinkedBlockingQueue f28733b = new LinkedBlockingQueue();

    /* renamed from: a */
    public final IBinder m11506a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC6840z.m13035f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f28732a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f28732a = true;
        IBinder iBinder = (IBinder) this.f28733b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f28733b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
