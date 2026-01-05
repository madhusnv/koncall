package p001o;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class hy0 {

    /* renamed from: a */
    public final Context f27767a;

    /* renamed from: b */
    public final InterfaceC14125f f27768b;

    /* renamed from: c */
    public final Handler f27769c;

    /* renamed from: d */
    public final C14122c f27770d;

    /* renamed from: e */
    public final BroadcastReceiver f27771e;

    /* renamed from: f */
    public final C14123d f27772f;

    /* renamed from: g */
    public dy0 f27773g;

    /* renamed from: h */
    public iy0 f27774h;

    /* renamed from: i */
    public wx0 f27775i;

    /* renamed from: j */
    public boolean f27776j;

    /* renamed from: o.hy0$b */
    public static final class C14121b {
        /* renamed from: a */
        public static void m31281a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) op0.m42515e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        /* renamed from: b */
        public static void m31282b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) op0.m42515e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: o.hy0$c */
    public final class C14122c extends AudioDeviceCallback {
        public C14122c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            hy0 hy0Var = hy0.this;
            hy0Var.m31276f(dy0.m23939g(hy0Var.f27767a, hy0.this.f27775i, hy0.this.f27774h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (sqi.m48739r(audioDeviceInfoArr, hy0.this.f27774h)) {
                hy0.this.f27774h = null;
            }
            hy0 hy0Var = hy0.this;
            hy0Var.m31276f(dy0.m23939g(hy0Var.f27767a, hy0.this.f27775i, hy0.this.f27774h));
        }
    }

    /* renamed from: o.hy0$d */
    public final class C14123d extends ContentObserver {

        /* renamed from: a */
        public final ContentResolver f27778a;

        /* renamed from: b */
        public final Uri f27779b;

        public C14123d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f27778a = contentResolver;
            this.f27779b = uri;
        }

        /* renamed from: a */
        public void m31283a() {
            this.f27778a.registerContentObserver(this.f27779b, false, this);
        }

        /* renamed from: b */
        public void m31284b() {
            this.f27778a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            hy0 hy0Var = hy0.this;
            hy0Var.m31276f(dy0.m23939g(hy0Var.f27767a, hy0.this.f27775i, hy0.this.f27774h));
        }
    }

    /* renamed from: o.hy0$e */
    public final class C14124e extends BroadcastReceiver {
        public C14124e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            hy0 hy0Var = hy0.this;
            hy0Var.m31276f(dy0.m23938f(context, intent, hy0Var.f27775i, hy0.this.f27774h));
        }
    }

    /* renamed from: o.hy0$f */
    public interface InterfaceC14125f {
        /* renamed from: a */
        void mo31285a(dy0 dy0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hy0(Context context, InterfaceC14125f interfaceC14125f, wx0 wx0Var, iy0 iy0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f27767a = applicationContext;
        this.f27768b = (InterfaceC14125f) op0.m42515e(interfaceC14125f);
        this.f27775i = wx0Var;
        this.f27774h = iy0Var;
        Handler handlerM48697B = sqi.m48697B();
        this.f27769c = handlerM48697B;
        int i = sqi.f45790a;
        Object[] objArr = 0;
        this.f27770d = i >= 23 ? new C14122c() : null;
        this.f27771e = i >= 21 ? new C14124e() : null;
        Uri uriM23941j = dy0.m23941j();
        this.f27772f = uriM23941j != null ? new C14123d(handlerM48697B, applicationContext.getContentResolver(), uriM23941j) : null;
    }

    /* renamed from: f */
    public final void m31276f(dy0 dy0Var) {
        if (!this.f27776j || dy0Var.equals(this.f27773g)) {
            return;
        }
        this.f27773g = dy0Var;
        this.f27768b.mo31285a(dy0Var);
    }

    /* renamed from: g */
    public dy0 m31277g() {
        C14122c c14122c;
        if (this.f27776j) {
            return (dy0) op0.m42515e(this.f27773g);
        }
        this.f27776j = true;
        C14123d c14123d = this.f27772f;
        if (c14123d != null) {
            c14123d.m31283a();
        }
        if (sqi.f45790a >= 23 && (c14122c = this.f27770d) != null) {
            C14121b.m31281a(this.f27767a, c14122c, this.f27769c);
        }
        dy0 dy0VarM23938f = dy0.m23938f(this.f27767a, this.f27771e != null ? this.f27767a.registerReceiver(this.f27771e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f27769c) : null, this.f27775i, this.f27774h);
        this.f27773g = dy0VarM23938f;
        return dy0VarM23938f;
    }

    /* renamed from: h */
    public void m31278h(wx0 wx0Var) {
        this.f27775i = wx0Var;
        m31276f(dy0.m23939g(this.f27767a, wx0Var, this.f27774h));
    }

    /* renamed from: i */
    public void m31279i(AudioDeviceInfo audioDeviceInfo) {
        iy0 iy0Var = this.f27774h;
        if (sqi.m48724c(audioDeviceInfo, iy0Var == null ? null : iy0Var.f29353a)) {
            return;
        }
        iy0 iy0Var2 = audioDeviceInfo != null ? new iy0(audioDeviceInfo) : null;
        this.f27774h = iy0Var2;
        m31276f(dy0.m23939g(this.f27767a, this.f27775i, iy0Var2));
    }

    /* renamed from: j */
    public void m31280j() {
        C14122c c14122c;
        if (this.f27776j) {
            this.f27773g = null;
            if (sqi.f45790a >= 23 && (c14122c = this.f27770d) != null) {
                C14121b.m31282b(this.f27767a, c14122c);
            }
            BroadcastReceiver broadcastReceiver = this.f27771e;
            if (broadcastReceiver != null) {
                this.f27767a.unregisterReceiver(broadcastReceiver);
            }
            C14123d c14123d = this.f27772f;
            if (c14123d != null) {
                c14123d.m31284b();
            }
            this.f27776j = false;
        }
    }
}
