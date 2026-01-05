package p001o;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public class oqe implements ci3 {

    /* renamed from: o.oqe$b */
    public static class C15872b {

        /* renamed from: a */
        public static final oqe f38731a = new oqe();
    }

    public oqe() {
    }

    public static ci3 getInstance() {
        return C15872b.f38731a;
    }

    @Override // p001o.ci3
    /* renamed from: a */
    public boolean mo21295a(Context context, Map map) {
        if (!qqe.m45769a(context, map)) {
            return false;
        }
        ckh.m21348a(context, pae.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }
}
