package pb;

import ex.InterfaceC2141e;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import id.C3235e;
import id.C3236f;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import mb.C4709y;
import qw.a0;
import rw.AbstractC6662l;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pb.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C5869a extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public static final C5869a f28647a = new C5869a(2, AbstractC5870b.class, "serializeCompletedPartDocument", "serializeCompletedPartDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/s3/model/CompletedPart;)V", 1);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2275m p02 = (InterfaceC2275m) obj;
        C4709y p12 = (C4709y) obj2;
        AbstractC4154l.m8923f(p02, "p0");
        AbstractC4154l.m8923f(p12, "p1");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ChecksumCRC32")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ChecksumCRC32C")}), 0);
        C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ChecksumCRC64NVME")}), 0);
        C2271i c2271i4 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ChecksumSHA1")}), 0);
        C2271i c2271i5 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ChecksumSHA256")}), 0);
        C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("ETag")}), 0);
        C2271i c2271i7 = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C3236f("PartNumber")}), 0);
        C8849i c8849i = new C8849i(4);
        C3236f c3236f = new C3236f("CompletedPart");
        LinkedHashSet linkedHashSet = (LinkedHashSet) c8849i.f42584c;
        linkedHashSet.add(c3236f);
        linkedHashSet.add(new C3235e());
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        c8849i.m16319q(c2271i3);
        c8849i.m16319q(c2271i4);
        c8849i.m16319q(c2271i5);
        c8849i.m16319q(c2271i6);
        c8849i.m16319q(c2271i7);
        InterfaceC2276n interfaceC2276nMo5962b = p02.mo5962b(new C2272j(c8849i));
        String str = p12.f23541a;
        if (str != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i6, str);
        }
        Integer num = p12.f23542b;
        if (num != null) {
            interfaceC2276nMo5962b.mo2595c(c2271i7, num.intValue());
        }
        interfaceC2276nMo5962b.mo2598f();
        return a0.f30746a;
    }
}
