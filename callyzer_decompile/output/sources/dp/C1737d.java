package dp;

import ds.AbstractC1791o;
import ex.InterfaceC2139c;
import iq.EnumC3343a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rv.s0;
import ur.j0;
import uw.InterfaceC7559c;
import vr.AbstractC7739g;
import vr.AbstractC7755w;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dp.d */
/* loaded from: classes3.dex */
public final class C1737d implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f8407a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f8408b;

    public /* synthetic */ C1737d(int i10, InterfaceC2139c interfaceC2139c) {
        this.f8407a = i10;
        this.f8408b = interfaceC2139c;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8407a) {
            case 0:
                if (!AbstractC4154l.m8918a((j0) obj, j0.f36232a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f8408b.invoke("exclude_number");
                return a0.f30746a;
            case 1:
                int i10 = AbstractC1791o.f8689a[((EnumC3343a) obj).ordinal()];
                if (i10 == 1) {
                    this.f8408b.invoke("message_templates");
                } else if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return a0.f30746a;
            case 2:
                if (!AbstractC4154l.m8918a((j0) obj, j0.f36232a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f8408b.invoke("exclude_number");
                return a0.f30746a;
            case 3:
                this.f8408b.invoke("note/" + ((Number) obj).intValue() + "/null/null/false");
                return a0.f30746a;
            case 4:
                s0 s0Var = (s0) obj;
                if (s0Var instanceof s0) {
                    this.f8408b.invoke(s0Var.f31902a);
                }
                return a0.f30746a;
            case 5:
                if (!AbstractC4154l.m8918a((j0) obj, j0.f36232a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f8408b.invoke("exclude_number");
                return a0.f30746a;
            case 6:
                int i11 = AbstractC7739g.f37307a[((EnumC3343a) obj).ordinal()];
                if (i11 == 1) {
                    this.f8408b.invoke("message_templates");
                } else if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return a0.f30746a;
            case 7:
                int i12 = AbstractC7755w.f37386a[((EnumC3343a) obj).ordinal()];
                if (i12 == 1) {
                    this.f8408b.invoke("message_templates");
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return a0.f30746a;
            case 8:
                int i13 = vr.a0.f37295a[((EnumC3343a) obj).ordinal()];
                if (i13 == 1) {
                    this.f8408b.invoke("message_templates");
                } else if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return a0.f30746a;
            default:
                this.f8408b.invoke((String) obj);
                return a0.f30746a;
        }
    }
}
