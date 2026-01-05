package fy;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import ex.InterfaceC2139c;
import hy.C3050a;
import hy.C3058i;
import hy.InterfaceC3055f;
import java.util.List;
import java.util.Map;
import jy.a1;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fy.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2402b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f10880a;

    /* renamed from: b */
    public final /* synthetic */ C2403c f10881b;

    public /* synthetic */ C2402b(C2403c c2403c, int i10) {
        this.f10880a = i10;
        this.f10881b = c2403c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C3050a buildSerialDescriptor = (C3050a) obj;
        switch (this.f10880a) {
            case 0:
                AbstractC4154l.m8923f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C3050a.m7276a(buildSerialDescriptor, TransferTable.COLUMN_TYPE, a1.f19870b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                C2403c c2403c = this.f10881b;
                sb2.append(c2403c.f10882a.m8914c());
                sb2.append('>');
                C2402b c2402b = new C2402b(c2403c, 1);
                C3050a.m7276a(buildSerialDescriptor, "value", AbstractC5941v.m11888b(sb2.toString(), C3058i.f16411b, new InterfaceC3055f[0], c2402b));
                List list = c2403c.f10883b;
                AbstractC4154l.m8923f(list, "<set-?>");
                buildSerialDescriptor.f16381b = list;
                break;
            default:
                AbstractC4154l.m8923f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f10881b.f10886e.entrySet()) {
                    C3050a.m7276a(buildSerialDescriptor, (String) entry.getKey(), ((InterfaceC2401a) entry.getValue()).getDescriptor());
                }
                break;
        }
        return a0.f30746a;
    }
}
