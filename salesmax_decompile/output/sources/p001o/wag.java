package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public enum wag implements rag {
    CANCELLED;

    public static void deferredRequest(AtomicReference<rag> atomicReference, AtomicLong atomicLong, long j) {
        rag ragVar = atomicReference.get();
        if (ragVar != null) {
            ragVar.request(j);
            return;
        }
        if (validate(j)) {
            ka1.m35216a(atomicLong, j);
            rag ragVar2 = atomicReference.get();
            if (ragVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    ragVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<rag> atomicReference, AtomicLong atomicLong, rag ragVar) {
        if (!setOnce(atomicReference, ragVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        ragVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<rag> atomicReference, rag ragVar) {
        rag ragVar2;
        do {
            ragVar2 = atomicReference.get();
            if (ragVar2 == CANCELLED) {
                if (ragVar == null) {
                    return false;
                }
                ragVar.cancel();
                return false;
            }
        } while (!ec3.m24748a(atomicReference, ragVar2, ragVar));
        return true;
    }

    public static void reportMoreProduced(long j) {
        fwe.m27599r(new f2e("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        fwe.m27599r(new f2e("Subscription already set!"));
    }

    public static boolean set(AtomicReference<rag> atomicReference, rag ragVar) {
        rag ragVar2;
        do {
            ragVar2 = atomicReference.get();
            if (ragVar2 == CANCELLED) {
                if (ragVar == null) {
                    return false;
                }
                ragVar.cancel();
                return false;
            }
        } while (!ec3.m24748a(atomicReference, ragVar2, ragVar));
        if (ragVar2 == null) {
            return true;
        }
        ragVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<rag> atomicReference, rag ragVar) {
        Objects.requireNonNull(ragVar, "s is null");
        if (ec3.m24748a(atomicReference, null, ragVar)) {
            return true;
        }
        ragVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(rag ragVar, rag ragVar2) {
        if (ragVar2 == null) {
            fwe.m27599r(new NullPointerException("next is null"));
            return false;
        }
        if (ragVar == null) {
            return true;
        }
        ragVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p001o.rag
    public void cancel() {
    }

    @Override // p001o.rag
    public void request(long j) {
    }

    public static boolean cancel(AtomicReference<rag> atomicReference) {
        rag andSet;
        rag ragVar = atomicReference.get();
        wag wagVar = CANCELLED;
        if (ragVar == wagVar || (andSet = atomicReference.getAndSet(wagVar)) == wagVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        fwe.m27599r(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<rag> atomicReference, rag ragVar, long j) {
        if (!setOnce(atomicReference, ragVar)) {
            return false;
        }
        ragVar.request(j);
        return true;
    }
}
