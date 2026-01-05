package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.ModelMetadata;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.extensions.ModelExtensionsKt;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.syncengine.VersionRepository;
import com.amplifyframework.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.objectweb.asm.Opcodes;
import p001o.a0f;
import p001o.auf;
import p001o.dh3;
import p001o.id5;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.muf;
import p001o.n64;
import p001o.n75;
import p001o.o64;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.wtf;

/* loaded from: classes5.dex */
public final class VersionRepository {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_CHUNK_SIZE = 950;
    private static final Logger LOG;
    private int chunkSize;
    private final LocalStorageAdapter localStorageAdapter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.datastore.syncengine.VersionRepository", m36648f = "VersionRepository.kt", m36649l = {Opcodes.SWAP}, m36650m = "fetchModelVersions")
    /* renamed from: com.amplifyframework.datastore.syncengine.VersionRepository$fetchModelVersions$1 */
    public static final class C105791<T extends Model> extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C105791(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VersionRepository.this.fetchModelVersions(null, this);
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
        sq8.m48648g(logger, "logger(...)");
        LOG = logger;
    }

    public VersionRepository(LocalStorageAdapter localStorageAdapter) {
        sq8.m48649h(localStorageAdapter, "localStorageAdapter");
        this.localStorageAdapter = localStorageAdapter;
        this.chunkSize = DEFAULT_CHUNK_SIZE;
    }

