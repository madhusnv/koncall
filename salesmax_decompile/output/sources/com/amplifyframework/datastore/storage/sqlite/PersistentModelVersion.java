package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.storage.sqlite.PersistentModelVersion;
import java.util.Iterator;
import java.util.Objects;
import p001o.auf;
import p001o.k5d;
import p001o.muf;
import p001o.s6c;
import p001o.wtf;

@ModelConfig(type = Model.Type.SYSTEM)
/* loaded from: classes5.dex */
public final class PersistentModelVersion implements Model {
    private static final String STATIC_IDENTIFIER_FOR_VERSION = "1ae1b4d0-7894-4f23-831e-ccf6c8439e1c";

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "String")
    private final String version;

    public PersistentModelVersion(String str) {
        Objects.requireNonNull(str);
        this.version = str;
        this.id = STATIC_IDENTIFIER_FOR_VERSION;
    }

    public static wtf fromLocalStorage(final LocalStorageAdapter localStorageAdapter) {
        return wtf.m55005e(new muf() { // from class: o.i5d
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                PersistentModelVersion.lambda$fromLocalStorage$0(localStorageAdapter, aufVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fromLocalStorage$0(LocalStorageAdapter localStorageAdapter, final auf aufVar) {
        QueryOptions queryOptionsMatchesAll = Where.matchesAll();
        Objects.requireNonNull(aufVar);
        localStorageAdapter.query(PersistentModelVersion.class, queryOptionsMatchesAll, new Consumer() { // from class: o.j5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                aufVar.onSuccess((Iterator) obj);
            }
        }, new k5d(aufVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveToLocalStorage$2(LocalStorageAdapter localStorageAdapter, final PersistentModelVersion persistentModelVersion, final auf aufVar) {
        StorageItemChange.Initiator initiator = StorageItemChange.Initiator.DATA_STORE_API;
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Consumer consumer = new Consumer() { // from class: o.l5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                aufVar.onSuccess(persistentModelVersion);
            }
        };
        Objects.requireNonNull(aufVar);
        localStorageAdapter.save(persistentModelVersion, initiator, queryPredicateAll, consumer, new k5d(aufVar));
    }

    public static wtf saveToLocalStorage(final LocalStorageAdapter localStorageAdapter, final PersistentModelVersion persistentModelVersion) {
        return wtf.m55005e(new muf() { // from class: o.m5d
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                PersistentModelVersion.lambda$saveToLocalStorage$2(localStorageAdapter, persistentModelVersion, aufVar);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PersistentModelVersion.class != obj.getClass()) {
            return false;
        }
        PersistentModelVersion persistentModelVersion = (PersistentModelVersion) obj;
        if (s6c.m47909a(this.id, persistentModelVersion.id)) {
            return s6c.m47909a(this.version, persistentModelVersion.version);
        }
        return false;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.id.hashCode()) * 31) + this.version.hashCode();
    }

    public String toString() {
        return "PersistentModelVersion{id='" + this.id + "', version='" + this.version + "'}";
    }

    @Override // com.amplifyframework.core.model.Model
    public String resolveIdentifier() {
        return this.id;
    }
}
