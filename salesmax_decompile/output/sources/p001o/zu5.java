package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public enum zu5 implements su5 {
    DISPOSED;

    public static boolean replace(AtomicReference<su5> atomicReference, su5 su5Var) {
        su5 su5Var2;
        do {
            su5Var2 = atomicReference.get();
            if (su5Var2 == DISPOSED) {
                if (su5Var == null) {
                    return false;
                }
                su5Var.dispose();
                return false;
            }
        } while (!ec3.m24748a(atomicReference, su5Var2, su5Var));
        return true;
    }

    public static void reportDisposableSet() {
        fwe.m27599r(new f2e("Disposable already set!"));
    }

    public static boolean set(AtomicReference<su5> atomicReference, su5 su5Var) {
        su5 su5Var2;
        do {
            su5Var2 = atomicReference.get();
            if (su5Var2 == DISPOSED) {
                if (su5Var == null) {
                    return false;
                }
                su5Var.dispose();
                return false;
            }
        } while (!ec3.m24748a(atomicReference, su5Var2, su5Var));
        if (su5Var2 == null) {
            return true;
        }
        su5Var2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<su5> atomicReference, su5 su5Var) {
        Objects.requireNonNull(su5Var, "d is null");
        if (ec3.m24748a(atomicReference, null, su5Var)) {
            return true;
        }
        su5Var.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<su5> atomicReference, su5 su5Var) {
        if (ec3.m24748a(atomicReference, null, su5Var)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        su5Var.dispose();
        return false;
    }

    public static boolean validate(su5 su5Var, su5 su5Var2) {
        if (su5Var2 == null) {
            fwe.m27599r(new NullPointerException("next is null"));
            return false;
        }
        if (su5Var == null) {
            return true;
        }
        su5Var2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // p001o.su5
    public void dispose() {
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<su5> atomicReference) {
        su5 andSet;
        su5 su5Var = atomicReference.get();
        zu5 zu5Var = DISPOSED;
        if (su5Var == zu5Var || (andSet = atomicReference.getAndSet(zu5Var)) == zu5Var) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(su5 su5Var) {
        return su5Var == DISPOSED;
    }
}
