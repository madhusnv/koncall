package p001o;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.os;

/* loaded from: classes2.dex */
public final class ss extends os {

    /* renamed from: a */
    public static final C16907a f45852a = new C16907a(null);

    /* renamed from: o.ss$a */
    public static final class C16907a {
        public C16907a() {
        }

        public /* synthetic */ C16907a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Intent m48833a(String[] strArr) {
            sq8.m48649h(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            sq8.m48648g(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // p001o.os
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo6230a(Context context, String[] strArr) {
        sq8.m48649h(context, "context");
        sq8.m48649h(strArr, "input");
        return f45852a.m48833a(strArr);
    }

    @Override // p001o.os
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public os.C15882a mo42610b(Context context, String[] strArr) {
        sq8.m48649h(context, "context");
        sq8.m48649h(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new os.C15882a(isa.m32681h());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(c64.checkSelfPermission(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(strArr.length), 16));
        for (String str : strArr) {
            hwc hwcVarM53620a = vyh.m53620a(str, Boolean.TRUE);
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        return new os.C15882a(linkedHashMap);
    }

    @Override // p001o.os
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map mo6231c(int i, Intent intent) {
        if (i != -1) {
            return isa.m32681h();
        }
        if (intent == null) {
            return isa.m32681h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return isa.m32681h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return isa.m32691r(kh3.Y0(gp0.m29255V(stringArrayExtra), arrayList));
    }
}
