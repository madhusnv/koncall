package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import mb.a1;
import mb.m2;
import mb.m3;
import mb.n2;
import mb.o2;
import mb.w2;
import mb.y1;
import mb.z1;
import og.s0;
import og.t0;
import pg.AbstractC5931l;
import qw.a0;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface BaseTransferWorker {
    public static final String COMPLETION_REQUEST_TAG = "COMPLETION_REQUEST_TAG_%s";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String INITIATION_REQUEST_TAG = "INITIATION_REQUEST_TAG_%s";
    public static final String MULTIPART_UPLOAD = "MULTIPART_UPLOAD";
    public static final String MULTI_PART_UPLOAD_ID = "multipartUploadId";
    public static final String OUTPUT_TRANSFER_RECORD_ID = "OUTPUT_TRANSFER_RECORD_ID";
    public static final String PART_RECORD_ID = "PART_RECORD_ID";
    public static final String RUN_AS_FOREGROUND_TASK = "RUN_AS_FOREGROUND_TASK";
    public static final String TRANSFER_RECORD_ID = "TRANSFER_RECORD_ID";
    public static final String WORKER_ID = "WORKER_ID";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Map<String, a1> CANNED_ACL_MAP;
        public static final String COMPLETION_REQUEST_TAG = "COMPLETION_REQUEST_TAG_%s";
        public static final String INITIATION_REQUEST_TAG = "INITIATION_REQUEST_TAG_%s";
        public static final String MULTIPART_UPLOAD = "MULTIPART_UPLOAD";
        public static final String MULTI_PART_UPLOAD_ID = "multipartUploadId";
        public static final String OUTPUT_TRANSFER_RECORD_ID = "OUTPUT_TRANSFER_RECORD_ID";
        public static final String PART_RECORD_ID = "PART_RECORD_ID";
        public static final String RUN_AS_FOREGROUND_TASK = "RUN_AS_FOREGROUND_TASK";
        public static final String TRANSFER_RECORD_ID = "TRANSFER_RECORD_ID";
        public static final String WORKER_ID = "WORKER_ID";

        static {
            List list = a1.f23174a;
            int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(list, 10));
            if (iM12776d < 16) {
                iM12776d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
            for (Object obj : list) {
                linkedHashMap.put(((a1) obj).mo9579a(), obj);
            }
            CANNED_ACL_MAP = linkedHashMap;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static z1 createPutObjectRequest(BaseTransferWorker baseTransferWorker, TransferRecord transferRecord, ProgressListener progressListener) {
            AbstractC4154l.m8923f(transferRecord, "transferRecord");
            return BaseTransferWorker.super.createPutObjectRequest(transferRecord, progressListener);
        }

        @Deprecated
        public static boolean isNetworkAvailable(BaseTransferWorker baseTransferWorker, Context context) {
            AbstractC4154l.m8923f(context, "context");
            return BaseTransferWorker.super.isNetworkAvailable(context);
        }
    }

    private static a0 createPutObjectRequest$lambda$5(TransferRecord transferRecord, File file, y1 PutObjectRequest) {
        w2 w2VarM10884a;
        C7126c c7126cM13404b;
        m3 m3VarM10918a;
        o2 n2Var;
        String str;
        AbstractC4154l.m8923f(PutObjectRequest, "$this$PutObjectRequest");
        PutObjectRequest.f23554c = transferRecord.getBucketName();
        PutObjectRequest.f23561j = transferRecord.getKey();
        AbstractC4154l.m8923f(file, "file");
        PutObjectRequest.f23553b = AbstractC5931l.m11737b(file, 0L, file.length() - 1);
        PutObjectRequest.f23555d = transferRecord.getHeaderCacheControl();
        PutObjectRequest.f23556e = transferRecord.getHeaderContentDisposition();
        String sseAlgorithm = transferRecord.getSseAlgorithm();
        if (sseAlgorithm != null) {
            int i10 = w2.f23519a;
            w2VarM10884a = s0.m10884a(sseAlgorithm);
        } else {
            w2VarM10884a = null;
        }
        PutObjectRequest.f23564m = w2VarM10884a;
        PutObjectRequest.f23565n = transferRecord.getSseKMSKey();
        PutObjectRequest.f23557f = transferRecord.getHeaderContentEncoding();
        PutObjectRequest.f23559h = transferRecord.getHeaderContentType();
        String httpExpires = transferRecord.getHttpExpires();
        if (httpExpires != null) {
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            c7126cM13404b = C7124a.m13404b(httpExpires);
        } else {
            c7126cM13404b = null;
        }
        PutObjectRequest.f23560i = c7126cM13404b;
        PutObjectRequest.f23562k = transferRecord.getUserMetadata();
        PutObjectRequest.f23558g = transferRecord.getMd5();
        String headerStorageClass = transferRecord.getHeaderStorageClass();
        if (headerStorageClass != null) {
            int i11 = m3.f23356a;
            m3VarM10918a = t0.m10918a(headerStorageClass);
        } else {
            m3VarM10918a = null;
        }
        PutObjectRequest.f23566o = m3VarM10918a;
        Map<String, String> userMetadata = transferRecord.getUserMetadata();
        PutObjectRequest.f23568q = userMetadata != null ? userMetadata.get(ObjectMetadata.REDIRECT_LOCATION) : null;
        String cannedAcl = transferRecord.getCannedAcl();
        PutObjectRequest.f23552a = cannedAcl != null ? (a1) Companion.CANNED_ACL_MAP.get(cannedAcl) : null;
        Map<String, String> userMetadata2 = transferRecord.getUserMetadata();
        if (userMetadata2 == null || (str = userMetadata2.get(ObjectMetadata.REQUESTER_PAYS_HEADER)) == null) {
            n2Var = null;
        } else {
            int i12 = o2.f23371a;
            n2Var = str.equals("requester") ? m2.f23355b : new n2(str);
        }
        PutObjectRequest.f23563l = n2Var;
        Map<String, String> userMetadata3 = transferRecord.getUserMetadata();
        PutObjectRequest.f23567p = userMetadata3 != null ? userMetadata3.get(ObjectMetadata.S3_TAGGING) : null;
        return a0.f30746a;
    }

    default z1 createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        File file = new File(transferRecord.getFile());
        y1 y1Var = new y1();
        createPutObjectRequest$lambda$5(transferRecord, file, y1Var);
        return new z1(y1Var);
    }

    default boolean isNetworkAvailable(Context context) {
        AbstractC4154l.m8923f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                return true;
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }
}
