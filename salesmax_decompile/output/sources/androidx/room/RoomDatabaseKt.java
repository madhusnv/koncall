package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.e47;
import p001o.gkh;
import p001o.h84;
import p001o.jgg;
import p001o.jjd;
import p001o.kf9;
import p001o.l75;
import p001o.ljd;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.p64;
import p001o.p69;
import p001o.pm1;
import p001o.q74;
import p001o.rm1;
import p001o.sq8;
import p001o.tq8;
import p001o.uk7;
import p001o.uq8;
import p001o.v37;
import p001o.vre;
import p001o.wre;
import p001o.xb2;
import p001o.xk7;
import p001o.y3i;
import p001o.zb2;

/* loaded from: classes2.dex */
public final class RoomDatabaseKt {

    @l75(m36647c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", m36648f = "RoomDatabaseExt.kt", m36649l = {235}, m36650m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1 */
    public static final class C24531 extends jgg implements nl7 {
        final /* synthetic */ boolean $emitInitialState;
        final /* synthetic */ String[] $tables;
        final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements uk7 {
            final /* synthetic */ p69 $job;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(p69 p69Var) {
                super(0);
                this.$job = p69Var;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68704invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68704invoke() {
                p69.C15966a.m42999a(this.$job, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24531(boolean z, RoomDatabase roomDatabase, String[] strArr, n64 n64Var) {
            super(2, n64Var);
            this.$emitInitialState = z;
            this.$this_invalidationTrackerFlow = roomDatabase;
            this.$tables = strArr;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C24531 c24531 = new C24531(this.$emitInitialState, this.$this_invalidationTrackerFlow, this.$tables, n64Var);
            c24531.L$0 = obj;
            return c24531;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            p64 queryDispatcher;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                final ljd ljdVar = (ljd) this.L$0;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(this.$emitInitialState);
                final String[] strArr = this.$tables;
                ?? r5 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        ljdVar.mo23472g(set);
                    }
                };
                TransactionElement transactionElement = (TransactionElement) ljdVar.mo6529D().get(TransactionElement.Key);
                if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$this_invalidationTrackerFlow);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(rm1.m46952d(ljdVar, queryDispatcher, null, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, r5, this.$emitInitialState, ljdVar, this.$tables, atomicBoolean, null), 2, null));
                this.label = 1;
                if (jjd.m33879a(ljdVar, anonymousClass1, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(ljd ljdVar, n64 n64Var) {
            return ((C24531) create(ljdVar, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q74 createTransactionContext(RoomDatabase roomDatabase, p64 p64Var) {
        TransactionElement transactionElement = new TransactionElement(p64Var);
        return p64Var.plus(transactionElement).plus(gkh.m28966a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    public static final v37 invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z) {
        return e47.m24271e(new C24531(z, roomDatabase, strArr, null));
    }

    public static /* synthetic */ v37 invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return invalidationTrackerFlow(roomDatabase, strArr, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final q74 q74Var, final nl7 nl7Var, n64 n64Var) {
        final zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                @l75(m36647c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", m36648f = "RoomDatabaseExt.kt", m36649l = {103}, m36650m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1 */
                public static final class C24541 extends jgg implements nl7 {
                    final /* synthetic */ xb2 $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ nl7 $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C24541(RoomDatabase roomDatabase, xb2 xb2Var, nl7 nl7Var, n64 n64Var) {
                        super(2, n64Var);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = xb2Var;
                        this.$transactionBlock = nl7Var;
                    }

                    @Override // p001o.vb1
                    public final n64 create(Object obj, n64 n64Var) {
                        C24541 c24541 = new C24541(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, n64Var);
                        c24541.L$0 = obj;
                        return c24541;
                    }

                    @Override // p001o.vb1
                    public final Object invokeSuspend(Object obj) {
                        n64 n64Var;
                        Object objM51918f = uq8.m51918f();
                        int i = this.label;
                        if (i == 0) {
                            wre.m54934b(obj);
                            q74.InterfaceC16311b interfaceC16311b = ((h84) this.L$0).mo6529D().get(p64.f39391p);
                            sq8.m48646e(interfaceC16311b);
                            q74 q74VarCreateTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (p64) interfaceC16311b);
                            xb2 xb2Var = this.$continuation;
                            vre.C17665a c17665a = vre.f50797b;
                            nl7 nl7Var = this.$transactionBlock;
                            this.L$0 = xb2Var;
                            this.label = 1;
                            obj = pm1.m43867g(q74VarCreateTransactionContext, nl7Var, this);
                            if (obj == objM51918f) {
                                return objM51918f;
                            }
                            n64Var = xb2Var;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n64Var = (n64) this.L$0;
                            wre.m54934b(obj);
                        }
                        n64Var.resumeWith(vre.m53351b(obj));
                        return y3i.f54824a;
                    }

                    @Override // p001o.nl7
                    public final Object invoke(h84 h84Var, n64 n64Var) {
                        return ((C24541) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        pm1.m43865e(q74Var.minusKey(p64.f39391p), new C24541(roomDatabase, zb2Var, nl7Var, null));
                    } catch (Throwable th) {
                        zb2Var.cancel(th);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            zb2Var.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, xk7 xk7Var, n64 n64Var) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, xk7Var, null);
        TransactionElement transactionElement = (TransactionElement) n64Var.getContext().get(TransactionElement.Key);
        p64 transactionDispatcher$room_ktx_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_ktx_release() : null;
        return transactionDispatcher$room_ktx_release != null ? pm1.m43867g(transactionDispatcher$room_ktx_release, roomDatabaseKt$withTransaction$transactionBlock$1, n64Var) : startTransactionCoroutine(roomDatabase, n64Var.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, n64Var);
    }
}
