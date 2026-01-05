package p001o;

import p001o.pca;

/* loaded from: classes6.dex */
public abstract class d8 implements pca {
    static /* synthetic */ Class class$org$mortbay$component$LifeCycle$Listener;
    protected pca.InterfaceC16054a[] _listeners;
    private Object _lock = new Object();
    private final int FAILED = -1;
    private final int STOPPED = 0;
    private final int STARTING = 1;
    private final int STARTED = 2;
    private final int STOPPING = 3;
    private volatile int _state = 0;

    static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void addLifeCycleListener(pca.InterfaceC16054a interfaceC16054a) throws Throwable {
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        Class clsClass$ = class$org$mortbay$component$LifeCycle$Listener;
        if (clsClass$ == null) {
            clsClass$ = class$("org.mortbay.component.LifeCycle$Listener");
            class$org$mortbay$component$LifeCycle$Listener = clsClass$;
        }
        this._listeners = (pca.InterfaceC16054a[]) ti9.m49911c(interfaceC16054aArr, interfaceC16054a, clsClass$);
    }

    public void doStart() {
    }

    public void doStop() {
    }

    public boolean isFailed() {
        return this._state == -1;
    }

    public boolean isRunning() {
        return this._state == 2 || this._state == 1;
    }

    @Override // p001o.pca
    public boolean isStarted() {
        return this._state == 2;
    }

    public boolean isStarting() {
        return this._state == 1;
    }

    public boolean isStopped() {
        return this._state == 0;
    }

    public boolean isStopping() {
        return this._state == 3;
    }

    public void removeLifeCycleListener(pca.InterfaceC16054a interfaceC16054a) {
        this._listeners = (pca.InterfaceC16054a[]) ti9.m49916j(this._listeners, interfaceC16054a);
    }

    @Override // p001o.pca
    public final void start() {
        synchronized (this._lock) {
            try {
                try {
                    try {
                        if (this._state != 2 && this._state != 1) {
                            m22487x();
                            doStart();
                            tia.m49921c("started {}", this);
                            m22486u();
                        }
                    } catch (Exception e) {
                        m22485t(e);
                        throw e;
                    }
                } catch (Error e2) {
                    m22485t(e2);
                    throw e2;
                }
            } finally {
            }
        }
    }

    @Override // p001o.pca
    public final void stop() {
        synchronized (this._lock) {
            try {
                try {
                    if (this._state != 3 && this._state != 0) {
                        m22489z();
                        doStop();
                        tia.m49921c("stopped {}", this);
                        m22488y();
                    }
                } catch (Error e) {
                    m22485t(e);
                    throw e;
                } catch (Exception e2) {
                    m22485t(e2);
                    throw e2;
                }
            } finally {
            }
        }
    }

    /* renamed from: t */
    public final void m22485t(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("failed ");
        stringBuffer.append(this);
        stringBuffer.append(": ");
        stringBuffer.append(th);
        tia.m49928j(stringBuffer.toString());
        tia.m49922d(th);
        this._state = -1;
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        if (interfaceC16054aArr == null || interfaceC16054aArr.length <= 0) {
            return;
        }
        pca.InterfaceC16054a interfaceC16054a = interfaceC16054aArr[0];
        throw null;
    }

    /* renamed from: u */
    public final void m22486u() {
        this._state = 2;
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        if (interfaceC16054aArr == null || interfaceC16054aArr.length <= 0) {
            return;
        }
        pca.InterfaceC16054a interfaceC16054a = interfaceC16054aArr[0];
        throw null;
    }

    /* renamed from: x */
    public final void m22487x() {
        this._state = 1;
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        if (interfaceC16054aArr == null || interfaceC16054aArr.length <= 0) {
            return;
        }
        pca.InterfaceC16054a interfaceC16054a = interfaceC16054aArr[0];
        throw null;
    }

    /* renamed from: y */
    public final void m22488y() {
        this._state = 0;
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        if (interfaceC16054aArr == null || interfaceC16054aArr.length <= 0) {
            return;
        }
        pca.InterfaceC16054a interfaceC16054a = interfaceC16054aArr[0];
        throw null;
    }

    /* renamed from: z */
    public final void m22489z() {
        this._state = 3;
        pca.InterfaceC16054a[] interfaceC16054aArr = this._listeners;
        if (interfaceC16054aArr == null || interfaceC16054aArr.length <= 0) {
            return;
        }
        pca.InterfaceC16054a interfaceC16054a = interfaceC16054aArr[0];
        throw null;
    }
}
