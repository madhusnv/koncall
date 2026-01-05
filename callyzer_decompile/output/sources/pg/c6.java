package pg;

import android.hardware.camera2.CameraCharacteristics;
import aws.sdk.kotlin.runtime.auth.credentials.InvalidJsonCredentialsException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import i9.C3200r;
import i9.C3201s;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import p021w.C7851q;
import rw.AbstractC6662l;
import td.C7124a;
import td.C7126c;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c6 {
    /* renamed from: a */
    public static String m11563a(C7851q c7851q, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains("0") || !arrayList.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c7851q.m14835b("0").m14823a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c7851q.m14835b("1").m14823a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: b */
    public static final d6 m11564b(C2891c c2891c) {
        String lowerCase;
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Code")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessKeyId")}), 0);
        C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SecretAccessKey")}), 0);
        C2271i c2271i4 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Token")}), 0);
        C2271i c2271i5 = new C2271i(C2274l.f10293k, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Expiration")}), 0);
        C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccountId")}), 0);
        C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Message")}), 0);
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        c8849i.m16319q(c2271i3);
        c8849i.m16319q(c2271i4);
        c8849i.m16319q(c2271i5);
        c8849i.m16319q(c2271i6);
        c8849i.m16319q(c2271i7);
        try {
            InterfaceC2264b interfaceC2264bM7001h = c2891c.m7001h(new C2272j(c8849i));
            String strMo62d = null;
            String strMo62d2 = null;
            String strMo62d3 = null;
            String strMo62d4 = null;
            String strMo62d5 = null;
            C7126c c7126cM13405c = null;
            String strMo62d6 = null;
            while (true) {
                Integer numMo71n = interfaceC2264bM7001h.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    int i11 = c2271i2.f10279b;
                    if (numMo71n == null || numMo71n.intValue() != i11) {
                        int i12 = c2271i3.f10279b;
                        if (numMo71n == null || numMo71n.intValue() != i12) {
                            int i13 = c2271i4.f10279b;
                            if (numMo71n == null || numMo71n.intValue() != i13) {
                                int i14 = c2271i5.f10279b;
                                if (numMo71n == null || numMo71n.intValue() != i14) {
                                    int i15 = c2271i6.f10279b;
                                    if (numMo71n == null || numMo71n.intValue() != i15) {
                                        int i16 = c2271i7.f10279b;
                                        if (numMo71n == null || numMo71n.intValue() != i16) {
                                            if (numMo71n == null) {
                                                break;
                                            }
                                            interfaceC2264bM7001h.mo63e();
                                        } else {
                                            strMo62d2 = interfaceC2264bM7001h.mo62d();
                                        }
                                    } else {
                                        strMo62d6 = interfaceC2264bM7001h.mo62d();
                                    }
                                } else {
                                    DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
                                    c7126cM13405c = C7124a.m13405c(interfaceC2264bM7001h.mo62d());
                                }
                            } else {
                                strMo62d5 = interfaceC2264bM7001h.mo62d();
                            }
                        } else {
                            strMo62d4 = interfaceC2264bM7001h.mo62d();
                        }
                    } else {
                        strMo62d3 = interfaceC2264bM7001h.mo62d();
                    }
                } else {
                    strMo62d = interfaceC2264bM7001h.mo62d();
                }
            }
            if (strMo62d != null) {
                lowerCase = strMo62d.toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!AbstractC4154l.m8918a(lowerCase, "success") && lowerCase != null) {
                return new C3200r(strMo62d, strMo62d2);
            }
            if (strMo62d3 == null) {
                throw new InvalidJsonCredentialsException("missing field `AccessKeyId`", 0);
            }
            if (strMo62d4 == null) {
                throw new InvalidJsonCredentialsException("missing field `SecretAccessKey`", 0);
            }
            if (strMo62d5 == null) {
                throw new InvalidJsonCredentialsException("missing field `Token`", 0);
            }
            if (c7126cM13405c != null) {
                return new C3201s(strMo62d3, strMo62d4, strMo62d5, c7126cM13405c, strMo62d6);
            }
            throw new InvalidJsonCredentialsException("missing field `Expiration`", 0);
        } catch (DeserializationException e2) {
            throw new InvalidJsonCredentialsException("invalid JSON credentials response", e2);
        }
    }
}
