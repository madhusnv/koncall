package p020v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import c0.C0812e;
import c9.C0917l;
import d7.v0;
import i0.o0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import og.u1;
import og.y0;
import qc.C6179y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.u */
/* loaded from: classes.dex */
public final class C7611u extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final ExecutorC3900j f36697a;

    /* renamed from: b */
    public final ScheduledExecutorServiceC3894d f36698b;

    /* renamed from: c */
    public v0 f36699c;

    /* renamed from: d */
    public ScheduledFuture f36700d;

    /* renamed from: e */
    public final C6179y f36701e;

    /* renamed from: f */
    public final /* synthetic */ C7612v f36702f;

    public C7611u(C7612v c7612v, ExecutorC3900j executorC3900j, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d, long j6) {
        this.f36702f = c7612v;
        this.f36697a = executorC3900j;
        this.f36698b = scheduledExecutorServiceC3894d;
        this.f36701e = new C6179y(this, j6);
    }

    /* renamed from: a */
    public final boolean m14430a() {
        if (this.f36700d == null) {
            return false;
        }
        this.f36702f.m14455w("Cancelling scheduled re-open: " + this.f36699c);
        this.f36699c.f8143b = true;
        this.f36699c = null;
        this.f36700d.cancel(false);
        this.f36700d = null;
        return true;
    }

    /* renamed from: b */
    public final void m14431b() {
        y0.m11056f(null, this.f36699c == null);
        y0.m11056f(null, this.f36700d == null);
        C6179y c6179y = this.f36701e;
        c6179y.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c6179y.f30136b == -1) {
            c6179y.f30136b = jUptimeMillis;
        }
        long j6 = jUptimeMillis - c6179y.f30136b;
        long jM12207b = c6179y.m12207b();
        C7612v c7612v = this.f36702f;
        if (j6 >= jM12207b) {
            c6179y.f30136b = -1L;
            c6179y.m12207b();
            u1.m10943b("Camera2CameraImpl");
            c7612v.m14443H(EnumC7610t.PENDING_OPEN, null, false);
            return;
        }
        this.f36699c = new v0(this, this.f36697a);
        c7612v.m14455w("Attempting camera re-open in " + c6179y.m12206a() + "ms: " + this.f36699c + " activeResuming = " + c7612v.f36714M);
        this.f36700d = this.f36698b.schedule(this.f36699c, (long) c6179y.m12206a(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final boolean m14432c() {
        C7612v c7612v = this.f36702f;
        if (!c7612v.f36714M) {
            return false;
        }
        int i10 = c7612v.f36730m;
        return i10 == 1 || i10 == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) throws CameraAccessException {
        this.f36702f.m14455w("CameraDevice.onClosed()");
        y0.m11056f("Unexpected onClose callback on camera device: " + cameraDevice, this.f36702f.f36729l == null);
        int iOrdinal = this.f36702f.f36723e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            y0.m11056f(null, this.f36702f.f36735s.isEmpty());
            this.f36702f.m14453u();
            return;
        }
        if (iOrdinal != 6 && iOrdinal != 7) {
            throw new IllegalStateException("Camera closed while in state: " + this.f36702f.f36723e);
        }
        C7612v c7612v = this.f36702f;
        int i10 = c7612v.f36730m;
        if (i10 == 0) {
            c7612v.m14447L(false);
        } else {
            c7612v.m14455w("Camera closed due to error: ".concat(C7612v.m14435y(i10)));
            m14431b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f36702f.m14455w("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        C7612v c7612v = this.f36702f;
        c7612v.f36729l = cameraDevice;
        c7612v.f36730m = i10;
        C0917l c0917l = c7612v.f36718V;
        ((C7612v) c0917l.f5595c).m14455w("Camera receive onErrorCallback");
        c0917l.m2640d();
        int iOrdinal = this.f36702f.f36723e.ordinal();
        if (iOrdinal != 1) {
            switch (iOrdinal) {
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    cameraDevice.getId();
                    this.f36702f.f36723e.name();
                    u1.m10942a("Camera2CameraImpl");
                    y0.m11056f("Attempt to handle open error from non open state: " + this.f36702f.f36723e, this.f36702f.f36723e == EnumC7610t.OPENING || this.f36702f.f36723e == EnumC7610t.OPENED || this.f36702f.f36723e == EnumC7610t.CONFIGURED || this.f36702f.f36723e == EnumC7610t.REOPENING || this.f36702f.f36723e == EnumC7610t.REOPENING_QUIRK);
                    int i11 = 3;
                    if (i10 != 1 && i10 != 2 && i10 != 4) {
                        cameraDevice.getId();
                        u1.m10943b("Camera2CameraImpl");
                        this.f36702f.m14443H(EnumC7610t.CLOSING, new C0812e(null, i10 == 3 ? 5 : 6), true);
                        this.f36702f.m14452t();
                        return;
                    }
                    cameraDevice.getId();
                    u1.m10942a("Camera2CameraImpl");
                    C7612v c7612v2 = this.f36702f;
                    y0.m11056f("Can only reopen camera device after error if the camera device is actually in an error state.", c7612v2.f36730m != 0);
                    if (i10 == 1) {
                        i11 = 2;
                    } else if (i10 == 2) {
                        i11 = 1;
                    }
                    c7612v2.m14443H(EnumC7610t.REOPENING, new C0812e(null, i11), true);
                    c7612v2.m14452t();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + this.f36702f.f36723e);
            }
        }
        cameraDevice.getId();
        this.f36702f.f36723e.name();
        u1.m10943b("Camera2CameraImpl");
        this.f36702f.m14452t();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f36702f.m14455w("CameraDevice.onOpened()");
        C7612v c7612v = this.f36702f;
        c7612v.f36729l = cameraDevice;
        c7612v.f36730m = 0;
        this.f36701e.f30136b = -1L;
        int iOrdinal = c7612v.f36723e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            y0.m11056f(null, this.f36702f.f36735s.isEmpty());
            this.f36702f.f36729l.close();
            this.f36702f.f36729l = null;
        } else {
            if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                throw new IllegalStateException("onOpened() should not be possible from state: " + this.f36702f.f36723e);
            }
            this.f36702f.m14442G(EnumC7610t.OPENED);
            o0 o0Var = this.f36702f.f36739x;
            String id2 = cameraDevice.getId();
            C7612v c7612v2 = this.f36702f;
            if (o0Var.m7398e(id2, c7612v2.f36738w.m5c(c7612v2.f36729l.getId()))) {
                this.f36702f.m14440E();
            }
        }
    }
}
