package c9;

import al.C0182j;
import androidx.compose.ui.graphics.AbstractC0260a;
import aws.sdk.kotlin.services.s3.model.S3Exception;
import aws.smithy.kotlin.runtime.C0488a;
import aws.smithy.kotlin.runtime.C0489b;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.l0;
import ec.C2003a;
import ec.C2005c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lb.C4437c;
import mb.q2;
import og.ud;
import pg.i6;
import pg.l6;
import qb.C6152a;
import rw.AbstractC6663m;
import rw.C6668r;
import uc.C7394a;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.f */
/* loaded from: classes.dex */
public abstract class AbstractC0911f {
    /* renamed from: a */
    public static final InterfaceC7879r m2617a(InterfaceC7879r interfaceC7879r, l0 l0Var) {
        return AbstractC0260a.m715b(interfaceC7879r, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, l0Var, true, 124927);
    }

    /* renamed from: b */
    public static final InterfaceC7879r m2618b(InterfaceC7879r interfaceC7879r) {
        return AbstractC0260a.m715b(interfaceC7879r, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, true, 126975);
    }

    /* renamed from: c */
    public static final C4437c m2619c(byte[] payload) {
        AbstractC4154l.m8923f(payload, "payload");
        C0182j c0182jM11759c = l6.m11759c(payload);
        String strM11757a = null;
        String strM11757a2 = null;
        String strM11757a3 = null;
        String strM11757a4 = null;
        while (true) {
            C0182j c0182jM418i = c0182jM11759c.m418i();
            if (c0182jM418i == null) {
                return new C4437c(strM11757a, strM11757a2, strM11757a3, strM11757a4);
            }
            String strM415f = c0182jM418i.m415f();
            switch (strM415f.hashCode()) {
                case -2127617789:
                    if (strM415f.equals("HostId")) {
                        strM11757a4 = l6.m11757a(c0182jM418i);
                        continue;
                    }
                    c0182jM418i.m413d();
                case -1675388953:
                    if (!strM415f.equals("Message")) {
                    }
                    c0182jM418i.m413d();
                    break;
                case -1597066262:
                    if (strM415f.equals("RequestId")) {
                        strM11757a3 = l6.m11757a(c0182jM418i);
                        continue;
                    }
                    c0182jM418i.m413d();
                case 2105869:
                    if (strM415f.equals("Code")) {
                        strM11757a = l6.m11757a(c0182jM418i);
                    } else {
                        continue;
                    }
                    c0182jM418i.m413d();
                case 954925063:
                    if (!strM415f.equals("message")) {
                    }
                    c0182jM418i.m413d();
                    break;
                default:
                    c0182jM418i.m413d();
            }
            strM11757a2 = l6.m11757a(c0182jM418i);
            c0182jM418i.m413d();
        }
    }

    /* renamed from: d */
    public static final void m2620d(S3Exception s3Exception, C7394a c7394a, C4437c c4437c) {
        String str;
        i6.m11695a(s3Exception, c7394a, c4437c);
        ud.m10983i(s3Exception.mo1479a().f3503a, C0489b.f3508i, c4437c != null ? c4437c.f22164c : null);
        if (c4437c == null || (str = c4437c.f22165d) == null) {
            str = (String) c7394a.f35159b.get("x-amz-id-2");
        }
        if (str != null) {
            q2 q2Var = s3Exception.f3497d;
            ud.m10983i(q2Var.f3503a, q2.f23442j, str);
            C2005c c2005c = q2Var.f3503a;
            C2003a key = C0488a.f3500b;
            C6152a c6152a = new C6152a("Extended request ID", str);
            AbstractC4154l.m8923f(c2005c, "<this>");
            AbstractC4154l.m8923f(key, "key");
            Collection collection = (List) c2005c.mo1864e(key);
            if (collection == null) {
                collection = C6668r.f31943a;
            }
            c2005c.mo1862b(key, AbstractC6663m.m12753Q(c6152a, collection));
        }
    }
}
