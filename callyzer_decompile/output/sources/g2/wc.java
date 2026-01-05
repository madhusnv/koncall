package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4155m;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class wc extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f13177a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f13178b;

    /* renamed from: c */
    public final /* synthetic */ t3.w0 f13179c;

    /* renamed from: d */
    public final /* synthetic */ long f13180d;

    /* renamed from: e */
    public final /* synthetic */ float f13181e;

    /* renamed from: f */
    public final /* synthetic */ float f13182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(t3.w0 w0Var, ArrayList arrayList, t3.w0 w0Var2, long j6, float f6, float f10) {
        super(1);
        this.f13177a = w0Var;
        this.f13178b = arrayList;
        this.f13179c = w0Var2;
        this.f13180d = j6;
        this.f13181e = f6;
        this.f13182f = f10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long j6;
        t3.v0 v0Var = (t3.v0) obj;
        int i10 = 0;
        t3.w0 w0Var = this.f13177a;
        if (w0Var != null) {
            v0Var.m13324d(w0Var, 0, 0, DefinitionKt.NO_Float_VALUE);
        }
        ArrayList arrayList = this.f13178b;
        int size = arrayList.size();
        while (true) {
            j6 = this.f13180d;
            if (i10 >= size) {
                break;
            }
            t3.w0 w0Var2 = (t3.w0) arrayList.get(i10);
            int iM12918i = (C6745a.m12918i(j6) / 2) - (w0Var2.f34030a / 2);
            int iM12917h = (C6745a.m12917h(j6) / 2) - (w0Var2.f34031b / 2);
            double d2 = this.f13181e;
            double d10 = (this.f13182f * i10) - 1.5707963267948966d;
            v0Var.m13324d(w0Var2, AbstractC2747a.m6746j((Math.cos(d10) * d2) + iM12918i), AbstractC2747a.m6746j((Math.sin(d10) * d2) + iM12917h), DefinitionKt.NO_Float_VALUE);
            i10++;
            arrayList = arrayList;
        }
        t3.w0 w0Var3 = this.f13179c;
        if (w0Var3 != null) {
            v0Var.m13324d(w0Var3, (C6745a.m12920k(j6) - w0Var3.f34030a) / 2, (C6745a.m12919j(j6) - w0Var3.f34031b) / 2, DefinitionKt.NO_Float_VALUE);
        }
        return qw.a0.f30746a;
    }
}
