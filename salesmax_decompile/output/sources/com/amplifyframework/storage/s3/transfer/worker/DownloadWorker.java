package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.DownloadProgressListener;
import com.amplifyframework.storage.s3.transfer.DownloadProgressListenerInterceptor;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.google.android.gms.cast.MediaStatus;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.cxe;
import p001o.dxe;
import p001o.eu5;
import p001o.fge;
import p001o.h84;
import p001o.h8f;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.m7f;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.oq1;
import p001o.pm1;
import p001o.sq1;
import p001o.sq8;
import p001o.szb;
import p001o.tb3;
import p001o.uq8;
import p001o.wq7;
import p001o.wre;
import p001o.xk7;
import p001o.xq7;
import p001o.y3i;
import p001o.z69;

/* loaded from: classes5.dex */
public final class DownloadWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final long defaultBufferSize;
    private DownloadProgressListener downloadProgressListener;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker", m36648f = "DownloadWorker.kt", m36649l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m36650m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$1 */
    public static final class C107071 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C107071(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadWorker.this.performWork(this);
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$2 */
    public static final class C107082 extends kf9 implements xk7 {
        public C107082() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            aVar.m22017P(Boolean.valueOf(DownloadWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$3 */
    public static final class C107093 extends kf9 implements xk7 {
        public C107093() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            List listM22007F = aVar.m22007F();
            DownloadProgressListener downloadProgressListener = DownloadWorker.this.downloadProgressListener;
            if (downloadProgressListener == null) {
                sq8.m48667z("downloadProgressListener");
                downloadProgressListener = null;
            }
            listM22007F.add(new DownloadProgressListenerInterceptor(downloadProgressListener));
            aVar.m22017P(Boolean.valueOf(DownloadWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$4", m36648f = "DownloadWorker.kt", m36649l = {Opcodes.IASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$4 */
    public static final class C107104 extends jgg implements nl7 {
        final /* synthetic */ long $downloadedBytes;
        final /* synthetic */ File $file;
        long J$0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107104(long j, DownloadWorker downloadWorker, File file, n64 n64Var) {
            super(2, n64Var);
            this.$downloadedBytes = j;
            this.this$0 = downloadWorker;
            this.$file = file;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C107104 c107104 = new C107104(this.$downloadedBytes, this.this$0, this.$file, n64Var);
            c107104.L$0 = obj;
            return c107104;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            long j;
            long j2;
            Long lMo39989a;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                xq7 xq7Var = (xq7) this.L$0;
                oq1 oq1VarM56608a = xq7Var.m56608a();
                long jLongValue = ((oq1VarM56608a == null || (lMo39989a = oq1VarM56608a.mo39989a()) == null) ? 0L : lMo39989a.longValue()) + this.$downloadedBytes;
                this.this$0.getTransferRecord$aws_storage_s3_release().setBytesTotal(jLongValue);
                this.this$0.getTransferRecord$aws_storage_s3_release().setBytesCurrent(this.$downloadedBytes);
                File parentFile = this.$file.getParentFile();
                if (parentFile != null) {
                    if (!(!parentFile.exists())) {
                        parentFile = null;
                    }
                    if (parentFile != null) {
                        ml1.m39301a(parentFile.mkdirs());
                    }
                }
                oq1 oq1VarM56608a2 = xq7Var.m56608a();
                if (oq1VarM56608a2 == null) {
                    j = jLongValue;
                    this.this$0.transferStatusUpdater.updateProgress(this.this$0.getTransferRecord$aws_storage_s3_release().getId(), j, j, true, (16 & 16) != 0);
                    return ListenableWorker.Result.success(this.this$0.getOutputData$aws_storage_s3_release());
                }
                DownloadWorker downloadWorker = this.this$0;
                File file = this.$file;
                this.J$0 = jLongValue;
                this.label = 1;
                if (downloadWorker.writeStreamToFile(oq1VarM56608a2, file, this) == objM51918f) {
                    return objM51918f;
                }
                j2 = jLongValue;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.J$0;
                wre.m54934b(obj);
            }
            j = j2;
            this.this$0.transferStatusUpdater.updateProgress(this.this$0.getTransferRecord$aws_storage_s3_release().getId(), j, j, true, (16 & 16) != 0);
            return ListenableWorker.Result.success(this.this$0.getOutputData$aws_storage_s3_release());
        }

        @Override // p001o.nl7
        public final Object invoke(xq7 xq7Var, n64 n64Var) {
            return ((C107104) create(xq7Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$writeStreamToFile$2", m36648f = "DownloadWorker.kt", m36649l = {Opcodes.FADD}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$writeStreamToFile$2 */
    public static final class C107112 extends jgg implements nl7 {
        final /* synthetic */ File $file;
        final /* synthetic */ oq1 $stream;
        int label;
        final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107112(oq1 oq1Var, File file, DownloadWorker downloadWorker, n64 n64Var) {
            super(2, n64Var);
            this.$stream = oq1Var;
            this.$file = file;
            this.this$0 = downloadWorker;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C107112(this.$stream, this.$file, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            int i;
            Object objM51918f = uq8.m51918f();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return obj;
            }
            wre.m54934b(obj);
            oq1 oq1Var = this.$stream;
            if (oq1Var instanceof oq1.AbstractC15864b ? true : oq1Var instanceof oq1.AbstractC15863a) {
                File file = this.$file;
                this.label = 1;
                Object objM48631f = sq1.m48631f(oq1Var, file, this);
                return objM48631f == objM51918f ? objM51918f : objM48631f;
            }
            if (!(oq1Var instanceof oq1.AbstractC15866d)) {
                throw new szb();
            }
            h8f h8fVarMo39993c = ((oq1.AbstractC15866d) oq1Var).mo39993c();
            Long lMo39989a = this.$stream.mo39989a();
            long jLongValue = lMo39989a != null ? lMo39989a.longValue() : 0L;
            int i3 = (int) this.this$0.defaultBufferSize;
            byte[] bArr = new byte[i3];
            FileOutputStream fileOutputStream = new FileOutputStream(this.$file, this.$file.length() > 0);
            fge fgeVar = new fge();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            while (z69.m58849n(getContext())) {
                try {
                    long j = jLongValue - 0;
                    if (j == 0 || (i = m7f.m38493b(h8fVarMo39993c).read(bArr, 0, (int) Math.min(i3, j))) == -1) {
                        break;
                    }
                    if (i > 0) {
                        fgeVar.f23302a += i;
                    }
                    bufferedOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        tb3.m49666a(bufferedOutputStream, th);
                        throw th2;
                    }
                }
            }
            if (m7f.m38493b(h8fVarMo39993c).mo49493n()) {
                bufferedOutputStream.flush();
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(bufferedOutputStream, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C107112) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.clientProvider = storageTransferClientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.defaultBufferSize = MediaStatus.COMMAND_PLAYBACK_RATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeStreamToFile(oq1 oq1Var, File file, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C107112(oq1Var, file, this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performWork(n64 n64Var) {
        C107071 c107071;
        if (n64Var instanceof C107071) {
            c107071 = (C107071) n64Var;
            int i = c107071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107071.label = i - Integer.MIN_VALUE;
            } else {
                c107071 = new C107071(n64Var);
            }
        }
        Object objMo21972w = c107071.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107071.label;
        if (i2 == 0) {
            wre.m54934b(objMo21972w);
            cxe storageTransferClient = this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName());
            dxe.m23925a(storageTransferClient, new C107082());
            File file = new File(getTransferRecord$aws_storage_s3_release().getFile());
            long length = file.length();
            if (length > 0 && getTransferRecord$aws_storage_s3_release().getBytesTotal() == length) {
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(getOutputData$aws_storage_s3_release());
                sq8.m48648g(resultSuccess, "success(...)");
                return resultSuccess;
            }
            wq7 wq7VarM54854a = wq7.f52460u.m54854a(new DownloadWorker$performWork$getObjectRequest$1(this, length));
            this.downloadProgressListener = new DownloadProgressListener(getTransferRecord$aws_storage_s3_release(), this.transferStatusUpdater);
            cxe cxeVarM23925a = dxe.m23925a(storageTransferClient, new C107093());
            C107104 c107104 = new C107104(length, this, file, null);
            c107071.label = 1;
            objMo21972w = cxeVarM23925a.mo21972w(wq7VarM54854a, c107104, c107071);
            if (objMo21972w == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo21972w);
        }
        sq8.m48648g(objMo21972w, "getObject(...)");
        return objMo21972w;
    }
}
