package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicateOperation;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.storage.StorageItemChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p001o.auf;
import p001o.fl3;
import p001o.k5d;
import p001o.muf;
import p001o.nl3;
import p001o.wtf;
import p001o.xk3;

/* loaded from: classes5.dex */
final class SyncTimeRegistry {
    private final LocalStorageAdapter localStorageAdapter;

    public SyncTimeRegistry(LocalStorageAdapter localStorageAdapter) {
        this.localStorageAdapter = localStorageAdapter;
    }

    private LastSyncMetadata extractSingleResult(String str, Iterator<LastSyncMetadata> it) throws DataStoreException {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.size() <= 1) {
            return arrayList.size() == 1 ? (LastSyncMetadata) arrayList.get(0) : LastSyncMetadata.neverSynced(str);
        }
        throw new DataStoreException("Wanted 1 sync time for model = " + str + ", but found " + arrayList.size() + ".", "This is likely a bug. Please report it to AWS.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$lookupLastSyncTime$0(String str, QueryPredicate queryPredicate, auf aufVar, Iterator it) {
        try {
            LastSyncMetadata lastSyncMetadataExtractSingleResult = extractSingleResult(str, it);
            SyncTime syncTimeFrom = SyncTime.from(lastSyncMetadataExtractSingleResult.getLastSyncTime());
            if (!Objects.equals(lastSyncMetadataExtractSingleResult.getSyncExpression(), queryPredicate)) {
                syncTimeFrom = SyncTime.never();
            }
            aufVar.onSuccess(syncTimeFrom);
        } catch (DataStoreException e) {
            aufVar.onError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$lookupLastSyncTime$1(final String str, final QueryPredicate queryPredicate, final auf aufVar) {
        QueryPredicateOperation<Object> queryPredicateOperationEq = QueryField.field("modelClassName").eq(str);
        LocalStorageAdapter localStorageAdapter = this.localStorageAdapter;
        QueryOptions queryOptionsMatches = Where.matches(queryPredicateOperationEq);
        Consumer consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.h2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f10715a.lambda$lookupLastSyncTime$0(str, queryPredicate, aufVar, (Iterator) obj);
            }
        };
        Objects.requireNonNull(aufVar);
        localStorageAdapter.query(LastSyncMetadata.class, queryOptionsMatches, consumer, new k5d(aufVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveLastBaseSync$5(LastSyncMetadata lastSyncMetadata, final fl3 fl3Var) {
        LocalStorageAdapter localStorageAdapter = this.localStorageAdapter;
        StorageItemChange.Initiator initiator = StorageItemChange.Initiator.SYNC_ENGINE;
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Consumer consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.i2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                fl3Var.onComplete();
            }
        };
        Objects.requireNonNull(fl3Var);
        localStorageAdapter.save(lastSyncMetadata, initiator, queryPredicateAll, consumer, new p001o.y1(fl3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveLastDeltaSync$3(LastSyncMetadata lastSyncMetadata, final fl3 fl3Var) {
        LocalStorageAdapter localStorageAdapter = this.localStorageAdapter;
        StorageItemChange.Initiator initiator = StorageItemChange.Initiator.SYNC_ENGINE;
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Consumer consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.e2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                fl3Var.onComplete();
            }
        };
        Objects.requireNonNull(fl3Var);
        localStorageAdapter.save(lastSyncMetadata, initiator, queryPredicateAll, consumer, new p001o.y1(fl3Var));
    }

    public wtf lookupLastSyncTime(final String str, final QueryPredicate queryPredicate) {
        return wtf.m55005e(new muf() { // from class: com.amplifyframework.datastore.syncengine.f2
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                this.f10697a.lambda$lookupLastSyncTime$1(str, queryPredicate, aufVar);
            }
        });
    }

    public xk3 saveLastBaseSync(String str, SyncTime syncTime, QueryPredicate queryPredicate) {
        final LastSyncMetadata lastSyncMetadataNeverSynced = (syncTime == null || !syncTime.exists()) ? LastSyncMetadata.neverSynced(str) : LastSyncMetadata.baseSyncedAt(str, syncTime.toLong(), queryPredicate);
        return xk3.m56389h(new nl3() { // from class: com.amplifyframework.datastore.syncengine.d2
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                this.f10690a.lambda$saveLastBaseSync$5(lastSyncMetadataNeverSynced, fl3Var);
            }
        });
    }

    public xk3 saveLastDeltaSync(String str, SyncTime syncTime, QueryPredicate queryPredicate) {
        final LastSyncMetadata lastSyncMetadataNeverSynced = (syncTime == null || !syncTime.exists()) ? LastSyncMetadata.neverSynced(str) : LastSyncMetadata.deltaSyncedAt(str, syncTime.toLong(), queryPredicate);
        return xk3.m56389h(new nl3() { // from class: com.amplifyframework.datastore.syncengine.g2
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                this.f10704a.lambda$saveLastDeltaSync$3(lastSyncMetadataNeverSynced, fl3Var);
            }
        });
    }
}
