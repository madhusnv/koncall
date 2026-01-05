package p020v;

import android.text.TextUtils;
import c0.k1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import mf.C4719b;
import og.y0;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7604n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36632a;

    /* renamed from: b */
    public final /* synthetic */ C7612v f36633b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f36634c;

    public /* synthetic */ RunnableC7604n(C7612v c7612v, ArrayList arrayList, int i10) {
        this.f36632a = i10;
        this.f36633b = c7612v;
        this.f36634c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7439j c7439j;
        switch (this.f36632a) {
            case 0:
                C7612v c7612v = this.f36633b;
                ArrayList arrayList = this.f36634c;
                C7599i c7599i = c7612v.f36726h;
                try {
                    c7612v.m14445J(arrayList);
                    return;
                } finally {
                    c7599i.m14394i();
                }
            default:
                C7612v c7612v2 = this.f36633b;
                ArrayList arrayList2 = this.f36634c;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                boolean z6 = false;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    C7592b c7592b = (C7592b) obj;
                    if (c7612v2.f36719a.m5871g(c7592b.f36475a)) {
                        c7612v2.f36719a.f10051a.remove(c7592b.f36475a);
                        arrayList3.add(c7592b.f36475a);
                        if (c7592b.f36476b == k1.class) {
                            z6 = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                c7612v2.m14455w("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
                if (z6) {
                    c7612v2.f36726h.f36576h.getClass();
                }
                c7612v2.m14451s();
                if (c7612v2.f36719a.m5870f().isEmpty()) {
                    C7599i c7599i2 = c7612v2.f36726h;
                    C4719b c4719b = c7599i2.f36581m;
                    boolean z10 = c4719b.f23612a;
                    c4719b.f23612a = false;
                    c7599i2.m14397n(false);
                } else {
                    c7612v2.m14450O();
                    c7612v2.m14449N();
                }
                if (!c7612v2.f36719a.m5869e().isEmpty()) {
                    c7612v2.m14448M();
                    c7612v2.m14441F();
                    if (c7612v2.f36723e == EnumC7610t.OPENED) {
                        c7612v2.m14440E();
                        return;
                    }
                    return;
                }
                c7612v2.f36726h.m14394i();
                c7612v2.m14441F();
                c7612v2.f36726h.m14396m(false);
                c7612v2.f36731n = c7612v2.m14438C();
                c7612v2.m14455w("Closing camera.");
                switch (c7612v2.f36723e.ordinal()) {
                    case 3:
                    case 4:
                        y0.m11056f(null, c7612v2.f36729l == null);
                        c7612v2.m14442G(EnumC7610t.INITIALIZED);
                        return;
                    case 5:
                    default:
                        c7612v2.m14455w("close() ignored due to being in state: " + c7612v2.f36723e);
                        return;
                    case 6:
                    case 7:
                    case 8:
                        if (c7612v2.f36727j.m14430a() || ((c7439j = (C7439j) c7612v2.f36718V.f5594b) != null && !((AtomicBoolean) c7439j.f35538c).get())) {
                            z = true;
                        }
                        c7612v2.f36718V.m2640d();
                        c7612v2.m14442G(EnumC7610t.CLOSING);
                        if (z) {
                            y0.m11056f(null, c7612v2.f36735s.isEmpty());
                            c7612v2.m14453u();
                            return;
                        }
                        return;
                    case 9:
                    case 10:
                        c7612v2.m14442G(EnumC7610t.CLOSING);
                        c7612v2.m14452t();
                        return;
                }
        }
    }
}
