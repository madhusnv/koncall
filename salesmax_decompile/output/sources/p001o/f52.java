package p001o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.work.PeriodicWorkRequest;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.b9i;
import p001o.bhf;
import p001o.cd2;
import p001o.d9i;
import p001o.g32;
import p001o.jeb;
import p001o.pa2;
import p001o.ta2;
import p001o.ugg;
import p001o.v92;
import p001o.yj5;
import p001o.z82;

/* loaded from: classes2.dex */
public final class f52 implements v92 {

    /* renamed from: H */
    public ce2 f22693H;

    /* renamed from: L */
    public final AtomicInteger f22694L;

    /* renamed from: M */
    public g32.C13614a f22695M;

    /* renamed from: Q */
    public final Map f22696Q;

    /* renamed from: X */
    public int f22697X;

    /* renamed from: Y */
    public final C13333e f22698Y;

    /* renamed from: Z */
    public final C13334f f22699Z;

    /* renamed from: a */
    public final b9i f22700a;

    /* renamed from: b */
    public final z92 f22701b;

    /* renamed from: c */
    public final Executor f22702c;

    /* renamed from: d */
    public final ScheduledExecutorService f22703d;

    /* renamed from: e */
    public volatile EnumC13337i f22704e = EnumC13337i.INITIALIZED;

    /* renamed from: f */
    public final nga f22705f;

    /* renamed from: g */
    public final qa2 f22706g;

    /* renamed from: h */
    public final m42 f22707h;
    public final b92 h0;
    public final ta2 i0;
    public final boolean j0;
    public final boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public jeb o0;
    public final fe2 p0;

    /* renamed from: q */
    public final C13338j f22708q;
    public final ugg.C17376b q0;
    public final Set r0;

    /* renamed from: s */
    public final m52 f22709s;
    public u82 s0;
    public final Object t0;
    public boolean u0;
    public final qu5 v0;
    public final s82 w0;

    /* renamed from: x */
    public CameraDevice f22710x;
    public final f26 x0;

    /* renamed from: y */
    public int f22711y;
    public final ueg y0;
    public final C13336h z0;

    /* renamed from: o.f52$a */
    public class C13329a implements q32 {
        public C13329a() {
        }

        @Override // p001o.q32
        /* renamed from: a */
        public CamcorderProfile mo18210a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p001o.q32
        /* renamed from: b */
        public boolean mo18211b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    /* renamed from: o.f52$b */
    public class C13330b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f22713a;

        public C13330b(g32.C13614a c13614a) {
            this.f22713a = c13614a;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            f52.this.m26109T("openCameraConfigAndClose camera closed");
            this.f22713a.m28005c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            f52.this.m26109T("openCameraConfigAndClose camera disconnected");
            this.f22713a.m28005c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            f52.this.m26109T("openCameraConfigAndClose camera error " + i);
            this.f22713a.m28005c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            f52.this.m26109T("openCameraConfigAndClose camera opened");
            zfa zfaVarM26106Q = f52.this.m26106Q(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            zfaVarM26106Q.addListener(new Runnable() { // from class: o.g52
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, f52.this.f22702c);
        }
    }

    /* renamed from: o.f52$c */
    public class C13331c implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ ce2 f22715a;

        public C13331c(ce2 ce2Var) {
            this.f22715a = ce2Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            f52.this.f22696Q.remove(this.f22715a);
            int iOrdinal = f52.this.f22704e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 4) {
                if (iOrdinal != 5 && (iOrdinal != 6 || f52.this.f22711y == 0)) {
                    return;
                } else {
                    f52.this.m26109T("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (f52.this.d0()) {
                f52 f52Var = f52.this;
                if (f52Var.f22710x != null) {
                    f52Var.m26109T("closing camera");
                    bi0.m19089a(f52.this.f22710x);
                    f52.this.f22710x = null;
                }
            }
        }
    }

    /* renamed from: o.f52$d */
    public class C13332d implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ ce2 f22717a;

        public C13332d(ce2 ce2Var) {
            this.f22717a = ce2Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (th instanceof yj5.C18418a) {
                bhf bhfVarM26111V = f52.this.m26111V(((yj5.C18418a) th).m57878a());
                if (bhfVarM26111V != null) {
                    f52.this.B0(bhfVarM26111V);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                f52.this.m26109T("Unable to configure camera cancelled");
                return;
            }
            EnumC13337i enumC13337i = f52.this.f22704e;
            EnumC13337i enumC13337i2 = EnumC13337i.OPENED;
            if (enumC13337i == enumC13337i2) {
                f52.this.H0(enumC13337i2, pa2.AbstractC16043a.m43264b(4, th));
            }
            wja.m54630d("Camera2CameraImpl", "Unable to configure camera " + f52.this, th);
            f52 f52Var = f52.this;
            if (f52Var.f22693H == this.f22717a) {
                f52Var.E0(false);
            }
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (f52.this.h0.mo18287c() == 2 && f52.this.f22704e == EnumC13337i.OPENED) {
                f52.this.G0(EnumC13337i.CONFIGURED);
            }
        }
    }

    /* renamed from: o.f52$e */
    public final class C13333e extends CameraManager.AvailabilityCallback implements ta2.InterfaceC17039c {

        /* renamed from: a */
        public final String f22719a;

        /* renamed from: b */
        public boolean f22720b = true;

        public C13333e(String str) {
            this.f22719a = str;
        }

        @Override // p001o.ta2.InterfaceC17039c
        /* renamed from: a */
        public void mo26129a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (f52.this.f22704e == EnumC13337i.PENDING_OPEN) {
                f52.this.P0(false);
            }
        }

        /* renamed from: b */
        public boolean m26130b() {
            return this.f22720b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f22719a.equals(str)) {
                this.f22720b = true;
                if (f52.this.f22704e == EnumC13337i.PENDING_OPEN) {
                    f52.this.P0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f22719a.equals(str)) {
                this.f22720b = false;
            }
        }
    }

    /* renamed from: o.f52$f */
    public final class C13334f implements ta2.InterfaceC17038b {
        public C13334f() {
        }

