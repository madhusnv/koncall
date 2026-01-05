package pg;

import android.text.InputFilter;
import aws.smithy.kotlin.runtime.ClientException;
import com.amplifyframework.storage.ObjectMetadata;
import ex.InterfaceC2137a;
import ic.C3224b;
import ic.C3226d;
import ic.C3228f;
import ic.C3229g;
import ic.C3230h;
import ic.InterfaceC3227e;
import kotlin.jvm.internal.AbstractC4154l;
import yb.EnumC8611c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g6 {
    /* renamed from: b */
    public static final byte[] m11647b(InterfaceC3227e fn2, byte[] input) {
        AbstractC4154l.m8923f(fn2, "fn");
        AbstractC4154l.m8923f(input, "input");
        fn2.update(input, 0, input.length);
        return fn2.mo7578a();
    }

    /* renamed from: c */
    public static final byte[] m11648c(byte[] bArr, InterfaceC2137a hashSupplier) {
        AbstractC4154l.m8923f(bArr, "<this>");
        AbstractC4154l.m8923f(hashSupplier, "hashSupplier");
        return m11647b((InterfaceC3227e) hashSupplier.invoke(), bArr);
    }

    /* renamed from: e */
    public static final String m11649e(InterfaceC3227e interfaceC3227e) {
        if (interfaceC3227e instanceof C3224b) {
            return "x-amz-checksum-crc32";
        }
        if (interfaceC3227e instanceof C3226d) {
            return "x-amz-checksum-crc32c";
        }
        if (interfaceC3227e instanceof C3229g) {
            return "x-amz-checksum-sha1";
        }
        if (interfaceC3227e instanceof C3230h) {
            return "x-amz-checksum-sha256";
        }
        if (interfaceC3227e instanceof C3228f) {
            return ObjectMetadata.CONTENT_MD5;
        }
        throw new ClientException("Checksum algorithm is not supported: " + kotlin.jvm.internal.a0.m8901a(interfaceC3227e.getClass()).m8914c());
    }

    /* renamed from: h */
    public static final EnumC8611c m11650h(InterfaceC3227e interfaceC3227e) {
        if (interfaceC3227e instanceof C3224b) {
            return EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_CRC32;
        }
        if (interfaceC3227e instanceof C3226d) {
            return EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_CRC32C;
        }
        if (interfaceC3227e instanceof C3229g) {
            return EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_SHA1;
        }
        if (interfaceC3227e instanceof C3230h) {
            return EnumC8611c.FLEXIBLE_CHECKSUMS_REQ_SHA256;
        }
        throw new IllegalStateException("Checksum was calculated using an unsupported hash function: " + kotlin.jvm.internal.a0.m8901a(interfaceC3227e.getClass()).m8914c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ic.InterfaceC3227e m11651i(java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r2, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1352399984: goto L54;
                case -903629273: goto L45;
                case 107902: goto L36;
                case 3528965: goto L27;
                case 94921523: goto L18;
                default: goto L17;
            }
        L17:
            goto L5c
        L18:
            java.lang.String r1 = "crc32"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L5c
        L21:
            ic.b r0 = new ic.b
            r0.<init>()
            goto L63
        L27:
            java.lang.String r1 = "sha1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L5c
        L30:
            ic.g r0 = new ic.g
            r0.<init>()
            goto L63
        L36:
            java.lang.String r1 = "md5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L5c
        L3f:
            ic.f r0 = new ic.f
            r0.<init>()
            goto L63
        L45:
            java.lang.String r1 = "sha256"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L5c
        L4e:
            ic.h r0 = new ic.h
            r0.<init>()
            goto L63
        L54:
            java.lang.String r1 = "crc32c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
        L5c:
            r0 = 0
            goto L63
        L5e:
            ic.d r0 = new ic.d
            r0.<init>()
        L63:
            if (r0 == 0) goto L66
            return r0
        L66:
            aws.smithy.kotlin.runtime.ClientException r0 = new aws.smithy.kotlin.runtime.ClientException
            java.lang.String r1 = "Checksum algorithm is not supported: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.g6.m11651i(java.lang.String):ic.e");
    }

    /* renamed from: a */
    public abstract InputFilter[] mo11652a(InputFilter[] inputFilterArr);

    /* renamed from: d */
    public abstract boolean mo11653d();

    /* renamed from: f */
    public abstract void mo11654f(boolean z6);

    /* renamed from: g */
    public abstract void mo11655g(boolean z6);
}
