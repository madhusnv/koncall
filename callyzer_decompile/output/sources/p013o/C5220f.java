package p013o;

import android.content.Context;
import android.view.View;
import com.websoptimization.callyzerbiz.R;
import k4.C4001v;
import p012n.AbstractC4931k;
import p012n.C4933m;
import p012n.MenuC4929i;
import p012n.SubMenuC4939s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.f */
/* loaded from: classes.dex */
public final class C5220f extends C4933m {

    /* renamed from: l */
    public final /* synthetic */ int f25478l = 1;

    /* renamed from: m */
    public final /* synthetic */ C5223i f25479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5220f(C5223i c5223i, Context context, MenuC4929i menuC4929i, View view) {
        super(context, menuC4929i, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f25479m = c5223i;
        this.f24588f = 8388613;
        C4001v c4001v = c5223i.f25535y;
        this.f24590h = c4001v;
        AbstractC4931k abstractC4931k = this.f24591i;
        if (abstractC4931k != null) {
            abstractC4931k.mo9840j(c4001v);
        }
    }

    @Override // p012n.C4933m
    /* renamed from: c */
    public final void mo9882c() {
        switch (this.f25478l) {
            case 0:
                C5223i c5223i = this.f25479m;
                c5223i.f25532v = null;
                c5223i.getClass();
                super.mo9882c();
                break;
            default:
                C5223i c5223i2 = this.f25479m;
                MenuC4929i menuC4929i = c5223i2.f25516c;
                if (menuC4929i != null) {
                    menuC4929i.m9854c(true);
                }
                c5223i2.f25531t = null;
                super.mo9882c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5220f(C5223i c5223i, Context context, SubMenuC4939s subMenuC4939s, View view) {
        super(context, subMenuC4939s, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f25479m = c5223i;
        if ((subMenuC4939s.f24614w.f24578x & 32) != 32) {
            View view2 = c5223i.f25521h;
            this.f24587e = view2 == null ? c5223i.f25520g : view2;
        }
        C4001v c4001v = c5223i.f25535y;
        this.f24590h = c4001v;
        AbstractC4931k abstractC4931k = this.f24591i;
        if (abstractC4931k != null) {
            abstractC4931k.mo9840j(c4001v);
        }
    }
}
