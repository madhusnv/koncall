package w3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import ao.C0381t;
import ay.C0496f;
import be.C0649d;
import com.google.android.gms.internal.measurement.c4;
import com.websoptimization.callyzerbiz.R;
import f9.C2222e;
import java.util.LinkedHashMap;
import k2.AbstractC3969r;
import of.C5359n;
import pg.o6;
import pg.o7;
import pg.x5;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vx.C7806h;
import wx.InterfaceC8209j;
import yx.AbstractC8819m;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d3 {

    /* renamed from: a */
    public static final LinkedHashMap f37772a = new LinkedHashMap();

    /* renamed from: a */
    public static final wx.k1 m14902a(Context context) {
        wx.k1 k1Var;
        LinkedHashMap linkedHashMap = f37772a;
        synchronized (linkedHashMap) {
            try {
                Object w0Var = linkedHashMap.get(context);
                if (w0Var == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C7806h c7806hM11805a = o6.m11805a(-1, null, null, 6);
                    C2222e c2222e = new C2222e(new C0649d(contentResolver, uriFor, new c4(c7806hM11805a, o7.m11807b(Looper.getMainLooper())), c7806hM11805a, context, null));
                    tx.u1 u1VarM13481d = tx.c0.m13481d();
                    C0496f c0496f = tx.m0.f34659a;
                    C8810d c8810d = new C8810d(x5.m11928d(u1VarM13481d, AbstractC8819m.f42514a));
                    wx.j1 j1Var = new wx.j1();
                    Float fValueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    C5359n c5359nM15380k = wx.c1.m15380k(c2222e, 1);
                    wx.m1 m1VarM15372c = wx.c1.m15372c(fValueOf);
                    tx.c0.m13501x(c8810d, (InterfaceC7564h) c5359nM15380k.f26306d, j1Var.equals(wx.f1.f39222a) ? tx.b0.DEFAULT : tx.b0.UNDISPATCHED, new C0381t(j1Var, (InterfaceC8209j) c5359nM15380k.f26304b, m1VarM15372c, fValueOf, (InterfaceC7559c) null));
                    w0Var = new wx.w0(m1VarM15372c);
                    linkedHashMap.put(context, w0Var);
                }
                k1Var = (wx.k1) w0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k1Var;
    }

    /* renamed from: b */
    public static final AbstractC3969r m14903b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC3969r) {
            return (AbstractC3969r) tag;
        }
        return null;
    }
}
