package p9;

import a2.AbstractC0030c;
import al.C0182j;
import aws.sdk.kotlin.services.s3.model.NoSuchBucket;
import aws.sdk.kotlin.services.s3.model.NotFound;
import aws.sdk.kotlin.services.s3.model.S3Exception;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import bd.C0645a;
import c9.AbstractC0911f;
import com.amplifyframework.storage.ObjectMetadata;
import eb.p1;
import io.C3328c;
import j$.time.format.DateTimeFormatter;
import ja.AbstractC3629w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jc.InterfaceC3738n;
import jc.h0;
import ji.AbstractC3768b;
import k0.AbstractC3898h;
import kotlin.jvm.internal.AbstractC4154l;
import lb.C4437c;
import mb.AbstractC4690f;
import mb.AbstractC4697m;
import mb.AbstractC4701q;
import mb.C4687c;
import mb.C4688d;
import mb.C4689e;
import mb.C4702r;
import mb.e1;
import mb.g0;
import mb.i0;
import mb.i1;
import mb.i2;
import mb.l0;
import mb.l2;
import mb.m3;
import mb.o3;
import mb.p0;
import mb.p2;
import mb.p3;
import mb.w0;
import mb.w1;
import mb.w2;
import mb.x0;
import mb.x1;
import mb.y0;
import n3.AbstractC4949c;
import nc.AbstractC4992c;
import ng.AbstractC5068s;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.ef;
import og.od;
import og.pe;
import og.r0;
import og.s0;
import og.t0;
import pc.C5884l;
import pg.h8;
import pg.j6;
import pg.l6;
import qw.C6363m;
import qw.C6364n;
import rw.AbstractC6663m;
import rw.C6669s;
import sc.InterfaceC6789i;
import td.C7124a;
import td.C7126c;
import td.EnumC7143t;
import uc.C7394a;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p9.a */
/* loaded from: classes.dex */
public final class C5866a implements InterfaceC6789i {

    /* renamed from: a */
    public final /* synthetic */ int f28645a;

