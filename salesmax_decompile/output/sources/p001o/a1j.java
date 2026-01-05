package p001o;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class a1j extends pvh {

    /* renamed from: a */
    public static final String[] f14043a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    public static int m16334d(svh svhVar, int i) {
        int[] iArr;
        if (svhVar == null || (iArr = (int[]) svhVar.f46008a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // p001o.pvh
    /* renamed from: a */
    public void mo16335a(svh svhVar) {
        View view = svhVar.f46009b;
        Integer numValueOf = (Integer) svhVar.f46008a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        svhVar.f46008a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        svhVar.f46008a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // p001o.pvh
    /* renamed from: b */
    public String[] mo16336b() {
        return f14043a;
    }

    /* renamed from: e */
    public int m16337e(svh svhVar) {
        Integer num;
        if (svhVar == null || (num = (Integer) svhVar.f46008a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int m16338f(svh svhVar) {
        return m16334d(svhVar, 0);
    }

    /* renamed from: g */
    public int m16339g(svh svhVar) {
        return m16334d(svhVar, 1);
    }
}
