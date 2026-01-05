package pg;

import a2.AbstractC0030c;
import al.C0182j;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.C6364n;
import vb.C7697d;
import xb.C8319a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q7 {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11832a(p3.f0 r8, ww.AbstractC8191a r9) {
        /*
            boolean r0 = r9 instanceof j1.C3510b
            if (r0 == 0) goto L13
            r0 = r9
            j1.b r0 = (j1.C3510b) r0
            int r1 = r0.f18389c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18389c = r1
            goto L18
        L13:
            j1.b r0 = new j1.b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f18388b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f18389c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p3.f0 r8 = r0.f18387a
            og.od.m10798c(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r9)
        L34:
            r0.f18387a = r8
            r0.f18389c = r3
            p3.k r9 = p3.EnumC5813k.Main
            java.lang.Object r9 = r8.m11384b(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            p3.j r9 = (p3.C5812j) r9
            int r2 = r9.f28469c
            java.lang.Object r9 = r9.f28467a
            r2 = r2 & 66
            if (r2 == 0) goto L34
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            p3.q r6 = (p3.C5819q) r6
            boolean r7 = r6.m11406b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f28483h
            if (r7 != 0) goto L34
            boolean r6 = r6.f28479d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.q7.m11832a(p3.f0, ww.a):java.lang.Object");
    }

    /* renamed from: b */
    public static final C7697d m11833b(byte[] payload) {
        Object objM10796a;
        C0182j c0182jM418i;
        String strM11757a;
        String strM11757a2;
        AbstractC4154l.m8923f(payload, "payload");
        C0182j c0182jM11759c = l6.m11759c(payload);
        try {
            String strM415f = c0182jM11759c.m415f();
            if (!AbstractC4154l.m8918a(strM415f, "ErrorResponse") && !AbstractC4154l.m8918a(strM415f, "Error")) {
                throw new IllegalStateException("expected restXml error response with root tag of <ErrorResponse> or <Error>");
            }
            if (AbstractC4154l.m8918a(c0182jM11759c.m415f(), "ErrorResponse")) {
                c0182jM418i = c0182jM11759c.m418i();
                if (c0182jM418i == null) {
                    throw new IllegalStateException("expected more tags after <ErrorResponse>");
                }
            } else {
                c0182jM418i = c0182jM11759c;
            }
            String strM11757a3 = null;
            if (AbstractC4154l.m8918a(c0182jM418i.m415f(), "Error")) {
                strM11757a = null;
                strM11757a2 = null;
                while (true) {
                    C0182j c0182jM418i2 = c0182jM418i.m418i();
                    if (c0182jM418i2 != null) {
                        String strM415f2 = c0182jM418i2.m415f();
                        switch (strM415f2.hashCode()) {
                            case -1675388953:
                                if (!strM415f2.equals("Message")) {
                                }
                                c0182jM418i2.m413d();
                                break;
                            case -1597066262:
                                if (strM415f2.equals("RequestId")) {
                                    strM11757a3 = l6.m11757a(c0182jM418i2);
                                } else {
                                    continue;
                                }
                                c0182jM418i2.m413d();
                            case 2105869:
                                if (strM415f2.equals("Code")) {
                                    strM11757a2 = l6.m11757a(c0182jM418i2);
                                } else {
                                    continue;
                                }
                                c0182jM418i2.m413d();
                            case 954925063:
                                if (!strM415f2.equals("message")) {
                                }
                                c0182jM418i2.m413d();
                                break;
                            default:
                                continue;
                                c0182jM418i2.m413d();
                        }
                        strM11757a = l6.m11757a(c0182jM418i2);
                        c0182jM418i2.m413d();
                    }
                }
            } else {
                strM11757a = null;
                strM11757a2 = null;
            }
            if (strM11757a3 == null) {
                while (true) {
                    C0182j c0182jM418i3 = c0182jM11759c.m418i();
                    if (c0182jM418i3 != null) {
                        if (AbstractC4154l.m8918a(c0182jM418i3.m415f(), "RequestId")) {
                            strM11757a3 = l6.m11757a(c0182jM418i3);
                        }
                    }
                }
            }
            objM10796a = new C8319a(strM11757a3, strM11757a2, strM11757a);
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        Throwable thM12363a = C6364n.m12363a(objM10796a);
        if (thM12363a != null) {
            objM10796a = AbstractC0030c.m128s("Unable to deserialize RestXml error", thM12363a);
        }
        od.m10798c(objM10796a);
        C8319a c8319a = (C8319a) objM10796a;
        return new C7697d(c8319a.f39879b, c8319a.f39880c, c8319a.f39878a);
    }
}
