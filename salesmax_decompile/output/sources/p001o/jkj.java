package p001o;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class jkj extends ujj {

    /* renamed from: b */
    public final /* synthetic */ IBinder f30644b;

    /* renamed from: c */
    public final /* synthetic */ pkj f30645c;

    public jkj(pkj pkjVar, IBinder iBinder) {
        this.f30645c = pkjVar;
        this.f30644b = iBinder;
    }

    @Override // p001o.ujj
    /* renamed from: a */
    public final void mo19307a() throws RemoteException {
        this.f30645c.f40205a.f43753m = pij.M0(this.f30644b);
        rkj.m46890q(this.f30645c.f40205a);
        this.f30645c.f40205a.f43747g = false;
        Iterator it = this.f30645c.f40205a.f43744d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f30645c.f40205a.f43744d.clear();
    }
}
