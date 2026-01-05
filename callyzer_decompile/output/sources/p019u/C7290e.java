package p019u;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import e0.InterfaceC1893b;
import e1.x0;
import ex.InterfaceC2137a;
import i0.C3080k;
import i0.g2;
import i0.q0;
import i0.v0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import mk.C4764c;
import og.nd;
import og.pe;
import og.u1;
import og.y0;
import p021w.C7843i;
import p021w.C7851q;
import p022x.AbstractC8231a;
import p022x.C8233c;
import p022x.InterfaceC8232b;
import pg.t8;
import qw.C6366p;
import rw.AbstractC6664n;
import y0.C8525a;
import y0.C8526b;
import y0.C8527c;
import y0.InterfaceC8528d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C7290e implements InterfaceC1893b {

    /* renamed from: j */
    public static final C7289d f34762j = new C7289d();

    /* renamed from: a */
    public final Context f34763a;

    /* renamed from: b */
    public final String f34764b;

    /* renamed from: c */
    public final C7851q f34765c;

    /* renamed from: d */
    public final C6366p f34766d;

    /* renamed from: e */
    public final C6366p f34767e;

    /* renamed from: f */
    public final C6366p f34768f;

    /* renamed from: g */
    public final C6366p f34769g;

    /* renamed from: h */
    public final C6366p f34770h;

    public C7290e(Context context, String cameraId, C7851q cameraManagerCompat) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(cameraId, "cameraId");
        AbstractC4154l.m8923f(cameraManagerCompat, "cameraManagerCompat");
        this.f34763a = context;
        this.f34764b = cameraId;
        this.f34765c = cameraManagerCompat;
        final int i10 = 0;
        this.f34766d = nd.m10782c(new InterfaceC2137a(this) { // from class: u.b

            /* renamed from: b */
            public final /* synthetic */ C7290e f34759b;

            {
                this.f34759b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() throws CameraUnavailableException {
                String string;
                Boolean bool;
                switch (i10) {
                    case 0:
                        C7290e c7290e = this.f34759b;
                        Context context2 = c7290e.f34763a;
                        C8527c c8527c = null;
                        C8527c c8527c2 = Build.VERSION.SDK_INT >= 35 ? new C8527c(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        c8527c = (C8527c) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e2) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = c7290e.f34764b;
                        ArrayList arrayList = new ArrayList();
                        if (c8527c != null) {
                            arrayList.add(new C8526b(c8527c.f41451a, str2));
                        }
                        if (c8527c2 != null) {
                            try {
                                arrayList.add(new C8526b(c8527c2.f41451a, str2));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new C8525a(arrayList);
                    case 1:
                        return C7290e.m13617a(this.f34759b);
                    case 2:
                        C7290e c7290e2 = this.f34759b;
                        try {
                            return c7290e2.f34765c.m14835b(c7290e2.f34764b);
                        } catch (CameraAccessExceptionCompat e10) {
                            throw new CameraUnavailableException(e10);
                        }
                    case 3:
                        C8233c c8233cM15408d = C8233c.m15408d((C7843i) this.f34759b.f34768f.getValue());
                        y0.m11056f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((InterfaceC8232b) c8233cM15408d.f39372a).mo15405a();
                    default:
                        Context context3 = this.f34759b.f34763a;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                x0 x0VarM8925h = AbstractC4154l.m8925h(serviceInfoArr2);
                                while (true) {
                                    if (x0VarM8925h.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) x0VarM8925h.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(AbstractC4154l.m8918a(bool, Boolean.FALSE));
                }
            }
        });
        final int i11 = 1;
        this.f34767e = nd.m10782c(new InterfaceC2137a(this) { // from class: u.b

            /* renamed from: b */
            public final /* synthetic */ C7290e f34759b;

            {
                this.f34759b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() throws CameraUnavailableException {
                String string;
                Boolean bool;
                switch (i11) {
                    case 0:
                        C7290e c7290e = this.f34759b;
                        Context context2 = c7290e.f34763a;
                        C8527c c8527c = null;
                        C8527c c8527c2 = Build.VERSION.SDK_INT >= 35 ? new C8527c(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        c8527c = (C8527c) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e2) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = c7290e.f34764b;
                        ArrayList arrayList = new ArrayList();
                        if (c8527c != null) {
                            arrayList.add(new C8526b(c8527c.f41451a, str2));
                        }
                        if (c8527c2 != null) {
                            try {
                                arrayList.add(new C8526b(c8527c2.f41451a, str2));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new C8525a(arrayList);
                    case 1:
                        return C7290e.m13617a(this.f34759b);
                    case 2:
                        C7290e c7290e2 = this.f34759b;
                        try {
                            return c7290e2.f34765c.m14835b(c7290e2.f34764b);
                        } catch (CameraAccessExceptionCompat e10) {
                            throw new CameraUnavailableException(e10);
                        }
                    case 3:
                        C8233c c8233cM15408d = C8233c.m15408d((C7843i) this.f34759b.f34768f.getValue());
                        y0.m11056f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((InterfaceC8232b) c8233cM15408d.f39372a).mo15405a();
                    default:
                        Context context3 = this.f34759b.f34763a;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                x0 x0VarM8925h = AbstractC4154l.m8925h(serviceInfoArr2);
                                while (true) {
                                    if (x0VarM8925h.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) x0VarM8925h.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(AbstractC4154l.m8918a(bool, Boolean.FALSE));
                }
            }
        });
        final int i12 = 2;
        this.f34768f = nd.m10782c(new InterfaceC2137a(this) { // from class: u.b

            /* renamed from: b */
            public final /* synthetic */ C7290e f34759b;

            {
                this.f34759b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() throws CameraUnavailableException {
                String string;
                Boolean bool;
                switch (i12) {
                    case 0:
                        C7290e c7290e = this.f34759b;
                        Context context2 = c7290e.f34763a;
                        C8527c c8527c = null;
                        C8527c c8527c2 = Build.VERSION.SDK_INT >= 35 ? new C8527c(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        c8527c = (C8527c) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e2) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = c7290e.f34764b;
                        ArrayList arrayList = new ArrayList();
                        if (c8527c != null) {
                            arrayList.add(new C8526b(c8527c.f41451a, str2));
                        }
                        if (c8527c2 != null) {
                            try {
                                arrayList.add(new C8526b(c8527c2.f41451a, str2));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new C8525a(arrayList);
                    case 1:
                        return C7290e.m13617a(this.f34759b);
                    case 2:
                        C7290e c7290e2 = this.f34759b;
                        try {
                            return c7290e2.f34765c.m14835b(c7290e2.f34764b);
                        } catch (CameraAccessExceptionCompat e10) {
                            throw new CameraUnavailableException(e10);
                        }
                    case 3:
                        C8233c c8233cM15408d = C8233c.m15408d((C7843i) this.f34759b.f34768f.getValue());
                        y0.m11056f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((InterfaceC8232b) c8233cM15408d.f39372a).mo15405a();
                    default:
                        Context context3 = this.f34759b.f34763a;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                x0 x0VarM8925h = AbstractC4154l.m8925h(serviceInfoArr2);
                                while (true) {
                                    if (x0VarM8925h.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) x0VarM8925h.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(AbstractC4154l.m8918a(bool, Boolean.FALSE));
                }
            }
        });
        final int i13 = 3;
        this.f34769g = nd.m10782c(new InterfaceC2137a(this) { // from class: u.b

            /* renamed from: b */
            public final /* synthetic */ C7290e f34759b;

            {
                this.f34759b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() throws CameraUnavailableException {
                String string;
                Boolean bool;
                switch (i13) {
                    case 0:
                        C7290e c7290e = this.f34759b;
                        Context context2 = c7290e.f34763a;
                        C8527c c8527c = null;
                        C8527c c8527c2 = Build.VERSION.SDK_INT >= 35 ? new C8527c(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        c8527c = (C8527c) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e2) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = c7290e.f34764b;
                        ArrayList arrayList = new ArrayList();
                        if (c8527c != null) {
                            arrayList.add(new C8526b(c8527c.f41451a, str2));
                        }
                        if (c8527c2 != null) {
                            try {
                                arrayList.add(new C8526b(c8527c2.f41451a, str2));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new C8525a(arrayList);
                    case 1:
                        return C7290e.m13617a(this.f34759b);
                    case 2:
                        C7290e c7290e2 = this.f34759b;
                        try {
                            return c7290e2.f34765c.m14835b(c7290e2.f34764b);
                        } catch (CameraAccessExceptionCompat e10) {
                            throw new CameraUnavailableException(e10);
                        }
                    case 3:
                        C8233c c8233cM15408d = C8233c.m15408d((C7843i) this.f34759b.f34768f.getValue());
                        y0.m11056f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((InterfaceC8232b) c8233cM15408d.f39372a).mo15405a();
                    default:
                        Context context3 = this.f34759b.f34763a;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                x0 x0VarM8925h = AbstractC4154l.m8925h(serviceInfoArr2);
                                while (true) {
                                    if (x0VarM8925h.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) x0VarM8925h.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(AbstractC4154l.m8918a(bool, Boolean.FALSE));
                }
            }
        });
        final int i14 = 4;
        this.f34770h = nd.m10782c(new InterfaceC2137a(this) { // from class: u.b

            /* renamed from: b */
            public final /* synthetic */ C7290e f34759b;

            {
                this.f34759b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() throws CameraUnavailableException {
                String string;
                Boolean bool;
                switch (i14) {
                    case 0:
                        C7290e c7290e = this.f34759b;
                        Context context2 = c7290e.f34763a;
                        C8527c c8527c = null;
                        C8527c c8527c2 = Build.VERSION.SDK_INT >= 35 ? new C8527c(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        c8527c = (C8527c) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e2) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e2);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = c7290e.f34764b;
                        ArrayList arrayList = new ArrayList();
                        if (c8527c != null) {
                            arrayList.add(new C8526b(c8527c.f41451a, str2));
                        }
                        if (c8527c2 != null) {
                            try {
                                arrayList.add(new C8526b(c8527c2.f41451a, str2));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new C8525a(arrayList);
                    case 1:
                        return C7290e.m13617a(this.f34759b);
                    case 2:
                        C7290e c7290e2 = this.f34759b;
                        try {
                            return c7290e2.f34765c.m14835b(c7290e2.f34764b);
                        } catch (CameraAccessExceptionCompat e10) {
                            throw new CameraUnavailableException(e10);
                        }
                    case 3:
                        C8233c c8233cM15408d = C8233c.m15408d((C7843i) this.f34759b.f34768f.getValue());
                        y0.m11056f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((InterfaceC8232b) c8233cM15408d.f39372a).mo15405a();
                    default:
                        Context context3 = this.f34759b.f34763a;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                x0 x0VarM8925h = AbstractC4154l.m8925h(serviceInfoArr2);
                                while (true) {
                                    if (x0VarM8925h.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) x0VarM8925h.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(AbstractC4154l.m8918a(bool, Boolean.FALSE));
                }
            }
        });
    }

    /* renamed from: a */
    public static CameraDevice.CameraDeviceSetup m13617a(C7290e c7290e) {
        C7851q c7851q = c7290e.f34765c;
        CameraManager cameraManager = (CameraManager) c7851q.f37624a.f5574b;
        String str = c7290e.f34764b;
        if (cameraManager.isCameraDeviceSetupSupported(str)) {
            return ((CameraManager) c7851q.f37624a.f5574b).getCameraDeviceSetup(str);
        }
        return null;
    }

    @Override // e0.InterfaceC1893b
    /* renamed from: f */
    public final boolean mo1989f(g2 g2Var) throws Exception {
        boolean zIsTerminated;
        C7288c c7288c;
        DynamicRangeProfiles dynamicRangeProfilesM9683c;
        OutputConfiguration outputConfiguration;
        q0 q0Var = g2Var.f16473g;
        ArrayList arrayList = g2Var.f16467a;
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C3080k c3080k = (C3080k) obj;
            if (((Boolean) this.f34770h.getValue()).booleanValue()) {
                AbstractC4154l.m8920c(c3080k);
                v0 v0Var = c3080k.f16501a;
                Class cls = v0Var.f16609j;
                Size size2 = v0Var.f16607h;
                Objects.toString(cls);
                u1.m10942a("FeatureCombinationQueryImpl");
                if (cls == null) {
                    outputConfiguration = new OutputConfiguration(v0Var.f16608i, size2);
                } else {
                    if (size2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    outputConfiguration = new OutputConfiguration(size2, cls);
                }
                c7288c = new C7288c(outputConfiguration, null);
            } else {
                AbstractC4154l.m8920c(c3080k);
                v0 v0Var2 = c3080k.f16501a;
                Class cls2 = v0Var2.f16609j;
                long j6 = AbstractC4154l.m8918a(cls2, MediaCodec.class) ? 65536L : AbstractC4154l.m8918a(cls2, SurfaceHolder.class) ? 2048L : AbstractC4154l.m8918a(cls2, SurfaceTexture.class) ? 256L : 0L;
                Class cls3 = v0Var2.f16609j;
                Size size3 = v0Var2.f16607h;
                Objects.toString(cls3);
                u1.m10942a("FeatureCombinationQueryImpl");
                ImageReader imageReaderNewInstance = ImageReader.newInstance(size3.getWidth(), size3.getHeight(), v0Var2.f16608i, 1, j6);
                AbstractC4154l.m8922e(imageReaderNewInstance, "newInstance(...)");
                c7288c = new C7288c(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
            }
            if (c3080k.f16501a.f16609j != null && (dynamicRangeProfilesM9683c = C4764c.m9683c(this.f34769g.getValue())) != null) {
                Long lM15404a = AbstractC8231a.m15404a(c3080k.f16505e, dynamicRangeProfilesM9683c);
                if (lM15404a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c7288c.f34760a.setDynamicRangeProfile(lM15404a.longValue());
            }
            arrayList2.add(c7288c);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
        int size4 = arrayList2.size();
        int i11 = 0;
        while (i11 < size4) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add(((C7288c) obj2).f34760a);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, t8.m11872a(), f34762j);
        CameraDevice.CameraDeviceSetup cameraDeviceSetup = (CameraDevice.CameraDeviceSetup) this.f34767e.getValue();
        if (cameraDeviceSetup == null) {
            sessionConfiguration = null;
        } else {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetup.createCaptureRequest(q0Var.f16567c);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, q0Var.m7410a());
            if (q0Var.m7411b() == 2) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i12 = ((InterfaceC8528d) this.f34766d.getValue()).mo15797a(sessionConfiguration).f8363b;
        StringBuilder sb2 = new StringBuilder("sessionParameters=[");
        sb2.append("fpsRange=" + q0Var.m7410a());
        sb2.append(", previewStabilizationMode=" + q0Var.m7411b());
        sb2.append("], outputConfigurations=[");
        int size5 = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size5) {
            Object obj3 = arrayList.get(i14);
            i14++;
            int i15 = i13 + 1;
            if (i13 < 0) {
                pe.m10842q();
                throw null;
            }
            C3080k c3080k2 = (C3080k) obj3;
            if (i13 != 0) {
                sb2.append(",");
            }
            StringBuilder sb3 = new StringBuilder("{format=");
            v0 v0Var3 = c3080k2.f16501a;
            sb3.append(v0Var3.f16608i);
            sb3.append(", size=");
            sb3.append(v0Var3.f16607h);
            sb3.append(", dynamicRange=");
            sb3.append(c3080k2.f16505e);
            sb3.append(", class=");
            sb3.append(v0Var3.f16609j);
            sb3.append('}');
            sb2.append(sb3.toString());
            i13 = i15;
        }
        sb2.append("]");
        AbstractC4154l.m8922e(sb2.toString(), "toString(...)");
        u1.m10942a("FeatureCombinationQueryImpl");
        boolean z6 = i12 == 1;
        int size6 = arrayList2.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj4 = arrayList2.get(i16);
            i16++;
            AutoCloseable autoCloseable = (AutoCloseable) obj4;
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z10 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z10) {
                                executorService.shutdownNow();
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        return z6;
    }
}
