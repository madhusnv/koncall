package p001o;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* loaded from: classes2.dex */
public final /* synthetic */ class ok5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f38508a;

    public /* synthetic */ ok5(DelayMetCommandHandler delayMetCommandHandler) {
        this.f38508a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38508a.stopWork();
    }
}
