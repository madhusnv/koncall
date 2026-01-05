package p001o;

/* loaded from: classes6.dex */
public abstract class zk6 {
    /* renamed from: a */
    public static RuntimeException m59525a(Throwable th) {
        throw xk6.m56420h(th);
    }

    /* renamed from: b */
    public static void m59526b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
