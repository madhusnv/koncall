package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p001o.ch3;
import p001o.id5;
import p001o.irf;
import p001o.kp6;
import p001o.oti;
import p001o.sq8;
import p001o.taj;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class SidecarCompat implements kp6 {

    /* renamed from: f */
    public static final C2563a f10555f = new C2563a(null);

    /* renamed from: a */
    public final SidecarInterface f10556a;

    /* renamed from: b */
    public final irf f10557b;

    /* renamed from: c */
    public final Map f10558c;

    /* renamed from: d */
    public final Map f10559d;

    /* renamed from: e */
    public kp6.InterfaceC14897a f10560e;

    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        public final irf f10561a;

        /* renamed from: b */
        public final SidecarInterface.SidecarCallback f10562b;

        /* renamed from: c */
        public final ReentrantLock f10563c;

        /* renamed from: d */
        public SidecarDeviceState f10564d;

        /* renamed from: e */
        public final WeakHashMap f10565e;

        public DistinctSidecarElementCallback(irf irfVar, SidecarInterface.SidecarCallback sidecarCallback) {
            sq8.m48649h(irfVar, "sidecarAdapter");
            sq8.m48649h(sidecarCallback, "callbackInterface");
            this.f10561a = irfVar;
            this.f10562b = sidecarCallback;
            this.f10563c = new ReentrantLock();
            this.f10565e = new WeakHashMap();
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            sq8.m48649h(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f10563c;
            reentrantLock.lock();
            try {
                if (this.f10561a.m32631a(this.f10564d, sidecarDeviceState)) {
                    return;
                }
                this.f10564d = sidecarDeviceState;
                this.f10562b.onDeviceStateChanged(sidecarDeviceState);
                y3i y3iVar = y3i.f54824a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            sq8.m48649h(iBinder, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
            sq8.m48649h(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f10563c) {
                if (this.f10561a.m32634d((SidecarWindowLayoutInfo) this.f10565e.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f10562b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        public final /* synthetic */ SidecarCompat f10566a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            sq8.m48649h(sidecarCompat, "this$0");
            this.f10566a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterfaceM10090g;
            sq8.m48649h(sidecarDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f10566a.f10558c.values();
            SidecarCompat sidecarCompat = this.f10566a;
            for (Activity activity : collectionValues) {
                IBinder iBinderM10096a = SidecarCompat.f10555f.m10096a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderM10096a != null && (sidecarInterfaceM10090g = sidecarCompat.m10090g()) != null) {
                    windowLayoutInfo = sidecarInterfaceM10090g.getWindowLayoutInfo(iBinderM10096a);
                }
                kp6.InterfaceC14897a interfaceC14897a = sidecarCompat.f10560e;
                if (interfaceC14897a != null) {
                    interfaceC14897a.mo10099a(activity, sidecarCompat.f10557b.m32636f(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(iBinder, "windowToken");
            sq8.m48649h(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f10566a.f10558c.get(iBinder);
            if (activity == null) {
                return;
            }
            irf irfVar = this.f10566a.f10557b;
            SidecarInterface sidecarInterfaceM10090g = this.f10566a.m10090g();
            SidecarDeviceState deviceState = sidecarInterfaceM10090g == null ? null : sidecarInterfaceM10090g.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            taj tajVarM32636f = irfVar.m32636f(sidecarWindowLayoutInfo, deviceState);
            kp6.InterfaceC14897a interfaceC14897a = this.f10566a.f10560e;
            if (interfaceC14897a == null) {
                return;
            }
            interfaceC14897a.mo10099a(activity, tajVarM32636f);
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$a */
    public static final class C2563a {
        public C2563a() {
        }

        public /* synthetic */ C2563a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final IBinder m10096a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        /* renamed from: b */
        public final SidecarInterface m10097b(Context context) {
            sq8.m48649h(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        /* renamed from: c */
        public final oti m10098c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return oti.f38921f.m42696b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$b */
    public static final class C2564b implements kp6.InterfaceC14897a {

        /* renamed from: a */
        public final kp6.InterfaceC14897a f10567a;

        /* renamed from: b */
        public final ReentrantLock f10568b;

        /* renamed from: c */
        public final WeakHashMap f10569c;

        public C2564b(kp6.InterfaceC14897a interfaceC14897a) {
            sq8.m48649h(interfaceC14897a, "callbackInterface");
            this.f10567a = interfaceC14897a;
            this.f10568b = new ReentrantLock();
            this.f10569c = new WeakHashMap();
        }

        @Override // p001o.kp6.InterfaceC14897a
        /* renamed from: a */
        public void mo10099a(Activity activity, taj tajVar) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(tajVar, "newLayout");
            ReentrantLock reentrantLock = this.f10568b;
            reentrantLock.lock();
            try {
                if (sq8.m48644c(tajVar, (taj) this.f10569c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f10567a.mo10099a(activity, tajVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$c */
    public static final class ViewOnAttachStateChangeListenerC2565c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final SidecarCompat f10570a;

        /* renamed from: b */
        public final WeakReference f10571b;

        public ViewOnAttachStateChangeListenerC2565c(SidecarCompat sidecarCompat, Activity activity) {
            sq8.m48649h(sidecarCompat, "sidecarCompat");
            sq8.m48649h(activity, "activity");
            this.f10570a = sidecarCompat;
            this.f10571b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sq8.m48649h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f10571b.get();
            IBinder iBinderM10096a = SidecarCompat.f10555f.m10096a(activity);
            if (activity == null || iBinderM10096a == null) {
                return;
            }
            this.f10570a.m10092i(iBinderM10096a, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            sq8.m48649h(view, "view");
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$d */
    public static final class ComponentCallbacksC2566d implements ComponentCallbacks {

        /* renamed from: b */
        public final /* synthetic */ Activity f10573b;

        public ComponentCallbacksC2566d(Activity activity) {
            this.f10573b = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            sq8.m48649h(configuration, "newConfig");
            kp6.InterfaceC14897a interfaceC14897a = SidecarCompat.this.f10560e;
            if (interfaceC14897a == null) {
                return;
            }
            Activity activity = this.f10573b;
            interfaceC14897a.mo10099a(activity, SidecarCompat.this.m10091h(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, irf irfVar) {
        sq8.m48649h(irfVar, "sidecarAdapter");
        this.f10556a = sidecarInterface;
        this.f10557b = irfVar;
        this.f10558c = new LinkedHashMap();
        this.f10559d = new LinkedHashMap();
    }

    @Override // p001o.kp6
    /* renamed from: a */
    public void mo10087a(Activity activity) {
        sq8.m48649h(activity, "activity");
        IBinder iBinderM10096a = f10555f.m10096a(activity);
        if (iBinderM10096a != null) {
            m10092i(iBinderM10096a, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2565c(this, activity));
        }
    }

    @Override // p001o.kp6
    /* renamed from: b */
    public void mo10088b(Activity activity) {
        SidecarInterface sidecarInterface;
        sq8.m48649h(activity, "activity");
        IBinder iBinderM10096a = f10555f.m10096a(activity);
        if (iBinderM10096a == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f10556a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderM10096a);
        }
        m10094k(activity);
        boolean z = this.f10558c.size() == 1;
        this.f10558c.remove(iBinderM10096a);
        if (!z || (sidecarInterface = this.f10556a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Override // p001o.kp6
    /* renamed from: c */
    public void mo10089c(kp6.InterfaceC14897a interfaceC14897a) {
        sq8.m48649h(interfaceC14897a, "extensionCallback");
        this.f10560e = new C2564b(interfaceC14897a);
        SidecarInterface sidecarInterface = this.f10556a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f10557b, new TranslatingCallback(this)));
    }

    /* renamed from: g */
    public final SidecarInterface m10090g() {
        return this.f10556a;
    }

    /* renamed from: h */
    public final taj m10091h(Activity activity) {
        sq8.m48649h(activity, "activity");
        IBinder iBinderM10096a = f10555f.m10096a(activity);
        if (iBinderM10096a == null) {
            return new taj(ch3.m21246k());
        }
        SidecarInterface sidecarInterface = this.f10556a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderM10096a);
        irf irfVar = this.f10557b;
        SidecarInterface sidecarInterface2 = this.f10556a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return irfVar.m32636f(windowLayoutInfo, deviceState);
    }

    /* renamed from: i */
    public final void m10092i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        sq8.m48649h(iBinder, "windowToken");
        sq8.m48649h(activity, "activity");
        this.f10558c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f10556a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f10558c.size() == 1 && (sidecarInterface = this.f10556a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        kp6.InterfaceC14897a interfaceC14897a = this.f10560e;
        if (interfaceC14897a != null) {
            interfaceC14897a.mo10099a(activity, m10091h(activity));
        }
        m10093j(activity);
    }

    /* renamed from: j */
    public final void m10093j(Activity activity) {
        if (this.f10559d.get(activity) == null) {
            ComponentCallbacksC2566d componentCallbacksC2566d = new ComponentCallbacksC2566d(activity);
            this.f10559d.put(activity, componentCallbacksC2566d);
            activity.registerComponentCallbacks(componentCallbacksC2566d);
        }
    }

    /* renamed from: k */
    public final void m10094k(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks) this.f10559d.get(activity));
        this.f10559d.remove(activity);
    }

    /* renamed from: l */
    public boolean m10095l() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f10556a;
            Class<?> returnType = null;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType2 = method == null ? null : method.getReturnType();
            if (!sq8.m48644c(returnType2, Void.TYPE)) {
                throw new NoSuchMethodException(sq8.m48658q("Illegal return type for 'setSidecarCallback': ", returnType2));
            }
            SidecarInterface sidecarInterface2 = this.f10556a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f10556a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f10556a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType3 = method2 == null ? null : method2.getReturnType();
            if (!sq8.m48644c(returnType3, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(sq8.m48658q("Illegal return type for 'getWindowLayoutInfo': ", returnType3));
            }
            SidecarInterface sidecarInterface5 = this.f10556a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType4 = method3 == null ? null : method3.getReturnType();
            if (!sq8.m48644c(returnType4, Void.TYPE)) {
                throw new NoSuchMethodException(sq8.m48658q("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType4));
            }
            SidecarInterface sidecarInterface6 = this.f10556a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            if (method4 != null) {
                returnType = method4.getReturnType();
            }
            if (!sq8.m48644c(returnType, Void.TYPE)) {
                throw new NoSuchMethodException(sq8.m48658q("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            sq8.m48648g(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!sq8.m48644c(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SidecarCompat(Context context) {
        this(f10555f.m10097b(context), new irf(null, 1, 0 == true ? 1 : 0));
        sq8.m48649h(context, "context");
    }
}
