package i9;

import bk.C0675f;
import kotlin.jvm.internal.AbstractC4154l;
import nc.InterfaceC4991b;
import og.bb;
import og.gf;
import ox.C5770a;
import ox.EnumC5772c;
import sb.InterfaceC6779f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements InterfaceC6779f {

    /* renamed from: a */
    public final InterfaceC6779f f17245a;

    /* renamed from: b */
    public final C0675f f17246b;

    /* renamed from: c */
    public final String f17247c;

    /* renamed from: d */
    public final InterfaceC4991b f17248d;

    public q0(InterfaceC6779f bootstrapCredentialsProvider, String roleArn, String str, String str2, String str3, InterfaceC4991b interfaceC4991b) {
        int i10 = C5770a.f28335d;
        long jM10551g = bb.m10551g(900, EnumC5772c.SECONDS);
        AbstractC4154l.m8923f(bootstrapCredentialsProvider, "bootstrapCredentialsProvider");
        AbstractC4154l.m8923f(roleArn, "roleArn");
        AbstractC4154l.m8923f(roleArn, "roleArn");
        C0675f c0675f = new C0675f();
        c0675f.f4251b = roleArn;
        c0675f.f4252c = str2;
        c0675f.f4253d = str3;
        c0675f.f4250a = jM10551g;
        c0675f.f4254e = null;
        c0675f.f4255f = null;
        this.f17245a = bootstrapCredentialsProvider;
        this.f17246b = c0675f;
        this.f17247c = str;
        this.f17248d = interfaceC4991b;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:38:0x00fc, B:55:0x0145, B:57:0x0151, B:58:0x016e, B:59:0x016f, B:60:0x0176), top: B:65:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:38:0x00fc, B:55:0x0145, B:57:0x0151, B:58:0x016e, B:59:0x016f, B:60:0x0176), top: B:65:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r18, uw.InterfaceC7559c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.q0.resolve(ec.b, uw.c):java.lang.Object");
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
