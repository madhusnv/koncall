package rf;

import bl.C0689a;
import c9.C0910e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import og.dd;
import qf.InterfaceC6211j;
import sf.AbstractC6840z;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.l */
/* loaded from: classes.dex */
public final class C6507l {

    /* renamed from: a */
    public final /* synthetic */ int f31242a = 0;

    /* renamed from: b */
    public final /* synthetic */ dd f31243b;

    /* renamed from: c */
    public final /* synthetic */ Object f31244c;

    public C6507l(C0910e c0910e, BasePendingResult basePendingResult) {
        this.f31244c = c0910e;
        this.f31243b = basePendingResult;
    }

    /* renamed from: a */
    public final void m12524a(Status status) {
        InterfaceC6211j interfaceC6211j;
        switch (this.f31242a) {
            case 0:
                ((Map) ((C0910e) this.f31244c).f5579b).remove((BasePendingResult) this.f31243b);
                return;
            default:
                if (!status.m3092b()) {
                    ((C8650g) this.f31244c).m15968a(AbstractC6840z.m13041l(status));
                    return;
                }
                dd ddVar = this.f31243b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                BasePendingResult basePendingResult = (BasePendingResult) ddVar;
                AbstractC6840z.m13038i("Result has already been consumed.", !basePendingResult.f6019h);
                try {
                    if (!basePendingResult.f6014c.await(0L, timeUnit)) {
                        basePendingResult.m3095c(Status.f6005h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.m3095c(Status.f6003f);
                }
                AbstractC6840z.m13038i("Result is not ready.", basePendingResult.m3096d());
                synchronized (basePendingResult.f6013b) {
                    AbstractC6840z.m13038i("Result has already been consumed.", !basePendingResult.f6019h);
                    AbstractC6840z.m13038i("Result is not ready.", basePendingResult.m3096d());
                    interfaceC6211j = basePendingResult.f6017f;
                    basePendingResult.f6017f = null;
                    basePendingResult.f6019h = true;
                }
                if (basePendingResult.f6016e.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                AbstractC6840z.m13036g(interfaceC6211j);
                ((C8650g) this.f31244c).m15969b(null);
                return;
        }
    }

    public C6507l(dd ddVar, C8650g c8650g, C0689a c0689a) {
        this.f31243b = ddVar;
        this.f31244c = c8650g;
    }
}
