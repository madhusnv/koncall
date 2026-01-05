package com.amplifyframework.storage.s3.service;

import a9.C0073l;
import android.content.Context;
import aws.sdk.kotlin.services.s3.model.NotFound;
import bd.C0645a;
import cd.C0959n;
import cj.C0979e;
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
import com.amplifyframework.storage.s3.transfer.UploadOptions;
import com.amplifyframework.storage.s3.utils.S3Keys;
import ec.C2005c;
import ec.C2011i;
import ex.InterfaceC2141e;
import f9.C2222e;
import gb.AbstractC2551a;
import gb.AbstractC2553c;
import gb.C2552b;
import gb.C2554d;
import gb.C2555e;
import gb.InterfaceC2556f;
import i0.m0;
import i9.n0;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l1.C4327p;
import lb.C4435a;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import mb.C4702r;
import mb.d0;
import mb.e0;
import mb.f0;
import mb.o0;
import mb.p0;
import mb.u0;
import mb.v0;
import mb.x0;
import mb.y0;
import nb.C4989a;
import nf.C5047i;
import ng.C5070u;
import oa.C5331c;
import og.ig;
import og.kf;
import og.od;
import og.ud;
import org.bouncycastle.asn1.BERTags;
import p9.C5866a;
import pa.C5868b;
import pa.EnumC5867a;
import ph.C5950e;
import qa.C6150a;
import qd.EnumC6183c;
import qw.a0;
import sc.C6797q;
import sc.C6801u;
import tc.InterfaceC7116a;
import td.C7126c;
import tx.InterfaceC7266z;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;
import yb.AbstractC8610b;
import yb.EnumC8611c;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageService implements StorageService {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final String awsRegion;
    private final String awsS3StoragePluginKey;
    private final StorageTransferClientProvider clientProvider;
    private final Context context;
    private final String s3BucketName;
    private InterfaceC2556f s3Client;
    private final TransferManager transferManager;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Factory {
        AWSS3StorageService create(Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider);
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$deleteObject$1", m15344f = "AWSS3StorageService.kt", m15345l = {429}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$deleteObject$1 */
    public static final class C12391 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $serviceKey;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12391(String str, InterfaceC7559c<? super C12391> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$serviceKey = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return AWSS3StorageService.this.new C12391(this.$serviceKey, interfaceC7559c);
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
            InterfaceC2556f interfaceC2556f = AWSS3StorageService.this.s3Client;
            AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
            String str = this.$serviceKey;
            d0 d0Var = new d0();
            d0Var.f23224a = aWSS3StorageService.s3BucketName;
            d0Var.f23225b = str;
            e0 e0Var = new e0(d0Var);
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 1;
            C2552b c2552b = (C2552b) interfaceC2556f;
            c2552b.getClass();
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(e0.class);
            C4147e c4147eM8901a2 = kotlin.jvm.internal.a0.m8901a(f0.class);
            C0073l c0073l = new C0073l();
            InterfaceC4447g.f22179a.getClass();
            c0073l.f264a = C4446f.f22178b;
            c0073l.f265b = EnumC6183c.CLIENT;
            c0073l.f266c = C2011i.f9543a;
            c0073l.f267d = C6801u.f32317n;
            C4535g c4535g = new C4535g();
            C0645a c0645a = new C0645a();
            C5070u c5070u = new C5070u(24);
            C5866a c5866a = new C5866a(5);
            C2555e c2555e = c2552b.f13884a;
            c0073l.m202L(c2555e.f13926C);
            c0073l.f268e = c2552b.f13890g;
            c0073l.m201K(c2552b.f13891h);
            C2005c c2005cM10980f = ud.m10980f();
            m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
            c0073l.f266c = c2005cM10980f;
            c4535g.f22542f = new C6797q(c2552b.f13889f, c2552b.f13888e, c2552b.f13887d);
            c4535g.f22543g = new C5047i(c2555e);
            c4535g.m9393k((C0959n) c2555e.f13933b.f36778a);
            c4535g.m9392j(c2555e.f13954z);
            c0645a.mo1862b(AbstractC8923q.f42882a, "DeleteObject");
            C0979e c0979e = new C0979e(c4535g, c0645a, c5070u, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "S3", c4147eM8901a, c4147eM8901a2), c0073l);
            c2552b.m6571j(c0645a);
            c0979e.m2783r(new C6150a());
            ArrayList arrayList = (ArrayList) c0979e.f5808g;
            arrayList.add(C5331c.f26228a);
            int i11 = AbstractC2551a.f13882a[c2555e.f13953y.ordinal()];
            if (i11 == 1) {
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED);
            }
            arrayList.add(C4435a.f22156c);
            c0645a.mo1862b(AbstractC2553c.f13894b, c2552b);
            Object obj2 = e0Var.f23230a;
            if (obj2 != null) {
                c0645a.mo1862b(AbstractC2553c.f13893a, obj2);
            }
            arrayList.add(new C5868b(0));
            if (c2555e.f13940j instanceof n0) {
                AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
            }
            m0.m7367D(new C4327p(c2552b.f13892j), c0979e, c0979e);
            arrayList.addAll(c2555e.f13950v);
            Object objM10740e = kf.m10740e(c0979e, c2552b.f13886c, e0Var, this);
            return objM10740e == enumC7794a ? enumC7794a : objM10740e;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super f0> interfaceC7559c) {
            return ((C12391) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$1", m15344f = "AWSS3StorageService.kt", m15345l = {191}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$1 */
    public static final class C12401 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ List<StorageItem> $items;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12401(String str, List<StorageItem> list, String str2, InterfaceC7559c<? super C12401> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$path = str;
            this.$items = list;
            this.$prefix = str2;
        }

        private static final a0 invokeSuspend$lambda$0(AWSS3StorageService aWSS3StorageService, String str, u0 u0Var) {
            u0Var.f23489a = aWSS3StorageService.s3BucketName;
            u0Var.f23493e = str;
            return a0.f30746a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return AWSS3StorageService.this.new C12401(this.$path, this.$items, this.$prefix, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                InterfaceC2556f interfaceC2556f = AWSS3StorageService.this.s3Client;
                AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
                String str = this.$path;
                AbstractC4154l.m8923f(interfaceC2556f, "<this>");
                u0 u0Var = new u0();
                invokeSuspend$lambda$0(aWSS3StorageService, str, u0Var);
                C2222e c2222e = new C2222e(new C4989a(new v0(u0Var), interfaceC2556f, (InterfaceC7559c) null, 0));
                final List<StorageItem> list = this.$items;
                final String str2 = this.$prefix;
                InterfaceC8210k interfaceC8210k = new InterfaceC8210k() { // from class: com.amplifyframework.storage.s3.service.AWSS3StorageService.listFiles.1.1
                    public final Object emit(x0 x0Var, InterfaceC7559c<? super a0> interfaceC7559c) {
                        List<y0> list2 = x0Var.f23523b;
                        if (list2 != null) {
                            List<StorageItem> list3 = list;
                            String str3 = str2;
                            for (y0 y0Var : list2) {
                                String str4 = y0Var.f23546d;
                                C7126c c7126c = y0Var.f23547e;
                                String str5 = y0Var.f23545c;
                                if (str4 != null && c7126c != null && str5 != null) {
                                    String strExtractAmplifyKey = S3Keys.extractAmplifyKey(str4, str3);
                                    AbstractC4154l.m8922e(strExtractAmplifyKey, "extractAmplifyKey(...)");
                                    Long l9 = y0Var.f23550h;
                                    long jLongValue = l9 != null ? l9.longValue() : 0L;
                                    Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(c7126c.f34346a.getEpochSecond()));
                                    AbstractC4154l.m8922e(dateFrom, "from(...)");
                                    list3.add(new StorageItem(str4, strExtractAmplifyKey, jLongValue, dateFrom, str5, null));
                                }
                            }
                        }
                        return a0.f30746a;
                    }

                    @Override // wx.InterfaceC8210k
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC7559c interfaceC7559c) {
                        return emit((x0) obj2, (InterfaceC7559c<? super a0>) interfaceC7559c);
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c2222e.collect(interfaceC8210k, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12401) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$2", m15344f = "AWSS3StorageService.kt", m15345l = {429}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$2 */
    public static final class C12412 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12412(String str, int i10, String str2, String str3, InterfaceC7559c<? super C12412> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$path = str;
            this.$pageSize = i10;
            this.$nextToken = str2;
            this.$prefix = str3;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return AWSS3StorageService.this.new C12412(this.$path, this.$pageSize, this.$nextToken, this.$prefix, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            StorageItem storageItem;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            ArrayList arrayList = null;
            if (i10 == 0) {
                od.m10798c(obj);
                InterfaceC2556f interfaceC2556f = AWSS3StorageService.this.s3Client;
                AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
                String str = this.$path;
                int i11 = this.$pageSize;
                String str2 = this.$nextToken;
                u0 u0Var = new u0();
                u0Var.f23489a = aWSS3StorageService.s3BucketName;
                u0Var.f23493e = str;
                u0Var.f23492d = new Integer(i11);
                u0Var.f23490b = str2;
                v0 v0Var = new v0(u0Var);
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = ((C2552b) interfaceC2556f).m6570h(v0Var, this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            x0 x0Var = (x0) obj;
            List<y0> list = x0Var.f23523b;
            if (list != null) {
                String str3 = this.$prefix;
                ArrayList arrayList2 = new ArrayList();
                for (y0 y0Var : list) {
                    String str4 = y0Var.f23546d;
                    C7126c c7126c = y0Var.f23547e;
                    String str5 = y0Var.f23545c;
                    if (str4 == null || c7126c == null || str5 == null) {
                        storageItem = null;
                    } else {
                        String strExtractAmplifyKey = S3Keys.extractAmplifyKey(str4, str3);
                        AbstractC4154l.m8922e(strExtractAmplifyKey, "extractAmplifyKey(...)");
                        Long l9 = y0Var.f23550h;
                        long jLongValue = l9 != null ? l9.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(c7126c.f34346a.getEpochSecond()));
                        AbstractC4154l.m8922e(dateFrom, "from(...)");
                        storageItem = new StorageItem(str4, strExtractAmplifyKey, jLongValue, dateFrom, str5, null);
                    }
                    if (storageItem != null) {
                        arrayList2.add(storageItem);
                    }
                }
                arrayList = arrayList2;
            }
            return StorageListResult.fromItems(arrayList, x0Var.f23531j);
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
            return ((C12412) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$3", m15344f = "AWSS3StorageService.kt", m15345l = {257}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$3 */
    public static final class C12423 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12423(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, String str2, InterfaceC7559c<? super C12423> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$prefix = str2;
        }

        private static final a0 invokeSuspend$lambda$0(AWSS3StorageService aWSS3StorageService, String str, String str2, u0 u0Var) {
            u0Var.f23489a = aWSS3StorageService.s3BucketName;
            u0Var.f23493e = str;
            u0Var.f23491c = str2;
            return a0.f30746a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12423(this.$subPathStrategy, this.this$0, this.$path, this.$prefix, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            final List listM7386s;
            List list;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            InterfaceC7559c interfaceC7559c = null;
            if (i10 == 0) {
                listM7386s = m0.m7386s(obj);
                final ArrayList arrayList = new ArrayList();
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                String delimiter = exclude != null ? exclude.getDelimiter() : null;
                InterfaceC2556f interfaceC2556f = this.this$0.s3Client;
                AWSS3StorageService aWSS3StorageService = this.this$0;
                String str = this.$path;
                AbstractC4154l.m8923f(interfaceC2556f, "<this>");
                u0 u0Var = new u0();
                invokeSuspend$lambda$0(aWSS3StorageService, str, delimiter, u0Var);
                C2222e c2222e = new C2222e(new C4989a(new v0(u0Var), interfaceC2556f, interfaceC7559c, 0));
                final String str2 = this.$prefix;
                InterfaceC8210k interfaceC8210k = new InterfaceC8210k() { // from class: com.amplifyframework.storage.s3.service.AWSS3StorageService.listFiles.3.1
                    public final Object emit(x0 x0Var, InterfaceC7559c<? super a0> interfaceC7559c2) {
                        List<y0> list2 = x0Var.f23523b;
                        if (list2 != null) {
                            List<StorageItem> list3 = listM7386s;
                            String str3 = str2;
                            for (y0 y0Var : list2) {
                                String str4 = y0Var.f23546d;
                                C7126c c7126c = y0Var.f23547e;
                                String str5 = y0Var.f23545c;
                                if (str4 != null && c7126c != null && str5 != null) {
                                    String strExtractAmplifyKey = S3Keys.extractAmplifyKey(str4, str3);
                                    AbstractC4154l.m8922e(strExtractAmplifyKey, "extractAmplifyKey(...)");
                                    Long l9 = y0Var.f23550h;
                                    long jLongValue = l9 != null ? l9.longValue() : 0L;
                                    Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(c7126c.f34346a.getEpochSecond()));
                                    AbstractC4154l.m8922e(dateFrom, "from(...)");
                                    list3.add(new StorageItem(str4, strExtractAmplifyKey, jLongValue, dateFrom, str5, null));
                                }
                            }
                        }
                        List list4 = x0Var.f23522a;
                        if (list4 != null) {
                            List<String> list5 = arrayList;
                            Iterator<T> it = list4.iterator();
                            while (it.hasNext()) {
                                String str6 = ((C4702r) it.next()).f23443a;
                                if (str6 != null) {
                                    list5.add(str6);
                                }
                            }
                        }
                        return a0.f30746a;
                    }

                    @Override // wx.InterfaceC8210k
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC7559c interfaceC7559c2) {
                        return emit((x0) obj2, (InterfaceC7559c<? super a0>) interfaceC7559c2);
                    }
                };
                this.L$0 = listM7386s;
                this.L$1 = arrayList;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (c2222e.collect(interfaceC8210k, this) == enumC7794a) {
                    return enumC7794a;
                }
                list = arrayList;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                listM7386s = (List) this.L$0;
                od.m10798c(obj);
            }
            return StorageListResult.fromItems(listM7386s, null, list);
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
            return ((C12423) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$4", m15344f = "AWSS3StorageService.kt", m15345l = {429}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$4 */
    public static final class C12434 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ String $prefix;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12434(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, int i10, String str2, String str3, InterfaceC7559c<? super C12434> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$pageSize = i10;
            this.$nextToken = str2;
            this.$prefix = str3;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12434(this.$subPathStrategy, this.this$0, this.$path, this.$pageSize, this.$nextToken, this.$prefix, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            StorageItem storageItem;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            ArrayList arrayList2 = null;
            if (i10 == 0) {
                od.m10798c(obj);
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                String delimiter = exclude != null ? exclude.getDelimiter() : null;
                InterfaceC2556f interfaceC2556f = this.this$0.s3Client;
                AWSS3StorageService aWSS3StorageService = this.this$0;
                String str = this.$path;
                int i11 = this.$pageSize;
                String str2 = this.$nextToken;
                u0 u0Var = new u0();
                u0Var.f23489a = aWSS3StorageService.s3BucketName;
                u0Var.f23493e = str;
                u0Var.f23492d = new Integer(i11);
                u0Var.f23490b = str2;
                u0Var.f23491c = delimiter;
                v0 v0Var = new v0(u0Var);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = ((C2552b) interfaceC2556f).m6570h(v0Var, this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            x0 x0Var = (x0) obj;
            List<y0> list = x0Var.f23523b;
            if (list != null) {
                String str3 = this.$prefix;
                arrayList = new ArrayList();
                for (y0 y0Var : list) {
                    String str4 = y0Var.f23546d;
                    C7126c c7126c = y0Var.f23547e;
                    String str5 = y0Var.f23545c;
                    if (str4 == null || c7126c == null || str5 == null) {
                        storageItem = null;
                    } else {
                        String strExtractAmplifyKey = S3Keys.extractAmplifyKey(str4, str3);
                        AbstractC4154l.m8922e(strExtractAmplifyKey, "extractAmplifyKey(...)");
                        Long l9 = y0Var.f23550h;
                        long jLongValue = l9 != null ? l9.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(c7126c.f34346a.getEpochSecond()));
                        AbstractC4154l.m8922e(dateFrom, "from(...)");
                        storageItem = new StorageItem(str4, strExtractAmplifyKey, jLongValue, dateFrom, str5, null);
                    }
                    if (storageItem != null) {
                        arrayList.add(storageItem);
                    }
                }
            } else {
                arrayList = null;
            }
            List list2 = x0Var.f23522a;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str6 = ((C4702r) it.next()).f23443a;
                    if (str6 != null) {
                        arrayList2.add(str6);
                    }
                }
            }
            return StorageListResult.fromItems(arrayList, x0Var.f23531j, arrayList2);
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
            return ((C12434) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$5", m15344f = "AWSS3StorageService.kt", m15345l = {429}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$listFiles$5 */
    public static final class C12445 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $nextToken;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $path;
        final /* synthetic */ SubpathStrategy $subPathStrategy;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12445(SubpathStrategy subpathStrategy, AWSS3StorageService aWSS3StorageService, String str, int i10, String str2, InterfaceC7559c<? super C12445> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$subPathStrategy = subpathStrategy;
            this.this$0 = aWSS3StorageService;
            this.$path = str;
            this.$pageSize = i10;
            this.$nextToken = str2;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12445(this.$subPathStrategy, this.this$0, this.$path, this.$pageSize, this.$nextToken, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            StorageItem storageItem;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            ArrayList arrayList2 = null;
            if (i10 == 0) {
                od.m10798c(obj);
                SubpathStrategy subpathStrategy = this.$subPathStrategy;
                SubpathStrategy.Exclude exclude = subpathStrategy instanceof SubpathStrategy.Exclude ? (SubpathStrategy.Exclude) subpathStrategy : null;
                String delimiter = exclude != null ? exclude.getDelimiter() : null;
                InterfaceC2556f interfaceC2556f = this.this$0.s3Client;
                AWSS3StorageService aWSS3StorageService = this.this$0;
                String str = this.$path;
                int i11 = this.$pageSize;
                String str2 = this.$nextToken;
                u0 u0Var = new u0();
                u0Var.f23489a = aWSS3StorageService.s3BucketName;
                u0Var.f23493e = str;
                u0Var.f23492d = new Integer(i11);
                u0Var.f23490b = str2;
                u0Var.f23491c = delimiter;
                v0 v0Var = new v0(u0Var);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = ((C2552b) interfaceC2556f).m6570h(v0Var, this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            x0 x0Var = (x0) obj;
            List<y0> list = x0Var.f23523b;
            if (list != null) {
                arrayList = new ArrayList();
                for (y0 y0Var : list) {
                    String str3 = y0Var.f23546d;
                    C7126c c7126c = y0Var.f23547e;
                    String str4 = y0Var.f23545c;
                    if (str3 == null || c7126c == null || str4 == null) {
                        storageItem = null;
                    } else {
                        Long l9 = y0Var.f23550h;
                        long jLongValue = l9 != null ? l9.longValue() : 0L;
                        Date dateFrom = DesugarDate.from(Instant.ofEpochMilli(c7126c.f34346a.getEpochSecond()));
                        AbstractC4154l.m8922e(dateFrom, "from(...)");
                        storageItem = new StorageItem(str3, str3, jLongValue, dateFrom, str4, null);
                    }
                    if (storageItem != null) {
                        arrayList.add(storageItem);
                    }
                }
            } else {
                arrayList = null;
            }
            List list2 = x0Var.f23522a;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str5 = ((C4702r) it.next()).f23443a;
                    if (str5 != null) {
                        arrayList2.add(str5);
                    }
                }
            }
            return StorageListResult.fromItems(arrayList, x0Var.f23531j, arrayList2);
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
            return ((C12445) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$validateObjectExists$1", m15344f = "AWSS3StorageService.kt", m15345l = {100}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$validateObjectExists$1 */
    public static final class C12451 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $serviceKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12451(String str, InterfaceC7559c<? super C12451> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$serviceKey = str;
        }

        private static final a0 invokeSuspend$lambda$0(AWSS3StorageService aWSS3StorageService, String str, mb.n0 n0Var) {
            n0Var.f23358a = aWSS3StorageService.s3BucketName;
            n0Var.f23359b = str;
            return a0.f30746a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return AWSS3StorageService.this.new C12451(this.$serviceKey, interfaceC7559c);
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
            InterfaceC2556f interfaceC2556f = AWSS3StorageService.this.s3Client;
            AWSS3StorageService aWSS3StorageService = AWSS3StorageService.this;
            String str = this.$serviceKey;
            mb.n0 n0Var = new mb.n0();
            invokeSuspend$lambda$0(aWSS3StorageService, str, n0Var);
            o0 o0Var = new o0(n0Var);
            this.label = 1;
            C2552b c2552b = (C2552b) interfaceC2556f;
            c2552b.getClass();
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(o0.class);
            C4147e c4147eM8901a2 = kotlin.jvm.internal.a0.m8901a(p0.class);
            C0073l c0073l = new C0073l();
            InterfaceC4447g.f22179a.getClass();
            c0073l.f264a = C4446f.f22178b;
            c0073l.f265b = EnumC6183c.CLIENT;
            c0073l.f266c = C2011i.f9543a;
            c0073l.f267d = C6801u.f32317n;
            C4535g c4535g = new C4535g();
            C0645a c0645a = new C0645a();
            C5950e c5950e = new C5950e(24);
            C5866a c5866a = new C5866a(6);
            C2555e c2555e = c2552b.f13884a;
            c0073l.m202L(c2555e.f13926C);
            c0073l.f268e = c2552b.f13890g;
            c0073l.m201K(c2552b.f13891h);
            C2005c c2005cM10980f = ud.m10980f();
            m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
            c0073l.f266c = c2005cM10980f;
            c4535g.f22542f = new C6797q(c2552b.f13889f, c2552b.f13888e, c2552b.f13887d);
            c4535g.f22543g = new C5047i(c2555e);
            c4535g.m9393k((C0959n) c2555e.f13933b.f36778a);
            c4535g.m9392j(c2555e.f13954z);
            c0645a.mo1862b(AbstractC8923q.f42882a, "HeadObject");
            C0979e c0979e = new C0979e(c4535g, c0645a, c5950e, c5866a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "S3", c4147eM8901a, c4147eM8901a2), c0073l);
            c2552b.m6571j(c0645a);
            c0979e.m2783r(new C6150a());
            ArrayList arrayList = (ArrayList) c0979e.f5808g;
            arrayList.add(C5331c.f26228a);
            int i11 = AbstractC2551a.f13882a[c2555e.f13953y.ordinal()];
            if (i11 == 1) {
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8610b.m15956b(c0645a, EnumC8611c.FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED);
            }
            arrayList.add(C4435a.f22156c);
            c0645a.mo1862b(AbstractC2553c.f13894b, c2552b);
            Object obj2 = o0Var.f23368a;
            if (obj2 != null) {
                c0645a.mo1862b(AbstractC2553c.f13893a, obj2);
            }
            arrayList.add(C4435a.f22155b);
            arrayList.add(new C5868b(0));
            if (c2555e.f13940j instanceof n0) {
                AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
            }
            m0.m7367D(new C4327p(c2552b.f13892j), c0979e, c0979e);
            arrayList.addAll(c2555e.f13950v);
            Object objM10740e = kf.m10740e(c0979e, c2552b.f13886c, o0Var, this);
            return objM10740e == enumC7794a ? enumC7794a : objM10740e;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super p0> interfaceC7559c) {
            return ((C12451) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public AWSS3StorageService(Context context, String awsRegion, String s3BucketName, AuthCredentialsProvider authCredentialsProvider, String awsS3StoragePluginKey, StorageTransferClientProvider clientProvider) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(awsRegion, "awsRegion");
        AbstractC4154l.m8923f(s3BucketName, "s3BucketName");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginKey, "awsS3StoragePluginKey");
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        this.context = context;
        this.awsRegion = awsRegion;
        this.s3BucketName = s3BucketName;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginKey = awsS3StoragePluginKey;
        this.clientProvider = clientProvider;
        this.s3Client = S3StorageTransferClientProvider.Companion.getS3Client(awsRegion, authCredentialsProvider);
        this.transferManager = new TransferManager(context, clientProvider, awsS3StoragePluginKey, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 getPresignedUrl$lambda$0(boolean z6, C2554d withConfig) {
        AbstractC4154l.m8923f(withConfig, "$this$withConfig");
        withConfig.f13913m = Boolean.valueOf(z6);
        return a0.f30746a;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void cancelTransfer(TransferObserver transferObserver) {
        AbstractC4154l.m8923f(transferObserver, "transferObserver");
        this.transferManager.cancel(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void deleteObject(String serviceKey) throws Throwable {
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        c0.m13468D(C7565i.f36440a, new C12391(serviceKey, null));
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver downloadToFile(String transferId, String serviceKey, File file, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        AbstractC4154l.m8923f(file, "file");
        return TransferManager.download$default(this.transferManager, transferId, this.s3BucketName, this.awsRegion, serviceKey, file, null, z6, 32, null);
    }

    public final InterfaceC2556f getClient() {
        return this.s3Client;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public URL getPresignedUrl(String serviceKey, int i10, boolean z6) {
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        C2552b c2552bM10703b = ig.m10703b(this.s3Client, new C1246a(z6, 0));
        try {
            InterfaceC7116a interfaceC7116a = (InterfaceC7116a) c0.m13468D(C7565i.f36440a, new AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(c2552bM10703b, i10, this, serviceKey, null));
            c2552bM10703b.close();
            return new URL(interfaceC7116a.getUrl().f382h);
        } finally {
        }
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferRecord getTransfer(String transferId) {
        AbstractC4154l.m8923f(transferId, "transferId");
        return this.transferManager.getTransferOperationById(transferId);
    }

    public final TransferManager getTransferManager() {
        return this.transferManager;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public List<StorageItem> listFiles(String path, String prefix) throws Throwable {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(prefix, "prefix");
        ArrayList arrayList = new ArrayList();
        c0.m13468D(C7565i.f36440a, new C12401(path, arrayList, prefix, null));
        return arrayList;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void pauseTransfer(TransferObserver transferObserver) {
        AbstractC4154l.m8923f(transferObserver, "transferObserver");
        this.transferManager.pause(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void resumeTransfer(TransferObserver transferObserver) {
        AbstractC4154l.m8923f(transferObserver, "transferObserver");
        this.transferManager.resume(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadFile(String transferId, String serviceKey, File file, ObjectMetadata metadata, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(metadata, "metadata");
        return TransferManager.upload$default(this.transferManager, transferId, this.s3BucketName, this.awsRegion, serviceKey, file, metadata, null, null, z6, BERTags.PRIVATE, null);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadInputStream(String transferId, String serviceKey, InputStream inputStream, ObjectMetadata metadata, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        AbstractC4154l.m8923f(inputStream, "inputStream");
        AbstractC4154l.m8923f(metadata, "metadata");
        return this.transferManager.upload(transferId, serviceKey, inputStream, new UploadOptions(this.s3BucketName, this.awsRegion, metadata, null, null, 24, null), z6);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void validateObjectExists(String serviceKey) throws StorageException {
        AbstractC4154l.m8923f(serviceKey, "serviceKey");
        try {
        } catch (NotFound e2) {
            throw new StorageException("Unable to generate URL for non-existent path: ".concat(serviceKey), e2, "Please ensure the path is valid or the object has been uploaded");
        }
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String path, String prefix, int i10, String str) throws Throwable {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(prefix, "prefix");
        Object objM13468D = c0.m13468D(C7565i.f36440a, new C12412(path, i10, str, prefix, null));
        AbstractC4154l.m8920c(objM13468D);
        return (StorageListResult) objM13468D;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String path, String prefix, SubpathStrategy subpathStrategy) throws Throwable {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(prefix, "prefix");
        Object objM13468D = c0.m13468D(C7565i.f36440a, new C12423(subpathStrategy, this, path, prefix, null));
        AbstractC4154l.m8920c(objM13468D);
        return (StorageListResult) objM13468D;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public StorageListResult listFiles(String path, String prefix, int i10, String str, SubpathStrategy subpathStrategy) throws Throwable {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(prefix, "prefix");
        Object objM13468D = c0.m13468D(C7565i.f36440a, new C12434(subpathStrategy, this, path, i10, str, prefix, null));
        AbstractC4154l.m8920c(objM13468D);
        return (StorageListResult) objM13468D;
    }

    public final StorageListResult listFiles(String path, int i10, String str, SubpathStrategy subpathStrategy) throws Throwable {
        AbstractC4154l.m8923f(path, "path");
        Object objM13468D = c0.m13468D(C7565i.f36440a, new C12445(subpathStrategy, this, path, i10, str, null));
        AbstractC4154l.m8920c(objM13468D);
        return (StorageListResult) objM13468D;
    }
}