        @Override // p001o.ta2.InterfaceC17038b
        /* renamed from: a */
        public void mo26131a() {
            if (f52.this.f22704e == EnumC13337i.OPENED) {
                f52.this.z0();
            }
        }
    }

    /* renamed from: o.f52$g */
    public final class C13335g implements z82.InterfaceC18577d {
        public C13335g() {
        }

        @Override // p001o.z82.InterfaceC18577d
        /* renamed from: a */
        public void mo26132a() {
            f52.this.Q0();
        }

        @Override // p001o.z82.InterfaceC18577d
        /* renamed from: b */
        public void mo26133b(List list) {
            f52.this.J0((List) fgd.m26663g(list));
        }
    }

    /* renamed from: o.f52$i */
    public enum EnumC13337i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* renamed from: o.f52$j */
    public final class C13338j extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final Executor f22729a;

        /* renamed from: b */
        public final ScheduledExecutorService f22730b;

        /* renamed from: c */
        public b f22731c;

        /* renamed from: d */
        public ScheduledFuture f22732d;

        /* renamed from: e */
        public final a f22733e;

        /* renamed from: o.f52$j$a */
        public class a {

            /* renamed from: a */
            public final long f22735a;

            /* renamed from: b */
            public long f22736b = -1;

            public a(long j) {
                this.f22735a = j;
            }

            /* renamed from: a */
            public boolean m26150a() {
                if (!(m26151b() >= ((long) m26153d()))) {
                    return true;
                }
                m26154e();
                return false;
            }

            /* renamed from: b */
            public long m26151b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f22736b == -1) {
                    this.f22736b = jUptimeMillis;
                }
                return jUptimeMillis - this.f22736b;
            }

            /* renamed from: c */
            public int m26152c() {
                if (!C13338j.this.m26149f()) {
                    return Constants.FROZEN_FRAME_TIME;
                }
                long jM26151b = m26151b();
                if (jM26151b <= 120000) {
                    return 1000;
                }
                return jM26151b <= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS ? 2000 : 4000;
            }

            /* renamed from: d */
            public int m26153d() {
                if (!C13338j.this.m26149f()) {
                    long j = this.f22735a;
                    return j > 0 ? Math.min((int) j, TransferRecord.MAXIMUM_UPLOAD_PARTS) : TransferRecord.MAXIMUM_UPLOAD_PARTS;
                }
                long j2 = this.f22735a;
                if (j2 > 0) {
                    return Math.min((int) j2, 1800000);
                }
                return 1800000;
            }

