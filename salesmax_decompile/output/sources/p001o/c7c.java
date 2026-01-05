package p001o;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
public abstract class c7c {
    /* renamed from: a */
    public static void m20374a(x8c x8cVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        m20375b(x8cVar, new lf9(gu3Var, gu3Var2, jmVar, km7.m35917c()));
    }

    /* renamed from: b */
    public static void m20375b(x8c x8cVar, m9c m9cVar) throws InterruptedException {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        wj1 wj1Var = new wj1(linkedBlockingQueue);
        m9cVar.mo16559a(wj1Var);
        x8cVar.mo55724b(wj1Var);
        while (!wj1Var.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    wj1Var.dispose();
                    m9cVar.onError(e);
                    return;
                }
            }
            if (wj1Var.isDisposed() || objPoll == wj1.f52221b || d3c.acceptFull(objPoll, m9cVar)) {
                return;
            }
        }
    }
}
