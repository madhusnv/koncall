package c00;

import b00.d0;
import ex.InterfaceC2141e;
import java.io.IOException;
import kotlin.jvm.internal.C4168z;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0842i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f5331a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4168z f5332b;

    /* renamed from: c */
    public final /* synthetic */ d0 f5333c;

    /* renamed from: d */
    public final /* synthetic */ C4168z f5334d;

    /* renamed from: e */
    public final /* synthetic */ C4168z f5335e;

    public /* synthetic */ C0842i(d0 d0Var, C4168z c4168z, C4168z c4168z2, C4168z c4168z3) {
        this.f5333c = d0Var;
        this.f5332b = c4168z;
        this.f5334d = c4168z2;
        this.f5335e = c4168z3;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i10 = this.f5331a;
        int iIntValue = ((Integer) obj).intValue();
        Long l9 = (Long) obj2;
        switch (i10) {
            case 0:
                long jLongValue = l9.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    d0 d0Var = this.f5333c;
                    byte b10 = d0Var.readByte();
                    boolean z6 = (b10 & 1) == 1;
                    boolean z10 = (b10 & 2) == 2;
                    boolean z11 = (b10 & 4) == 4;
                    long j6 = z6 ? 5L : 1L;
                    if (z10) {
                        j6 += 4;
                    }
                    if (z11) {
                        j6 += 4;
                    }
                    if (jLongValue < j6) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z6) {
                        this.f5332b.f21164a = Integer.valueOf(d0Var.m1547j());
                    }
                    if (z10) {
                        this.f5334d.f21164a = Integer.valueOf(d0Var.m1547j());
                    }
                    if (z11) {
                        this.f5335e.f21164a = Integer.valueOf(d0Var.m1547j());
                    }
                }
                return a0.f30746a;
            default:
                long jLongValue2 = l9.longValue();
                if (iIntValue == 1) {
                    C4168z c4168z = this.f5332b;
                    if (c4168z.f21164a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    d0 d0Var2 = this.f5333c;
                    c4168z.f21164a = Long.valueOf(d0Var2.m1548n());
                    this.f5334d.f21164a = Long.valueOf(d0Var2.m1548n());
                    this.f5335e.f21164a = Long.valueOf(d0Var2.m1548n());
                }
                return a0.f30746a;
        }
    }

    public /* synthetic */ C0842i(C4168z c4168z, d0 d0Var, C4168z c4168z2, C4168z c4168z3) {
        this.f5332b = c4168z;
        this.f5333c = d0Var;
        this.f5334d = c4168z2;
        this.f5335e = c4168z3;
    }
}
