package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C2181a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.nf8;
import p001o.of8;
import p001o.pf8;

/* loaded from: classes2.dex */
public final class dy0 {

    /* renamed from: c */
    public static final dy0 f20633c = new dy0(nf8.m40500F(C13062e.f20638d));

    /* renamed from: d */
    public static final nf8 f20634d = nf8.m40502I(2, 5, 6);

    /* renamed from: e */
    public static final of8 f20635e = new of8.C15793a().m42190f(5, 6).m42190f(17, 6).m42190f(7, 6).m42190f(30, 10).m42190f(18, 6).m42190f(6, 8).m42190f(8, 8).m42190f(14, 8).m42187c();

    /* renamed from: a */
    public final SparseArray f20636a;

    /* renamed from: b */
    public final int f20637b;

    /* renamed from: o.dy0$b */
    public static final class C13059b {
        /* renamed from: a */
        private static pf8 m23945a() {
            pf8.C16101a c16101aM43585i = new pf8.C16101a().m43585i(8, 7);
            int i = sqi.f45790a;
            if (i >= 31) {
                c16101aM43585i.m43585i(26, 27);
            }
            if (i >= 33) {
                c16101aM43585i.mo32056a(30);
            }
            return c16101aM43585i.m43588l();
        }

        /* renamed from: b */
        public static boolean m23946b(AudioManager audioManager, iy0 iy0Var) {
            AudioDeviceInfo[] devices = iy0Var == null ? ((AudioManager) op0.m42515e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{iy0Var.f29353a};
            pf8 pf8VarM23945a = m23945a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (pf8VarM23945a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o.dy0$c */
    public static final class C13060c {
        /* renamed from: a */
        public static nf8 m23947a(wx0 wx0Var) {
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            q4i it = dy0.f20635e.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (sqi.f45790a >= sqi.m48706K(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), wx0Var.m55314a().f52822a)) {
                    c15566aM40508q.mo32056a(Integer.valueOf(iIntValue));
                }
            }
            c15566aM40508q.mo32056a(2);
            return c15566aM40508q.m40520k();
        }

        /* renamed from: b */
        public static int m23948b(int i, int i2, wx0 wx0Var) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iM48708M = sqi.m48708M(i3);
                if (iM48708M != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM48708M).build(), wx0Var.m55314a().f52822a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    /* renamed from: o.dy0$d */
    public static final class C13061d {
        /* renamed from: a */
        public static dy0 m23949a(AudioManager audioManager, wx0 wx0Var) {
            return new dy0(dy0.m23935c(audioManager.getDirectProfilesForAttributes(wx0Var.m55314a().f52822a)));
        }

        /* renamed from: b */
        public static iy0 m23950b(AudioManager audioManager, wx0 wx0Var) {
            try {
                List audioDevicesForAttributes = ((AudioManager) op0.m42515e(audioManager)).getAudioDevicesForAttributes(wx0Var.m55314a().f52822a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new iy0((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static boolean m23934b() {
        String str = sqi.f45792c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* renamed from: c */
    public static nf8 m23935c(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(br8.m19636c(12)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfileM60063a = zx0.m60063a(list.get(i));
            if (audioProfileM60063a.getEncapsulationType() != 1) {
                int format = audioProfileM60063a.getFormat();
                if (sqi.F0(format) || f20635e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) op0.m42515e((Set) map.get(Integer.valueOf(format)))).addAll(br8.m19636c(audioProfileM60063a.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(br8.m19636c(audioProfileM60063a.getChannelMasks())));
                    }
                }
            }
        }
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        for (Map.Entry entry : map.entrySet()) {
            c15566aM40508q.mo32056a(new C13062e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return c15566aM40508q.m40520k();
    }

    /* renamed from: d */
    public static nf8 m23936d(int[] iArr, int i) {
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            c15566aM40508q.mo32056a(new C13062e(i2, i));
        }
        return c15566aM40508q.m40520k();
    }

    /* renamed from: e */
    public static dy0 m23937e(Context context, wx0 wx0Var, AudioDeviceInfo audioDeviceInfo) {
        return m23939g(context, wx0Var, (sqi.f45790a < 23 || audioDeviceInfo == null) ? null : new iy0(audioDeviceInfo));
    }

    /* renamed from: f */
    public static dy0 m23938f(Context context, Intent intent, wx0 wx0Var, iy0 iy0Var) {
        AudioManager audioManager = (AudioManager) op0.m42515e(context.getSystemService("audio"));
        if (iy0Var == null) {
            iy0Var = sqi.f45790a >= 33 ? C13061d.m23950b(audioManager, wx0Var) : null;
        }
        int i = sqi.f45790a;
        if (i >= 33 && (sqi.J0(context) || sqi.C0(context))) {
            return C13061d.m23949a(audioManager, wx0Var);
        }
        if (i >= 23 && C13059b.m23946b(audioManager, iy0Var)) {
            return f20633c;
        }
        pf8.C16101a c16101a = new pf8.C16101a();
        c16101a.mo32056a(2);
        if (i >= 29 && (sqi.J0(context) || sqi.C0(context))) {
            c16101a.m43586j(C13060c.m23947a(wx0Var));
            return new dy0(m23936d(br8.m19646m(c16101a.m43588l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || m23934b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c16101a.m43586j(f20634d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new dy0(m23936d(br8.m19646m(c16101a.m43588l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c16101a.m43586j(br8.m19636c(intArrayExtra));
        }
        return new dy0(m23936d(br8.m19646m(c16101a.m43588l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* renamed from: g */
    public static dy0 m23939g(Context context, wx0 wx0Var, iy0 iy0Var) {
        return m23938f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), wx0Var, iy0Var);
    }

    /* renamed from: h */
    public static int m23940h(int i) {
        int i2 = sqi.f45790a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(sqi.f45791b) && i == 1) {
            i = 2;
        }
        return sqi.m48708M(i);
    }

    /* renamed from: j */
    public static Uri m23941j() {
        if (m23934b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy0)) {
            return false;
        }
        dy0 dy0Var = (dy0) obj;
        return sqi.m48740s(this.f20636a, dy0Var.f20636a) && this.f20637b == dy0Var.f20637b;
    }

    public int hashCode() {
        return this.f20637b + (sqi.m48741t(this.f20636a) * 31);
    }

    /* renamed from: i */
    public Pair m23942i(C2181a c2181a, wx0 wx0Var) {
        int iM56176d = xeb.m56176d((String) op0.m42515e(c2181a.f7943n), c2181a.f7939j);
        if (!f20635e.containsKey(Integer.valueOf(iM56176d))) {
            return null;
        }
        if (iM56176d == 18 && !m23944l(18)) {
            iM56176d = 6;
        } else if ((iM56176d == 8 && !m23944l(8)) || (iM56176d == 30 && !m23944l(30))) {
            iM56176d = 7;
        }
        if (!m23944l(iM56176d)) {
            return null;
        }
        C13062e c13062e = (C13062e) op0.m42515e((C13062e) this.f20636a.get(iM56176d));
        int iM23952b = c2181a.f7919B;
        if (iM23952b == -1 || iM56176d == 18) {
            int i = c2181a.f7920C;
            if (i == -1) {
                i = 48000;
            }
            iM23952b = c13062e.m23952b(i, wx0Var);
        } else if (!c2181a.f7943n.equals("audio/vnd.dts.uhd;profile=p2") || sqi.f45790a >= 33) {
            if (!c13062e.m23953c(iM23952b)) {
                return null;
            }
        } else if (iM23952b > 10) {
            return null;
        }
        int iM23940h = m23940h(iM23952b);
        if (iM23940h == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM56176d), Integer.valueOf(iM23940h));
    }

    /* renamed from: k */
    public boolean m23943k(C2181a c2181a, wx0 wx0Var) {
        return m23942i(c2181a, wx0Var) != null;
    }

    /* renamed from: l */
    public boolean m23944l(int i) {
        return sqi.m48738q(this.f20636a, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f20637b + ", audioProfiles=" + this.f20636a + "]";
    }

    public dy0(List list) {
        this.f20636a = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C13062e c13062e = (C13062e) list.get(i);
            this.f20636a.put(c13062e.f20639a, c13062e);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f20636a.size(); i2++) {
            iMax = Math.max(iMax, ((C13062e) this.f20636a.valueAt(i2)).f20640b);
        }
        this.f20637b = iMax;
    }

    /* renamed from: o.dy0$e */
    public static final class C13062e {

        /* renamed from: d */
        public static final C13062e f20638d;

        /* renamed from: a */
        public final int f20639a;

        /* renamed from: b */
        public final int f20640b;

        /* renamed from: c */
        public final pf8 f20641c;

        static {
            f20638d = sqi.f45790a >= 33 ? new C13062e(2, m23951a(10)) : new C13062e(2, 10);
        }

        public C13062e(int i, Set set) {
            this.f20639a = i;
            pf8 pf8VarM43582x = pf8.m43582x(set);
            this.f20641c = pf8VarM43582x;
            q4i it = pf8VarM43582x.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f20640b = iMax;
        }

        /* renamed from: a */
        public static pf8 m23951a(int i) {
            pf8.C16101a c16101a = new pf8.C16101a();
            for (int i2 = 1; i2 <= i; i2++) {
                c16101a.mo32056a(Integer.valueOf(sqi.m48708M(i2)));
            }
            return c16101a.m43588l();
        }

        /* renamed from: b */
        public int m23952b(int i, wx0 wx0Var) {
            return this.f20641c != null ? this.f20640b : sqi.f45790a >= 29 ? C13060c.m23948b(this.f20639a, i, wx0Var) : ((Integer) op0.m42515e((Integer) dy0.f20635e.getOrDefault(Integer.valueOf(this.f20639a), 0))).intValue();
        }

        /* renamed from: c */
        public boolean m23953c(int i) {
            if (this.f20641c == null) {
                return i <= this.f20640b;
            }
            int iM48708M = sqi.m48708M(i);
            if (iM48708M == 0) {
                return false;
            }
            return this.f20641c.contains(Integer.valueOf(iM48708M));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13062e)) {
                return false;
            }
            C13062e c13062e = (C13062e) obj;
            return this.f20639a == c13062e.f20639a && this.f20640b == c13062e.f20640b && sqi.m48724c(this.f20641c, c13062e.f20641c);
        }

        public int hashCode() {
            int i = ((this.f20639a * 31) + this.f20640b) * 31;
            pf8 pf8Var = this.f20641c;
            return i + (pf8Var == null ? 0 : pf8Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f20639a + ", maxChannelCount=" + this.f20640b + ", channelMasks=" + this.f20641c + "]";
        }

        public C13062e(int i, int i2) {
            this.f20639a = i;
            this.f20640b = i2;
            this.f20641c = null;
        }
    }
}
