package pg;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.util.AbstractC1452a;
import hd.C2893e;
import hd.EnumC2908t;
import ic.C3229g;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import rw.AbstractC6662l;
import sd.AbstractC6812f;
import td.C7124a;
import td.C7126c;
import td.EnumC7143t;
import u9.C7380b;
import ud.C7416t;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e6 {
    /* renamed from: a */
    public static final i9.d0 m11595a(C7380b c7380b, i9.d0 d0Var, C7124a c7124a) {
        String str = c7380b.f35084a;
        if (str == null) {
            throw new IllegalStateException("missing accessToken from CreateTokenResponse");
        }
        c7124a.getClass();
        DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
        C7126c c7126cM13407e = C7124a.m13407e();
        int i10 = C5770a.f28335d;
        return new i9.d0(str, c7126cM13407e.m13410c(bb.m10551g(c7380b.f35085b, EnumC5772c.SECONDS)), c7380b.f35087d, d0Var.f17147d, d0Var.f17148e, d0Var.f17149f, d0Var.f17150g, d0Var.f17151h);
    }

    /* renamed from: b */
    public static ArrayList m11596b(i0.l2 l2Var, i0.l2 l2Var2) {
        ArrayList arrayList = new ArrayList();
        i0.n2 n2Var = i0.n2.PRIV;
        arrayList.add(new i0.k2(i0.p2.m7409a(n2Var, l2Var), i0.p2.m7409a(i0.n2.JPEG, l2Var2)));
        arrayList.add(new i0.k2(i0.p2.m7409a(n2Var, l2Var), i0.p2.m7409a(i0.n2.JPEG_R, l2Var2)));
        return arrayList;
    }

    /* renamed from: c */
    public static final String m11597c(InterfaceC7411o interfaceC7411o, String... strArr) {
        AbstractC4154l.m8923f(interfaceC7411o, "<this>");
        Object value = C7416t.f35214d.getValue();
        AbstractC4154l.m8922e(value, "getValue(...)");
        return AbstractC6662l.m12702E(strArr, (String) value, null, 62);
    }

    /* renamed from: d */
    public static final String m11598d(String cacheKey) {
        AbstractC4154l.m8923f(cacheKey, "cacheKey");
        return AbstractC1452a.m4561h(AbstractC6812f.m12986a(g6.m11647b(new C3229g(), AbstractC5185w.m10128j(cacheKey))), ".json");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11599e(java.lang.String r13, ud.InterfaceC7411o r14, ww.AbstractC8193c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.e6.m11599e(java.lang.String, ud.o, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final byte[] m11600f(i9.d0 token) {
        AbstractC4154l.m8923f(token, "token");
        C2893e c2893e = new C2893e(true);
        EnumC2908t enumC2908t = EnumC2908t.ObjectFirstKeyOrEnd;
        c2893e.m7010d("{");
        ((StringBuilder) c2893e.f15924c).append('\n');
        c2893e.f15923b++;
        ArrayList arrayList = (ArrayList) c2893e.f15925d;
        AbstractC4154l.m8923f(arrayList, "<this>");
        arrayList.add(enumC2908t);
        c2893e.m7014h("accessToken");
        c2893e.m7015i(token.f17144a);
        c2893e.m7014h("expiresAt");
        C7126c c7126c = token.f17145b;
        EnumC7143t enumC7143t = EnumC7143t.ISO_8601;
        c2893e.m7015i(c7126c.m13409b(enumC7143t));
        m11601g(c2893e, "refreshToken", token.f17146c);
        m11601g(c2893e, "clientId", token.f17147d);
        m11601g(c2893e, "clientSecret", token.f17148e);
        C7126c c7126c2 = token.f17149f;
        m11601g(c2893e, "registrationExpiresAt", c7126c2 != null ? c7126c2.m13409b(enumC7143t) : null);
        m11601g(c2893e, TransferTable.COLUMN_REGION, token.f17150g);
        m11601g(c2893e, "startUrl", token.f17151h);
        c2893e.m7011e();
        return c2893e.m7012f();
    }

    /* renamed from: g */
    public static final void m11601g(C2893e c2893e, String str, String str2) {
        if (str2 == null) {
            return;
        }
        c2893e.m7014h(str);
        c2893e.m7015i(str2);
    }
}
