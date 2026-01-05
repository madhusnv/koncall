package androidx.room;

import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.q74;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", m36648f = "RoomDatabaseExt.kt", m36649l = {62}, m36650m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends jgg implements nl7 {
    final /* synthetic */ xk7 $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, xk7 xk7Var, n64 n64Var) {
        super(2, n64Var);
        this.$this_withTransaction = roomDatabase;
        this.$block = xk7Var;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, n64Var);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement transactionElementM51918f = uq8.m51918f();
        int i = this.label;
        try {
            if (i == 0) {
                wre.m54934b(obj);
                q74.InterfaceC16311b interfaceC16311b = ((h84) this.L$0).mo6529D().get(TransactionElement.Key);
                sq8.m48646e(interfaceC16311b);
                TransactionElement transactionElement2 = (TransactionElement) interfaceC16311b;
                transactionElement2.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        xk7 xk7Var = this.$block;
                        this.L$0 = transactionElement2;
                        this.label = 1;
                        Object objInvoke = xk7Var.invoke(this);
                        if (objInvoke == transactionElementM51918f) {
                            return transactionElementM51918f;
                        }
                        transactionElement = transactionElement2;
                        obj = objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    transactionElementM51918f = transactionElement2;
                    th = th3;
                    transactionElementM51918f.release();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.L$0;
                try {
                    wre.m54934b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
