package androidx.room;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import p001o.e47;
import p001o.id5;
import p001o.kt7;
import p001o.n64;
import p001o.n75;
import p001o.p64;
import p001o.pm1;
import p001o.rm1;
import p001o.tq8;
import p001o.uq8;
import p001o.v37;
import p001o.zb2;

/* loaded from: classes2.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    private CoroutinesRoom() {
    }

    public static final <R> v37 createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, n64 n64Var) {
        return Companion.execute(roomDatabase, z, cancellationSignal, callable, n64Var);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, n64 n64Var) {
        return Companion.execute(roomDatabase, z, callable, n64Var);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final <R> v37 createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
            return e47.m24281o(new CoroutinesRoom$Companion$createFlow$1(z, roomDatabase, strArr, callable, null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, n64 n64Var) {
            p64 transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) n64Var.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return pm1.m43867g(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), n64Var);
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, n64 n64Var) {
            p64 transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) n64Var.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            p64 p64Var = transactionDispatcher;
            zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            zb2Var.mo48694y(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, rm1.m46952d(kt7.f32697a, p64Var, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, zb2Var, null), 2, null)));
            Object objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM59140v;
        }
    }
}
