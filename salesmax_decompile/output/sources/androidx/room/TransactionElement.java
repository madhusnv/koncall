package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import p001o.id5;
import p001o.nl7;
import p001o.p64;
import p001o.q74;

/* loaded from: classes2.dex */
public final class TransactionElement implements q74.InterfaceC16311b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount = new AtomicInteger(0);
    private final p64 transactionDispatcher;

    public static final class Key implements q74.InterfaceC16312c {
        private Key() {
        }

        public /* synthetic */ Key(id5 id5Var) {
            this();
        }
    }

    public TransactionElement(p64 p64Var) {
        this.transactionDispatcher = p64Var;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // p001o.q74
    public <R> R fold(R r, nl7 nl7Var) {
        return (R) q74.InterfaceC16311b.a.m44920a(this, r, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public <E extends q74.InterfaceC16311b> E get(q74.InterfaceC16312c interfaceC16312c) {
        return (E) q74.InterfaceC16311b.a.m44921b(this, interfaceC16312c);
    }

    @Override // p001o.q74.InterfaceC16311b
    public q74.InterfaceC16312c getKey() {
        return Key;
    }

    public final p64 getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return q74.InterfaceC16311b.a.m44922c(this, interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return q74.InterfaceC16311b.a.m44923d(this, q74Var);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
