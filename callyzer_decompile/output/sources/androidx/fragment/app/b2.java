package androidx.fragment.app;

import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import ug.s2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2474a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f2475b;

    /* renamed from: c */
    public final /* synthetic */ Object f2476c;

    /* renamed from: d */
    public final /* synthetic */ Serializable f2477d;

    /* renamed from: e */
    public final /* synthetic */ Object f2478e;

    /* renamed from: f */
    public final /* synthetic */ Object f2479f;

    public /* synthetic */ b2(ug.x0 x0Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f2476c = x0Var;
        this.f2475b = i10;
        this.f2477d = exc;
        this.f2478e = bArr;
        this.f2479f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2474a;
        Object obj = this.f2479f;
        Object obj2 = this.f2478e;
        Serializable serializable = this.f2477d;
        Object obj3 = this.f2476c;
        switch (i10) {
            case 0:
                for (int i11 = 0; i11 < this.f2475b; i11++) {
                    View view = (View) ((ArrayList) obj3).get(i11);
                    String str = (String) ((ArrayList) serializable).get(i11);
                    Field field = c6.v0.f5527a;
                    c6.n0.m2461m(view, str);
                    c6.n0.m2461m((View) ((ArrayList) obj2).get(i11), (String) ((ArrayList) obj).get(i11));
                }
                break;
            default:
                ug.x0 x0Var = (ug.x0) obj3;
                ((s2) x0Var.f35920f).mo13878a(x0Var.f35918d, this.f2475b, (Exception) serializable, (byte[]) obj2, (Map) obj);
                break;
        }
    }

    public b2(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2475b = i10;
        this.f2476c = arrayList;
        this.f2477d = arrayList2;
        this.f2478e = arrayList3;
        this.f2479f = arrayList4;
    }
}