    public /* synthetic */ C5866a(int i10) {
        this.f28645a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /* renamed from: b */
    private final Object m11468b(C0645a context, C5884l call, byte[] bArr) {
        Object c4689e;
        AbstractC4701q abstractC4701qM8289a;
        C7126c c7126cM13406d;
        C7126c c7126cM13406d2;
        e1 e1VarM8430a;
        i1 i1VarM9890b;
        C7126c c7126cM13405c;
        i2 i2VarM9997b;
        l2 l2VarM10865a;
        w2 w2VarM10884a;
        m3 m3VarM10918a;
        int i10;
        S3Exception s3Exception;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        C7394a c7394a = call.f28691b;
        if (!h8.m11686e(c7394a.f35158a)) {
            C7394a c7394aM11710b = j6.m11710b(c7394a, bArr);
            C5884l c5884lM11501b = C5884l.m11501b(call, c7394aM11710b);
            try {
                C4437c c4437c = bArr == null ? AbstractC4154l.m8918a(c7394a.f35158a, h0.f19571f) ? new C4437c("NotFound", null, null, null) : new C4437c(c7394a.f35158a.toString(), null, null, null) : AbstractC0911f.m2619c(bArr);
                c5884lM11501b = AbstractC4154l.m8918a(c4437c.f22162a, "NotFound");
                if (c5884lM11501b != 0) {
                    s3Exception = new NotFound();
                    s3Exception.f3497d.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
                } else {
                    s3Exception = new S3Exception(c4437c.f22163b);
                }
                AbstractC0911f.m2620d(s3Exception, c7394aM11710b, c4437c);
                throw s3Exception;
            } catch (Exception unused) {
                S3Exception s3Exception2 = new S3Exception("Failed to parse response as restXml error");
                AbstractC0911f.m2620d(s3Exception2, c5884lM11501b.f28691b, null);
                throw s3Exception2;
            }
        }
        l0 l0Var = new l0();
        InterfaceC3738n interfaceC3738n = c7394a.f35159b;
        l0Var.f23285a = (String) interfaceC3738n.get("accept-ranges");
        String str = (String) interfaceC3738n.get("x-amz-archive-status");
        if (str != null) {
            int i11 = AbstractC4690f.f23235a;
            c4689e = str.equals("ARCHIVE_ACCESS") ? C4687c.f23214b : str.equals("DEEP_ARCHIVE_ACCESS") ? C4688d.f23223b : new C4689e(str);
        } else {
            c4689e = null;
        }
        l0Var.f23284M = c4689e;
        String str2 = (String) interfaceC3738n.get("x-amz-server-side-encryption-bucket-key-enabled");
        l0Var.f23286b = str2 != null ? Boolean.valueOf(Boolean.parseBoolean(str2)) : null;
        l0Var.f23287c = (String) interfaceC3738n.get(ObjectMetadata.CACHE_CONTROL);
        l0Var.f23288d = (String) interfaceC3738n.get("x-amz-checksum-crc32");
        l0Var.f23289e = (String) interfaceC3738n.get("x-amz-checksum-crc32c");
        l0Var.f23290f = (String) interfaceC3738n.get("x-amz-checksum-crc64nvme");
        l0Var.f23291g = (String) interfaceC3738n.get("x-amz-checksum-sha1");
        l0Var.f23292h = (String) interfaceC3738n.get("x-amz-checksum-sha256");
        String str3 = (String) interfaceC3738n.get("x-amz-checksum-type");
        if (str3 != null) {
            int i12 = AbstractC4701q.f23439a;
            abstractC4701qM8289a = AbstractC3768b.m8289a(str3);
        } else {
            abstractC4701qM8289a = null;
        }
        l0Var.f23293i = abstractC4701qM8289a;
        l0Var.f23294j = (String) interfaceC3738n.get(ObjectMetadata.CONTENT_DISPOSITION);
        l0Var.f23295k = (String) interfaceC3738n.get(ObjectMetadata.CONTENT_ENCODING);
        l0Var.f23296l = (String) interfaceC3738n.get("Content-Language");
        String str4 = (String) interfaceC3738n.get("Content-Length");
        l0Var.f23297m = str4 != null ? Long.valueOf(Long.parseLong(str4)) : null;
        l0Var.f23298n = (String) interfaceC3738n.get("Content-Range");
        l0Var.f23299o = (String) interfaceC3738n.get(ObjectMetadata.CONTENT_TYPE);
        String str5 = (String) interfaceC3738n.get("x-amz-delete-marker");
        l0Var.f23300p = str5 != null ? Boolean.valueOf(Boolean.parseBoolean(str5)) : null;
        l0Var.f23301q = (String) interfaceC3738n.get("ETag");
        l0Var.f23302r = (String) interfaceC3738n.get("x-amz-expiration");
        String str6 = (String) interfaceC3738n.get("Expires");
        if (str6 != null) {
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            c7126cM13406d = C7124a.m13406d(str6);
        } else {
            c7126cM13406d = null;
        }
        l0Var.f23303s = c7126cM13406d;
        l0Var.f23304t = (String) interfaceC3738n.get("ExpiresString");
        String str7 = (String) interfaceC3738n.get("Last-Modified");
        if (str7 != null) {
            DateTimeFormatter dateTimeFormatter2 = C7126c.f34342b;
            c7126cM13406d2 = C7124a.m13406d(str7);
        } else {
            c7126cM13406d2 = null;
        }
        l0Var.f23305u = c7126cM13406d2;
        String str8 = (String) interfaceC3738n.get("x-amz-missing-meta");
        l0Var.f23307w = str8 != null ? Integer.valueOf(Integer.parseInt(str8)) : null;
        String str9 = (String) interfaceC3738n.get("x-amz-object-lock-legal-hold");
        if (str9 != null) {
            int i13 = e1.f23232a;
            e1VarM8430a = AbstractC3898h.m8430a(str9);
        } else {
            e1VarM8430a = null;
        }
        l0Var.f23308x = e1VarM8430a;
        String str10 = (String) interfaceC3738n.get("x-amz-object-lock-mode");
        if (str10 != null) {
            int i14 = i1.f23254a;
            i1VarM9890b = AbstractC4949c.m9890b(str10);
        } else {
            i1VarM9890b = null;
        }
        l0Var.f23309y = i1VarM9890b;
        String str11 = (String) interfaceC3738n.get("x-amz-object-lock-retain-until-date");
        if (str11 != null) {
            DateTimeFormatter dateTimeFormatter3 = C7126c.f34342b;
            c7126cM13405c = C7124a.m13405c(str11);
        } else {
            c7126cM13405c = null;
        }
        l0Var.f23310z = c7126cM13405c;
        String str12 = (String) interfaceC3738n.get("x-amz-mp-parts-count");
        l0Var.f23272A = str12 != null ? Integer.valueOf(Integer.parseInt(str12)) : null;
        String str13 = (String) interfaceC3738n.get("x-amz-replication-status");
        if (str13 != null) {
            int i15 = i2.f23255a;
            i2VarM9997b = AbstractC5068s.m9997b(str13);
        } else {
            i2VarM9997b = null;
        }
        l0Var.f23273B = i2VarM9997b;
        String str14 = (String) interfaceC3738n.get("x-amz-request-charged");
        if (str14 != null) {
            int i16 = l2.f23312a;
            l2VarM10865a = r0.m10865a(str14);
        } else {
            l2VarM10865a = null;
        }
        l0Var.f23274C = l2VarM10865a;
        l0Var.f23275D = (String) interfaceC3738n.get("x-amz-restore");
        l0Var.f23277F = (String) interfaceC3738n.get("x-amz-server-side-encryption-customer-algorithm");
        l0Var.f23278G = (String) interfaceC3738n.get("x-amz-server-side-encryption-customer-key-MD5");
        l0Var.f23279H = (String) interfaceC3738n.get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID);
        String str15 = (String) interfaceC3738n.get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        if (str15 != null) {
            int i17 = w2.f23519a;
            w2VarM10884a = s0.m10884a(str15);
        } else {
            w2VarM10884a = null;
        }
        l0Var.f23276E = w2VarM10884a;
        String str16 = (String) interfaceC3738n.get(ObjectMetadata.STORAGE_CLASS);
        if (str16 != null) {
            int i18 = m3.f23356a;
            m3VarM10918a = t0.m10918a(str16);
        } else {
            m3VarM10918a = null;
        }
        l0Var.f23280I = m3VarM10918a;
        String str17 = (String) interfaceC3738n.get("x-amz-tagging-count");
        l0Var.f23281J = str17 != null ? Integer.valueOf(Integer.parseInt(str17)) : null;
        l0Var.f23282K = (String) interfaceC3738n.get("x-amz-version-id");
        l0Var.f23283L = (String) interfaceC3738n.get(ObjectMetadata.REDIRECT_LOCATION);
        Set setNames = interfaceC3738n.names();
        ArrayList arrayList = new ArrayList();
        Iterator it = setNames.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC5185w.m10138t((String) next, "x-amz-meta-", false)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            l0Var.f23306v = C6669s.f31944a;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str18 = (String) obj;
                String str19 = (String) interfaceC3738n.get(str18);
                if (str19 != null) {
                    linkedHashMap.put(AbstractC5178p.m10107R(str18, "x-amz-meta-"), str19);
                }
            }
            l0Var.f23306v = linkedHashMap;
        }
        return new p0(l0Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r8v3, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /* renamed from: c */
    private final Object m11469c(C0645a context, C5884l call, byte[] bArr) {
        ArrayList arrayListM10833h;
        Object objM10796a;
        Object objM10796a2;
        Serializable serializableM10796a;
        Object objM10796a3;
        Object objM10796a4;
        List listM10833h;
        Object objM10796a5;
        Object objM10796a6;
        Object objM10796a7;
        Object objM10796a8;
        Serializable serializableM10796a2;
        Object objM10796a9;
        Object objM10796a10;
        Object objM10796a11;
        Object objM10796a12;
        Object objM10796a13;
        List listM10833h2;
        Serializable serializableM10796a3;
        Object objM10796a14;
        Object objM10796a15;
        Object objM10796a16;
        Object objM10796a17;
        Serializable serializableM10796a4;
        Object objM10796a18;
        S3Exception s3Exception;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        C7394a c7394a = call.f28691b;
        l2 l2VarM10865a = null;
        if (!h8.m11686e(c7394a.f35158a)) {
            C7394a c7394aM11710b = j6.m11710b(c7394a, bArr);
            ?? M11501b = C5884l.m11501b(call, c7394aM11710b);
            try {
                C4437c c4437c = bArr == null ? AbstractC4154l.m8918a(c7394a.f35158a, h0.f19571f) ? new C4437c("NotFound", null, null, null) : new C4437c(c7394a.f35158a.toString(), null, null, null) : AbstractC0911f.m2619c(bArr);
                M11501b = AbstractC4154l.m8918a(c4437c.f22162a, "NoSuchBucket");
                if (M11501b != 0) {
                    s3Exception = new NoSuchBucket();
                    s3Exception.f3497d.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
                } else {
                    s3Exception = new S3Exception(c4437c.f22163b);
                }
                AbstractC0911f.m2620d(s3Exception, c7394aM11710b, c4437c);
                throw s3Exception;
            } catch (Exception unused) {
                S3Exception s3Exception2 = new S3Exception("Failed to parse response as restXml error");
                AbstractC0911f.m2620d(s3Exception2, M11501b.f28691b, null);
                throw s3Exception2;
            }
        }
        w0 w0Var = new w0();
        String str = (String) c7394a.f35159b.get("x-amz-request-charged");
        if (str != null) {
            int i10 = l2.f23312a;
            l2VarM10865a = r0.m10865a(str);
        }
        w0Var.f23516l = l2VarM10865a;
        if (bArr != null) {
            C0182j c0182jM11759c = l6.m11759c(bArr);
            while (true) {
                C0182j c0182jM418i = c0182jM11759c.m418i();
                if (c0182jM418i != null) {
                    String strM415f = c0182jM418i.m415f();
                    switch (strM415f.hashCode()) {
                        case -1943297557:
                            if (!strM415f.equals("CommonPrefixes")) {
                                break;
                            } else {
                                eb.w0 w0Var2 = new eb.w0();
                                while (true) {
                                    C0182j c0182jM418i2 = c0182jM418i.m418i();
                                    if (c0182jM418i2 == null) {
                                        C4702r c4702r = new C4702r(w0Var2);
                                        List list = w0Var.f23505a;
                                        if (list == null) {
                                            arrayListM10833h = pe.m10833h(c4702r);
                                        } else {
                                            ArrayList arrayListD0 = AbstractC6663m.d0(list);
                                            arrayListD0.add(c4702r);
                                            arrayListM10833h = arrayListD0;
                                        }
                                        w0Var.f23505a = arrayListM10833h;
                                        break;
                                    } else {
                                        if (AbstractC4154l.m8918a(c0182jM418i2.m415f(), "Prefix")) {
                                            try {
                                                objM10796a = l6.m11757a(c0182jM418i2);
                                            } catch (Throwable th2) {
                                                objM10796a = od.m10796a(th2);
                                            }
                                            Throwable thM12363a = C6364n.m12363a(objM10796a);
                                            if (thM12363a != null) {
                                                objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#Prefix`)", thM12363a);
                                            }
                                            od.m10798c(objM10796a);
                                            w0Var2.f9503a = (String) objM10796a;
                                        }
                                        c0182jM418i2.m413d();
                                    }
                                }
                            }
                        case -1896243534:
                            if (!strM415f.equals("Prefix")) {
                                break;
                            } else {
                                try {
                                    objM10796a2 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th3) {
                                    objM10796a2 = od.m10796a(th3);
                                }
                                Throwable thM12363a2 = C6364n.m12363a(objM10796a2);
                                if (thM12363a2 != null) {
                                    objM10796a2 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#Prefix`)", thM12363a2);
                                }
                                od.m10798c(objM10796a2);
                                w0Var.f23515k = (String) objM10796a2;
                                break;
                            }
                        case -1786475176:
                            if (!strM415f.equals("MaxKeys")) {
                                break;
                            } else {
                                try {
                                    serializableM10796a = l6.m11757a(c0182jM418i);
                                } catch (Throwable th4) {
                                    serializableM10796a = od.m10796a(th4);
                                }
                                Object objM10632b = ef.m10632b(serializableM10796a);
                                Throwable thM12363a3 = C6364n.m12363a(objM10632b);
                                if (thM12363a3 != null) {
                                    objM10632b = AbstractC0030c.m128s("expected (integer: `com.amazonaws.s3#MaxKeys`)", thM12363a3);
                                }
                                od.m10798c(objM10632b);
                                w0Var.f23512h = (Integer) objM10632b;
                                break;
                            }
                        case -871463121:
                            if (!strM415f.equals("NextContinuationToken")) {
                                break;
                            } else {
                                try {
                                    objM10796a3 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th5) {
                                    objM10796a3 = od.m10796a(th5);
                                }
                                Throwable thM12363a4 = C6364n.m12363a(objM10796a3);
                                if (thM12363a4 != null) {
                                    objM10796a3 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#NextToken`)", thM12363a4);
                                }
                                od.m10798c(objM10796a3);
                                w0Var.f23514j = (String) objM10796a3;
                                break;
                            }
                        case -685399219:
                            if (!strM415f.equals("EncodingType")) {
                                break;
                            } else {
                                try {
                                    objM10796a4 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th6) {
                                    objM10796a4 = od.m10796a(th6);
                                }
                                if (!(objM10796a4 instanceof C6363m)) {
                                    try {
                                        String str2 = (String) objM10796a4;
                                        int i11 = i0.f23253a;
                                        objM10796a4 = str2.equals("url") ? mb.h0.f23248b : new g0(str2);
                                    } catch (Throwable th7) {
                                        objM10796a4 = od.m10796a(th7);
                                    }
                                }
                                Throwable thM12363a5 = C6364n.m12363a(objM10796a4);
                                if (thM12363a5 != null) {
                                    objM10796a4 = AbstractC0030c.m128s("expected (enum: `com.amazonaws.s3#EncodingType`)", thM12363a5);
                                }
                                od.m10798c(objM10796a4);
                                w0Var.f23509e = (i0) objM10796a4;
                                break;
                            }
                        case -502677702:
                            if (!strM415f.equals("Contents")) {
                                break;
                            } else {
                                C3328c c3328c = new C3328c();
                                while (true) {
                                    C0182j c0182jM418i3 = c0182jM418i.m418i();
                                    if (c0182jM418i3 == null) {
                                        y0 y0Var = new y0(c3328c);
                                        List list2 = w0Var.f23506b;
                                        if (list2 == null) {
                                            listM10833h = pe.m10833h(y0Var);
                                        } else {
                                            ArrayList arrayListD02 = AbstractC6663m.d0(list2);
                                            arrayListD02.add(y0Var);
                                            listM10833h = arrayListD02;
                                        }
                                        w0Var.f23506b = listM10833h;
                                        break;
                                    } else {
                                        String strM415f2 = c0182jM418i3.m415f();
                                        switch (strM415f2.hashCode()) {
                                            case 75327:
                                                if (!strM415f2.equals("Key")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a5 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th8) {
                                                        objM10796a5 = od.m10796a(th8);
                                                    }
                                                    Throwable thM12363a6 = C6364n.m12363a(objM10796a5);
                                                    if (thM12363a6 != null) {
                                                        objM10796a5 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#ObjectKey`)", thM12363a6);
                                                    }
                                                    od.m10798c(objM10796a5);
                                                    c3328c.f17611c = (String) objM10796a5;
                                                    break;
                                                }
                                            case 2139413:
                                                if (!strM415f2.equals("ETag")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a6 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th9) {
                                                        objM10796a6 = od.m10796a(th9);
                                                    }
                                                    Throwable thM12363a7 = C6364n.m12363a(objM10796a6);
                                                    if (thM12363a7 != null) {
                                                        objM10796a6 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#ETag`)", thM12363a7);
                                                    }
                                                    od.m10798c(objM10796a6);
                                                    c3328c.f17609a = (String) objM10796a6;
                                                    break;
                                                }
                                            case 2577441:
                                                if (!strM415f2.equals("Size")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a7 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th10) {
                                                        objM10796a7 = od.m10796a(th10);
                                                    }
                                                    if (!(objM10796a7 instanceof C6363m)) {
                                                        try {
                                                            objM10796a7 = Long.valueOf(Long.parseLong((String) objM10796a7));
                                                        } catch (Throwable th11) {
                                                            objM10796a7 = od.m10796a(th11);
                                                        }
                                                    }
                                                    Throwable thM12363a8 = C6364n.m12363a(objM10796a7);
                                                    if (thM12363a8 != null) {
                                                        objM10796a7 = AbstractC0030c.m128s("expected (long: `com.amazonaws.s3#Size`)", thM12363a8);
                                                    }
                                                    od.m10798c(objM10796a7);
                                                    c3328c.f17616h = (Long) objM10796a7;
                                                    break;
                                                }
                                            case 34348032:
                                                if (!strM415f2.equals("RestoreStatus")) {
                                                    break;
                                                } else {
                                                    C8849i c8849i = new C8849i(10, false);
                                                    while (true) {
                                                        C0182j c0182jM418i4 = c0182jM418i3.m418i();
                                                        if (c0182jM418i4 == null) {
                                                            c3328c.f17615g = new p2(c8849i);
                                                            break;
                                                        } else {
                                                            String strM415f3 = c0182jM418i4.m415f();
                                                            if (AbstractC4154l.m8918a(strM415f3, "IsRestoreInProgress")) {
                                                                try {
                                                                    objM10796a8 = l6.m11757a(c0182jM418i4);
                                                                } catch (Throwable th12) {
                                                                    objM10796a8 = od.m10796a(th12);
                                                                }
                                                                if (!(objM10796a8 instanceof C6363m)) {
                                                                    try {
                                                                        objM10796a8 = Boolean.valueOf(Boolean.parseBoolean((String) objM10796a8));
                                                                    } catch (Throwable th13) {
                                                                        objM10796a8 = od.m10796a(th13);
                                                                    }
                                                                }
                                                                Throwable thM12363a9 = C6364n.m12363a(objM10796a8);
                                                                if (thM12363a9 != null) {
                                                                    objM10796a8 = AbstractC0030c.m128s("expected (boolean: `com.amazonaws.s3#IsRestoreInProgress`)", thM12363a9);
                                                                }
                                                                od.m10798c(objM10796a8);
                                                                c8849i.f42583b = (Boolean) objM10796a8;
                                                            } else if (AbstractC4154l.m8918a(strM415f3, "RestoreExpiryDate")) {
                                                                try {
                                                                    serializableM10796a2 = l6.m11757a(c0182jM418i4);
                                                                } catch (Throwable th14) {
                                                                    serializableM10796a2 = od.m10796a(th14);
                                                                }
                                                                Object objM10633c = ef.m10633c(serializableM10796a2, EnumC7143t.ISO_8601);
                                                                Throwable thM12363a10 = C6364n.m12363a(objM10633c);
                                                                if (thM12363a10 != null) {
                                                                    objM10633c = AbstractC0030c.m128s("expected (timestamp: `com.amazonaws.s3#RestoreExpiryDate`)", thM12363a10);
                                                                }
                                                                od.m10798c(objM10633c);
                                                                c8849i.f42584c = (C7126c) objM10633c;
                                                            }
                                                            c0182jM418i4.m413d();
                                                        }
                                                    }
                                                }
                                            case 76612243:
                                                if (!strM415f2.equals("Owner")) {
                                                    break;
                                                } else {
                                                    p1 p1Var = new p1();
                                                    while (true) {
                                                        C0182j c0182jM418i5 = c0182jM418i3.m418i();
                                                        if (c0182jM418i5 == null) {
                                                            c3328c.f17614f = new x1(p1Var);
                                                            break;
                                                        } else {
                                                            String strM415f4 = c0182jM418i5.m415f();
                                                            if (AbstractC4154l.m8918a(strM415f4, "DisplayName")) {
                                                                try {
                                                                    objM10796a9 = l6.m11757a(c0182jM418i5);
                                                                } catch (Throwable th15) {
                                                                    objM10796a9 = od.m10796a(th15);
                                                                }
                                                                Throwable thM12363a11 = C6364n.m12363a(objM10796a9);
                                                                if (thM12363a11 != null) {
                                                                    objM10796a9 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#DisplayName`)", thM12363a11);
                                                                }
                                                                od.m10798c(objM10796a9);
                                                                p1Var.f9409a = (String) objM10796a9;
                                                            } else if (AbstractC4154l.m8918a(strM415f4, "ID")) {
                                                                try {
                                                                    objM10796a10 = l6.m11757a(c0182jM418i5);
                                                                } catch (Throwable th16) {
                                                                    objM10796a10 = od.m10796a(th16);
                                                                }
                                                                Throwable thM12363a12 = C6364n.m12363a(objM10796a10);
                                                                if (thM12363a12 != null) {
                                                                    objM10796a10 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#ID`)", thM12363a12);
                                                                }
                                                                od.m10798c(objM10796a10);
                                                                p1Var.f9410b = (String) objM10796a10;
                                                            }
                                                            c0182jM418i5.m413d();
                                                        }
                                                    }
                                                }
                                            case 875616829:
                                                if (!strM415f2.equals("ChecksumType")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a11 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th17) {
                                                        objM10796a11 = od.m10796a(th17);
                                                    }
                                                    if (!(objM10796a11 instanceof C6363m)) {
                                                        try {
                                                            int i12 = AbstractC4701q.f23439a;
                                                            objM10796a11 = AbstractC3768b.m8289a((String) objM10796a11);
                                                        } catch (Throwable th18) {
                                                            objM10796a11 = od.m10796a(th18);
                                                        }
                                                    }
                                                    Throwable thM12363a13 = C6364n.m12363a(objM10796a11);
                                                    if (thM12363a13 != null) {
                                                        objM10796a11 = AbstractC0030c.m128s("expected (enum: `com.amazonaws.s3#ChecksumType`)", thM12363a13);
                                                    }
                                                    od.m10798c(objM10796a11);
                                                    c3328c.f17610b = (AbstractC4701q) objM10796a11;
                                                    break;
                                                }
                                            case 1035673565:
                                                if (!strM415f2.equals("StorageClass")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a12 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th19) {
                                                        objM10796a12 = od.m10796a(th19);
                                                    }
                                                    if (!(objM10796a12 instanceof C6363m)) {
                                                        try {
                                                            int i13 = w1.f23518a;
                                                            objM10796a12 = AbstractC4992c.m9902c((String) objM10796a12);
                                                        } catch (Throwable th20) {
                                                            objM10796a12 = od.m10796a(th20);
                                                        }
                                                    }
                                                    Throwable thM12363a14 = C6364n.m12363a(objM10796a12);
                                                    if (thM12363a14 != null) {
                                                        objM10796a12 = AbstractC0030c.m128s("expected (enum: `com.amazonaws.s3#ObjectStorageClass`)", thM12363a14);
                                                    }
                                                    od.m10798c(objM10796a12);
                                                    c3328c.f17617i = (w1) objM10796a12;
                                                    break;
                                                }
                                            case 1179374412:
                                                if (!strM415f2.equals("ChecksumAlgorithm")) {
                                                    break;
                                                } else {
                                                    try {
                                                        objM10796a13 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th21) {
                                                        objM10796a13 = od.m10796a(th21);
                                                    }
                                                    if (!(objM10796a13 instanceof C6363m)) {
                                                        try {
                                                            int i14 = AbstractC4697m.f23314a;
                                                            objM10796a13 = AbstractC3629w.m8173e((String) objM10796a13);
                                                        } catch (Throwable th22) {
                                                            objM10796a13 = od.m10796a(th22);
                                                        }
                                                    }
                                                    Throwable thM12363a15 = C6364n.m12363a(objM10796a13);
                                                    if (thM12363a15 != null) {
                                                        objM10796a13 = AbstractC0030c.m128s("expected (enum: `com.amazonaws.s3#ChecksumAlgorithm`)", thM12363a15);
                                                    }
                                                    od.m10798c(objM10796a13);
                                                    AbstractC4697m abstractC4697m = (AbstractC4697m) objM10796a13;
                                                    List list3 = (List) c3328c.f17613e;
                                                    if (list3 == null) {
                                                        listM10833h2 = pe.m10833h(abstractC4697m);
                                                    } else {
                                                        ArrayList arrayListD03 = AbstractC6663m.d0(list3);
                                                        arrayListD03.add(abstractC4697m);
                                                        listM10833h2 = arrayListD03;
                                                    }
                                                    c3328c.f17613e = listM10833h2;
                                                    break;
                                                }
                                            case 2123323295:
                                                if (!strM415f2.equals("LastModified")) {
                                                    break;
                                                } else {
                                                    try {
                                                        serializableM10796a3 = l6.m11757a(c0182jM418i3);
                                                    } catch (Throwable th23) {
                                                        serializableM10796a3 = od.m10796a(th23);
                                                    }
                                                    Object objM10633c2 = ef.m10633c(serializableM10796a3, EnumC7143t.ISO_8601);
                                                    Throwable thM12363a16 = C6364n.m12363a(objM10633c2);
                                                    if (thM12363a16 != null) {
                                                        objM10633c2 = AbstractC0030c.m128s("expected (timestamp: `com.amazonaws.s3#LastModified`)", thM12363a16);
                                                    }
                                                    od.m10798c(objM10633c2);
                                                    c3328c.f17612d = (C7126c) objM10633c2;
                                                    break;
                                                }
                                        }
                                        c0182jM418i3.m413d();
                                    }
                                }
                            }
                            break;
                        case 2420395:
                            if (!strM415f.equals("Name")) {
                                break;
                            } else {
                                try {
                                    objM10796a14 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th24) {
                                    objM10796a14 = od.m10796a(th24);
                                }
                                Throwable thM12363a17 = C6364n.m12363a(objM10796a14);
                                if (thM12363a17 != null) {
                                    objM10796a14 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#BucketName`)", thM12363a17);
                                }
                                od.m10798c(objM10796a14);
                                w0Var.f23513i = (String) objM10796a14;
                                break;
                            }
                        case 159271316:
                            if (!strM415f.equals("IsTruncated")) {
                                break;
                            } else {
                                try {
                                    objM10796a15 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th25) {
                                    objM10796a15 = od.m10796a(th25);
                                }
                                if (!(objM10796a15 instanceof C6363m)) {
                                    try {
                                        objM10796a15 = Boolean.valueOf(Boolean.parseBoolean((String) objM10796a15));
                                    } catch (Throwable th26) {
                                        objM10796a15 = od.m10796a(th26);
                                    }
                                }
                                Throwable thM12363a18 = C6364n.m12363a(objM10796a15);
                                if (thM12363a18 != null) {
                                    objM10796a15 = AbstractC0030c.m128s("expected (boolean: `com.amazonaws.s3#IsTruncated`)", thM12363a18);
                                }
                                od.m10798c(objM10796a15);
                                w0Var.f23510f = (Boolean) objM10796a15;
                                break;
                            }
                        case 392207034:
                            if (!strM415f.equals("StartAfter")) {
                                break;
                            } else {
                                try {
                                    objM10796a16 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th27) {
                                    objM10796a16 = od.m10796a(th27);
                                }
                                Throwable thM12363a19 = C6364n.m12363a(objM10796a16);
                                if (thM12363a19 != null) {
                                    objM10796a16 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#StartAfter`)", thM12363a19);
                                }
                                od.m10798c(objM10796a16);
                                w0Var.f23517m = (String) objM10796a16;
                                break;
                            }
                        case 413261282:
                            if (!strM415f.equals("ContinuationToken")) {
                                break;
                            } else {
                                try {
                                    objM10796a17 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th28) {
                                    objM10796a17 = od.m10796a(th28);
                                }
                                Throwable thM12363a20 = C6364n.m12363a(objM10796a17);
                                if (thM12363a20 != null) {
                                    objM10796a17 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#Token`)", thM12363a20);
                                }
                                od.m10798c(objM10796a17);
                                w0Var.f23507c = (String) objM10796a17;
                                break;
                            }
                        case 539773456:
                            if (!strM415f.equals("KeyCount")) {
                                break;
                            } else {
                                try {
                                    serializableM10796a4 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th29) {
                                    serializableM10796a4 = od.m10796a(th29);
                                }
                                Object objM10632b2 = ef.m10632b(serializableM10796a4);
                                Throwable thM12363a21 = C6364n.m12363a(objM10632b2);
                                if (thM12363a21 != null) {
                                    objM10632b2 = AbstractC0030c.m128s("expected (integer: `com.amazonaws.s3#KeyCount`)", thM12363a21);
                                }
                                od.m10798c(objM10632b2);
                                w0Var.f23511g = (Integer) objM10632b2;
                                break;
                            }
                        case 1753449959:
                            if (!strM415f.equals("Delimiter")) {
                                break;
                            } else {
                                try {
                                    objM10796a18 = l6.m11757a(c0182jM418i);
                                } catch (Throwable th30) {
                                    objM10796a18 = od.m10796a(th30);
                                }
                                Throwable thM12363a22 = C6364n.m12363a(objM10796a18);
                                if (thM12363a22 != null) {
                                    objM10796a18 = AbstractC0030c.m128s("expected (string: `com.amazonaws.s3#Delimiter`)", thM12363a22);
                                }
                                od.m10798c(objM10796a18);
                                w0Var.f23508d = (String) objM10796a18;
                                break;
                            }
                    }
                    c0182jM418i.m413d();
                }
            }
        }
        return new x0(w0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Type inference failed for: r5v2, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m11470d(bd.C0645a r4, pc.C5884l r5, byte[] r6) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C5866a.m11470d(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aws.sdk.kotlin.services.s3.model.S3Exception, java.lang.Throwable] */
    /* renamed from: e */
    private final Object m11471e(C0645a context, C5884l call, byte[] bArr) {
        l2 l2VarM10865a;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        C7394a c7394a = call.f28691b;
        w2 w2VarM10884a = null;
        if (!h8.m11686e(c7394a.f35158a)) {
            C7394a c7394aM11710b = j6.m11710b(c7394a, bArr);
            C5884l c5884lM11501b = C5884l.m11501b(call, c7394aM11710b);
            try {
                C4437c c4437c = bArr == null ? AbstractC4154l.m8918a(c7394a.f35158a, h0.f19571f) ? new C4437c("NotFound", null, null, null) : new C4437c(c7394a.f35158a.toString(), null, null, null) : AbstractC0911f.m2619c(bArr);
                c5884lM11501b = new S3Exception(c4437c.f22163b);
                AbstractC0911f.m2620d(c5884lM11501b, c7394aM11710b, c4437c);
                throw c5884lM11501b;
            } catch (Exception unused) {
                S3Exception s3Exception = new S3Exception("Failed to parse response as restXml error");
                AbstractC0911f.m2620d(s3Exception, c5884lM11501b.f28691b, null);
                throw s3Exception;
            }
        }
        o3 o3Var = new o3();
        InterfaceC3738n interfaceC3738n = c7394a.f35159b;
        String str = (String) interfaceC3738n.get("x-amz-server-side-encryption-bucket-key-enabled");
        o3Var.f23372a = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
        o3Var.f23373b = (String) interfaceC3738n.get("x-amz-checksum-crc32");
        o3Var.f23374c = (String) interfaceC3738n.get("x-amz-checksum-crc32c");
        o3Var.f23375d = (String) interfaceC3738n.get("x-amz-checksum-crc64nvme");
        o3Var.f23376e = (String) interfaceC3738n.get("x-amz-checksum-sha1");
        o3Var.f23377f = (String) interfaceC3738n.get("x-amz-checksum-sha256");
        o3Var.f23378g = (String) interfaceC3738n.get("ETag");
        String str2 = (String) interfaceC3738n.get("x-amz-request-charged");
        if (str2 != null) {
            int i10 = l2.f23312a;
            l2VarM10865a = r0.m10865a(str2);
        } else {
            l2VarM10865a = null;
        }
        o3Var.f23382k = l2VarM10865a;
        o3Var.f23379h = (String) interfaceC3738n.get("x-amz-server-side-encryption-customer-algorithm");
        o3Var.f23380i = (String) interfaceC3738n.get("x-amz-server-side-encryption-customer-key-MD5");
        o3Var.f23381j = (String) interfaceC3738n.get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID);
        String str3 = (String) interfaceC3738n.get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        if (str3 != null) {
            int i11 = w2.f23519a;
            w2VarM10884a = s0.m10884a(str3);
        }
        o3Var.f23383l = w2VarM10884a;
        return new p3(o3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0595  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m11472f(bd.C0645a r11, pc.C5884l r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C5866a.m11472f(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m11473g(bd.C0645a r17, pc.C5884l r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C5866a.m11473g(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Type inference failed for: r1v19, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r1v31, types: [aws.sdk.kotlin.services.s3.model.S3Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v33, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r1v36, types: [aws.sdk.kotlin.services.s3.model.S3Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r1v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v47, types: [pc.l] */
    /* JADX WARN: Type inference failed for: r1v50, types: [aws.sdk.kotlin.services.s3.model.S3Exception, java.lang.Throwable] */
    @Override // sc.InterfaceC6789i
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1829a(bd.C0645a r23, pc.C5884l r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 3156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C5866a.mo1829a(bd.a, pc.l, byte[]):java.lang.Object");
    }
}
