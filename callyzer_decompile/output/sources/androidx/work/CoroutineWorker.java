package androidx.work;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;
import og.ng;
import pg.j7;
import pg.x5;
import qw.InterfaceC6353c;
import qw.a0;
import t8.AbstractC7076v;
import t8.C7060f;
import t8.C7061g;
import t8.C7064j;
import t8.C7069o;
import tx.AbstractC7262v;
import tx.c0;
import tx.f1;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends AbstractC7076v {
    private final AbstractC7262v coroutineContext;
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(params, "params");
        this.params = params;
        this.coroutineContext = C7060f.f34138c;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC7559c<? super C7069o> interfaceC7559c) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC7559c interfaceC7559c);

    public AbstractC7262v getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC7559c interfaceC7559c) {
        return getForegroundInfo$suspendImpl(this, interfaceC7559c);
    }

    @Override // t8.AbstractC7076v
    public final InterfaceFutureC8957d getForegroundInfoAsync() {
        AbstractC7262v coroutineContext = getCoroutineContext();
        f1 f1VarM13480c = c0.m13480c();
        coroutineContext.getClass();
        return ng.m10786b(x5.m11928d(coroutineContext, f1VarM13480c), new C7061g(this, null, 0));
    }

    @Override // t8.AbstractC7076v
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(C7069o c7069o, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        InterfaceFutureC8957d foregroundAsync = setForegroundAsync(c7069o);
        AbstractC4154l.m8922e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object objM11711a = j7.m11711a(foregroundAsync, interfaceC7559c);
        return objM11711a == EnumC7794a.COROUTINE_SUSPENDED ? objM11711a : a0.f30746a;
    }

    public final Object setProgress(C7064j c7064j, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        InterfaceFutureC8957d progressAsync = setProgressAsync(c7064j);
        AbstractC4154l.m8922e(progressAsync, "setProgressAsync(data)");
        Object objM11711a = j7.m11711a(progressAsync, interfaceC7559c);
        return objM11711a == EnumC7794a.COROUTINE_SUSPENDED ? objM11711a : a0.f30746a;
    }

    @Override // t8.AbstractC7076v
    public final InterfaceFutureC8957d startWork() {
        InterfaceC7564h coroutineContext = !AbstractC4154l.m8918a(getCoroutineContext(), C7060f.f34138c) ? getCoroutineContext() : this.params.f2869g;
        AbstractC4154l.m8922e(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return ng.m10786b(coroutineContext.t0(c0.m13480c()), new C7061g(this, null, 1));
    }

    @InterfaceC6353c
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
