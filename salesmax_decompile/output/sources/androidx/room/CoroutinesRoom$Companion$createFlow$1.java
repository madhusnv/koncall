package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import org.objectweb.asm.Opcodes;
import p001o.e47;
import p001o.h84;
import p001o.i84;
import p001o.jg2;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.p64;
import p001o.rm1;
import p001o.sg2;
import p001o.tg2;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;
import p001o.z37;

@l75(m36647c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m36648f = "CoroutinesRoom.kt", m36649l = {Opcodes.DDIV}, m36650m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CoroutinesRoom$Companion$createFlow$1 extends jgg implements nl7 {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    @l75(m36647c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m36648f = "CoroutinesRoom.kt", m36649l = {Opcodes.L2F}, m36650m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    public static final class C24481 extends jgg implements nl7 {
        final /* synthetic */ z37 $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        @l75(m36647c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m36648f = "CoroutinesRoom.kt", m36649l = {128, 130}, m36650m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ jg2 $observerChannel;
            final /* synthetic */ jg2 $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, jg2 jg2Var, Callable callable, jg2 jg2Var2, n64 n64Var) {
                super(2, n64Var);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = jg2Var;
                this.$callable = callable;
                this.$resultChannel = jg2Var2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, n64Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x003e, B:21:0x004c, B:23:0x0054), top: B:35:0x003e }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:35:0x003e). Please report as a decompilation issue!!! */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                AnonymousClass1 anonymousClass1;
                sg2 it;
                Object objMo23482a;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                try {
                    try {
                        if (i == 0) {
                            wre.m54934b(obj);
                            this.$db.getInvalidationTracker().addObserver(this.$observer);
                            it = this.$observerChannel.iterator();
                        } else if (i == 1) {
                            sg2 sg2Var = (sg2) this.L$0;
                            wre.m54934b(obj);
                            sg2 sg2Var2 = sg2Var;
                            anonymousClass1 = this;
                            if (!((Boolean) obj).booleanValue()) {
                                sg2Var2.next();
                                Object objCall = anonymousClass1.$callable.call();
                                jg2 jg2Var = anonymousClass1.$resultChannel;
                                anonymousClass1.L$0 = sg2Var2;
                                anonymousClass1.label = 2;
                                if (jg2Var.mo23475l(objCall, anonymousClass1) == objM51918f) {
                                    return objM51918f;
                                }
                                it = sg2Var2;
                                anonymousClass1.L$0 = it;
                                anonymousClass1.label = 1;
                                objMo23482a = it.mo23482a(anonymousClass1);
                                if (objMo23482a != objM51918f) {
                                    return objM51918f;
                                }
                                sg2Var2 = it;
                                obj = objMo23482a;
                                if (!((Boolean) obj).booleanValue()) {
                                    anonymousClass1.$db.getInvalidationTracker().removeObserver(anonymousClass1.$observer);
                                    return y3i.f54824a;
                                }
                            }
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sg2 sg2Var3 = (sg2) this.L$0;
                            wre.m54934b(obj);
                            it = sg2Var3;
                        }
                        anonymousClass1.L$0 = it;
                        anonymousClass1.label = 1;
                        objMo23482a = it.mo23482a(anonymousClass1);
                        if (objMo23482a != objM51918f) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass1.$db.getInvalidationTracker().removeObserver(anonymousClass1.$observer);
                        throw th;
                    }
                    anonymousClass1 = this;
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass1 = this;
                }
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24481(boolean z, RoomDatabase roomDatabase, z37 z37Var, String[] strArr, Callable<R> callable, n64 n64Var) {
            super(2, n64Var);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = z37Var;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C24481 c24481 = new C24481(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, n64Var);
            c24481.L$0 = obj;
            return c24481;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            p64 transactionDispatcher;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.L$0;
                final jg2 jg2VarM49824b = tg2.m49824b(-1, null, null, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r7 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        jg2VarM49824b.mo23472g(y3i.f54824a);
                    }
                };
                jg2VarM49824b.mo23472g(y3i.f54824a);
                TransactionElement transactionElement = (TransactionElement) h84Var.mo6529D().get(TransactionElement.Key);
                if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    transactionDispatcher = this.$inTransaction ? CoroutinesRoomKt.getTransactionDispatcher(this.$db) : CoroutinesRoomKt.getQueryDispatcher(this.$db);
                }
                jg2 jg2VarM49824b2 = tg2.m49824b(0, null, null, 7, null);
                rm1.m46952d(h84Var, transactionDispatcher, null, new AnonymousClass1(this.$db, r7, jg2VarM49824b, this.$callable, jg2VarM49824b2, null), 2, null);
                z37 z37Var = this.$$this$flow;
                this.label = 1;
                if (e47.m24277k(z37Var, jg2VarM49824b2, this) == objM51918f) {
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
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C24481) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, n64 n64Var) {
        super(2, n64Var);
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, n64Var);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            C24481 c24481 = new C24481(this.$inTransaction, this.$db, (z37) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (i84.m31711e(c24481, this) == objM51918f) {
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
    public final Object invoke(z37 z37Var, n64 n64Var) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
