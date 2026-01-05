package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.exoplayer.C2222q;
import p001o.op0;
import p001o.ria;
import p001o.sqi;

/* renamed from: androidx.media3.exoplayer.q */
/* loaded from: classes2.dex */
public final class C2222q {

    /* renamed from: a */
    public final Context f8511a;

    /* renamed from: b */
    public final Handler f8512b;

    /* renamed from: c */
    public final b f8513c;

    /* renamed from: d */
    public final AudioManager f8514d;

    /* renamed from: e */
    public c f8515e;

    /* renamed from: f */
    public int f8516f;

    /* renamed from: g */
    public int f8517g;

    /* renamed from: h */
    public boolean f8518h;

    /* renamed from: androidx.media3.exoplayer.q$b */
    public interface b {
        /* renamed from: E */
        void mo7171E(int i, boolean z);

        /* renamed from: q */
        void mo7188q(int i);
    }

    /* renamed from: androidx.media3.exoplayer.q$c */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C2222q.this.f8512b;
            final C2222q c2222q = C2222q.this;
            handler.post(new Runnable() { // from class: o.o7g
                @Override // java.lang.Runnable
                public final void run() {
                    C2222q.m7452b(c2222q);
                }
            });
        }
    }

    public C2222q(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8511a = applicationContext;
        this.f8512b = handler;
        this.f8513c = bVar;
        AudioManager audioManager = (AudioManager) op0.m42519i((AudioManager) applicationContext.getSystemService("audio"));
        this.f8514d = audioManager;
        this.f8516f = 3;
        this.f8517g = m7454f(audioManager, 3);
        this.f8518h = m7453e(audioManager, this.f8516f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f8515e = cVar;
        } catch (RuntimeException e) {
            ria.m46825i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m7452b(C2222q c2222q) {
        c2222q.m7459i();
    }

    /* renamed from: e */
    public static boolean m7453e(AudioManager audioManager, int i) {
        return sqi.f45790a >= 23 ? audioManager.isStreamMute(i) : m7454f(audioManager, i) == 0;
    }

    /* renamed from: f */
    public static int m7454f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            ria.m46825i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: c */
    public int m7455c() {
        return this.f8514d.getStreamMaxVolume(this.f8516f);
    }

    /* renamed from: d */
    public int m7456d() {
        if (sqi.f45790a >= 28) {
            return this.f8514d.getStreamMinVolume(this.f8516f);
        }
        return 0;
    }

    /* renamed from: g */
    public void m7457g() {
        c cVar = this.f8515e;
        if (cVar != null) {
            try {
                this.f8511a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                ria.m46825i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f8515e = null;
        }
    }

    /* renamed from: h */
    public void m7458h(int i) {
        if (this.f8516f == i) {
            return;
        }
        this.f8516f = i;
        m7459i();
        this.f8513c.mo7188q(i);
    }

    /* renamed from: i */
    public final void m7459i() {
        int iM7454f = m7454f(this.f8514d, this.f8516f);
        boolean zM7453e = m7453e(this.f8514d, this.f8516f);
        if (this.f8517g == iM7454f && this.f8518h == zM7453e) {
            return;
        }
        this.f8517g = iM7454f;
        this.f8518h = zM7453e;
        this.f8513c.mo7171E(iM7454f, zM7453e);
    }
}
