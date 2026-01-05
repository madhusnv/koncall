package zp;

import com.websoptimization.callyzerbiz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5412n;
import om.C5413o;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import yv.AbstractC8788c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.h */
/* loaded from: classes3.dex */
public final class C9008h {

    /* renamed from: a */
    public final C5413o f43395a;

    /* renamed from: b */
    public final int f43396b;

    /* renamed from: c */
    public final String f43397c;

    /* renamed from: d */
    public final String f43398d;

    /* renamed from: e */
    public final String f43399e;

    /* renamed from: f */
    public final int f43400f;

    /* renamed from: g */
    public final String f43401g;

    /* renamed from: h */
    public final ArrayList f43402h;

    public C9008h(C5413o dataModel) {
        int i10;
        AbstractC4154l.m8923f(dataModel, "dataModel");
        String str = dataModel.f27180b;
        int i11 = dataModel.f27181c;
        this.f43395a = dataModel;
        int i12 = AbstractC8788c.f42452a[dataModel.f27182d.ordinal()];
        if (i12 == 1) {
            i10 = R.drawable.ic_incoming_call;
        } else if (i12 == 2) {
            i10 = R.drawable.ic_outgoing_call;
        } else if (i12 == 3) {
            i10 = R.drawable.ic_missed_call;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.drawable.ic_rejected_call;
        }
        this.f43396b = i10;
        this.f43397c = dataModel.f27179a;
        this.f43398d = AbstractC5601a.m11232c(i11, "+", str);
        this.f43399e = str;
        this.f43400f = i11;
        this.f43401g = str;
        ArrayList arrayList = new ArrayList();
        List list = dataModel.f27183e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9007g((C5412n) it.next()));
            }
        }
        this.f43402h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9008h) && AbstractC4154l.m8918a(this.f43395a, ((C9008h) obj).f43395a);
    }

    public final int hashCode() {
        return this.f43395a.hashCode();
    }

    public final String toString() {
        return "NeverAttendNotPickupCallsUiModel(dataModel=" + this.f43395a + ")";
    }
}
