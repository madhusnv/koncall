package ww;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import tx.AbstractC7262v;
import tx.C7251k;
import uw.C7560d;
import uw.InterfaceC7559c;
import uw.InterfaceC7561e;
import uw.InterfaceC7562f;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;
import yx.C8812f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ww.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8193c extends AbstractC8191a {
    private final InterfaceC7564h _context;
    private transient InterfaceC7559c<Object> intercepted;

    public AbstractC8193c(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h) {
        super(interfaceC7559c);
        this._context = interfaceC7564h;
    }

    @Override // uw.InterfaceC7559c
    public InterfaceC7564h getContext() {
        InterfaceC7564h interfaceC7564h = this._context;
        AbstractC4154l.m8920c(interfaceC7564h);
        return interfaceC7564h;
    }

    public final InterfaceC7559c<Object> intercepted() {
        InterfaceC7559c<Object> interfaceC7559c = this.intercepted;
        if (interfaceC7559c != null) {
            return interfaceC7559c;
        }
        InterfaceC7561e interfaceC7561e = (InterfaceC7561e) getContext().o0(C7560d.f36439a);
        InterfaceC7559c<Object> c8812f = interfaceC7561e != null ? new C8812f((AbstractC7262v) interfaceC7561e, this) : this;
        this.intercepted = c8812f;
        return c8812f;
    }

    @Override // ww.AbstractC8191a
    public void releaseIntercepted() {
        InterfaceC7559c<Object> interfaceC7559c = this.intercepted;
        if (interfaceC7559c != null && interfaceC7559c != this) {
            InterfaceC7562f interfaceC7562fO0 = getContext().o0(C7560d.f36439a);
            AbstractC4154l.m8920c(interfaceC7562fO0);
            C8812f c8812f = (C8812f) interfaceC7559c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8812f.f42490h;
            while (atomicReferenceFieldUpdater.get(c8812f) == AbstractC8808b.f42481c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c8812f);
            C7251k c7251k = obj instanceof C7251k ? (C7251k) obj : null;
            if (c7251k != null) {
                c7251k.m13537l();
            }
        }
        this.intercepted = C8192b.f39159a;
    }

    public AbstractC8193c(InterfaceC7559c interfaceC7559c) {
        this(interfaceC7559c, interfaceC7559c != null ? interfaceC7559c.getContext() : null);
    }
}
