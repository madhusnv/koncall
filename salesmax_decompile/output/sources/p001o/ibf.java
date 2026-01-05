package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class ibf extends eq3 implements r0c {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28438d = AtomicIntegerFieldUpdater.newUpdater(ibf.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f28439c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public ibf(long j, ibf ibfVar, int i) {
        super(ibfVar);
        this.f28439c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p001o.eq3
    /* renamed from: k */
    public boolean mo25428k() {
        return f28438d.get(this) == mo24826r() && !m25429l();
    }

    /* renamed from: p */
    public final boolean m31889p() {
        return f28438d.addAndGet(this, Opcodes.V_PREVIEW) == mo24826r() && !m25429l();
    }

    /* renamed from: r */
    public abstract int mo24826r();

    /* renamed from: s */
    public abstract void mo24827s(int i, Throwable th, q74 q74Var);

    /* renamed from: t */
    public final void m31890t() {
        if (f28438d.incrementAndGet(this) == mo24826r()) {
            m25431n();
        }
    }

    /* renamed from: u */
    public final boolean m31891u() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f28438d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (!(i != mo24826r() || m25429l())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
