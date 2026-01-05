package com.amplifyframework.storage.s3.transfer.worker;

import a9.C0073l;
import ac.EnumC0091d;
import android.content.Context;
import androidx.work.WorkerParameters;
import bd.C0645a;
import bl.C0689a;
import cd.C0959n;
import cj.C0979e;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.PartUploadProgressListener;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.UploadProgressListenerInterceptor;
import ec.C2005c;
import ec.C2011i;
import ex.InterfaceC2141e;
import gb.AbstractC2551a;
import gb.AbstractC2553c;
import gb.C2552b;
import gb.C2554d;
import gb.C2555e;
import gb.InterfaceC2556f;
import i0.m0;
import i9.n0;
import java.io.File;
import java.util.ArrayList;
import kb.C4044h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l1.C4327p;
import lb.C4435a;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import mb.n3;
import mb.p3;
import nf.C5047i;
import oa.C5331c;
import og.ig;
import og.kf;
import og.od;
import og.ud;
import p9.C5866a;
import pa.C5868b;
import pa.EnumC5867a;
import pg.AbstractC5931l;
import qa.C6150a;
import qc.C6157c;
import qc.C6161g;
import qd.EnumC6183c;
import qw.a0;
import sc.AbstractC6791k;
import sc.C6797q;
import sc.C6801u;
import t8.AbstractC7075u;
import t8.C7074t;
import tx.InterfaceC7266z;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import yb.AbstractC8610b;
import yb.EnumC8611c;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PartUploadTransferWorker extends BlockingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private int maxRetryCount;
    private String multiPartUploadId;
    private PartUploadProgressListener partUploadProgressListener;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker$performWork$1", m15344f = "PartUploadTransferWorker.kt", m15345l = {88}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker$performWork$1 */
    public static final class C12641 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC2556f $s3;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ PartUploadTransferWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12641(InterfaceC2556f interfaceC2556f, PartUploadTransferWorker partUploadTransferWorker, InterfaceC7559c<? super C12641> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$s3 = interfaceC2556f;
            this.this$0 = partUploadTransferWorker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 invokeSuspend$lambda$0(PartUploadTransferWorker partUploadTransferWorker, C2554d c2554d) {
            ArrayList arrayList = c2554d.f13920v;
            PartUploadProgressListener partUploadProgressListener = partUploadTransferWorker.partUploadProgressListener;
            if (partUploadProgressListener == null) {
                AbstractC4154l.m8928k("partUploadProgressListener");
                throw null;
            }
            arrayList.add(new UploadProgressListenerInterceptor(partUploadProgressListener));
            c2554d.f13913m = Boolean.valueOf(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1);
            return a0.f30746a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12641(this.$s3, this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            C2552b c2552bM10703b = ig.m10703b(this.$s3, new C1268b(this.this$0, 0));
            PartUploadTransferWorker partUploadTransferWorker = this.this$0;
            C0073l c0073l = new C0073l();
            c0073l.f265b = partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getBucketName();
            c0073l.f266c = partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getKey();
            String str = partUploadTransferWorker.multiPartUploadId;
            if (str == null) {
                AbstractC4154l.m8928k("multiPartUploadId");
                throw null;
            }
            c0073l.f268e = str;
            c0073l.f264a = AbstractC5931l.m11737b(new File(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFile()), partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFileOffset(), (partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getBytesTotal() + partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFileOffset()) - 1);
            c0073l.f267d = new Integer(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getPartNumber());
            n3 n3Var = new n3(c0073l);
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 1;
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(n3.class);
            C4147e c4147eM8901a2 = kotlin.jvm.internal.a0.m8901a(p3.class);
            C0073l c0073l2 = new C0073l();
            InterfaceC4447g.f22179a.getClass();
            c0073l2.f264a = C4446f.f22178b;
            c0073l2.f265b = EnumC6183c.CLIENT;
            c0073l2.f266c = C2011i.f9543a;
            c0073l2.f267d = C6801u.f32317n;
            C4535g c4535g = new C4535g();
            C0645a c0645a = new C0645a();
            C0689a c0689a = new C0689a(25);
            C5866a c5866a = new C5866a(9);
            C2555e c2555e = c2552bM10703b.f13884a;
            InterfaceC4447g interfaceC4447g = c2555e.f13926C;
            EnumC0091d enumC0091d = c2555e.f13952x;
            c0073l2.m202L(interfaceC4447g);
            c0073l2.f268e = c2552bM10703b.f13890g;
            c0073l2.m201K(c2552bM10703b.f13891h);
            C2005c c2005cM10980f = ud.m10980f();
            m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
            c0073l2.f266c = c2005cM10980f;
            c4535g.f22542f = new C6797q(c2552bM10703b.f13889f, c2552bM10703b.f13888e, c2552bM10703b.f13887d);
            c4535g.f22543g = new C5047i(c2555e);
            c4535g.m9393k((C0959n) c2555e.f13933b.f36778a);
            c4535g.m9392j(c2555e.f13954z);
            c0645a.mo1862b(AbstractC8923q.f42882a, "UploadPart");
            C0979e c0979e = new C0979e(c4535g, c0645a, c0689a, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "S3", c4147eM8901a, c4147eM8901a2), c0073l2);
            c2552bM10703b.m6571j(c0645a);
            c0645a.mo1862b(AbstractC6791k.f32300i, "CRC32");
            ArrayList arrayList = (ArrayList) c0979e.f5808g;
            arrayList.add(new C4044h(true));
            c0979e.m2783r(new C6150a());
            arrayList.add(C5331c.f26228a);
            int i11 = AbstractC2551a.f13883b[enumC0091d.ordinal()];
            if (i11 == 1) {
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED);
            }
            arrayList.add(new C6161g(enumC0091d));
            int i12 = AbstractC2551a.f13882a[c2555e.f13953y.ordinal()];
            if (i12 == 1) {
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED);
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED);
            }
            Long l9 = c2555e.f13939h;
            if (l9 != null) {
                arrayList.add(new C6157c(l9.longValue()));
            }
            arrayList.add(C4435a.f22156c);
            c0645a.mo1862b(AbstractC2553c.f13894b, c2552bM10703b);
            Object obj2 = n3Var.f23363b;
            if (obj2 != null) {
                c0645a.mo1862b(AbstractC2553c.f13893a, obj2);
            }
            arrayList.add(new C5868b(0));
            if (c2555e.f13940j instanceof n0) {
                AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
            }
            m0.m7367D(new C4327p(c2552bM10703b.f13892j), c0979e, c0979e);
            arrayList.addAll(c2555e.f13950v);
            Object objM10740e = kf.m10740e(c0979e, c2552bM10703b.f13886c, n3Var, this);
            return objM10740e == enumC7794a ? enumC7794a : objM10740e;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super p3> interfaceC7559c) {
            return ((C12641) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartUploadTransferWorker(StorageTransferClientProvider clientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        this.clientProvider = clientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.maxRetryCount = 3;
    }

    private final void updateProgress() {
        this.transferStatusUpdater.updateProgress(getTransferRecord$aws_storage_s3_release().getId(), getTransferRecord$aws_storage_s3_release().getBytesTotal(), getTransferRecord$aws_storage_s3_release().getBytesTotal(), false, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public int getMaxRetryCount$aws_storage_s3_release() {
        return this.maxRetryCount;
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public AbstractC7075u performWork() {
        this.transferStatusUpdater.updateTransferState(getTransferRecord$aws_storage_s3_release().getMainUploadId(), TransferState.IN_PROGRESS);
        Object obj = getInputData().m13366c().get("multipartUploadId");
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.String");
        this.multiPartUploadId = (String) obj;
        this.partUploadProgressListener = new PartUploadProgressListener(getTransferRecord$aws_storage_s3_release(), this.transferStatusUpdater);
        String str = ((p3) c0.m13468D(C7565i.f36440a, new C12641(this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName()), this, null))).f23433g;
        if (str == null) {
            throw new IllegalStateException("Etag is empty");
        }
        this.transferDB.updateETag(getTransferRecord$aws_storage_s3_release().getId(), str);
        this.transferDB.updateState(getTransferRecord$aws_storage_s3_release().getId(), TransferState.PART_COMPLETED);
        updateProgress();
        return new C7074t(getOutputData$aws_storage_s3_release());
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public void setMaxRetryCount$aws_storage_s3_release(int i10) {
        this.maxRetryCount = i10;
    }
}