            /* renamed from: e */
            public void m26154e() {
                this.f22736b = -1L;
            }
        }

        /* renamed from: o.f52$j$b */
        public class b implements Runnable {

            /* renamed from: a */
            public Executor f22738a;

            /* renamed from: b */
            public boolean f22739b = false;

            public b(Executor executor) {
                this.f22738a = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m26156c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (this.f22739b) {
                    return;
                }
                fgd.m26665i(f52.this.f22704e == EnumC13337i.REOPENING || f52.this.f22704e == EnumC13337i.REOPENING_QUIRK);
                if (C13338j.this.m26149f()) {
                    f52.this.O0(true);
                } else {
                    f52.this.P0(true);
                }
            }

            /* renamed from: b */
            public void m26157b() {
                this.f22739b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22738a.execute(new Runnable() { // from class: o.j52
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        this.f29794a.m26156c();
                    }
                });
            }
        }

        public C13338j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
            this.f22729a = executor;
            this.f22730b = scheduledExecutorService;
            this.f22733e = new a(j);
        }

        /* renamed from: a */
        public boolean m26144a() {
            if (this.f22732d == null) {
                return false;
            }
            f52.this.m26109T("Cancelling scheduled re-open: " + this.f22731c);
            this.f22731c.m26157b();
            this.f22731c = null;
            this.f22732d.cancel(false);
            this.f22732d = null;
            return true;
        }

        /* renamed from: b */
        public final void m26145b(CameraDevice cameraDevice, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            fgd.m26666j(f52.this.f22704e == EnumC13337i.OPENING || f52.this.f22704e == EnumC13337i.OPENED || f52.this.f22704e == EnumC13337i.CONFIGURED || f52.this.f22704e == EnumC13337i.REOPENING || f52.this.f22704e == EnumC13337i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + f52.this.f22704e);
            if (i == 1 || i == 2 || i == 4) {
                wja.m54627a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), f52.m26090Z(i)));
                m26146c(i);
                return;
            }
            wja.m54629c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + f52.m26090Z(i) + " closing camera.");
            f52.this.H0(EnumC13337i.CLOSING, pa2.AbstractC16043a.m43263a(i == 3 ? 5 : 6));
            f52.this.m26104O(false);
        }

        /* renamed from: c */
        public final void m26146c(int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i2 = 1;
            fgd.m26666j(f52.this.f22711y != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            f52.this.H0(EnumC13337i.REOPENING, pa2.AbstractC16043a.m43263a(i2));
            f52.this.m26104O(false);
        }

        /* renamed from: d */
        public void m26147d() {
            this.f22733e.m26154e();
        }

        /* renamed from: e */
        public void m26148e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            fgd.m26665i(this.f22731c == null);
            fgd.m26665i(this.f22732d == null);
            if (!this.f22733e.m26150a()) {
                wja.m54629c("Camera2CameraImpl", "Camera reopening attempted for " + this.f22733e.m26153d() + "ms without success.");
                f52.this.I0(EnumC13337i.PENDING_OPEN, null, false);
                return;
            }
            this.f22731c = new b(this.f22729a);
            f52.this.m26109T("Attempting camera re-open in " + this.f22733e.m26152c() + "ms: " + this.f22731c + " activeResuming = " + f52.this.u0);
            this.f22732d = this.f22730b.schedule(this.f22731c, (long) this.f22733e.m26152c(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: f */
        public boolean m26149f() {
            int i;
            f52 f52Var = f52.this;
            return f52Var.u0 && ((i = f52Var.f22711y) == 1 || i == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            f52.this.m26109T("CameraDevice.onClosed()");
            fgd.m26666j(f52.this.f22710x == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = f52.this.f22704e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                fgd.m26665i(f52.this.d0());
                f52.this.m26107R();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + f52.this.f22704e);
            }
            f52 f52Var = f52.this;
            if (f52Var.f22711y == 0) {
                f52Var.P0(false);
                return;
            }
            f52Var.m26109T("Camera closed due to error: " + f52.m26090Z(f52.this.f22711y));
            m26148e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            f52.this.m26109T("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            f52 f52Var = f52.this;
            f52Var.f22710x = cameraDevice;
            f52Var.f22711y = i;
            f52Var.z0.m26135b();
            int iOrdinal = f52.this.f22704e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        wja.m54627a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), f52.m26090Z(i), f52.this.f22704e.name()));
                        m26145b(cameraDevice, i);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + f52.this.f22704e);
                }
            }
            wja.m54629c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), f52.m26090Z(i), f52.this.f22704e.name()));
            f52.this.m26104O(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            f52.this.m26109T("CameraDevice.onOpened()");
            f52 f52Var = f52.this;
            f52Var.f22710x = cameraDevice;
            f52Var.f22711y = 0;
            m26147d();
            int iOrdinal = f52.this.f22704e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                fgd.m26665i(f52.this.d0());
                f52.this.f22710x.close();
                f52.this.f22710x = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + f52.this.f22704e);
                }
                f52.this.G0(EnumC13337i.OPENED);
                ta2 ta2Var = f52.this.i0;
                String id = cameraDevice.getId();
                f52 f52Var2 = f52.this;
                if (ta2Var.m49604j(id, f52Var2.h0.mo18286b(f52Var2.f22710x.getId()))) {
                    f52.this.z0();
                }
            }
        }
    }

    /* renamed from: o.f52$k */
    public static abstract class AbstractC13339k {
        /* renamed from: a */
        public static AbstractC13339k m26158a(String str, Class cls, bhf bhfVar, c9i c9iVar, Size size, k7g k7gVar, List list) {
            return new z31(str, cls, bhfVar, c9iVar, size, k7gVar, list);
        }

        /* renamed from: b */
        public static AbstractC13339k m26159b(w8i w8iVar, boolean z) {
            return m26158a(f52.b0(w8iVar), w8iVar.getClass(), z ? w8iVar.m54102v() : w8iVar.m54100t(), w8iVar.m54090i(), w8iVar.m54086e(), w8iVar.m54085d(), f52.m26089Y(w8iVar));
        }

        /* renamed from: c */
        public abstract List mo26160c();

        /* renamed from: d */
        public abstract bhf mo26161d();

        /* renamed from: e */
        public abstract k7g mo26162e();

        /* renamed from: f */
        public abstract Size mo26163f();

        /* renamed from: g */
        public abstract c9i mo26164g();

        /* renamed from: h */
        public abstract String mo26165h();

        /* renamed from: i */
        public abstract Class mo26166i();
    }

    public f52(Context context, z92 z92Var, String str, m52 m52Var, b92 b92Var, ta2 ta2Var, Executor executor, Handler handler, qu5 qu5Var, long j) throws va2 {
        nga ngaVar = new nga();
        this.f22705f = ngaVar;
        this.f22711y = 0;
        this.f22694L = new AtomicInteger(0);
        this.f22696Q = new LinkedHashMap();
        this.f22697X = 0;
        this.l0 = false;
        this.m0 = false;
        this.n0 = true;
        this.r0 = new HashSet();
        this.s0 = x82.m55810a();
        this.t0 = new Object();
        this.u0 = false;
        this.z0 = new C13336h(this, null);
        this.f22701b = z92Var;
        this.h0 = b92Var;
        this.i0 = ta2Var;
        ScheduledExecutorService scheduledExecutorServiceM28296d = gb2.m28296d(handler);
        this.f22703d = scheduledExecutorServiceM28296d;
        Executor executorM28297e = gb2.m28297e(executor);
        this.f22702c = executorM28297e;
        this.f22708q = new C13338j(executorM28297e, scheduledExecutorServiceM28296d, j);
        this.f22700a = new b9i(str);
        ngaVar.m40533g(v92.EnumC17532a.CLOSED);
        qa2 qa2Var = new qa2(ta2Var);
        this.f22706g = qa2Var;
        fe2 fe2Var = new fe2(executorM28297e);
        this.p0 = fe2Var;
        this.v0 = qu5Var;
        try {
            s82 s82VarM58952c = z92Var.m58952c(str);
            this.w0 = s82VarM58952c;
            m42 m42Var = new m42(s82VarM58952c, scheduledExecutorServiceM28296d, executorM28297e, new C13335g(), m52Var.mo38384f());
            this.f22707h = m42Var;
            this.f22709s = m52Var;
            m52Var.m38393p(m42Var);
            m52Var.m38396s(qa2Var.m45038a());
            this.x0 = f26.m25951a(s82VarM58952c);
            this.f22693H = u0();
            this.q0 = new ugg.C17376b(executorM28297e, scheduledExecutorServiceM28296d, handler, fe2Var, m52Var.mo38384f(), zq5.m59713c());
            this.j0 = m52Var.mo38384f().m36593a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.k0 = m52Var.mo38384f().m36593a(LegacyCameraSurfaceCleanupQuirk.class);
            C13333e c13333e = new C13333e(str);
            this.f22698Y = c13333e;
            C13334f c13334f = new C13334f();
            this.f22699Z = c13334f;
            ta2Var.m49602g(this, executorM28297e, c13334f, c13333e);
            z92Var.m58956g(executorM28297e, c13333e);
            this.y0 = new ueg(context, str, z92Var, new C13329a());
        } catch (h72 e) {
            throw wa2.m54130a(e);
        }
    }

    /* renamed from: Y */
    public static List m26089Y(w8i w8iVar) {
        if (w8iVar.m54087f() == null) {
            return null;
        }
        return h7g.f0(w8iVar);
    }

    /* renamed from: Z */
    public static String m26090Z(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String a0(jeb jebVar) {
        return jebVar.m33654f() + jebVar.hashCode();
    }

    public static String b0(w8i w8iVar) {
        return w8iVar.m54094n() + w8iVar.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0() {
        if (c0()) {
            F0(a0(this.o0), this.o0.m33656h(), this.o0.m33657i(), null, Collections.singletonList(d9i.EnumC12848b.METERING_REPEATING));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(List list) {
        try {
            M0(list);
        } finally {
            this.f22707h.m38322v();
        }
    }

    public static /* synthetic */ void h0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ zfa i0(be2 be2Var, yj5 yj5Var, Void r2) {
        be2Var.close();
        yj5Var.mo30396d();
        return be2Var.mo18762e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.m0 = false;
        this.l0 = false;
        m26109T("OpenCameraConfigAndClose is done, state: " + this.f22704e);
        int iOrdinal = this.f22704e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            fgd.m26665i(d0());
            m26112W();
            return;
        }
        if (iOrdinal != 6) {
            m26109T("OpenCameraConfigAndClose finished while in state: " + this.f22704e);
            return;
        }
        if (this.f22711y == 0) {
            P0(false);
            return;
        }
        m26109T("OpenCameraConfigAndClose in error: " + m26090Z(this.f22711y));
        this.f22708q.m26148e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(g32.C13614a c13614a) {
        jeb jebVar = this.o0;
        if (jebVar == null) {
            c13614a.m28005c(Boolean.FALSE);
        } else {
            c13614a.m28005c(Boolean.valueOf(this.f22700a.m18485o(a0(jebVar))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m0(final g32.C13614a c13614a) {
        try {
            this.f22702c.execute(new Runnable() { // from class: o.y42
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54831a.l0(c13614a);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            c13614a.m28008f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        m26109T("Use case " + str + " ACTIVE");
        this.f22700a.m18487u(str, bhfVar, c9iVar, k7gVar, list);
        this.f22700a.m18491y(str, bhfVar, c9iVar, k7gVar, list);
        Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str) {
        m26109T("Use case " + str + " INACTIVE");
        this.f22700a.m18490x(str);
        Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        m26109T("Use case " + str + " UPDATED");
        this.f22700a.m18491y(str, bhfVar, c9iVar, k7gVar, list);
        Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q0(g32.C13614a c13614a) {
        try {
            ArrayList arrayList = new ArrayList(this.f22700a.m18477g().m19081c().m19025c());
            arrayList.add(this.p0.m26485c());
            arrayList.add(new C13330b(c13614a));
            this.f22701b.m58955f(this.f22709s.mo38380b(), this.f22702c, l92.m36809a(arrayList));
            return "configAndCloseTask";
        } catch (SecurityException | h72 e) {
            m26110U("Unable to open camera for configAndClose: " + e.getMessage(), e);
            c13614a.m28008f(e);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ void r0(bhf.InterfaceC12404d interfaceC12404d, bhf bhfVar) {
        interfaceC12404d.mo19062a(bhfVar, bhf.EnumC12407g.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m26109T("Use case " + str + " RESET");
        this.f22700a.m18491y(str, bhfVar, c9iVar, k7gVar, list);
        m26102M();
        E0(false);
        Q0();
        if (this.f22704e == EnumC13337i.OPENED) {
            z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.u0 = z;
        if (z && this.f22704e == EnumC13337i.PENDING_OPEN) {
            O0(false);
        }
    }

    public final void A0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iOrdinal = this.f22704e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            O0(false);
            return;
        }
        if (iOrdinal != 4) {
            m26109T("open() ignored due to being in state: " + this.f22704e);
            return;
        }
        G0(EnumC13337i.REOPENING);
        if (d0() || this.m0 || this.f22711y != 0) {
            return;
        }
        fgd.m26666j(this.f22710x != null, "Camera Device should be open if session close is not complete");
        G0(EnumC13337i.OPENED);
        z0();
    }

    public void B0(final bhf bhfVar) {
        ScheduledExecutorService scheduledExecutorServiceM28295c = gb2.m28295c();
        final bhf.InterfaceC12404d interfaceC12404dM19026d = bhfVar.m19026d();
        if (interfaceC12404dM19026d != null) {
            m26110U("Posting surface closed", new Throwable());
            scheduledExecutorServiceM28295c.execute(new Runnable() { // from class: o.d52
                @Override // java.lang.Runnable
                public final void run() {
                    f52.r0(interfaceC12404dM19026d, bhfVar);
                }
            });
        }
    }

    public zfa C0(ce2 ce2Var, boolean z) {
        ce2Var.close();
        zfa zfaVarMo18762e = ce2Var.mo18762e(z);
        m26109T("Releasing session in state " + this.f22704e.name());
        this.f22696Q.put(ce2Var, zfaVarMo18762e);
        bn7.m19424j(zfaVarMo18762e, new C13331c(ce2Var), gb2.m28293a());
        return zfaVarMo18762e;
    }

    public final void D0() {
        if (this.o0 != null) {
            this.f22700a.m18489w(this.o0.m33654f() + this.o0.hashCode());
            this.f22700a.m18490x(this.o0.m33654f() + this.o0.hashCode());
            this.o0.m33651c();
            this.o0 = null;
        }
    }

    public void E0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fgd.m26665i(this.f22693H != null);
        m26109T("Resetting Capture Session");
        ce2 ce2Var = this.f22693H;
        bhf bhfVarMo18764g = ce2Var.mo18764g();
        List listMo18763f = ce2Var.mo18763f();
        ce2 ce2VarU0 = u0();
        this.f22693H = ce2VarU0;
        ce2VarU0.mo18765h(bhfVarMo18764g);
        this.f22693H.mo18759b(listMo18763f);
        if (this.f22704e.ordinal() != 8) {
            m26109T("Skipping Capture Session state check due to current camera state: " + this.f22704e + " and previous session status: " + ce2Var.mo18760c());
        } else if (this.j0 && ce2Var.mo18760c()) {
            m26109T("Close camera before creating new session");
            G0(EnumC13337i.REOPENING_QUIRK);
        }
        if (this.k0 && ce2Var.mo18760c()) {
            m26109T("ConfigAndClose is required when close the camera.");
            this.l0 = true;
        }
        C0(ce2Var, z);
    }

    public final void F0(final String str, final bhf bhfVar, final c9i c9iVar, final k7g k7gVar, final List list) {
        this.f22702c.execute(new Runnable() { // from class: o.r42
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f42905a.s0(str, bhfVar, c9iVar, k7gVar, list);
            }
        });
    }

    public void G0(EnumC13337i enumC13337i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        H0(enumC13337i, null);
    }

    public void H0(EnumC13337i enumC13337i, pa2.AbstractC16043a abstractC16043a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        I0(enumC13337i, abstractC16043a, true);
    }

    public void I0(EnumC13337i enumC13337i, pa2.AbstractC16043a abstractC16043a, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        v92.EnumC17532a enumC17532a;
        m26109T("Transitioning camera internal state: " + this.f22704e + " --> " + enumC13337i);
        L0(enumC13337i, abstractC16043a);
        this.f22704e = enumC13337i;
        switch (enumC13337i) {
            case RELEASED:
                enumC17532a = v92.EnumC17532a.RELEASED;
                break;
            case RELEASING:
                enumC17532a = v92.EnumC17532a.RELEASING;
                break;
            case INITIALIZED:
                enumC17532a = v92.EnumC17532a.CLOSED;
                break;
            case PENDING_OPEN:
                enumC17532a = v92.EnumC17532a.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                enumC17532a = v92.EnumC17532a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                enumC17532a = v92.EnumC17532a.OPENING;
                break;
            case OPENED:
                enumC17532a = v92.EnumC17532a.OPEN;
                break;
            case CONFIGURED:
                enumC17532a = v92.EnumC17532a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + enumC13337i);
        }
        this.i0.m49600e(this, enumC17532a, z);
        this.f22705f.m40533g(enumC17532a);
        this.f22706g.m45040c(enumC17532a, abstractC16043a);
    }

    public void J0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cd2 cd2Var = (cd2) it.next();
            cd2.C12638a c12638aM20893j = cd2.C12638a.m20893j(cd2Var);
            if (cd2Var.m20889k() == 5 && cd2Var.m20882d() != null) {
                c12638aM20893j.m20905n(cd2Var.m20882d());
            }
            if (!cd2Var.m20887i().isEmpty() || !cd2Var.m20891m() || m26103N(c12638aM20893j)) {
                arrayList.add(c12638aM20893j.m20901h());
            }
        }
        m26109T("Issue capture request");
        this.f22693H.mo18759b(arrayList);
    }

    public final Collection K0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC13339k.m26159b((w8i) it.next(), this.n0));
        }
        return arrayList;
    }

    /* renamed from: L */
    public final void m26101L() {
        jeb jebVar = this.o0;
        if (jebVar != null) {
            String strA0 = a0(jebVar);
            b9i b9iVar = this.f22700a;
            bhf bhfVarM33656h = this.o0.m33656h();
            c9i c9iVarM33657i = this.o0.m33657i();
            d9i.EnumC12848b enumC12848b = d9i.EnumC12848b.METERING_REPEATING;
            b9iVar.m18488v(strA0, bhfVarM33656h, c9iVarM33657i, null, Collections.singletonList(enumC12848b));
            this.f22700a.m18487u(strA0, this.o0.m33656h(), this.o0.m33657i(), null, Collections.singletonList(enumC12848b));
        }
    }

    public void L0(EnumC13337i enumC13337i, pa2.AbstractC16043a abstractC16043a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (vsh.m53387d()) {
            vsh.m53389f("CX:C2State[" + this + "]", enumC13337i.ordinal());
            if (abstractC16043a != null) {
                this.f22697X++;
            }
            if (this.f22697X > 0) {
                vsh.m53389f("CX:C2StateErrorCode[" + this + "]", abstractC16043a != null ? abstractC16043a.mo18144d() : 0);
            }
        }
    }

    /* renamed from: M */
    public final void m26102M() {
        bhf bhfVarM19081c = this.f22700a.m18477g().m19081c();
        cd2 cd2VarM19031j = bhfVarM19081c.m19031j();
        int size = cd2VarM19031j.m20887i().size();
        int size2 = bhfVarM19081c.m19035n().size();
        if (bhfVarM19081c.m19035n().isEmpty()) {
            return;
        }
        if (cd2VarM19031j.m20887i().isEmpty()) {
            if (this.o0 == null) {
                this.o0 = new jeb(this.f22709s.m38390m(), this.v0, new jeb.InterfaceC14514c() { // from class: o.v42
                    @Override // p001o.jeb.InterfaceC14514c
                    /* renamed from: a */
                    public final void mo33660a() {
                        this.f49839a.f0();
                    }
                });
            }
            if (e0()) {
                m26101L();
                return;
            } else {
                wja.m54629c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            D0();
            return;
        }
        if (size >= 2) {
            D0();
            return;
        }
        if (this.o0 != null && !e0()) {
            D0();
            return;
        }
        wja.m54627a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    public final void M0(Collection collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Size sizeMo26163f;
        boolean zIsEmpty = this.f22700a.m18478h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            AbstractC13339k abstractC13339k = (AbstractC13339k) it.next();
            if (!this.f22700a.m18485o(abstractC13339k.mo26165h())) {
                this.f22700a.m18488v(abstractC13339k.mo26165h(), abstractC13339k.mo26161d(), abstractC13339k.mo26164g(), abstractC13339k.mo26162e(), abstractC13339k.mo26160c());
                arrayList.add(abstractC13339k.mo26165h());
                if (abstractC13339k.mo26166i() == ahd.class && (sizeMo26163f = abstractC13339k.mo26163f()) != null) {
                    rational = new Rational(sizeMo26163f.getWidth(), sizeMo26163f.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m26109T("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f22707h.d0(true);
            this.f22707h.m38316K();
        }
        m26102M();
        R0();
        Q0();
        E0(false);
        if (this.f22704e == EnumC13337i.OPENED) {
            z0();
        } else {
            A0();
        }
        if (rational != null) {
            this.f22707h.e0(rational);
        }
    }

    /* renamed from: N */
    public final boolean m26103N(cd2.C12638a c12638a) {
        if (!c12638a.m20903l().isEmpty()) {
            wja.m54638l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f22700a.m18476f().iterator();
        while (it.hasNext()) {
            cd2 cd2VarM19031j = ((bhf) it.next()).m19031j();
            List listM20887i = cd2VarM19031j.m20887i();
            if (!listM20887i.isEmpty()) {
                if (cd2VarM19031j.m20886h() != 0) {
                    c12638a.m20910s(cd2VarM19031j.m20886h());
                }
                if (cd2VarM19031j.m20890l() != 0) {
                    c12638a.m20913v(cd2VarM19031j.m20890l());
                }
                Iterator it2 = listM20887i.iterator();
                while (it2.hasNext()) {
                    c12638a.m20899f((yj5) it2.next());
                }
            }
        }
        if (!c12638a.m20903l().isEmpty()) {
            return true;
        }
        wja.m54638l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final void k0(Collection collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC13339k abstractC13339k = (AbstractC13339k) it.next();
            if (this.f22700a.m18485o(abstractC13339k.mo26165h())) {
                this.f22700a.m18486t(abstractC13339k.mo26165h());
                arrayList.add(abstractC13339k.mo26165h());
                if (abstractC13339k.mo26166i() == ahd.class) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m26109T("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z) {
            this.f22707h.e0(null);
        }
        m26102M();
        if (this.f22700a.m18479i().isEmpty()) {
            this.f22707h.g0(false);
        } else {
            R0();
        }
        if (this.f22700a.m18478h().isEmpty()) {
            this.f22707h.m38322v();
            E0(false);
            this.f22707h.d0(false);
            this.f22693H = u0();
            m26105P();
            return;
        }
        Q0();
        E0(false);
        if (this.f22704e == EnumC13337i.OPENED) {
            z0();
        }
    }

    /* renamed from: O */
    public void m26104O(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fgd.m26666j(this.f22704e == EnumC13337i.CLOSING || this.f22704e == EnumC13337i.RELEASING || (this.f22704e == EnumC13337i.REOPENING && this.f22711y != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f22704e + " (error: " + m26090Z(this.f22711y) + ")");
        E0(z);
        this.f22693H.mo18761d();
    }

    public void O0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m26109T("Attempting to force open the camera.");
        if (this.i0.m49603i(this)) {
            y0(z);
        } else {
            m26109T("No cameras available. Waiting for available camera before opening camera.");
            G0(EnumC13337i.PENDING_OPEN);
        }
    }

    /* renamed from: P */
    public final void m26105P() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m26109T("Closing camera.");
        switch (this.f22704e.ordinal()) {
            case 3:
                fgd.m26665i(this.f22710x == null);
                G0(EnumC13337i.INITIALIZED);
                break;
            case 4:
            default:
                m26109T("close() ignored due to being in state: " + this.f22704e);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f22708q.m26144a() && !this.z0.m26136c()) {
                    z = false;
                }
                this.z0.m26134a();
                G0(EnumC13337i.CLOSING);
                if (z) {
                    fgd.m26665i(d0());
                    m26107R();
                    break;
                }
                break;
            case 8:
            case 9:
                G0(EnumC13337i.CLOSING);
                m26104O(false);
                break;
        }
    }

    public void P0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m26109T("Attempting to open the camera.");
        if (this.f22698Y.m26130b() && this.i0.m49603i(this)) {
            y0(z);
        } else {
            m26109T("No cameras available. Waiting for available camera before opening camera.");
            G0(EnumC13337i.PENDING_OPEN);
        }
    }

    /* renamed from: Q */
    public final zfa m26106Q(CameraDevice cameraDevice) {
        final be2 be2Var = new be2(this.x0);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final hf8 hf8Var = new hf8(surface);
        hf8Var.m57873k().addListener(new Runnable() { // from class: o.q42
            @Override // java.lang.Runnable
            public final void run() {
                f52.h0(surface, surfaceTexture);
            }
        }, gb2.m28293a());
        bhf.C12402b c12402b = new bhf.C12402b();
        c12402b.m19045h(hf8Var);
        c12402b.m19060x(1);
        m26109T("Start configAndClose.");
        return rm7.m46957a(bn7.m19414I(be2Var.mo18758a(c12402b.m19052o(), cameraDevice, this.q0.m51569a()))).m46961e(new wr0() { // from class: o.w42
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return f52.i0(be2Var, hf8Var, (Void) obj);
            }
        }, this.f22702c);
    }

    public void Q0() {
        bhf.C12408h c12408hM18475e = this.f22700a.m18475e();
        if (!c12408hM18475e.m19083e()) {
            this.f22707h.c0();
            this.f22693H.mo18765h(this.f22707h.m38307A());
            return;
        }
        this.f22707h.f0(c12408hM18475e.m19081c().m19036o());
        c12408hM18475e.m19080b(this.f22707h.m38307A());
        this.f22693H.mo18765h(c12408hM18475e.m19081c());
    }

    /* renamed from: R */
    public final void m26107R() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fgd.m26665i(this.f22704e == EnumC13337i.RELEASING || this.f22704e == EnumC13337i.CLOSING);
        fgd.m26665i(this.f22696Q.isEmpty());
        if (!this.l0) {
            m26112W();
            return;
        }
        if (this.m0) {
            m26109T("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f22698Y.m26130b()) {
            this.l0 = false;
            m26112W();
            m26109T("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            m26109T("Open camera to configAndClose");
            zfa zfaVarX0 = x0();
            this.m0 = true;
            zfaVarX0.addListener(new Runnable() { // from class: o.b52
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    this.f15549a.j0();
                }
            }, this.f22702c);
        }
    }

    public final void R0() {
        Iterator it = this.f22700a.m18479i().iterator();
        boolean zM20532J = false;
        while (it.hasNext()) {
            zM20532J |= ((c9i) it.next()).m20532J(false);
        }
        this.f22707h.g0(zM20532J);
    }

    /* renamed from: S */
    public final CameraDevice.StateCallback m26108S() {
        ArrayList arrayList = new ArrayList(this.f22700a.m18477g().m19081c().m19025c());
        arrayList.add(this.p0.m26485c());
        arrayList.add(this.f22708q);
        return l92.m36809a(arrayList);
    }

    /* renamed from: T */
    public void m26109T(String str) {
        m26110U(str, null);
    }

    /* renamed from: U */
    public final void m26110U(String str, Throwable th) {
        wja.m54628b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    /* renamed from: V */
    public bhf m26111V(yj5 yj5Var) {
        for (bhf bhfVar : this.f22700a.m18478h()) {
            if (bhfVar.m19035n().contains(yj5Var)) {
                return bhfVar;
            }
        }
        return null;
    }

    /* renamed from: W */
    public void m26112W() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fgd.m26665i(this.f22704e == EnumC13337i.RELEASING || this.f22704e == EnumC13337i.CLOSING);
        fgd.m26665i(this.f22696Q.isEmpty());
        this.f22710x = null;
        if (this.f22704e == EnumC13337i.CLOSING) {
            G0(EnumC13337i.INITIALIZED);
            return;
        }
        this.f22701b.m58957h(this.f22698Y);
        G0(EnumC13337i.RELEASED);
        g32.C13614a c13614a = this.f22695M;
        if (c13614a != null) {
            c13614a.m28005c(null);
            this.f22695M = null;
        }
    }

    /* renamed from: X */
    public final int m26113X() {
        synchronized (this.t0) {
            return this.h0.mo18287c() == 2 ? 1 : 0;
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: b */
    public void mo26114b(w8i w8iVar) {
        fgd.m26663g(w8iVar);
        final String strB0 = b0(w8iVar);
        final bhf bhfVarM54102v = this.n0 ? w8iVar.m54102v() : w8iVar.m54100t();
        final c9i c9iVarM54090i = w8iVar.m54090i();
        final k7g k7gVarM54085d = w8iVar.m54085d();
        final List listM26089Y = m26089Y(w8iVar);
        this.f22702c.execute(new Runnable() { // from class: o.c52
            @Override // java.lang.Runnable
            public final void run() {
                this.f17338a.n0(strB0, bhfVarM54102v, c9iVarM54090i, k7gVarM54085d, listM26089Y);
            }
        });
    }

    @Override // p001o.v92
    /* renamed from: c */
    public z82 mo26115c() {
        return this.f22707h;
    }

    public boolean c0() {
        try {
            return ((Boolean) g32.m28002a(new g32.InterfaceC13616c() { // from class: o.x42
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f53165a.m0(c13614a);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
        }
    }

    @Override // p001o.v92
    /* renamed from: d */
    public u82 mo26116d() {
        return this.s0;
    }

    public boolean d0() {
        return this.f22696Q.isEmpty();
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: e */
    public void mo26117e(w8i w8iVar) {
        fgd.m26663g(w8iVar);
        final String strB0 = b0(w8iVar);
        final bhf bhfVarM54102v = this.n0 ? w8iVar.m54102v() : w8iVar.m54100t();
        final c9i c9iVarM54090i = w8iVar.m54090i();
        final k7g k7gVarM54085d = w8iVar.m54085d();
        final List listM26089Y = m26089Y(w8iVar);
        this.f22702c.execute(new Runnable() { // from class: o.e52
            @Override // java.lang.Runnable
            public final void run() {
                this.f20971a.p0(strB0, bhfVarM54102v, c9iVarM54090i, k7gVarM54085d, listM26089Y);
            }
        });
    }

    public final boolean e0() {
        ArrayList arrayList = new ArrayList();
        int iM26113X = m26113X();
        for (b9i.C12335b c12335b : this.f22700a.m18480j()) {
            if (c12335b.m18494c() == null || c12335b.m18494c().get(0) != d9i.EnumC12848b.METERING_REPEATING) {
                if (c12335b.m18496e() == null || c12335b.m18494c() == null) {
                    wja.m54638l("Camera2CameraImpl", "Invalid stream spec or capture types in " + c12335b);
                    return false;
                }
                bhf bhfVarM18495d = c12335b.m18495d();
                c9i c9iVarM18497f = c12335b.m18497f();
                for (yj5 yj5Var : bhfVarM18495d.m19035n()) {
                    arrayList.add(os0.m42612a(this.y0.m51473M(iM26113X, c9iVarM18497f.mo19021n(), yj5Var.m57870h()), c9iVarM18497f.mo19021n(), yj5Var.m57870h(), c12335b.m18496e().mo35126b(), c12335b.m18494c(), c12335b.m18496e().mo35128d(), c9iVarM18497f.m20539v(null)));
                }
            }
        }
        fgd.m26663g(this.o0);
        HashMap map = new HashMap();
        map.put(this.o0.m33657i(), Collections.singletonList(this.o0.m33653e()));
        try {
            this.y0.m51463A(iM26113X, arrayList, map, false, false);
            m26109T("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e) {
            m26110U("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    @Override // p001o.v92
    /* renamed from: f */
    public void mo26118f(final boolean z) {
        this.f22702c.execute(new Runnable() { // from class: o.a52
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f14140a.t0(z);
            }
        });
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: g */
    public void mo26119g(w8i w8iVar) {
        fgd.m26663g(w8iVar);
        final String strB0 = b0(w8iVar);
        this.f22702c.execute(new Runnable() { // from class: o.z42
            @Override // java.lang.Runnable
            public final void run() {
                this.f56485a.o0(strB0);
            }
        });
    }

    @Override // p001o.v92
    /* renamed from: h */
    public void mo26120h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22707h.m38316K();
        v0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(K0(arrayList));
        try {
            this.f22702c.execute(new Runnable() { // from class: o.t42
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46341a.g0(arrayList2);
                }
            });
        } catch (RejectedExecutionException e) {
            m26110U("Unable to attach use cases.", e);
            this.f22707h.m38322v();
        }
    }

    @Override // p001o.v92
    /* renamed from: i */
    public void mo26121i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(K0(arrayList));
        w0(new ArrayList(arrayList));
        this.f22702c.execute(new Runnable() { // from class: o.s42
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f44744a.k0(arrayList2);
            }
        });
    }

    @Override // p001o.v92
    /* renamed from: j */
    public u92 mo26122j() {
        return this.f22709s;
    }

    @Override // p001o.v92
    /* renamed from: k */
    public void mo26123k(u82 u82Var) {
        if (u82Var == null) {
            u82Var = x82.m55810a();
        }
        u82Var.m51202u(null);
        this.s0 = u82Var;
        synchronized (this.t0) {
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: m */
    public void mo26124m(w8i w8iVar) {
        fgd.m26663g(w8iVar);
        bhf bhfVarM54102v = this.n0 ? w8iVar.m54102v() : w8iVar.m54100t();
        F0(b0(w8iVar), bhfVarM54102v, w8iVar.m54090i(), w8iVar.m54085d(), m26089Y(w8iVar));
    }

    @Override // p001o.v92
    /* renamed from: n */
    public v6c mo26125n() {
        return this.f22705f;
    }

    @Override // p001o.v92
    /* renamed from: q */
    public void mo26126q(boolean z) {
        this.n0 = z;
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f22709s.mo38380b());
    }

    public final ce2 u0() {
        be2 be2Var;
        synchronized (this.t0) {
            be2Var = new be2(this.x0, this.f22709s.mo38384f());
        }
        return be2Var;
    }

    public final void v0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            String strB0 = b0(w8iVar);
            if (!this.r0.contains(strB0)) {
                this.r0.add(strB0);
                w8iVar.mo29953K();
                w8iVar.mo48155I();
            }
        }
    }

    public final void w0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            String strB0 = b0(w8iVar);
            if (this.r0.contains(strB0)) {
                w8iVar.mo29954L();
                this.r0.remove(strB0);
            }
        }
    }

    public final zfa x0() {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.u42
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f48307a.q0(c13614a);
            }
        });
    }

    public final void y0(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z) {
            this.f22708q.m26147d();
        }
        this.f22708q.m26144a();
        this.z0.m26134a();
        m26109T("Opening camera.");
        G0(EnumC13337i.OPENING);
        try {
            this.f22701b.m58955f(this.f22709s.mo38380b(), this.f22702c, m26108S());
        } catch (SecurityException e) {
            m26109T("Unable to open camera due to " + e.getMessage());
            G0(EnumC13337i.REOPENING);
            this.f22708q.m26148e();
        } catch (h72 e2) {
            m26109T("Unable to open camera due to " + e2.getMessage());
            if (e2.m29868d() != 10001) {
                this.z0.m26137d();
            } else {
                H0(EnumC13337i.INITIALIZED, pa2.AbstractC16043a.m43264b(7, e2));
            }
        }
    }

    public void z0() {
        fgd.m26665i(this.f22704e == EnumC13337i.OPENED);
        bhf.C12408h c12408hM18477g = this.f22700a.m18477g();
        if (!c12408hM18477g.m19083e()) {
            m26109T("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.i0.m49604j(this.f22710x.getId(), this.h0.mo18286b(this.f22710x.getId()))) {
            m26109T("Unable to create capture session in camera operating mode = " + this.h0.mo18287c());
            return;
        }
        HashMap map = new HashMap();
        m7g.m38507m(this.f22700a.m18478h(), this.f22700a.m18479i(), map);
        this.f22693H.mo18766i(map);
        ce2 ce2Var = this.f22693H;
        bn7.m19424j(ce2Var.mo18758a(c12408hM18477g.m19081c(), (CameraDevice) fgd.m26663g(this.f22710x), this.q0.m51569a()), new C13332d(ce2Var), this.f22702c);
    }

    /* renamed from: o.f52$h */
    public class C13336h {

        /* renamed from: a */
        public a f22724a;

        /* renamed from: o.f52$h$a */
        public class a {

            /* renamed from: a */
            public final ScheduledFuture f22726a;

            /* renamed from: b */
            public final AtomicBoolean f22727b = new AtomicBoolean(false);

            public a() {
                this.f22726a = f52.this.f22703d.schedule(new Runnable() { // from class: o.h52
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26210a.m26141d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* renamed from: c */
            public void m26140c() {
                this.f22727b.set(true);
                this.f22726a.cancel(true);
            }

            /* renamed from: d */
            public final void m26141d() {
                if (this.f22727b.getAndSet(true)) {
                    return;
                }
                f52.this.f22702c.execute(new Runnable() { // from class: o.i52
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        this.f28091a.m26142e();
                    }
                });
            }

            /* renamed from: e */
            public final void m26142e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (f52.this.f22704e == EnumC13337i.OPENING) {
                    f52.this.m26109T("Camera onError timeout, reopen it.");
                    f52.this.G0(EnumC13337i.REOPENING);
                    f52.this.f22708q.m26148e();
                } else {
                    f52.this.m26109T("Camera skip reopen at state: " + f52.this.f22704e);
                }
            }

            /* renamed from: f */
            public boolean m26143f() {
                return this.f22727b.get();
            }
        }

        public C13336h() {
            this.f22724a = null;
        }

        /* renamed from: a */
        public void m26134a() {
            a aVar = this.f22724a;
            if (aVar != null) {
                aVar.m26140c();
            }
            this.f22724a = null;
        }

        /* renamed from: b */
        public void m26135b() {
            f52.this.m26109T("Camera receive onErrorCallback");
            m26134a();
        }

        /* renamed from: c */
        public boolean m26136c() {
            a aVar = this.f22724a;
            return (aVar == null || aVar.m26143f()) ? false : true;
        }

        /* renamed from: d */
        public void m26137d() {
            if (f52.this.f22704e != EnumC13337i.OPENING) {
                f52.this.m26109T("Don't need the onError timeout handler.");
                return;
            }
            f52.this.m26109T("Camera waiting for onError.");
            m26134a();
            this.f22724a = new a();
        }

        public /* synthetic */ C13336h(f52 f52Var, C13329a c13329a) {
            this();
        }
    }
}
