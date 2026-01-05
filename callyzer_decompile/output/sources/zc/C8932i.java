package zc;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import og.d2;
import org.bouncycastle.crypto.hpke.HPKE;
import qw.C6376z;
import qw.a0;
import zd.C8940d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C8932i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f42897a;

    /* renamed from: b */
    public final /* synthetic */ Object f42898b;

    public /* synthetic */ C8932i(int i10, Object obj) {
        this.f42897a = i10;
        this.f42898b = obj;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f42897a) {
            case 0:
                C8934k c8934k = (C8934k) this.f42898b;
                int i10 = ((C6376z) c8934k.f42906c.getValue()).f30776a[((Integer) obj).intValue()] & HPKE.aead_EXPORT_ONLY;
                d2.m10599b(16);
                String string = Integer.toString(i10, 16);
                AbstractC4154l.m8922e(string, "toString(...)");
                return string;
            default:
                ((C8940d) this.f42898b).f42937l = true;
                return a0.f30746a;
        }
    }
}
