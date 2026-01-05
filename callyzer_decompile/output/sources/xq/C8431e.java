package xq;

import android.content.Context;
import android.widget.Toast;
import com.websoptimization.callyzerbiz.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import su.AbstractC6944c;
import su.C6942a;
import su.C6943b;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xq.e */
/* loaded from: classes3.dex */
public final class C8431e implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f41140a;

    /* renamed from: b */
    public final /* synthetic */ Context f41141b;

    public /* synthetic */ C8431e(Context context, int i10) {
        this.f41140a = i10;
        this.f41141b = context;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41140a) {
            case 0:
                ((Boolean) obj).booleanValue();
                Context context = this.f41141b;
                Toast.makeText(context, context.getString(R.string.add_contacts_not_more_5_warning), 0).show();
                return a0.f30746a;
            default:
                AbstractC6944c abstractC6944c = (AbstractC6944c) obj;
                boolean zM8918a = AbstractC4154l.m8918a(abstractC6944c, C6943b.f33578a);
                Context context2 = this.f41141b;
                if (zM8918a) {
                    Toast.makeText(context2, context2.getString(R.string.sync_success), 0).show();
                } else {
                    if (!(abstractC6944c instanceof C6942a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(context2, ((C6942a) abstractC6944c).f33577a, 0).show();
                }
                return a0.f30746a;
        }
    }
}
