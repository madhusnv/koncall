package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.InterfaceC1734b;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p001o.gn1;
import p001o.m2j;
import p001o.o8b;
import p001o.p8b;
import p001o.swc;
import p001o.xti;

/* loaded from: classes2.dex */
public class MediaSessionCompat {

    /* renamed from: d */
    public static int f5167d;

    /* renamed from: a */
    public final InterfaceC1720c f5168a;

    /* renamed from: b */
    public final MediaControllerCompat f5169b;

    /* renamed from: c */
    public final ArrayList f5170c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C1716a();

        /* renamed from: a */
        public ResultReceiver f5174a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C1716a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f5174a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f5174a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C1717a();

        /* renamed from: a */
        public final Object f5175a;

        /* renamed from: b */
        public final Object f5176b;

        /* renamed from: c */
        public InterfaceC1734b f5177c;

        /* renamed from: d */
        public xti f5178d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C1717a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m3586a(Object obj) {
            return m3587b(obj, null);
        }

        /* renamed from: b */
        public static Token m3587b(Object obj, InterfaceC1734b interfaceC1734b) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, interfaceC1734b);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* renamed from: c */
        public InterfaceC1734b m3588c() {
            InterfaceC1734b interfaceC1734b;
            synchronized (this.f5175a) {
                interfaceC1734b = this.f5177c;
            }
            return interfaceC1734b;
        }

        /* renamed from: d */
        public xti m3589d() {
            xti xtiVar;
            synchronized (this.f5175a) {
                xtiVar = this.f5178d;
            }
            return xtiVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Object m3590e() {
            return this.f5176b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f5176b;
            if (obj2 == null) {
                return token.f5176b == null;
            }
            Object obj3 = token.f5176b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: f */
        public void m3591f(InterfaceC1734b interfaceC1734b) {
            synchronized (this.f5175a) {
                this.f5177c = interfaceC1734b;
            }
        }

        /* renamed from: g */
        public void m3592g(xti xtiVar) {
            synchronized (this.f5175a) {
                this.f5178d = xtiVar;
            }
        }

        public int hashCode() {
            Object obj = this.f5176b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f5176b, i);
        }

        public Token(Object obj, InterfaceC1734b interfaceC1734b) {
            this(obj, interfaceC1734b, null);
        }

        public Token(Object obj, InterfaceC1734b interfaceC1734b, xti xtiVar) {
            this.f5175a = new Object();
            this.f5176b = obj;
            this.f5177c = interfaceC1734b;
            this.f5178d = xtiVar;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public class C1718a extends AbstractC1719b {
        public C1718a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class AbstractC1719b {
        a mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final Object mLock = new Object();
        final MediaSession.Callback mCallbackFwk = new b();
        WeakReference<InterfaceC1720c> mSessionImpl = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                InterfaceC1720c interfaceC1720c;
                AbstractC1719b abstractC1719b;
                a aVar;
                if (message.what == 1) {
                    synchronized (AbstractC1719b.this.mLock) {
                        interfaceC1720c = AbstractC1719b.this.mSessionImpl.get();
                        abstractC1719b = AbstractC1719b.this;
                        aVar = abstractC1719b.mCallbackHandler;
                    }
                    if (interfaceC1720c == null || abstractC1719b != interfaceC1720c.mo3607j() || aVar == null) {
                        return;
                    }
                    interfaceC1720c.mo3605h((p8b) message.obj);
                    AbstractC1719b.this.handleMediaPlayPauseIfPendingOnHandler(interfaceC1720c, aVar);
                    interfaceC1720c.mo3605h(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        public class b extends MediaSession.Callback {
            public b() {
            }

            /* renamed from: a */
            public final void m3595a(InterfaceC1720c interfaceC1720c) {
                interfaceC1720c.mo3605h(null);
            }

            /* renamed from: b */
            public final C1721d m3596b() {
                C1721d c1721d;
                synchronized (AbstractC1719b.this.mLock) {
                    c1721d = (C1721d) AbstractC1719b.this.mSessionImpl.get();
                }
                if (c1721d == null || AbstractC1719b.this != c1721d.mo3607j()) {
                    return null;
                }
                return c1721d;
            }

            /* renamed from: c */
            public final void m3597c(InterfaceC1720c interfaceC1720c) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strMo3603f = interfaceC1720c.mo3603f();
                if (TextUtils.isEmpty(strMo3603f)) {
                    strMo3603f = "android.media.session.MediaController";
                }
                interfaceC1720c.mo3605h(new p8b(strMo3603f, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = c1721dM3596b.getSessionToken();
                        InterfaceC1734b interfaceC1734bM3588c = sessionToken.m3588c();
                        if (interfaceC1734bM3588c != null) {
                            iBinderAsBinder = interfaceC1734bM3588c.asBinder();
                        }
                        gn1.m29146b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                        swc.m48966c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", sessionToken.m3589d());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        AbstractC1719b.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        AbstractC1719b.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        AbstractC1719b.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        AbstractC1719b.this.onCommand(str, bundle, resultReceiver);
                    } else if (c1721dM3596b.f5190i != null) {
                        int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if (i >= 0 && i < c1721dM3596b.f5190i.size()) {
                            queueItem = (QueueItem) c1721dM3596b.f5190i.get(i);
                        }
                        if (queueItem != null) {
                            AbstractC1719b.this.onRemoveQueueItem(queueItem.m3578c());
                        }
                    }
                } catch (BadParcelableException unused) {
                }
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m3559a(bundle2);
                        AbstractC1719b.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        AbstractC1719b.this.onPrepare();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m3559a(bundle3);
                        AbstractC1719b.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m3559a(bundle4);
                        AbstractC1719b.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m3559a(bundle5);
                        AbstractC1719b.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        AbstractC1719b.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        AbstractC1719b.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        AbstractC1719b.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m3559a(bundle6);
                        AbstractC1719b.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        AbstractC1719b.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        AbstractC1719b.this.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                }
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onFastForward();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return false;
                }
                m3597c(c1721dM3596b);
                boolean zOnMediaButtonEvent = AbstractC1719b.this.onMediaButtonEvent(intent);
                m3595a(c1721dM3596b);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPause();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPlay();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPlayFromMediaId(str, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPlayFromSearch(str, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPlayFromUri(uri, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPrepare();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPrepareFromMediaId(str, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPrepareFromSearch(str, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                MediaSessionCompat.m3559a(bundle);
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onPrepareFromUri(uri, bundle);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onRewind();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSeekTo(j);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSetPlaybackSpeed(f);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSetRating(RatingCompat.m3500a(rating));
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSkipToNext();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSkipToPrevious();
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onSkipToQueueItem(j);
                m3595a(c1721dM3596b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                C1721d c1721dM3596b = m3596b();
                if (c1721dM3596b == null) {
                    return;
                }
                m3597c(c1721dM3596b);
                AbstractC1719b.this.onStop();
                m3595a(c1721dM3596b);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(InterfaceC1720c interfaceC1720c, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatMo3600c = interfaceC1720c.mo3600c();
                long jM3649b = playbackStateCompatMo3600c == null ? 0L : playbackStateCompatMo3600c.m3649b();
                boolean z = playbackStateCompatMo3600c != null && playbackStateCompatMo3600c.m3654g() == 3;
                boolean z2 = (516 & jM3649b) != 0;
                boolean z3 = (jM3649b & 514) != 0;
                if (z && z3) {
                    onPause();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            InterfaceC1720c interfaceC1720c;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                interfaceC1720c = this.mSessionImpl.get();
                aVar = this.mCallbackHandler;
            }
            if (interfaceC1720c == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            p8b p8bVarMo3612o = interfaceC1720c.mo3612o();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseIfPendingOnHandler(interfaceC1720c, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                handleMediaPlayPauseIfPendingOnHandler(interfaceC1720c, aVar);
            } else if (this.mMediaPlayPausePendingOnHandler) {
                aVar.removeMessages(1);
                this.mMediaPlayPausePendingOnHandler = false;
                PlaybackStateCompat playbackStateCompatMo3600c = interfaceC1720c.mo3600c();
                if (((playbackStateCompatMo3600c == null ? 0L : playbackStateCompatMo3600c.m3649b()) & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.mMediaPlayPausePendingOnHandler = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, p8bVarMo3612o), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void setSessionImpl(InterfaceC1720c interfaceC1720c, Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new WeakReference<>(interfaceC1720c);
                a aVar = this.mCallbackHandler;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                if (interfaceC1720c != null && handler != null) {
                    aVar2 = new a(handler.getLooper());
                }
                this.mCallbackHandler = aVar2;
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public interface InterfaceC1720c {
        /* renamed from: a */
        boolean mo3598a();

        /* renamed from: b */
        void mo3599b(AbstractC1719b abstractC1719b, Handler handler);

        /* renamed from: c */
        PlaybackStateCompat mo3600c();

        /* renamed from: d */
        void mo3601d(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: e */
        void mo3602e(PlaybackStateCompat playbackStateCompat);

        /* renamed from: f */
        String mo3603f();

        /* renamed from: g */
        void mo3604g(PendingIntent pendingIntent);

        Token getSessionToken();

        /* renamed from: h */
        void mo3605h(p8b p8bVar);

        /* renamed from: i */
        void mo3606i(int i);

        /* renamed from: j */
        AbstractC1719b mo3607j();

        /* renamed from: k */
        void mo3608k(PendingIntent pendingIntent);

        /* renamed from: l */
        Object mo3609l();

        /* renamed from: m */
        void mo3610m(boolean z);

        /* renamed from: n */
        void mo3611n(m2j m2jVar);

        /* renamed from: o */
        p8b mo3612o();

        void release();

        void setExtras(Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static class C1721d implements InterfaceC1720c {

        /* renamed from: a */
        public final MediaSession f5182a;

        /* renamed from: b */
        public final a f5183b;

        /* renamed from: c */
        public final Token f5184c;

        /* renamed from: e */
        public Bundle f5186e;

        /* renamed from: h */
        public PlaybackStateCompat f5189h;

        /* renamed from: i */
        public List f5190i;

        /* renamed from: j */
        public MediaMetadataCompat f5191j;

        /* renamed from: k */
        public int f5192k;

        /* renamed from: l */
        public boolean f5193l;

        /* renamed from: m */
        public int f5194m;

        /* renamed from: n */
        public int f5195n;

        /* renamed from: o */
        public AbstractC1719b f5196o;

        /* renamed from: p */
        public p8b f5197p;

        /* renamed from: d */
        public final Object f5185d = new Object();

        /* renamed from: f */
        public boolean f5187f = false;

        /* renamed from: g */
        public final RemoteCallbackList f5188g = new RemoteCallbackList();

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        public static class a extends InterfaceC1734b.a {

            /* renamed from: a */
            public final AtomicReference f5198a;

            public a(C1721d c1721d) {
                this.f5198a = new AtomicReference(c1721d);
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: A */
            public void mo3615A(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public List D0() {
                return null;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: E */
            public void mo3616E(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public ParcelableVolumeInfo E0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: F */
            public boolean mo3617F(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: G */
            public void mo3618G(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: J */
            public void mo3619J(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public void M0() {
                this.f5198a.set(null);
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: N */
            public int mo3620N() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d != null) {
                    return c1721d.f5195n;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: O */
            public void mo3621O(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: P */
            public boolean mo3622P() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                return c1721d != null && c1721d.f5193l;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: S */
            public void mo3623S(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: T */
            public void mo3624T() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: W */
            public void mo3625W(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: X */
            public void mo3626X(boolean z) {
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: Y */
            public void mo3627Y(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: b */
            public String mo3628b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void b0(InterfaceC1733a interfaceC1733a) {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d == null) {
                    return;
                }
                c1721d.f5188g.register(interfaceC1733a, new p8b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (c1721d.f5185d) {
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: c */
            public PlaybackStateCompat mo3629c() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d != null) {
                    return MediaSessionCompat.m3560e(c1721d.f5189h, c1721d.f5191j);
                }
                return null;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void c0(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void d0(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void e0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: f */
            public void mo3630f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public boolean f0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: g */
            public void mo3631g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void g0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: h */
            public void mo3632h(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: i */
            public void mo3633i(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void i0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: j */
            public void mo3634j(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: k */
            public long mo3635k() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: l */
            public int mo3636l() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d != null) {
                    return c1721d.f5194m;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: m */
            public void mo3637m(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public CharSequence m0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: n */
            public boolean mo3638n() {
                return false;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void n0(InterfaceC1733a interfaceC1733a) {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d == null) {
                    return;
                }
                c1721d.f5188g.unregister(interfaceC1733a);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (c1721d.f5185d) {
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: o */
            public void mo3639o(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void o0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: p */
            public PendingIntent mo3640p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: q */
            public int mo3641q() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d != null) {
                    return c1721d.f5192k;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: r */
            public void mo3642r(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: t */
            public Bundle mo3643t() {
                C1721d c1721d = (C1721d) this.f5198a.get();
                if (c1721d.f5186e == null) {
                    return null;
                }
                return new Bundle(c1721d.f5186e);
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void u0(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void y0(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: z */
            public void mo3644z(String str, Bundle bundle) {
                throw new AssertionError();
            }
        }

        public C1721d(Context context, String str, xti xtiVar, Bundle bundle) {
            MediaSession mediaSessionMo3613p = mo3613p(context, str, bundle);
            this.f5182a = mediaSessionMo3613p;
            a aVar = new a(this);
            this.f5183b = aVar;
            this.f5184c = new Token(mediaSessionMo3613p.getSessionToken(), aVar, xtiVar);
            this.f5186e = bundle;
            m3614q(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: a */
        public boolean mo3598a() {
            return this.f5182a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: b */
        public void mo3599b(AbstractC1719b abstractC1719b, Handler handler) {
            synchronized (this.f5185d) {
                this.f5196o = abstractC1719b;
                this.f5182a.setCallback(abstractC1719b == null ? null : abstractC1719b.mCallbackFwk, handler);
                if (abstractC1719b != null) {
                    abstractC1719b.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: c */
        public PlaybackStateCompat mo3600c() {
            return this.f5189h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: d */
        public void mo3601d(MediaMetadataCompat mediaMetadataCompat) {
            this.f5191j = mediaMetadataCompat;
            this.f5182a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.m3491f());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: e */
        public void mo3602e(PlaybackStateCompat playbackStateCompat) {
            this.f5189h = playbackStateCompat;
            synchronized (this.f5185d) {
                for (int iBeginBroadcast = this.f5188g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((InterfaceC1733a) this.f5188g.getBroadcastItem(iBeginBroadcast)).K0(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5188g.finishBroadcast();
            }
            this.f5182a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.m3652e());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: f */
        public String mo3603f() {
            try {
                return (String) this.f5182a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f5182a, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: g */
        public void mo3604g(PendingIntent pendingIntent) {
            this.f5182a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        public Token getSessionToken() {
            return this.f5184c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: h */
        public void mo3605h(p8b p8bVar) {
            synchronized (this.f5185d) {
                this.f5197p = p8bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: i */
        public void mo3606i(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f5182a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: j */
        public AbstractC1719b mo3607j() {
            AbstractC1719b abstractC1719b;
            synchronized (this.f5185d) {
                abstractC1719b = this.f5196o;
            }
            return abstractC1719b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: k */
        public void mo3608k(PendingIntent pendingIntent) {
            this.f5182a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: l */
        public Object mo3609l() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: m */
        public void mo3610m(boolean z) {
            this.f5182a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: n */
        public void mo3611n(m2j m2jVar) {
            this.f5182a.setPlaybackToRemote((VolumeProvider) m2jVar.m38222a());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: o */
        public p8b mo3612o() {
            p8b p8bVar;
            synchronized (this.f5185d) {
                p8bVar = this.f5197p;
            }
            return p8bVar;
        }

        /* renamed from: p */
        public MediaSession mo3613p(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        /* renamed from: q */
        public void m3614q(int i) {
            this.f5182a.setFlags(i | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        public void release() throws NoSuchFieldException, SecurityException {
            this.f5187f = true;
            this.f5188g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f5182a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f5182a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception unused) {
                }
            }
            this.f5182a.setCallback(null);
            this.f5183b.M0();
            this.f5182a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        public void setExtras(Bundle bundle) {
            this.f5182a.setExtras(bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public static class C1722e extends C1721d {
        public C1722e(Context context, String str, xti xtiVar, Bundle bundle) {
            super(context, str, xtiVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C1723f extends C1722e {
        public C1723f(Context context, String str, xti xtiVar, Bundle bundle) {
            super(context, str, xtiVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C1721d, android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: h */
        public void mo3605h(p8b p8bVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C1721d, android.support.v4.media.session.MediaSessionCompat.InterfaceC1720c
        /* renamed from: o */
        public final p8b mo3612o() {
            return new p8b(this.f5182a.getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public static class C1724g extends C1723f {
        public C1724g(Context context, String str, xti xtiVar, Bundle bundle) {
            super(context, str, xtiVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C1721d
        /* renamed from: p */
        public MediaSession mo3613p(Context context, String str, Bundle bundle) {
            return o8b.m41769a(context, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    public interface InterfaceC1725h {
        /* renamed from: a */
        void mo3645a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    /* renamed from: a */
    public static void m3559a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: e */
    public static PlaybackStateCompat m3560e(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long jM3490e = -1;
        if (playbackStateCompat.m3653f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.m3654g() != 3 && playbackStateCompat.m3654g() != 4 && playbackStateCompat.m3654g() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.m3650c() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM3651d = ((long) (playbackStateCompat.m3651d() * (jElapsedRealtime - r0))) + playbackStateCompat.m3653f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.m3487a("android.media.metadata.DURATION")) {
            jM3490e = mediaMetadataCompat.m3490e("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.C1732d(playbackStateCompat).m3692e(playbackStateCompat.m3654g(), (jM3490e < 0 || jM3651d <= jM3490e) ? jM3651d < 0 ? 0L : jM3651d : jM3490e, playbackStateCompat.m3651d(), jElapsedRealtime).m3689b();
    }

    /* renamed from: q */
    public static Bundle m3561q(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m3559a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public MediaControllerCompat m3562b() {
        return this.f5169b;
    }

    /* renamed from: c */
    public Object m3563c() {
        return this.f5168a.mo3609l();
    }

    /* renamed from: d */
    public Token m3564d() {
        return this.f5168a.getSessionToken();
    }

    /* renamed from: f */
    public boolean m3565f() {
        return this.f5168a.mo3598a();
    }

    /* renamed from: g */
    public void m3566g() {
        this.f5168a.release();
    }

    /* renamed from: h */
    public void m3567h(boolean z) {
        this.f5168a.mo3610m(z);
        Iterator it = this.f5170c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1725h) it.next()).mo3645a();
        }
    }

    /* renamed from: i */
    public void m3568i(AbstractC1719b abstractC1719b) {
        m3569j(abstractC1719b, null);
    }

    /* renamed from: j */
    public void m3569j(AbstractC1719b abstractC1719b, Handler handler) {
        if (abstractC1719b == null) {
            this.f5168a.mo3599b(null, null);
            return;
        }
        InterfaceC1720c interfaceC1720c = this.f5168a;
        if (handler == null) {
            handler = new Handler();
        }
        interfaceC1720c.mo3599b(abstractC1719b, handler);
    }

    /* renamed from: k */
    public void m3570k(Bundle bundle) {
        this.f5168a.setExtras(bundle);
    }

    /* renamed from: l */
    public void m3571l(MediaMetadataCompat mediaMetadataCompat) {
        this.f5168a.mo3601d(mediaMetadataCompat);
    }

    /* renamed from: m */
    public void m3572m(PlaybackStateCompat playbackStateCompat) {
        this.f5168a.mo3602e(playbackStateCompat);
    }

    /* renamed from: n */
    public void m3573n(int i) {
        this.f5168a.mo3606i(i);
    }

    /* renamed from: o */
    public void m3574o(m2j m2jVar) {
        if (m2jVar == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f5168a.mo3611n(m2jVar);
    }

    /* renamed from: p */
    public void m3575p(PendingIntent pendingIntent) {
        this.f5168a.mo3604g(pendingIntent);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, xti xtiVar) {
        this.f5170c = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                componentName = componentName == null ? MediaButtonReceiver.m6673a(context) : componentName;
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? MediaHttpDownloader.MAXIMUM_CHUNK_SIZE : 0);
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    this.f5168a = new C1724g(context, str, xtiVar, bundle);
                } else if (i >= 28) {
                    this.f5168a = new C1723f(context, str, xtiVar, bundle);
                } else {
                    this.f5168a = new C1722e(context, str, xtiVar, bundle);
                }
                m3569j(new C1718a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f5168a.mo3608k(pendingIntent);
                this.f5169b = new MediaControllerCompat(context, this);
                if (f5167d == 0) {
                    f5167d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C1714a();

        /* renamed from: a */
        public final MediaDescriptionCompat f5171a;

        /* renamed from: b */
        public final long f5172b;

        /* renamed from: c */
        public MediaSession.QueueItem f5173c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C1714a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        public static class C1715b {
            /* renamed from: a */
            public static MediaSession.QueueItem m3581a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            /* renamed from: b */
            public static MediaDescription m3582b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* renamed from: c */
            public static long m3583c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f5171a = mediaDescriptionCompat;
            this.f5172b = j;
            this.f5173c = queueItem;
        }

        /* renamed from: a */
        public static QueueItem m3576a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m3451a(C1715b.m3582b(queueItem)), C1715b.m3583c(queueItem));
        }

        /* renamed from: b */
        public static List m3577b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m3576a(it.next()));
            }
            return arrayList;
        }

        /* renamed from: c */
        public MediaDescriptionCompat m3578c() {
            return this.f5171a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f5171a + ", Id=" + this.f5172b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f5171a.writeToParcel(parcel, i);
            parcel.writeLong(this.f5172b);
        }

        public QueueItem(Parcel parcel) {
            this.f5171a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f5172b = parcel.readLong();
        }
    }
}
