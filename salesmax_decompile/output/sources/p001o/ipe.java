package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes5.dex */
public class ipe {

    /* renamed from: a */
    public boolean f29062a;

    /* renamed from: b */
    public final Handler f29063b = new Handler(Looper.getMainLooper(), new C14345a());

    /* renamed from: o.ipe$a */
    public static final class C14345a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((zne) message.obj).mo19618b();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m32537a(zne zneVar, boolean z) {
        if (this.f29062a || z) {
            this.f29063b.obtainMessage(1, zneVar).sendToTarget();
        } else {
            this.f29062a = true;
            zneVar.mo19618b();
            this.f29062a = false;
        }
    }
}
