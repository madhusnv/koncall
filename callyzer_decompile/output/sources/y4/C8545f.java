package y4;

import androidx.constraintlayout.core.parser.CLParsingException;
import c5.AbstractC0865c;
import c5.C0863a;
import c5.C0867e;
import c5.C0869g;
import c5.C0870h;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.imap.IMAPStore;
import ex.InterfaceC2139c;
import i0.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.f */
/* loaded from: classes.dex */
public final class C8545f {

    /* renamed from: a */
    public final C0869g f41503a;

    /* renamed from: b */
    public int f41504b;

    public C8545f(C0869g c0869g) {
        new ArrayList();
        this.f41503a = c0869g != null ? c0869g.clone() : new C0869g(new char[0]);
        this.f41504b = IMAPStore.RESPONSE;
    }

    /* renamed from: a */
    public final C0869g m15810a(AbstractC8549j abstractC8549j) throws CLParsingException {
        String string = abstractC8549j.mo15809a().toString();
        C0869g c0869g = this.f41503a;
        AbstractC0865c abstractC0865cM2325y = c0869g.m2325y(string);
        if ((abstractC0865cM2325y instanceof C0869g ? (C0869g) abstractC0865cM2325y : null) == null) {
            c0869g.m2315E(string, new C0869g(new char[0]));
        }
        AbstractC0865c abstractC0865cM2320s = c0869g.m2320s(string);
        if (abstractC0865cM2320s instanceof C0869g) {
            return (C0869g) abstractC0865cM2320s;
        }
        StringBuilder sbM7383p = m0.m7383p("no object found for key <", string, ">, found [");
        sbM7383p.append(abstractC0865cM2320s.m2330g());
        sbM7383p.append("] : ");
        sbM7383p.append(abstractC0865cM2320s);
        throw new CLParsingException(sbM7383p.toString(), c0869g);
    }

    /* renamed from: b */
    public final void m15811b(C8541b c8541b, InterfaceC2139c interfaceC2139c) {
        interfaceC2139c.invoke(new C8540a(c8541b.f41492b, m15810a(c8541b)));
    }

    /* renamed from: c */
    public final C8543d m15812c(float f6) {
        int i10 = this.f41504b;
        this.f41504b = i10 + 1;
        Integer numValueOf = Integer.valueOf(i10);
        C8550k c8550k = new C8550k(numValueOf);
        C0863a c0863a = new C0863a(new char[0]);
        c0863a.m2317m(C0870h.m2333m("end"));
        c0863a.m2317m(new C0867e(f6));
        C0869g c0869gM15810a = m15810a(c8550k);
        C0870h c0870h = new C0870h("vGuideline".toCharArray());
        c0870h.f5410b = 0L;
        c0870h.m2331k(9);
        c0869gM15810a.m2315E(TransferTable.COLUMN_TYPE, c0870h);
        c0869gM15810a.m2315E("percent", c0863a);
        Float.hashCode(f6);
        return new C8543d(numValueOf, 0, c8550k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8545f)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f41503a, ((C8545f) obj).f41503a);
    }

    public final int hashCode() {
        return this.f41503a.hashCode();
    }
}
