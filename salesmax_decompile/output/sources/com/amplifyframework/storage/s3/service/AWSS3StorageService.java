package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StorageItem;
import com.amplifyframework.storage.options.SubpathStrategy;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.transfer.S3StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferManager;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.amplifyframework.storage.s3.transfer.UploadOptions;
import com.amplifyframework.storage.s3.utils.S3Keys;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.objectweb.asm.Opcodes;
import p001o.cxe;
import p001o.dwc;
import p001o.dxe;
import p001o.e6c;
import p001o.efa;
import p001o.ffa;
import p001o.fl5;
import p001o.gk8;
import p001o.h84;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.qm1;
import p001o.qx7;
import p001o.s0c;
import p001o.sq8;
import p001o.tb3;
import p001o.uq8;
import p001o.v37;
import p001o.wre;
import p001o.xj3;
import p001o.xk7;
import p001o.y38;
import p001o.y3i;
import p001o.z37;

/* loaded from: classes5.dex */
public final class AWSS3StorageService implements StorageService {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final String awsRegion;
    private final String awsS3StoragePluginKey;
    private final StorageTransferClientProvider clientProvider;
    private final Context context;
    private final String s3BucketName;
    private cxe s3Client;
    private final TransferManager transferManager;

    public interface Factory {
        AWSS3StorageService create(Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider);
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$deleteObject$1", m36648f = "AWSS3StorageService.kt", m36649l = {443}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$deleteObject$1 */
    public static final class C106871 extends jgg implements nl7 {
        final /* synthetic */ String $serviceKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106871(String str, n64 n64Var) {
            super(2, n64Var);
            this.$serviceKey = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWSS3StorageService.this.new C106871(this.$serviceKey, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                cxe cxeVar = AWSS3StorageService.this.s3Client;
                AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
                String str = this.$serviceKey;
                fl5.C13479a c13479a = new fl5.C13479a();
                c13479a.m27013l(aWSS3StorageService.s3BucketName);
                c13479a.m27014m(str);
                fl5 fl5VarM27002a = c13479a.m27002a();
                this.label = 1;
                obj = cxeVar.Q1(fl5VarM27002a, this);
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
            return ((C106871) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$1", m36648f = "AWSS3StorageService.kt", m36649l = {Opcodes.MONITOREXIT}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$1 */
    public static final class C106891 extends jgg implements nl7 {
        final /* synthetic */ List<StorageItem> $items;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106891(String str, List<StorageItem> list, String str2, n64 n64Var) {
            super(2, n64Var);
            this.$path = str;
            this.$items = list;
            this.$prefix = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWSS3StorageService.this.new C106891(this.$path, this.$items, this.$prefix, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                v37 v37VarM23897a = dwc.m23897a(AWSS3StorageService.this.s3Client, new AWSS3StorageService$listFiles$1$result$1(AWSS3StorageService.this, this.$path));
                final List<StorageItem> list = this.$items;
                final String str = this.$prefix;
                z37 z37Var = new z37() { // from class: com.amplifyframework.storage.s3.service.AWSS3StorageService.listFiles.1.1
                    @Override // p001o.z37
                    public final Object emit(ffa ffaVar, n64 n64Var) {
                        List<e6c> listM26552b = ffaVar.m26552b();
                        if (listM26552b != null) {
                            List<StorageItem> list2 = list;
                            String str2 = str;
                            for (e6c e6cVar : listM26552b) {
                                String strM24396b = e6cVar.m24396b();
                                gk8 gk8VarM24397c = e6cVar.m24397c();
                                String strM24395a = e6cVar.m24395a();
                                if (strM24396b != null && gk8VarM24397c != null && strM24395a != null) {
                                    String strExtractAmplifyKey = S3Keys.extractAmplifyKey(strM24396b, str2);
                                    sq8.m48648g(strExtractAmplifyKey, "extractAmplifyKey(...)");
                                    Long lM24398d = e6cVar.m24398d();
                                    long jLongValue = lM24398d != null ? lM24398d.longValue() : 0L;
                                    Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(gk8VarM24397c.m28952e()));
                                    sq8.m48648g(dateFrom, "from(...)");
                                    list2.add(new StorageItem(strM24396b, strExtractAmplifyKey, jLongValue, dateFrom, strM24395a, null));
                                }
                            }
                        }
                        return y3i.f54824a;
                    }
                };
                this.label = 1;
                if (v37VarM23897a.mo9775a(z37Var, this) == objM51918f) {
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
            return ((C106891) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$2", m36648f = "AWSS3StorageService.kt", m36649l = {443}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$2 */
    public static final class C106902 extends jgg implements nl7 {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106902(String str, int i, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.$path = str;
            this.$pageSize = i;
            this.$nextToken = str2;
            this.$prefix = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWSS3StorageService.this.new C106902(this.$path, this.$pageSize, this.$nextToken, this.$prefix, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            StorageItem storageItem;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                cxe cxeVar = AWSS3StorageService.this.s3Client;
                AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
                String str = this.$path;
                int i2 = this.$pageSize;
                String str2 = this.$nextToken;
                efa.C13180a c13180a = new efa.C13180a();
                c13180a.m24949m(aWSS3StorageService.s3BucketName);
                c13180a.m24953q(str);
                c13180a.m24952p(ml1.m39304d(i2));
                c13180a.m24950n(str2);
                efa efaVarM24937a = c13180a.m24937a();
                this.label = 1;
                obj = cxeVar.i2(efaVarM24937a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            ffa ffaVar = (ffa) obj;
            List<e6c> listM26552b = ffaVar.m26552b();
            ArrayList arrayList = null;
            if (listM26552b != null) {
                String str3 = this.$prefix;
                ArrayList arrayList2 = new ArrayList();
                for (e6c e6cVar : listM26552b) {
                    String strM24396b = e6cVar.m24396b();
                    gk8 gk8VarM24397c = e6cVar.m24397c();
                    String strM24395a = e6cVar.m24395a();
                    if (strM24396b == null || gk8VarM24397c == null || strM24395a == null) {
                        storageItem = null;
                    } else {
                        String strExtractAmplifyKey = S3Keys.extractAmplifyKey(strM24396b, str3);
                        sq8.m48648g(strExtractAmplifyKey, "extractAmplifyKey(...)");
                        Long lM24398d = e6cVar.m24398d();
                        long jLongValue = lM24398d != null ? lM24398d.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(gk8VarM24397c.m28952e()));
                        sq8.m48648g(dateFrom, "from(...)");
                        storageItem = new StorageItem(strM24396b, strExtractAmplifyKey, jLongValue, dateFrom, strM24395a, null);
                    }
                    if (storageItem != null) {
                        arrayList2.add(storageItem);
                    }
                }
                arrayList = arrayList2;
            }
            return StorageListResult.fromItems(arrayList, ffaVar.m26553c());
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106902) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$3", m36648f = "AWSS3StorageService.kt", m36649l = {262}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$3 */
    public static final class C106913 extends jgg implements nl7 {
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106913(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$prefix = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106913(this.$subPathStrategy, this.this$0, this.$path, this.$prefix, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            final List arrayList;
            List list;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                v37 v37VarM23897a = dwc.m23897a(this.this$0.s3Client, new AWSS3StorageService$listFiles$3$result$1(this.this$0, this.$path, exclude != null ? exclude.getDelimiter() : null));
                final String str = this.$prefix;
                z37 z37Var = new z37() { // from class: com.amplifyframework.storage.s3.service.AWSS3StorageService.listFiles.3.1
                    @Override // p001o.z37
                    public final Object emit(ffa ffaVar, n64 n64Var) {
                        List<e6c> listM26552b = ffaVar.m26552b();
                        if (listM26552b != null) {
                            List<StorageItem> list2 = arrayList;
                            String str2 = str;
                            for (e6c e6cVar : listM26552b) {
                                String strM24396b = e6cVar.m24396b();
                                gk8 gk8VarM24397c = e6cVar.m24397c();
                                String strM24395a = e6cVar.m24395a();
                                if (strM24396b != null && gk8VarM24397c != null && strM24395a != null) {
                                    String strExtractAmplifyKey = S3Keys.extractAmplifyKey(strM24396b, str2);
                                    sq8.m48648g(strExtractAmplifyKey, "extractAmplifyKey(...)");
                                    Long lM24398d = e6cVar.m24398d();
                                    long jLongValue = lM24398d != null ? lM24398d.longValue() : 0L;
                                    Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(gk8VarM24397c.m28952e()));
                                    sq8.m48648g(dateFrom, "from(...)");
                                    list2.add(new StorageItem(strM24396b, strExtractAmplifyKey, jLongValue, dateFrom, strM24395a, null));
                                }
                            }
                        }
                        List listM26551a = ffaVar.m26551a();
                        if (listM26551a != null) {
                            List<String> list3 = arrayList2;
                            Iterator<T> it = listM26551a.iterator();
                            while (it.hasNext()) {
                                String strM56371a = ((xj3) it.next()).m56371a();
                                if (strM56371a != null) {
                                    list3.add(strM56371a);
                                }
                            }
                        }
                        return y3i.f54824a;
                    }
                };
                this.L$0 = arrayList;
                this.L$1 = arrayList2;
                this.label = 1;
                if (v37VarM23897a.mo9775a(z37Var, this) == objM51918f) {
                    return objM51918f;
                }
                list = arrayList2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                arrayList = (List) this.L$0;
                wre.m54934b(obj);
            }
            return StorageListResult.fromItems(arrayList, null, list);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106913) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$4", m36648f = "AWSS3StorageService.kt", m36649l = {443}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$4 */
    public static final class C106924 extends jgg implements nl7 {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106924(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, int i, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$pageSize = i;
            this.$nextToken = str2;
            this.$prefix = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106924(this.$subPathStrategy, this.this$0, this.$path, this.$pageSize, this.$nextToken, this.$prefix, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            StorageItem storageItem;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            ArrayList arrayList2 = null;
            if (i == 0) {
                wre.m54934b(obj);
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                String delimiter = exclude != null ? exclude.getDelimiter() : null;
                cxe cxeVar = this.this$0.s3Client;
                AWSS3StorageService aWSS3StorageService = this.this$0;
                String str = this.$path;
                int i2 = this.$pageSize;
                String str2 = this.$nextToken;
                efa.C13180a c13180a = new efa.C13180a();
                c13180a.m24949m(aWSS3StorageService.s3BucketName);
                c13180a.m24953q(str);
                c13180a.m24952p(ml1.m39304d(i2));
                c13180a.m24950n(str2);
                c13180a.m24951o(delimiter);
                efa efaVarM24937a = c13180a.m24937a();
                this.label = 1;
                obj = cxeVar.i2(efaVarM24937a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            ffa ffaVar = (ffa) obj;
            List<e6c> listM26552b = ffaVar.m26552b();
            if (listM26552b != null) {
                String str3 = this.$prefix;
                arrayList = new ArrayList();
                for (e6c e6cVar : listM26552b) {
                    String strM24396b = e6cVar.m24396b();
                    gk8 gk8VarM24397c = e6cVar.m24397c();
                    String strM24395a = e6cVar.m24395a();
                    if (strM24396b == null || gk8VarM24397c == null || strM24395a == null) {
                        storageItem = null;
                    } else {
                        String strExtractAmplifyKey = S3Keys.extractAmplifyKey(strM24396b, str3);
                        sq8.m48648g(strExtractAmplifyKey, "extractAmplifyKey(...)");
                        Long lM24398d = e6cVar.m24398d();
                        long jLongValue = lM24398d != null ? lM24398d.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(gk8VarM24397c.m28952e()));
                        sq8.m48648g(dateFrom, "from(...)");
                        storageItem = new StorageItem(strM24396b, strExtractAmplifyKey, jLongValue, dateFrom, strM24395a, null);
                    }
                    if (storageItem != null) {
                        arrayList.add(storageItem);
                    }
                }
            } else {
                arrayList = null;
            }
            List listM26551a = ffaVar.m26551a();
            if (listM26551a != null) {
                arrayList2 = new ArrayList();
                Iterator it = listM26551a.iterator();
                while (it.hasNext()) {
                    String strM56371a = ((xj3) it.next()).m56371a();
                    if (strM56371a != null) {
                        arrayList2.add(strM56371a);
                    }
                }
            }
            return StorageListResult.fromItems(arrayList, ffaVar.m26553c(), arrayList2);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106924) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$5", m36648f = "AWSS3StorageService.kt", m36649l = {443}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$5 */
    public static final class C106935 extends jgg implements nl7 {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106935(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, int i, String str2, n64 n64Var) {
            super(2, n64Var);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$pageSize = i;
            this.$nextToken = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106935(this.$subPathStrategy, this.this$0, this.$path, this.$pageSize, this.$nextToken, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            StorageItem storageItem;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            ArrayList arrayList2 = null;
            if (i == 0) {
                wre.m54934b(obj);
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                String delimiter = exclude != null ? exclude.getDelimiter() : null;
                cxe cxeVar = this.this$0.s3Client;
                AWSS3StorageService aWSS3StorageService = this.this$0;
                String str = this.$path;
                int i2 = this.$pageSize;
                String str2 = this.$nextToken;
                efa.C13180a c13180a = new efa.C13180a();
                c13180a.m24949m(aWSS3StorageService.s3BucketName);
                c13180a.m24953q(str);
                c13180a.m24952p(ml1.m39304d(i2));
                c13180a.m24950n(str2);
                c13180a.m24951o(delimiter);
                efa efaVarM24937a = c13180a.m24937a();
                this.label = 1;
                obj = cxeVar.i2(efaVarM24937a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            ffa ffaVar = (ffa) obj;
            List<e6c> listM26552b = ffaVar.m26552b();
            if (listM26552b != null) {
                arrayList = new ArrayList();
                for (e6c e6cVar : listM26552b) {
                    String strM24396b = e6cVar.m24396b();
                    gk8 gk8VarM24397c = e6cVar.m24397c();
                    String strM24395a = e6cVar.m24395a();
                    if (strM24396b == null || gk8VarM24397c == null || strM24395a == null) {
                        storageItem = null;
                    } else {
                        Long lM24398d = e6cVar.m24398d();
                        long jLongValue = lM24398d != null ? lM24398d.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(gk8VarM24397c.m28952e()));
                        sq8.m48648g(dateFrom, "from(...)");
                        storageItem = new StorageItem(strM24396b, strM24396b, jLongValue, dateFrom, strM24395a, null);
                    }
                    if (storageItem != null) {
                        arrayList.add(storageItem);
                    }
                }
            } else {
                arrayList = null;
            }
            List listM26551a = ffaVar.m26551a();
            if (listM26551a != null) {
                arrayList2 = new ArrayList();
                Iterator it = listM26551a.iterator();
                while (it.hasNext()) {
                    String strM56371a = ((xj3) it.next()).m56371a();
                    if (strM56371a != null) {
                        arrayList2.add(strM56371a);
                    }
                }
            }
            return StorageListResult.fromItems(arrayList, ffaVar.m26553c(), arrayList2);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106935) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$validateObjectExists$1", m36648f = "AWSS3StorageService.kt", m36649l = {100}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$validateObjectExists$1 */
    public static final class C106941 extends jgg implements nl7 {
        final /* synthetic */ String $serviceKey;
        int label;

        /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$validateObjectExists$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ String $serviceKey;
            final /* synthetic */ AWSS3StorageService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AWSS3StorageService aWSS3StorageService, String str) {
                super(1);
                this.this$0 = aWSS3StorageService;
                this.$serviceKey = str;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((qx7.C16485a) obj);
                return y3i.f54824a;
            }

            public final void invoke(qx7.C16485a c16485a) {
                sq8.m48649h(c16485a, "$this$invoke");
                c16485a.m45947w(this.this$0.s3BucketName);
                c16485a.m45948x(this.$serviceKey);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106941(String str, n64 n64Var) {
            super(2, n64Var);
            this.$serviceKey = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWSS3StorageService.this.new C106941(this.$serviceKey, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                cxe cxeVar = AWSS3StorageService.this.s3Client;
                qx7 qx7VarM45949a = qx7.f42548u.m45949a(new AnonymousClass1(AWSS3StorageService.this, this.$serviceKey));
                this.label = 1;
                obj = cxeVar.h0(qx7VarM45949a, this);
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
            return ((C106941) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public AWSS3StorageService(Context context, String str, String str2, AuthCredentialsProvider authCredentialsProvider, String str3, StorageTransferClientProvider storageTransferClientProvider) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "awsRegion");
        sq8.m48649h(str2, "s3BucketName");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(str3, "awsS3StoragePluginKey");
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        this.context = context;
        this.awsRegion = str;
        this.s3BucketName = str2;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginKey = str3;
        this.clientProvider = storageTransferClientProvider;
        this.s3Client = S3StorageTransferClientProvider.Companion.getS3Client(str, authCredentialsProvider);
        this.transferManager = new TransferManager(context, storageTransferClientProvider, str3, null, 8, null);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void cancelTransfer(TransferObserver transferObserver) {
        sq8.m48649h(transferObserver, "transferObserver");
        this.transferManager.cancel(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void deleteObject(String str) {
        sq8.m48649h(str, "serviceKey");
        qm1.m45641b(null, new C106871(str, null), 1, null);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver downloadToFile(String str, String str2, File file, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "serviceKey");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        return TransferManager.download$default(this.transferManager, str, this.s3BucketName, this.awsRegion, str2, file, null, z, 32, null);
    }

    public final cxe getClient() {
        return this.s3Client;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public URL getPresignedUrl(String str, int i, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "serviceKey");
        cxe cxeVarM23925a = dxe.m23925a(this.s3Client, new AWSS3StorageService$getPresignedUrl$presignUrlRequest$1(z));
        try {
            y38 y38Var = (y38) qm1.m45641b(null, new AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(cxeVarM23925a, i, this, str, null), 1, null);
            tb3.m49666a(cxeVarM23925a, null);
            return new URL(y38Var.getUrl().toString());
        } finally {
        }
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferRecord getTransfer(String str) {
        sq8.m48649h(str, "transferId");
        return this.transferManager.getTransferOperationById(str);
    }

    public final TransferManager getTransferManager() {
        return this.transferManager;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public List<StorageItem> listFiles(String str, String str2) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "prefix");
        ArrayList arrayList = new ArrayList();
        qm1.m45641b(null, new C106891(str, arrayList, str2, null), 1, null);
        return arrayList;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void pauseTransfer(TransferObserver transferObserver) {
        sq8.m48649h(transferObserver, "transferObserver");
        this.transferManager.pause(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void resumeTransfer(TransferObserver transferObserver) {
        sq8.m48649h(transferObserver, "transferObserver");
        this.transferManager.resume(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadFile(String str, String str2, File file, ObjectMetadata objectMetadata, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "serviceKey");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(objectMetadata, "metadata");
        return TransferManager.upload$default(this.transferManager, str, this.s3BucketName, this.awsRegion, str2, file, objectMetadata, null, null, z, Opcodes.CHECKCAST, null);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadInputStream(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "serviceKey");
        sq8.m48649h(inputStream, "inputStream");
        sq8.m48649h(objectMetadata, "metadata");
        return this.transferManager.upload(str, str2, inputStream, new UploadOptions(this.s3BucketName, this.awsRegion, objectMetadata, null, null, 24, null), z);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void validateObjectExists(String str) throws StorageException {
        sq8.m48649h(str, "serviceKey");
        try {
            qm1.m45641b(null, new C106941(str, null), 1, null);
        } catch (s0c e) {
            throw new StorageException("Unable to generate URL for non-existent path: " + str, e, "Please ensure the path is valid or the object has been uploaded");
        }
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String str, String str2, int i, String str3) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "prefix");
        Object objM45641b = qm1.m45641b(null, new C106902(str, i, str3, str2, null), 1, null);
        sq8.m48646e(objM45641b);
        return (StorageListResult) objM45641b;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String str, String str2, SubpathStrategy subpathStrategy) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "prefix");
        Object objM45641b = qm1.m45641b(null, new C106913(subpathStrategy, this, str, str2, null), 1, null);
        sq8.m48646e(objM45641b);
        return (StorageListResult) objM45641b;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String str, String str2, int i, String str3, SubpathStrategy subpathStrategy) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "prefix");
        Object objM45641b = qm1.m45641b(null, new C106924(subpathStrategy, this, str, i, str3, str2, null), 1, null);
        sq8.m48646e(objM45641b);
        return (StorageListResult) objM45641b;
    }

    public final StorageListResult listFiles(String str, int i, String str2, SubpathStrategy subpathStrategy) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        Object objM45641b = qm1.m45641b(null, new C106935(subpathStrategy, this, str, i, str2, null), 1, null);
        sq8.m48646e(objM45641b);
        return (StorageListResult) objM45641b;
    }
}
