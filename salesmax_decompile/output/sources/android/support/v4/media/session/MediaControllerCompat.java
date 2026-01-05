package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.InterfaceC1733a;
import android.support.v4.media.session.InterfaceC1734b;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001o.gn1;
import p001o.swc;

/* loaded from: classes2.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final InterfaceC1706b f5145a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f5146b;

    /* renamed from: c */
    public final Set f5147c;

    public static class MediaControllerImplApi21 implements InterfaceC1706b {

        /* renamed from: a */
        public final MediaController f5148a;

        /* renamed from: b */
        public final Object f5149b = new Object();

        /* renamed from: c */
        public final List f5150c = new ArrayList();

        /* renamed from: d */
        public HashMap f5151d = new HashMap();

        /* renamed from: e */
        public final MediaSessionCompat.Token f5152e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference f5153a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f5153a = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f5153a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f5149b) {
                    mediaControllerImplApi21.f5152e.m3591f(InterfaceC1734b.a.L0(gn1.m29145a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f5152e.m3592g(swc.m48965b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.m3533g();
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC1704a extends AbstractC1705a.c {
            public BinderC1704a(AbstractC1705a abstractC1705a) {
                super(abstractC1705a);
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: I */
            public void mo3536I() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: K */
            public void mo3537K(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void a0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void j0(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void t0(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: x */
            public void mo3538x(List list) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f5152e = token;
            this.f5148a = new MediaController(context, (MediaSession.Token) token.m3590e());
            if (token.m3588c() == null) {
                m3534h();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: a */
        public final void mo3527a(AbstractC1705a abstractC1705a) {
            this.f5148a.unregisterCallback(abstractC1705a.f5154a);
            synchronized (this.f5149b) {
                if (this.f5152e.m3588c() != null) {
                    try {
                        BinderC1704a binderC1704a = (BinderC1704a) this.f5151d.remove(abstractC1705a);
                        if (binderC1704a != null) {
                            abstractC1705a.f5156c = null;
                            this.f5152e.m3588c().n0(binderC1704a);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f5150c.remove(abstractC1705a);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: b */
        public PendingIntent mo3528b() {
            return this.f5148a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: c */
        public PlaybackStateCompat mo3529c() {
            if (this.f5152e.m3588c() != null) {
                try {
                    return this.f5152e.m3588c().mo3629c();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.f5148a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.m3648a(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: d */
        public AbstractC1709e mo3530d() {
            MediaController.TransportControls transportControls = this.f5148a.getTransportControls();
            return Build.VERSION.SDK_INT >= 29 ? new C1713i(transportControls) : new C1712h(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: e */
        public boolean mo3531e(KeyEvent keyEvent) {
            return this.f5148a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        /* renamed from: f */
        public final void mo3532f(AbstractC1705a abstractC1705a, Handler handler) {
            this.f5148a.registerCallback(abstractC1705a.f5154a, handler);
            synchronized (this.f5149b) {
                if (this.f5152e.m3588c() != null) {
                    BinderC1704a binderC1704a = new BinderC1704a(abstractC1705a);
                    this.f5151d.put(abstractC1705a, binderC1704a);
                    abstractC1705a.f5156c = binderC1704a;
                    try {
                        this.f5152e.m3588c().b0(binderC1704a);
                        abstractC1705a.m3551m(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    abstractC1705a.f5156c = null;
                    this.f5150c.add(abstractC1705a);
                }
            }
        }

        /* renamed from: g */
        public void m3533g() {
            if (this.f5152e.m3588c() == null) {
                return;
            }
            for (AbstractC1705a abstractC1705a : this.f5150c) {
                BinderC1704a binderC1704a = new BinderC1704a(abstractC1705a);
                this.f5151d.put(abstractC1705a, binderC1704a);
                abstractC1705a.f5156c = binderC1704a;
                try {
                    this.f5152e.m3588c().b0(binderC1704a);
                    abstractC1705a.m3551m(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.f5150c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC1706b
        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.f5148a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.m3486b(metadata);
            }
            return null;
        }

        /* renamed from: h */
        public final void m3534h() {
            m3535i("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: i */
        public void m3535i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f5148a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC1705a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final MediaController.Callback f5154a = new a(this);

        /* renamed from: b */
        public b f5155b;

        /* renamed from: c */
        public InterfaceC1733a f5156c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public static class a extends MediaController.Callback {

            /* renamed from: a */
            public final WeakReference f5157a;

            public a(AbstractC1705a abstractC1705a) {
                this.f5157a = new WeakReference(abstractC1705a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3539a(new C1708d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m6610c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m3559a(bundle);
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3541c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.mo3542d(MediaMetadataCompat.m3486b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a == null || abstractC1705a.f5156c != null) {
                    return;
                }
                abstractC1705a.mo3543e(PlaybackStateCompat.m3648a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List list) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3544f(MediaSessionCompat.QueueItem.m3577b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3545g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.mo3547i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m3559a(bundle);
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5157a.get();
                if (abstractC1705a != null) {
                    InterfaceC1733a interfaceC1733a = abstractC1705a.f5156c;
                    abstractC1705a.m3548j(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public class b extends Handler {

            /* renamed from: a */
            public boolean f5158a;

            public b(Looper looper) {
                super(looper);
                this.f5158a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f5158a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m3559a(data);
                            AbstractC1705a.this.m3548j((String) message.obj, data);
                            break;
                        case 2:
                            AbstractC1705a.this.mo3543e((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            AbstractC1705a.this.mo3542d((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            AbstractC1705a.this.m3539a((C1708d) message.obj);
                            break;
                        case 5:
                            AbstractC1705a.this.m3544f((List) message.obj);
                            break;
                        case 6:
                            AbstractC1705a.this.m3545g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m3559a(bundle);
                            AbstractC1705a.this.m3541c(bundle);
                            break;
                        case 8:
                            AbstractC1705a.this.mo3547i();
                            break;
                        case 9:
                            AbstractC1705a.this.m3546h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            AbstractC1705a.this.m3540b(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            AbstractC1705a.this.m3550l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            AbstractC1705a.this.m3549k();
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        public static class c extends InterfaceC1733a.a {

            /* renamed from: a */
            public final WeakReference f5160a;

            public c(AbstractC1705a abstractC1705a) {
                this.f5160a = new WeakReference(abstractC1705a);
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void K0(PlaybackStateCompat playbackStateCompat) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: R */
            public void mo3553R(int i) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void onEvent(String str, Bundle bundle) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void p0(boolean z) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void r0(boolean z) {
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: v */
            public void mo3554v(int i) {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: w */
            public void mo3555w() {
                AbstractC1705a abstractC1705a = (AbstractC1705a) this.f5160a.get();
                if (abstractC1705a != null) {
                    abstractC1705a.m3551m(13, null, null);
                }
            }
        }

        /* renamed from: a */
        public void m3539a(C1708d c1708d) {
        }

        /* renamed from: b */
        public void m3540b(boolean z) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m3551m(8, null, null);
        }

        /* renamed from: c */
        public void m3541c(Bundle bundle) {
        }

        /* renamed from: d */
        public abstract void mo3542d(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: e */
        public void mo3543e(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: f */
        public void m3544f(List list) {
        }

        /* renamed from: g */
        public void m3545g(CharSequence charSequence) {
        }

        /* renamed from: h */
        public void m3546h(int i) {
        }

        /* renamed from: i */
        public abstract void mo3547i();

        /* renamed from: j */
        public void m3548j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void m3549k() {
        }

        /* renamed from: l */
        public void m3550l(int i) {
        }

        /* renamed from: m */
        public void m3551m(int i, Object obj, Bundle bundle) {
            b bVar = this.f5155b;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        /* renamed from: n */
        public void m3552n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f5155b = bVar;
                bVar.f5158a = true;
            } else {
                b bVar2 = this.f5155b;
                if (bVar2 != null) {
                    bVar2.f5158a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f5155b = null;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface InterfaceC1706b {
        /* renamed from: a */
        void mo3527a(AbstractC1705a abstractC1705a);

        /* renamed from: b */
        PendingIntent mo3528b();

        /* renamed from: c */
        PlaybackStateCompat mo3529c();

        /* renamed from: d */
        AbstractC1709e mo3530d();

        /* renamed from: e */
        boolean mo3531e(KeyEvent keyEvent);

        /* renamed from: f */
        void mo3532f(AbstractC1705a abstractC1705a, Handler handler);

        MediaMetadataCompat getMetadata();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static class C1707c extends MediaControllerImplApi21 {
        public C1707c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static final class C1708d {

        /* renamed from: a */
        public final int f5161a;

        /* renamed from: b */
        public final AudioAttributesCompat f5162b;

        /* renamed from: c */
        public final int f5163c;

        /* renamed from: d */
        public final int f5164d;

        /* renamed from: e */
        public final int f5165e;

        public C1708d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f5161a = i;
            this.f5162b = audioAttributesCompat;
            this.f5163c = i2;
            this.f5164d = i3;
            this.f5165e = i4;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static abstract class AbstractC1709e {
        /* renamed from: a */
        public abstract void mo3556a();

        /* renamed from: b */
        public abstract void mo3557b();

        /* renamed from: c */
        public abstract void mo3558c();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static class C1710f extends AbstractC1709e {

        /* renamed from: a */
        public final MediaController.TransportControls f5166a;

        public C1710f(MediaController.TransportControls transportControls) {
            this.f5166a = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1709e
        /* renamed from: a */
        public void mo3556a() {
            this.f5166a.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1709e
        /* renamed from: b */
        public void mo3557b() {
            this.f5166a.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC1709e
        /* renamed from: c */
        public void mo3558c() {
            this.f5166a.stop();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    public static class C1711g extends C1710f {
        public C1711g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    public static class C1712h extends C1711g {
        public C1712h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    public static class C1713i extends C1712h {
        public C1713i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.m3564d());
    }

    /* renamed from: a */
    public boolean m3519a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f5145a.mo3531e(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public MediaMetadataCompat m3520b() {
        return this.f5145a.getMetadata();
    }

    /* renamed from: c */
    public PlaybackStateCompat m3521c() {
        return this.f5145a.mo3529c();
    }

    /* renamed from: d */
    public PendingIntent m3522d() {
        return this.f5145a.mo3528b();
    }

    /* renamed from: e */
    public AbstractC1709e m3523e() {
        return this.f5145a.mo3530d();
    }

    /* renamed from: f */
    public void m3524f(AbstractC1705a abstractC1705a) {
        m3525g(abstractC1705a, null);
    }

    /* renamed from: g */
    public void m3525g(AbstractC1705a abstractC1705a, Handler handler) {
        if (abstractC1705a == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f5147c.add(abstractC1705a)) {
            if (handler == null) {
                handler = new Handler();
            }
            abstractC1705a.m3552n(handler);
            this.f5145a.mo3532f(abstractC1705a, handler);
        }
    }

    /* renamed from: h */
    public void m3526h(AbstractC1705a abstractC1705a) {
        if (abstractC1705a == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f5147c.remove(abstractC1705a)) {
            try {
                this.f5145a.mo3527a(abstractC1705a);
            } finally {
                abstractC1705a.m3552n(null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f5147c = Collections.synchronizedSet(new HashSet());
        this.f5146b = token;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5145a = new C1707c(context, token);
        } else {
            this.f5145a = new MediaControllerImplApi21(context, token);
        }
    }
}
