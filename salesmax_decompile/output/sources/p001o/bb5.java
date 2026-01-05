package p001o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.C2181a;
import p001o.kb5;
import p001o.ty0;

/* loaded from: classes2.dex */
public final class bb5 implements kb5.InterfaceC14766d {

    /* renamed from: a */
    public final Context f15861a;

    /* renamed from: b */
    public Boolean f15862b;

    /* renamed from: o.bb5$a */
    public static final class C12342a {
        /* renamed from: a */
        public static ty0 m18546a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? ty0.f48024d : new ty0.C17251b().m50774e(true).m50776g(z).m50773d();
        }
    }

    /* renamed from: o.bb5$b */
    public static final class C12343b {
        /* renamed from: a */
        public static ty0 m18547a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return ty0.f48024d;
            }
            return new ty0.C17251b().m50774e(true).m50775f(sqi.f45790a > 32 && playbackOffloadSupport == 2).m50776g(z).m50773d();
        }
    }

    public bb5(Context context) {
        this.f15861a = context;
    }

    @Override // p001o.kb5.InterfaceC14766d
    /* renamed from: a */
    public ty0 mo18544a(C2181a c2181a, wx0 wx0Var) {
        op0.m42515e(c2181a);
        op0.m42515e(wx0Var);
        int i = sqi.f45790a;
        if (i < 29 || c2181a.f7920C == -1) {
            return ty0.f48024d;
        }
        boolean zM18545b = m18545b(this.f15861a);
        int iM56176d = xeb.m56176d((String) op0.m42515e(c2181a.f7943n), c2181a.f7939j);
        if (iM56176d == 0 || i < sqi.m48706K(iM56176d)) {
            return ty0.f48024d;
        }
        int iM48708M = sqi.m48708M(c2181a.f7919B);
        if (iM48708M == 0) {
            return ty0.f48024d;
        }
        try {
            AudioFormat audioFormatM48707L = sqi.m48707L(c2181a.f7920C, iM48708M, iM56176d);
            return i >= 31 ? C12343b.m18547a(audioFormatM48707L, wx0Var.m55314a().f52822a, zM18545b) : C12342a.m18546a(audioFormatM48707L, wx0Var.m55314a().f52822a, zM18545b);
        } catch (IllegalArgumentException unused) {
            return ty0.f48024d;
        }
    }

    /* renamed from: b */
    public final boolean m18545b(Context context) {
        AudioManager audioManager;
        Boolean bool = this.f15862b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            this.f15862b = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            this.f15862b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.f15862b.booleanValue();
    }
}
