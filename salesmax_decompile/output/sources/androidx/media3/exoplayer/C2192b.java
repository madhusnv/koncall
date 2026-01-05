package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p001o.jy0;
import p001o.ky0;
import p001o.ly0;
import p001o.op0;
import p001o.ria;
import p001o.sqi;
import p001o.wx0;

/* renamed from: androidx.media3.exoplayer.b */
/* loaded from: classes2.dex */
public final class C2192b {

    /* renamed from: a */
    public final AudioManager f8129a;

    /* renamed from: b */
    public final a f8130b;

    /* renamed from: c */
    public b f8131c;

    /* renamed from: d */
    public wx0 f8132d;

    /* renamed from: f */
    public int f8134f;

    /* renamed from: h */
    public AudioFocusRequest f8136h;

    /* renamed from: i */
    public boolean f8137i;

    /* renamed from: g */
    public float f8135g = 1.0f;

    /* renamed from: e */
    public int f8133e = 0;

    /* renamed from: androidx.media3.exoplayer.b$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f8138a;

        public a(Handler handler) {
            this.f8138a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m6866b(int i) {
            C2192b.this.m6855h(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f8138a.post(new Runnable() { // from class: o.sy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46104a.m6866b(i);
                }
            });
        }
    }

    /* renamed from: androidx.media3.exoplayer.b$b */
    public interface b {
        /* renamed from: G */
        void mo6867G(float f);

        /* renamed from: H */
        void mo6868H(int i);
    }

    public C2192b(Context context, Handler handler, b bVar) {
        this.f8129a = (AudioManager) op0.m42515e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f8131c = bVar;
        this.f8130b = new a(handler);
    }

    /* renamed from: e */
    public static int m6849e(wx0 wx0Var) {
        if (wx0Var == null) {
            return 0;
        }
        switch (wx0Var.f52818c) {
            case 0:
                ria.m46824h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (wx0Var.f52816a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                ria.m46824h("AudioFocusManager", "Unidentified audio usage: " + wx0Var.f52818c);
                return 0;
            case 16:
                return 4;
        }
    }

    /* renamed from: a */
    public final void m6850a() {
        this.f8129a.abandonAudioFocus(this.f8130b);
    }

    /* renamed from: b */
    public final void m6851b() {
        int i = this.f8133e;
        if (i == 1 || i == 0) {
            return;
        }
        if (sqi.f45790a >= 26) {
            m6852c();
        } else {
            m6850a();
        }
    }

    /* renamed from: c */
    public final void m6852c() {
        AudioFocusRequest audioFocusRequest = this.f8136h;
        if (audioFocusRequest != null) {
            this.f8129a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    public final void m6853f(int i) {
        b bVar = this.f8131c;
        if (bVar != null) {
            bVar.mo6868H(i);
        }
    }

    /* renamed from: g */
    public float m6854g() {
        return this.f8135g;
    }

    /* renamed from: h */
    public final void m6855h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !m6864q()) {
                m6861n(4);
                return;
            } else {
                m6853f(0);
                m6861n(3);
                return;
            }
        }
        if (i == -1) {
            m6853f(-1);
            m6851b();
            m6861n(1);
        } else if (i == 1) {
            m6861n(2);
            m6853f(1);
        } else {
            ria.m46824h("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* renamed from: i */
    public void m6856i() {
        this.f8131c = null;
        m6851b();
        m6861n(0);
    }

    /* renamed from: j */
    public final int m6857j() {
        if (this.f8133e == 2) {
            return 1;
        }
        if ((sqi.f45790a >= 26 ? m6859l() : m6858k()) == 1) {
            m6861n(2);
            return 1;
        }
        m6861n(1);
        return -1;
    }

    /* renamed from: k */
    public final int m6858k() {
        return this.f8129a.requestAudioFocus(this.f8130b, sqi.m0(((wx0) op0.m42515e(this.f8132d)).f52818c), this.f8134f);
    }

    /* renamed from: l */
    public final int m6859l() {
        AudioFocusRequest.Builder builderM34668a;
        AudioFocusRequest audioFocusRequest = this.f8136h;
        if (audioFocusRequest == null || this.f8137i) {
            if (audioFocusRequest == null) {
                ly0.m38101a();
                builderM34668a = ky0.m36303a(this.f8134f);
            } else {
                ly0.m38101a();
                builderM34668a = jy0.m34668a(this.f8136h);
            }
            this.f8136h = builderM34668a.setAudioAttributes(((wx0) op0.m42515e(this.f8132d)).m55314a().f52822a).setWillPauseWhenDucked(m6864q()).setOnAudioFocusChangeListener(this.f8130b).build();
            this.f8137i = false;
        }
        return this.f8129a.requestAudioFocus(this.f8136h);
    }

    /* renamed from: m */
    public void m6860m(wx0 wx0Var) {
        if (sqi.m48724c(this.f8132d, wx0Var)) {
            return;
        }
        this.f8132d = wx0Var;
        int iM6849e = m6849e(wx0Var);
        this.f8134f = iM6849e;
        boolean z = true;
        if (iM6849e != 1 && iM6849e != 0) {
            z = false;
        }
        op0.m42512b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* renamed from: n */
    public final void m6861n(int i) {
        if (this.f8133e == i) {
            return;
        }
        this.f8133e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f8135g == f) {
            return;
        }
        this.f8135g = f;
        b bVar = this.f8131c;
        if (bVar != null) {
            bVar.mo6867G(f);
        }
    }

    /* renamed from: o */
    public final boolean m6862o(int i) {
        return i != 1 && this.f8134f == 1;
    }

    /* renamed from: p */
    public int m6863p(boolean z, int i) {
        if (!m6862o(i)) {
            m6851b();
            m6861n(0);
            return 1;
        }
        if (z) {
            return m6857j();
        }
        int i2 = this.f8133e;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: q */
    public final boolean m6864q() {
        wx0 wx0Var = this.f8132d;
        return wx0Var != null && wx0Var.f52816a == 1;
    }
}
