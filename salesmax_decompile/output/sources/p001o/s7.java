package p001o;

/* loaded from: classes6.dex */
public abstract class s7 extends d8 implements iw7 {
    private bgf _server;
    protected String _string;

    public void destroy() {
        if (!isStopped()) {
            throw new IllegalStateException("!STOPPED");
        }
        bgf bgfVar = this._server;
        if (bgfVar != null) {
            bgfVar.m18895I().m25929d(this);
        }
    }

    @Override // p001o.d8
    public void doStart() {
        tia.m49921c("starting {}", this);
    }

    @Override // p001o.d8
    public void doStop() {
        tia.m49921c("stopping {}", this);
    }

    @Override // p001o.iw7
    public bgf getServer() {
        return this._server;
    }

    public void setServer(bgf bgfVar) {
        bgf bgfVar2 = this._server;
        if (bgfVar2 != null && bgfVar2 != bgfVar) {
            bgfVar2.m18895I().m25929d(this);
        }
        this._server = bgfVar;
        if (bgfVar == null || bgfVar == bgfVar2) {
            return;
        }
        bgfVar.m18895I().m25927b(this);
    }

    public String toString() {
        if (this._string == null) {
            String string = super.toString();
            this._string = string;
            this._string = string.substring(string.lastIndexOf(46) + 1);
        }
        return this._string;
    }
}
