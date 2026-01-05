package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.syncengine.PendingMutation;
import java.util.Iterator;
import p001o.a0f;
import p001o.ch3;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.datastore.syncengine.PersistentMutationOutbox$fetchPendingMutations$pendingMutations$1$chunkResult$1", m36648f = "PersistentMutationOutbox.kt", m36649l = {122}, m36650m = "invokeSuspend")
/* renamed from: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox$fetchPendingMutations$pendingMutations$1$chunkResult$1 */
/* loaded from: classes5.dex */
public final class C10570xab3f1a31 extends jgg implements nl7 {
    final /* synthetic */ QueryOptions $queryOptions;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PersistentMutationOutbox this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10570xab3f1a31(PersistentMutationOutbox persistentMutationOutbox, QueryOptions queryOptions, n64 n64Var) {
        super(2, n64Var);
        this.this$0 = persistentMutationOutbox;
        this.$queryOptions = queryOptions;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new C10570xab3f1a31(this.this$0, this.$queryOptions, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            PersistentMutationOutbox persistentMutationOutbox = this.this$0;
            QueryOptions queryOptions = this.$queryOptions;
            this.L$0 = persistentMutationOutbox;
            this.L$1 = queryOptions;
            this.label = 1;
            final a0f a0fVar = new a0f(tq8.m50336c(this));
            persistentMutationOutbox.storage.query(PendingMutation.PersistentRecord.class, queryOptions, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox$fetchPendingMutations$pendingMutations$1$chunkResult$1$1$1
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Iterator<PendingMutation.PersistentRecord> it) {
                    sq8.m48649h(it, "it");
                    a0fVar.resumeWith(vre.m53351b(it));
                }
            }, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox$fetchPendingMutations$pendingMutations$1$chunkResult$1$1$2
                @Override // com.amplifyframework.core.Consumer
                public final void accept(DataStoreException dataStoreException) {
                    sq8.m48649h(dataStoreException, "it");
                    PersistentMutationOutbox.LOG.debug("Failed to query PersistentRecord outbox.");
                    n64 n64Var = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(ch3.m21246k().iterator()));
                }
            });
            obj = a0fVar.m16313b();
            if (obj == uq8.m51918f()) {
                n75.m40201c(this);
            }
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return obj;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((C10570xab3f1a31) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