    private final <T extends Model> Optional<Integer> extractVersion(T t, Iterator<ModelMetadata> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.size() == 1) {
            Optional<Integer> optionalOfNullable = Optional.ofNullable(((ModelMetadata) arrayList.get(0)).getVersion());
            sq8.m48648g(optionalOfNullable, "ofNullable(...)");
            return optionalOfNullable;
        }
        LOG.warn("Wanted 1 metadata for item with id = " + t.getPrimaryKeyString() + ", but had " + arrayList.size() + ".");
        Optional<Integer> optionalEmpty = Optional.empty();
        sq8.m48648g(optionalEmpty, "empty(...)");
        return optionalEmpty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findModelVersion$lambda$2(final VersionRepository versionRepository, final Model model, final auf aufVar) {
        sq8.m48649h(versionRepository, "this$0");
        sq8.m48649h(model, "$model");
        sq8.m48649h(aufVar, "emitter");
        versionRepository.localStorageAdapter.query(ModelMetadata.class, Where.identifier(ModelMetadata.class, ModelExtensionsKt.getMetadataSQLitePrimaryKey(model)), new Consumer() { // from class: o.rti
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                VersionRepository.findModelVersion$lambda$2$lambda$0(aufVar, versionRepository, model, (Iterator) obj);
            }
        }, new Consumer() { // from class: o.sti
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                VersionRepository.findModelVersion$lambda$2$lambda$1(aufVar, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findModelVersion$lambda$2$lambda$0(auf aufVar, VersionRepository versionRepository, Model model, Iterator it) {
        sq8.m48649h(aufVar, "$emitter");
        sq8.m48649h(versionRepository, "this$0");
        sq8.m48649h(model, "$model");
        sq8.m48649h(it, "iterableResults");
        try {
            aufVar.onSuccess(versionRepository.extractVersion(model, it));
        } catch (DataStoreException e) {
            aufVar.onError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findModelVersion$lambda$2$lambda$1(auf aufVar, DataStoreException dataStoreException) {
        sq8.m48649h(aufVar, "$emitter");
        sq8.m48649h(dataStoreException, "t");
        aufVar.onError(dataStoreException);
    }

    public static /* synthetic */ void getChunkSize$aws_datastore_release$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        if (r1 != r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends Model> Object fetchModelVersions(List<ModelWithMetadata<T>> list, n64 n64Var) throws Throwable {
        C105791 c105791;
        VersionRepository versionRepository;
        QueryField queryField;
        Iterator it;
        Map map;
        Integer version;
        if (n64Var instanceof C105791) {
            c105791 = (C105791) n64Var;
            int i = c105791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105791.label = i - Integer.MIN_VALUE;
            } else {
                c105791 = new C105791(n64Var);
            }
        }
        Object objM16313b = c105791.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105791.label;
        int i3 = 1;
        if (i2 == 0) {
            wre.m54934b(objM16313b);
            QueryField queryFieldField = QueryField.field(ModelMetadata.class.getSimpleName(), ModelSchema.fromModelClass(ModelMetadata.class).getPrimaryKeyName());
            List listM35707W = kh3.m35707W(list, this.chunkSize);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            versionRepository = this;
            queryField = queryFieldField;
            it = listM35707W.iterator();
            map = linkedHashMap;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c105791.L$3;
            it = (Iterator) c105791.L$2;
            queryField = (QueryField) c105791.L$1;
            versionRepository = (VersionRepository) c105791.L$0;
            wre.m54934b(objM16313b);
            sq8.m48648g(objM16313b, "suspendCoroutine(...)");
            Iterator it2 = (Iterator) objM16313b;
            while (it2.hasNext()) {
                ModelMetadata modelMetadata = (ModelMetadata) it2.next();
                if (modelMetadata.getVersion() == null) {
                    LOG.warn("Metadata for item with id = " + modelMetadata.getPrimaryKeyString() + " had null version. This is likely a bug. Please report to AWS.");
                    version = ml1.m39304d(-1);
                } else {
                    String primaryKeyString = modelMetadata.getPrimaryKeyString();
                    sq8.m48648g(primaryKeyString, "getPrimaryKeyString(...)");
                    if (map.containsKey(primaryKeyString)) {
                        LOG.warn("Fetched more than 1 metadata for item with id = " + modelMetadata.getPrimaryKeyString() + ". This is likely a bug. please report to AWS.");
                        version = ml1.m39304d(-1);
                    } else {
                        version = modelMetadata.getVersion();
                        if (version == null) {
                            version = ml1.m39304d(-1);
                        }
                    }
                }
                sq8.m48646e(version);
                int iIntValue = version.intValue();
                String primaryKeyString2 = modelMetadata.getPrimaryKeyString();
                sq8.m48648g(primaryKeyString2, "getPrimaryKeyString(...)");
                map.put(primaryKeyString2, ml1.m39304d(iIntValue));
                i3 = 1;
            }
            if (it.hasNext()) {
                List<ModelWithMetadata> list2 = (List) it.next();
                QueryPredicateGroup.Type type2 = QueryPredicateGroup.Type.OR;
                ArrayList arrayList = new ArrayList(dh3.m23088v(list2, 10));
                for (ModelWithMetadata modelWithMetadata : list2) {
                    arrayList.add(queryField.eq(modelWithMetadata.getModel().getModelName() + "|" + modelWithMetadata.getModel().getPrimaryKeyString()));
                }
                QueryOptions queryOptionsMatches = Where.matches(new QueryPredicateGroup(type2, arrayList));
                c105791.L$0 = versionRepository;
                c105791.L$1 = queryField;
                c105791.L$2 = it;
                c105791.L$3 = map;
                c105791.L$4 = c105791;
                c105791.L$5 = queryOptionsMatches;
                c105791.label = i3;
                final a0f a0fVar = new a0f(tq8.m50336c(c105791));
                versionRepository.localStorageAdapter.query(ModelMetadata.class, queryOptionsMatches, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.VersionRepository$fetchModelVersions$2$chunkResult$1$1
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Iterator<ModelMetadata> it3) {
                        sq8.m48649h(it3, "it");
                        a0fVar.resumeWith(vre.m53351b(it3));
                    }
                }, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.VersionRepository$fetchModelVersions$2$chunkResult$1$2
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(DataStoreException dataStoreException) {
                        sq8.m48649h(dataStoreException, "it");
                        n64 n64Var2 = a0fVar;
                        vre.C17665a c17665a = vre.f50797b;
                        n64Var2.resumeWith(vre.m53351b(wre.m54933a(dataStoreException)));
                    }
                });
                objM16313b = a0fVar.m16313b();
                if (objM16313b == uq8.m51918f()) {
                    n75.m40201c(c105791);
                    if (objM16313b == objM51918f) {
                        return objM51918f;
                    }
                } else if (objM16313b == objM51918f) {
                }
                sq8.m48648g(objM16313b, "suspendCoroutine(...)");
                Iterator it22 = (Iterator) objM16313b;
                while (it22.hasNext()) {
                }
                if (it.hasNext()) {
                    return map;
                }
            }
        }
    }

    public final <T extends Model> wtf findModelVersion(final T t) {
        sq8.m48649h(t, "model");
        wtf wtfVarM55005e = wtf.m55005e(new muf() { // from class: o.tti
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                VersionRepository.findModelVersion$lambda$2(this.f47776a, t, aufVar);
            }
        });
        sq8.m48648g(wtfVarM55005e, "create(...)");
        return wtfVarM55005e;
    }

    public final int getChunkSize$aws_datastore_release() {
        return this.chunkSize;
    }

    public final void setChunkSize$aws_datastore_release(int i) {
        this.chunkSize = i;
    }
}
