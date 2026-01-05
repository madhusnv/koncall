package og;

import aa.C0078e;
import com.google.android.material.datepicker.C1339c;
import eb.C1992p;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class bf {
    /* renamed from: a */
    public static final long m10557a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* renamed from: b */
    public static final C1992p m10558b(C2891c c2891c) {
        C1339c c1339c = new C1339c();
        C2274l c2274l = C2274l.f10291i;
        int i10 = 1;
        int i11 = 0;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
        C2271i c2271i2 = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ExpiresIn")}), 0);
        C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("IdToken")}), 0);
        C2271i c2271i4 = new C2271i(C2274l.f10292j, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("NewDeviceMetadata")}), 0);
        C2271i c2271i5 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("RefreshToken")}), 0);
        C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("TokenType")}), 0);
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        c8849i.m16319q(c2271i3);
        c8849i.m16319q(c2271i4);
        c8849i.m16319q(c2271i5);
        c8849i.m16319q(c2271i6);
        InterfaceC2264b interfaceC2264bM7001h = c2891c.m7001h(new C2272j(c8849i));
        while (true) {
            Integer numMo71n = interfaceC2264bM7001h.mo71n();
            int i12 = c2271i.f10279b;
            if (numMo71n != null && numMo71n.intValue() == i12) {
                c1339c.f6846b = interfaceC2264bM7001h.mo62d();
            } else {
                int i13 = c2271i2.f10279b;
                if (numMo71n != null && numMo71n.intValue() == i13) {
                    c1339c.f6845a = interfaceC2264bM7001h.mo64f();
                } else {
                    int i14 = c2271i3.f10279b;
                    if (numMo71n != null && numMo71n.intValue() == i14) {
                        c1339c.f6847c = interfaceC2264bM7001h.mo62d();
                    } else {
                        int i15 = c2271i4.f10279b;
                        if (numMo71n != null && numMo71n.intValue() == i15) {
                            C0078e c0078e = new C0078e();
                            InterfaceC2265c[] interfaceC2265cArr = new InterfaceC2265c[i10];
                            interfaceC2265cArr[i11] = new C2896h("DeviceGroupKey");
                            C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(interfaceC2265cArr), i11);
                            int i16 = i11;
                            InterfaceC2265c[] interfaceC2265cArr2 = new InterfaceC2265c[i10];
                            interfaceC2265cArr2[i16] = new C2896h("DeviceKey");
                            C2271i c2271i8 = new C2271i(c2274l, AbstractC6662l.m12710M(interfaceC2265cArr2), i16);
                            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(p020v.a1.m14343w(c2271i7, c2271i8), c2891c);
                            while (true) {
                                Integer numMo71n2 = interfaceC2264bM11231b.mo71n();
                                int i17 = c2271i7.f10279b;
                                if (numMo71n2 == null || numMo71n2.intValue() != i17) {
                                    int i18 = c2271i8.f10279b;
                                    if (numMo71n2 == null || numMo71n2.intValue() != i18) {
                                        if (numMo71n2 == null) {
                                            break;
                                        }
                                        interfaceC2264bM11231b.mo63e();
                                    } else {
                                        c0078e.f292b = interfaceC2264bM11231b.mo62d();
                                    }
                                } else {
                                    c0078e.f291a = interfaceC2264bM11231b.mo62d();
                                }
                            }
                            c1339c.f6848d = new eb.m2(c0078e);
                        } else {
                            int i19 = c2271i5.f10279b;
                            if (numMo71n != null && numMo71n.intValue() == i19) {
                                c1339c.f6849e = interfaceC2264bM7001h.mo62d();
                            } else {
                                int i20 = c2271i6.f10279b;
                                if (numMo71n != null && numMo71n.intValue() == i20) {
                                    c1339c.f6850f = interfaceC2264bM7001h.mo62d();
                                } else {
                                    if (numMo71n == null) {
                                        return new C1992p(c1339c);
                                    }
                                    interfaceC2264bM7001h.mo63e();
                                }
                            }
                        }
                        i10 = 1;
                        i11 = 0;
                    }
                }
            }
        }
    }
}
