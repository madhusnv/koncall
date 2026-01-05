package p001o;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class z92 {

    /* renamed from: a */
    public final InterfaceC18583b f56723a;

    /* renamed from: b */
    public final Map f56724b = new ArrayMap(4);

    /* renamed from: o.z92$a */
    public static final class C18582a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f56725a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f56726b;

        /* renamed from: c */
        public final Object f56727c = new Object();

        /* renamed from: d */
        public boolean f56728d = false;

        public C18582a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f56725a = executor;
            this.f56726b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m58961d() {
            hi0.m30608a(this.f56726b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m58962e(String str) {
            this.f56726b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m58963f(String str) {
            this.f56726b.onCameraUnavailable(str);
        }

        /* renamed from: g */
        public void m58964g() {
            synchronized (this.f56727c) {
                this.f56728d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f56727c) {
                if (!this.f56728d) {
                    this.f56725a.execute(new Runnable() { // from class: o.w92
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51637a.m58961d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f56727c) {
                if (!this.f56728d) {
                    this.f56725a.execute(new Runnable() { // from class: o.y92
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55081a.m58962e(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f56727c) {
                if (!this.f56728d) {
                    this.f56725a.execute(new Runnable() { // from class: o.x92
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f53376a.m58963f(str);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: o.z92$b */
    public interface InterfaceC18583b {
        /* renamed from: g */
        static InterfaceC18583b m58965g(Context context, Handler handler) {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? new ca2(context) : i >= 29 ? new ba2(context) : i >= 28 ? aa2.m16709i(context) : da2.m22645h(context, handler);
        }

        /* renamed from: a */
        void mo16711a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        CameraCharacteristics mo16712b(String str);

        /* renamed from: c */
        Set mo20544c();

        /* renamed from: d */
        void mo16713d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* renamed from: e */
        String[] mo22646e();

        /* renamed from: f */
        void mo16714f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public z92(InterfaceC18583b interfaceC18583b) {
        this.f56723a = interfaceC18583b;
    }

    /* renamed from: a */
    public static z92 m58950a(Context context) {
        return m58951b(context, mpa.m39497a());
    }

    /* renamed from: b */
    public static z92 m58951b(Context context, Handler handler) {
        return new z92(InterfaceC18583b.m58965g(context, handler));
    }

    /* renamed from: c */
    public s82 m58952c(String str) {
        s82 s82VarM47964e;
        synchronized (this.f56724b) {
            s82VarM47964e = (s82) this.f56724b.get(str);
            if (s82VarM47964e == null) {
                try {
                    s82VarM47964e = s82.m47964e(this.f56723a.mo16712b(str), str);
                    this.f56724b.put(str, s82VarM47964e);
                } catch (AssertionError e) {
                    throw new h72(10002, e.getMessage(), e);
                }
            }
        }
        return s82VarM47964e;
    }

    /* renamed from: d */
    public String[] m58953d() {
        return this.f56723a.mo22646e();
    }

    /* renamed from: e */
    public Set m58954e() {
        return this.f56723a.mo20544c();
    }

    /* renamed from: f */
    public void m58955f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f56723a.mo16713d(str, executor, stateCallback);
    }

    /* renamed from: g */
    public void m58956g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f56723a.mo16711a(executor, availabilityCallback);
    }

    /* renamed from: h */
    public void m58957h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f56723a.mo16714f(availabilityCallback);
    }
}
