package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.a */
/* loaded from: classes2.dex */
public final class C2191a {

    /* renamed from: a */
    public final Context f8123a;

    /* renamed from: b */
    public final a f8124b;

    /* renamed from: c */
    public boolean f8125c;

    /* renamed from: androidx.media3.exoplayer.a$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        public final b f8126a;

        /* renamed from: b */
        public final Handler f8127b;

        public a(Handler handler, b bVar) {
            this.f8127b = handler;
            this.f8126a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f8127b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2191a.this.f8125c) {
                this.f8126a.mo6847v();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.a$b */
    public interface b {
        /* renamed from: v */
        void mo6847v();
    }

    public C2191a(Context context, Handler handler, b bVar) {
        this.f8123a = context.getApplicationContext();
        this.f8124b = new a(handler, bVar);
    }

    /* renamed from: b */
    public void m6846b(boolean z) {
        if (z && !this.f8125c) {
            this.f8123a.registerReceiver(this.f8124b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f8125c = true;
        } else {
            if (z || !this.f8125c) {
                return;
            }
            this.f8123a.unregisterReceiver(this.f8124b);
            this.f8125c = false;
        }
    }
}
