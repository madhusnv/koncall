package p001o;

/* loaded from: classes6.dex */
public interface byh {
    /* renamed from: b */
    static boolean m19928b(Throwable th) {
        return (th instanceof InterruptedException) || (th instanceof LinkageError) || (th instanceof ThreadDeath) || (th instanceof VirtualMachineError);
    }

    /* renamed from: a */
    static Object m19927a(Throwable th) throws Throwable {
        throw th;
    }
}
