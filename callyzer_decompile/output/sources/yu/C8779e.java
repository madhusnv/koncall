package yu;

import bv.C0790h;
import ex.InterfaceC2139c;
import java.util.Calendar;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import qw.a0;
import yv.C8800o;
import zu.C9071a;
import zu.C9078h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yu.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8779e implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f42428a = 1;

    /* renamed from: b */
    public final /* synthetic */ C0790h f42429b;

    /* renamed from: c */
    public final /* synthetic */ w0 f42430c;

    public /* synthetic */ C8779e(C0790h c0790h, w0 w0Var) {
        this.f42429b = c0790h;
        this.f42430c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f42428a;
        a0 a0Var = a0.f30746a;
        w0 w0Var = this.f42430c;
        C0790h c0790h = this.f42429b;
        switch (i10) {
            case 0:
                String text = (String) obj;
                AbstractC4154l.m8923f(text, "text");
                w0Var.setValue(AbstractC5178p.h0(text).toString());
                c0790h.m2119j(new C9078h(text));
                break;
            default:
                Calendar selectedDateTime = (Calendar) obj;
                AbstractC4154l.m8923f(selectedDateTime, "selectedDateTime");
                w0Var.setValue(Boolean.FALSE);
                C8800o c8800o = C8800o.f42459a;
                c0790h.m2119j(new C9071a(C8800o.m16182F(selectedDateTime.getTimeInMillis())));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ C8779e(w0 w0Var, C0790h c0790h) {
        this.f42430c = w0Var;
        this.f42429b = c0790h;
    }
}
